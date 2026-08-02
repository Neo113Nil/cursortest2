package com.facebook.react.views.textinput;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.AbstractC2082d0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributes;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.twilio.voice.EventKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u0000 \u009c\u00022\u00020\u0001:\u0006\u009d\u0002\u009e\u0002\u009c\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J9\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u001a\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010&J\u000f\u0010*\u001a\u00020\fH\u0005¢\u0006\u0004\b*\u0010&J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ7\u00101\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u0010:\u001a\u00020\u00062\u0006\u00107\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010>J/\u0010C\u001a\u00020\f2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\tH\u0014¢\u0006\u0004\bC\u0010DJ\u0019\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020\fH\u0000¢\u0006\u0004\bM\u0010&J\u000f\u0010P\u001a\u00020\fH\u0000¢\u0006\u0004\bO\u0010&J\u0017\u0010S\u001a\u00020\f2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\f2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bU\u0010TJ\u0017\u0010X\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010V¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\f2\b\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\b\\\u0010]J%\u0010\r\u001a\u00020\f2\u0006\u0010^\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010_J\u001f\u0010`\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010\u000eJ\u001f\u0010c\u001a\u00020\f2\u0006\u0010a\u001a\u00020\t2\u0006\u0010b\u001a\u00020\tH\u0014¢\u0006\u0004\bc\u0010\u000eJ)\u0010h\u001a\u00020\f2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010fH\u0014¢\u0006\u0004\bh\u0010iJ\u0019\u0010n\u001a\u00020\f2\b\u0010k\u001a\u0004\u0018\u00010jH\u0000¢\u0006\u0004\bl\u0010mJ\u0015\u0010p\u001a\u00020\f2\u0006\u0010o\u001a\u00020\u0006¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0006¢\u0006\u0004\br\u0010\bJ\r\u0010s\u001a\u00020\u0006¢\u0006\u0004\bs\u0010\bJ\u000f\u0010u\u001a\u00020\fH\u0000¢\u0006\u0004\bt\u0010&J\u0017\u0010w\u001a\u00020\f2\u0006\u0010v\u001a\u00020\tH\u0016¢\u0006\u0004\bw\u0010>J\u0017\u0010z\u001a\u00020\f2\b\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\f2\b\u0010|\u001a\u0004\u0018\u00010x¢\u0006\u0004\b}\u0010{J\u0017\u0010\u007f\u001a\u00020\f2\b\u0010~\u001a\u0004\u0018\u00010x¢\u0006\u0004\b\u007f\u0010{J\u001a\u0010\u0081\u0001\u001a\u00020\f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010x¢\u0006\u0005\b\u0081\u0001\u0010{J\u001c\u0010\u0083\u0001\u001a\u00020\f2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0005\b\u0083\u0001\u0010{J\u000f\u0010\u0084\u0001\u001a\u00020\f¢\u0006\u0005\b\u0084\u0001\u0010&J\u000f\u0010\u0085\u0001\u001a\u00020\f¢\u0006\u0005\b\u0085\u0001\u0010&J\u0010\u0010\u0086\u0001\u001a\u00020\t¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0017\u0010\u0088\u0001\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0005\b\u0088\u0001\u0010\u0015J\u0017\u0010\u0089\u0001\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0005\b\u0089\u0001\u0010\u0015J\u0017\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\t¢\u0006\u0005\b\u008a\u0001\u0010LJ\u0011\u0010\u008b\u0001\u001a\u00020\u0006H\u0004¢\u0006\u0005\b\u008b\u0001\u0010\bJ\u0011\u0010\u008c\u0001\u001a\u00020\fH\u0004¢\u0006\u0005\b\u008c\u0001\u0010&J\u001c\u0010\u008f\u0001\u001a\u00020\u00062\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0014¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\f2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0093\u0001\u0010&J\u0011\u0010\u0094\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0094\u0001\u0010&J\u001c\u0010\u0097\u0001\u001a\u00020\f2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0099\u0001\u0010&J\u0011\u0010\u009a\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u009a\u0001\u0010&J\u001a\u0010\u009c\u0001\u001a\u00020\f2\u0007\u0010\u009b\u0001\u001a\u00020\tH\u0016¢\u0006\u0005\b\u009c\u0001\u0010>J#\u0010 \u0001\u001a\u00020\f2\u0007\u0010\u009d\u0001\u001a\u00020\t2\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J$\u0010¢\u0001\u001a\u00020\f2\u0007\u0010\u009d\u0001\u001a\u00020\t2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\t¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0018\u0010¤\u0001\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0005\b¤\u0001\u0010\u0011J\u001a\u0010¦\u0001\u001a\u00020\f2\b\u0010¥\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J#\u0010¦\u0001\u001a\u00020\f2\b\u0010¥\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0006\b¦\u0001\u0010¨\u0001J\u001a\u0010ª\u0001\u001a\u00020\f2\t\u0010©\u0001\u001a\u0004\u0018\u00010x¢\u0006\u0005\bª\u0001\u0010{J\u001a\u0010¬\u0001\u001a\u00020\f2\b\u0010«\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b¬\u0001\u0010§\u0001J\u0018\u0010®\u0001\u001a\u00020\f2\u0007\u0010\u00ad\u0001\u001a\u00020\u0006¢\u0006\u0005\b®\u0001\u0010qJ\u001a\u0010°\u0001\u001a\u00020\f2\b\u0010¯\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b°\u0001\u0010§\u0001J\u001a\u0010²\u0001\u001a\u00020\f2\b\u0010±\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b²\u0001\u0010§\u0001J\u0018\u0010´\u0001\u001a\u00020\f2\u0007\u0010³\u0001\u001a\u00020\u0006¢\u0006\u0005\b´\u0001\u0010qJ\u0018\u0010¶\u0001\u001a\u00020\f2\u0007\u0010µ\u0001\u001a\u00020\u0006¢\u0006\u0005\b¶\u0001\u0010qJ\u0018\u0010¸\u0001\u001a\u00020\f2\u0007\u0010·\u0001\u001a\u00020\u0006¢\u0006\u0005\b¸\u0001\u0010qJ\u0011\u0010¹\u0001\u001a\u00020\fH\u0004¢\u0006\u0005\b¹\u0001\u0010&J\u001c\u0010¼\u0001\u001a\u00020\f2\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010¿\u0001\u001a\u00020\f2\t\u0010¾\u0001\u001a\u0004\u0018\u00010x¢\u0006\u0005\b¿\u0001\u0010{J\u001c\u0010Â\u0001\u001a\u00020\f2\b\u0010Á\u0001\u001a\u00030À\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001b\u0010Å\u0001\u001a\u00020\u00062\u0007\u00109\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010È\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0017\u0010Ê\u0001\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R'\u0010Ì\u0001\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0005\bÌ\u0001\u0010\b\"\u0005\bÎ\u0001\u0010qR\u0017\u0010Ï\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ñ\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ð\u0001R(\u0010Ò\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\bÒ\u0001\u0010Ð\u0001\u001a\u0006\bÓ\u0001\u0010\u0087\u0001\"\u0005\bÔ\u0001\u0010>R\"\u0010Ö\u0001\u001a\u000b\u0012\u0004\u0012\u00020Q\u0018\u00010Õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R(\u0010Ø\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bØ\u0001\u0010Ð\u0001\u001a\u0006\bÙ\u0001\u0010\u0087\u0001\"\u0005\bÚ\u0001\u0010>R'\u0010Û\u0001\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\bÛ\u0001\u0010Í\u0001\u001a\u0005\bÜ\u0001\u0010\b\"\u0005\bÝ\u0001\u0010qR*\u0010Þ\u0001\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÞ\u0001\u0010Ë\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0005\bá\u0001\u0010{R2\u0010ã\u0001\u001a\u000b\u0012\u0004\u0012\u00020x\u0018\u00010â\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R\u0019\u0010é\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010Í\u0001R\u0019\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bk\u0010ê\u0001R\u0019\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bW\u0010ë\u0001R\u0019\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010ì\u0001R\u001c\u0010ð\u0001\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0019\u0010ñ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010Í\u0001R\u0017\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010Í\u0001R\u0018\u0010ó\u0001\u001a\u00030ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010õ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010Í\u0001R\u0019\u0010|\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010Ë\u0001R\u0019\u0010ö\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010Ð\u0001R\u0019\u0010÷\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010Ð\u0001R\u0019\u0010³\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010Í\u0001R\u0019\u0010·\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010Í\u0001R\u0019\u0010ø\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010Í\u0001R\u0019\u0010µ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010Í\u0001R\u0019\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\by\u0010Ë\u0001R\u001a\u0010¾\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010ú\u0001R,\u0010ü\u0001\u001a\u0005\u0018\u00010û\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R'\u0010\u0082\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0082\u0002\u0010Í\u0001\u001a\u0005\b\u0083\u0002\u0010\b\"\u0005\b\u0084\u0002\u0010qR'\u0010\u0085\u0002\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u0085\u0002\u0010Í\u0001\u001a\u0005\b\u0085\u0002\u0010\b\"\u0005\b\u0086\u0002\u0010qR\u001c\u0010»\u0001\u001a\u0005\u0018\u00010º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u0087\u0002R(\u0010\u0089\u0002\u001a\t\u0018\u00010\u0088\u0002R\u00020\u00008B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R4\u0010\u008d\u0002\u001a\u0004\u0018\u00010x2\b\u0010\u000f\u001a\u0004\u0018\u00010x8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008d\u0002\u0010Ë\u0001\u001a\u0006\b\u008e\u0002\u0010à\u0001\"\u0005\b\u008f\u0002\u0010{R\u0016\u0010\u0090\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0002\u0010\bR\u0016\u0010\u0092\u0002\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0002\u0010\bR(\u0010\u0093\u0002\u001a\u00020\u00062\u0007\u0010\u0093\u0002\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0002\u0010\b\"\u0005\b\u0095\u0002\u0010qR(\u0010\u0098\u0002\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8@@@X\u0080\u000e¢\u0006\u000f\u001a\u0006\b\u0096\u0002\u0010\u0087\u0001\"\u0005\b\u0097\u0002\u0010>R(\u0010\u009b\u0002\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8@@@X\u0080\u000e¢\u0006\u000f\u001a\u0006\b\u0099\u0002\u0010\u0087\u0001\"\u0005\b\u009a\u0002\u0010>¨\u0006\u009f\u0002"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "requestFocusProgrammatically", "()Z", "", ViewProps.START, ViewProps.END, "", "maybeSetSelection", "(II)V", EventKeys.VALUE_KEY, "clampToTextLength", "(I)I", "Lcom/facebook/react/views/text/ReactTextUpdate;", "reactTextUpdate", "maybeSetText", "(Lcom/facebook/react/views/text/ReactTextUpdate;)V", "Landroid/text/SpannableStringBuilder;", "spannableStringBuilder", "manageSpans", "(Landroid/text/SpannableStringBuilder;)V", "sb", "stripStyleEquivalentSpans", "T", "Ljava/lang/Class;", "clazz", "Lx0/g;", "shouldStrip", "stripSpansOfKind", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Class;Lx0/g;)V", "workingText", "addSpansFromStyleAttributes", "onContentSizeChange", "()V", "setIntrinsicContentSize", "updateImeOptions", "updateCachedSpannable", "finalize", "isLayoutRequested", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "Landroid/view/MotionEvent;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", ViewProps.LINE_HEIGHT, "setLineHeight", "(I)V", "horiz", "vert", "oldHoriz", "oldVert", "onScrollChanged", "(IIII)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", StackTraceHelper.ID_KEY, "onTextContextMenuItem", "(I)Z", "clearFocusAndMaybeRefocus$ReactAndroid_release", "clearFocusAndMaybeRefocus", "clearFocusFromJS$ReactAndroid_release", "clearFocusFromJS", "Landroid/text/TextWatcher;", "watcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "Lcom/facebook/react/views/textinput/ContentSizeWatcher;", "contentSizeWatcher", "setContentSizeWatcher", "(Lcom/facebook/react/views/textinput/ContentSizeWatcher;)V", "Lcom/facebook/react/views/textinput/ScrollWatcher;", "scrollWatcher", "setScrollWatcher", "(Lcom/facebook/react/views/textinput/ScrollWatcher;)V", "eventCounter", "(III)V", "setSelection", "selStart", "selEnd", "onSelectionChanged", "focused", EventKeys.DIRECTION_KEY, "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Lcom/facebook/react/views/textinput/SelectionWatcher;", "selectionWatcher", "setSelectionWatcher$ReactAndroid_release", "(Lcom/facebook/react/views/textinput/SelectionWatcher;)V", "setSelectionWatcher", "onKeyPress", "setOnKeyPress", "(Z)V", "shouldBlurOnReturn", "shouldSubmitOnReturn", "commitStagedInputType$ReactAndroid_release", "commitStagedInputType", "type", "setInputType", "", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholder", "(Ljava/lang/String;)V", ViewProps.FONT_FAMILY, "setFontFamily", "fontWeightString", "setFontWeight", "fontStyleString", "setFontStyle", "fontFeatureSettings", "setFontFeatureSettings", "maybeUpdateTypeface", "requestFocusFromJS", "incrementAndGetEventCounter", "()I", "maybeSetTextFromJS", "maybeSetTextFromState", "canUpdateWithEventCount", "showSoftKeyboard", "hideSoftKeyboard", "Landroid/graphics/drawable/Drawable;", "drawable", "verifyDrawable", "(Landroid/graphics/drawable/Drawable;)Z", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "onDetachedFromWindow", "onStartTemporaryDetach", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "onFinishTemporaryDetach", ViewProps.COLOR, "setBackgroundColor", ViewProps.POSITION, "", "width", "setBorderWidth", "(IF)V", "setBorderColor", "(ILjava/lang/Integer;)V", "getBorderColor", ViewProps.BORDER_RADIUS, "setBorderRadius", "(F)V", "(FI)V", "style", "setBorderStyle", "letterSpacingPt", "setLetterSpacingPt", ViewProps.ALLOW_FONT_SCALING, "setAllowFontScaling", ViewProps.FONT_SIZE, "setFontSize", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setMaxFontSizeMultiplier", "autoFocus", "setAutoFocus", "selectTextOnFocus", "setSelectTextOnFocus", "contextMenuHidden", "setContextMenuHidden", "applyTextAttributes", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "setEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", ViewProps.OVERFLOW, "setOverflow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/DragEvent;", "onDragEvent", "(Landroid/view/DragEvent;)Z", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "TAG", "Ljava/lang/String;", "isSettingTextFromJS", "Z", "setSettingTextFromJS", "defaultGravityHorizontal", "I", "defaultGravityVertical", "nativeEventCount", "getNativeEventCount", "setNativeEventCount", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "stagedInputType", "getStagedInputType", "setStagedInputType", "containsImages", "getContainsImages", "setContainsImages", "submitBehavior", "getSubmitBehavior", "()Ljava/lang/String;", "setSubmitBehavior", "", "dragAndDropFilter", "Ljava/util/List;", "getDragAndDropFilter", "()Ljava/util/List;", "setDragAndDropFilter", "(Ljava/util/List;)V", "disableFullscreen", "Lcom/facebook/react/views/textinput/SelectionWatcher;", "Lcom/facebook/react/views/textinput/ContentSizeWatcher;", "Lcom/facebook/react/views/textinput/ScrollWatcher;", "Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;", "keyListener$1", "Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;", "keyListener", "detectScrollMovement", "Lcom/facebook/react/views/text/TextAttributes;", "textAttributes", "Lcom/facebook/react/views/text/TextAttributes;", "typefaceDirty", ViewProps.FONT_WEIGHT, ViewProps.FONT_STYLE, "didAttachToWindow", "Lcom/facebook/react/uimanager/style/Overflow;", "Lcom/facebook/react/uimanager/style/Overflow;", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "disableTextDiffing", "getDisableTextDiffing$ReactAndroid_release", "setDisableTextDiffing$ReactAndroid_release", "isSettingTextFromState", "setSettingTextFromState", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "textWatcherDelegator", "Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "getTextWatcherDelegator", "()Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "returnKeyType", "getReturnKeyType", "setReturnKeyType", "isSecureText", "isMultiline$ReactAndroid_release", "isMultiline", "disableFullscreenUI", "getDisableFullscreenUI", "setDisableFullscreenUI", "getGravityHorizontal$ReactAndroid_release", "setGravityHorizontal$ReactAndroid_release", "gravityHorizontal", "getGravityVertical$ReactAndroid_release", "setGravityVertical$ReactAndroid_release", "gravityVertical", "Companion", "TextWatcherDelegator", "InternalKeyListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1319:1\n1761#2,3:1320\n*S KotlinDebug\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText\n*L\n1217#1:1320,3\n*E\n"})
/* loaded from: classes2.dex */
public class ReactEditText extends AppCompatEditText {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean DEBUG_MODE;

    @NotNull
    private static final KeyListener keyListener;

    @NotNull
    private final String TAG;
    private boolean autoFocus;
    private boolean containsImages;

    @Nullable
    private ContentSizeWatcher contentSizeWatcher;
    private boolean contextMenuHidden;
    private final int defaultGravityHorizontal;
    private final int defaultGravityVertical;
    private boolean detectScrollMovement;
    private boolean didAttachToWindow;
    private boolean disableFullscreen;
    private boolean disableTextDiffing;

    @Nullable
    private List<String> dragAndDropFilter;

    @Nullable
    private EventDispatcher eventDispatcher;

    @Nullable
    private String fontFamily;
    private int fontStyle;
    private int fontWeight;

    @NotNull
    private final InputMethodManager inputMethodManager;
    private boolean isSettingTextFromJS;
    private boolean isSettingTextFromState;

    /* renamed from: keyListener$1, reason: from kotlin metadata */
    @Nullable
    private InternalKeyListener keyListener;

    @Nullable
    private CopyOnWriteArrayList<TextWatcher> listeners;
    private int nativeEventCount;
    private boolean onKeyPress;

    @NotNull
    private Overflow overflow;

    @Nullable
    private String placeholder;

    @Nullable
    private String returnKeyType;

    @Nullable
    private ScrollWatcher scrollWatcher;
    private boolean selectTextOnFocus;

    @Nullable
    private SelectionWatcher selectionWatcher;
    private int stagedInputType;

    @Nullable
    private StateWrapper stateWrapper;

    @Nullable
    private String submitBehavior;

    @NotNull
    private final TextAttributes textAttributes;

    @Nullable
    private TextWatcherDelegator textWatcherDelegator;
    private boolean typefaceDirty;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText$Companion;", "", "<init>", "()V", "DEBUG_MODE", "", "getDEBUG_MODE", "()Z", "keyListener", "Landroid/text/method/KeyListener;", "sameTextForSpan", "oldText", "Landroid/text/Editable;", "newText", "Landroid/text/SpannableStringBuilder;", ViewProps.START, "", ViewProps.END, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean sameTextForSpan(Editable oldText, SpannableStringBuilder newText, int start, int end) {
            if (start > newText.length() || end > newText.length()) {
                return false;
            }
            while (start < end) {
                if (oldText.charAt(start) != newText.charAt(start)) {
                    return false;
                }
                start++;
            }
            return true;
        }

        public final boolean getDEBUG_MODE() {
            return ReactEditText.DEBUG_MODE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText$InternalKeyListener;", "Landroid/text/method/KeyListener;", "<init>", "()V", "_inputType", "", "getInputType", "setInputType", "", "inputType", "onKeyDown", "", "view", "Landroid/view/View;", "text", "Landroid/text/Editable;", "keyCode", "event", "Landroid/view/KeyEvent;", "onKeyUp", "onKeyOther", "clearMetaKeyState", "content", "states", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalKeyListener implements KeyListener {
        private int _inputType;

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(@NotNull View view, @NotNull Editable content, int states) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(content, "content");
            ReactEditText.keyListener.clearMetaKeyState(view, content, states);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this._inputType;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(@NotNull View view, @NotNull Editable text, int keyCode, @NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return ReactEditText.keyListener.onKeyDown(view, text, keyCode, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(@NotNull View view, @NotNull Editable text, @NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return ReactEditText.keyListener.onKeyOther(view, text, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(@NotNull View view, @NotNull Editable text, int keyCode, @NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return ReactEditText.keyListener.onKeyUp(view, text, keyCode, event);
        }

        public final void setInputType(int inputType) {
            this._inputType = inputType;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator;", "Landroid/text/TextWatcher;", "<init>", "(Lcom/facebook/react/views/textinput/ReactEditText;)V", "beforeTextChanged", "", "s", "", ViewProps.START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1319:1\n1869#2,2:1320\n1869#2,2:1322\n1869#2,2:1324\n*S KotlinDebug\n*F\n+ 1 ReactEditText.kt\ncom/facebook/react/views/textinput/ReactEditText$TextWatcherDelegator\n*L\n1232#1:1320,2\n1242#1:1322,2\n1252#1:1324,2\n*E\n"})
    public final class TextWatcherDelegator implements TextWatcher {
        public TextWatcherDelegator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable s10) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (ReactEditText.this.getIsSettingTextFromJS() || (copyOnWriteArrayList = ReactEditText.this.listeners) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(s10);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence s10, int start, int count, int after) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (ReactEditText.this.getIsSettingTextFromJS() || (copyOnWriteArrayList = ReactEditText.this.listeners) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(s10, start, count, after);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence s10, int start, int before, int count) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (ReactEditText.INSTANCE.getDEBUG_MODE()) {
                E6.a.m(ReactEditText.this.TAG, "onTextChanged[" + ReactEditText.this.getId() + "]: " + ((Object) s10) + " " + start + " " + before + " " + count);
            }
            if (!ReactEditText.this.getIsSettingTextFromJS() && (copyOnWriteArrayList = ReactEditText.this.listeners) != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(s10, start, before, count);
                }
            }
            ReactEditText.this.updateCachedSpannable();
            ReactEditText.this.onContentSizeChange();
        }
    }

    static {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        DEBUG_MODE = false;
        QwertyKeyListener instanceForFullKeyboard = QwertyKeyListener.getInstanceForFullKeyboard();
        Intrinsics.checkNotNullExpressionValue(instanceForFullKeyboard, "getInstanceForFullKeyboard(...)");
        keyListener = instanceForFullKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        String simpleName = ReactEditText.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
        this.fontWeight = -1;
        this.fontStyle = -1;
        this.overflow = Overflow.VISIBLE;
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.inputMethodManager = (InputMethodManager) systemService;
        this.defaultGravityHorizontal = getGravity() & 8388615;
        this.defaultGravityVertical = getGravity() & 112;
        this.nativeEventCount = 0;
        this.isSettingTextFromJS = false;
        this.disableFullscreen = false;
        this.listeners = null;
        this.stagedInputType = getInputType();
        if (this.keyListener == null) {
            this.keyListener = new InternalKeyListener();
        }
        this.scrollWatcher = null;
        this.textAttributes = new TextAttributes();
        applyTextAttributes();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, null);
        }
        final boolean isFocusable = isFocusable();
        final int importantForAccessibility = getImportantForAccessibility();
        AbstractC2082d0.l0(this, new ReactAccessibilityDelegate(isFocusable, importantForAccessibility) { // from class: com.facebook.react.views.textinput.ReactEditText$editTextAccessibilityDelegate$1
            @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.C2075a
            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                boolean requestFocusProgrammatically;
                Intrinsics.checkNotNullParameter(host, "host");
                if (action != 16) {
                    return super.performAccessibilityAction(host, action, args);
                }
                Editable text = ReactEditText.this.getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int length = text.length();
                if (length > 0) {
                    ReactEditText.this.setSelection(length);
                }
                requestFocusProgrammatically = ReactEditText.this.requestFocusProgrammatically();
                return requestFocusProgrammatically;
            }
        });
        ActionMode.Callback callback = new ActionMode.Callback() { // from class: com.facebook.react.views.textinput.ReactEditText$customActionModeCallback$1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(item, "item");
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                boolean z10;
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(menu, "menu");
                z10 = ReactEditText.this.contextMenuHidden;
                if (z10) {
                    return false;
                }
                menu.removeItem(R.id.pasteAsPlainText);
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode mode) {
                Intrinsics.checkNotNullParameter(mode, "mode");
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(menu, "menu");
                return true;
            }
        };
        setCustomSelectionActionModeCallback(callback);
        setCustomInsertionActionModeCallback(callback);
    }

    private final void addSpansFromStyleAttributes(SpannableStringBuilder workingText) {
        workingText.setSpan(new ReactAbsoluteSizeSpan(this.textAttributes.getEffectiveFontSize()), 0, workingText.length(), 16711698);
        workingText.setSpan(new ReactForegroundColorSpan(getCurrentTextColor()), 0, workingText.length(), 16711698);
        Integer backgroundColor = BackgroundStyleApplicator.getBackgroundColor(this);
        if (backgroundColor != null && backgroundColor.intValue() != 0) {
            workingText.setSpan(new ReactBackgroundColorSpan(backgroundColor.intValue()), 0, workingText.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            workingText.setSpan(new ReactStrikethroughSpan(), 0, workingText.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            workingText.setSpan(new ReactUnderlineSpan(), 0, workingText.length(), 16711698);
        }
        float effectiveLetterSpacing = this.textAttributes.getEffectiveLetterSpacing();
        if (!Float.isNaN(effectiveLetterSpacing)) {
            workingText.setSpan(new CustomLetterSpacingSpan(effectiveLetterSpacing), 0, workingText.length(), 16711698);
        }
        if (this.fontStyle != -1 || this.fontWeight != -1 || this.fontFamily != null || getFontFeatureSettings() != null) {
            int i10 = this.fontStyle;
            int i11 = this.fontWeight;
            String fontFeatureSettings = getFontFeatureSettings();
            String str = this.fontFamily;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            workingText.setSpan(new CustomStyleSpan(i10, i11, fontFeatureSettings, str, assets), 0, workingText.length(), 16711698);
        }
        float effectiveLineHeight = this.textAttributes.getEffectiveLineHeight();
        if (Float.isNaN(effectiveLineHeight)) {
            return;
        }
        workingText.setSpan(new CustomLineHeightSpan(effectiveLineHeight), 0, workingText.length(), 16711698);
    }

    private final int clampToTextLength(int value) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            length = text.length();
        }
        return (int) Math.max(0.0d, Math.min(value, length));
    }

    private final TextWatcherDelegator getTextWatcherDelegator() {
        if (this.textWatcherDelegator == null) {
            this.textWatcherDelegator = new TextWatcherDelegator();
        }
        return this.textWatcherDelegator;
    }

    private final boolean isSecureText() {
        return (getInputType() & 144) != 0;
    }

    private final void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        Editable text = getText();
        if (text == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (Object obj : text.getSpans(0, length(), Object.class)) {
            int spanFlags = text.getSpanFlags(obj);
            boolean z10 = (spanFlags & 33) == 33;
            if (obj instanceof ReactSpan) {
                text.removeSpan(obj);
            }
            if (z10) {
                int spanStart = text.getSpanStart(obj);
                int spanEnd = text.getSpanEnd(obj);
                text.removeSpan(obj);
                if (INSTANCE.sameTextForSpan(text, spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private final void maybeSetText(ReactTextUpdate reactTextUpdate) {
        if (!(isSecureText() && Intrinsics.areEqual(getText(), reactTextUpdate.getText())) && canUpdateWithEventCount(reactTextUpdate.getJsEventCounter())) {
            if (DEBUG_MODE) {
                E6.a.m(this.TAG, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) reactTextUpdate.getText()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
            manageSpans(spannableStringBuilder);
            stripStyleEquivalentSpans(spannableStringBuilder);
            this.containsImages = reactTextUpdate.getContainsImages();
            this.disableTextDiffing = true;
            if (reactTextUpdate.getText().length() == 0) {
                setText((CharSequence) null);
            } else {
                Editable text = getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                text.replace(0, length(), spannableStringBuilder);
            }
            this.disableTextDiffing = false;
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            updateCachedSpannable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContentSizeChange() {
        ContentSizeWatcher contentSizeWatcher = this.contentSizeWatcher;
        if (contentSizeWatcher != null) {
            contentSizeWatcher.onLayout();
        }
        setIntrinsicContentSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean requestFocusProgrammatically() {
        boolean requestFocus = super.requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            showSoftKeyboard();
        }
        return requestFocus;
    }

    private final void setIntrinsicContentSize() {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE || this.stateWrapper != null || reactContext.isBridgeless()) {
            return;
        }
        ReactTextInputLocalData reactTextInputLocalData = new ReactTextInputLocalData(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), reactTextInputLocalData);
        }
    }

    private final <T> void stripSpansOfKind(SpannableStringBuilder sb2, Class<T> clazz, x0.g shouldStrip) {
        Iterator it = ArrayIteratorKt.iterator(sb2.getSpans(0, sb2.length(), clazz));
        while (it.hasNext()) {
            Object next = it.next();
            if (shouldStrip.test(next)) {
                sb2.removeSpan(next);
            }
        }
    }

    private final void stripStyleEquivalentSpans(SpannableStringBuilder sb2) {
        stripSpansOfKind(sb2, ReactAbsoluteSizeSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.a
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$1;
                stripStyleEquivalentSpans$lambda$1 = ReactEditText.stripStyleEquivalentSpans$lambda$1(ReactEditText.this, (ReactAbsoluteSizeSpan) obj);
                return stripStyleEquivalentSpans$lambda$1;
            }
        });
        stripSpansOfKind(sb2, ReactBackgroundColorSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.b
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$2;
                stripStyleEquivalentSpans$lambda$2 = ReactEditText.stripStyleEquivalentSpans$lambda$2(ReactEditText.this, (ReactBackgroundColorSpan) obj);
                return stripStyleEquivalentSpans$lambda$2;
            }
        });
        stripSpansOfKind(sb2, ReactForegroundColorSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.c
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$3;
                stripStyleEquivalentSpans$lambda$3 = ReactEditText.stripStyleEquivalentSpans$lambda$3(ReactEditText.this, (ReactForegroundColorSpan) obj);
                return stripStyleEquivalentSpans$lambda$3;
            }
        });
        stripSpansOfKind(sb2, ReactStrikethroughSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.d
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$4;
                stripStyleEquivalentSpans$lambda$4 = ReactEditText.stripStyleEquivalentSpans$lambda$4(ReactEditText.this, (ReactStrikethroughSpan) obj);
                return stripStyleEquivalentSpans$lambda$4;
            }
        });
        stripSpansOfKind(sb2, ReactUnderlineSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.e
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$5;
                stripStyleEquivalentSpans$lambda$5 = ReactEditText.stripStyleEquivalentSpans$lambda$5(ReactEditText.this, (ReactUnderlineSpan) obj);
                return stripStyleEquivalentSpans$lambda$5;
            }
        });
        stripSpansOfKind(sb2, CustomLetterSpacingSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.f
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$6;
                stripStyleEquivalentSpans$lambda$6 = ReactEditText.stripStyleEquivalentSpans$lambda$6(ReactEditText.this, (CustomLetterSpacingSpan) obj);
                return stripStyleEquivalentSpans$lambda$6;
            }
        });
        stripSpansOfKind(sb2, CustomStyleSpan.class, new x0.g() { // from class: com.facebook.react.views.textinput.g
            @Override // x0.g
            public final boolean test(Object obj) {
                boolean stripStyleEquivalentSpans$lambda$7;
                stripStyleEquivalentSpans$lambda$7 = ReactEditText.stripStyleEquivalentSpans$lambda$7(ReactEditText.this, (CustomStyleSpan) obj);
                return stripStyleEquivalentSpans$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$1(ReactEditText reactEditText, ReactAbsoluteSizeSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getSize() == reactEditText.textAttributes.getEffectiveFontSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$2(ReactEditText reactEditText, ReactBackgroundColorSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        int backgroundColor = span.getBackgroundColor();
        Integer backgroundColor2 = BackgroundStyleApplicator.getBackgroundColor(reactEditText);
        return backgroundColor2 != null && backgroundColor == backgroundColor2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$3(ReactEditText reactEditText, ReactForegroundColorSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getForegroundColor() == reactEditText.getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$4(ReactEditText reactEditText, ReactStrikethroughSpan reactStrikethroughSpan) {
        return (reactEditText.getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$5(ReactEditText reactEditText, ReactUnderlineSpan reactUnderlineSpan) {
        return (reactEditText.getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$6(ReactEditText reactEditText, CustomLetterSpacingSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getSpacing() == reactEditText.textAttributes.getEffectiveLetterSpacing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stripStyleEquivalentSpans$lambda$7(ReactEditText reactEditText, CustomStyleSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getStyle() == reactEditText.fontStyle && Intrinsics.areEqual(span.getFontFamily(), reactEditText.fontFamily) && span.getWeight() == reactEditText.fontWeight && Intrinsics.areEqual(span.getFontFeatureSettings(), reactEditText.getFontFeatureSettings());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCachedSpannable() {
        if (this.stateWrapper == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z10 = text == null || text.length() == 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (text != null && !z10) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e10) {
                ReactSoftExceptionLogger.logSoftException(this.TAG, e10);
            }
        }
        if (z10) {
            if (getHint() != null) {
                CharSequence hint = getHint();
                Intrinsics.checkNotNullExpressionValue(hint, "getHint(...)");
                if (hint.length() > 0) {
                    spannableStringBuilder.append(getHint());
                }
            }
            if (ViewUtil.getUIManagerType(this) != 2) {
                spannableStringBuilder.append("I");
            }
        }
        addSpansFromStyleAttributes(spannableStringBuilder);
        spannableStringBuilder.setSpan(new ReactTextPaintHolderSpan(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        TextLayoutManager.INSTANCE.setCachedSpannableForTag(getId(), spannableStringBuilder);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void updateImeOptions() {
        String str = this.returnKeyType;
        int i10 = 6;
        if (str != null) {
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        i10 = 7;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i10 = 3;
                        break;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        i10 = 2;
                        break;
                    }
                    break;
                case 3089282:
                    str.equals("done");
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        i10 = 5;
                        break;
                    }
                    break;
                case 3387192:
                    if (str.equals(ViewProps.NONE)) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        i10 = 4;
                        break;
                    }
                    break;
            }
        }
        if (this.disableFullscreen) {
            i10 |= 33554432;
        }
        setImeOptions(i10);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        if (this.listeners == null) {
            this.listeners = new CopyOnWriteArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.listeners;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(watcher);
        }
    }

    public final void applyTextAttributes() {
        setTextSize(0, this.textAttributes.getEffectiveFontSize());
        float effectiveLetterSpacing = this.textAttributes.getEffectiveLetterSpacing();
        if (Float.isNaN(effectiveLetterSpacing)) {
            return;
        }
        setLetterSpacing(effectiveLetterSpacing);
    }

    public final boolean canUpdateWithEventCount(int eventCounter) {
        return eventCounter >= this.nativeEventCount;
    }

    public final void clearFocusAndMaybeRefocus$ReactAndroid_release() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            super.clearFocus();
        } else {
            View rootView = getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            super.clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        hideSoftKeyboard();
    }

    public final void clearFocusFromJS$ReactAndroid_release() {
        clearFocusAndMaybeRefocus$ReactAndroid_release();
    }

    public final void commitStagedInputType$ReactAndroid_release() {
        if (getInputType() != this.stagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.stagedInputType);
            maybeSetSelection(selectionStart, selectionEnd);
        }
    }

    @SuppressLint({"ClassImplementsFinalize"})
    public final void finalize() {
        if (DEBUG_MODE) {
            E6.a.m(this.TAG, "finalize[" + getId() + "] delete cached spannable");
        }
        TextLayoutManager.INSTANCE.deleteCachedSpannableForTag(getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getBorderColor(int position) {
        Integer borderColor = BackgroundStyleApplicator.getBorderColor(this, (LogicalEdge) LogicalEdge.getEntries().get(position));
        if (borderColor != null) {
            return borderColor.intValue();
        }
        return 0;
    }

    public final boolean getContainsImages() {
        return this.containsImages;
    }

    /* renamed from: getDisableFullscreenUI, reason: from getter */
    public final boolean getDisableFullscreen() {
        return this.disableFullscreen;
    }

    /* renamed from: getDisableTextDiffing$ReactAndroid_release, reason: from getter */
    public final boolean getDisableTextDiffing() {
        return this.disableTextDiffing;
    }

    @Nullable
    public final List<String> getDragAndDropFilter() {
        return this.dragAndDropFilter;
    }

    public final int getGravityHorizontal$ReactAndroid_release() {
        return getGravity() & 8388615;
    }

    public final int getGravityVertical$ReactAndroid_release() {
        return getGravity() & 112;
    }

    public final int getNativeEventCount() {
        return this.nativeEventCount;
    }

    @Nullable
    public final String getReturnKeyType() {
        return this.returnKeyType;
    }

    public final int getStagedInputType() {
        return this.stagedInputType;
    }

    @Nullable
    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    @Nullable
    public final String getSubmitBehavior() {
        return this.submitBehavior;
    }

    public final void hideSoftKeyboard() {
        this.inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final int incrementAndGetEventCounter() {
        int i10 = this.nativeEventCount + 1;
        this.nativeEventCount = i10;
        return i10;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.containsImages) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = ArrayIteratorKt.iterator((TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class));
            while (it.hasNext()) {
                if (((TextInlineImageSpan) it.next()).getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public final boolean isMultiline$ReactAndroid_release() {
        return (getInputType() & PKIFailureInfo.unsupportedVersion) != 0;
    }

    /* renamed from: isSettingTextFromJS, reason: from getter */
    public final boolean getIsSettingTextFromJS() {
        return this.isSettingTextFromJS;
    }

    /* renamed from: isSettingTextFromState, reason: from getter */
    public final boolean getIsSettingTextFromState() {
        return this.isSettingTextFromState;
    }

    public final void maybeSetSelection(int eventCounter, int start, int end) {
        if (canUpdateWithEventCount(eventCounter)) {
            maybeSetSelection(start, end);
        }
    }

    public final void maybeSetTextFromJS(@NotNull ReactTextUpdate reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.isSettingTextFromJS = true;
        maybeSetText(reactTextUpdate);
        this.isSettingTextFromJS = false;
    }

    public final void maybeSetTextFromState(@NotNull ReactTextUpdate reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.isSettingTextFromState = true;
        maybeSetText(reactTextUpdate);
        this.isSettingTextFromState = false;
    }

    public final void maybeUpdateTypeface() {
        if (this.typefaceDirty) {
            this.typefaceDirty = false;
            Typeface typeface = getTypeface();
            int i10 = this.fontStyle;
            int i11 = this.fontWeight;
            String str = this.fontFamily;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            setTypeface(ReactTypefaceUtils.applyStyles(typeface, i10, i11, str, assets));
            boolean z10 = (this.fontStyle == -1 && this.fontWeight == -1 && this.fontFamily == null && getFontFeatureSettings() == null) ? false : true;
            setPaintFlags(z10 ? getPaintFlags() | 128 : getPaintFlags() & (-129));
            if (ReactNativeFeatureFlags.enableAndroidLinearText()) {
                setPaintFlags(z10 ? getPaintFlags() | 64 : getPaintFlags() & (-65));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        maybeSetSelection(selectionStart, selectionEnd);
        if (this.containsImages) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = ArrayIteratorKt.iterator((TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class));
            while (it.hasNext()) {
                ((TextInlineImageSpan) it.next()).onAttachedToWindow();
            }
        }
        if (this.autoFocus && !this.didAttachToWindow) {
            requestFocusProgrammatically();
        }
        this.didAttachToWindow = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
            applyTextAttributes();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection != null && this.onKeyPress) {
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher == null) {
                throw new IllegalStateException("Required value was null.");
            }
            onCreateInputConnection = new ReactEditTextInputConnectionWrapper(onCreateInputConnection, reactContext, this, eventDispatcher);
        }
        if (isMultiline$ReactAndroid_release() && (shouldBlurOnReturn() || shouldSubmitOnReturn())) {
            outAttrs.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.containsImages) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = ArrayIteratorKt.iterator((TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class));
            while (it.hasNext()) {
                ((TextInlineImageSpan) it.next()).onDetachedFromWindow();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public boolean onDragEvent(@NotNull DragEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List<String> list = this.dragAndDropFilter;
        if (list != null && event.getAction() == 1) {
            List<String> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (event.getClipDescription().hasMimeType((String) it.next())) {
                }
            }
            return false;
        }
        return super.onDragEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.overflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.containsImages) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = ArrayIteratorKt.iterator((TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class));
            while (it.hasNext()) {
                ((TextInlineImageSpan) it.next()).onFinishTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, @Nullable Rect previouslyFocusedRect) {
        SelectionWatcher selectionWatcher;
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (!focused || (selectionWatcher = this.selectionWatcher) == null || selectionWatcher == null) {
            return;
        }
        selectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode != 66 || isMultiline$ReactAndroid_release()) {
            return super.onKeyUp(keyCode, event);
        }
        hideSoftKeyboard();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        onContentSizeChange();
        if (this.selectTextOnFocus && isFocused()) {
            selectAll();
            this.selectTextOnFocus = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert) {
        super.onScrollChanged(horiz, vert, oldHoriz, oldVert);
        ScrollWatcher scrollWatcher = this.scrollWatcher;
        if (scrollWatcher != null) {
            scrollWatcher.onScrollChanged(horiz, vert, oldHoriz, oldVert);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        SelectionWatcher selectionWatcher;
        if (DEBUG_MODE) {
            E6.a.m(this.TAG, "onSelectionChanged[" + getId() + "]: " + selStart + " " + selEnd);
        }
        super.onSelectionChanged(selStart, selEnd);
        if (this.selectionWatcher == null || !hasFocus() || (selectionWatcher = this.selectionWatcher) == null) {
            return;
        }
        selectionWatcher.onSelectionChanged(selStart, selEnd);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.containsImages) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = ArrayIteratorKt.iterator((TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class));
            while (it.hasNext()) {
                ((TextInlineImageSpan) it.next()).onStartTemporaryDetach();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int id2) {
        if (id2 == 16908322) {
            id2 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(id2);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.detectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.detectScrollMovement) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.detectScrollMovement = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.listeners;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(watcher);
            if (copyOnWriteArrayList.isEmpty()) {
                this.listeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final void requestFocusFromJS() {
        requestFocusProgrammatically();
    }

    public final void setAllowFontScaling(boolean allowFontScaling) {
        if (this.textAttributes.getAllowFontScaling() != allowFontScaling) {
            this.textAttributes.setAllowFontScaling(allowFontScaling);
            applyTextAttributes();
        }
    }

    public final void setAutoFocus(boolean autoFocus) {
        this.autoFocus = autoFocus;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(color));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBorderColor(int position, @Nullable Integer color) {
        BackgroundStyleApplicator.setBorderColor(this, (LogicalEdge) LogicalEdge.getEntries().get(position), color);
    }

    public final void setBorderRadius(float borderRadius) {
        setBorderRadius(borderRadius, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public final void setBorderStyle(@Nullable String style) {
        BackgroundStyleApplicator.setBorderStyle(this, style == null ? null : BorderStyle.INSTANCE.fromString(style));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBorderWidth(int position, float width) {
        BackgroundStyleApplicator.setBorderWidth(this, (LogicalEdge) LogicalEdge.getEntries().get(position), Float.valueOf(PixelUtil.toDIPFromPixel(width)));
    }

    public final void setContainsImages(boolean z10) {
        this.containsImages = z10;
    }

    public final void setContentSizeWatcher(@Nullable ContentSizeWatcher contentSizeWatcher) {
        this.contentSizeWatcher = contentSizeWatcher;
    }

    public final void setContextMenuHidden(boolean contextMenuHidden) {
        this.contextMenuHidden = contextMenuHidden;
    }

    public final void setDisableFullscreenUI(boolean z10) {
        this.disableFullscreen = z10;
        updateImeOptions();
    }

    public final void setDisableTextDiffing$ReactAndroid_release(boolean z10) {
        this.disableTextDiffing = z10;
    }

    public final void setDragAndDropFilter(@Nullable List<String> list) {
        this.dragAndDropFilter = list;
    }

    public final void setEventDispatcher(@Nullable EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }

    public final void setFontFamily(@Nullable String fontFamily) {
        this.fontFamily = fontFamily;
        this.typefaceDirty = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(@Nullable String fontFeatureSettings) {
        if (Intrinsics.areEqual(fontFeatureSettings, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(fontFeatureSettings);
        this.typefaceDirty = true;
    }

    public final void setFontSize(float fontSize) {
        this.textAttributes.setFontSize(fontSize);
        applyTextAttributes();
    }

    public final void setFontStyle(@Nullable String fontStyleString) {
        int parseFontStyle = ReactTypefaceUtils.parseFontStyle(fontStyleString);
        if (parseFontStyle != this.fontStyle) {
            this.fontStyle = parseFontStyle;
            this.typefaceDirty = true;
        }
    }

    public final void setFontWeight(@Nullable String fontWeightString) {
        int parseFontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
        if (parseFontWeight != this.fontWeight) {
            this.fontWeight = parseFontWeight;
            this.typefaceDirty = true;
        }
    }

    public final void setGravityHorizontal$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.defaultGravityHorizontal;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    public final void setGravityVertical$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.defaultGravityVertical;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int type) {
        Typeface typeface = super.getTypeface();
        super.setInputType(type);
        this.stagedInputType = type;
        super.setTypeface(typeface);
        if (isMultiline$ReactAndroid_release()) {
            setSingleLine(false);
        }
        if (this.keyListener == null) {
            this.keyListener = new InternalKeyListener();
        }
        InternalKeyListener internalKeyListener = this.keyListener;
        if (internalKeyListener != null) {
            internalKeyListener.setInputType(type);
        }
        super.setKeyListener(this.keyListener);
    }

    public final void setLetterSpacingPt(float letterSpacingPt) {
        this.textAttributes.setLetterSpacing(letterSpacingPt);
        applyTextAttributes();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int lineHeight) {
        this.textAttributes.setLineHeight(lineHeight);
    }

    public final void setMaxFontSizeMultiplier(float maxFontSizeMultiplier) {
        if (maxFontSizeMultiplier == this.textAttributes.getMaxFontSizeMultiplier()) {
            return;
        }
        this.textAttributes.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
        applyTextAttributes();
    }

    public final void setNativeEventCount(int i10) {
        this.nativeEventCount = i10;
    }

    public final void setOnKeyPress(boolean onKeyPress) {
        this.onKeyPress = onKeyPress;
    }

    public final void setOverflow(@Nullable String overflow) {
        if (overflow == null) {
            this.overflow = Overflow.VISIBLE;
        } else {
            Overflow fromString = Overflow.INSTANCE.fromString(overflow);
            if (fromString == null) {
                fromString = Overflow.VISIBLE;
            }
            this.overflow = fromString;
        }
        invalidate();
    }

    public final void setPlaceholder(@Nullable String placeholder) {
        if (Intrinsics.areEqual(placeholder, this.placeholder)) {
            return;
        }
        this.placeholder = placeholder;
        setHint(placeholder);
    }

    public final void setReturnKeyType(@Nullable String str) {
        this.returnKeyType = str;
        updateImeOptions();
    }

    public final void setScrollWatcher(@Nullable ScrollWatcher scrollWatcher) {
        this.scrollWatcher = scrollWatcher;
    }

    public final void setSelectTextOnFocus(boolean selectTextOnFocus) {
        super.setSelectAllOnFocus(selectTextOnFocus);
        this.selectTextOnFocus = selectTextOnFocus;
    }

    @Override // android.widget.EditText
    public void setSelection(int start, int end) {
        if (DEBUG_MODE) {
            E6.a.m(this.TAG, "setSelection[" + getId() + "]: " + start + " " + end);
        }
        super.setSelection(start, end);
    }

    public final void setSelectionWatcher$ReactAndroid_release(@Nullable SelectionWatcher selectionWatcher) {
        this.selectionWatcher = selectionWatcher;
    }

    public final void setSettingTextFromJS(boolean z10) {
        this.isSettingTextFromJS = z10;
    }

    public final void setSettingTextFromState(boolean z10) {
        this.isSettingTextFromState = z10;
    }

    public final void setStagedInputType(int i10) {
        this.stagedInputType = i10;
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }

    public final void setSubmitBehavior(@Nullable String str) {
        this.submitBehavior = str;
    }

    public final boolean shouldBlurOnReturn() {
        String str = this.submitBehavior;
        return str == null ? !isMultiline$ReactAndroid_release() : Intrinsics.areEqual(str, "blurAndSubmit");
    }

    public final boolean shouldSubmitOnReturn() {
        String str = this.submitBehavior;
        return str == null ? !isMultiline$ReactAndroid_release() : Intrinsics.areEqual(str, "submit") || Intrinsics.areEqual(str, "blurAndSubmit");
    }

    public final boolean showSoftKeyboard() {
        return this.inputMethodManager.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.containsImages) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = ArrayIteratorKt.iterator((TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class));
            while (it.hasNext()) {
                if (((TextInlineImageSpan) it.next()).getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, (BorderRadiusProp) BorderRadiusProp.getEntries().get(position), Float.isNaN(borderRadius) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(borderRadius), LengthPercentageType.POINT));
    }

    private final void maybeSetSelection(int start, int end) {
        if (start == -1 || end == -1) {
            return;
        }
        setSelection(clampToTextLength(start), clampToTextLength(end));
    }
}
