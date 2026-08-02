package com.facebook.react.views.textinput;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.BlurEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FocusEvent;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.twilio.voice.EventKeys;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import n4.v;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 ¥\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002¥\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0\u0016H\u0016J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0017H\u0016J\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001aH\u0007J\u0018\u0010*\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,H\u0007J\u001a\u0010-\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u00100\u001a\u00020,H\u0007J\u001a\u00101\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u00103\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u00105\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010 H\u0007J\u0018\u00107\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u00108\u001a\u000209H\u0007J\u001a\u0010:\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010:\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u001aH\u0002J)\u0010=\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0?\"\u00020\rH\u0002¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010B\u001a\u000209H\u0007J\u001a\u0010C\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010E\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010F\u001a\u000209H\u0007J\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010H\u001a\u000209H\u0007J\u0018\u0010I\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010J\u001a\u000209H\u0007J\u0018\u0010K\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010L\u001a\u00020,H\u0007J\u0018\u0010M\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010N\u001a\u000209H\u0007J\u001a\u0010O\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\rH\u0007J\u001f\u0010Q\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010T\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010U\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010V\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u0018\u0010W\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010X\u001a\u000209H\u0007J\u0018\u0010Y\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010Z\u001a\u000209H\u0007J\u0018\u0010[\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\\\u001a\u000209H\u0007J\u001f\u0010]\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010^\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010_\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001a\u0010`\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010a\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010c\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010e\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010f\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\u001aH\u0007J\u0018\u0010h\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010i\u001a\u000209H\u0007J\u0018\u0010j\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u001aH\u0007J\u001f\u0010l\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001a\u0010n\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010\rH\u0007J\u001f\u0010p\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010q\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010rJ\u0018\u0010s\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010t\u001a\u000209H\u0007J\u0018\u0010u\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010v\u001a\u000209H\u0007J\u0018\u0010w\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010x\u001a\u00020yH\u0007J\u001a\u0010z\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010{\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010|\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010~\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010 H\u0007J\u001a\u0010\u0080\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0081\u0001\u001a\u000209H\u0007J\u001c\u0010\u0082\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\rH\u0007J#\u0010\u0084\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020,H\u0007J\u001c\u0010\u0087\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0089\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u000209H\u0007J\u001a\u0010\u008a\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u008b\u0001\u001a\u000209H\u0007J\u001c\u0010\u008c\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\rH\u0007J#\u0010\u008e\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\u0007\u0010\u008f\u0001\u001a\u00020,H\u0007J*\u0010\u0090\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0003\u0010\u0091\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\rH\u0007J\u0011\u0010\u0094\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0002H\u0014J\u001b\u0010\u0095\u0001\u001a\u00020\u001c2\u0007\u0010\u0096\u0001\u001a\u00020\u00102\u0007\u0010\u0097\u0001\u001a\u00020\u0002H\u0014J\u0015\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J5\u0010\u0099\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u009a\u0001\u001a\u00020\u001a2\u0007\u0010\u009b\u0001\u001a\u00020\u001a2\u0007\u0010\u009c\u0001\u001a\u00020\u001a2\u0007\u0010\u009d\u0001\u001a\u00020\u001aH\u0016J'\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020\u00022\b\u0010\u009f\u0001\u001a\u00030 \u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0016J$\u0010!\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020\u00022\b\u0010\u009f\u0001\u001a\u00030 \u00012\b\u0010£\u0001\u001a\u00030¤\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006¦\u0001"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "<init>", "()V", "reactTextViewManagerCallback", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "setReactTextViewManagerCallback", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "createShadowNodeInstance", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "getShadowNodeClass", "Ljava/lang/Class;", "getExportedCustomBubblingEventTypeConstants", "", "", "getExportedCustomDirectEventTypeConstants", "getCommandsMap", "", "receiveCommand", "", "reactEditText", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "getReactTextUpdate", "Lcom/facebook/react/views/text/ReactTextUpdate;", "text", "mostRecentEventCount", "updateExtraData", "view", "extraData", "setLineHeight", ViewProps.LINE_HEIGHT, "setFontSize", ViewProps.FONT_SIZE, "", "setFontFamily", ViewProps.FONT_FAMILY, "setMaxFontSizeMultiplier", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setFontWeight", ViewProps.FONT_WEIGHT, "setFontStyle", ViewProps.FONT_STYLE, "setFontVariant", ViewProps.FONT_VARIANT, "setIncludeFontPadding", "includepad", "", "setImportantForAutofill", EventKeys.VALUE_KEY, "mode", "setAutofillHints", "hints", "", "(Lcom/facebook/react/views/textinput/ReactEditText;[Ljava/lang/String;)V", "setOnSelectionChange", "onSelectionChange", "setSubmitBehavior", "submitBehavior", "setOnContentSizeChange", "onContentSizeChange", "setOnScroll", "onScroll", "setOnKeyPress", "onKeyPress", "setLetterSpacing", ViewProps.LETTER_SPACING, "setAllowFontScaling", ViewProps.ALLOW_FONT_SCALING, "setPlaceholder", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholderTextColor", ViewProps.COLOR, "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Integer;)V", "setSelectionColor", "setSelectionHandleColor", "setCursorColor", "setCaretHidden", "caretHidden", "setContextMenuHidden", "contextMenuHidden", "setSelectTextOnFocus", "selectTextOnFocus", "setColor", "setUnderlineColor", "underlineColor", "setTextAlign", ViewProps.TEXT_ALIGN, "setTextAlignVertical", ViewProps.TEXT_ALIGN_VERTICAL, "setInlineImageLeft", "resource", "setInlineImagePadding", ViewProps.PADDING, "setEditable", "editable", "setNumLines", "numLines", "setMaxLength", "maxLength", "setTextContentType", "autoComplete", "setAutoCorrect", "autoCorrect", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Boolean;)V", "setMultiline", "multiline", "setSecureTextEntry", "password", "setAutoCapitalize", "autoCapitalize", "Lcom/facebook/react/bridge/Dynamic;", "setKeyboardType", "keyboardType", "setReturnKeyType", "returnKeyType", "setAcceptDragAndDropTypes", "acceptDragAndDropTypes", "setDisableFullscreenUI", "disableFullscreenUI", "setReturnKeyLabel", "returnKeyLabel", "setBorderRadius", "index", ViewProps.BORDER_RADIUS, "setBorderStyle", "borderStyle", "showKeyboardOnFocus", "setAutoFocus", "autoFocus", "setTextDecorationLine", "textDecorationLineString", "setBorderWidth", "width", "setBorderColor", "(Lcom/facebook/react/views/textinput/ReactEditText;ILjava/lang/Integer;)V", "setOverflow", ViewProps.OVERFLOW, "onAfterUpdateTransaction", "addEventEmitters", "reactContext", "editText", "getExportedViewConstants", "setPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateState", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "state", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ReactTextInputManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nReactTextInputManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactTextInputManager.kt\ncom/facebook/react/views/textinput/ReactTextInputManager\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1190:1\n37#2:1191\n36#2,3:1192\n37#2:1205\n36#2,3:1206\n1#3:1195\n739#4,9:1196\n*S KotlinDebug\n*F\n+ 1 ReactTextInputManager.kt\ncom/facebook/react/views/textinput/ReactTextInputManager\n*L\n654#1:1191\n654#1:1192,3\n871#1:1205\n871#1:1206,3\n870#1:1196,9\n*E\n"})
/* loaded from: classes2.dex */
public class ReactTextInputManager extends BaseViewManager<ReactEditText, LayoutShadowNode> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] DRAWABLE_HANDLE_FIELDS;

    @NotNull
    private static final String[] DRAWABLE_HANDLE_RESOURCES;

    @NotNull
    private static final InputFilter[] EMPTY_FILTERS;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;

    @NotNull
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";

    @NotNull
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";

    @NotNull
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";

    @NotNull
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";

    @NotNull
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";

    @NotNull
    private static final String KEYBOARD_TYPE_URI = "url";

    @NotNull
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";

    @NotNull
    public static final String REACT_CLASS = "AndroidTextInput";

    @NotNull
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;

    @NotNull
    private static final String TAG;
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;

    @Nullable
    private ReactTextViewManagerCallback reactTextViewManagerCallback;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0010H\u0002J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020-H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010#\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010)\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "REACT_CLASS", "TX_STATE_KEY_ATTRIBUTED_STRING", "", "TX_STATE_KEY_PARAGRAPH_ATTRIBUTES", "TX_STATE_KEY_MOST_RECENT_EVENT_COUNT", "REACT_PROPS_AUTOFILL_HINTS_MAP", "", "FOCUS_TEXT_INPUT", "", "BLUR_TEXT_INPUT", "SET_MOST_RECENT_EVENT_COUNT", "SET_TEXT_AND_SELECTION", "INPUT_TYPE_KEYBOARD_NUMBER_PAD", "INPUT_TYPE_KEYBOARD_DECIMAL_PAD", "INPUT_TYPE_KEYBOARD_NUMBERED", "AUTOCAPITALIZE_FLAGS", "KEYBOARD_TYPE_EMAIL_ADDRESS", "KEYBOARD_TYPE_NUMERIC", "KEYBOARD_TYPE_DECIMAL_PAD", "KEYBOARD_TYPE_NUMBER_PAD", "KEYBOARD_TYPE_PHONE_PAD", "KEYBOARD_TYPE_VISIBLE_PASSWORD", "KEYBOARD_TYPE_URI", "EMPTY_FILTERS", "", "Landroid/text/InputFilter;", "[Landroid/text/InputFilter;", "UNSET", "DRAWABLE_HANDLE_RESOURCES", "[Ljava/lang/String;", "DRAWABLE_HANDLE_FIELDS", "shouldHideCursorForEmailTextInput", "", "IME_ACTION_ID", "checkPasswordType", "", "view", "Lcom/facebook/react/views/textinput/ReactEditText;", "updateStagedInputTypeFlag", "flagsToUnset", "flagsToSet", "getEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "editText", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkPasswordType(ReactEditText view) {
            if ((view.getStagedInputType() & ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (view.getStagedInputType() & 128) == 0) {
                return;
            }
            updateStagedInputTypeFlag(view, 128, 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EventDispatcher getEventDispatcher(ReactContext reactContext, ReactEditText editText) {
            return UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldHideCursorForEmailTextInput() {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return Build.VERSION.SDK_INT == 29 && StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) HardwareEarMonitorUtils.MANUFACTURER_XIAOMI, false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateStagedInputTypeFlag(ReactEditText view, int flagsToUnset, int flagsToSet) {
            view.setStagedInputType(((~flagsToUnset) & view.getStagedInputType()) | flagsToSet);
        }

        @NotNull
        public final String getTAG() {
            return ReactTextInputManager.TAG;
        }

        private Companion() {
        }
    }

    static {
        String simpleName = ReactTextInputManager.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        REACT_PROPS_AUTOFILL_HINTS_MAP = MapsKt.mapOf(TuplesKt.to("birthdate-day", "birthDateDay"), TuplesKt.to("birthdate-full", "birthDateFull"), TuplesKt.to("birthdate-month", "birthDateMonth"), TuplesKt.to("birthdate-year", "birthDateYear"), TuplesKt.to("cc-csc", "creditCardSecurityCode"), TuplesKt.to("cc-exp", "creditCardExpirationDate"), TuplesKt.to("cc-exp-day", "creditCardExpirationDay"), TuplesKt.to("cc-exp-month", "creditCardExpirationMonth"), TuplesKt.to("cc-exp-year", "creditCardExpirationYear"), TuplesKt.to("cc-number", "creditCardNumber"), TuplesKt.to("email", "emailAddress"), TuplesKt.to("gender", "gender"), TuplesKt.to("name", "personName"), TuplesKt.to("name-family", "personFamilyName"), TuplesKt.to("name-given", "personGivenName"), TuplesKt.to("name-middle", "personMiddleName"), TuplesKt.to("name-middle-initial", "personMiddleInitial"), TuplesKt.to("name-prefix", "personNamePrefix"), TuplesKt.to("name-suffix", "personNameSuffix"), TuplesKt.to("password", "password"), TuplesKt.to("password-new", "newPassword"), TuplesKt.to("postal-address", "postalAddress"), TuplesKt.to("postal-address-country", "addressCountry"), TuplesKt.to("postal-address-extended", "extendedAddress"), TuplesKt.to("postal-address-extended-postal-code", "extendedPostalCode"), TuplesKt.to("postal-address-locality", "addressLocality"), TuplesKt.to("postal-address-region", "addressRegion"), TuplesKt.to("postal-code", "postalCode"), TuplesKt.to("street-address", "streetAddress"), TuplesKt.to("sms-otp", "smsOTPCode"), TuplesKt.to("tel", "phoneNumber"), TuplesKt.to("tel-country-code", "phoneCountryCode"), TuplesKt.to("tel-national", "phoneNational"), TuplesKt.to("tel-device", "phoneNumberDevice"), TuplesKt.to("username", "username"), TuplesKt.to("username-new", "newUsername"));
        EMPTY_FILTERS = new InputFilter[0];
        DRAWABLE_HANDLE_RESOURCES = new String[]{"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
        DRAWABLE_HANDLE_FIELDS = new String[]{"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$2(ThemedReactContext themedReactContext, ReactEditText reactEditText, View view, boolean z10) {
        int surfaceId = themedReactContext.getSurfaceId();
        EventDispatcher eventDispatcher = INSTANCE.getEventDispatcher(themedReactContext, reactEditText);
        if (z10) {
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new FocusEvent(surfaceId, reactEditText.getId()));
            }
        } else {
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new BlurEvent(surfaceId, reactEditText.getId()));
            }
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new ReactTextInputEndEditingEvent(surfaceId, reactEditText.getId(), String.valueOf(reactEditText.getText())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addEventEmitters$lambda$3(ReactEditText reactEditText, ThemedReactContext themedReactContext, TextView textView, int i10, KeyEvent keyEvent) {
        EventDispatcher eventDispatcher;
        if ((i10 & 255) == 0 && i10 != 0) {
            return true;
        }
        boolean isMultiline$ReactAndroid_release = reactEditText.isMultiline$ReactAndroid_release();
        boolean shouldSubmitOnReturn = reactEditText.shouldSubmitOnReturn();
        boolean shouldBlurOnReturn = reactEditText.shouldBlurOnReturn();
        if (shouldSubmitOnReturn && (eventDispatcher = INSTANCE.getEventDispatcher(themedReactContext, reactEditText)) != null) {
            eventDispatcher.dispatchEvent(new ReactTextInputSubmitEditingEvent(themedReactContext.getSurfaceId(), reactEditText.getId(), String.valueOf(reactEditText.getText())));
        }
        if (shouldBlurOnReturn) {
            reactEditText.clearFocusAndMaybeRefocus$ReactAndroid_release();
        }
        return shouldBlurOnReturn || shouldSubmitOnReturn || !isMultiline$ReactAndroid_release || i10 == 5 || i10 == 7;
    }

    private final ReactTextUpdate getReactTextUpdate(String text, int mostRecentEventCount) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) text);
        return new ReactTextUpdate(spannableStringBuilder, mostRecentEventCount, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    private final void setAutofillHints(ReactEditText view, String... hints) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setAutofillHints((String[]) Arrays.copyOf(hints, hints.length));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Integer> getCommandsMap() {
        return MapsKt.mapOf(TuplesKt.to("focusTextInput", 1), TuplesKt.to("blurTextInput", 2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(MapsKt.mapOf(TuplesKt.to("topSubmitEditing", MapsKt.mapOf(TuplesKt.to("phasedRegistrationNames", MapsKt.mapOf(TuplesKt.to("bubbled", "onSubmitEditing"), TuplesKt.to("captured", "onSubmitEditingCapture"))))), TuplesKt.to("topEndEditing", MapsKt.mapOf(TuplesKt.to("phasedRegistrationNames", MapsKt.mapOf(TuplesKt.to("bubbled", "onEndEditing"), TuplesKt.to("captured", "onEndEditingCapture"))))), TuplesKt.to(ReactTextInputKeyPressEvent.EVENT_NAME, MapsKt.mapOf(TuplesKt.to("phasedRegistrationNames", MapsKt.mapOf(TuplesKt.to("bubbled", "onKeyPress"), TuplesKt.to("captured", "onKeyPressCapture")))))));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapsKt.mapOf(TuplesKt.to(ScrollEventType.INSTANCE.getJSEventName(ScrollEventType.SCROLL), MapsKt.mapOf(TuplesKt.to("registrationName", "onScroll")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return MapsKt.mapOf(TuplesKt.to("AutoCapitalizationType", MapsKt.mapOf(TuplesKt.to(ViewProps.NONE, 0), TuplesKt.to("characters", 4096), TuplesKt.to("words", 8192), TuplesKt.to("sentences", 16384))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Nullable
    public final ReactTextViewManagerCallback getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(name = "acceptDragAndDropTypes")
    public final void setAcceptDragAndDropTypes(@NotNull ReactEditText view, @Nullable ReadableArray acceptDragAndDropTypes) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (acceptDragAndDropTypes == null) {
            view.setDragAndDropFilter(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = acceptDragAndDropTypes.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = acceptDragAndDropTypes.getString(i10);
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setDragAndDropFilter(arrayList);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public final void setAllowFontScaling(@NotNull ReactEditText view, boolean allowFontScaling) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAllowFontScaling(allowFontScaling);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = "autoCapitalize")
    public final void setAutoCapitalize(@NotNull ReactEditText view, @NotNull Dynamic autoCapitalize) {
        int i10;
        String asString;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autoCapitalize, "autoCapitalize");
        if (autoCapitalize.getType() == ReadableType.Number) {
            i10 = autoCapitalize.asInt();
        } else {
            if (autoCapitalize.getType() == ReadableType.String && (asString = autoCapitalize.asString()) != null) {
                switch (asString.hashCode()) {
                    case 3387192:
                        if (asString.equals(ViewProps.NONE)) {
                            i10 = 0;
                            break;
                        }
                        break;
                    case 113318569:
                        if (asString.equals("words")) {
                            i10 = 8192;
                            break;
                        }
                        break;
                    case 490141296:
                        asString.equals("sentences");
                        break;
                    case 1245424234:
                        if (asString.equals("characters")) {
                            i10 = 4096;
                            break;
                        }
                        break;
                }
            }
            i10 = 16384;
        }
        INSTANCE.updateStagedInputTypeFlag(view, AUTOCAPITALIZE_FLAGS, i10);
    }

    @ReactProp(name = "autoCorrect")
    public final void setAutoCorrect(@NotNull ReactEditText view, @Nullable Boolean autoCorrect) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.updateStagedInputTypeFlag(view, 557056, Intrinsics.areEqual(autoCorrect, Boolean.TRUE) ? 32768 : Intrinsics.areEqual(autoCorrect, Boolean.FALSE) ? PKIFailureInfo.signerNotTrusted : 0);
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public final void setAutoFocus(@NotNull ReactEditText view, boolean autoFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutoFocus(autoFocus);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(@NotNull ReactEditText view, int index, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(@NotNull ReactEditText view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, (BorderRadiusProp) BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(@NotNull ReactEditText view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle != null ? BorderStyle.INSTANCE.fromString(borderStyle) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(@NotNull ReactEditText view, int index, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, (LogicalEdge) LogicalEdge.getEntries().get(index), Float.valueOf(width));
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public final void setCaretHidden(@NotNull ReactEditText view, boolean caretHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getStagedInputType() == 32 && INSTANCE.shouldHideCursorForEmailTextInput()) {
            return;
        }
        view.setCursorVisible(!caretHidden);
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public final void setColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorStateList defaultTextColor = DefaultStyleValuesUtil.getDefaultTextColor(context);
        if (defaultTextColor != null) {
            view.setTextColor(defaultTextColor);
            return;
        }
        Context context2 = view.getContext();
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Could not get default text color from View Context: " + (context2 != null ? context2.getClass().getCanonicalName() : "null")));
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public final void setContextMenuHidden(@NotNull ReactEditText view, boolean contextMenuHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setContextMenuHidden(contextMenuHidden);
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public final void setCursorColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Drawable textCursorDrawable;
        BlendMode blendMode;
        Intrinsics.checkNotNullParameter(view, "view");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            textCursorDrawable = view.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (color != null) {
                    v.a();
                    int intValue = color.intValue();
                    blendMode = BlendMode.SRC_IN;
                    textCursorDrawable.setColorFilter(n4.u.a(intValue, blendMode));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                view.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i10 == 28) {
            return;
        }
        try {
            Field declaredField = view.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(view);
            if (i11 == 0) {
                return;
            }
            Drawable drawable = AbstractC5338c.getDrawable(view.getContext(), i11);
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            if (mutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                mutate.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                mutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{mutate, mutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public final void setDisableFullscreenUI(@NotNull ReactEditText view, boolean disableFullscreenUI) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisableFullscreenUI(disableFullscreenUI);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public final void setEditable(@NotNull ReactEditText view, boolean editable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(editable);
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public final void setFontFamily(@NotNull ReactEditText view, @Nullable String fontFamily) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontFamily(fontFamily);
    }

    @ReactProp(defaultFloat = ViewDefaults.FONT_SIZE_SP, name = ViewProps.FONT_SIZE)
    public final void setFontSize(@NotNull ReactEditText view, float fontSize) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontSize(fontSize);
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public final void setFontStyle(@NotNull ReactEditText view, @Nullable String fontStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontStyle(fontStyle);
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public final void setFontVariant(@NotNull ReactEditText view, @Nullable ReadableArray fontVariant) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontFeatureSettings(ReactTypefaceUtils.parseFontVariant(fontVariant));
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public final void setFontWeight(@NotNull ReactEditText view, @Nullable String fontWeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontWeight(fontWeight);
    }

    @ReactProp(name = "importantForAutofill")
    public final void setImportantForAutofill(@NotNull ReactEditText view, @Nullable String value) {
        int i10;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            int hashCode = value.hashCode();
            if (hashCode != 3521) {
                if (hashCode != 119527) {
                    if (hashCode != 1723649149) {
                        if (hashCode == 1828836387 && value.equals("yesExcludeDescendants")) {
                            i10 = 4;
                        }
                    } else if (value.equals("noExcludeDescendants")) {
                        i10 = 8;
                    }
                } else if (value.equals("yes")) {
                    i10 = 1;
                }
            } else if (value.equals("no")) {
                i10 = 2;
            }
            setImportantForAutofill(view, i10);
        }
        i10 = 0;
        setImportantForAutofill(view, i10);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding(@NotNull ReactEditText view, boolean includepad) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @ReactProp(name = "inlineImageLeft")
    public final void setInlineImageLeft(@NotNull ReactEditText view, @Nullable String resource) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setCompoundDrawablesWithIntrinsicBounds(ResourceDrawableIdHelper.getResourceDrawableId(context, resource), 0, 0, 0);
    }

    @ReactProp(name = "inlineImagePadding")
    public final void setInlineImagePadding(@NotNull ReactEditText view, int padding) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCompoundDrawablePadding(padding);
    }

    @ReactProp(name = "keyboardType")
    public final void setKeyboardType(@NotNull ReactEditText view, @Nullable String keyboardType) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i10 = 1;
        if (StringsKt.equals("numeric", keyboardType, true)) {
            i10 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (StringsKt.equals(KEYBOARD_TYPE_NUMBER_PAD, keyboardType, true)) {
            i10 = 2;
        } else if (StringsKt.equals(KEYBOARD_TYPE_DECIMAL_PAD, keyboardType, true)) {
            i10 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (StringsKt.equals(KEYBOARD_TYPE_EMAIL_ADDRESS, keyboardType, true)) {
            if (INSTANCE.shouldHideCursorForEmailTextInput()) {
                view.setCursorVisible(false);
            }
            i10 = 33;
        } else if (StringsKt.equals(KEYBOARD_TYPE_PHONE_PAD, keyboardType, true)) {
            i10 = 3;
        } else if (StringsKt.equals(KEYBOARD_TYPE_VISIBLE_PASSWORD, keyboardType, true)) {
            i10 = 144;
        } else if (StringsKt.equals("url", keyboardType, true)) {
            i10 = 16;
        }
        Companion companion = INSTANCE;
        companion.updateStagedInputTypeFlag(view, 15, i10);
        companion.checkPasswordType(view);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing(@NotNull ReactEditText view, float letterSpacing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLetterSpacingPt(letterSpacing);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LINE_HEIGHT)
    public final void setLineHeight(@NotNull ReactEditText view, int lineHeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLineHeight(lineHeight);
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public final void setMaxFontSizeMultiplier(@NotNull ReactEditText view, float maxFontSizeMultiplier) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
    }

    @ReactProp(name = "maxLength")
    public final void setMaxLength(@NotNull ReactEditText view, @Nullable Integer maxLength) {
        Intrinsics.checkNotNullParameter(view, "view");
        InputFilter[] filters = view.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (maxLength == null) {
            Intrinsics.checkNotNull(filters);
            if (!(filters.length == 0)) {
                LinkedList linkedList = new LinkedList();
                Iterator it = ArrayIteratorKt.iterator(filters);
                while (it.hasNext()) {
                    InputFilter inputFilter = (InputFilter) it.next();
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    filters = (InputFilter[]) linkedList.toArray(new InputFilter[0]);
                }
            }
            filters = inputFilterArr;
        } else {
            Intrinsics.checkNotNull(filters);
            if (filters.length == 0) {
                filters = new InputFilter[]{new InputFilter.LengthFilter(maxLength.intValue())};
            } else {
                int length = filters.length;
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    if (filters[i10] instanceof InputFilter.LengthFilter) {
                        filters[i10] = new InputFilter.LengthFilter(maxLength.intValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                    inputFilterArr = new InputFilter[filters.length + 1];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    filters[filters.length] = new InputFilter.LengthFilter(maxLength.intValue());
                    filters = inputFilterArr;
                }
            }
        }
        view.setFilters(filters);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public final void setMultiline(@NotNull ReactEditText view, boolean multiline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Companion companion = INSTANCE;
        int i10 = PKIFailureInfo.unsupportedVersion;
        int i11 = multiline ? 0 : 131072;
        if (!multiline) {
            i10 = 0;
        }
        companion.updateStagedInputTypeFlag(view, i11, i10);
    }

    @ReactProp(defaultInt = 1, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumLines(@NotNull ReactEditText view, int numLines) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLines(numLines);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public final void setOnContentSizeChange(@NotNull ReactEditText view, boolean onContentSizeChange) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (onContentSizeChange) {
            view.setContentSizeWatcher(new ReactTextContentSizeWatcher(view));
        } else {
            view.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public final void setOnKeyPress(@NotNull ReactEditText view, boolean onKeyPress) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnKeyPress(onKeyPress);
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull ReactEditText view, boolean onScroll) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (onScroll) {
            view.setScrollWatcher(new ReactTextScrollWatcher(view));
        } else {
            view.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public final void setOnSelectionChange(@NotNull ReactEditText view, boolean onSelectionChange) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (onSelectionChange) {
            view.setSelectionWatcher$ReactAndroid_release(new ReactTextSelectionWatcher(view));
        } else {
            view.setSelectionWatcher$ReactAndroid_release(null);
        }
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(@NotNull ReactEditText view, @Nullable String overflow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void setPlaceholder(@NotNull ReactEditText view, @Nullable String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPlaceholder(placeholder);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public final void setPlaceholderTextColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setHintTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setHintTextColor(DefaultStyleValuesUtil.getDefaultTextColorHint(context));
    }

    public final void setReactTextViewManagerCallback(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    @ReactProp(name = "returnKeyLabel")
    public final void setReturnKeyLabel(@NotNull ReactEditText view, @Nullable String returnKeyLabel) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImeActionLabel(returnKeyLabel, IME_ACTION_ID);
    }

    @ReactProp(name = "returnKeyType")
    public final void setReturnKeyType(@NotNull ReactEditText view, @Nullable String returnKeyType) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setReturnKeyType(returnKeyType);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public final void setSecureTextEntry(@NotNull ReactEditText view, boolean password) {
        Intrinsics.checkNotNullParameter(view, "view");
        Companion companion = INSTANCE;
        companion.updateStagedInputTypeFlag(view, 144, password ? 128 : 0);
        companion.checkPasswordType(view);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public final void setSelectTextOnFocus(@NotNull ReactEditText view, boolean selectTextOnFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSelectTextOnFocus(selectTextOnFocus);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setHighlightColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(context));
    }

    @ReactProp(customType = "Color", name = "selectionHandleColor")
    public final void setSelectionHandleColor(@NotNull ReactEditText view, @Nullable Integer color) {
        int i10;
        Drawable textSelectHandle;
        Drawable textSelectHandleLeft;
        Drawable textSelectHandleRight;
        BlendMode blendMode;
        Intrinsics.checkNotNullParameter(view, "view");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            textSelectHandle = view.getTextSelectHandle();
            Drawable mutate = textSelectHandle != null ? textSelectHandle.mutate() : null;
            if (mutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            textSelectHandleLeft = view.getTextSelectHandleLeft();
            Drawable mutate2 = textSelectHandleLeft != null ? textSelectHandleLeft.mutate() : null;
            if (mutate2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            textSelectHandleRight = view.getTextSelectHandleRight();
            Drawable mutate3 = textSelectHandleRight != null ? textSelectHandleRight.mutate() : null;
            if (mutate3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                v.a();
                int intValue = color.intValue();
                blendMode = BlendMode.SRC_IN;
                BlendModeColorFilter a10 = n4.u.a(intValue, blendMode);
                mutate.setColorFilter(a10);
                mutate2.setColorFilter(a10);
                mutate3.setColorFilter(a10);
            } else {
                mutate.clearColorFilter();
                mutate2.clearColorFilter();
                mutate3.clearColorFilter();
            }
            view.setTextSelectHandle(mutate);
            view.setTextSelectHandleLeft(mutate2);
            view.setTextSelectHandleRight(mutate3);
            return;
        }
        if (i11 == 28) {
            return;
        }
        int length = DRAWABLE_HANDLE_RESOURCES.length;
        for (int i12 = 0; i12 < length; i12++) {
            try {
                Field declaredField = view.getClass().getDeclaredField(DRAWABLE_HANDLE_RESOURCES[i12]);
                declaredField.setAccessible(true);
                i10 = declaredField.getInt(view);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i10 == 0) {
                return;
            }
            Drawable drawable = AbstractC5338c.getDrawable(view.getContext(), i10);
            Drawable mutate4 = drawable != null ? drawable.mutate() : null;
            if (mutate4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                mutate4.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                mutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i12]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, mutate4);
        }
    }

    @ReactProp(name = "submitBehavior")
    public final void setSubmitBehavior(@NotNull ReactEditText view, @Nullable String submitBehavior) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSubmitBehavior(submitBehavior);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r7.equals("auto") == false) goto L31;
     */
    @ReactProp(name = ViewProps.TEXT_ALIGN)
    @SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlign(@NotNull ReactEditText view, @Nullable String textAlign) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual("justify", textAlign)) {
            if (Build.VERSION.SDK_INT >= 26) {
                view.setJustificationMode(1);
            }
            view.setGravityHorizontal$ReactAndroid_release(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            view.setJustificationMode(0);
        }
        if (textAlign != null) {
            switch (textAlign.hashCode()) {
                case -1364013995:
                    if (textAlign.equals("center")) {
                        view.setGravityHorizontal$ReactAndroid_release(1);
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
                case 3005871:
                    break;
                case 3317767:
                    if (textAlign.equals(ViewProps.LEFT)) {
                        view.setGravityHorizontal$ReactAndroid_release(3);
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
                case 108511772:
                    if (textAlign.equals(ViewProps.RIGHT)) {
                        view.setGravityHorizontal$ReactAndroid_release(5);
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
                default:
                    E6.a.K(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                    view.setGravityHorizontal$ReactAndroid_release(0);
                    break;
            }
            return;
        }
        view.setGravityHorizontal$ReactAndroid_release(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r5.equals("auto") == false) goto L22;
     */
    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlignVertical(@NotNull ReactEditText view, @Nullable String textAlignVertical) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (textAlignVertical != null) {
            switch (textAlignVertical.hashCode()) {
                case -1383228885:
                    if (textAlignVertical.equals(ViewProps.BOTTOM)) {
                        view.setGravityVertical$ReactAndroid_release(80);
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
                case -1364013995:
                    if (textAlignVertical.equals("center")) {
                        view.setGravityVertical$ReactAndroid_release(16);
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
                case 115029:
                    if (textAlignVertical.equals(ViewProps.TOP)) {
                        view.setGravityVertical$ReactAndroid_release(48);
                        break;
                    }
                    E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
                case 3005871:
                    break;
                default:
                    E6.a.K(ReactConstants.TAG, "Invalid textAlignVertical: " + textAlignVertical);
                    view.setGravityVertical$ReactAndroid_release(0);
                    break;
            }
            return;
        }
        view.setGravityVertical$ReactAndroid_release(0);
    }

    @ReactProp(name = "autoComplete")
    public final void setTextContentType(@NotNull ReactEditText view, @Nullable String autoComplete) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (autoComplete == null) {
            setImportantForAutofill(view, 2);
            return;
        }
        if (Intrinsics.areEqual("off", autoComplete)) {
            setImportantForAutofill(view, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (!map.containsKey(autoComplete)) {
            E6.a.K(ReactConstants.TAG, "Invalid autoComplete: " + autoComplete);
            setImportantForAutofill(view, 2);
            return;
        }
        String[] strArr = new String[1];
        String str = map.get(autoComplete);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        strArr[0] = str;
        setAutofillHints(view, strArr);
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public final void setTextDecorationLine(@NotNull ReactEditText view, @Nullable String textDecorationLineString) {
        List emptyList;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPaintFlags(view.getPaintFlags() & (-25));
        if (textDecorationLineString == null) {
            return;
        }
        List<String> split = new Regex(" ").split(textDecorationLineString, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        for (String str : (String[]) emptyList.toArray(new String[0])) {
            if (Intrinsics.areEqual(str, "underline")) {
                view.setPaintFlags(view.getPaintFlags() | 8);
            } else if (Intrinsics.areEqual(str, "line-through")) {
                view.setPaintFlags(view.getPaintFlags() | 16);
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public final void setUnderlineColor(@NotNull ReactEditText view, @Nullable Integer underlineColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                Drawable mutate = background.mutate();
                if (mutate == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                background = mutate;
            } catch (NullPointerException e10) {
                E6.a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
            }
        }
        if (underlineColor == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(underlineColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public final void showKeyboardOnFocus(@NotNull ReactEditText view, boolean showKeyboardOnFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShowSoftInputOnFocus(showKeyboardOnFocus);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull final ThemedReactContext reactContext, @NotNull final ReactEditText editText) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.setEventDispatcher(INSTANCE.getEventDispatcher(reactContext, editText));
        editText.addTextChangedListener(new ReactTextInputTextWatcher(reactContext, editText));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ReactTextInputManager.addEventEmitters$lambda$2(ThemedReactContext.this, editText, view, z10);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.u
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean addEventEmitters$lambda$3;
                addEventEmitters$lambda$3 = ReactTextInputManager.addEventEmitters$lambda$3(ReactEditText.this, reactContext, textView, i10, keyEvent);
                return addEventEmitters$lambda$3;
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactEditText createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReactEditText reactEditText = new ReactEditText(context);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType("done");
        reactEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return reactEditText;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactEditText view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((ReactTextInputManager) view);
        view.maybeUpdateTypeface();
        view.commitStagedInputType$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(@NotNull ReactEditText view, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ReactEditText view, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        if (extraData instanceof ReactTextUpdate) {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) extraData;
            int paddingLeft = (int) reactTextUpdate.getPaddingLeft();
            int paddingTop = (int) reactTextUpdate.getPaddingTop();
            int paddingRight = (int) reactTextUpdate.getPaddingRight();
            int paddingBottom = (int) reactTextUpdate.getPaddingBottom();
            int i10 = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = view.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = view.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = view.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = view.getPaddingBottom();
                }
                view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (reactTextUpdate.getContainsImages()) {
                TextInlineImageSpan.INSTANCE.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), view);
            }
            if (view.getSelectionStart() == view.getSelectionEnd()) {
                Editable text = view.getText();
                i10 = reactTextUpdate.getText().length() - ((text != null ? text.length() : 0) - view.getSelectionStart());
            }
            view.maybeSetTextFromState(reactTextUpdate);
            view.maybeSetSelection(reactTextUpdate.getJsEventCounter(), i10, i10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ReactEditText view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        if (ReactEditText.INSTANCE.getDEBUG_MODE()) {
            E6.a.m(TAG, "updateState: [" + view.getId() + "]");
        }
        if (view.getStateWrapper() == null) {
            view.setPadding(0, 0, 0, 0);
        }
        view.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(view, props, stateDataMapBuffer);
        }
        return null;
    }

    private final void setImportantForAutofill(ReactEditText view, int mode) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setImportantForAutofill(mode);
    }

    @NotNull
    public final ReactBaseTextShadowNode createShadowNodeInstance(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return new ReactTextInputShadowNode(reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Deprecated(message = "Deprecated in Java")
    public void receiveCommand(@NotNull ReactEditText reactEditText, int commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(reactEditText, "reactEditText");
        if (commandId == 1) {
            receiveCommand(reactEditText, "focus", args);
        } else if (commandId == 2) {
            receiveCommand(reactEditText, "blur", args);
        } else {
            if (commandId != 4) {
                return;
            }
            receiveCommand(reactEditText, "setTextAndSelection", args);
        }
    }

    @Nullable
    public final Object getReactTextUpdate(@NotNull ReactEditText view, @NotNull ReactStylesDiffMap props, @NotNull MapBuffer state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getCount() == 0) {
            return null;
        }
        MapBuffer mapBuffer = state.getMapBuffer(0);
        MapBuffer mapBuffer2 = state.getMapBuffer(1);
        TextLayoutManager textLayoutManager = TextLayoutManager.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Spannable orCreateSpannableForText = textLayoutManager.getOrCreateSpannableForText(context, mapBuffer, this.reactTextViewManagerCallback);
        TextAttributeProps.Companion companion = TextAttributeProps.INSTANCE;
        return ReactTextUpdate.INSTANCE.buildReactTextUpdateFromState(orCreateSpannableForText, state.getInt(3), companion.getTextAlignment(props, textLayoutManager.isRTL(mapBuffer), view.getGravityHorizontal$ReactAndroid_release()), companion.getTextBreakStrategy(mapBuffer2.getString(2)), companion.getJustificationMode(props, Build.VERSION.SDK_INT >= 26 ? view.getJustificationMode() : 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ReactEditText reactEditText, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(reactEditText, "reactEditText");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1699362314:
                if (!commandId.equals("blurTextInput")) {
                    return;
                }
                break;
            case 3027047:
                if (!commandId.equals("blur")) {
                    return;
                }
                break;
            case 97604824:
                if (!commandId.equals("focus")) {
                    return;
                }
                reactEditText.requestFocusFromJS();
                return;
            case 1427010500:
                if (commandId.equals("setTextAndSelection")) {
                    if (args != null) {
                        int i10 = args.getInt(0);
                        if (i10 == -1) {
                            return;
                        }
                        int i11 = args.getInt(2);
                        int i12 = args.getInt(3);
                        if (i12 == -1) {
                            i12 = i11;
                        }
                        if (!args.isNull(1)) {
                            reactEditText.maybeSetTextFromJS(getReactTextUpdate(args.getString(1), i10));
                        }
                        reactEditText.maybeSetSelection(i10, i11, i12);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            case 1690703013:
                if (!commandId.equals("focusTextInput")) {
                    return;
                }
                reactEditText.requestFocusFromJS();
                return;
            default:
                return;
        }
        reactEditText.clearFocusFromJS$ReactAndroid_release();
    }
}
