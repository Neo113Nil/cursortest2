package com.socure.docv.capturesdk.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.exifinterface.media.ExifInterface;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.api.DocumentType;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.common.analytics.model.Blur;
import com.socure.docv.capturesdk.common.analytics.model.CameraDevice;
import com.socure.docv.capturesdk.common.analytics.model.Capabilities;
import com.socure.docv.capturesdk.common.analytics.model.Edge;
import com.socure.docv.capturesdk.common.analytics.model.EventData;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.analytics.model.Glare;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.common.analytics.model.RegionWiseLines;
import com.socure.docv.capturesdk.common.analytics.model.SubRegionInfo;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.Accessibility;
import com.socure.docv.capturesdk.common.network.model.stepup.Errors;
import com.socure.docv.capturesdk.common.network.model.stepup.ExtractedStepUpData;
import com.socure.docv.capturesdk.common.network.model.stepup.MinMax;
import com.socure.docv.capturesdk.common.network.model.stepup.NewLabels;
import com.socure.docv.capturesdk.common.network.model.stepup.Screens;
import com.socure.docv.capturesdk.common.network.model.stepup.SelfieMetrics;
import com.socure.docv.capturesdk.common.network.model.stepup.TrackingProperty;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.network.model.stepup.Websdk;
import com.socure.docv.capturesdk.common.view.model.CurrentScreen;
import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedFace;
import com.socure.docv.capturesdk.core.parser.MrzParserKt;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.pipeline.model.SelfieRange;
import com.socure.docv.capturesdk.core.pipeline.model.SelfieRangeType;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.FinalOutputProcessData;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.feature.orchestrator.data.Config;
import com.socure.docv.capturesdk.feature.orchestrator.data.ConfigRequest;
import com.socure.docv.capturesdk.feature.orchestrator.data.Flow;
import com.socure.docv.capturesdk.feature.orchestrator.data.FlowRequest;
import com.socure.docv.capturesdk.feature.scanner.data.CardGuide;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBoxConstraintData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import io.sentry.Session;
import io.sentry.protocol.App;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.RequestBody;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000¾\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a_\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u0007\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\u0000¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u0015H\u0000\u001a2\u0010\u0016\u001a\u00020\n2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000eH\u0000\u001a*\u0010\u0019\u001a\u00020\n2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0000\u001a(\u0010\u001e\u001a\u00020\u001f2\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0003H\u0000\u001a\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0000\u001a\u0090\u0001\u0010$\u001a\u00020\u000e2B\u0010%\u001a>\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0003\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u00030\u00032B\u0010&\u001a>\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0003\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u00030\u0003H\u0000\u001a$\u0010'\u001a\u00020\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015H\u0000\u001a.\u0010*\u001a\u0004\u0018\u00010\u00012\"\u0010+\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0013`.H\u0000\u001aT\u0010/\u001a@\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0003\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0003\u0018\u00010\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004H\u0000\u001a\u0010\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0001H\u0000\u001a\u0010\u00104\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0001H\u0000\u001a&\u00105\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u000eH\u0000\u001a\"\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000209H\u0000\u001a\u0014\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0000\u001aH\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010Dj\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`E2\"\u0010F\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0013`.H\u0000\u001a\u0018\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0000\u001aH\u0010K\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020L0Dj\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020L`E2\"\u0010F\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0013`.H\u0000\u001a \u0010M\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0000\u001a\u0018\u0010S\u001a\u00020T2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0000\u001a\u0010\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0014\u0010X\u001a\u0004\u0018\u00010;2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010Z\u001a\u00020[2\b\u0010:\u001a\u0004\u0018\u00010;H\u0000\u001a\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00042\u0006\u0010<\u001a\u00020=H\u0000\u001a\u0018\u0010^\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0000\u001a\u0014\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010BH\u0000\u001a\u0018\u0010d\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0000\u001a\u0010\u0010e\u001a\u00020f2\u0006\u0010H\u001a\u00020-H\u0000\u001a\u0010\u0010g\u001a\u00020f2\u0006\u0010H\u001a\u00020-H\u0000\u001a\b\u0010h\u001a\u00020iH\u0000\u001a\u000e\u0010j\u001a\b\u0012\u0004\u0012\u00020]0\u0004H\u0000\u001a\u0018\u0010k\u001a\u00020\u00012\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0000\u001a\u0010\u0010p\u001a\u00020\u00012\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0010\u0010q\u001a\u00020\u00012\u0006\u0010n\u001a\u00020oH\u0000\u001a\u0014\u0010r\u001a\u0004\u0018\u00010s2\b\u0010t\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0018\u0010u\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0000\u001a\u0010\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020yH\u0000\u001a8\u0010z\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u0004\u0018\u00010\u00032\u0006\u0010H\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u001c\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010|\u001a\u00020\u001bH\u0000\u001a6\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u0002092\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0081\u0001\u001a\u0002092\u0007\u0010\u0082\u0001\u001a\u00020\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0001H\u0000\u001a)\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0085\u00012\u0006\u0010<\u001a\u00020=2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010;H\u0000\u001a\u0011\u0010\u0087\u0001\u001a\u0002012\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0017\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010BH\u0000\u001a\u0012\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0006\u0010H\u001a\u00020-H\u0000\u001a\u0019\u0010\u008d\u0001\u001a\u00020\u00012\u0006\u0010n\u001a\u00020o2\u0006\u0010_\u001a\u00020`H\u0000\u001a\u0019\u0010\u008e\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0000\u001a$\u0010\u008f\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u000eH\u0000\u001a\u0019\u0010\u0093\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0000\u001a\u0011\u0010\u0094\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-H\u0000\u001a\u0013\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010n\u001a\u00020oH\u0000\u001a\u001e\u0010\u0096\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0085\u00012\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0019\u0010\u0097\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0000\u001a\u0019\u0010\u0098\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0000\u001a'\u0010\u0099\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0000\u001a\u0011\u0010\u009a\u0001\u001a\u00020\u00012\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0011\u0010\u009b\u0001\u001a\u00020\u00012\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0011\u0010\u009c\u0001\u001a\u00020\u00012\u0006\u0010I\u001a\u00020JH\u0000\u001a$\u0010\u009d\u0001\u001a\u00020\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\t\u0010 \u0001\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0003\u0010¡\u0001\u001a\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\r\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0004H\u0000\u001aK\u0010¥\u0001\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u00040\u00032\u0006\u0010H\u001a\u00020-2\b\u0010x\u001a\u0004\u0018\u00010y2\u0007\u0010¦\u0001\u001a\u00020\u00012\u0007\u0010§\u0001\u001a\u00020\u001bH\u0000\u001a\u001d\u0010¨\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030©\u00012\u0007\u0010«\u0001\u001a\u000201H\u0000\u001a<\u0010¬\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00030\u00072\u0006\u0010H\u001a\u00020-2\u0007\u0010\u00ad\u0001\u001a\u00020\u001b2\b\u0010®\u0001\u001a\u00030¯\u0001H\u0000¢\u0006\u0003\u0010°\u0001\u001a\u001b\u0010±\u0001\u001a\u00020\u00012\u0006\u0010n\u001a\u00020o2\b\u0010²\u0001\u001a\u00030³\u0001H\u0000\u001a\u0016\u0010´\u0001\u001a\u0005\u0018\u00010µ\u00012\b\u0010®\u0001\u001a\u00030¯\u0001H\u0000\u001a\u0015\u0010¶\u0001\u001a\u00030·\u00012\t\u0010¸\u0001\u001a\u0004\u0018\u00010]H\u0000\u001a(\u0010¹\u0001\u001a\u0005\u0018\u00010º\u00012\b\u0010»\u0001\u001a\u00030¼\u00012\u0007\u0010½\u0001\u001a\u0002092\u0007\u0010¾\u0001\u001a\u000209H\u0000\u001a\u0011\u0010¿\u0001\u001a\u00020\u00012\u0006\u0010V\u001a\u00020WH\u0000\u001a&\u0010À\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0085\u00012\u000e\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030Â\u00010\u0004H\u0000\u001a\u0019\u0010Ã\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0000\u001a\u0019\u0010Ä\u0001\u001a\u00020\u00012\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0000\u001a\u0018\u0010Å\u0001\u001a\u00020\u000e2\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020B0\u0004H\u0000\u001a\u0011\u0010Ç\u0001\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020WH\u0000\u001a\t\u0010È\u0001\u001a\u00020\u000eH\u0000\u001a\u0011\u0010É\u0001\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020WH\u0000\u001a\u001e\u0010Ê\u0001\u001a\u00020\u000e2\b\u0010Ë\u0001\u001a\u00030Ì\u00012\t\u0010Í\u0001\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\t\u0010Î\u0001\u001a\u00020\u000eH\u0000\u001a\u0012\u0010Ï\u0001\u001a\u00020\u001f2\u0007\u0010Ð\u0001\u001a\u00020\u001fH\u0000\u001aJ\u0010Ñ\u0001\u001a\u00020\u001f2\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u00032\u001f\u0010Ò\u0001\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0003H\u0000\u001a\u0013\u0010Ó\u0001\u001a\u00020\n2\b\u0010Ô\u0001\u001a\u00030Õ\u0001H\u0000\u001aq\u0010Ö\u0001\u001a\u0005\u0018\u0001H×\u0001\"\n\b\u0000\u0010Ø\u0001*\u00030Ù\u0001\"\n\b\u0001\u0010Ú\u0001*\u00030Ù\u0001\"\n\b\u0002\u0010×\u0001*\u00030Ù\u00012\t\u0010%\u001a\u0005\u0018\u0001HØ\u00012\t\u0010&\u001a\u0005\u0018\u0001HÚ\u00012\u001f\u0010Û\u0001\u001a\u001a\u0012\u0005\u0012\u0003HØ\u0001\u0012\u0005\u0012\u0003HÚ\u0001\u0012\u0007\u0012\u0005\u0018\u0001H×\u00010Ü\u0001H\u0086\bø\u0001\u0000¢\u0006\u0003\u0010Ý\u0001\u001a2\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020f0\u00042\r\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020f0\u00042\u0007\u0010à\u0001\u001a\u00020\u000e2\t\u0010á\u0001\u001a\u0004\u0018\u00010sH\u0000\u001a\u0011\u0010â\u0001\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0001H\u0000\u001a&\u0010ã\u0001\u001a\u00030ä\u00012\b\u0010å\u0001\u001a\u00030æ\u00012\u0007\u0010ç\u0001\u001a\u0002012\u0007\u0010è\u0001\u001a\u000201H\u0000\u001a\u001b\u0010é\u0001\u001a\u0002012\u0007\u0010ê\u0001\u001a\u0002012\u0007\u0010ç\u0001\u001a\u000201H\u0000\u001a\u001b\u0010ë\u0001\u001a\u0002012\u0007\u0010ì\u0001\u001a\u0002012\u0007\u0010è\u0001\u001a\u000201H\u0000\u001a\u0019\u0010í\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0015*\b\u0012\u0004\u0012\u0002010\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006î\u0001"}, d2 = {"TAG", "", "addEvent", "Lkotlin/Pair;", "", "eventName", StepData.ARGS, "", "(Ljava/lang/String;[Lkotlin/Pair;)Lkotlin/Pair;", "appendFaceDataToOutput", "", "data", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedFace;", "faceFound", "", "finalOutputProcessData", "Lcom/socure/docv/capturesdk/core/processor/model/FinalOutputProcessData;", "appendSelfieParams", "uploadImage", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "mutableList", "", "appendUploadCommonEventParams", "eventParams", ApiConstant.VALIDATE_IMAGE, "appendUploadSuccessEventParams", "uploadStartTime", "", "appendUploadUrl", "docUploadUuid", "calcAngleWithX", "", "line", "checkMinimumCameraResolutionSupport", "metricData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "comparePareOfPairs", "p1", "p2", "distanceBetween", "coordinates1", "coordinates2", "extractedDataToJson", "uploadImageMap", "Ljava/util/LinkedHashMap;", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "Lkotlin/collections/LinkedHashMap;", "findLargestSides", "coords", "", "fixAlphabets", "text", "fixSpecialChars", "flipDoc", "tiltTolerance", "isBBoxVertical", "getAttemptCount", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/capturesdk/feature/orchestrator/data/Config;", "websdk", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Websdk;", "defaultValue", "getBlurData", "Lcom/socure/docv/capturesdk/common/analytics/model/Blur;", "blurMetric", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "getCaptureModeMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "uploadMap", "getCaptureTitleText", "scanType", "screens", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Screens;", "getCapturedImageMap", "", "getCardAccessibilityAnnouncement", "Lcom/socure/docv/capturesdk/common/utils/GetCardAccesibilityAnnouncement;", "floatArray", "", "dimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "getCardPosition", "Lcom/socure/docv/capturesdk/feature/scanner/data/CardGuide;", "getCompileSdkVersion", "context", "Landroid/content/Context;", "getConfig", "configJson", "getConfigForApi", "Lcom/socure/docv/capturesdk/feature/orchestrator/data/ConfigRequest;", "getConfigSelfieRangeValues", "Lcom/socure/docv/capturesdk/core/pipeline/model/SelfieRange;", "getConfirmationTitleText", "newLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "getCornerData", "Lcom/socure/docv/capturesdk/common/analytics/model/Edge;", "cornerMetric", "getCornerDetectionFailedText", "getCurrentScreenForPreview", "Lcom/socure/docv/capturesdk/common/view/model/CurrentScreen;", "getCurrentScreenForScanner", "getDefaultSelfieAngleMinMax", "Lcom/socure/docv/capturesdk/common/network/model/stepup/MinMax;", "getDefaultSelfieRangeValues", "getDetectionWarningMsg", "warningMessages", "Lcom/socure/docv/capturesdk/common/utils/GetDetectionWarningMessages;", "detectionCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "getDeviceId", "getDisplayText", "getDocType", "Lcom/socure/docv/capturesdk/api/DocumentType;", "docTypeLabel", "getDocumentTooCloseMsg", "getDocumentTypeBody", "Lokhttp3/RequestBody;", "docSelection", "Lcom/socure/docv/capturesdk/common/analytics/DocSelection;", "getEventDataFromExtractedData", "getEventDurationPair", "duration", "getEventErrorData", "Lcom/socure/docv/capturesdk/common/analytics/model/EventData;", "code", "message", "internalErrorCode", "internalErrorMessage", AnalyticsConstantsKt.KEY_ENDPOINT, "getFlowResponseMap", "", "userConfig", "getFontScale", "getGlareData", "Lcom/socure/docv/capturesdk/common/analytics/model/Glare;", "glareMetric", "getGuidingBoxData", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBoxConstraintData;", "getGuidingMessageForSelfie", "getHelpTitleText", "getInitialAnnouncement", "accessibility", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Accessibility;", "noAnalysisMode", "getKeepSteadyText", "getLabel", "getLastFailure", "getLateAttrs", "getManualCapturePrimaryText", "getManualCaptureSecondaryText", "getManualWarningMessages", "getMinSdkVersion", "getPackageName", "getPowerByLabel", "getPreviewWarningMsg", Session.JsonKeys.ERRORS, "Lcom/socure/docv/capturesdk/common/network/model/stepup/Errors;", "errorCode", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/Errors;Ljava/lang/Integer;)Ljava/lang/String;", "getRegionWiseData", "Lcom/socure/docv/capturesdk/common/analytics/model/RegionWiseLines;", "regionList", "getRetakeEvent", "cause", "viewShownTime", "getScaledGuidingBoxArea", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "guidingBox", "scaleValue", "getScannedEventAttrs", "captureDuration", AgentOptions.OUTPUT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;JLcom/socure/docv/capturesdk/core/processor/model/Output;)[Lkotlin/Pair;", "getSelfieAccessibilityAnnouncementMessage", App.TYPE, "Lcom/socure/docv/capturesdk/common/network/model/stepup/App;", "getSelfieMetrics", "Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "getSelfieRange", "Lkotlin/ranges/IntRange;", "selfieRange", "getSpannedText", "", "spanned", "Landroid/text/Spanned;", "start", "end", "getTargetSdkVersion", "getTrackingPropertyMap", "trackingProperties", "Lcom/socure/docv/capturesdk/common/network/model/stepup/TrackingProperty;", "getWarningBlurPrimaryText", "getWarningDarkPrimaryText", "isFaceFoundForSelfie", "metrics", "isGooglePlayServicesAvailable", "isOldOs", "isTalkBackEnabled", "isUploadUrlAppendRequired", AnalyticsConstantsKt.KEY_SCREEN, "Lcom/socure/docv/capturesdk/common/utils/Screen;", "uuid", "lowRamDevice", "normaliseAngle", "angle", "relativeTilt", "referenceLine", "requestFocusAccessibilityEvent", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "safeLet", "R", "T1", "", "T2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "setFragNavActions", "skipScreens", "isSelfieEnabled", ApiConstant.DOCUMENT_TYPE, "startsWithPkEndsWithFiller", "translateRect", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Rect;", "scaleX", "scaleY", ViewProps.TRANSLATE_X, "x", ViewProps.TRANSLATE_Y, "y", "removeNegative", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UtilsKt {
    private static final String TAG = "SDLT_UTIL";

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DetectionCallback.values().length];
            try {
                iArr2[DetectionCallback.FACE_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DetectionCallback.FACE_AT_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DetectionCallback.FACE_AT_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DetectionCallback.FACE_AT_DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DetectionCallback.FACE_AT_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DetectionCallback.FACE_IS_BIG.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DetectionCallback.FACE_TOO_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DetectionCallback.FACE_ORIENTATION_WRONG.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DetectionCallback.LOW_BRIGHTNESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DetectionCallback.GLARE_DETECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[DetectionCallback.BLUR_DETECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[DetectionCallback.CORNER_DETECTION_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[DetectionCallback.CAPTURING.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[DetectionCallback.READY_FOR_SELFIE_CAPTURE.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[DetectionCallback.BARCODE_NOT_FOUND.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DocumentType.values().length];
            try {
                iArr3[DocumentType.LICENSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[DocumentType.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CardGuide.values().length];
            try {
                iArr4[CardGuide.MOVE_PHONE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[CardGuide.MOVE_PHONE_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[CardGuide.MOVE_PHONE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[CardGuide.MOVE_PHONE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[CardGuide.CARD_TOO_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[CardGuide.CARD_NOT_FOUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[DocSelection.values().length];
            try {
                iArr5[DocSelection.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[DocSelection.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final float translateX(float f, float f2) {
        return f * f2;
    }

    public static final float translateY(float f, float f2) {
        return f * f2;
    }

    public static final Blur getBlurData(DetectionMetric detectionMetric) {
        LoggerKt.logDetailed(TAG, "getBlurData - blurMetric: " + detectionMetric);
        if (detectionMetric == null) {
            return null;
        }
        Blur blur = new Blur(null, null, null, null, null, 31, null);
        blur.setVariance(detectionMetric.getOutputMeasure());
        blur.setAvgVariance(detectionMetric.getOutputMeasure());
        blur.setHighestAvgVariance(detectionMetric.getOutputMeasure());
        return blur;
    }

    public static final Glare getGlareData(DetectionMetric detectionMetric) {
        LoggerKt.logDetailed(TAG, "getGlareData - glareMetric: " + detectionMetric);
        if (detectionMetric == null) {
            return null;
        }
        Glare glare = new Glare(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        glare.setGlare(Boolean.valueOf(!detectionMetric.getCheckPassed()));
        glare.setPercentage(detectionMetric.getOutputMeasure());
        glare.setMaxGlarePercentage(detectionMetric.getOutputMeasure());
        return glare;
    }

    public static final Edge getCornerData(DetectionMetric detectionMetric) {
        LoggerKt.logDetailed(TAG, "getCornerData - cornerMetric: " + detectionMetric);
        if (detectionMetric == null) {
            return null;
        }
        Edge edge = new Edge(null, null, null, null, 15, null);
        edge.setEdgeDetectedAllSides(Boolean.valueOf(detectionMetric.getCheckPassed()));
        edge.setEdgeDetectedThreeSides(Boolean.valueOf(detectionMetric.getCheckPassed()));
        edge.setRegionWiseLines(getRegionWiseData(detectionMetric.getRegionList()));
        edge.setSubRegionInfo(new SubRegionInfo(true, true, true, true));
        return edge;
    }

    public static final RegionWiseLines getRegionWiseData(List<Float> regionList) {
        Intrinsics.checkNotNullParameter(regionList, "regionList");
        LoggerKt.logDetailed(TAG, "getRegionWiseData - regionList: " + CollectionsKt.joinToString$default(regionList, null, null, null, 0, null, null, 63, null));
        if (regionList.isEmpty()) {
            return null;
        }
        RegionWiseLines regionWiseLines = new RegionWiseLines(null, null, null, null, 15, null);
        regionWiseLines.setTopRegion(CollectionsKt.arrayListOf(Double.valueOf(regionList.get(0).floatValue()), Double.valueOf(regionList.get(1).floatValue())));
        regionWiseLines.setRightRegion(CollectionsKt.arrayListOf(Double.valueOf(regionList.get(3).floatValue()), Double.valueOf(regionList.get(4).floatValue())));
        regionWiseLines.setBottomRegion(CollectionsKt.arrayListOf(Double.valueOf(regionList.get(6).floatValue()), Double.valueOf(regionList.get(7).floatValue())));
        regionWiseLines.setLeftRegion(CollectionsKt.arrayListOf(Double.valueOf(regionList.get(9).floatValue()), Double.valueOf(regionList.get(10).floatValue())));
        return regionWiseLines;
    }

    public static final String getLabel(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        LoggerKt.logDetailed(TAG, "getLabel called - scanType: " + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return ConstantsKt.FRONT_CAMERA;
        }
        if (i == 2 || i == 3 || i == 4) {
            return ConstantsKt.BACK_CAMERA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final HashMap<String, String> getCaptureModeMap(LinkedHashMap<ScanType, UploadImage> uploadMap) {
        Intrinsics.checkNotNullParameter(uploadMap, "uploadMap");
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<ScanType, UploadImage> entry : uploadMap.entrySet()) {
            hashMap.put(entry.getKey().getValue(), entry.getValue().getCaptureType().getValue());
        }
        return hashMap;
    }

    public static final String extractedDataToJson(LinkedHashMap<ScanType, UploadImage> uploadImageMap) {
        Intrinsics.checkNotNullParameter(uploadImageMap, "uploadImageMap");
        ExtractedStepUpData baseExtractedDataForEnd = Utils.INSTANCE.getBaseExtractedDataForEnd(uploadImageMap);
        if (baseExtractedDataForEnd != null) {
            return new Gson().toJson(baseExtractedDataForEnd);
        }
        return null;
    }

    public static final String getCaptureTitleText(ScanType scanType, Screens screens) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(screens, "screens");
        LoggerKt.logDetailed(TAG, "getCaptureTitleText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return screens.getSelfieCapture().getHeader().getLabel();
        }
        if (i == 2) {
            return screens.getPassport().getHeader().getLabel();
        }
        if (i == 3) {
            return screens.getFrontCapture().getHeader().getLabel();
        }
        if (i == 4) {
            return screens.getBackCapture().getHeader().getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getHelpTitleText(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        LoggerKt.logDetailed(TAG, "getHelpTitleText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return newLabels.getSelfieCapture();
        }
        if (i == 2) {
            return newLabels.getPassportCapture();
        }
        if (i == 3) {
            return newLabels.getFrontCapture();
        }
        if (i == 4) {
            return newLabels.getBackCapture();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getConfirmationTitleText(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        LoggerKt.logDetailed(TAG, "getConfirmationTitleText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return newLabels.getSelfieCaptured();
        }
        if (i == 2) {
            return newLabels.getPassportCaptured();
        }
        if (i == 3) {
            return newLabels.getFrontSideCaptured();
        }
        if (i == 4) {
            return newLabels.getBackSideCaptured();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getKeepSteadyText(ScanType scanType, Screens screens) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(screens, "screens");
        LoggerKt.logDetailed(TAG, "keepSteadyText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            LoggerKt.logD(TAG, "scanType:" + scanType + " is empty");
            return "";
        }
        if (i == 2) {
            return screens.getPassport().getKeepSteadyText().getLabel();
        }
        if (i == 3) {
            return screens.getFrontCapture().getKeepSteadyText().getLabel();
        }
        if (i == 4) {
            return screens.getBackCapture().getKeepSteadyText().getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getGuidingMessageForSelfie(DetectionCallback detectionCallback, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        LoggerKt.logDetailed(TAG, "getGuidingMessageForSelfie detectionCallback: " + detectionCallback);
        switch (WhenMappings.$EnumSwitchMapping$1[detectionCallback.ordinal()]) {
            case 1:
                return newLabels.getAlignFaceBox();
            case 2:
            case 3:
            case 4:
            case 5:
                return newLabels.getFaceMustBeVisible();
            case 6:
                return newLabels.getFaceTooClose();
            case 7:
                return newLabels.getMoveCloser();
            case 8:
                return newLabels.getFaceNotParallel();
            default:
                return newLabels.getGreatNowCapture();
        }
    }

    public static final boolean isFaceFoundForSelfie(List<DetectionMetric> metrics) {
        DetectionCallback detectionCallback;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (metrics.isEmpty() || (detectionCallback = ((DetectionMetric) CollectionsKt.first((List) metrics)).getDetectionCallback()) == null) {
            return false;
        }
        return CollectionsKt.listOf((Object[]) new DetectionCallback[]{DetectionCallback.READY_FOR_SELFIE_CAPTURE, DetectionCallback.FACE_AT_LEFT, DetectionCallback.FACE_AT_UP, DetectionCallback.FACE_AT_DOWN, DetectionCallback.FACE_AT_RIGHT, DetectionCallback.FACE_TOO_SMALL, DetectionCallback.FACE_ORIENTATION_WRONG}).contains(detectionCallback);
    }

    public static final String getDisplayText(DetectionCallback detectionCallback) {
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        switch (WhenMappings.$EnumSwitchMapping$1[detectionCallback.ordinal()]) {
            case 1:
                return SelfieConstants.FACE_NOT_FOUND;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return SelfieConstants.FACE_NOT_ALIGNED;
            case 7:
                return SelfieConstants.FACE_TOO_SMALL;
            case 8:
                return SelfieConstants.FACE_ORIENTATION_WRONG;
            default:
                return SelfieConstants.READY_FOR_SELFIE_CAPTURE;
        }
    }

    public static final SelfieMetrics getSelfieMetrics(Output output) {
        Object obj;
        Intrinsics.checkNotNullParameter(output, "output");
        Iterator<T> it = output.getMetrics().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DetectionMetric) obj).getDetectionType() == DetectionType.SELFIE) {
                break;
            }
        }
        DetectionMetric detectionMetric = (DetectionMetric) obj;
        if (detectionMetric != null) {
            return detectionMetric.getSelfieMetrics();
        }
        return null;
    }

    public static final void appendSelfieParams(UploadImage uploadImage, List<Pair<String, String>> mutableList) {
        Intrinsics.checkNotNullParameter(uploadImage, "uploadImage");
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        SelfieMetrics selfieMetrics = uploadImage.getSelfieMetrics();
        if (selfieMetrics != null) {
            Double pitch = selfieMetrics.getPitch();
            if (pitch != null) {
                mutableList.add(new Pair<>(AnalyticsConstantsKt.KEY_PITCH, String.valueOf(pitch.doubleValue())));
            }
            Double yaw = selfieMetrics.getYaw();
            if (yaw != null) {
                mutableList.add(new Pair<>(AnalyticsConstantsKt.KEY_YAW, String.valueOf(yaw.doubleValue())));
            }
            Double roll = selfieMetrics.getRoll();
            if (roll != null) {
                mutableList.add(new Pair<>("roll", String.valueOf(roll.doubleValue())));
            }
            Integer faceWidth = selfieMetrics.getFaceWidth();
            if (faceWidth != null) {
                mutableList.add(new Pair<>(AnalyticsConstantsKt.KEY_FACE_WIDTH, String.valueOf(faceWidth.intValue())));
            }
            Integer faceHeight = selfieMetrics.getFaceHeight();
            if (faceHeight != null) {
                mutableList.add(new Pair<>(AnalyticsConstantsKt.KEY_FACE_HEIGHT, String.valueOf(faceHeight.intValue())));
            }
            Float faceRatio = selfieMetrics.getFaceRatio();
            if (faceRatio != null) {
                mutableList.add(new Pair<>(AnalyticsConstantsKt.KEY_FACE_RATIO, String.valueOf(faceRatio.floatValue())));
            }
            String displayText = selfieMetrics.getDisplayText();
            if (displayText != null) {
                mutableList.add(new Pair<>(AnalyticsConstantsKt.KEY_DISPLAY_TEXT, displayText));
            }
        }
    }

    public static final String getWarningDarkPrimaryText(ScanType scanType, Screens screens) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(screens, "screens");
        LoggerKt.logDetailed(TAG, "getWarningDarkPrimaryText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return screens.getSelfieCapture().getErrorTextSecondary().getLabel();
        }
        if (i == 2) {
            return screens.getPassport().getDarkErrorSecondary().getLabel();
        }
        if (i == 3) {
            return screens.getFrontCapture().getErrorMessageSecondaryText().getLabel();
        }
        if (i == 4) {
            return screens.getBackCapture().getDarkErrorSecondary().getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getWarningBlurPrimaryText(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        LoggerKt.logDetailed(TAG, "getWarningBlurPrimaryText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            LoggerKt.logD(TAG, "scanType:" + scanType + " is empty");
            return "";
        }
        if (i == 2) {
            return newLabels.getEnsurePassportFocus();
        }
        if (i == 3 || i == 4) {
            return newLabels.getEnsureIdFocus();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getManualCapturePrimaryText(ScanType scanType, Screens screens) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(screens, "screens");
        LoggerKt.logDetailed(TAG, "getManualCapturePrimaryText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return screens.getSelfieCapture().getManualCapturePrimaryText().getLabel();
        }
        if (i == 2) {
            return screens.getPassport().getManualCapturePrimaryText().getLabel();
        }
        if (i == 3) {
            return screens.getFrontCapture().getManualCapturePrimaryText().getLabel();
        }
        if (i == 4) {
            return screens.getBackCapture().getManualCapturePrimaryText().getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getManualCaptureSecondaryText(ScanType scanType, Screens screens) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(screens, "screens");
        LoggerKt.logDetailed(TAG, "getManualCaptureSecText scanType:" + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return screens.getSelfieCapture().getManualCaptureSecondaryText().getLabel();
        }
        if (i == 2) {
            return screens.getPassport().getManualCaptureSecondaryText().getLabel();
        }
        if (i == 3) {
            return screens.getFrontCapture().getManualCaptureSecondaryText().getLabel();
        }
        if (i == 4) {
            return screens.getBackCapture().getManualCaptureSecondaryText().getLabel();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean checkMinimumCameraResolutionSupport(MetricData metricData) {
        Object obj;
        Object obj2;
        Capabilities capabilities;
        Capabilities capabilities2;
        Intrinsics.checkNotNullParameter(metricData, "metricData");
        LoggerKt.logDetailed(TAG, "checkMinimumCameraResolution");
        ArrayList<CameraDevice> devices = metricData.getDevices();
        Iterator<T> it = devices.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((CameraDevice) obj2).getLabel(), ConstantsKt.BACK_CAMERA)) {
                break;
            }
        }
        CameraDevice cameraDevice = (CameraDevice) obj2;
        Iterator<T> it2 = devices.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.areEqual(((CameraDevice) next).getLabel(), ConstantsKt.FRONT_CAMERA)) {
                obj = next;
                break;
            }
        }
        CameraDevice cameraDevice2 = (CameraDevice) obj;
        if (cameraDevice != null && (capabilities2 = cameraDevice.getCapabilities()) != null && (capabilities2.getWidth().getMax() < 2048 || capabilities2.getHeight().getMax() < 1152)) {
            return false;
        }
        if (cameraDevice2 == null || (capabilities = cameraDevice2.getCapabilities()) == null) {
            return true;
        }
        return capabilities.getWidth().getMax() >= 1280 && capabilities.getHeight().getMax() >= 720;
    }

    public static final boolean startsWithPkEndsWithFiller(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return Pattern.compile("(PK)([A-Z]{3})([A-Z]+)(<<)([A-Z]+)(<+)").matcher(text).find();
    }

    public static final String fixAlphabets(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(text, AppEventsConstants.EVENT_PARAM_VALUE_NO, "O", false, 4, (Object) null), "1", "I", false, 4, (Object) null), "5", ExifInterface.LATITUDE_SOUTH, false, 4, (Object) null), "8", "B", false, 4, (Object) null), ExifInterface.GPS_MEASUREMENT_2D, "Z", false, 4, (Object) null);
    }

    public static final String fixSpecialChars(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(text, "«", length >= 44 ? MrzParserKt.FILLER : "<<", false, 4, (Object) null), "»", length >= 44 ? ">" : ">>", false, 4, (Object) null), "ó", "6", false, 4, (Object) null), "Ó", "6", false, 4, (Object) null);
    }

    public static final HashMap<String, byte[]> getCapturedImageMap(LinkedHashMap<ScanType, UploadImage> uploadMap) {
        Intrinsics.checkNotNullParameter(uploadMap, "uploadMap");
        HashMap<String, byte[]> hashMap = new HashMap<>();
        for (Map.Entry<ScanType, UploadImage> entry : uploadMap.entrySet()) {
            hashMap.put(entry.getKey().getValue(), entry.getValue().getImage());
        }
        return hashMap;
    }

    public static final String getPackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    public static final String getDeviceId(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = context.getSharedPreferences(AnalyticsConstantsKt.SHARED_PREF_NAME, 0);
        String string = prefs.getString("device_id", null);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(prefs, "prefs");
            SharedPreferences.Editor editor = prefs.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString("device_id", string);
            editor.apply();
        }
        return string == null ? Utils.INSTANCE.randomString$capturesdk_productionRelease(32) : string;
    }

    public static final boolean isOldOs() {
        return Build.VERSION.SDK_INT < 28;
    }

    public static final boolean lowRamDevice() {
        return ConstantsKt.getTOTAL_MEMORY() < 3000;
    }

    public static final ConfigRequest getConfigForApi(Config config) {
        if (config != null) {
            try {
                JsonElement parse = new JsonParser().parse(new Gson().toJson(config));
                Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type com.google.gson.JsonObject");
                JsonObject jsonObject = (JsonObject) parse;
                jsonObject.remove(Keys.KEY_DOCUMENT_TYPE);
                jsonObject.remove(Keys.KEY_MAX_SUBMIT);
                Flow flow = config.getFlow();
                String name = flow != null ? flow.getName() : null;
                return new ConfigRequest(name == null ? null : new FlowRequest(name), config.getLanguage());
            } catch (Throwable th) {
                LoggerKt.logE$default(TAG, "getConfigForApi ex: " + Log.getStackTraceString(th), null, 4, null);
                return new ConfigRequest(null, null, 3, null);
            }
        }
        return new ConfigRequest(null, null, 3, null);
    }

    public static final Config getConfig(String str) {
        try {
            Object fromJson = new Gson().fromJson(str, (Class<Object>) Config.class);
            ((Config) fromJson).setRaw(str);
            return (Config) fromJson;
        } catch (Throwable th) {
            LoggerKt.logE$default(TAG, "ex in getConfig: " + Log.getStackTraceString(th), null, 4, null);
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                return null;
            }
            return new Config(str, null, null, null, null, 30, null);
        }
    }

    public static final List<CurrentScreen> setFragNavActions(List<? extends CurrentScreen> skipScreens, boolean z, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(skipScreens, "skipScreens");
        LoggerKt.logD(TAG, "setFragNavActions called - isSelfieEnabled: " + z + " | documentType: " + documentType);
        ArrayList arrayList = new ArrayList();
        if (!skipScreens.contains(CurrentScreen.SELECTOR)) {
            arrayList.add(CurrentScreen.SELECTOR);
        }
        if (documentType != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[documentType.ordinal()];
            if (i == 1) {
                arrayList.add(CurrentScreen.SCANNER_FRONT);
                arrayList.add(CurrentScreen.PREVIEW_FRONT);
                arrayList.add(CurrentScreen.SCANNER_BACK);
                arrayList.add(CurrentScreen.PREVIEW_BACK);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(CurrentScreen.SCANNER_PASSPORT);
                arrayList.add(CurrentScreen.PREVIEW_PASSPORT);
            }
        }
        if (z) {
            arrayList.add(CurrentScreen.SCANNER_SELFIE);
            arrayList.add(CurrentScreen.PREVIEW_SELFIE);
        }
        return arrayList;
    }

    public static final CurrentScreen getCurrentScreenForScanner(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        LoggerKt.logD(TAG, "getCurrentScreenForScanner called - scanType: " + scanType.getValue());
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return CurrentScreen.SCANNER_SELFIE;
        }
        if (i == 2) {
            return CurrentScreen.SCANNER_PASSPORT;
        }
        if (i == 3) {
            return CurrentScreen.SCANNER_FRONT;
        }
        if (i == 4) {
            return CurrentScreen.SCANNER_BACK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CurrentScreen getCurrentScreenForPreview(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        LoggerKt.logD(TAG, "getCurrentScreenForPreview called - scanType: " + scanType.getValue());
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return CurrentScreen.PREVIEW_SELFIE;
        }
        if (i == 2) {
            return CurrentScreen.PREVIEW_PASSPORT;
        }
        if (i == 3) {
            return CurrentScreen.PREVIEW_FRONT;
        }
        if (i == 4) {
            return CurrentScreen.PREVIEW_BACK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Pair<String, List<Pair<String, String>>> addEvent(String eventName, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        LoggerKt.logD(TAG, "addEvent called");
        return new Pair<>(eventName, CollectionsKt.listOf(Arrays.copyOf(args, args.length)));
    }

    public static final Pair<String, String> getEventDurationPair(long j) {
        return new Pair<>("duration", String.valueOf(j));
    }

    public static final Pair<String, List<Pair<String, String>>> getEventDataFromExtractedData(ScanType scanType, FinalOutputProcessData finalOutputProcessData) {
        String str;
        String str2;
        Pair<String, List<Pair<String, String>>> addEvent;
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(finalOutputProcessData, "finalOutputProcessData");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return addEvent(finalOutputProcessData.getData() != null ? AnalyticsConstantsKt.PASSPORT_MRZ_SUCCESS : finalOutputProcessData.getFound() ? AnalyticsConstantsKt.PASSPORT_MRZ_PARTIAL : AnalyticsConstantsKt.PASSPORT_MRZ_FAILURE, getEventDurationPair(finalOutputProcessData.getDuration()));
        }
        if (i != 3) {
            if (i == 4) {
                if (finalOutputProcessData.getFound()) {
                    return (finalOutputProcessData.getData() == null || (addEvent = addEvent(AnalyticsConstantsKt.ID_CARD_BARCODE_SUCCESS, getEventDurationPair(finalOutputProcessData.getDuration()))) == null) ? addEvent(AnalyticsConstantsKt.ID_CARD_BARCODE_FAILURE, new Pair("type", "extraction_failure"), getEventDurationPair(finalOutputProcessData.getDuration())) : addEvent;
                }
                if (finalOutputProcessData.getFaceFound()) {
                    str2 = "face_detected";
                } else {
                    str2 = "not_detected";
                }
                LoggerKt.logD(TAG, "Face detection failed - scanType: " + scanType + " | failureType: " + str2);
                return addEvent(AnalyticsConstantsKt.ID_CARD_BARCODE_FAILURE, new Pair("type", str2), getEventDurationPair(finalOutputProcessData.getDuration()));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (finalOutputProcessData.getData() != null && finalOutputProcessData.getFound() && (finalOutputProcessData.getData() instanceof ExtractedFace)) {
            BaseExtractedData data = finalOutputProcessData.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.socure.docv.capturesdk.core.extractor.model.ExtractedFace");
            ExtractedFace extractedFace = (ExtractedFace) data;
            if (extractedFace.getRotZAxis() == 0.0f) {
                return addEvent(AnalyticsConstantsKt.ORIENTATION_CORRECTION_NO_ACTION, getEventDurationPair(finalOutputProcessData.getDuration()));
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("angle", String.valueOf((int) extractedFace.getRotZAxis()));
            pairArr[1] = new Pair("type", (extractedFace.getRotZAxis() == 180.0f || extractedFace.getRotZAxis() == 360.0f) ? AnalyticsConstantsKt.HORIZONTAL : AnalyticsConstantsKt.VERTICAL);
            pairArr[2] = getEventDurationPair(finalOutputProcessData.getDuration());
            return addEvent(AnalyticsConstantsKt.ORIENTATION_CORRECTION_SUCCESS, pairArr);
        }
        if (!finalOutputProcessData.getFound()) {
            str = AnalyticsConstantsKt.FACE_NOT_DETECTED;
        } else if (finalOutputProcessData.getData() == null) {
            str = AnalyticsConstantsKt.NO_ANGLE_DATA;
        } else {
            str = "unknown";
        }
        LoggerKt.logD(TAG, "Face detection failed - scanType: " + scanType + " | failureType: " + str);
        return addEvent(AnalyticsConstantsKt.ORIENTATION_CORRECTION_FAIL, new Pair("type", str), getEventDurationPair(finalOutputProcessData.getDuration()));
    }

    public static final DocumentType getDocType(String str) {
        if (Intrinsics.areEqual(str, DocumentType.LICENSE.getLabel())) {
            return DocumentType.LICENSE;
        }
        if (Intrinsics.areEqual(str, DocumentType.PASSPORT.getLabel())) {
            return DocumentType.PASSPORT;
        }
        return null;
    }

    public static final String getPowerByLabel(Screens screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        return screens.getCommon().getLabels().getPoweredBy().getLabel();
    }

    public static final Pair<String, String> getManualWarningMessages(ScanType scanType, Screens screens) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(screens, "screens");
        return new Pair<>(scanType == ScanType.SELFIE ? null : getManualCapturePrimaryText(scanType, screens), getManualCaptureSecondaryText(scanType, screens));
    }

    public static final Pair<String, List<Pair<String, String>>> getRetakeEvent(ScanType scanType, DocSelection docSelection, String cause, long j) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(cause, "cause");
        String replacePlaceholders$capturesdk_productionRelease = Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(Utils.INSTANCE.isSelfie$capturesdk_productionRelease(scanType) ? AnalyticsConstantsKt.SELFIE_CAPTURE_RETAKE : AnalyticsConstantsKt.SCAN_RETAKE, scanType, docSelection);
        List mutableListOf = CollectionsKt.mutableListOf(new Pair("type", cause));
        mutableListOf.add(TuplesKt.to(AnalyticsConstantsKt.KEY_SCREEN_DURATION, String.valueOf(System.currentTimeMillis() - j)));
        mutableListOf.add(TuplesKt.to(AnalyticsConstantsKt.KEY_SCREEN, AnalyticsConstantsKt.PREVIEW_SCREEN));
        return new Pair<>(replacePlaceholders$capturesdk_productionRelease, mutableListOf);
    }

    public static final String getDetectionWarningMsg(GetDetectionWarningMessages warningMessages, DetectionCallback detectionCallback) {
        Intrinsics.checkNotNullParameter(warningMessages, "warningMessages");
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        switch (WhenMappings.$EnumSwitchMapping$1[detectionCallback.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 14:
                return warningMessages.getGuidingMessage(detectionCallback);
            case 9:
                return warningMessages.getLowBrightnessMessage();
            case 10:
                return warningMessages.getAdjustLightingMessage();
            case 11:
                return warningMessages.getBlurMessage();
            case 12:
                return warningMessages.getCornerDetectionFailedMessage();
            case 13:
                return warningMessages.getKeepSteadyMessage();
            case 15:
                return warningMessages.getBarcodeNotFoundMessage();
            default:
                LoggerKt.logD(TAG, "unhandled detectionCallback: " + detectionCallback);
                return "";
        }
    }

    public static final void appendFaceDataToOutput(ExtractedFace data, boolean z, FinalOutputProcessData finalOutputProcessData) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(finalOutputProcessData, "finalOutputProcessData");
        LoggerKt.logD(TAG, "called appendFaceDataToOutput");
        finalOutputProcessData.setFaceFound(z);
        finalOutputProcessData.setFace(CollectionsKt.arrayListOf(new Face(null, Boolean.valueOf(z), Double.valueOf(1.0d), Float.valueOf(data.getRotZAxis()), 1, null)));
    }

    public static final void requestFocusAccessibilityEvent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestFocus();
        view.sendAccessibilityEvent(8);
    }

    public static final boolean isTalkBackEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
    }

    public static final float getFontScale(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return Settings.System.getFloat(context.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            LoggerKt.logE$default(TAG, "SettingNotFoundException exception: " + e.getMessage(), null, 4, null);
            return 0.0f;
        }
    }

    public static final double relativeTilt(Pair<? extends List<Double>, ? extends List<Double>> line, Pair<? extends List<Double>, ? extends List<Double>> referenceLine) {
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(referenceLine, "referenceLine");
        return Math.abs(Math.toDegrees(Math.atan2(line.getFirst().get(1).doubleValue() - line.getSecond().get(1).doubleValue(), line.getFirst().get(0).doubleValue() - line.getSecond().get(0).doubleValue()) - Math.atan2(referenceLine.getFirst().get(1).doubleValue() - referenceLine.getSecond().get(1).doubleValue(), referenceLine.getFirst().get(0).doubleValue() - referenceLine.getSecond().get(0).doubleValue())));
    }

    public static final double calcAngleWithX(Pair<? extends List<Double>, ? extends List<Double>> line) {
        Intrinsics.checkNotNullParameter(line, "line");
        Double valueOf = Double.valueOf(0.0d);
        double relativeTilt = relativeTilt(line, new Pair(CollectionsKt.mutableListOf(valueOf, valueOf), CollectionsKt.mutableListOf(Double.valueOf(10.0d), valueOf)));
        return relativeTilt < 0.0d ? relativeTilt + 360.0d : relativeTilt;
    }

    public static final Pair<Pair<List<Double>, List<Double>>, Pair<List<Double>, List<Double>>> findLargestSides(List<Float> coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        Pair pair = new Pair(CollectionsKt.mutableListOf(Double.valueOf(coords.get(0).floatValue()), Double.valueOf(coords.get(1).floatValue())), CollectionsKt.mutableListOf(Double.valueOf(coords.get(3).floatValue()), Double.valueOf(coords.get(4).floatValue())));
        Pair pair2 = new Pair(CollectionsKt.mutableListOf(Double.valueOf(coords.get(3).floatValue()), Double.valueOf(coords.get(4).floatValue())), CollectionsKt.mutableListOf(Double.valueOf(coords.get(6).floatValue()), Double.valueOf(coords.get(7).floatValue())));
        Pair pair3 = new Pair(CollectionsKt.mutableListOf(Double.valueOf(coords.get(9).floatValue()), Double.valueOf(coords.get(10).floatValue())), CollectionsKt.mutableListOf(Double.valueOf(coords.get(6).floatValue()), Double.valueOf(coords.get(7).floatValue())));
        Pair pair4 = new Pair(CollectionsKt.mutableListOf(Double.valueOf(coords.get(0).floatValue()), Double.valueOf(coords.get(1).floatValue())), CollectionsKt.mutableListOf(Double.valueOf(coords.get(9).floatValue()), Double.valueOf(coords.get(10).floatValue())));
        if (distanceBetween((List) pair.getFirst(), (List) pair.getSecond()) > distanceBetween((List) pair2.getFirst(), (List) pair2.getSecond()) && distanceBetween((List) pair3.getFirst(), (List) pair3.getSecond()) > distanceBetween((List) pair4.getFirst(), (List) pair4.getSecond())) {
            LoggerKt.logDetailed(TAG, "largest side is 1, 3");
            return new Pair<>(pair, pair3);
        }
        if (distanceBetween((List) pair2.getFirst(), (List) pair2.getSecond()) <= distanceBetween((List) pair3.getFirst(), (List) pair3.getSecond()) || distanceBetween((List) pair4.getFirst(), (List) pair4.getSecond()) <= distanceBetween((List) pair.getFirst(), (List) pair.getSecond())) {
            return null;
        }
        LoggerKt.logDetailed(TAG, "largest side is 2, 4");
        return new Pair<>(pair2, pair4);
    }

    public static final double distanceBetween(List<Double> coordinates1, List<Double> coordinates2) {
        Intrinsics.checkNotNullParameter(coordinates1, "coordinates1");
        Intrinsics.checkNotNullParameter(coordinates2, "coordinates2");
        return Math.hypot(coordinates1.get(0).doubleValue() - coordinates2.get(0).doubleValue(), coordinates1.get(1).doubleValue() - coordinates2.get(1).doubleValue());
    }

    public static final double normaliseAngle(double d) {
        double d2 = (d <= 90.0d || d > 180.0d) ? (d <= 180.0d || d > 270.0d) ? (d <= 270.0d || d > 360.0d) ? d : 360.0d - d : d - 180 : 180.0d - d;
        LoggerKt.logDetailed(TAG, "angleWX: " + d + " normalised to " + d2);
        return d2;
    }

    public static final boolean flipDoc(List<Float> coords, double d, boolean z) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        LoggerKt.logDetailed(TAG, "flipDoc - " + CollectionsKt.joinToString$default(coords, null, null, null, 0, null, null, 63, null) + ", " + d + ", " + z);
        Pair<Pair<List<Double>, List<Double>>, Pair<List<Double>, List<Double>>> findLargestSides = findLargestSides(coords);
        if (findLargestSides != null) {
            double normaliseAngle = normaliseAngle(calcAngleWithX(findLargestSides.getFirst()));
            double normaliseAngle2 = normaliseAngle(calcAngleWithX(findLargestSides.getSecond()));
            LoggerKt.logDetailed(TAG, "angleWX detected: " + normaliseAngle + ", " + normaliseAngle2 + " | is vertical: $" + z);
            if (normaliseAngle * normaliseAngle2 >= 0.0d && Math.abs(normaliseAngle) <= d && Math.abs(normaliseAngle2) <= d && z) {
                return true;
            }
            double d2 = 90.0d - d;
            if (Math.abs(normaliseAngle) >= d2 && Math.abs(normaliseAngle2) >= d2 && !z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean comparePareOfPairs(Pair<? extends Pair<? extends List<Double>, ? extends List<Double>>, ? extends Pair<? extends List<Double>, ? extends List<Double>>> p1, Pair<? extends Pair<? extends List<Double>, ? extends List<Double>>, ? extends Pair<? extends List<Double>, ? extends List<Double>>> p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return Intrinsics.areEqual(p1.getFirst().getFirst(), p2.getFirst().getFirst()) && Intrinsics.areEqual(p1.getFirst().getSecond(), p2.getFirst().getSecond()) && Intrinsics.areEqual(p1.getSecond().getFirst(), p2.getSecond().getFirst()) && Intrinsics.areEqual(p1.getSecond().getSecond(), p2.getSecond().getSecond());
    }

    public static final String getSelfieAccessibilityAnnouncementMessage(DetectionCallback detectionCallback, com.socure.docv.capturesdk.common.network.model.stepup.App app) {
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        Intrinsics.checkNotNullParameter(app, "app");
        LoggerKt.logDetailed(TAG, "getSelfieAccessibilityAnnouncementMessage called");
        switch (WhenMappings.$EnumSwitchMapping$1[detectionCallback.ordinal()]) {
            case 1:
                return app.getAccessibility().getAlignFaceFrame();
            case 2:
                return app.getAccessibility().getMovePhoneLeft();
            case 3:
                return app.getAccessibility().getMovePhoneUp();
            case 4:
                return app.getAccessibility().getMovePhoneDown();
            case 5:
                return app.getAccessibility().getMovePhoneRight();
            case 6:
                return app.getNewLabels().getFaceTooClose();
            case 7:
                return app.getAccessibility().getFaceIsSmall();
            case 8:
                return app.getAccessibility().getHoldPhoneFront();
            default:
                return app.getAccessibility().getIdealFace();
        }
    }

    public static final String getCardAccessibilityAnnouncement(GetCardAccesibilityAnnouncement getCardAccessibilityAnnouncement, float[] floatArray, Dimension dimension) {
        Intrinsics.checkNotNullParameter(getCardAccessibilityAnnouncement, "getCardAccessibilityAnnouncement");
        Intrinsics.checkNotNullParameter(floatArray, "floatArray");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        LoggerKt.logD(TAG, "getCardAccessibilityAnnouncement called");
        switch (WhenMappings.$EnumSwitchMapping$3[getCardPosition(floatArray, dimension).ordinal()]) {
            case 1:
                return getCardAccessibilityAnnouncement.getMovePhoneUp();
            case 2:
                return getCardAccessibilityAnnouncement.getMovePhoneDown();
            case 3:
                return getCardAccessibilityAnnouncement.getMovePhoneLeft();
            case 4:
                return getCardAccessibilityAnnouncement.getMovePhoneRight();
            case 5:
                return getCardAccessibilityAnnouncement.getCardTooClose();
            case 6:
                return getCardAccessibilityAnnouncement.getCardNotFound();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CardGuide getCardPosition(float[] floatArray, Dimension dimension) {
        Intrinsics.checkNotNullParameter(floatArray, "floatArray");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        LoggerKt.logD(TAG, "getCardAccessibilityAnnouncement called");
        Rect rect = new Rect(MathKt.roundToInt(floatArray[0]), MathKt.roundToInt(floatArray[1]), MathKt.roundToInt(floatArray[3]), MathKt.roundToInt(floatArray[7]));
        if (rect.width() / dimension.getW() > (rect.height() > rect.width() ? 0.6d : 0.94d)) {
            return CardGuide.CARD_TOO_CLOSE;
        }
        float f = floatArray[2];
        if (f >= 0.9f && floatArray[5] >= 0.9f) {
            return CardGuide.MOVE_PHONE_DOWN;
        }
        float f2 = floatArray[8];
        if (f2 >= 0.9f && floatArray[11] >= 0.9f) {
            return CardGuide.MOVE_PHONE_UP;
        }
        if (f >= 0.9f && floatArray[11] >= 0.9f) {
            return CardGuide.MOVE_PHONE_RIGHT;
        }
        if (floatArray[5] >= 0.9f && f2 >= 0.9f) {
            return CardGuide.MOVE_PHONE_LEFT;
        }
        return CardGuide.CARD_NOT_FOUND;
    }

    public static final RectF translateRect(Rect rect, float f, float f2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RectF(translateX(rect.left, f), translateY(rect.top, f2), translateX(rect.right, f), translateY(rect.bottom, f2));
    }

    public static final GuidingBox getScaledGuidingBoxArea(GuidingBox guidingBox, float f) {
        Intrinsics.checkNotNullParameter(guidingBox, "guidingBox");
        LoggerKt.logDetailed(TAG, "getScaledGuidingBoxArea called");
        return new GuidingBox((int) (guidingBox.getWidth() + (guidingBox.getWidth() * f)), (int) (guidingBox.getHeight() + (guidingBox.getHeight() * f)), (int) (guidingBox.getLeftTopX() - (guidingBox.getLeftTopX() * f)), (int) (guidingBox.getLeftTopY() - (guidingBox.getLeftTopY() * f)), guidingBox.getParentDimension());
    }

    public static final CharSequence getSpannedText(Spanned spanned, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        if (i < 0 || i2 < 0) {
            return null;
        }
        return spanned.subSequence(i, i2);
    }

    public static final List<Float> removeNegative(List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(RangesKt.coerceAtLeast(((Number) it.next()).floatValue(), 0.0f)));
        }
        return arrayList;
    }

    public static final String getInitialAnnouncement(ScanType scanType, Accessibility accessibility, boolean z) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        LoggerKt.logDetailed(TAG, "getInitialAnnouncement called");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return z ? accessibility.getMovePhoneFrontLowEndDevice() : accessibility.getMovePhoneFront();
        }
        if (i == 2) {
            return accessibility.getFocusCameraPassport();
        }
        if (i == 3) {
            return accessibility.getFocusCameraId();
        }
        if (i == 4) {
            return accessibility.getFlipIdBarcode();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RequestBody getDocumentTypeBody(DocSelection docSelection) {
        String str;
        Intrinsics.checkNotNullParameter(docSelection, "docSelection");
        LoggerKt.logD(TAG, "getDocumentTypeBody");
        int i = WhenMappings.$EnumSwitchMapping$4[docSelection.ordinal()];
        if (i == 1) {
            str = ApiConstant.DOCUMENT_TYPE_LICENSE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "passport";
        }
        return ApiUtilsKt.toTextPlainBody(str);
    }

    public static final EventData getEventErrorData(int i, String str, int i2, String internalErrorMessage, String endpoint) {
        Intrinsics.checkNotNullParameter(internalErrorMessage, "internalErrorMessage");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("code", String.valueOf(i));
        if (str == null) {
            str = "NULL";
        }
        pairArr[1] = new Pair("message", str);
        pairArr[2] = new Pair(AnalyticsConstantsKt.KEY_INTERNAL_ERROR_CODE, String.valueOf(i2));
        pairArr[3] = new Pair(AnalyticsConstantsKt.KEY_INTERNAL_ERROR_MESSAGE, internalErrorMessage);
        pairArr[4] = new Pair(AnalyticsConstantsKt.KEY_ENDPOINT, endpoint);
        return new EventData(AnalyticsConstantsKt.REQUEST_FAILURE, CollectionsKt.arrayListOf(pairArr));
    }

    public static final int getAttemptCount(Config config, Websdk websdk, int i) {
        Integer maxSubmitCount;
        Intrinsics.checkNotNullParameter(websdk, "websdk");
        int value = (config == null || (maxSubmitCount = config.getMaxSubmitCount()) == null) ? websdk.getIvsMaxSubmitCount().getValue() : maxSubmitCount.intValue();
        return value <= 0 ? i : value;
    }

    public static final void appendUploadCommonEventParams(List<Pair<String, String>> eventParams, UploadImage uploadImage, boolean z) {
        Intrinsics.checkNotNullParameter(eventParams, "eventParams");
        Intrinsics.checkNotNullParameter(uploadImage, "uploadImage");
        LoggerKt.logDetailed(TAG, "appendUploadCommonEventParams called");
        if (Utils.INSTANCE.isSelfie$capturesdk_productionRelease(uploadImage.getScanType())) {
            appendSelfieParams(uploadImage, eventParams);
        }
        eventParams.add(new Pair<>("height", String.valueOf((int) uploadImage.getDimension().getH())));
        eventParams.add(new Pair<>("width", String.valueOf((int) uploadImage.getDimension().getW())));
        eventParams.add(new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()));
        eventParams.add(new Pair<>(AnalyticsConstantsKt.KEY_VALIDATE_IMAGE, String.valueOf(z)));
        eventParams.add(new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, AnalyticsConstantsKt.PREVIEW_SCREEN));
    }

    public static final void appendUploadSuccessEventParams(List<Pair<String, String>> eventParams, long j) {
        Intrinsics.checkNotNullParameter(eventParams, "eventParams");
        LoggerKt.logDetailed(TAG, "appendUploadSuccessEventParams called");
        eventParams.add(new Pair<>("duration", String.valueOf(System.currentTimeMillis() - j)));
    }

    public static final <T1, T2, R> R safeLet(T1 t1, T2 t2, Function2<? super T1, ? super T2, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (t1 == null || t2 == null) {
            return null;
        }
        return block.invoke(t1, t2);
    }

    public static final String getLastFailure(DetectionCallback detectionCallback) {
        Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
        LoggerKt.logDetailed(TAG, "getLastFailure called - detectionCallback: " + detectionCallback.name());
        switch (WhenMappings.$EnumSwitchMapping$1[detectionCallback.ordinal()]) {
            case 9:
                return ConstantsKt.BRIGHTNESS;
            case 10:
                return ConstantsKt.GLARE;
            case 11:
                return ConstantsKt.BLUR;
            case 12:
                return ConstantsKt.CORNER_DETECTION;
            default:
                return null;
        }
    }

    public static final String getTargetSdkVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.getApplicationContext().getApplicationInfo().targetSdkVersion);
    }

    public static final String getMinSdkVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.getApplicationContext().getApplicationInfo().minSdkVersion);
    }

    public static final String getCompileSdkVersion(Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getApplicationContext().getApplicationInfo().compileSdkVersion;
            return String.valueOf(i);
        }
        return CreateTicketViewModelKt.EmailId;
    }

    public static final Map<String, String> getLateAttrs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LoggerKt.logDetailed(TAG, "getLateAttrs called");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AnalyticsConstantsKt.KEY_APP_UNIQUE_ID, getPackageName(context));
        linkedHashMap.put("device_id", getDeviceId(context));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_VOICE_OVER_ENABLED, String.valueOf(isTalkBackEnabled(context)));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_TEXT_SIZE, String.valueOf(getFontScale(context)));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_MIN_SDK_VERSION, getMinSdkVersion(context));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_TARGET_SDK_VERSION, getTargetSdkVersion(context));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_COMPILE_SDK_VERSION, getCompileSdkVersion(context));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_IS_GOOGLE_SERVICES_AVAILABLE, String.valueOf(isGooglePlayServicesAvailable(context)));
        return linkedHashMap;
    }

    public static final String getPreviewWarningMsg(Errors errors, Integer num) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Map<String, String> ivs = errors.getIvs();
        String str = ivs.get(String.valueOf(num));
        if (str != null) {
            return str;
        }
        String str2 = ivs.get("default");
        return str2 == null ? "" : str2;
    }

    public static final Pair<String, String>[] getScannedEventAttrs(ScanType scanType, long j, Output output) {
        Object obj;
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(output, "output");
        List mutableListOf = CollectionsKt.mutableListOf(new Pair(AnalyticsConstantsKt.CAPTURE_DURATION, String.valueOf(j)));
        if (scanType == ScanType.LICENSE_BACK && output.getCaptureType() == CaptureType.AUTO) {
            Iterator<T> it = output.getMetrics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((DetectionMetric) obj).getDetectionType() == DetectionType.BARCODE) {
                    break;
                }
            }
            DetectionMetric detectionMetric = (DetectionMetric) obj;
            mutableListOf.add(new Pair("type", detectionMetric != null && detectionMetric.getCheckPassed() ? AnalyticsConstantsKt.BARCODE_CHECK_INCLUDED : AnalyticsConstantsKt.BARCODE_CHECK_NOT_INCLUDED));
        }
        return (Pair[]) mutableListOf.toArray(new Pair[0]);
    }

    public static final String getCornerDetectionFailedText(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        return scanType == ScanType.PASSPORT ? newLabels.getAlignDocumentPassport() : newLabels.getAlignDocumentId();
    }

    public static final String getDocumentTooCloseMsg(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        return scanType == ScanType.PASSPORT ? newLabels.getPassportTooClose() : newLabels.getIdTooClose();
    }

    public static final Map<String, String> getTrackingPropertyMap(List<TrackingProperty> trackingProperties) {
        Intrinsics.checkNotNullParameter(trackingProperties, "trackingProperties");
        LoggerKt.logDetailed(TAG, "updateTrackingProperties");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!trackingProperties.isEmpty()) {
            for (TrackingProperty trackingProperty : trackingProperties) {
                linkedHashMap.put(trackingProperty.getKey(), trackingProperty.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final boolean isUploadUrlAppendRequired(Screen screen, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(screen, "screen");
        LoggerKt.logDetailed(TAG, "isUploadUrlAppendRequired called");
        return (screen.getIndex() == 1 && ((str2 = str) == null || StringsKt.isBlank(str2))) ? false : true;
    }

    public static final String appendUploadUrl(String docUploadUuid) {
        Intrinsics.checkNotNullParameter(docUploadUuid, "docUploadUuid");
        LoggerKt.logDetailed(TAG, "appendUploadUrl called");
        return ApiConstant.UPLOAD_URL + File.separator + docUploadUuid;
    }

    public static final GuidingBoxConstraintData getGuidingBoxData(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        LoggerKt.logDetailed(TAG, "getGuidingBoxData called");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return new GuidingBoxConstraintData(ConstantsKt.SELFIE_GUIDING_BOX_RATIO, R.drawable.socure_white_selfie_bounding_box, 0, Float.valueOf(0.55f));
        }
        if (i == 2) {
            return new GuidingBoxConstraintData(ConstantsKt.PASSPORT_GUIDING_BOX_RATIO, R.drawable.socure_guiding_box_thin, -1, null, 8, null);
        }
        if (i == 3 || i == 4) {
            return new GuidingBoxConstraintData(ConstantsKt.LICENSE_GUIDING_BOX_RATIO, R.drawable.socure_guiding_box_thin, -1, null, 8, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List<SelfieRange> getDefaultSelfieRangeValues() {
        return CollectionsKt.listOf((Object[]) new SelfieRange[]{new SelfieRange(SelfieRangeType.PITCH, getDefaultSelfieAngleMinMax()), new SelfieRange(SelfieRangeType.ROLL, getDefaultSelfieAngleMinMax()), new SelfieRange(SelfieRangeType.YAW, getDefaultSelfieAngleMinMax())});
    }

    public static final MinMax getDefaultSelfieAngleMinMax() {
        return new MinMax(-9, 9);
    }

    public static final IntRange getSelfieRange(SelfieRange selfieRange) {
        if (selfieRange != null) {
            return new IntRange(selfieRange.getMinMax().getMin(), selfieRange.getMinMax().getMax());
        }
        return new IntRange(-9, 9);
    }

    public static final boolean isGooglePlayServicesAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static final Map<String, String> getFlowResponseMap(Websdk websdk, Config config) {
        Intrinsics.checkNotNullParameter(websdk, "websdk");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("timeout", String.valueOf(websdk.getManualCaptureTimeout().getValue()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_CAMERA_PRIMING_ENABLED, String.valueOf(websdk.getShowCameraPriming().getValue()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_ENABLED, String.valueOf(websdk.getEnableSelfie().getValue()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_PERSIST_CAPTURE_STATE, String.valueOf(websdk.getPersistCaptureState().getValue()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_PITCH_MIN, String.valueOf(websdk.getSelfiePitch().getMin()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_PITCH_MAX, String.valueOf(websdk.getSelfiePitch().getMax()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_ROLL_MIN, String.valueOf(websdk.getSelfieRoll().getMin()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_ROLL_MAX, String.valueOf(websdk.getSelfieRoll().getMax()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_YAW_MIN, String.valueOf(websdk.getSelfieYaw().getMin()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_SELFIE_YAW_MAX, String.valueOf(websdk.getSelfieYaw().getMax()));
        linkedHashMap.put(AnalyticsConstantsKt.KEY_MAX_ATTEMPT_COUNT, String.valueOf(getAttemptCount(config, websdk, 3)));
        return linkedHashMap;
    }

    public static final List<SelfieRange> getConfigSelfieRangeValues(Websdk websdk) {
        Intrinsics.checkNotNullParameter(websdk, "websdk");
        return CollectionsKt.listOf((Object[]) new SelfieRange[]{new SelfieRange(SelfieRangeType.PITCH, websdk.getSelfiePitch()), new SelfieRange(SelfieRangeType.ROLL, websdk.getSelfieRoll()), new SelfieRange(SelfieRangeType.YAW, websdk.getSelfieYaw())});
    }
}
