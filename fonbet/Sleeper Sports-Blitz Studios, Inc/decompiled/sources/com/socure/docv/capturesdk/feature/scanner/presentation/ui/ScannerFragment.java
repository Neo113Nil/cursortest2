package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.common.analytics.model.EventData;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.analytics.model.MetricCaptureData;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.upload.EventUpdater;
import com.socure.docv.capturesdk.common.upload.ImageUploadResponse;
import com.socure.docv.capturesdk.common.upload.UploadIvsResponse;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt;
import com.socure.docv.capturesdk.common.utils.CameraManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.utils.FeedManager;
import com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement;
import com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages;
import com.socure.docv.capturesdk.common.utils.GetHelpViewData;
import com.socure.docv.capturesdk.common.utils.HelpPreviewUtils;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.PreviewDataInputGenerator;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.common.view.ActionCallback;
import com.socure.docv.capturesdk.common.view.GraphicOverlay;
import com.socure.docv.capturesdk.common.view.model.BsCallbackType;
import com.socure.docv.capturesdk.common.view.model.Button;
import com.socure.docv.capturesdk.core.extractor.FinalOutputCallback;
import com.socure.docv.capturesdk.core.extractor.FinalOutputExtractor;
import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.FinalOutputProcessData;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.core.storage.CacheKt;
import com.socure.docv.capturesdk.databinding.BottomSheetViewBinding;
import com.socure.docv.capturesdk.databinding.FragmentScannerSocureBinding;
import com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent;
import com.socure.docv.capturesdk.feature.base.presentation.ui.BaseFragment;
import com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.feature.preview.helper.DbgImgExporter;
import com.socure.docv.capturesdk.feature.scanner.data.Container;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.ErrorScenario;
import com.socure.docv.capturesdk.feature.scanner.data.FrameGenerator;
import com.socure.docv.capturesdk.feature.scanner.data.FrameGeneratorCallback;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.data.ImageMode;
import com.socure.docv.capturesdk.feature.scanner.data.TimeOutKeeper;
import com.socure.docv.capturesdk.feature.scanner.data.VideoManager;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$eventUpdater$2;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerVMFactory;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel;
import com.socure.docv.capturesdk.models.ButtonStyleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ScannerFragment.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\u001b\u001e\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\b2\b\b\u0002\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020J2\u0006\u0010O\u001a\u00020\bH\u0002J\b\u0010P\u001a\u00020JH\u0002J\b\u0010Q\u001a\u00020JH\u0002J\b\u0010R\u001a\u00020JH\u0002J\u0010\u0010S\u001a\u00020J2\u0006\u0010T\u001a\u00020\bH\u0002J\u0010\u0010U\u001a\u00020J2\u0006\u0010T\u001a\u00020\bH\u0002J\b\u0010V\u001a\u00020JH\u0002J\b\u0010W\u001a\u00020JH\u0002J\u0010\u0010X\u001a\u00020J2\u0006\u0010Y\u001a\u00020\bH\u0002J\u0010\u0010Z\u001a\u00020'2\u0006\u0010[\u001a\u00020MH\u0002J\b\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020\bH&J\b\u0010_\u001a\u00020\bH&J\b\u0010`\u001a\u00020\bH&J\b\u0010a\u001a\u00020\bH&J\b\u0010b\u001a\u00020\bH&J\b\u0010c\u001a\u00020\bH&J\b\u0010d\u001a\u00020\bH&J\b\u0010e\u001a\u00020\bH&J\b\u0010f\u001a\u00020\bH&J\b\u0010g\u001a\u00020\bH&J\b\u0010h\u001a\u00020\bH&J\b\u0010i\u001a\u00020\bH&J\b\u0010j\u001a\u00020\bH&J\b\u0010k\u001a\u00020\bH&J\u0010\u0010l\u001a\u00020\b2\u0006\u0010m\u001a\u00020nH&J\b\u0010o\u001a\u00020pH'J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00020\b0rH&J\b\u0010s\u001a\u00020\bH&J\b\u0010t\u001a\u00020\bH&J\u0010\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020MH&J\b\u0010w\u001a\u00020\bH&J\b\u0010x\u001a\u00020\bH&J\u0014\u0010y\u001a\u00020\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010{H&J\b\u0010|\u001a\u00020\bH&J\b\u0010}\u001a\u00020\bH&J\b\u0010~\u001a\u00020\bH&J\b\u0010\u007f\u001a\u00020\bH&J\t\u0010\u0080\u0001\u001a\u00020\bH&J\t\u0010\u0081\u0001\u001a\u00020\bH&J\t\u0010\u0082\u0001\u001a\u00020\bH&J\t\u0010\u0083\u0001\u001a\u00020\bH&J\t\u0010\u0084\u0001\u001a\u00020\bH&J\t\u0010\u0085\u0001\u001a\u00020\bH&J\t\u0010\u0086\u0001\u001a\u00020\bH&J\t\u0010\u0087\u0001\u001a\u00020\bH&J\t\u0010\u0088\u0001\u001a\u00020\bH&J\t\u0010\u0089\u0001\u001a\u00020\bH&J\u0011\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010m\u001a\u00020nH&J\t\u0010\u008b\u0001\u001a\u00020\bH&J\t\u0010\u008c\u0001\u001a\u00020\bH&J\t\u0010\u008d\u0001\u001a\u00020\bH&J\t\u0010\u008e\u0001\u001a\u00020\bH&J\t\u0010\u008f\u0001\u001a\u00020JH\u0002J\t\u0010\u0090\u0001\u001a\u00020JH\u0002J\t\u0010\u0091\u0001\u001a\u00020JH\u0002J\t\u0010\u0092\u0001\u001a\u00020MH\u0004J\t\u0010\u0093\u0001\u001a\u00020JH\u0002J,\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016J\t\u0010\u009c\u0001\u001a\u00020JH\u0016J\t\u0010\u009d\u0001\u001a\u00020JH\u0016J\t\u0010\u009e\u0001\u001a\u00020JH\u0016J\u001f\u0010\u009f\u0001\u001a\u00020J2\b\u0010 \u0001\u001a\u00030\u0095\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016J\u0012\u0010¡\u0001\u001a\u00020J2\u0007\u0010¢\u0001\u001a\u00020\u0006H\u0002J\t\u0010£\u0001\u001a\u00020JH\u0002J\u0011\u0010¤\u0001\u001a\u00020J2\u0006\u0010T\u001a\u00020\bH\u0002J\u001d\u0010¥\u0001\u001a\u00020J2\b\u0010¦\u0001\u001a\u00030§\u00012\b\u0010¨\u0001\u001a\u00030©\u0001H\u0002J\u0013\u0010ª\u0001\u001a\u00020J2\b\u0010¦\u0001\u001a\u00030§\u0001H\u0002J\u0011\u0010«\u0001\u001a\u00020J2\u0006\u0010T\u001a\u00020\bH\u0002J\t\u0010¬\u0001\u001a\u00020JH\u0002J\u0011\u0010\u00ad\u0001\u001a\u00020J2\u0006\u0010T\u001a\u00020\bH\u0002J\u0011\u0010®\u0001\u001a\u00020J2\u0006\u0010T\u001a\u00020\bH\u0002J\u0012\u0010¯\u0001\u001a\u00020J2\u0007\u0010°\u0001\u001a\u00020MH\u0002J\u001b\u0010±\u0001\u001a\u00020J2\u0007\u0010²\u0001\u001a\u00020\u00062\u0007\u0010°\u0001\u001a\u00020MH\u0002J\t\u0010³\u0001\u001a\u00020JH\u0002J\t\u0010´\u0001\u001a\u00020JH\u0002J\t\u0010µ\u0001\u001a\u00020JH\u0002J\t\u0010¶\u0001\u001a\u00020JH\u0002J\t\u0010·\u0001\u001a\u00020JH\u0002J\t\u0010¸\u0001\u001a\u00020JH\u0002J\t\u0010¹\u0001\u001a\u00020JH\u0002J\t\u0010º\u0001\u001a\u00020JH\u0002J\t\u0010»\u0001\u001a\u00020JH\u0002J\t\u0010¼\u0001\u001a\u00020JH\u0002J\u0011\u0010½\u0001\u001a\u00020J2\u0006\u0010[\u001a\u00020MH\u0002J\u0012\u0010¾\u0001\u001a\u00020J2\u0007\u0010¿\u0001\u001a\u00020\u0006H\u0002J\t\u0010À\u0001\u001a\u00020JH\u0002J\t\u0010Á\u0001\u001a\u00020JH\u0002J\t\u0010Â\u0001\u001a\u00020JH\u0002J\t\u0010Ã\u0001\u001a\u00020JH\u0002J\u0012\u0010Ä\u0001\u001a\u00020J2\u0007\u0010Å\u0001\u001a\u00020MH\u0002J\u0015\u0010Æ\u0001\u001a\u00020J2\n\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u0001H\u0002J\t\u0010É\u0001\u001a\u00020JH\u0002J\u0011\u0010Ê\u0001\u001a\u00020J2\u0006\u00107\u001a\u00020\bH\u0002J\u0011\u0010Ë\u0001\u001a\u00020J2\u0006\u00109\u001a\u00020:H\u0002J\t\u0010Ì\u0001\u001a\u00020JH\u0002J\t\u0010Í\u0001\u001a\u00020JH\u0002J\t\u0010Î\u0001\u001a\u00020JH\u0002J\u0011\u0010Ï\u0001\u001a\u00020J2\u0006\u0010[\u001a\u00020MH\u0002JH\u0010Ð\u0001\u001a\u00020J2\u0006\u00109\u001a\u00020:2\b\u0010¦\u0001\u001a\u00030§\u00012\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ò\u00012\u001f\u0010Ó\u0001\u001a\u001a\u0012\u0005\u0012\u00030Õ\u0001\u0018\u00010Ô\u0001j\f\u0012\u0005\u0012\u00030Õ\u0001\u0018\u0001`Ö\u0001H\u0002J\t\u0010×\u0001\u001a\u00020JH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR)\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b)\u0010*R\u0010\u0010-\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020'0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00101\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0015\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\nR\u0014\u00107\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\nR\u0014\u00109\u001a\u00020:8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0015\u001a\u0004\bC\u0010DR\u0010\u0010F\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082.¢\u0006\u0002\n\u0000¨\u0006Ø\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment;", "Lcom/socure/docv/capturesdk/feature/base/presentation/ui/BaseFragment;", "()V", "_binding", "Lcom/socure/docv/capturesdk/databinding/FragmentScannerSocureBinding;", "announcementDelayTimeStamp", "", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "binding", "getBinding", "()Lcom/socure/docv/capturesdk/databinding/FragmentScannerSocureBinding;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior$delegate", "Lkotlin/Lazy;", "component", "Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", "getComponent", "()Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", "detectionWarningMessages", "com/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment$detectionWarningMessages$1", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment$detectionWarningMessages$1;", "eventUpdater", "com/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment$eventUpdater$2$1", "getEventUpdater", "()Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment$eventUpdater$2$1;", "eventUpdater$delegate", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "feedManager", "Lcom/socure/docv/capturesdk/common/utils/FeedManager;", "frameProviderDelayJob", "Lkotlinx/coroutines/Job;", "helpGraphicJob", "getHelpGraphicJob$delegate", "(Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerFragment;)Ljava/lang/Object;", "getHelpGraphicJob", "()Lkotlinx/coroutines/Job;", "lastFailure", "lazyHelpGraphicJob", "Lkotlin/Lazy;", "manualButtonVisibilityJob", "manualTimeOut", "getManualTimeOut", "()J", "manualTimeOut$delegate", "poweredByLabel", "getPoweredByLabel", "primaryColor", "getPrimaryColor", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "getScanType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionModel", "()Lcom/socure/docv/capturesdk/models/StartSessionModel;", "timeOutKeeper", "Lcom/socure/docv/capturesdk/feature/scanner/data/TimeOutKeeper;", "getTimeOutKeeper", "()Lcom/socure/docv/capturesdk/feature/scanner/data/TimeOutKeeper;", "timeOutKeeper$delegate", "uploadDelayMsgJob", "viewModel", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/ScannerViewModel;", "announceAccessibilityMessage", "", "msg", "interrupt", "", "cameraFailed", DiscardedEvent.JsonKeys.REASON, "clearFeed", "clearFeedManager", "clearHelpGraphic", "clearManualButtonJob", "cause", "clearUploadDelayMsgJob", "clearViews", "clearVmCallbacks", "closeClicked", AnalyticsConstantsKt.KEY_SCREEN, "createHelpGraphicJob", "isVideoFeed", "createViewModelFactory", "Landroidx/lifecycle/ViewModelProvider;", "getAdjustLightingMessage", "getBackToScanning", "getBarcodeNotFoundMessage", "getBlurMessage", "getCaptureSuccess", "getCaptureTitleText", "getCardNotFound", "getCardTooClose", "getCompletionTitle", "getConfirmationTitleText", "getContBtnText", "getContinuePreviewMessage", "getCornerDetectionFailedMessage", "getDocumentTooClose", "getGuidingMessage", "detectionCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "getHelpBannerImage", "", "getHelpInstruction", "", "getHelpTitleText", "getIdLookingGood", "getInitialAnnouncement", "noAnalysisMode", "getKeepSteadyMessage", "getLowBrightnessMessage", "getManualType", "getManualWarningMessage", "Lkotlin/Pair;", "getModuleId", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneLeft", "getMovePhoneRight", "getMovePhoneUp", "getPreviewConfirmationText", "getPreviewProgressTitle", "getPreviewWarningMessage", "getProgressAnimationText", "getProgressCompleteMessage", "getRetakeBtnText", "getRetryInvalidImage", "getScannerHelpText", "getSelfieAccessibilityAnnouncementMessage", "getSubmitImageForValidation", "getToGetStarted", "getTryPhotoManually", "getUploadAccessibilityMessage", "handleImageUploadStatus", "hideDebugImage", "hideManualCaptureViews", "isModeManual", "launchUploadDelayMsg", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "passViewDimsWDelay", "delay", "passingViewDimensions", "pauseManualButtonVisibilityJob", "proceedToPreview", AgentOptions.OUTPUT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "finalOutputProcessData", "Lcom/socure/docv/capturesdk/core/processor/model/FinalOutputProcessData;", "processedToNext", "resetFrameProviderJob", "resetGuidingViews", "resetManualButtonVisibilityJob", "resetScanner", "setFrameProvider", "videoFeed", "setFrameProviderWithDelay", "delayTime", "setUpCustomUi", "setUpFrameFeed", "setUpPreviewCallback", "setUpScanDocTypeUI", "setupCameraViews", "setupCaptureErrorCallback", "setupClickListeners", "setupDebugImageCallback", "setupDetectionCallbacks", "setupFeedViews", "setupFpAndManualViewTimers", "setupManualButtonVisibility", "setupDelay", "setupOutputCallback", "setupScanner", "setupVideoFeedViews", "setupViews", "showBlocker", "show", "showDebugImage", "bitmap", "Landroid/graphics/Bitmap;", "showHelpView", "showImageUploadProgress", "showManualAlertMsg", "showManualCaptureViews", "startFrameGeneration", "stopFrameGeneration", "streamingStarted", "triggerUpload", "data", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "faces", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "Lkotlin/collections/ArrayList;", "unRegisteringPreviewCallback", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ScannerFragment extends BaseFragment {
    private FragmentScannerSocureBinding _binding;
    private long announcementDelayTimeStamp;

    /* renamed from: bottomSheetBehavior$delegate, reason: from kotlin metadata */
    private final Lazy bottomSheetBehavior;
    private final ScannerFragment$detectionWarningMessages$1 detectionWarningMessages;

    /* renamed from: eventUpdater$delegate, reason: from kotlin metadata */
    private final Lazy eventUpdater;
    private final CoroutineExceptionHandler exceptionHandler;
    private FeedManager feedManager;
    private Job frameProviderDelayJob;
    private String lastFailure;
    private final Lazy<Job> lazyHelpGraphicJob;
    private Job manualButtonVisibilityJob;

    /* renamed from: manualTimeOut$delegate, reason: from kotlin metadata */
    private final Lazy manualTimeOut;

    /* renamed from: timeOutKeeper$delegate, reason: from kotlin metadata */
    private final Lazy timeOutKeeper;
    private Job uploadDelayMsgJob;
    private ScannerViewModel viewModel;

    public abstract String getAdjustLightingMessage();

    public abstract String getBackToScanning();

    public abstract String getBarcodeNotFoundMessage();

    public abstract String getBlurMessage();

    public abstract String getCaptureSuccess();

    public abstract String getCaptureTitleText();

    public abstract String getCardNotFound();

    public abstract String getCardTooClose();

    public abstract String getCompletionTitle();

    public abstract ScannerFragmentComponent getComponent();

    public abstract String getConfirmationTitleText();

    public abstract String getContBtnText();

    public abstract String getContinuePreviewMessage();

    public abstract String getCornerDetectionFailedMessage();

    public abstract String getDocumentTooClose();

    public abstract String getGuidingMessage(DetectionCallback detectionCallback);

    public abstract int getHelpBannerImage();

    public abstract List<String> getHelpInstruction();

    public abstract String getHelpTitleText();

    public abstract String getIdLookingGood();

    public abstract String getInitialAnnouncement(boolean noAnalysisMode);

    public abstract String getKeepSteadyMessage();

    public abstract String getLowBrightnessMessage();

    public abstract Pair<String, String> getManualWarningMessage();

    public abstract String getModuleId();

    public abstract String getMovePhoneBack();

    public abstract String getMovePhoneDown();

    public abstract String getMovePhoneLeft();

    public abstract String getMovePhoneRight();

    public abstract String getMovePhoneUp();

    public abstract String getPreviewConfirmationText();

    public abstract String getPreviewProgressTitle();

    public abstract String getPreviewWarningMessage();

    public abstract String getProgressAnimationText();

    public abstract String getProgressCompleteMessage();

    public abstract String getRetakeBtnText();

    public abstract String getRetryInvalidImage();

    public abstract String getScannerHelpText();

    public abstract String getSelfieAccessibilityAnnouncementMessage(DetectionCallback detectionCallback);

    public abstract String getSubmitImageForValidation();

    public abstract String getToGetStarted();

    public abstract String getTryPhotoManually();

    public abstract String getUploadAccessibilityMessage();

    /* JADX WARN: Type inference failed for: r0v16, types: [com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$detectionWarningMessages$1] */
    public ScannerFragment() {
        super("SDLT_SF");
        this.lazyHelpGraphicJob = LazyKt.lazy(new Function0<Job>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$lazyHelpGraphicJob$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Job invoke() {
                Job createHelpGraphicJob;
                createHelpGraphicJob = ScannerFragment.this.createHelpGraphicJob(Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease());
                return createHelpGraphicJob;
            }
        });
        this.manualTimeOut = LazyKt.lazy(new Function0<Long>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$manualTimeOut$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(ScannerFragment.this.isModeManual() ? 0L : SessionManager.INSTANCE.getManualCaptureTimeout());
            }
        });
        this.timeOutKeeper = LazyKt.lazy(new Function0<TimeOutKeeper>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$timeOutKeeper$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TimeOutKeeper invoke() {
                long manualTimeOut;
                manualTimeOut = ScannerFragment.this.getManualTimeOut();
                return new TimeOutKeeper(manualTimeOut + 2000);
            }
        });
        this.bottomSheetBehavior = LazyKt.lazy(new Function0<BottomSheetBehavior<ConstraintLayout>>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$bottomSheetBehavior$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BottomSheetBehavior<ConstraintLayout> invoke() {
                FragmentScannerSocureBinding binding;
                binding = ScannerFragment.this.getBinding();
                return BottomSheetBehavior.from(binding.bsContainer.rootBottomSheet);
            }
        });
        this.eventUpdater = LazyKt.lazy(new Function0<ScannerFragment$eventUpdater$2.AnonymousClass1>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$eventUpdater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$eventUpdater$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public final AnonymousClass1 invoke() {
                final ScannerFragment scannerFragment = ScannerFragment.this;
                return new EventUpdater() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$eventUpdater$2.1
                    @Override // com.socure.docv.capturesdk.common.upload.EventUpdater
                    public void triggerEvent(EventData eventData) {
                        Intrinsics.checkNotNullParameter(eventData, "eventData");
                        LoggerKt.logDetailed("SDLT_SF", "triggerEvent called- eventDataName: " + eventData.getEventName());
                        ScannerFragment scannerFragment2 = ScannerFragment.this;
                        String eventName = eventData.getEventName();
                        Pair[] pairArr = (Pair[]) eventData.getEventAttrList().toArray(new Pair[0]);
                        scannerFragment2.sendEvent(eventName, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    }
                };
            }
        });
        this.detectionWarningMessages = new GetDetectionWarningMessages() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$detectionWarningMessages$1
            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getLowBrightnessMessage() {
                return ScannerFragment.this.getLowBrightnessMessage();
            }

            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getBlurMessage() {
                return ScannerFragment.this.getBlurMessage();
            }

            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getAdjustLightingMessage() {
                return ScannerFragment.this.getAdjustLightingMessage();
            }

            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getCornerDetectionFailedMessage() {
                return ScannerFragment.this.getCornerDetectionFailedMessage();
            }

            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getKeepSteadyMessage() {
                return ScannerFragment.this.getKeepSteadyMessage();
            }

            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getGuidingMessage(DetectionCallback detectionCallback) {
                Intrinsics.checkNotNullParameter(detectionCallback, "detectionCallback");
                return ScannerFragment.this.getGuidingMessage(detectionCallback);
            }

            @Override // com.socure.docv.capturesdk.common.utils.GetDetectionWarningMessages
            public String getBarcodeNotFoundMessage() {
                return ScannerFragment.this.getBarcodeNotFoundMessage();
            }
        };
        this.exceptionHandler = new ScannerFragment$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentScannerSocureBinding getBinding() {
        FragmentScannerSocureBinding fragmentScannerSocureBinding = this._binding;
        Intrinsics.checkNotNull(fragmentScannerSocureBinding);
        return fragmentScannerSocureBinding;
    }

    private final Job getHelpGraphicJob() {
        return this.lazyHelpGraphicJob.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getManualTimeOut() {
        return ((Number) this.manualTimeOut.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeOutKeeper getTimeOutKeeper() {
        return (TimeOutKeeper) this.timeOutKeeper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BottomSheetBehavior<ConstraintLayout> getBottomSheetBehavior() {
        return (BottomSheetBehavior) this.bottomSheetBehavior.getValue();
    }

    private final ScannerFragment$eventUpdater$2.AnonymousClass1 getEventUpdater() {
        return (ScannerFragment$eventUpdater$2.AnonymousClass1) this.eventUpdater.getValue();
    }

    protected final ScanType getScanType() {
        return getComponent().getScanType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartSessionModel getStartSessionModel() {
        return (StartSessionModel) CacheKt.require(getComponent().getStartSessionCache());
    }

    private final String getBackgroundColor() {
        return getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getBackgroundColor();
    }

    private final String getPrimaryColor() {
        return getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getColor();
    }

    private final String getPoweredByLabel() {
        return getStartSessionModel().getGlobalConfig().getCommonLabels().getPoweredBy();
    }

    private final ViewModelProvider createViewModelFactory() {
        return new ViewModelProvider(this, new ScannerVMFactory(getComponent(), getScanType(), getComponent().getScannerShim()));
    }

    private final void closeClicked(String screen) {
        if (getDocSelection() != null) {
            sendEvent(Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(AnalyticsConstantsKt.CAPTURE_PAGE_CLOSE, getScanType(), getDocSelection()), new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, screen), getScrTimeArg());
        }
        sendEvent("error", new Pair<>("type", AnalyticsConstantsKt.ERR_DOCUMENT_SCAN_CANCEL), new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, screen), new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()));
        getOrchestratorViewModel().closeClicked();
    }

    protected final boolean isModeManual() {
        return getScanType() == ScanType.SELFIE || noAnalysisMode();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LoggerKt.logD("SDLT_SF", "onCreateView called with scanType: " + getScanType());
        this.viewModel = (ScannerViewModel) createViewModelFactory().get(ScannerViewModel.class);
        this._binding = FragmentScannerSocureBinding.inflate(inflater, container, false);
        Guideline guideline = getBinding().glTop;
        Intrinsics.checkNotNullExpressionValue(guideline, "binding.glTop");
        setGuidelineViewTopMargin(guideline);
        CoordinatorLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBottomSheetBehavior().setDraggable(false);
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = getBottomSheetBehavior();
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
        ExtensionsKt.hide(bottomSheetBehavior);
        getBottomSheetBehavior().setUpdateImportantForAccessibilityOnSiblings(true);
        LoggerKt.logD("SDLT_SF", "onViewCreated");
        sendEvent(Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(Utils.INSTANCE.isSelfie$capturesdk_productionRelease(getScanType()) ? AnalyticsConstantsKt.SELFIE_INITIATED : AnalyticsConstantsKt.SCAN_INITIATED, getScanType(), getDocSelection()), new Pair[0]);
        setupViews();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) {
                LoggerKt.logD("SDLT_SF", "setupFeeds - Checking permission");
                requestCameraPermissionWithCallback(activity, UtilsKt.getCurrentScreenForScanner(getScanType()).getScreenType(), new Function1<String, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$onViewCreated$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String eventTitle) {
                        Intrinsics.checkNotNullParameter(eventTitle, "eventTitle");
                        LoggerKt.logD("SDLT_SF", "event triggered " + eventTitle);
                        ScannerFragment.this.sendEvent(eventTitle, new Pair[0]);
                    }
                });
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LoggerKt.logE$default("SDLT_SF", "setupFeeds - activity is null", null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LoggerKt.logD("SDLT_SF", "onDestroyView");
        resetManualButtonVisibilityJob("view destroyed");
        clearViews();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LoggerKt.logD("SDLT_SF", "onResume");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getScannerDurationStore().setCaptureStart();
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = getBottomSheetBehavior();
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
        if (ExtensionsKt.isNotVisible(bottomSheetBehavior)) {
            setupScanner();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LoggerKt.logD("SDLT_SF", "onPause");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getScannerDurationStore().saveCaptureDurationOnPause();
        resetScanner("on pause");
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupScanner() {
        Unit unit;
        LoggerKt.logD("SDLT_SF", "setupScanner");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) {
                Utils utils = Utils.INSTANCE;
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "it.applicationContext");
                if (!utils.hasCameraPermission(applicationContext)) {
                    LoggerKt.logD("SDLT_SF", "setupScanner - permission grant awaited");
                    unit = Unit.INSTANCE;
                }
            }
            LoggerKt.logD("SDLT_SF", "setupScanner - permission granted or automation - setting up frame feed");
            setUpFrameFeed();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LoggerKt.logE$default("SDLT_SF", "setupScanner - activity is null", null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void streamingStarted(boolean isVideoFeed) {
        LoggerKt.logD("SDLT_SF", "streamingStarted called - isVideoFeed: " + isVideoFeed);
        passViewDimsWDelay(isVideoFeed ? 500L : 0L);
        if (!getHelpGraphicJob().isActive() && !getHelpGraphicJob().isCompleted()) {
            getBinding().scannerGraphic.setVisibility(0);
            LoggerKt.logI("SDLT_SF", "helpGraphicJob started: " + getHelpGraphicJob().start());
            return;
        }
        setupFpAndManualViewTimers(isVideoFeed);
        LoggerKt.logD("SDLT_SF", "helpGraphicJob is isActive: " + getHelpGraphicJob().isActive() + " | isCompleted: " + getHelpGraphicJob().isCompleted() + " | isCancelled: " + getHelpGraphicJob().isCancelled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showManualCaptureViews() {
        if (!Utils.INSTANCE.isSelfie$capturesdk_productionRelease(getScanType())) {
            getBinding().graphicOverlay.clear();
        }
        getBinding().docOverView.showGuidingBox();
        getBinding().cblView.showManualButton();
    }

    private final void hideManualCaptureViews() {
        getBinding().docOverView.hideGuidingBox();
        getBinding().cblView.hideManualButton();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setUpFrameFeed() {
        CameraManager cameraManager;
        LoggerKt.logD("SDLT_SF", "calling setUpFrameFeed");
        ScannerViewModel scannerViewModel = null;
        if (Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) {
            Utils utils = Utils.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            if (!StringsKt.isBlank(utils.getVideoPath$capturesdk_productionRelease(requireContext, getScanType()))) {
                ScannerViewModel scannerViewModel2 = this.viewModel;
                if (scannerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    scannerViewModel = scannerViewModel2;
                }
                boolean manualCaptureOnly = scannerViewModel.getManualCaptureOnly();
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                FragmentActivity fragmentActivity = requireActivity;
                VideoView videoView = getBinding().imgPreview;
                Intrinsics.checkNotNullExpressionValue(videoView, "binding.imgPreview");
                Utils utils2 = Utils.INSTANCE;
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                cameraManager = new VideoManager(new FrameGenerator(manualCaptureOnly, fragmentActivity, videoView, utils2.getVideoPath$capturesdk_productionRelease(requireContext2, getScanType()), new FrameGeneratorCallback() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setUpFrameFeed$1
                    @Override // com.socure.docv.capturesdk.feature.scanner.data.FrameGeneratorCallback
                    public void onStreaming() {
                        LoggerKt.logD("TAG", "onStreaming called for video - not doing anything");
                    }

                    @Override // com.socure.docv.capturesdk.feature.scanner.data.FrameGeneratorCallback
                    public void onCompletion() {
                        ScannerViewModel scannerViewModel3;
                        if (Utils.INSTANCE.isSelfie$capturesdk_productionRelease(ScannerFragment.this.getScanType()) && Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) {
                            scannerViewModel3 = ScannerFragment.this.viewModel;
                            if (scannerViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                scannerViewModel3 = null;
                            }
                            scannerViewModel3.performManualCapture();
                        }
                    }
                }), new ArrayList());
                this.feedManager = cameraManager;
                if (!(cameraManager instanceof CameraManager)) {
                    Intrinsics.checkNotNull(cameraManager, "null cannot be cast to non-null type com.socure.docv.capturesdk.common.utils.CameraManager");
                    ((CameraManager) cameraManager).setCamera(new Function2<Boolean, Exception, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setUpFrameFeed$3
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Exception exc) {
                            invoke(bool.booleanValue(), exc);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z, Exception exc) {
                            if (!z) {
                                LoggerKt.logE("SDLT_SF", "Use case binding failed", exc);
                                ScannerFragment scannerFragment = ScannerFragment.this;
                                String localizedMessage = exc != null ? exc.getLocalizedMessage() : null;
                                if (localizedMessage == null) {
                                    localizedMessage = "Camera Binding Failed With Empty Exception Message";
                                }
                                scannerFragment.cameraFailed(localizedMessage);
                                return;
                            }
                            LoggerKt.logI("SDLT_SF", "cameraStarted callback received");
                        }
                    });
                    return;
                } else {
                    if (cameraManager instanceof VideoManager) {
                        LoggerKt.logD("SDLT_SF", "Calling streamingStarted on video");
                        streamingStarted(true);
                        return;
                    }
                    return;
                }
            }
        }
        ScannerViewModel scannerViewModel3 = null;
        ScannerViewModel scannerViewModel4 = this.viewModel;
        if (scannerViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scannerViewModel3 = scannerViewModel4;
        }
        boolean manualCaptureOnly2 = scannerViewModel3.getManualCaptureOnly();
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext()");
        PreviewView previewView = getBinding().preview;
        Intrinsics.checkNotNullExpressionValue(previewView, "binding.preview");
        cameraManager = new CameraManager(manualCaptureOnly2, requireContext3, previewView, this, Utils.INSTANCE.getLensFacing$capturesdk_productionRelease(getScanType()), new ArrayList(), new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setUpFrameFeed$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ScannerFragment.this.streamingStarted(false);
            }
        });
        this.feedManager = cameraManager;
        if (!(cameraManager instanceof CameraManager)) {
        }
    }

    private final void clearFeed() {
        LoggerKt.logD("SDLT_SF", "clearFeed");
        stopFrameGeneration();
        clearVmCallbacks();
        clearFeedManager();
        ScannerViewModel scannerViewModel = this.viewModel;
        ScannerViewModel scannerViewModel2 = null;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.clearLiveData();
        ScannerViewModel scannerViewModel3 = this.viewModel;
        if (scannerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scannerViewModel2 = scannerViewModel3;
        }
        scannerViewModel2.resetErrorCount();
    }

    private final void clearFeedManager() {
        LoggerKt.logD("SDLT_SF", "clearFeedManager");
        FeedManager feedManager = this.feedManager;
        if (feedManager != null) {
            feedManager.clear();
        }
        this.feedManager = null;
    }

    private final void setupViews() {
        LoggerKt.logD("SDLT_SF", "setupViews");
        setupFeedViews();
        setUpCustomUi();
        setupClickListeners();
    }

    private final void setUpCustomUi() {
        getBinding().getRoot().setBackgroundColor(Color.parseColor(getBackgroundColor()));
        getBinding().clScannerToolbar.setup(getCaptureTitleText(), getPrimaryColor());
        getBinding().brandView.setUpBrandView(getPoweredByLabel(), R.drawable.socure_logo_white, R.color.socure_white);
        getBinding().bsContainer.bsBrandView.setUpBrandView(getPoweredByLabel(), R.drawable.socure_logo_black, R.color.socure_black);
        getBinding().cblView.setHelpButtonContentDescription(getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getHelpButtonContinueDescription());
        getBinding().cblView.setManualButtonContentDescription(getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getManualButtonContinueDescription());
        getBinding().clScannerToolbar.setCloseContentDescription(getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getCloseButtonContinueDescription());
        getBinding().clScannerToolbar.setBackContentDescription(getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getBackButtonContinueDescription());
    }

    private final void clearViews() {
        LoggerKt.logD("SDLT_SF", "clearViews");
        FeedManager feedManager = this.feedManager;
        if (feedManager != null) {
            feedManager.clear();
        }
        this.feedManager = null;
        this._binding = null;
    }

    private final void setupFeedViews() {
        LoggerKt.logD("SDLT_SF", "setupFeedViews");
        if (Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) {
            setupVideoFeedViews();
        } else {
            setupCameraViews();
        }
    }

    private final void setupVideoFeedViews() {
        LoggerKt.logD("SDLT_SF", "setupVideoFeedViews");
        getBinding().imgPreview.setVisibility(0);
        getBinding().preview.setVisibility(4);
        setUpScanDocTypeUI();
    }

    private final void setUpScanDocTypeUI() {
        LoggerKt.logD("SDLT_SF", "setUpScanDocTypeUI");
        getBinding().docOverView.setGuidingBoxData(UtilsKt.getGuidingBoxData(getScanType()));
        getScannerHelpText();
        getBinding().scannerGraphic.setViews$capturesdk_productionRelease(getScanType(), getToGetStarted(), getScannerHelpText());
    }

    private final void setupCameraViews() {
        LoggerKt.logD("SDLT_SF", "setupCameraViews");
        getBinding().preview.setVisibility(0);
        getBinding().imgPreview.setVisibility(8);
        setUpScanDocTypeUI();
    }

    private final void setupClickListeners() {
        LoggerKt.logD("SDLT_SF", "setupClickListeners");
        getBinding().cblView.setHelpButtonClickListener(new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupClickListeners$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DocSelection docSelection;
                LoggerKt.logD("SDLT_SF", "Disable the analysis when dialog is visible");
                ScannerFragment scannerFragment = ScannerFragment.this;
                Utils utils = Utils.INSTANCE;
                ScanType scanType = ScannerFragment.this.getScanType();
                docSelection = ScannerFragment.this.getDocSelection();
                scannerFragment.sendEvent(utils.replacePlaceholders$capturesdk_productionRelease(AnalyticsConstantsKt.CAPTURE_HELP, scanType, docSelection), new Pair[0]);
                ScannerFragment.this.resetScanner("help shown");
                ScannerFragment.this.showHelpView();
            }
        });
        getBinding().cblView.setManualButtonClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScannerFragment.setupClickListeners$lambda$5(ScannerFragment.this, view);
            }
        });
        getBinding().clScannerToolbar.setCloseListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScannerFragment.setupClickListeners$lambda$6(ScannerFragment.this, view);
            }
        });
        getBinding().clScannerToolbar.hideBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$5(ScannerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LoggerKt.logD("SDLT_SF", "Manual button clicked - calling capture and hiding manual button");
        this$0.showBlocker(true);
        this$0.sendEvent("clicked", new Pair<>("type", AnalyticsConstantsKt.MANUAL_BUTTON), new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()));
        this$0.sendEvent(AnalyticsConstantsKt.AUTO_CAPTURE_FAILED, new Pair<>("type", this$0.getManualType(this$0.lastFailure)), new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()));
        ScannerViewModel scannerViewModel = this$0.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.performManualCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$6(ScannerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeClicked(UtilsKt.getCurrentScreenForScanner(this$0.getScanType()).getScreenType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetScanner(String cause) {
        LoggerKt.logD("SDLT_SF", "resetScanner called - cause: " + cause);
        clearHelpGraphic();
        resetFrameProviderJob(cause);
        clearFeed();
        hideDebugImage();
        getBinding().cilView.hide();
        resetGuidingViews();
        showBlocker(false);
        hideManualCaptureViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHelpView() {
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = getBottomSheetBehavior();
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
        if (ExtensionsKt.isNotVisible(bottomSheetBehavior)) {
            HelpPreviewUtils helpPreviewUtils = HelpPreviewUtils.INSTANCE;
            HelpView helpView = getBinding().bsContainer.helpView;
            Intrinsics.checkNotNullExpressionValue(helpView, "binding.bsContainer.helpView");
            helpPreviewUtils.setVisibilityFocus$capturesdk_productionRelease(helpView, getBinding());
            BottomSheetViewBinding bottomSheetViewBinding = getBinding().bsContainer;
            if (!Intrinsics.areEqual(bottomSheetViewBinding.helpView.getTag(), (Object) true)) {
                bottomSheetViewBinding.helpView.setTag(true);
                bottomSheetViewBinding.helpView.setHelpViewData(HelpPreviewUtils.INSTANCE.getHelpViewUiData$capturesdk_productionRelease(getStartSessionModel(), new GetHelpViewData() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$showHelpView$1$1
                    @Override // com.socure.docv.capturesdk.common.utils.GetHelpViewData
                    public List<String> getHelpInstruction() {
                        return ScannerFragment.this.getHelpInstruction();
                    }

                    @Override // com.socure.docv.capturesdk.common.utils.GetHelpViewData
                    public String getBackToScanning() {
                        return ScannerFragment.this.getBackToScanning();
                    }

                    @Override // com.socure.docv.capturesdk.common.utils.GetHelpViewData
                    public String getHelpTitleText() {
                        return ScannerFragment.this.getHelpTitleText();
                    }

                    @Override // com.socure.docv.capturesdk.common.utils.GetHelpViewData
                    public int getHelpBannerImage() {
                        return ScannerFragment.this.getHelpBannerImage();
                    }
                }), new ActionCallback() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$showHelpView$1$2

                    /* compiled from: ScannerFragment.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BsCallbackType.values().length];
                            try {
                                iArr[BsCallbackType.CONTINUE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // com.socure.docv.capturesdk.common.view.ActionCallback
                    public void onClick(BsCallbackType bsCallbackType, String cause) {
                        BottomSheetBehavior bottomSheetBehavior2;
                        Intrinsics.checkNotNullParameter(bsCallbackType, "bsCallbackType");
                        if (WhenMappings.$EnumSwitchMapping$0[bsCallbackType.ordinal()] == 1) {
                            ScannerFragment.this.sendEvent("clicked", new Pair(AnalyticsConstantsKt.KEY_SCREEN, "help"), new Pair(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()), new Pair("type", AnalyticsConstantsKt.CONTINUE_BUTTON));
                            bottomSheetBehavior2 = ScannerFragment.this.getBottomSheetBehavior();
                            Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior2, "bottomSheetBehavior");
                            ExtensionsKt.hide(bottomSheetBehavior2);
                            ScannerFragment.this.setupScanner();
                            return;
                        }
                        LoggerKt.logD("SDLT_SF", "unsupported callback from help: " + bsCallbackType);
                    }
                });
            } else {
                LoggerKt.logD("SDLT_SF", "helpView is already initiated");
            }
            pauseManualButtonVisibilityJob("help shown");
            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = getBottomSheetBehavior();
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior2, "bottomSheetBehavior");
            ExtensionsKt.show(bottomSheetBehavior2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBlocker(boolean show) {
        Unit unit;
        if (this._binding != null) {
            if (!isFinishing()) {
                getBinding().blockerView.setVisibility(show ? 0 : 8);
                LoggerKt.logD("SDLT_SF", "showBlocker called - show: " + show);
            } else {
                LoggerKt.logE$default("SDLT_SF", "showBlocker - activity is finishing", null, 4, null);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LoggerKt.logE$default("SDLT_SF", "showBlocker - _binding is null", null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFrameProvider(boolean videoFeed) {
        LoggerKt.logD("SDLT_SF", "setFrameProvider");
        FeedManager feedManager = this.feedManager;
        if (feedManager != null) {
            ScannerViewModel scannerViewModel = this.viewModel;
            if (scannerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scannerViewModel = null;
            }
            scannerViewModel.setFrameProvider(videoFeed, feedManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cameraFailed(String reason) {
        LoggerKt.logE$default("SDLT_SF", "cameraLoadFailed: " + reason, null, 4, null);
        sendEvent(AnalyticsConstantsKt.CAMERA_OPEN_FAILED, getScrTimeArg());
        getOrchestratorViewModel().onCameraFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFrameGeneration() {
        LoggerKt.logD("SDLT_SF", "startFrameGeneration");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.startGeneratingFrame();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ScannerFragment.startFrameGeneration$lambda$11(ScannerFragment.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startFrameGeneration$lambda$11(ScannerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) {
            VideoView videoView = this$0.getBinding().imgPreview;
            Utils utils = Utils.INSTANCE;
            Context requireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            videoView.setVideoPath(utils.getVideoPath$capturesdk_productionRelease(requireContext, this$0.getScanType()));
        }
    }

    private final void stopFrameGeneration() {
        LoggerKt.logD("SDLT_SF", "stopFrameGeneration");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.stopGeneratingFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passViewDimsWDelay(long delay) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new ScannerFragment$passViewDimsWDelay$1(delay, this, null)).start();
    }

    private final void setFrameProviderWithDelay(long delayTime, boolean videoFeed) {
        Job launch$default;
        LoggerKt.logD("SDLT_SF", "setFrameProviderWithDelay - delay: " + delayTime + " | videoFeed: " + videoFeed);
        resetFrameProviderJob("instantiation");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain().plus(this.exceptionHandler), null, new ScannerFragment$setFrameProviderWithDelay$1(this, delayTime, videoFeed, null), 2, null);
        this.frameProviderDelayJob = launch$default;
    }

    private final void setUpPreviewCallback() {
        LoggerKt.logD("SDLT_SF", "setUpPreviewCallback");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getUploadImageIvsCallback().observe(getViewLifecycleOwner(), new ScannerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<UploadIvsResponse<? extends Object>, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setUpPreviewCallback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UploadIvsResponse<? extends Object> uploadIvsResponse) {
                invoke2(uploadIvsResponse);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UploadIvsResponse<? extends Object> uploadIvsResponse) {
                IOrchestratorViewModel orchestratorViewModel;
                IOrchestratorViewModel orchestratorViewModel2;
                StartSessionModel startSessionModel;
                FragmentScannerSocureBinding binding;
                FragmentScannerSocureBinding binding2;
                StartSessionModel startSessionModel2;
                StartSessionModel startSessionModel3;
                IOrchestratorViewModel orchestratorViewModel3;
                IOrchestratorViewModel orchestratorViewModel4;
                StartSessionModel startSessionModel4;
                ScannerFragment.this.clearUploadDelayMsgJob("cancelling from " + uploadIvsResponse);
                if (Intrinsics.areEqual(uploadIvsResponse, UploadIvsResponse.Loading.INSTANCE)) {
                    ScannerFragment.this.launchUploadDelayMsg();
                }
                if (uploadIvsResponse instanceof UploadIvsResponse.Loading) {
                    startSessionModel4 = ScannerFragment.this.getStartSessionModel();
                    ScannerFragment.this.showImageUploadProgress(startSessionModel4.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBackgroundColor());
                    return;
                }
                if (uploadIvsResponse instanceof UploadIvsResponse.Success) {
                    UploadIvsResponse.Success success = (UploadIvsResponse.Success) uploadIvsResponse;
                    if (success.getData() instanceof ImageUploadResponse) {
                        orchestratorViewModel4 = ScannerFragment.this.getOrchestratorViewModel();
                        orchestratorViewModel4.getUploadImageMap().put(ScannerFragment.this.getScanType(), ((ImageUploadResponse) success.getData()).getUploadImage());
                        ScannerFragment.this.handleImageUploadStatus();
                        return;
                    } else {
                        orchestratorViewModel3 = ScannerFragment.this.getOrchestratorViewModel();
                        orchestratorViewModel3.backToCaller(SocureDocVError.UNKNOWN);
                        return;
                    }
                }
                if (uploadIvsResponse instanceof UploadIvsResponse.Retry) {
                    startSessionModel = ScannerFragment.this.getStartSessionModel();
                    ButtonStyleModel primary = startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary();
                    binding = ScannerFragment.this.getBinding();
                    binding.bsContainer.previewView.setIvsStatusImage(primary.getBackgroundColor(), primary.getColor(), R.drawable.ic_socure_ivs_failure);
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.announceAccessibilityMessage(scannerFragment.getRetryInvalidImage(), true);
                    binding2 = ScannerFragment.this.getBinding();
                    com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView previewView = binding2.bsContainer.previewView;
                    String retakeBtnText = ScannerFragment.this.getRetakeBtnText();
                    startSessionModel2 = ScannerFragment.this.getStartSessionModel();
                    String color = startSessionModel2.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getColor();
                    startSessionModel3 = ScannerFragment.this.getStartSessionModel();
                    previewView.setRetakeUI(new Button(retakeBtnText, color, null, startSessionModel3.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBackgroundColor(), 4, null), ScannerFragment.this.getRetryInvalidImage(), ScannerFragment.this.getPreviewWarningMessage());
                    return;
                }
                if (uploadIvsResponse instanceof UploadIvsResponse.Error) {
                    orchestratorViewModel2 = ScannerFragment.this.getOrchestratorViewModel();
                    orchestratorViewModel2.backToCaller(SocureDocVError.DOCUMENT_UPLOAD_FAILURE);
                } else if (uploadIvsResponse instanceof UploadIvsResponse.Exception) {
                    orchestratorViewModel = ScannerFragment.this.getOrchestratorViewModel();
                    orchestratorViewModel.backToCaller(SocureDocVError.UNKNOWN);
                } else {
                    LoggerKt.logDetailed("SDLT_SF", "uploadImageIvsCallback liveData reset");
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showImageUploadProgress(String primaryColor) {
        LoggerKt.logDetailed("SDLT_SF", "showImageUploadProgress called");
        Pair<Integer, Integer> previewProgressButtonColors = HelpPreviewUtils.INSTANCE.getPreviewProgressButtonColors(primaryColor);
        getBinding().bsContainer.previewView.showProgressTitle(getPreviewProgressTitle());
        getBinding().bsContainer.previewView.getPreviewBottomView().startProgressAnimation(getProgressAnimationText(), previewProgressButtonColors.getFirst().intValue(), Color.parseColor(primaryColor), Color.parseColor(primaryColor), previewProgressButtonColors.getSecond().intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleImageUploadStatus() {
        LoggerKt.logDetailed("SDLT_SF", "handleImageUploadStatus called");
        getBinding().bsContainer.previewView.showCompletionTitle(getCompletionTitle());
        getBinding().bsContainer.previewView.getPreviewBottomView().progressComplete(getProgressCompleteMessage());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ScannerFragment$handleImageUploadStatus$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCaptureErrorCallback() {
        LoggerKt.logD("SDLT_SF", "setupCaptureErrorCallback");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getIrrecoverableErrorCallback().observe(getViewLifecycleOwner(), new ScannerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<Pair<? extends ErrorScenario, ? extends String>, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupCaptureErrorCallback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ErrorScenario, ? extends String> pair) {
                invoke2((Pair<? extends ErrorScenario, String>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<? extends ErrorScenario, String> pair) {
                Unit unit;
                IOrchestratorViewModel orchestratorViewModel;
                FragmentScannerSocureBinding binding;
                if (pair != null) {
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    LoggerKt.logD("SDLT_SF", "captureErrorCallback msg: " + pair.getFirst().getMsg() + " and ex: " + ((Object) pair.getSecond()));
                    scannerFragment.sendEvent(AnalyticsConstantsKt.IMAGE_CAPTURE_ERROR, new Pair("type", pair.getFirst().getMsg()), new Pair(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()), new Pair("message", pair.getSecond()));
                    if (pair.getFirst() == ErrorScenario.MANUAL_FAILED || pair.getFirst() == ErrorScenario.CONTINUOUS_ERRORS_MAXED) {
                        scannerFragment.sendEvent("error", new Pair("type", pair.getFirst().getMsg()), new Pair(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()), new Pair("message", pair.getSecond()));
                        orchestratorViewModel = scannerFragment.getOrchestratorViewModel();
                        orchestratorViewModel.onSetupCaptureError();
                    } else {
                        LoggerKt.logD("SDLT_SF", "capture failed - preparing remove screen blocker");
                        binding = scannerFragment.getBinding();
                        if (binding.cblView.manualButtonShowing()) {
                            LoggerKt.logDetailed("SDLT_SF", "reset the manual instruction from Keep steady");
                            scannerFragment.showManualAlertMsg(scannerFragment.getScanType());
                        }
                        scannerFragment.showBlocker(false);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LoggerKt.logD("SDLT_SF", "irrecoverableErrorCallback is reset || null");
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passingViewDimensions() {
        LoggerKt.logD("SDLT_SF", "passingViewDimensions");
        if (this._binding != null) {
            OverlayLayout overlayLayout = getBinding().docOverView;
            int[] iArr = new int[2];
            overlayLayout.getGuideView().getLocationOnScreen(iArr);
            Container container = new Container(getBinding().preview.getWidth(), getBinding().preview.getHeight());
            View guideView = overlayLayout.getGuideView();
            ViewDimensions viewDimensions = new ViewDimensions(container, new GuidingBox(guideView.getWidth(), guideView.getHeight(), iArr[0], iArr[1], new Dimension(getBinding().preview.getWidth(), getBinding().preview.getHeight())), false, 4, null);
            ScannerViewModel scannerViewModel = this.viewModel;
            if (scannerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scannerViewModel = null;
            }
            scannerViewModel.setViewDimensions(viewDimensions);
        }
    }

    private final void clearHelpGraphic() {
        LoggerKt.logD("SDLT_SF", "clearHelpGraphic called");
        getBinding().scannerGraphic.setVisibility(8);
        if (this.lazyHelpGraphicJob.isInitialized() && getHelpGraphicJob().isActive()) {
            Job.DefaultImpls.cancel$default(getHelpGraphicJob(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job createHelpGraphicJob(boolean isVideoFeed) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        return BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain().plus(this.exceptionHandler), CoroutineStart.LAZY, new ScannerFragment$createHelpGraphicJob$1(this, isVideoFeed, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFpAndManualViewTimers(boolean isVideoFeed) {
        LoggerKt.logD("SDLT_SF", "setupFpAndManualViewTimers - isVideoFeed: " + isVideoFeed);
        long j = isVideoFeed ? 1000L : 2000L;
        setFrameProviderWithDelay(j, isVideoFeed);
        setupManualButtonVisibility(j);
    }

    private final void setupManualButtonVisibility(long setupDelay) {
        Job launch$default;
        clearManualButtonJob("instantiation");
        if (getBinding().cblView.manualButtonShowing()) {
            LoggerKt.logD("SDLT_SF", "manual button already showing, returning");
            return;
        }
        LoggerKt.logD("SDLT_SF", "manual button is not showing");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain().plus(this.exceptionHandler), null, new ScannerFragment$setupManualButtonVisibility$1(this, setupDelay, null), 2, null);
        this.manualButtonVisibilityJob = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupDetectionCallbacks() {
        LoggerKt.logD("SDLT_SF", "setupDetectionCallbacks");
        final Ref.LongRef longRef = new Ref.LongRef();
        ScannerViewModel scannerViewModel = this.viewModel;
        ScannerViewModel scannerViewModel2 = null;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getDetectionCallbacks().observe(getViewLifecycleOwner(), new ScannerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<DetectionCallback, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupDetectionCallbacks$1

            /* compiled from: ScannerFragment.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DetectionCallback.values().length];
                    try {
                        iArr[DetectionCallback.LOW_BRIGHTNESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DetectionCallback.GLARE_DETECTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DetectionCallback.BLUR_DETECTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DetectionCallback.CORNER_DETECTION_FAILED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[DetectionCallback.BARCODE_NOT_FOUND.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_NOT_FOUND.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_TOO_SMALL.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_ORIENTATION_WRONG.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[DetectionCallback.READY_FOR_SELFIE_CAPTURE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_AT_LEFT.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_AT_RIGHT.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_AT_UP.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_AT_DOWN.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[DetectionCallback.FACE_IS_BIG.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[DetectionCallback.CAPTURING.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[DetectionCallback.DOCUMENT_TOO_CLOSE.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[DetectionCallback.NOT_PROCESSING.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DetectionCallback detectionCallback) {
                invoke2(detectionCallback);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DetectionCallback it) {
                FragmentScannerSocureBinding binding;
                FragmentScannerSocureBinding binding2;
                FragmentScannerSocureBinding binding3;
                ScannerFragment$detectionWarningMessages$1 scannerFragment$detectionWarningMessages$1;
                ScannerFragment$detectionWarningMessages$1 scannerFragment$detectionWarningMessages$12;
                FragmentScannerSocureBinding binding4;
                FragmentScannerSocureBinding binding5;
                ScannerFragment$detectionWarningMessages$1 scannerFragment$detectionWarningMessages$13;
                FragmentScannerSocureBinding binding6;
                FragmentScannerSocureBinding binding7;
                ScannerFragment$detectionWarningMessages$1 scannerFragment$detectionWarningMessages$14;
                FragmentScannerSocureBinding binding8;
                FragmentScannerSocureBinding binding9;
                LoggerKt.logDetailed("SDLT_SF", "detectionCallback: " + it);
                ScannerFragment scannerFragment = ScannerFragment.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                scannerFragment.lastFailure = UtilsKt.getLastFailure(it);
                switch (WhenMappings.$EnumSwitchMapping$0[it.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        binding = ScannerFragment.this.getBinding();
                        if (!binding.cblView.manualButtonShowing()) {
                            binding3 = ScannerFragment.this.getBinding();
                            InfoLayout infoLayout = binding3.cilView;
                            Intrinsics.checkNotNullExpressionValue(infoLayout, "binding.cilView");
                            scannerFragment$detectionWarningMessages$1 = ScannerFragment.this.detectionWarningMessages;
                            InfoLayout.showWarningMessage$default(infoLayout, null, UtilsKt.getDetectionWarningMsg(scannerFragment$detectionWarningMessages$1, it), false, 5, null);
                            Context requireContext = ScannerFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                            if (UtilsKt.isTalkBackEnabled(requireContext) && it != DetectionCallback.CORNER_DETECTION_FAILED) {
                                ScannerFragment scannerFragment2 = ScannerFragment.this;
                                scannerFragment$detectionWarningMessages$12 = scannerFragment2.detectionWarningMessages;
                                ScannerFragment.announceAccessibilityMessage$default(scannerFragment2, UtilsKt.getDetectionWarningMsg(scannerFragment$detectionWarningMessages$12, it), false, 2, null);
                            }
                        }
                        if (it == DetectionCallback.CORNER_DETECTION_FAILED) {
                            LoggerKt.logDetailed("SDLT_SF", "clearing graphic overlay");
                            binding2 = ScannerFragment.this.getBinding();
                            binding2.graphicOverlay.clear();
                            break;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        if (System.currentTimeMillis() - longRef.element > 1000) {
                            binding4 = ScannerFragment.this.getBinding();
                            binding4.cilView.setVisibility(0);
                            binding5 = ScannerFragment.this.getBinding();
                            InfoLayout infoLayout2 = binding5.cilView;
                            Intrinsics.checkNotNullExpressionValue(infoLayout2, "binding.cilView");
                            scannerFragment$detectionWarningMessages$13 = ScannerFragment.this.detectionWarningMessages;
                            InfoLayout.showWarningMessage$default(infoLayout2, null, UtilsKt.getDetectionWarningMsg(scannerFragment$detectionWarningMessages$13, it), false, 5, null);
                            Context requireContext2 = ScannerFragment.this.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                            if (UtilsKt.isTalkBackEnabled(requireContext2)) {
                                ScannerFragment scannerFragment3 = ScannerFragment.this;
                                ScannerFragment.announceAccessibilityMessage$default(scannerFragment3, scannerFragment3.getSelfieAccessibilityAnnouncementMessage(it), false, 2, null);
                            }
                            binding6 = ScannerFragment.this.getBinding();
                            binding6.docOverView.setGuidingBoxTintColor(it == DetectionCallback.READY_FOR_SELFIE_CAPTURE ? R.color.socure_green : R.color.socure_white);
                            longRef.element = System.currentTimeMillis();
                            break;
                        }
                        break;
                    case 15:
                        LoggerKt.logDetailed("SDLT_SF", "calling showEdgeDetection and showWarning");
                        ScannerFragment.this.showBlocker(true);
                        binding7 = ScannerFragment.this.getBinding();
                        InfoLayout infoLayout3 = binding7.cilView;
                        Intrinsics.checkNotNullExpressionValue(infoLayout3, "binding.cilView");
                        scannerFragment$detectionWarningMessages$14 = ScannerFragment.this.detectionWarningMessages;
                        InfoLayout.showWarningMessage$default(infoLayout3, null, UtilsKt.getDetectionWarningMsg(scannerFragment$detectionWarningMessages$14, it), false, 5, null);
                        Context requireContext3 = ScannerFragment.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext()");
                        if (UtilsKt.isTalkBackEnabled(requireContext3)) {
                            ScannerFragment scannerFragment4 = ScannerFragment.this;
                            scannerFragment4.announceAccessibilityMessage(scannerFragment4.getIdLookingGood(), true);
                            break;
                        }
                        break;
                    case 16:
                        LoggerKt.logDetailed("SDLT_SF", "Document too close");
                        if (ScannerFragment.this.getScanType() == ScanType.LICENSE_FRONT || ScannerFragment.this.getScanType() == ScanType.LICENSE_BACK) {
                            binding8 = ScannerFragment.this.getBinding();
                            if (!binding8.cblView.manualButtonShowing()) {
                                binding9 = ScannerFragment.this.getBinding();
                                InfoLayout infoLayout4 = binding9.cilView;
                                Intrinsics.checkNotNullExpressionValue(infoLayout4, "binding.cilView");
                                InfoLayout.showWarningMessage$default(infoLayout4, ScannerFragment.this.getDocumentTooClose(), ScannerFragment.this.getMovePhoneBack(), false, 4, null);
                                break;
                            }
                        }
                        break;
                    case 17:
                        LoggerKt.logDetailed("SDLT_SF", "Not processing callback");
                        break;
                }
            }
        }));
        ScannerViewModel scannerViewModel3 = this.viewModel;
        if (scannerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scannerViewModel2 = scannerViewModel3;
        }
        scannerViewModel2.getCornerDetectionCallBack().observe(getViewLifecycleOwner(), new ScannerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<Pair<? extends List<? extends Float>, ? extends Dimension>, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupDetectionCallbacks$2

            /* compiled from: ScannerFragment.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ScanType.values().length];
                    try {
                        iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ScanType.LICENSE_BACK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ScanType.PASSPORT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ScanType.SELFIE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Float>, ? extends Dimension> pair) {
                invoke2((Pair<? extends List<Float>, Dimension>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<? extends List<Float>, Dimension> pair) {
                FragmentScannerSocureBinding binding;
                FragmentScannerSocureBinding binding2;
                FragmentScannerSocureBinding binding3;
                FragmentScannerSocureBinding binding4;
                long j;
                FragmentScannerSocureBinding binding5;
                FragmentScannerSocureBinding binding6;
                FragmentScannerSocureBinding binding7;
                List<Float> component1 = pair.component1();
                Dimension component2 = pair.component2();
                int i = WhenMappings.$EnumSwitchMapping$0[ScannerFragment.this.getScanType().ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3 || i == 4) {
                        LoggerKt.logDetailed("SDLT_SF", "cornerDetectionCallBack called for scanType: " + ScannerFragment.this.getScanType());
                        return;
                    }
                    return;
                }
                binding = ScannerFragment.this.getBinding();
                binding.graphicOverlay.clear();
                List<Float> list = component1;
                if (!list.isEmpty()) {
                    binding2 = ScannerFragment.this.getBinding();
                    if (binding2.cblView.manualButtonShowing()) {
                        binding3 = ScannerFragment.this.getBinding();
                        if (UtilsKt.flipDoc(component1, 20.0d, binding3.docOverView.isBoxVertical$capturesdk_productionRelease())) {
                            LoggerKt.logDetailed("SDLT_SF", "trying to flip the guiding box and called passingViewDimensions");
                            binding4 = ScannerFragment.this.getBinding();
                            binding4.docOverView.flipGb$capturesdk_productionRelease();
                            ScannerFragment.this.passViewDimsWDelay(500L);
                            return;
                        }
                        return;
                    }
                    if (Utils.INSTANCE.cornersFound$capturesdk_productionRelease(CollectionsKt.toFloatArray(list))) {
                        binding7 = ScannerFragment.this.getBinding();
                        binding7.graphicOverlay.drawRect(component1, component2);
                        return;
                    }
                    Context requireContext = ScannerFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    if (UtilsKt.isTalkBackEnabled(requireContext)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        j = ScannerFragment.this.announcementDelayTimeStamp;
                        if (currentTimeMillis - j > 3000) {
                            LoggerKt.logDetailed("SDLT_SF", "TalkBackEnabled is enabled | corner doesn't have valid coordinates");
                            ImageUtils imageUtils = ImageUtils.INSTANCE;
                            List<Float> removeNegative = UtilsKt.removeNegative(component1);
                            binding5 = ScannerFragment.this.getBinding();
                            GraphicOverlay graphicOverlay = binding5.graphicOverlay;
                            Intrinsics.checkNotNullExpressionValue(graphicOverlay, "binding.graphicOverlay");
                            List<Float> scaleIddModelCoordinates$capturesdk_productionRelease = imageUtils.scaleIddModelCoordinates$capturesdk_productionRelease(removeNegative, ExtensionsKt.getDimension(graphicOverlay), component2);
                            ScannerFragment scannerFragment = ScannerFragment.this;
                            final ScannerFragment scannerFragment2 = ScannerFragment.this;
                            GetCardAccesibilityAnnouncement getCardAccesibilityAnnouncement = new GetCardAccesibilityAnnouncement() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupDetectionCallbacks$2.1
                                @Override // com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement
                                public String getMovePhoneUp() {
                                    return ScannerFragment.this.getMovePhoneUp();
                                }

                                @Override // com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement
                                public String getMovePhoneDown() {
                                    return ScannerFragment.this.getMovePhoneDown();
                                }

                                @Override // com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement
                                public String getMovePhoneLeft() {
                                    return ScannerFragment.this.getMovePhoneLeft();
                                }

                                @Override // com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement
                                public String getMovePhoneRight() {
                                    return ScannerFragment.this.getMovePhoneRight();
                                }

                                @Override // com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement
                                public String getCardTooClose() {
                                    return ScannerFragment.this.getCardTooClose();
                                }

                                @Override // com.socure.docv.capturesdk.common.utils.GetCardAccesibilityAnnouncement
                                public String getCardNotFound() {
                                    return ScannerFragment.this.getCardNotFound();
                                }
                            };
                            float[] floatArray = CollectionsKt.toFloatArray(scaleIddModelCoordinates$capturesdk_productionRelease);
                            binding6 = ScannerFragment.this.getBinding();
                            GraphicOverlay graphicOverlay2 = binding6.graphicOverlay;
                            Intrinsics.checkNotNullExpressionValue(graphicOverlay2, "binding.graphicOverlay");
                            ScannerFragment.announceAccessibilityMessage$default(scannerFragment, UtilsKt.getCardAccessibilityAnnouncement(getCardAccesibilityAnnouncement, floatArray, ExtensionsKt.getDimension(graphicOverlay2)), false, 2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LoggerKt.logDetailed("SDLT_SF", "card coordinates is empty");
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showManualAlertMsg(ScanType scanType) {
        LoggerKt.logDetailed("SDLT_SF", "showManualAlertMsg scanType: " + scanType.getValue());
        Pair<String, String> manualWarningMessage = getManualWarningMessage();
        if (manualWarningMessage != null) {
            InfoLayout infoLayout = getBinding().cilView;
            Intrinsics.checkNotNullExpressionValue(infoLayout, "binding.cilView");
            InfoLayout.showWarningMessage$default(infoLayout, manualWarningMessage.getFirst(), manualWarningMessage.getSecond(), false, 4, null);
            announceAccessibilityMessage$default(this, ((Object) manualWarningMessage.getFirst()) + " " + ((Object) manualWarningMessage.getSecond()), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupDebugImageCallback() {
        LoggerKt.logDetailed("SDLT_SF", "setupDebugImageCallback");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getDebugImageCallback().observe(getViewLifecycleOwner(), new ScannerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<Pair<? extends ImageMode, ? extends Bitmap>, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupDebugImageCallback$1

            /* compiled from: ScannerFragment.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ImageMode.values().length];
                    try {
                        iArr[ImageMode.DEBUG.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ImageMode, ? extends Bitmap> pair) {
                invoke2((Pair<? extends ImageMode, Bitmap>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<? extends ImageMode, Bitmap> pair) {
                if (WhenMappings.$EnumSwitchMapping$0[pair.getFirst().ordinal()] != 1) {
                    LoggerKt.logD("SDLT_SF", "else hit in setupDebugImageCallback");
                    return;
                }
                Bitmap second = pair.getSecond();
                if (second != null && !second.isRecycled()) {
                    ScannerFragment.this.showDebugImage(pair.getSecond());
                } else {
                    LoggerKt.logE$default("SDLT_SF", "recycled bitmap received in debugScanStageCallback", null, 4, null);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupOutputCallback() {
        LoggerKt.logD("SDLT_SF", "setupOutputCallback");
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getOutPutCallBack().observe(getViewLifecycleOwner(), new ScannerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<Output, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupOutputCallback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Output output) {
                invoke2(output);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Output output) {
                Unit unit;
                FragmentScannerSocureBinding binding;
                FragmentScannerSocureBinding binding2;
                FragmentScannerSocureBinding binding3;
                Object obj;
                ScannerViewModel scannerViewModel2;
                FragmentScannerSocureBinding binding4;
                ScannerViewModel scannerViewModel3;
                FragmentScannerSocureBinding binding5;
                FragmentScannerSocureBinding binding6;
                LoggerKt.logI("SDLT_SF", "outPutCallBack");
                if (output != null) {
                    final ScannerFragment scannerFragment = ScannerFragment.this;
                    if (output.getFinalBitmap().isRecycled() || (!output.getFinalStatus() && output.getCaptureType() != CaptureType.MANUAL)) {
                        scannerFragment.showBlocker(false);
                        LoggerKt.logE$default("SDLT_SF", "Recycled bitmap received in outPutCallBack or finalStatus false - setting isProcessing to false", null, 4, null);
                    } else {
                        if (Build.VERSION.SDK_INT >= 30) {
                            binding6 = scannerFragment.getBinding();
                            binding6.docOverView.performHapticFeedback(0);
                        }
                        scannerFragment.resetManualButtonVisibilityJob("starting animation");
                        binding = scannerFragment.getBinding();
                        binding.docOverView.hideGuidingBox();
                        binding2 = scannerFragment.getBinding();
                        binding2.cblView.hideManualButton();
                        binding3 = scannerFragment.getBinding();
                        InfoLayout infoLayout = binding3.cilView;
                        Intrinsics.checkNotNullExpressionValue(infoLayout, "binding.cilView");
                        InfoLayout.showWarningMessage$default(infoLayout, scannerFragment.getCaptureSuccess(), null, true, 2, null);
                        Context requireContext = scannerFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                        if (UtilsKt.isTalkBackEnabled(requireContext)) {
                            ScannerFragment.announceAccessibilityMessage$default(scannerFragment, scannerFragment.getCaptureSuccess(), false, 2, null);
                        }
                        if (Utils.INSTANCE.isSelfie$capturesdk_productionRelease(scannerFragment.getScanType())) {
                            scannerFragment.processedToNext(output);
                        } else {
                            ImageUtils imageUtils = ImageUtils.INSTANCE;
                            Iterator<T> it = output.getMetrics().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it.next();
                                    if (((DetectionMetric) obj).getDetectionType() == DetectionType.CORNER) {
                                        break;
                                    }
                                }
                            }
                            DetectionMetric detectionMetric = (DetectionMetric) obj;
                            scannerViewModel2 = scannerFragment.viewModel;
                            if (scannerViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                scannerViewModel2 = null;
                            }
                            Pair<List<Float>, Dimension> cornersAndParentDimenForDrawingRect$capturesdk_productionRelease = imageUtils.getCornersAndParentDimenForDrawingRect$capturesdk_productionRelease(detectionMetric, scannerViewModel2.getManualGuidingBox());
                            List<Float> component1 = cornersAndParentDimenForDrawingRect$capturesdk_productionRelease.component1();
                            Dimension component2 = cornersAndParentDimenForDrawingRect$capturesdk_productionRelease.component2();
                            binding4 = scannerFragment.getBinding();
                            binding4.graphicOverlay.clear();
                            scannerViewModel3 = scannerFragment.viewModel;
                            if (scannerViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                scannerViewModel3 = null;
                            }
                            scannerViewModel3.freezeFeed();
                            binding5 = scannerFragment.getBinding();
                            binding5.graphicOverlay.drawRectWithAnimation(component1, component2, new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$setupOutputCallback$1$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    ScannerFragment.this.processedToNext(output);
                                }
                            });
                        }
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ScannerFragment.this.showBlocker(false);
                    LoggerKt.logE$default("SDLT_SF", "PVC received null in outPutCallBack - setting isProcessing to false", null, 4, null);
                }
            }
        }));
    }

    private final void clearVmCallbacks() {
        LoggerKt.logD("SDLT_SF", "clearVmCallbacks");
        ScannerViewModel scannerViewModel = this.viewModel;
        ScannerViewModel scannerViewModel2 = null;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getDetectionCallbacks().removeObservers(getViewLifecycleOwner());
        ScannerViewModel scannerViewModel3 = this.viewModel;
        if (scannerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel3 = null;
        }
        scannerViewModel3.getCornerDetectionCallBack().removeObservers(getViewLifecycleOwner());
        ScannerViewModel scannerViewModel4 = this.viewModel;
        if (scannerViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel4 = null;
        }
        scannerViewModel4.getOutPutCallBack().removeObservers(getViewLifecycleOwner());
        ScannerViewModel scannerViewModel5 = this.viewModel;
        if (scannerViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel5 = null;
        }
        scannerViewModel5.getDebugImageCallback().removeObservers(getViewLifecycleOwner());
        ScannerViewModel scannerViewModel6 = this.viewModel;
        if (scannerViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scannerViewModel2 = scannerViewModel6;
        }
        scannerViewModel2.getIrrecoverableErrorCallback().removeObservers(getViewLifecycleOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processedToNext(final Output output) {
        String str;
        LoggerKt.logD("SDLT_SF", "processedToNext");
        hideDebugImage();
        clearFeedManager();
        if (Utils.INSTANCE.isSelfie$capturesdk_productionRelease(getScanType())) {
            str = output.getCaptureType() == CaptureType.MANUAL ? AnalyticsConstantsKt.SELFIE_CAPTURED_MANUAL : AnalyticsConstantsKt.SELFIE_CAPTURED;
        } else {
            str = output.getCaptureType() == CaptureType.MANUAL ? AnalyticsConstantsKt.DOCUMENT_SCANNED_MANUAL : AnalyticsConstantsKt.DOCUMENT_SCANNED;
        }
        ScannerViewModel scannerViewModel = this.viewModel;
        ScannerViewModel scannerViewModel2 = null;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        Pair<String, String>[] scannedEventAttrs = UtilsKt.getScannedEventAttrs(getScanType(), scannerViewModel.getScannerDurationStore().getAndResetCaptureDurationOnCapture(), output);
        sendEvent(Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(str, getScanType(), getDocSelection()), (Pair[]) Arrays.copyOf(scannedEventAttrs, scannedEventAttrs.length));
        ScannerViewModel scannerViewModel3 = this.viewModel;
        if (scannerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scannerViewModel2 = scannerViewModel3;
        }
        if (scannerViewModel2.getManualCaptureOnly()) {
            proceedToPreview(output, new FinalOutputProcessData(null, null, false, false, 0L, 31, null));
        } else {
            new FinalOutputExtractor(getScanType(), output.getFinalBitmap(), output.getMetrics()).proceed(new FinalOutputCallback() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$processedToNext$1
                @Override // com.socure.docv.capturesdk.core.extractor.FinalOutputCallback
                public void extracted(FinalOutputProcessData finalOutputProcessData) {
                    boolean isFinishing;
                    String msgActivityFinishing;
                    Intrinsics.checkNotNullParameter(finalOutputProcessData, "finalOutputProcessData");
                    isFinishing = ScannerFragment.this.isFinishing();
                    if (isFinishing) {
                        msgActivityFinishing = ScannerFragment.this.getMsgActivityFinishing();
                        LoggerKt.logE$default("SDLT_SF", msgActivityFinishing, null, 4, null);
                        return;
                    }
                    Pair<String, List<Pair<String, String>>> eventDataFromExtractedData = UtilsKt.getEventDataFromExtractedData(ScannerFragment.this.getScanType(), finalOutputProcessData);
                    Float imageRotatableAngle = ImageUtils.INSTANCE.getImageRotatableAngle(finalOutputProcessData);
                    if (imageRotatableAngle != null) {
                        Output output2 = output;
                        Bitmap rotateBitmap$capturesdk_productionRelease = ImageUtils.INSTANCE.rotateBitmap$capturesdk_productionRelease(output2.getFinalBitmap(), imageRotatableAngle.floatValue());
                        output2.getFinalBitmap().recycle();
                        output2.setFinalBitmap(rotateBitmap$capturesdk_productionRelease);
                    }
                    if (eventDataFromExtractedData != null) {
                        ScannerFragment scannerFragment = ScannerFragment.this;
                        String first = eventDataFromExtractedData.getFirst();
                        Pair[] pairArr = (Pair[]) eventDataFromExtractedData.getSecond().toArray(new Pair[0]);
                        scannerFragment.sendEvent(first, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    }
                    ScannerFragment.this.proceedToPreview(output, finalOutputProcessData);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedToPreview(final Output output, final FinalOutputProcessData finalOutputProcessData) {
        LoggerKt.logD("SDLT_SF", "proceedToPreview called ");
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = getBottomSheetBehavior();
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
        if (ExtensionsKt.isNotVisible(bottomSheetBehavior)) {
            HelpPreviewUtils helpPreviewUtils = HelpPreviewUtils.INSTANCE;
            com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView previewView = getBinding().bsContainer.previewView;
            Intrinsics.checkNotNullExpressionValue(previewView, "binding.bsContainer.previewView");
            helpPreviewUtils.setVisibilityFocus$capturesdk_productionRelease(previewView, getBinding());
            resetScanner("proceed to preivew");
            final com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView previewView2 = getBinding().bsContainer.previewView;
            HelpPreviewUtils helpPreviewUtils2 = HelpPreviewUtils.INSTANCE;
            Context context = previewView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            previewView2.setPreviewData(helpPreviewUtils2.getPreviewUiData$capturesdk_productionRelease(context, getScanType(), output, getStartSessionModel(), new PreviewDataInputGenerator() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$proceedToPreview$1$previewData$1
                @Override // com.socure.docv.capturesdk.common.utils.PreviewDataInputGenerator
                public String getConfirmationTitleText() {
                    return ScannerFragment.this.getConfirmationTitleText();
                }

                @Override // com.socure.docv.capturesdk.common.utils.PreviewDataInputGenerator
                public String getPreviewConfirmationText() {
                    return ScannerFragment.this.getPreviewConfirmationText();
                }

                @Override // com.socure.docv.capturesdk.common.utils.PreviewDataInputGenerator
                public String getSubmitImageForValidation() {
                    return ScannerFragment.this.getSubmitImageForValidation();
                }

                @Override // com.socure.docv.capturesdk.common.utils.PreviewDataInputGenerator
                public String getContBtnText() {
                    return ScannerFragment.this.getContBtnText();
                }

                @Override // com.socure.docv.capturesdk.common.utils.PreviewDataInputGenerator
                public String getRetakeBtnText() {
                    return ScannerFragment.this.getRetakeBtnText();
                }
            }), new ActionCallback() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerFragment$proceedToPreview$1$1

                /* compiled from: ScannerFragment.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[BsCallbackType.values().length];
                        try {
                            iArr[BsCallbackType.DEBUG_IMAGE_SAVE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[BsCallbackType.CONTINUE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[BsCallbackType.RETAKE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.socure.docv.capturesdk.common.view.ActionCallback
                public void onClick(BsCallbackType bsCallbackType, String cause) {
                    ScannerViewModel scannerViewModel;
                    BottomSheetBehavior bottomSheetBehavior2;
                    TimeOutKeeper timeOutKeeper;
                    long manualTimeOut;
                    DocSelection docSelection;
                    FragmentScannerSocureBinding binding;
                    Intrinsics.checkNotNullParameter(bsCallbackType, "bsCallbackType");
                    int i = WhenMappings.$EnumSwitchMapping$0[bsCallbackType.ordinal()];
                    if (i == 1) {
                        Context context2 = com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView.this.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "context");
                        new DbgImgExporter(context2, this.getScanType(), output.getMetrics()).export();
                        return;
                    }
                    ScannerViewModel scannerViewModel2 = null;
                    if (i == 2) {
                        Context requireContext = this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                        if (UtilsKt.isTalkBackEnabled(requireContext)) {
                            ScannerFragment scannerFragment = this;
                            ScannerFragment.announceAccessibilityMessage$default(scannerFragment, scannerFragment.getContinuePreviewMessage(), false, 2, null);
                        }
                        ScannerFragment scannerFragment2 = this;
                        scannerFragment2.triggerUpload(scannerFragment2.getScanType(), output, finalOutputProcessData.getData(), finalOutputProcessData.getFace());
                        return;
                    }
                    if (i != 3) {
                        return;
                    }
                    this.unRegisteringPreviewCallback();
                    scannerViewModel = this.viewModel;
                    if (scannerViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        scannerViewModel2 = scannerViewModel;
                    }
                    scannerViewModel2.getScannerDurationStore().setCaptureStartFromRetake();
                    bottomSheetBehavior2 = this.getBottomSheetBehavior();
                    Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior2, "bottomSheetBehavior");
                    ExtensionsKt.hide(bottomSheetBehavior2);
                    if (cause != null) {
                        ScannerFragment scannerFragment3 = this;
                        ScanType scanType = scannerFragment3.getScanType();
                        docSelection = scannerFragment3.getDocSelection();
                        binding = scannerFragment3.getBinding();
                        Pair<String, List<Pair<String, String>>> retakeEvent = UtilsKt.getRetakeEvent(scanType, docSelection, cause, binding.bsContainer.previewView.getViewShownTime());
                        String first = retakeEvent.getFirst();
                        Pair[] pairArr = (Pair[]) retakeEvent.getSecond().toArray(new Pair[0]);
                        scannerFragment3.sendEvent(first, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    }
                    timeOutKeeper = this.getTimeOutKeeper();
                    manualTimeOut = this.getManualTimeOut();
                    timeOutKeeper.resetRemaining(manualTimeOut + 2000);
                    this.setupScanner();
                }
            });
            getBinding().bsContainer.previewView.invalidate();
            setUpPreviewCallback();
            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = getBottomSheetBehavior();
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior2, "bottomSheetBehavior");
            ExtensionsKt.show(bottomSheetBehavior2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerUpload(ScanType scanType, Output output, BaseExtractedData data, ArrayList<Face> faces) {
        getOrchestratorViewModel().updatingMetricData(new MetricCaptureData(scanType, output.getCaptureType(), output.getCaptureMetadata(), output.getMetrics(), Boolean.valueOf(data != null), faces));
        Pair<UploadImage, List<Pair<String, String>>> outputAndMetaData$capturesdk_productionRelease = Utils.INSTANCE.getOutputAndMetaData$capturesdk_productionRelease(scanType, output, data, getStartSessionModel().getSessionToken(), getModuleId(), Utils.INSTANCE.getMultiPartBodyFromMetricData(getOrchestratorViewModel().getMetricData(scanType)));
        if (Utils.INSTANCE.isSelfie$capturesdk_productionRelease(scanType)) {
            String replacePlaceholders$capturesdk_productionRelease = Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(output.getCaptureType() == CaptureType.MANUAL ? AnalyticsConstantsKt.SELFIE_CAPTURE_SUCCESS_MANUAL : AnalyticsConstantsKt.SELFIE_CAPTURE_SUCCESS, scanType, getDocSelection());
            Pair[] pairArr = (Pair[]) outputAndMetaData$capturesdk_productionRelease.getSecond().toArray(new Pair[0]);
            sendEvent(replacePlaceholders$capturesdk_productionRelease, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        } else {
            String replacePlaceholders$capturesdk_productionRelease2 = Utils.INSTANCE.replacePlaceholders$capturesdk_productionRelease(output.getCaptureType() == CaptureType.MANUAL ? AnalyticsConstantsKt.SCAN_SUCCESS_MANUAL : AnalyticsConstantsKt.SCAN_SUCCESS, scanType, getDocSelection());
            Pair[] pairArr2 = (Pair[]) outputAndMetaData$capturesdk_productionRelease.getSecond().toArray(new Pair[0]);
            sendEvent(replacePlaceholders$capturesdk_productionRelease2, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        }
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.uploadImage(outputAndMetaData$capturesdk_productionRelease.getFirst(), output, faces, getBinding().bsContainer.previewView.getViewShownTime(), getEventUpdater());
    }

    private final void resetGuidingViews() {
        LoggerKt.logDetailed("SDLT_SF", "resetGuidingViews called");
        getBinding().docOverView.setGuidingBoxTintColor(R.color.socure_white);
        getBinding().graphicOverlay.resetAnimation();
        getBinding().graphicOverlay.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDebugImage(Bitmap bitmap) {
        Unit unit = null;
        if (bitmap != null) {
            LoggerKt.logDetailed("SDLT_SF", "showDebugImage");
            getBinding().ivDbgScanStages.setVisibility(0);
            getBinding().ivDbgScanStages.setImageBitmap(null);
            getBinding().ivDbgScanStages.setImageBitmap(bitmap);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LoggerKt.logDetailed("SDLT_SF", "calling hideDebugImage");
            hideDebugImage();
        }
    }

    private final void hideDebugImage() {
        LoggerKt.logDetailed("SDLT_SF", "hideDebugImage");
        getBinding().ivDbgScanStages.setImageBitmap(null);
        getBinding().ivDbgScanStages.setVisibility(8);
    }

    private final void resetFrameProviderJob(String cause) {
        LoggerKt.logD("SDLT_SF", "resetFrameProviderJob called - cause: " + cause);
        Job job = this.frameProviderDelayJob;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, cause, null, 2, null);
        }
        this.frameProviderDelayJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetManualButtonVisibilityJob(String cause) {
        LoggerKt.logD("SDLT_SF", "resetManualButtonVisibilityJob called - cause: " + cause);
        getTimeOutKeeper().reset();
        clearManualButtonJob(cause);
        if (getScanType() == ScanType.LICENSE_BACK) {
            LoggerKt.logD("SDLT_SF", "calling updateBarcodeStateInPipeline - add barcode check");
            ScannerViewModel scannerViewModel = this.viewModel;
            if (scannerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                scannerViewModel = null;
            }
            scannerViewModel.updateBarcodeStateInPipeline(false);
        }
    }

    private final void pauseManualButtonVisibilityJob(String cause) {
        LoggerKt.logD("SDLT_SF", "pauseManualButtonVisibilityJob called - cause: " + cause);
        getTimeOutKeeper().pause();
        clearManualButtonJob(cause);
    }

    private final void clearManualButtonJob(String cause) {
        LoggerKt.logD("SDLT_SF", "clearManualButtonJob called - cause: " + cause);
        Job job = this.manualButtonVisibilityJob;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, cause, null, 2, null);
        }
        this.manualButtonVisibilityJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearUploadDelayMsgJob(String cause) {
        LoggerKt.logD("SDLT_SF", "clearUploadDelayMsgJob called");
        Job job = this.uploadDelayMsgJob;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, cause, null, 2, null);
        }
        this.uploadDelayMsgJob = null;
    }

    static /* synthetic */ String getManualType$default(ScannerFragment scannerFragment, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualType");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return scannerFragment.getManualType(str);
    }

    private final String getManualType(String lastFailure) {
        ScannerViewModel scannerViewModel = this.viewModel;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        return (scannerViewModel.getManualCaptureOnly() || Utils.INSTANCE.isSelfie$capturesdk_productionRelease(getScanType())) ? Utils.INSTANCE.isSelfie$capturesdk_productionRelease(getScanType()) ? getScanType().getValue() : AnalyticsConstantsKt.MANUAL_ONLY : (!ConstantsKt.getOPEN_CV_SUPPORTED() || Utils.INSTANCE.isAutomationFlavor$capturesdk_productionRelease()) ? !ConstantsKt.getOPEN_CV_SUPPORTED() ? AnalyticsConstantsKt.OPENCV_NOT_SUPPORTED : AnalyticsConstantsKt.MANUAL_AUTOMATION : lastFailure == null ? AnalyticsConstantsKt.MANUAL_REGULAR : lastFailure;
    }

    static /* synthetic */ void announceAccessibilityMessage$default(ScannerFragment scannerFragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: announceAccessibilityMessage");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        scannerFragment.announceAccessibilityMessage(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void announceAccessibilityMessage(String msg, boolean interrupt) {
        AnnounceAccessibilityMessageUseCase accessibilityAnnouncer = getComponent().getAccessibilityAnnouncer();
        CoordinatorLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        AnnounceAccessibilityMessageUseCaseKt.queue(accessibilityAnnouncer, root, msg, interrupt);
        this.announcementDelayTimeStamp = getComponent().getAccessibilityAnnouncer().get_lastAnnouncementTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unRegisteringPreviewCallback() {
        ScannerViewModel scannerViewModel = this.viewModel;
        ScannerViewModel scannerViewModel2 = null;
        if (scannerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            scannerViewModel = null;
        }
        scannerViewModel.getUploadImageIvsCallback().removeObservers(getViewLifecycleOwner());
        ScannerViewModel scannerViewModel3 = this.viewModel;
        if (scannerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            scannerViewModel2 = scannerViewModel3;
        }
        scannerViewModel2.clearPreviewCallbackValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchUploadDelayMsg() {
        Job launch$default;
        LoggerKt.logD("SDLT_SF", "launchUploadDelayMsg called");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain().plus(this.exceptionHandler), null, new ScannerFragment$launchUploadDelayMsg$1(this, null), 2, null);
        this.uploadDelayMsgJob = launch$default;
    }
}
