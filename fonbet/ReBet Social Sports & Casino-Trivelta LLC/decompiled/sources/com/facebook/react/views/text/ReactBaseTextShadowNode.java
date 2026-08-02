package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "This class is part of Legacy Architecture and will be removed in a future release")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \u0091\u00012\u00020\u0001:\u0002\u0091\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00002\b\u0010l\u001a\u0004\u0018\u00010?2\u0006\u0010m\u001a\u00020\u00102\b\u0010n\u001a\u0004\u0018\u00010oH\u0004J\u0010\u0010p\u001a\u00020q2\u0006\u0010,\u001a\u00020\u0015H\u0007J\u0010\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020LH\u0007J\u0010\u0010t\u001a\u00020q2\u0006\u0010u\u001a\u00020LH\u0007J\u0010\u0010v\u001a\u00020q2\u0006\u0010w\u001a\u00020\u0010H\u0007J\u0010\u0010x\u001a\u00020q2\u0006\u0010y\u001a\u00020LH\u0007J\u0012\u0010z\u001a\u00020q2\b\u00107\u001a\u0004\u0018\u00010?H\u0007J\u0010\u0010{\u001a\u00020q2\u0006\u0010|\u001a\u00020LH\u0007J\u0017\u0010\u0018\u001a\u00020q2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010}J\u0017\u0010\u001e\u001a\u00020q2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010}J\u0012\u0010#\u001a\u00020q2\b\u0010\u001f\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010)\u001a\u00020q2\b\u0010%\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010~\u001a\u00020q2\b\u0010@\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010>\u001a\u00020q2\b\u0010\u007f\u001a\u0004\u0018\u00010?H\u0007J\u0015\u0010\u0080\u0001\u001a\u00020q2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0007J\u0013\u0010;\u001a\u00020q2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010\u0084\u0001\u001a\u00020q2\u0007\u0010\u0085\u0001\u001a\u00020\u0010H\u0007J\u0014\u0010\u0086\u0001\u001a\u00020q2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010?H\u0007J\u0012\u00100\u001a\u00020q2\b\u0010.\u001a\u0004\u0018\u00010?H\u0017J\u0015\u0010\u0088\u0001\u001a\u00020q2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0007J\u0011\u0010\u008b\u0001\u001a\u00020q2\u0006\u0010W\u001a\u00020LH\u0007J\u0011\u0010\u008c\u0001\u001a\u00020q2\u0006\u0010Y\u001a\u00020\u0015H\u0007J\u0014\u0010\u008d\u0001\u001a\u00020q2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010?H\u0007J\u0011\u0010\u008f\u0001\u001a\u00020q2\u0006\u0010I\u001a\u00020\u0010H\u0007J\u0011\u0010\u0090\u0001\u001a\u00020q2\u0006\u0010M\u001a\u00020LH\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0017R\u001a\u0010.\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\u001a\u00101\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001a\u00104\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010\u0019R \u00107\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00158D@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0017R\u001a\u00109\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019R\u001a\u0010<\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R\"\u0010@\u001a\u0004\u0018\u00010?2\b\u0010+\u001a\u0004\u0018\u00010?@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010?X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010B\"\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0011R\u001a\u0010I\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0011\"\u0004\bK\u0010\u0013R\u001e\u0010M\u001a\u00020L2\u0006\u0010+\u001a\u00020L@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020LX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010O\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020LX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010O\"\u0004\bV\u0010SR\u001e\u0010W\u001a\u00020L2\u0006\u0010+\u001a\u00020L@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bX\u0010OR\u001e\u0010Y\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0017R\u001a\u0010[\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0011\"\u0004\b\\\u0010\u0013R\u001a\u0010]\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0011\"\u0004\b^\u0010\u0013R\u001a\u0010_\u001a\u00020\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0011\"\u0004\ba\u0010\u0013R,\u0010b\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030d\u0018\u00010cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006\u0092\u0001"}, d2 = {"Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "reactTextViewManagerCallback", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "setReactTextViewManagerCallback", "textAttributes", "Lcom/facebook/react/views/text/TextAttributes;", "getTextAttributes", "()Lcom/facebook/react/views/text/TextAttributes;", "setTextAttributes", "(Lcom/facebook/react/views/text/TextAttributes;)V", "isColorSet", "", "()Z", "setColorSet", "(Z)V", ViewProps.COLOR, "", "getColor", "()I", "setColor", "(I)V", "isBackgroundColorSet", "setBackgroundColorSet", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "setBackgroundColor", ViewProps.ACCESSIBILITY_ROLE, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "getAccessibilityRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "setAccessibilityRole", "(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;)V", ViewProps.ROLE, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "getRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "setRole", "(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;)V", EventKeys.VALUE_KEY, ViewProps.NUMBER_OF_LINES, "getNumberOfLines", ViewProps.TEXT_BREAK_STRATEGY, "getTextBreakStrategy", "setTextBreakStrategy", "hyphenationFrequency", "getHyphenationFrequency", "setHyphenationFrequency", "justificationMode", "getJustificationMode", "setJustificationMode", ViewProps.TEXT_ALIGN, "getTextAlign", ViewProps.FONT_STYLE, "getFontStyle", "setFontStyle", ViewProps.FONT_WEIGHT, "getFontWeight", "setFontWeight", "", ViewProps.FONT_FAMILY, "getFontFamily", "()Ljava/lang/String;", "fontFeatureSettings", "getFontFeatureSettings", "setFontFeatureSettings", "(Ljava/lang/String;)V", ViewProps.INCLUDE_FONT_PADDING, "getIncludeFontPadding", ViewProps.ADJUSTS_FONT_SIZE_TO_FIT, "getAdjustsFontSizeToFit", "setAdjustsFontSizeToFit", "", ViewProps.MINIMUM_FONT_SCALE, "getMinimumFontScale", "()F", "textShadowOffsetDx", "getTextShadowOffsetDx", "setTextShadowOffsetDx", "(F)V", "textShadowOffsetDy", "getTextShadowOffsetDy", "setTextShadowOffsetDy", ReactBaseTextShadowNode.PROP_SHADOW_RADIUS, "getTextShadowRadius", ReactBaseTextShadowNode.PROP_SHADOW_COLOR, "getTextShadowColor", "isUnderlineTextDecorationSet", "setUnderlineTextDecorationSet", "isLineThroughTextDecorationSet", "setLineThroughTextDecorationSet", "containsImages", "getContainsImages", "setContainsImages", "inlineViews", "", "Lcom/facebook/react/uimanager/ReactShadowNode;", "getInlineViews", "()Ljava/util/Map;", "setInlineViews", "(Ljava/util/Map;)V", "spannedFromShadowNode", "Landroid/text/Spannable;", "textShadowNode", "text", "supportsInlineViews", "nativeViewHierarchyOptimizer", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "setNumberOfLines", "", "setLineHeight", ViewProps.LINE_HEIGHT, "setLetterSpacing", ViewProps.LETTER_SPACING, "setAllowFontScaling", ViewProps.ALLOW_FONT_SCALING, "setMaxFontSizeMultiplier", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setTextAlign", "setFontSize", ViewProps.FONT_SIZE, "(Ljava/lang/Integer;)V", "setFontFamily", "fontWeightString", "setFontVariant", "fontVariantArray", "Lcom/facebook/react/bridge/ReadableArray;", "fontStyleString", "setIncludeFontPadding", "includepad", "setTextDecorationLine", "textDecorationLineString", "setTextShadowOffset", "offsetMap", "Lcom/facebook/react/bridge/ReadableMap;", "setTextShadowRadius", "setTextShadowColor", "setTextTransform", ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "setAdjustFontSizeToFit", "setMinimumFontScale", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactBaseTextShadowNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactBaseTextShadowNode.kt\ncom/facebook/react/views/text/ReactBaseTextShadowNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,678:1\n739#2,9:679\n37#3:688\n36#3,3:689\n*S KotlinDebug\n*F\n+ 1 ReactBaseTextShadowNode.kt\ncom/facebook/react/views/text/ReactBaseTextShadowNode\n*L\n398#1:679,9\n398#1:688\n398#1:689,3\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;

    @NotNull
    private static final String INLINE_VIEW_PLACEHOLDER = "0";

    @NotNull
    public static final String PROP_SHADOW_COLOR = "textShadowColor";

    @NotNull
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";

    @NotNull
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";

    @NotNull
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";

    @NotNull
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";

    @NotNull
    public static final String PROP_TEXT_TRANSFORM = "textTransform";

    @Nullable
    private ReactAccessibilityDelegate.AccessibilityRole accessibilityRole;
    private boolean adjustsFontSizeToFit;
    private int backgroundColor;
    private int color;
    private boolean containsImages;

    @Nullable
    private String fontFamily;

    @Nullable
    private String fontFeatureSettings;
    private int fontStyle;
    private int fontWeight;
    private int hyphenationFrequency;
    private boolean includeFontPadding;

    @Nullable
    private Map<Integer, ? extends ReactShadowNode<?>> inlineViews;
    private boolean isBackgroundColorSet;
    private boolean isColorSet;
    private boolean isLineThroughTextDecorationSet;
    private boolean isUnderlineTextDecorationSet;
    private int justificationMode;
    private float minimumFontScale;
    private int numberOfLines;

    @Nullable
    private ReactTextViewManagerCallback reactTextViewManagerCallback;

    @Nullable
    private ReactAccessibilityDelegate.Role role;
    private int textAlign;

    @NotNull
    private TextAttributes textAttributes;
    private int textBreakStrategy;
    private int textShadowColor;
    private float textShadowOffsetDx;
    private float textShadowOffsetDy;
    private float textShadowRadius;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/views/text/ReactBaseTextShadowNode$Companion;", "", "<init>", "()V", "INLINE_VIEW_PLACEHOLDER", "", "PROP_SHADOW_OFFSET", "PROP_SHADOW_OFFSET_WIDTH", "PROP_SHADOW_OFFSET_HEIGHT", "PROP_SHADOW_RADIUS", "PROP_SHADOW_COLOR", "PROP_TEXT_TRANSFORM", "DEFAULT_TEXT_SHADOW_COLOR", "", "buildSpannedFromShadowNode", "", "textShadowNode", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "sb", "Landroid/text/SpannableStringBuilder;", "ops", "", "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "parentTextAttributes", "Lcom/facebook/react/views/text/TextAttributes;", "supportsInlineViews", "", "inlineViews", "", "Lcom/facebook/react/uimanager/ReactShadowNode;", ViewProps.START, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void buildSpannedFromShadowNode(ReactBaseTextShadowNode textShadowNode, SpannableStringBuilder sb2, List<SetSpanOperation> ops, TextAttributes parentTextAttributes, boolean supportsInlineViews, Map<Integer, ReactShadowNode<?>> inlineViews, int start) {
            TextAttributes textAttributes;
            float layoutWidth;
            float layoutHeight;
            if (parentTextAttributes == null || (textAttributes = parentTextAttributes.applyChild(textShadowNode.getTextAttributes())) == null) {
                textAttributes = textShadowNode.getTextAttributes();
            }
            TextAttributes textAttributes2 = textAttributes;
            int childCount = textShadowNode.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ReactShadowNodeImpl childAt = textShadowNode.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt instanceof ReactBaseTextShadowNode) {
                    buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, sb2, ops, textAttributes2, supportsInlineViews, inlineViews, sb2.length());
                } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                    sb2.append(ReactBaseTextShadowNode.INLINE_VIEW_PLACEHOLDER);
                    ops.add(new SetSpanOperation(sb2.length() - 1, sb2.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
                } else {
                    if (!supportsInlineViews) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    YogaValue styleWidth = childAt.getStyleWidth();
                    YogaValue styleHeight = childAt.getStyleHeight();
                    w wVar = styleWidth.f31653b;
                    w wVar2 = w.POINT;
                    if (wVar == wVar2 && styleHeight.f31653b == wVar2) {
                        layoutWidth = styleWidth.f31652a;
                        layoutHeight = styleHeight.f31652a;
                    } else {
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    sb2.append(ReactBaseTextShadowNode.INLINE_VIEW_PLACEHOLDER);
                    ops.add(new SetSpanOperation(sb2.length() - 1, sb2.length(), new TextInlineViewPlaceholderSpan(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    if (inlineViews == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inlineViews.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            int length = sb2.length();
            if (length >= start) {
                if (textShadowNode.getIsColorSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactForegroundColorSpan(textShadowNode.getColor())));
                }
                if (textShadowNode.getIsBackgroundColorSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactBackgroundColorSpan(textShadowNode.getBackgroundColor())));
                }
                if (textShadowNode.getRole() == null ? textShadowNode.getAccessibilityRole() == ReactAccessibilityDelegate.AccessibilityRole.LINK : textShadowNode.getRole() == ReactAccessibilityDelegate.Role.LINK) {
                    ops.add(new SetSpanOperation(start, length, new ReactClickableSpan(textShadowNode.getReactTag())));
                }
                float effectiveLetterSpacing = textAttributes2.getEffectiveLetterSpacing();
                if (!Float.isNaN(effectiveLetterSpacing) && (parentTextAttributes == null || parentTextAttributes.getEffectiveLetterSpacing() != effectiveLetterSpacing)) {
                    ops.add(new SetSpanOperation(start, length, new CustomLetterSpacingSpan(effectiveLetterSpacing)));
                }
                int effectiveFontSize = textAttributes2.getEffectiveFontSize();
                if (parentTextAttributes == null || parentTextAttributes.getEffectiveFontSize() != effectiveFontSize) {
                    ops.add(new SetSpanOperation(start, length, new ReactAbsoluteSizeSpan(effectiveFontSize)));
                }
                if (textShadowNode.getFontStyle() != -1 || textShadowNode.getFontWeight() != -1 || textShadowNode.getFontFamily() != null) {
                    int fontStyle = textShadowNode.getFontStyle();
                    int fontWeight = textShadowNode.getFontWeight();
                    String fontFeatureSettings = textShadowNode.getFontFeatureSettings();
                    String fontFamily = textShadowNode.getFontFamily();
                    AssetManager assets = textShadowNode.getThemedContext().getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    ops.add(new SetSpanOperation(start, length, new CustomStyleSpan(fontStyle, fontWeight, fontFeatureSettings, fontFamily, assets)));
                }
                if (textShadowNode.getIsUnderlineTextDecorationSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactUnderlineSpan()));
                }
                if (textShadowNode.getIsLineThroughTextDecorationSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactStrikethroughSpan()));
                }
                if ((textShadowNode.getTextShadowOffsetDx() != 0.0f || textShadowNode.getTextShadowOffsetDy() != 0.0f || textShadowNode.getTextShadowRadius() != 0.0f) && Color.alpha(textShadowNode.getTextShadowColor()) != 0) {
                    ops.add(new SetSpanOperation(start, length, new ShadowStyleSpan(textShadowNode.getTextShadowOffsetDx(), textShadowNode.getTextShadowOffsetDy(), textShadowNode.getTextShadowRadius(), textShadowNode.getTextShadowColor())));
                }
                float effectiveLineHeight = textAttributes2.getEffectiveLineHeight();
                if (!Float.isNaN(effectiveLineHeight) && (parentTextAttributes == null || parentTextAttributes.getEffectiveLineHeight() != effectiveLineHeight)) {
                    ops.add(new SetSpanOperation(start, length, new CustomLineHeightSpan(effectiveLineHeight)));
                }
                ops.add(new SetSpanOperation(start, length, new ReactTagSpan(textShadowNode.getReactTag())));
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ReactBaseTextShadowNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.accessibilityRole;
    }

    public final boolean getAdjustsFontSizeToFit() {
        return this.adjustsFontSizeToFit;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getContainsImages() {
        return this.containsImages;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getFontWeight() {
        return this.fontWeight;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    @Nullable
    public final Map<Integer, ReactShadowNode<?>> getInlineViews() {
        return this.inlineViews;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final float getMinimumFontScale() {
        return this.minimumFontScale;
    }

    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    @Nullable
    public final ReactTextViewManagerCallback getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Nullable
    public final ReactAccessibilityDelegate.Role getRole() {
        return this.role;
    }

    public final int getTextAlign() {
        if (getLayoutDirection() != com.facebook.yoga.h.RTL) {
            return this.textAlign;
        }
        int i10 = this.textAlign;
        if (i10 == 3) {
            return 5;
        }
        if (i10 != 5) {
            return i10;
        }
        return 3;
    }

    @NotNull
    public final TextAttributes getTextAttributes() {
        return this.textAttributes;
    }

    public final int getTextBreakStrategy() {
        return this.textBreakStrategy;
    }

    public final int getTextShadowColor() {
        return this.textShadowColor;
    }

    public final float getTextShadowOffsetDx() {
        return this.textShadowOffsetDx;
    }

    public final float getTextShadowOffsetDy() {
        return this.textShadowOffsetDy;
    }

    public final float getTextShadowRadius() {
        return this.textShadowRadius;
    }

    /* renamed from: isBackgroundColorSet, reason: from getter */
    public final boolean getIsBackgroundColorSet() {
        return this.isBackgroundColorSet;
    }

    /* renamed from: isColorSet, reason: from getter */
    public final boolean getIsColorSet() {
        return this.isColorSet;
    }

    /* renamed from: isLineThroughTextDecorationSet, reason: from getter */
    public final boolean getIsLineThroughTextDecorationSet() {
        return this.isLineThroughTextDecorationSet;
    }

    /* renamed from: isUnderlineTextDecorationSet, reason: from getter */
    public final boolean getIsUnderlineTextDecorationSet() {
        return this.isUnderlineTextDecorationSet;
    }

    public final void setAccessibilityRole(@Nullable ReactAccessibilityDelegate.AccessibilityRole accessibilityRole) {
        this.accessibilityRole = accessibilityRole;
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public final void setAdjustFontSizeToFit(boolean adjustsFontSizeToFit) {
        if (adjustsFontSizeToFit != this.adjustsFontSizeToFit) {
            this.adjustsFontSizeToFit = adjustsFontSizeToFit;
            markUpdated();
        }
    }

    public final void setAdjustsFontSizeToFit(boolean z10) {
        this.adjustsFontSizeToFit = z10;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public final void setAllowFontScaling(boolean allowFontScaling) {
        if (allowFontScaling != this.textAttributes.getAllowFontScaling()) {
            this.textAttributes.setAllowFontScaling(allowFontScaling);
            markUpdated();
        }
    }

    public final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setBackgroundColorSet(boolean z10) {
        this.isBackgroundColorSet = z10;
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setColorSet(boolean z10) {
        this.isColorSet = z10;
    }

    public final void setContainsImages(boolean z10) {
        this.containsImages = z10;
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public final void setFontFamily(@Nullable String fontFamily) {
        this.fontFamily = fontFamily;
        markUpdated();
    }

    public final void setFontFeatureSettings(@Nullable String str) {
        this.fontFeatureSettings = str;
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.FONT_SIZE)
    public final void setFontSize(float fontSize) {
        this.textAttributes.setFontSize(fontSize);
        markUpdated();
    }

    public final void setFontStyle(int i10) {
        this.fontStyle = i10;
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public final void setFontVariant(@Nullable ReadableArray fontVariantArray) {
        String parseFontVariant = ReactTypefaceUtils.parseFontVariant(fontVariantArray);
        if (Intrinsics.areEqual(parseFontVariant, this.fontFeatureSettings)) {
            return;
        }
        this.fontFeatureSettings = parseFontVariant;
        markUpdated();
    }

    public final void setFontWeight(int i10) {
        this.fontWeight = i10;
    }

    public final void setHyphenationFrequency(int i10) {
        this.hyphenationFrequency = i10;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding(boolean includepad) {
        this.includeFontPadding = includepad;
    }

    public final void setInlineViews(@Nullable Map<Integer, ? extends ReactShadowNode<?>> map) {
        this.inlineViews = map;
    }

    public final void setJustificationMode(int i10) {
        this.justificationMode = i10;
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing(float letterSpacing) {
        this.textAttributes.setLetterSpacing(letterSpacing);
        markUpdated();
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.LINE_HEIGHT)
    public final void setLineHeight(float lineHeight) {
        this.textAttributes.setLineHeight(lineHeight);
        markUpdated();
    }

    public final void setLineThroughTextDecorationSet(boolean z10) {
        this.isLineThroughTextDecorationSet = z10;
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public final void setMaxFontSizeMultiplier(float maxFontSizeMultiplier) {
        if (maxFontSizeMultiplier == this.textAttributes.getMaxFontSizeMultiplier()) {
            return;
        }
        this.textAttributes.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
        markUpdated();
    }

    @ReactProp(name = ViewProps.MINIMUM_FONT_SCALE)
    public final void setMinimumFontScale(float minimumFontScale) {
        if (minimumFontScale == this.minimumFontScale) {
            return;
        }
        this.minimumFontScale = minimumFontScale;
        markUpdated();
    }

    @ReactProp(defaultInt = -1, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumberOfLines(int numberOfLines) {
        if (numberOfLines == 0) {
            numberOfLines = -1;
        }
        this.numberOfLines = numberOfLines;
        markUpdated();
    }

    public final void setReactTextViewManagerCallback(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    public final void setRole(@Nullable ReactAccessibilityDelegate.Role role) {
        this.role = role;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r6.equals(com.facebook.react.uimanager.ViewProps.LEFT) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r6.equals("auto") == false) goto L27;
     */
    @ReactProp(name = ViewProps.TEXT_ALIGN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlign(@Nullable String textAlign) {
        int i10 = 3;
        if (Intrinsics.areEqual("justify", textAlign)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.justificationMode = 1;
            }
            this.textAlign = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.justificationMode = 0;
            }
            if (textAlign != null) {
                switch (textAlign.hashCode()) {
                    case -1364013995:
                        if (textAlign.equals("center")) {
                            i10 = 1;
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                        break;
                    case 3005871:
                        break;
                    case 3317767:
                        break;
                    case 108511772:
                        if (textAlign.equals(ViewProps.RIGHT)) {
                            i10 = 5;
                            break;
                        }
                        E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                        break;
                    default:
                        E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                        break;
                }
                this.textAlign = i10;
            }
            i10 = 0;
            this.textAlign = i10;
        }
        markUpdated();
    }

    public final void setTextAttributes(@NotNull TextAttributes textAttributes) {
        Intrinsics.checkNotNullParameter(textAttributes, "<set-?>");
        this.textAttributes = textAttributes;
    }

    public final void setTextBreakStrategy(int i10) {
        this.textBreakStrategy = i10;
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public final void setTextDecorationLine(@Nullable String textDecorationLineString) {
        List emptyList;
        this.isUnderlineTextDecorationSet = false;
        this.isLineThroughTextDecorationSet = false;
        if (textDecorationLineString != null) {
            List split$default = StringsKt.split$default((CharSequence) textDecorationLineString, new String[]{" "}, false, 0, 6, (Object) null);
            if (!split$default.isEmpty()) {
                ListIterator listIterator = split$default.listIterator(split$default.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        emptyList = CollectionsKt.take(split$default, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            for (String str : (String[]) emptyList.toArray(new String[0])) {
                if (Intrinsics.areEqual("underline", str)) {
                    this.isUnderlineTextDecorationSet = true;
                } else if (Intrinsics.areEqual("line-through", str)) {
                    this.isLineThroughTextDecorationSet = true;
                }
            }
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = DEFAULT_TEXT_SHADOW_COLOR, name = PROP_SHADOW_COLOR)
    public final void setTextShadowColor(int textShadowColor) {
        if (textShadowColor != this.textShadowColor) {
            this.textShadowColor = textShadowColor;
            markUpdated();
        }
    }

    @ReactProp(name = PROP_SHADOW_OFFSET)
    public final void setTextShadowOffset(@Nullable ReadableMap offsetMap) {
        this.textShadowOffsetDx = 0.0f;
        this.textShadowOffsetDy = 0.0f;
        if (offsetMap != null) {
            if (offsetMap.hasKey("width") && !offsetMap.isNull("width")) {
                this.textShadowOffsetDx = PixelUtil.toPixelFromDIP(offsetMap.getDouble("width"));
            }
            if (offsetMap.hasKey("height") && !offsetMap.isNull("height")) {
                this.textShadowOffsetDy = PixelUtil.toPixelFromDIP(offsetMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    public final void setTextShadowOffsetDx(float f10) {
        this.textShadowOffsetDx = f10;
    }

    public final void setTextShadowOffsetDy(float f10) {
        this.textShadowOffsetDy = f10;
    }

    @ReactProp(defaultInt = 1, name = PROP_SHADOW_RADIUS)
    public final void setTextShadowRadius(float textShadowRadius) {
        if (textShadowRadius == this.textShadowRadius) {
            return;
        }
        this.textShadowRadius = textShadowRadius;
        markUpdated();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = PROP_TEXT_TRANSFORM)
    public final void setTextTransform(@Nullable String textTransform) {
        TextTransform textTransform2;
        if (textTransform != null) {
            switch (textTransform.hashCode()) {
                case -1765638420:
                    if (textTransform.equals("capitalize")) {
                        textTransform2 = TextTransform.CAPITALIZE;
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textTransform: " + textTransform);
                    textTransform2 = TextTransform.UNSET;
                    break;
                case -514507343:
                    if (textTransform.equals("lowercase")) {
                        textTransform2 = TextTransform.LOWERCASE;
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textTransform: " + textTransform);
                    textTransform2 = TextTransform.UNSET;
                    break;
                case 3387192:
                    if (textTransform.equals(ViewProps.NONE)) {
                        textTransform2 = TextTransform.NONE;
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textTransform: " + textTransform);
                    textTransform2 = TextTransform.UNSET;
                    break;
                case 223523538:
                    if (textTransform.equals("uppercase")) {
                        textTransform2 = TextTransform.UPPERCASE;
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textTransform: " + textTransform);
                    textTransform2 = TextTransform.UNSET;
                    break;
                default:
                    E6.a.K(ReactConstants.TAG, "Invalid textTransform: " + textTransform);
                    textTransform2 = TextTransform.UNSET;
                    break;
            }
        } else {
            textTransform2 = TextTransform.UNSET;
        }
        this.textAttributes.textTransform = textTransform2;
        markUpdated();
    }

    public final void setUnderlineTextDecorationSet(boolean z10) {
        this.isUnderlineTextDecorationSet = z10;
    }

    @NotNull
    public final Spannable spannedFromShadowNode(@NotNull ReactBaseTextShadowNode textShadowNode, @Nullable String text, boolean supportsInlineViews, @Nullable NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        int i10;
        Intrinsics.checkNotNullParameter(textShadowNode, "textShadowNode");
        if (supportsInlineViews && nativeViewHierarchyOptimizer == null) {
            throw new IllegalStateException("nativeViewHierarchyOptimizer is required when inline views are supported");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = supportsInlineViews ? new HashMap() : null;
        if (text != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.INSTANCE.apply(text, textShadowNode.textAttributes.textTransform));
        }
        INSTANCE.buildSpannedFromShadowNode(textShadowNode, spannableStringBuilder, arrayList, null, supportsInlineViews, hashMap, 0);
        textShadowNode.containsImages = false;
        textShadowNode.inlineViews = hashMap;
        int size = arrayList.size();
        float f10 = Float.NaN;
        for (int i11 = 0; i11 < size; i11++) {
            SetSpanOperation setSpanOperation = (SetSpanOperation) arrayList.get((arrayList.size() - i11) - 1);
            ReactSpan reactSpan = setSpanOperation.what;
            boolean z10 = reactSpan instanceof TextInlineImageSpan;
            if (z10 || (reactSpan instanceof TextInlineViewPlaceholderSpan)) {
                if (z10) {
                    i10 = ((TextInlineImageSpan) reactSpan).get_height();
                    textShadowNode.containsImages = true;
                } else {
                    Intrinsics.checkNotNull(reactSpan, "null cannot be cast to non-null type com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan");
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) reactSpan;
                    int height = textInlineViewPlaceholderSpan.getHeight();
                    if (hashMap == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    ReactShadowNode reactShadowNode = (ReactShadowNode) hashMap.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
                    if (reactShadowNode == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (nativeViewHierarchyOptimizer == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    nativeViewHierarchyOptimizer.handleForceViewToBeNonLayoutOnly(reactShadowNode);
                    reactShadowNode.setLayoutParent(textShadowNode);
                    i10 = height;
                }
                if (Float.isNaN(f10) || i10 > f10) {
                    f10 = i10;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i11);
        }
        textShadowNode.textAttributes.setHeightOfTallestInlineViewOrImage(f10);
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.reactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public /* synthetic */ ReactBaseTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public final void setAccessibilityRole(@Nullable String accessibilityRole) {
        if (isVirtual()) {
            this.accessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.fromValue(accessibilityRole);
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public final void setBackgroundColor(@Nullable Integer color) {
        if (isVirtual()) {
            if (color != null) {
                int intValue = color.intValue();
                this.isBackgroundColorSet = true;
                this.backgroundColor = intValue;
            }
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public final void setColor(@Nullable Integer color) {
        if (color != null) {
            int intValue = color.intValue();
            this.isColorSet = true;
            this.color = intValue;
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public final void setFontStyle(@Nullable String fontStyleString) {
        int parseFontStyle = ReactTypefaceUtils.parseFontStyle(fontStyleString);
        if (parseFontStyle != this.fontStyle) {
            this.fontStyle = parseFontStyle;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public final void setFontWeight(@Nullable String fontWeightString) {
        int parseFontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
        if (parseFontWeight != this.fontWeight) {
            this.fontWeight = parseFontWeight;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.ROLE)
    public final void setRole(@Nullable String role) {
        if (isVirtual()) {
            this.role = ReactAccessibilityDelegate.Role.INSTANCE.fromValue(role);
            markUpdated();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4.equals("highQuality") == false) goto L20;
     */
    @ReactProp(name = ViewProps.TEXT_BREAK_STRATEGY)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTextBreakStrategy(@Nullable String textBreakStrategy) {
        int i10 = 1;
        if (textBreakStrategy != null) {
            int hashCode = textBreakStrategy.hashCode();
            if (hashCode == -1924829944) {
                if (textBreakStrategy.equals("balanced")) {
                    i10 = 2;
                }
                E6.a.K(ReactConstants.TAG, "Invalid textBreakStrategy: " + textBreakStrategy);
            } else if (hashCode != -902286926) {
                if (hashCode == 336871677) {
                }
                E6.a.K(ReactConstants.TAG, "Invalid textBreakStrategy: " + textBreakStrategy);
            } else {
                if (textBreakStrategy.equals("simple")) {
                    i10 = 0;
                }
                E6.a.K(ReactConstants.TAG, "Invalid textBreakStrategy: " + textBreakStrategy);
            }
        }
        this.textBreakStrategy = i10;
        markUpdated();
    }

    @JvmOverloads
    public ReactBaseTextShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
        this.textAttributes = new TextAttributes();
        this.numberOfLines = -1;
        this.textBreakStrategy = 1;
        this.justificationMode = 0;
        this.fontStyle = -1;
        this.fontWeight = -1;
        this.includeFontPadding = true;
        this.textShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
    }
}
