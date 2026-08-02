package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactFragmentIndexSpan;
import com.facebook.react.views.text.internal.span.ReactLinkSpan;
import com.facebook.react.views.text.internal.span.ReactOpacitySpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u009e\u0001\u009f\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010\"J3\u0010%\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b%\u0010&Js\u0010:\u001a\u0002092\u0006\u0010'\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;Ja\u0010=\u001a\u0002092\u0006\u0010'\u001a\u00020\r2\u0006\u0010<\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u0002072\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u0002072\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010DJQ\u0010I\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bI\u0010JJO\u0010:\u001a\u0002092\u0006\u0010'\u001a\u00020\r2\u0006\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,H\u0002¢\u0006\u0004\b:\u0010KJQ\u0010N\u001a\u00020M2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020L2\u0006\u0010F\u001a\u00020L2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,2\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\bN\u0010OJw\u0010R\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,2\u0006\u0010P\u001a\u00020*2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\bR\u0010SJ[\u0010W\u001a\u00020V2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010U\u001a\u0004\u0018\u00010TH\u0007¢\u0006\u0004\bW\u0010XJ7\u0010Z\u001a\u00020T2\u0006\u0010Y\u001a\u00020M2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,H\u0007¢\u0006\u0004\bZ\u0010[J7\u0010^\u001a\u00020*2\u0006\u0010\\\u001a\u0002092\u0006\u0010F\u001a\u00020L2\u0006\u0010G\u001a\u00020*2\u0006\u0010]\u001a\u00020,2\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\n2\u0006\u0010\\\u001a\u0002092\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\b`\u0010aJ7\u0010d\u001a\u00020*2\u0006\u0010\\\u001a\u0002092\u0006\u0010'\u001a\u00020b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010c\u001a\u00020\nH\u0002¢\u0006\u0004\bd\u0010eJ/\u0010f\u001a\u00020*2\u0006\u0010\\\u001a\u0002092\u0006\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020,2\u0006\u0010c\u001a\u00020\nH\u0002¢\u0006\u0004\bf\u0010gJG\u0010m\u001a\u00020\n2\u0006\u0010\\\u001a\u0002092\u0006\u0010'\u001a\u00020b2\u0006\u0010h\u001a\u00020*2\u0006\u0010c\u001a\u00020\n2\u0006\u0010i\u001a\u00020\n2\u0006\u0010j\u001a\u00020*2\u0006\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bm\u0010nJA\u0010p\u001a\u00020o2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010G\u001a\u00020*2\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\bp\u0010qJ!\u0010r\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020\r2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\br\u0010sJ\u001d\u0010v\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\r¢\u0006\u0004\bv\u0010wJ\u0015\u0010x\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\n¢\u0006\u0004\bx\u0010yJ\u0015\u0010z\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{J'\u0010|\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u007fR\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u007fR\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u007fR\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u007fR\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u007fR\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u007fR\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u007fR\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u007fR\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u007fR\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u007fR\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u007fR\u0016\u0010\u008d\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u007fR\u0016\u0010\u008e\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u007fR\u0016\u0010\u008f\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u007fR\u0016\u0010\u0090\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u007fR\u0016\u0010\u0091\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010\u007fR\u0016\u0010\u0092\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010\u007fR\u0017\u0010\u0093\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002070\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u0098\u0001\u001a\u00020.8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009a\u0001\u001a\u00020.8\u0002X\u0082T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0099\u0001R$\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006 \u0001"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager;", "", "<init>", "()V", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "attributedString", "", "getTextAlignmentAttr", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;", "alignmentAttr", "", "getTextJustificationMode", "(Ljava/lang/String;)I", "Landroid/text/Spannable;", "spanned", "Landroid/text/Layout$Alignment;", "getTextAlignment", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;", "getTextGravity", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;)I", "Landroid/content/Context;", "context", "fragments", "Landroid/text/SpannableStringBuilder;", "sb", "", "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "ops", "", "outputReactTags", "", "buildSpannableFromFragments", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;[I)V", "buildSpannableFromFragmentsOptimized", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;[I)Landroid/text/Spannable;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "createSpannableFromAttributedString", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[I)Landroid/text/Spannable;", "text", "Landroid/text/BoringLayout$Metrics;", "boring", "", "width", "Lcom/facebook/yoga/p;", "widthYogaMeasureMode", "", ViewProps.INCLUDE_FONT_PADDING, ViewProps.TEXT_BREAK_STRATEGY, "hyphenationFrequency", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", ViewProps.ELLIPSIZE_MODE, "maxNumberOfLines", "Landroid/text/TextPaint;", "paint", "Landroid/text/Layout;", "createLayout", "(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;", "layoutWidth", "buildLayout", "(Landroid/text/Spannable;IZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;", "Lcom/facebook/react/views/text/TextAttributeProps;", "baseTextAttributes", "updateTextPaint", "(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V", "scratchPaintWithAttributes", "(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;", "newPaintWithAttributes", "paragraphAttributes", "height", "heightYogaMeasureMode", "createLayoutForMeasurement", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;", "(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)Landroid/text/Layout;", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/views/text/PreparedLayout;", "createPreparedLayout", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/views/text/PreparedLayout;", "minimumFontSizeAttr", "maximumNumberOfLines", "adjustSpannableFontToFit", "(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V", "", "attachmentsPositions", "", "measureText", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J", "preparedLayout", "measurePreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)[F", "layout", "heightMeasureMode", "getVerticalOffset", "(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;I)F", "calculateLineCount", "(Landroid/text/Layout;I)I", "Landroid/text/Spanned;", "calculatedLineCount", "calculateWidth", "(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/p;I)F", "calculateHeight", "(Landroid/text/Layout;FLcom/facebook/yoga/p;I)F", "calculatedWidth", com.google.android.material.shape.i.f35755A, "verticalOffset", "Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;", "metrics", "nextAttachmentMetrics", "(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I", "Lcom/facebook/react/bridge/WritableArray;", "measureLines", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FFLcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/bridge/WritableArray;", "isBoring", "(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;", "reactTag", "sp", "setCachedSpannableForTag", "(ILandroid/text/Spannable;)V", "deleteCachedSpannableForTag", "(I)V", "isRTL", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z", "getOrCreateSpannableForText", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;", "AS_KEY_HASH", "I", "AS_KEY_STRING", "AS_KEY_FRAGMENTS", "AS_KEY_CACHE_ID", "AS_KEY_BASE_ATTRIBUTES", "FR_KEY_STRING", "FR_KEY_REACT_TAG", "FR_KEY_IS_ATTACHMENT", "FR_KEY_WIDTH", "FR_KEY_HEIGHT", "FR_KEY_TEXT_ATTRIBUTES", "PA_KEY_MAX_NUMBER_OF_LINES", "PA_KEY_ELLIPSIZE_MODE", "PA_KEY_TEXT_BREAK_STRATEGY", "PA_KEY_ADJUST_FONT_SIZE_TO_FIT", "PA_KEY_INCLUDE_FONT_PADDING", "PA_KEY_HYPHENATION_FREQUENCY", "PA_KEY_MINIMUM_FONT_SIZE", "PA_KEY_MAXIMUM_FONT_SIZE", "PA_KEY_TEXT_ALIGN_VERTICAL", "TAG", "Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "textPaintInstance", "Ljava/lang/ThreadLocal;", "DEFAULT_INCLUDE_FONT_PADDING", "Z", "DEFAULT_ADJUST_FONT_SIZE_TO_FIT", "Ljava/util/concurrent/ConcurrentHashMap;", "tagToSpannableCache", "Ljava/util/concurrent/ConcurrentHashMap;", "FragmentAttributes", "AttachmentMetrics", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutManager.kt\ncom/facebook/react/views/text/TextLayoutManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1425:1\n1#2:1426\n*E\n"})
/* loaded from: classes2.dex */
public final class TextLayoutManager {
    public static final int AS_KEY_BASE_ATTRIBUTES = 4;
    public static final int AS_KEY_CACHE_ID = 3;
    public static final int AS_KEY_FRAGMENTS = 2;
    public static final int AS_KEY_HASH = 0;
    public static final int AS_KEY_STRING = 1;
    private static final boolean DEFAULT_ADJUST_FONT_SIZE_TO_FIT = false;
    private static final boolean DEFAULT_INCLUDE_FONT_PADDING = true;
    public static final int FR_KEY_HEIGHT = 4;
    public static final int FR_KEY_IS_ATTACHMENT = 2;
    public static final int FR_KEY_REACT_TAG = 1;
    public static final int FR_KEY_STRING = 0;
    public static final int FR_KEY_TEXT_ATTRIBUTES = 5;
    public static final int FR_KEY_WIDTH = 3;

    @NotNull
    public static final TextLayoutManager INSTANCE = new TextLayoutManager();
    public static final int PA_KEY_ADJUST_FONT_SIZE_TO_FIT = 3;
    public static final int PA_KEY_ELLIPSIZE_MODE = 1;
    public static final int PA_KEY_HYPHENATION_FREQUENCY = 5;
    public static final int PA_KEY_INCLUDE_FONT_PADDING = 4;
    public static final int PA_KEY_MAXIMUM_FONT_SIZE = 7;
    public static final int PA_KEY_MAX_NUMBER_OF_LINES = 0;
    public static final int PA_KEY_MINIMUM_FONT_SIZE = 6;
    public static final int PA_KEY_TEXT_ALIGN_VERTICAL = 8;
    public static final int PA_KEY_TEXT_BREAK_STRATEGY = 2;

    @NotNull
    private static final String TAG;

    @NotNull
    private static final ConcurrentHashMap<Integer, Spannable> tagToSpannableCache;

    @NotNull
    private static final ThreadLocal<TextPaint> textPaintInstance;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;", "", "<init>", "()V", "wasFound", "", "getWasFound", "()Z", "setWasFound", "(Z)V", ViewProps.TOP, "", "getTop", "()F", "setTop", "(F)V", ViewProps.LEFT, "getLeft", "setLeft", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttachmentMetrics {
        private float height;
        private float left;
        private float top;
        private boolean wasFound;
        private float width;

        public final float getHeight() {
            return this.height;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getTop() {
            return this.top;
        }

        public final boolean getWasFound() {
            return this.wasFound;
        }

        public final float getWidth() {
            return this.width;
        }

        public final void setHeight(float f10) {
            this.height = f10;
        }

        public final void setLeft(float f10) {
            this.left = f10;
        }

        public final void setTop(float f10) {
            this.top = f10;
        }

        public final void setWasFound(boolean z10) {
            this.wasFound = z10;
        }

        public final void setWidth(float f10) {
            this.width = f10;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;", "", "props", "Lcom/facebook/react/views/text/TextAttributeProps;", "length", "", "reactTag", "isAttachment", "", "width", "", "height", "<init>", "(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V", "getProps", "()Lcom/facebook/react/views/text/TextAttributeProps;", "getLength", "()I", "getReactTag", "()Z", "getWidth", "()D", "getHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FragmentAttributes {
        private final double height;
        private final boolean isAttachment;
        private final int length;

        @NotNull
        private final TextAttributeProps props;
        private final int reactTag;
        private final double width;

        public FragmentAttributes(@NotNull TextAttributeProps props, int i10, int i11, boolean z10, double d10, double d11) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
            this.length = i10;
            this.reactTag = i11;
            this.isAttachment = z10;
            this.width = d10;
            this.height = d11;
        }

        public final double getHeight() {
            return this.height;
        }

        public final int getLength() {
            return this.length;
        }

        @NotNull
        public final TextAttributeProps getProps() {
            return this.props;
        }

        public final int getReactTag() {
            return this.reactTag;
        }

        public final double getWidth() {
            return this.width;
        }

        /* renamed from: isAttachment, reason: from getter */
        public final boolean getIsAttachment() {
            return this.isAttachment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        String simpleName = TextLayoutManager.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        textPaintInstance = new ThreadLocal<TextPaint>() { // from class: com.facebook.react.views.text.TextLayoutManager$textPaintInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public TextPaint initialValue() {
                return new TextPaint(1);
            }
        };
        tagToSpannableCache = new ConcurrentHashMap<>();
    }

    private TextLayoutManager() {
    }

    @JvmStatic
    public static final void adjustSpannableFontToFit(@NotNull Spannable text, float width, @NotNull p widthYogaMeasureMode, float height, @NotNull p heightYogaMeasureMode, float minimumFontSizeAttr, int maximumNumberOfLines, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, @NotNull Layout.Alignment alignment, int justificationMode, @NotNull TextPaint paint) {
        int i10;
        int i11;
        Spannable text2 = text;
        TextPaint paint2 = paint;
        Intrinsics.checkNotNullParameter(text2, "text");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        Layout.Alignment alignment2 = alignment;
        Intrinsics.checkNotNullParameter(alignment2, "alignment");
        Intrinsics.checkNotNullParameter(paint2, "paint");
        BoringLayout.Metrics isBoring = INSTANCE.isBoring(text2, paint2);
        int dpToPx = (int) (Float.isNaN(minimumFontSizeAttr) ? PixelUtil.INSTANCE.dpToPx(4) : minimumFontSizeAttr);
        int i12 = 0;
        Class<ReactAbsoluteSizeSpan> cls = ReactAbsoluteSizeSpan.class;
        Iterator it = ArrayIteratorKt.iterator((ReactAbsoluteSizeSpan[]) text2.getSpans(0, text2.length(), cls));
        int i13 = dpToPx;
        while (it.hasNext()) {
            i13 = Math.max(i13, ((ReactAbsoluteSizeSpan) it.next()).getSize());
        }
        int i14 = i13;
        int i15 = dpToPx;
        while (true) {
            int i16 = ((i15 + i13) + 1) / 2;
            float f10 = i16 / i14;
            paint2.setTextSize(Math.max((int) (paint2.getTextSize() * f10), dpToPx));
            for (Iterator it2 = ArrayIteratorKt.iterator((ReactAbsoluteSizeSpan[]) text2.getSpans(i12, text2.length(), cls)); it2.hasNext(); it2 = it2) {
                ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) it2.next();
                text2.setSpan(new ReactAbsoluteSizeSpan(Math.max((int) (reactAbsoluteSizeSpan.getSize() * f10), dpToPx)), text2.getSpanStart(reactAbsoluteSizeSpan), text2.getSpanEnd(reactAbsoluteSizeSpan), text2.getSpanFlags(reactAbsoluteSizeSpan));
                text2.removeSpan(reactAbsoluteSizeSpan);
                isBoring = isBoring;
            }
            BoringLayout.Metrics metrics = isBoring;
            BoringLayout.Metrics isBoring2 = metrics != null ? INSTANCE.isBoring(text2, paint2) : metrics;
            Class<ReactAbsoluteSizeSpan> cls2 = cls;
            int i17 = i13;
            int i18 = dpToPx;
            int i19 = i15;
            Layout createLayout = INSTANCE.createLayout(text2, isBoring2, width, widthYogaMeasureMode, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment2, justificationMode, null, -1, paint2);
            if (i19 == i17) {
                return;
            }
            if (text.length() == 1) {
                i10 = 0;
                if (createLayout.getLineWidth(0) > width) {
                    i11 = 1;
                    int i20 = (heightYogaMeasureMode != p.UNDEFINED || ((float) createLayout.getHeight()) <= height) ? i10 : 1;
                    int i21 = (maximumNumberOfLines != -1 || maximumNumberOfLines == 0 || createLayout.getLineCount() <= maximumNumberOfLines) ? i10 : 1;
                    if (i16 > i18 || (i21 == 0 && i20 == 0 && i11 == 0)) {
                        i19 = i16;
                    } else {
                        i17 = i17 - i19 == 1 ? i19 : i16;
                    }
                    alignment2 = alignment;
                    paint2 = paint;
                    i12 = i10;
                    isBoring = isBoring2;
                    i14 = i16;
                    i15 = i19;
                    cls = cls2;
                    text2 = text;
                    dpToPx = i18;
                    i13 = i17;
                }
            } else {
                i10 = 0;
            }
            i11 = i10;
            if (heightYogaMeasureMode != p.UNDEFINED) {
            }
            if (maximumNumberOfLines != -1) {
            }
            if (i16 > i18) {
            }
            i19 = i16;
            alignment2 = alignment;
            paint2 = paint;
            i12 = i10;
            isBoring = isBoring2;
            i14 = i16;
            i15 = i19;
            cls = cls2;
            text2 = text;
            dpToPx = i18;
            i13 = i17;
        }
    }

    private final Layout buildLayout(Spannable text, int layoutWidth, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, Layout.Alignment alignment, int justificationMode, TextUtils.TruncateAt ellipsizeMode, int maxNumberOfLines, TextPaint paint) {
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(text, 0, text.length(), paint, layoutWidth).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(includeFontPadding).setBreakStrategy(textBreakStrategy).setHyphenationFrequency(hyphenationFrequency);
        Intrinsics.checkNotNullExpressionValue(hyphenationFrequency2, "setHyphenationFrequency(...)");
        if (maxNumberOfLines != -1 && maxNumberOfLines != 0) {
            hyphenationFrequency2.setEllipsize(ellipsizeMode).setMaxLines(maxNumberOfLines);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            hyphenationFrequency2.setJustificationMode(justificationMode);
        }
        if (i10 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 35 && ReactNativeFeatureFlags.fixTextClippingAndroid15useBoundsForWidth()) {
            hyphenationFrequency2.setUseBoundsForWidth(true);
        }
        StaticLayout build = hyphenationFrequency2.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x009a, code lost:
    
        if (com.facebook.react.internal.featureflags.ReactNativeFeatureFlags.enablePreparedTextLayout() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009c, code lost:
    
        r22.add(new com.facebook.react.views.text.internal.span.SetSpanOperation(r6, r8, new com.facebook.react.views.text.internal.span.ReactLinkSpan(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00aa, code lost:
    
        r22.add(new com.facebook.react.views.text.internal.span.SetSpanOperation(r6, r8, new com.facebook.react.views.text.internal.span.ReactClickableSpan(r11)));
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void buildSpannableFromFragments(Context context, MapBuffer fragments, SpannableStringBuilder sb2, List<SetSpanOperation> ops, int[] outputReactTags) {
        Integer backgroundColor;
        Integer color;
        int count = fragments.getCount();
        int i10 = 0;
        int i11 = 0;
        while (i11 < count) {
            MapBuffer mapBuffer = fragments.getMapBuffer(i11);
            int length = sb2.length();
            TextAttributeProps fromMapBuffer = TextAttributeProps.INSTANCE.fromMapBuffer(mapBuffer.getMapBuffer(5));
            sb2.append((CharSequence) TextTransform.INSTANCE.apply(mapBuffer.getString(i10), fromMapBuffer.getTextTransform()));
            int length2 = sb2.length();
            int i12 = mapBuffer.contains(1) ? mapBuffer.getInt(1) : -1;
            if (mapBuffer.contains(2) && mapBuffer.getBoolean(2)) {
                ops.add(new SetSpanOperation(sb2.length() - 1, sb2.length(), new TextInlineViewPlaceholderSpan(i12, (int) PixelUtil.toPixelFromSP(mapBuffer.getDouble(3)), (int) PixelUtil.toPixelFromSP(mapBuffer.getDouble(4)))));
            } else if (length2 >= length) {
                if (fromMapBuffer.getRole() != null) {
                    if (fromMapBuffer.getIsColorSet() && (color = fromMapBuffer.getColor()) != null) {
                        ops.add(new SetSpanOperation(length, length2, new ReactForegroundColorSpan(color.intValue())));
                    }
                    if (fromMapBuffer.getIsBackgroundColorSet() && (backgroundColor = fromMapBuffer.getBackgroundColor()) != null) {
                        ops.add(new SetSpanOperation(length, length2, new ReactBackgroundColorSpan(backgroundColor.intValue())));
                    }
                    if (!Float.isNaN(fromMapBuffer.getOpacity())) {
                        ops.add(new SetSpanOperation(length, length2, new ReactOpacitySpan(fromMapBuffer.getOpacity())));
                    }
                    if (!Float.isNaN(fromMapBuffer.getLetterSpacing())) {
                        ops.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(fromMapBuffer.getLetterSpacing())));
                    }
                    ops.add(new SetSpanOperation(length, length2, new ReactAbsoluteSizeSpan(fromMapBuffer.getFontSize())));
                    if (fromMapBuffer.getFontStyle() == -1 || fromMapBuffer.getFontWeight() != -1 || fromMapBuffer.getFontFamily() != null) {
                        int fontStyle = fromMapBuffer.getFontStyle();
                        int fontWeight = fromMapBuffer.getFontWeight();
                        String fontFeatureSettings = fromMapBuffer.getFontFeatureSettings();
                        String fontFamily = fromMapBuffer.getFontFamily();
                        AssetManager assets = context.getAssets();
                        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                        ops.add(new SetSpanOperation(length, length2, new CustomStyleSpan(fontStyle, fontWeight, fontFeatureSettings, fontFamily, assets)));
                    }
                    if (fromMapBuffer.getIsUnderlineTextDecorationSet()) {
                        ops.add(new SetSpanOperation(length, length2, new ReactUnderlineSpan()));
                    }
                    if (fromMapBuffer.getIsLineThroughTextDecorationSet()) {
                        ops.add(new SetSpanOperation(length, length2, new ReactStrikethroughSpan()));
                    }
                    if ((fromMapBuffer.getTextShadowOffsetDx() == 0.0f || fromMapBuffer.getTextShadowOffsetDy() != 0.0f || fromMapBuffer.getTextShadowRadius() != 0.0f) && Color.alpha(fromMapBuffer.getTextShadowColor()) != 0) {
                        ops.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(fromMapBuffer.getTextShadowOffsetDx(), fromMapBuffer.getTextShadowOffsetDy(), fromMapBuffer.getTextShadowRadius(), fromMapBuffer.getTextShadowColor())));
                    }
                    if (!Float.isNaN(fromMapBuffer.getLineHeight())) {
                        ops.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(fromMapBuffer.getLineHeight())));
                    }
                    if (ReactNativeFeatureFlags.enablePreparedTextLayout()) {
                        ops.add(new SetSpanOperation(length, length2, new ReactTagSpan(i12)));
                    } else {
                        ops.add(new SetSpanOperation(length, length2, new ReactFragmentIndexSpan(i11)));
                        if (outputReactTags != null) {
                            outputReactTags[i11] = i12;
                        }
                    }
                } else {
                    if (fromMapBuffer.getIsColorSet()) {
                        ops.add(new SetSpanOperation(length, length2, new ReactForegroundColorSpan(color.intValue())));
                    }
                    if (fromMapBuffer.getIsBackgroundColorSet()) {
                        ops.add(new SetSpanOperation(length, length2, new ReactBackgroundColorSpan(backgroundColor.intValue())));
                    }
                    if (!Float.isNaN(fromMapBuffer.getOpacity())) {
                    }
                    if (!Float.isNaN(fromMapBuffer.getLetterSpacing())) {
                    }
                    ops.add(new SetSpanOperation(length, length2, new ReactAbsoluteSizeSpan(fromMapBuffer.getFontSize())));
                    if (fromMapBuffer.getFontStyle() == -1) {
                    }
                    int fontStyle2 = fromMapBuffer.getFontStyle();
                    int fontWeight2 = fromMapBuffer.getFontWeight();
                    String fontFeatureSettings2 = fromMapBuffer.getFontFeatureSettings();
                    String fontFamily2 = fromMapBuffer.getFontFamily();
                    AssetManager assets2 = context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets2, "getAssets(...)");
                    ops.add(new SetSpanOperation(length, length2, new CustomStyleSpan(fontStyle2, fontWeight2, fontFeatureSettings2, fontFamily2, assets2)));
                    if (fromMapBuffer.getIsUnderlineTextDecorationSet()) {
                    }
                    if (fromMapBuffer.getIsLineThroughTextDecorationSet()) {
                    }
                    if (fromMapBuffer.getTextShadowOffsetDx() == 0.0f) {
                    }
                    ops.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(fromMapBuffer.getTextShadowOffsetDx(), fromMapBuffer.getTextShadowOffsetDy(), fromMapBuffer.getTextShadowRadius(), fromMapBuffer.getTextShadowColor())));
                    if (!Float.isNaN(fromMapBuffer.getLineHeight())) {
                    }
                    if (ReactNativeFeatureFlags.enablePreparedTextLayout()) {
                    }
                }
            }
            i11++;
            i10 = 0;
        }
    }

    private final Spannable buildSpannableFromFragmentsOptimized(Context context, MapBuffer fragments, int[] outputReactTags) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<FragmentAttributes> arrayList = new ArrayList(fragments.getCount());
        int count = fragments.getCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= count) {
                break;
            }
            MapBuffer mapBuffer = fragments.getMapBuffer(i11);
            TextAttributeProps fromMapBuffer = TextAttributeProps.INSTANCE.fromMapBuffer(mapBuffer.getMapBuffer(5));
            String apply = TextTransform.INSTANCE.apply(mapBuffer.getString(0), fromMapBuffer.getTextTransform());
            sb2.append(apply);
            int length = apply.length();
            int i12 = mapBuffer.contains(1) ? mapBuffer.getInt(1) : -1;
            boolean z10 = mapBuffer.contains(2) && mapBuffer.getBoolean(2);
            double d10 = Double.NaN;
            double d11 = mapBuffer.contains(3) ? mapBuffer.getDouble(3) : Double.NaN;
            if (mapBuffer.contains(4)) {
                d10 = mapBuffer.getDouble(4);
            }
            arrayList.add(new FragmentAttributes(fromMapBuffer, length, i12, z10, d11, d10));
            i11++;
        }
        SpannableString spannableString = new SpannableString(sb2);
        int i13 = 0;
        for (FragmentAttributes fragmentAttributes : arrayList) {
            int i14 = i10 + 1;
            int length2 = fragmentAttributes.getLength() + i13;
            int i15 = i13 == 0 ? 18 : 34;
            if (fragmentAttributes.getIsAttachment()) {
                spannableString.setSpan(new TextInlineViewPlaceholderSpan(fragmentAttributes.getReactTag(), (int) PixelUtil.toPixelFromSP(fragmentAttributes.getWidth()), (int) PixelUtil.toPixelFromSP(fragmentAttributes.getHeight())), i13, length2, i15);
            } else {
                if (fragmentAttributes.getProps().getRole() == null ? fragmentAttributes.getProps().getAccessibilityRole() == ReactAccessibilityDelegate.AccessibilityRole.LINK : fragmentAttributes.getProps().getRole() == ReactAccessibilityDelegate.Role.LINK) {
                    if (ReactNativeFeatureFlags.enablePreparedTextLayout()) {
                        spannableString.setSpan(new ReactLinkSpan(i10), i13, length2, i15);
                    } else {
                        spannableString.setSpan(new ReactClickableSpan(fragmentAttributes.getReactTag()), i13, length2, i15);
                    }
                }
                if (fragmentAttributes.getProps().getIsColorSet()) {
                    Integer color = fragmentAttributes.getProps().getColor();
                    spannableString.setSpan(color != null ? new ReactForegroundColorSpan(color.intValue()) : null, i13, length2, i15);
                }
                if (fragmentAttributes.getProps().getIsBackgroundColorSet()) {
                    Integer backgroundColor = fragmentAttributes.getProps().getBackgroundColor();
                    spannableString.setSpan(backgroundColor != null ? new ReactBackgroundColorSpan(backgroundColor.intValue()) : null, i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getOpacity())) {
                    spannableString.setSpan(new ReactOpacitySpan(fragmentAttributes.getProps().getOpacity()), i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getLetterSpacing())) {
                    spannableString.setSpan(new CustomLetterSpacingSpan(fragmentAttributes.getProps().getLetterSpacing()), i13, length2, i15);
                }
                spannableString.setSpan(new ReactAbsoluteSizeSpan(fragmentAttributes.getProps().getFontSize()), i13, length2, i15);
                if (fragmentAttributes.getProps().getFontStyle() != -1 || fragmentAttributes.getProps().getFontWeight() != -1 || fragmentAttributes.getProps().getFontFamily() != null) {
                    int fontStyle = fragmentAttributes.getProps().getFontStyle();
                    int fontWeight = fragmentAttributes.getProps().getFontWeight();
                    String fontFeatureSettings = fragmentAttributes.getProps().getFontFeatureSettings();
                    String fontFamily = fragmentAttributes.getProps().getFontFamily();
                    AssetManager assets = context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    spannableString.setSpan(new CustomStyleSpan(fontStyle, fontWeight, fontFeatureSettings, fontFamily, assets), i13, length2, i15);
                }
                if (fragmentAttributes.getProps().getIsUnderlineTextDecorationSet()) {
                    spannableString.setSpan(new ReactUnderlineSpan(), i13, length2, i15);
                }
                if (fragmentAttributes.getProps().getIsLineThroughTextDecorationSet()) {
                    spannableString.setSpan(new ReactStrikethroughSpan(), i13, length2, i15);
                }
                if ((fragmentAttributes.getProps().getTextShadowOffsetDx() != 0.0f || fragmentAttributes.getProps().getTextShadowOffsetDy() != 0.0f || fragmentAttributes.getProps().getTextShadowRadius() != 0.0f) && Color.alpha(fragmentAttributes.getProps().getTextShadowColor()) != 0) {
                    spannableString.setSpan(new ShadowStyleSpan(fragmentAttributes.getProps().getTextShadowOffsetDx(), fragmentAttributes.getProps().getTextShadowOffsetDy(), fragmentAttributes.getProps().getTextShadowRadius(), fragmentAttributes.getProps().getTextShadowColor()), i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getLineHeight())) {
                    spannableString.setSpan(new CustomLineHeightSpan(fragmentAttributes.getProps().getLineHeight()), i13, length2, i15);
                }
                if (ReactNativeFeatureFlags.enablePreparedTextLayout()) {
                    spannableString.setSpan(new ReactFragmentIndexSpan(i10), i13, length2, i15);
                    if (outputReactTags != null) {
                        outputReactTags[i10] = fragmentAttributes.getReactTag();
                    }
                } else {
                    spannableString.setSpan(new ReactTagSpan(fragmentAttributes.getReactTag()), i13, length2, i15);
                }
            }
            i10 = i14;
            i13 = length2;
        }
        return spannableString;
    }

    private final float calculateHeight(Layout layout, float height, p heightYogaMeasureMode, int calculatedLineCount) {
        if (heightYogaMeasureMode != p.EXACTLY) {
            float lineBottom = layout.getLineBottom(calculatedLineCount - 1);
            if (heightYogaMeasureMode != p.AT_MOST || lineBottom <= height) {
                return lineBottom;
            }
        }
        return height;
    }

    private final int calculateLineCount(Layout layout, int maximumNumberOfLines) {
        return (maximumNumberOfLines == -1 || maximumNumberOfLines == 0) ? layout.getLineCount() : Math.min(maximumNumberOfLines, layout.getLineCount());
    }

    private final float calculateWidth(Layout layout, Spanned text, float width, p widthYogaMeasureMode, int calculatedLineCount) {
        return widthYogaMeasureMode == p.EXACTLY ? width : layout.getWidth();
    }

    private final Layout createLayout(Spannable text, BoringLayout.Metrics boring, float width, p widthYogaMeasureMode, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, Layout.Alignment alignment, int justificationMode, TextUtils.TruncateAt ellipsizeMode, int maxNumberOfLines, TextPaint paint) {
        if (boring != null && (widthYogaMeasureMode == p.UNDEFINED || boring.width <= ((float) Math.floor(width)))) {
            BoringLayout make = BoringLayout.make(text, paint, widthYogaMeasureMode == p.EXACTLY ? (int) Math.floor(width) : boring.width, alignment, 1.0f, 0.0f, boring, includeFontPadding);
            Intrinsics.checkNotNullExpressionValue(make, "make(...)");
            return make;
        }
        if (Build.VERSION.SDK_INT < 35 || !ReactNativeFeatureFlags.fixTextClippingAndroid15useBoundsForWidth()) {
            int ceil = (int) Math.ceil(Layout.getDesiredWidth(text, paint));
            int i10 = WhenMappings.$EnumSwitchMapping$1[widthYogaMeasureMode.ordinal()];
            if (i10 == 1) {
                ceil = (int) Math.floor(width);
            } else if (i10 == 2) {
                ceil = Math.min(ceil, (int) Math.floor(width));
            }
            return buildLayout(text, ceil, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment, justificationMode, ellipsizeMode, maxNumberOfLines, paint);
        }
        Layout buildLayout = buildLayout(text, 1073741823, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment, justificationMode, null, -1, paint);
        int lineCount = buildLayout.getLineCount();
        float f10 = 0.0f;
        for (int i11 = 0; i11 < lineCount; i11++) {
            f10 = Math.max(f10, buildLayout.getLineRight(i11) - buildLayout.getLineLeft(i11));
        }
        return buildLayout(text, WhenMappings.$EnumSwitchMapping$1[widthYogaMeasureMode.ordinal()] == 2 ? Math.min((int) Math.ceil(f10), (int) Math.floor(width)) : (int) Math.ceil(f10), includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment, justificationMode, ellipsizeMode, maxNumberOfLines, paint);
    }

    private final Layout createLayoutForMeasurement(Context context, MapBuffer attributedString, MapBuffer paragraphAttributes, float width, p widthYogaMeasureMode, float height, p heightYogaMeasureMode, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(context, attributedString, reactTextViewManagerCallback);
        return createLayout(orCreateSpannableForText, attributedString.contains(3) ? ((ReactTextPaintHolderSpan[]) orCreateSpannableForText.getSpans(0, 0, ReactTextPaintHolderSpan.class))[0].getTextPaint() : scratchPaintWithAttributes(TextAttributeProps.INSTANCE.fromMapBuffer(attributedString.getMapBuffer(4)), context), attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode);
    }

    @JvmStatic
    @NotNull
    public static final PreparedLayout createPreparedLayout(@NotNull Context context, @NotNull ReadableMapBuffer attributedString, @NotNull ReadableMapBuffer paragraphAttributes, float width, @NotNull p widthYogaMeasureMode, float height, @NotNull p heightYogaMeasureMode, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        ReadableMapBuffer mapBuffer = attributedString.getMapBuffer(2);
        int[] iArr = new int[mapBuffer.getCount()];
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout createLayout = textLayoutManager.createLayout(textLayoutManager.createSpannableFromAttributedString(context, mapBuffer, reactTextViewManagerCallback, iArr), textLayoutManager.newPaintWithAttributes(TextAttributeProps.INSTANCE.fromMapBuffer(attributedString.getMapBuffer(4)), context), attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode);
        int i10 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        return new PreparedLayout(createLayout, i10, textLayoutManager.getVerticalOffset(createLayout, paragraphAttributes, height, heightYogaMeasureMode, i10), iArr);
    }

    private final Spannable createSpannableFromAttributedString(Context context, MapBuffer fragments, ReactTextViewManagerCallback reactTextViewManagerCallback, int[] outputReactTags) {
        if (ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations()) {
            Spannable buildSpannableFromFragmentsOptimized = buildSpannableFromFragmentsOptimized(context, fragments, outputReactTags);
            if (reactTextViewManagerCallback != null) {
                reactTextViewManagerCallback.onPostProcessSpannable(buildSpannableFromFragmentsOptimized);
            }
            return buildSpannableFromFragmentsOptimized;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        buildSpannableFromFragments(context, fragments, spannableStringBuilder, arrayList, outputReactTags);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get((arrayList.size() - i10) - 1).execute(spannableStringBuilder, i10);
        }
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    private final Layout.Alignment getTextAlignment(MapBuffer attributedString, Spannable spanned, String alignmentAttr) {
        boolean z10 = isRTL(attributedString) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        Layout.Alignment alignment = z10 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        return alignmentAttr == null ? alignment : Intrinsics.areEqual(alignmentAttr, "center") ? Layout.Alignment.ALIGN_CENTER : Intrinsics.areEqual(alignmentAttr, ViewProps.RIGHT) ? z10 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : alignment;
    }

    private final String getTextAlignmentAttr(MapBuffer attributedString) {
        if (!attributedString.contains(2)) {
            return null;
        }
        MapBuffer mapBuffer = attributedString.getMapBuffer(2);
        if (mapBuffer.getCount() != 0) {
            MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
            if (mapBuffer2.contains(12)) {
                return mapBuffer2.getString(12);
            }
        }
        return null;
    }

    @JvmStatic
    public static final int getTextGravity(@NotNull MapBuffer attributedString, @NotNull Spannable spanned) {
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout.Alignment textAlignment = textLayoutManager.getTextAlignment(attributedString, spanned, textLayoutManager.getTextAlignmentAttr(attributedString));
        boolean isRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        int i10 = WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
        if (i10 == 1) {
            return isRtl ? 5 : 3;
        }
        if (i10 == 2) {
            return isRtl ? 3 : 5;
        }
        if (i10 == 3) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getTextJustificationMode(String alignmentAttr) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        return (alignmentAttr == null || !Intrinsics.areEqual(alignmentAttr, "justified")) ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r4.equals("auto") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r4.equals(com.facebook.react.uimanager.ViewProps.TOP) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float getVerticalOffset(Layout layout, ReadableMapBuffer paragraphAttributes, float height, p heightMeasureMode, int maximumNumberOfLines) {
        String string = paragraphAttributes.contains(8) ? paragraphAttributes.getString(8) : null;
        if (string == null) {
            return 0.0f;
        }
        int height2 = layout.getHeight();
        float calculateHeight = calculateHeight(layout, height, heightMeasureMode, calculateLineCount(layout, maximumNumberOfLines));
        float f10 = height2;
        if (f10 > calculateHeight) {
            return 0.0f;
        }
        switch (string.hashCode()) {
            case -1383228885:
                if (string.equals(ViewProps.BOTTOM)) {
                    break;
                }
                E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + string);
                break;
            case -1364013995:
                if (string.equals("center")) {
                    break;
                }
                E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + string);
                break;
            case 115029:
                break;
            case 3005871:
                break;
            default:
                E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + string);
                break;
        }
        return 0.0f;
    }

    private final BoringLayout.Metrics isBoring(Spannable text, TextPaint paint) {
        BoringLayout.Metrics isBoring;
        if (Build.VERSION.SDK_INT < 33) {
            return BoringLayout.isBoring(text, paint);
        }
        isBoring = BoringLayout.isBoring(text, paint, TextDirectionHeuristics.FIRSTSTRONG_LTR, true, null);
        return isBoring;
    }

    @JvmStatic
    @NotNull
    public static final WritableArray measureLines(@NotNull Context context, @NotNull MapBuffer attributedString, @NotNull MapBuffer paragraphAttributes, float width, float height, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        TextLayoutManager textLayoutManager = INSTANCE;
        p pVar = p.EXACTLY;
        Layout createLayoutForMeasurement = textLayoutManager.createLayoutForMeasurement(context, attributedString, paragraphAttributes, width, pVar, height, pVar, reactTextViewManagerCallback);
        CharSequence text = createLayoutForMeasurement.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return FontMetricsUtil.getFontMetrics(text, createLayoutForMeasurement, context);
    }

    @JvmStatic
    @NotNull
    public static final float[] measurePreparedLayout(@NotNull PreparedLayout preparedLayout, float width, @NotNull p widthYogaMeasureMode, float height, @NotNull p heightYogaMeasureMode) {
        Intrinsics.checkNotNullParameter(preparedLayout, "preparedLayout");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        Layout layout = preparedLayout.getLayout();
        CharSequence text = layout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int maximumNumberOfLines = preparedLayout.getMaximumNumberOfLines();
        TextLayoutManager textLayoutManager = INSTANCE;
        int calculateLineCount = textLayoutManager.calculateLineCount(layout, maximumNumberOfLines);
        float calculateWidth = textLayoutManager.calculateWidth(layout, spanned, width, widthYogaMeasureMode, calculateLineCount);
        float calculateHeight = textLayoutManager.calculateHeight(layout, height, heightYogaMeasureMode, calculateLineCount);
        ArrayList arrayList = new ArrayList();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        arrayList.add(Float.valueOf(pixelUtil.pxToDp(calculateWidth)));
        arrayList.add(Float.valueOf(pixelUtil.pxToDp(calculateHeight)));
        AttachmentMetrics attachmentMetrics = new AttachmentMetrics();
        int i10 = 0;
        while (i10 < spanned.length()) {
            i10 = textLayoutManager.nextAttachmentMetrics(layout, spanned, calculateWidth, calculateLineCount, i10, preparedLayout.getVerticalOffset(), attachmentMetrics);
            if (attachmentMetrics.getWasFound()) {
                PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getTop())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getLeft())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getWidth())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getHeight())));
            }
        }
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            fArr[i11] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    @JvmStatic
    public static final long measureText(@NotNull Context context, @NotNull MapBuffer attributedString, @NotNull MapBuffer paragraphAttributes, float width, @NotNull p widthYogaMeasureMode, float height, @NotNull p heightYogaMeasureMode, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback, @Nullable float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout createLayoutForMeasurement = textLayoutManager.createLayoutForMeasurement(context, attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode, reactTextViewManagerCallback);
        int i10 = 0;
        int i11 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        CharSequence text = createLayoutForMeasurement.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int calculateLineCount = textLayoutManager.calculateLineCount(createLayoutForMeasurement, i11);
        float calculateWidth = textLayoutManager.calculateWidth(createLayoutForMeasurement, spanned, width, widthYogaMeasureMode, calculateLineCount);
        float calculateHeight = textLayoutManager.calculateHeight(createLayoutForMeasurement, height, heightYogaMeasureMode, calculateLineCount);
        if (attachmentsPositions != null) {
            AttachmentMetrics attachmentMetrics = new AttachmentMetrics();
            int i12 = 0;
            while (i10 < spanned.length()) {
                i10 = INSTANCE.nextAttachmentMetrics(createLayoutForMeasurement, spanned, calculateWidth, calculateLineCount, i10, 0.0f, attachmentMetrics);
                if (attachmentMetrics.getWasFound()) {
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    attachmentsPositions[i12] = pixelUtil.pxToDp(attachmentMetrics.getTop());
                    attachmentsPositions[i12 + 1] = pixelUtil.pxToDp(attachmentMetrics.getLeft());
                    i12 += 2;
                }
            }
        }
        PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
        return q.a(pixelUtil2.pxToDp(calculateWidth), pixelUtil2.pxToDp(calculateHeight));
    }

    private final TextPaint newPaintWithAttributes(TextAttributeProps baseTextAttributes, Context context) {
        TextPaint textPaint = new TextPaint(1);
        updateTextPaint(textPaint, baseTextAttributes, context);
        return textPaint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r10 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int nextAttachmentMetrics(Layout layout, Spanned text, float calculatedWidth, int calculatedLineCount, int i10, float verticalOffset, AttachmentMetrics metrics) {
        float primaryHorizontal;
        int nextSpanTransition = text.nextSpanTransition(i10, text.length(), TextInlineViewPlaceholderSpan.class);
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) text.getSpans(i10, nextSpanTransition, TextInlineViewPlaceholderSpan.class);
        if (textInlineViewPlaceholderSpanArr.length == 0) {
            metrics.setWasFound(false);
            return nextSpanTransition;
        }
        S7.a.a(textInlineViewPlaceholderSpanArr.length == 1);
        TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr[0];
        int spanStart = text.getSpanStart(textInlineViewPlaceholderSpan);
        int lineForOffset = layout.getLineForOffset(spanStart);
        boolean z10 = layout.getEllipsisCount(lineForOffset) > 0;
        if (lineForOffset > calculatedLineCount || (z10 && spanStart >= layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset))) {
            metrics.setTop(Float.NaN);
            metrics.setLeft(Float.NaN);
        } else {
            float width = textInlineViewPlaceholderSpan.getWidth();
            float height = textInlineViewPlaceholderSpan.getHeight();
            boolean isRtlCharAt = layout.isRtlCharAt(spanStart);
            boolean z11 = layout.getParagraphDirection(lineForOffset) == -1;
            if (ReactNativeFeatureFlags.disableOldAndroidAttachmentMetricsWorkarounds() || spanStart != text.length() - 1) {
                primaryHorizontal = z11 == isRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart);
                if (!ReactNativeFeatureFlags.disableOldAndroidAttachmentMetricsWorkarounds() && z11 && !isRtlCharAt) {
                    primaryHorizontal = calculatedWidth - (layout.getLineRight(lineForOffset) - primaryHorizontal);
                }
            } else {
                float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(lineForOffset) - 1) != '\n') ? layout.getLineWidth(lineForOffset) : layout.getLineMax(lineForOffset);
                if (z11) {
                    primaryHorizontal = calculatedWidth - lineWidth;
                    metrics.setTop(layout.getLineBaseline(lineForOffset) - height);
                    metrics.setLeft(primaryHorizontal);
                } else {
                    primaryHorizontal = layout.getLineRight(lineForOffset);
                    primaryHorizontal -= width;
                    metrics.setTop(layout.getLineBaseline(lineForOffset) - height);
                    metrics.setLeft(primaryHorizontal);
                }
            }
        }
        metrics.setTop(metrics.getTop() + verticalOffset);
        metrics.setWasFound(true);
        metrics.setWidth(textInlineViewPlaceholderSpan.getWidth());
        metrics.setHeight(textInlineViewPlaceholderSpan.getHeight());
        return nextSpanTransition;
    }

    private final TextPaint scratchPaintWithAttributes(TextAttributeProps baseTextAttributes, Context context) {
        TextPaint textPaint = textPaintInstance.get();
        if (textPaint == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TextPaint textPaint2 = textPaint;
        textPaint2.setTypeface(null);
        textPaint2.setTextSize(12.0f);
        textPaint2.setFakeBoldText(false);
        textPaint2.setTextSkewX(0.0f);
        updateTextPaint(textPaint2, baseTextAttributes, context);
        return textPaint2;
    }

    private final void updateTextPaint(TextPaint paint, TextAttributeProps baseTextAttributes, Context context) {
        if (baseTextAttributes.getFontSize() != -1) {
            paint.setTextSize(baseTextAttributes.getFontSize());
        }
        if (baseTextAttributes.getFontStyle() == -1 && baseTextAttributes.getFontWeight() == -1 && baseTextAttributes.getFontFamily() == null) {
            return;
        }
        int fontStyle = baseTextAttributes.getFontStyle();
        int fontWeight = baseTextAttributes.getFontWeight();
        String fontFamily = baseTextAttributes.getFontFamily();
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        Typeface applyStyles = ReactTypefaceUtils.applyStyles(null, fontStyle, fontWeight, fontFamily, assets);
        paint.setTypeface(applyStyles);
        if (baseTextAttributes.getFontStyle() == -1 || baseTextAttributes.getFontStyle() == applyStyles.getStyle()) {
            return;
        }
        int fontStyle2 = baseTextAttributes.getFontStyle() & (~applyStyles.getStyle());
        paint.setFakeBoldText((fontStyle2 & 1) != 0);
        paint.setTextSkewX((fontStyle2 & 2) != 0 ? -0.25f : 0.0f);
    }

    public final void deleteCachedSpannableForTag(int reactTag) {
        tagToSpannableCache.remove(Integer.valueOf(reactTag));
    }

    @NotNull
    public final Spannable getOrCreateSpannableForText(@NotNull Context context, @NotNull MapBuffer attributedString, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        if (!attributedString.contains(3)) {
            return createSpannableFromAttributedString(context, attributedString.getMapBuffer(2), reactTextViewManagerCallback, null);
        }
        Spannable spannable = tagToSpannableCache.get(Integer.valueOf(attributedString.getInt(3)));
        if (spannable != null) {
            return spannable;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean isRTL(@NotNull MapBuffer attributedString) {
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        if (!attributedString.contains(2)) {
            return false;
        }
        MapBuffer mapBuffer = attributedString.getMapBuffer(2);
        if (mapBuffer.getCount() == 0) {
            return false;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
        return mapBuffer2.contains(23) && TextAttributeProps.INSTANCE.getLayoutDirection(mapBuffer2.getString(23)) == 1;
    }

    public final void setCachedSpannableForTag(int reactTag, @NotNull Spannable sp) {
        Intrinsics.checkNotNullParameter(sp, "sp");
        tagToSpannableCache.put(Integer.valueOf(reactTag), sp);
    }

    private final Layout createLayout(Spannable text, TextPaint paint, MapBuffer attributedString, MapBuffer paragraphAttributes, float width, p widthYogaMeasureMode, float height, p heightYogaMeasureMode) {
        Spannable spannable;
        TextPaint textPaint;
        BoringLayout.Metrics metrics;
        TextUtils.TruncateAt truncateAt;
        boolean z10;
        int i10;
        int i11;
        BoringLayout.Metrics isBoring = isBoring(text, paint);
        TextAttributeProps.Companion companion = TextAttributeProps.INSTANCE;
        int textBreakStrategy = companion.getTextBreakStrategy(paragraphAttributes.getString(2));
        boolean z11 = paragraphAttributes.contains(4) ? paragraphAttributes.getBoolean(4) : true;
        int hyphenationFrequency = companion.getHyphenationFrequency(paragraphAttributes.getString(5));
        boolean z12 = paragraphAttributes.contains(3) ? paragraphAttributes.getBoolean(3) : false;
        int i12 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        TextUtils.TruncateAt ellipsizeMode = paragraphAttributes.contains(1) ? companion.getEllipsizeMode(paragraphAttributes.getString(1)) : null;
        String textAlignmentAttr = getTextAlignmentAttr(attributedString);
        Layout.Alignment textAlignment = getTextAlignment(attributedString, text, textAlignmentAttr);
        int textJustificationMode = getTextJustificationMode(textAlignmentAttr);
        if (z12) {
            adjustSpannableFontToFit(text, width, p.EXACTLY, height, heightYogaMeasureMode, paragraphAttributes.contains(6) ? (float) paragraphAttributes.getDouble(6) : Float.NaN, i12, z11, textBreakStrategy, hyphenationFrequency, textAlignment, textJustificationMode, paint);
            i12 = i12;
            textAlignment = textAlignment;
            textJustificationMode = textJustificationMode;
            spannable = text;
            metrics = isBoring;
            truncateAt = ellipsizeMode;
            z10 = z11;
            i10 = textBreakStrategy;
            i11 = hyphenationFrequency;
            textPaint = paint;
        } else {
            spannable = text;
            textPaint = paint;
            metrics = isBoring;
            truncateAt = ellipsizeMode;
            z10 = z11;
            i10 = textBreakStrategy;
            i11 = hyphenationFrequency;
        }
        return createLayout(spannable, metrics, width, widthYogaMeasureMode, z10, i10, i11, textAlignment, textJustificationMode, truncateAt, i12, textPaint);
    }
}
