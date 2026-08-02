package ru.ozon.fintech.ui.input;

import Q9.a;
import R9.c;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Sc.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hB.ViewOnTouchListenerC6882a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import y7.C10856g;

@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u0000 «\u00022\u00020\u0001:\u0010«\u0002¬\u0002\u00ad\u0002®\u0002¯\u0002°\u0002±\u0002²\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010*J\u0013\u0010,\u001a\u00020\u0012*\u00020(H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010/J\u0011\u00100\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b0\u0010'J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u0010/J\u000f\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u0010/J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u0010/J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010/J\u0011\u00106\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0011\u0010<\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b<\u00107J\u0017\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010@J\u0017\u0010E\u001a\u00020\u00122\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0013\u0010G\u001a\u00020\u0012*\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010\u0017J\u000f\u0010H\u001a\u00020\u0006H\u0003¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00122\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ!\u0010R\u001a\u00020\u001a2\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010U\u001a\u00020\u0012*\u00020\u00152\u0006\u0010T\u001a\u00020NH\u0002¢\u0006\u0004\bU\u0010VR*\u0010A\u001a\u00020=2\u0006\u0010\u0011\u001a\u00020=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010@R*\u0010K\u001a\u00020J2\u0006\u0010\u0011\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010MR*\u0010_\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR*\u0010e\u001a\u00020C2\u0006\u0010\u0011\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010FR*\u0010j\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010I\"\u0004\bm\u0010nR.\u0010o\u001a\u0004\u0018\u00010N2\b\u0010\u0011\u001a\u0004\u0018\u00010N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010u\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR.\u0010{\u001a\u0004\u0018\u00010N2\b\u0010\u0011\u001a\u0004\u0018\u00010N8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010p\u001a\u0004\b|\u0010r\"\u0004\b}\u0010tR/\u0010\u007f\u001a\u00020~2\u0006\u0010\u0011\u001a\u00020~8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R2\u0010\u0085\u0001\u001a\u0004\u0018\u00010N2\b\u0010\u0011\u001a\u0004\u0018\u00010N8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010p\u001a\u0005\b\u0086\u0001\u0010r\"\u0005\b\u0087\u0001\u0010tR.\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010k\u001a\u0005\b\u0089\u0001\u0010I\"\u0005\b\u008a\u0001\u0010nR5\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R3\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0011\u001a\u00030\u0091\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010\u0098\u0001\u001a\u0004\u0018\u00010\n8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010\fR\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R8\u0010\u009e\u0001\u001a\u0011\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¤\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010kR5\u0010¥\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u008c\u0001\u001a\u0006\b¦\u0001\u0010\u008e\u0001\"\u0006\b§\u0001\u0010\u0090\u0001R.\u0010¨\u0001\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010v\u001a\u0005\b©\u0001\u0010x\"\u0005\bª\u0001\u0010zR.\u0010«\u0001\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b«\u0001\u0010k\u001a\u0005\b¬\u0001\u0010I\"\u0005\b\u00ad\u0001\u0010nR.\u0010®\u0001\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b®\u0001\u0010v\u001a\u0005\b®\u0001\u0010x\"\u0005\b¯\u0001\u0010zR&\u0010°\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010v\u001a\u0005\b±\u0001\u0010x\"\u0005\b²\u0001\u0010zR.\u0010³\u0001\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010v\u001a\u0005\b´\u0001\u0010x\"\u0005\bµ\u0001\u0010zR\u001c\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001c\u0010¹\u0001\u001a\u00020P8\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R2\u0010½\u0001\u001a\u0004\u0018\u00010N2\b\u0010\u0011\u001a\u0004\u0018\u00010N8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010p\u001a\u0005\b¾\u0001\u0010r\"\u0005\b¿\u0001\u0010tR0\u0010À\u0001\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010\u0014R7\u0010Æ\u0001\u001a\u0010\u0012\u0005\u0012\u00030Å\u0001\u0012\u0004\u0012\u00020\u00120\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010\u009f\u0001\u001a\u0006\bÇ\u0001\u0010¡\u0001\"\u0006\bÈ\u0001\u0010£\u0001R0\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120É\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R0\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120É\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ë\u0001\u001a\u0006\bÑ\u0001\u0010Í\u0001\"\u0006\bÒ\u0001\u0010Ï\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Û\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0016\u0010Ý\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÝ\u0001\u0010kR\u0016\u0010Þ\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÞ\u0001\u0010kR\u0016\u0010ß\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bß\u0001\u0010kR\u0016\u0010à\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bà\u0001\u0010kR\u0016\u0010á\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bá\u0001\u0010kR\u0016\u0010â\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bâ\u0001\u0010kR\u0016\u0010ã\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bã\u0001\u0010kR\u0016\u0010ä\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bä\u0001\u0010kR\u0016\u0010å\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bå\u0001\u0010kR\u0016\u0010æ\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bæ\u0001\u0010kR\u0016\u0010ç\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bç\u0001\u0010kR\u0016\u0010è\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bè\u0001\u0010kR\u0016\u0010é\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bé\u0001\u0010kR\u0016\u0010ê\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bê\u0001\u0010kR\u0016\u0010ë\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bë\u0001\u0010kR\u0016\u0010ì\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bì\u0001\u0010kR\u0016\u0010í\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bí\u0001\u0010kR\u0018\u0010î\u0001\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bî\u0001\u0010WR\u0018\u0010ð\u0001\u001a\u00030ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0018\u0010ó\u0001\u001a\u00030ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R.\u0010õ\u0001\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bõ\u0001\u0010k\u001a\u0005\bö\u0001\u0010I\"\u0005\b÷\u0001\u0010nR\u0018\u0010ø\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bø\u0001\u0010kR\u001c\u0010ù\u0001\u001a\u00020\u00158\u0006¢\u0006\u0010\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R\u0018\u0010þ\u0001\u001a\u00030ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R5\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010\u008c\u0001\u001a\u0006\b\u0081\u0002\u0010\u008e\u0001\"\u0006\b\u0082\u0002\u0010\u0090\u0001R5\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010\u008c\u0001\u001a\u0006\b\u0084\u0002\u0010\u008e\u0001\"\u0006\b\u0085\u0002\u0010\u0090\u0001R*\u0010\u0086\u0002\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0005\b\u0088\u0002\u0010#\"\u0006\b\u0089\u0002\u0010\u008a\u0002R*\u0010\u008b\u0002\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0002\u0010\u0087\u0002\u001a\u0005\b\u008c\u0002\u0010#\"\u0006\b\u008d\u0002\u0010\u008a\u0002R!\u0010\u0093\u0002\u001a\u00030\u008e\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001b\u0010\u0094\u0002\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u001b\u0010\u0096\u0002\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0095\u0002R'\u0010\u0099\u0002\u001a\u00020N2\u0006\u0010\u0011\u001a\u00020N8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0097\u0002\u0010r\"\u0005\b\u0098\u0002\u0010tR\u0013\u0010\u009b\u0002\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009a\u0002\u0010IR\u0013\u0010\u009d\u0002\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\b\u009c\u0002\u0010xR\u0016\u0010\u009e\u0002\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0002\u0010xR\u0016\u0010 \u0002\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0002\u0010xR\u0016\u0010¢\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0002\u0010IR\u0018\u0010¦\u0002\u001a\u00030£\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010¥\u0002R\u0018\u0010¨\u0002\u001a\u00030£\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¥\u0002R\u0016\u0010ª\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0002\u0010I¨\u0006³\u0002"}, d2 = {"Lru/ozon/fintech/ui/input/InputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/ui/input/CounterView;", "createCounterView", "()Lru/ozon/fintech/ui/input/CounterView;", "Lru/ozon/fintech/ui/input/TextAreaInfoActionIconView;", "createTextAreaInfoActionIconView", "()Lru/ozon/fintech/ui/input/TextAreaInfoActionIconView;", "Lru/ozon/fintech/ui/input/InputView$InputMode;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "updateInputTextViewInputMode", "(Lru/ozon/fintech/ui/input/InputView$InputMode;)V", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "reSetOnFocusChangeListener", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;)V", "Landroid/view/MotionEvent;", "event", "", "isClickOnIcons", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "position", "getLabelTextColorByPosition", "(Lru/ozon/fintech/ui/input/InputView$LabelPosition;)I", "Landroidx/appcompat/widget/AppCompatImageView;", "createFirstIconView", "()Landroidx/appcompat/widget/AppCompatImageView;", "createSecondIconView", "Landroidx/appcompat/widget/AppCompatTextView;", "createCaptionView", "()Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getCaptionLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getBackgroundViewLayoutParams", "updateBgMatchConstraintMinHeight", "(Landroidx/constraintlayout/widget/ConstraintLayout$b;)V", "layoutInputState", "()V", "updateLabelLayoutParams", "updateBackgroundLayoutParams", "updatePlaceHolderAndLabelState", "updateInputTextViewLayoutParams", "updateFirstAndSecondIconsLayoutParams", "updateIconInfoLayoutParams", "updateTextAreaInfoActionIconViewLayoutParams", "()Lkotlin/Unit;", "Lru/ozon/fintech/ui/input/TextAreaAction;", "action", "updateTextAreaInfoActionIconViewState", "(Lru/ozon/fintech/ui/input/TextAreaAction;)V", "updateCounterLayoutParams", "Lru/ozon/fintech/ui/input/InputView$State;", "newValue", "updateState", "(Lru/ozon/fintech/ui/input/InputView$State;)V", "state", "changeState", "Lru/ozon/fintech/ui/input/InputView$Theme;", "th", "changeTheme", "(Lru/ozon/fintech/ui/input/InputView$Theme;)V", "enableInputText", "getColorByTheme", "()I", "Lru/ozon/fintech/ui/input/InputView$Status;", "status", "changeStatus", "(Lru/ozon/fintech/ui/input/InputView$Status;)V", "", FormPageDTO.Field.FIELD_TYPE_MASK, "LS9/c;", "notation", "isMaskAcceptable", "(Ljava/lang/String;LS9/c;)Z", "newText", "updateTextPreserveCursorV2", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;Ljava/lang/String;)V", "Lru/ozon/fintech/ui/input/InputView$State;", "getState", "()Lru/ozon/fintech/ui/input/InputView$State;", "setState", "Lru/ozon/fintech/ui/input/InputView$Status;", "getStatus", "()Lru/ozon/fintech/ui/input/InputView$Status;", "setStatus", "labelPosition", "Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "getLabelPosition", "()Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "setLabelPosition", "(Lru/ozon/fintech/ui/input/InputView$LabelPosition;)V", "theme", "Lru/ozon/fintech/ui/input/InputView$Theme;", "getTheme", "()Lru/ozon/fintech/ui/input/InputView$Theme;", "setTheme", "maxLength", "I", "getMaxLength", "setMaxLength", "(I)V", "placeHolder", "Ljava/lang/String;", "getPlaceHolder", "()Ljava/lang/String;", "setPlaceHolder", "(Ljava/lang/String;)V", "allowInputClearWhenInactive", "Z", "getAllowInputClearWhenInactive", "()Z", "setAllowInputClearWhenInactive", "(Z)V", "label", "getLabel", "setLabel", "Lru/ozon/fintech/ui/input/InputView$Size;", "size", "Lru/ozon/fintech/ui/input/InputView$Size;", "getSize", "()Lru/ozon/fintech/ui/input/InputView$Size;", "setSize", "(Lru/ozon/fintech/ui/input/InputView$Size;)V", "caption", "getCaption", "setCaption", "captionMaxLines", "getCaptionMaxLines", "setCaptionMaxLines", "captionColor", "Ljava/lang/Integer;", "getCaptionColor", "()Ljava/lang/Integer;", "setCaptionColor", "(Ljava/lang/Integer;)V", "Lru/ozon/fintech/ui/input/InputView$Style;", "style", "Lru/ozon/fintech/ui/input/InputView$Style;", "getStyle", "()Lru/ozon/fintech/ui/input/InputView$Style;", "setStyle", "(Lru/ozon/fintech/ui/input/InputView$Style;)V", "counterView", "Lru/ozon/fintech/ui/input/CounterView;", "getCounterView", "infoTextAreaIconView", "Lru/ozon/fintech/ui/input/TextAreaInfoActionIconView;", "Lkotlin/Function1;", "infoTextAreaIconClickListener", "Lkotlin/jvm/functions/Function1;", "getInfoTextAreaIconClickListener", "()Lkotlin/jvm/functions/Function1;", "setInfoTextAreaIconClickListener", "(Lkotlin/jvm/functions/Function1;)V", "counterInternal", "counter", "getCounter", "setCounter", "bottomBar", "getBottomBar", "setBottomBar", "rows", "getRows", "setRows", "isResize", "setResize", "hasInfoIcon", "getHasInfoIcon", "setHasInfoIcon", "disabledTextAreaClearButton", "getDisabledTextAreaClearButton", "setDisabledTextAreaClearButton", "LQ9/a;", "maskListener", "LQ9/a;", "anySymbolNotation", "LS9/c;", "getAnySymbolNotation", "()LS9/c;", "inputMask", "getInputMask", "setInputMask", "inputMode", "Lru/ozon/fintech/ui/input/InputView$InputMode;", "getInputMode", "()Lru/ozon/fintech/ui/input/InputView$InputMode;", "setInputMode", "Lru/ozon/fintech/ui/input/InfoAction;", "infoActionClickListener", "getInfoActionClickListener", "setInfoActionClickListener", "Lkotlin/Function0;", "firstIconClickListener", "Lkotlin/jvm/functions/Function0;", "getFirstIconClickListener", "()Lkotlin/jvm/functions/Function0;", "setFirstIconClickListener", "(Lkotlin/jvm/functions/Function0;)V", "secondIconClickListener", "getSecondIconClickListener", "setSecondIconClickListener", "LQ9/a$a;", "maskValueListener", "LQ9/a$a;", "getMaskValueListener", "()LQ9/a$a;", "setMaskValueListener", "(LQ9/a$a;)V", "Landroid/view/View$OnFocusChangeListener;", "focusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "defaultMargin", "marginTextToInfo", "marginBetweenIcons", "smallMargin", "verySmallMargin", "inputTextBottomBarMargin", "textAreaIconInfoEndMargin", "textAreaIconInfoTopMargin", "iconColorDefault", "successColor", "activeColor", "errorColor", "borderColor", "hintColor", "inputTextColor", "commonTextColor", "errorTextColor", "previousState", "Ly7/g;", "bgDrawable", "Ly7/g;", "Landroid/view/View;", "finInputBgView", "Landroid/view/View;", "maxInputLines", "getMaxInputLines", "setMaxInputLines", "inputViewInitialHeight", "inputTextView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "getInputTextView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "Lru/ozon/fintech/ui/input/InputInfoActionIconView;", "infoIconView", "Lru/ozon/fintech/ui/input/InputInfoActionIconView;", "firstIconToken", "getFirstIconToken", "setFirstIconToken", "secondIconToken", "getSecondIconToken", "setSecondIconToken", "firstIconView", "Landroidx/appcompat/widget/AppCompatImageView;", "getFirstIconView", "setFirstIconView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "secondIconView", "getSecondIconView", "setSecondIconView", "Landroid/widget/LinearLayout;", "firstSecondIconsContainer$delegate", "LSc/j;", "getFirstSecondIconsContainer", "()Landroid/widget/LinearLayout;", "firstSecondIconsContainer", "captionView", "Landroidx/appcompat/widget/AppCompatTextView;", "labelView", "getInputText", "setInputText", "inputText", "getInputTextLength", "inputTextLength", "getInputHasFocus", "inputHasFocus", "isCounterVisible", "getBottomBarInternal", "bottomBarInternal", "getTextToInfoPadding", "textToInfoPadding", "", "getCommonTextAlpha", "()F", "commonTextAlpha", "getBorderWidth", "borderWidth", "getBorderStrokeColor", "borderStrokeColor", "Companion", "Size", "Theme", "Status", "State", "LabelPosition", "Style", "InputMode", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputView extends ConstraintLayout {
    private static final float ALPHA_DEFAULT = 0.6f;
    private static final float ALPHA_DISABLED = 0.4f;
    private static final float ALPHA_OPAQUE = 1.0f;
    private static final float BIASS_CENTER = 0.5f;
    private static final float BIASS_END = 1.0f;
    private static final float BIASS_START = 0.0f;
    private static final int BORDER_WIDTH_ACTIVE = 2;
    private static final int BORDER_WIDTH_DEFAULT = 1;
    private static final int BORDER_WIDTH_TRANSPARENT_THEME = 0;
    private static final int CAPTION_MAX_LINES = 1;
    private static final int CORNER_SIZE = 12;
    private static final int COUNTER_MAX_DEFAULT = Integer.MAX_VALUE;
    private static final int MARGIN_BETWEEN_ICONS = 8;
    private static final int MARGIN_BOTTOM_BAR = 40;
    private static final int MARGIN_DEFAULT = 16;
    private static final int MARGIN_END_INFO_ICON = 20;
    private static final int MARGIN_SMALL = 8;
    private static final int MARGIN_TEXT_TO_INFO = 40;
    private static final int MARGIN_TOP_INFO_ICON = 12;
    private static final int MARGIN_VERY_SMALL = 4;
    private static final int MAX_HEIGHT = 56;
    private static final int MAX_LINES = 1;
    private static final int SIZE_500_HEIGHT = 44;
    private static final int SIZE_600_HEIGHT = 56;

    @NotNull
    private static final String TAG = "InputView";
    private final int activeColor;
    private boolean allowInputClearWhenInactive;

    @NotNull
    private final S9.c anySymbolNotation;

    @NotNull
    private final C10856g bgDrawable;
    private final int borderColor;
    private boolean bottomBar;
    private String caption;
    private Integer captionColor;
    private int captionMaxLines;
    private AppCompatTextView captionView;
    private final int commonTextColor;
    private Integer counter;
    private int counterInternal;
    private CounterView counterView;
    private final int defaultMargin;
    private boolean disabledTextAreaClearButton;
    private final int errorColor;
    private final int errorTextColor;

    @NotNull
    private final View finInputBgView;

    @NotNull
    private Function0<Unit> firstIconClickListener;
    private Integer firstIconToken;
    private AppCompatImageView firstIconView;

    /* renamed from: firstSecondIconsContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstSecondIconsContainer;

    @NotNull
    private final View.OnFocusChangeListener focusChangeListener;
    private boolean hasInfoIcon;
    private final int hintColor;
    private final int iconColorDefault;

    @NotNull
    private Function1<? super InfoAction, Unit> infoActionClickListener;

    @NotNull
    private final InputInfoActionIconView infoIconView;
    private Function1<? super TextAreaAction, Unit> infoTextAreaIconClickListener;
    private TextAreaInfoActionIconView infoTextAreaIconView;
    private String inputMask;

    @NotNull
    private InputMode inputMode;
    private final int inputTextBottomBarMargin;
    private final int inputTextColor;

    @NotNull
    private final OzonTextInput inputTextView;
    private int inputViewInitialHeight;
    private boolean isResize;
    private String label;

    @NotNull
    private LabelPosition labelPosition;
    private AppCompatTextView labelView;
    private final int marginBetweenIcons;
    private final int marginTextToInfo;
    private Q9.a maskListener;
    private a.InterfaceC0452a maskValueListener;
    private int maxInputLines;
    private int maxLength;
    private String placeHolder;

    @NotNull
    private State previousState;
    private int rows;

    @NotNull
    private Function0<Unit> secondIconClickListener;
    private Integer secondIconToken;
    private AppCompatImageView secondIconView;

    @NotNull
    private Size size;
    private final int smallMargin;

    @NotNull
    private State state;

    @NotNull
    private Status status;

    @NotNull
    private Style style;
    private final int successColor;
    private final int textAreaIconInfoEndMargin;
    private final int textAreaIconInfoTopMargin;

    @NotNull
    private Theme theme;
    private final int verySmallMargin;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$InputMode;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "TEL", "URL", "EMAIL", "NUMERIC", "DECIMAL", "SEARCH", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputMode {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ InputMode[] $VALUES;
        public static final InputMode TEXT = new InputMode("TEXT", 0);
        public static final InputMode TEL = new InputMode("TEL", 1);
        public static final InputMode URL = new InputMode("URL", 2);
        public static final InputMode EMAIL = new InputMode("EMAIL", 3);
        public static final InputMode NUMERIC = new InputMode("NUMERIC", 4);
        public static final InputMode DECIMAL = new InputMode("DECIMAL", 5);
        public static final InputMode SEARCH = new InputMode("SEARCH", 6);

        private static final /* synthetic */ InputMode[] $values() {
            return new InputMode[]{TEXT, TEL, URL, EMAIL, NUMERIC, DECIMAL, SEARCH};
        }

        static {
            InputMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private InputMode(String str, int i11) {
        }

        @NotNull
        public static Xc.a<InputMode> getEntries() {
            return $ENTRIES;
        }

        public static InputMode valueOf(String str) {
            return (InputMode) Enum.valueOf(InputMode.class, str);
        }

        public static InputMode[] values() {
            return (InputMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$LabelPosition;", "", "<init>", "(Ljava/lang/String;I)V", "INSIDE", "OUTSIDE", "BEFORE", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LabelPosition {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ LabelPosition[] $VALUES;
        public static final LabelPosition INSIDE = new LabelPosition("INSIDE", 0);
        public static final LabelPosition OUTSIDE = new LabelPosition("OUTSIDE", 1);
        public static final LabelPosition BEFORE = new LabelPosition("BEFORE", 2);

        private static final /* synthetic */ LabelPosition[] $values() {
            return new LabelPosition[]{INSIDE, OUTSIDE, BEFORE};
        }

        static {
            LabelPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private LabelPosition(String str, int i11) {
        }

        @NotNull
        public static Xc.a<LabelPosition> getEntries() {
            return $ENTRIES;
        }

        public static LabelPosition valueOf(String str) {
            return (LabelPosition) Enum.valueOf(LabelPosition.class, str);
        }

        public static LabelPosition[] values() {
            return (LabelPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_500 = new Size("SIZE_500", 0);
        public static final Size SIZE_600 = new Size("SIZE_600", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_500, SIZE_600};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Size(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ACTIVE", "DISABLED", "LOADING", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DEFAULT = new State("DEFAULT", 0);
        public static final State ACTIVE = new State("ACTIVE", 1);
        public static final State DISABLED = new State("DISABLED", 2);
        public static final State LOADING = new State("LOADING", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DEFAULT, ACTIVE, DISABLED, LOADING};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private State(String str, int i11) {
        }

        @NotNull
        public static Xc.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "READ_ONLY", "NEUTRAL", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status ERROR = new Status("ERROR", 1);
        public static final Status READ_ONLY = new Status("READ_ONLY", 2);
        public static final Status NEUTRAL = new Status("NEUTRAL", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, ERROR, READ_ONLY, NEUTRAL};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Status(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$Style;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "TEXTAREA", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style INPUT = new Style("INPUT", 0);
        public static final Style TEXTAREA = new Style("TEXTAREA", 1);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{INPUT, TEXTAREA};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Style(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/ui/input/InputView$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "TRANSPARENT", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;
        public static final Theme SOLID = new Theme("SOLID", 0);
        public static final Theme TRANSPARENT = new Theme("TRANSPARENT", 1);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{SOLID, TRANSPARENT};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private Theme(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Theme> getEntries() {
            return $ENTRIES;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[InputMode.values().length];
            try {
                iArr[InputMode.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputMode.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputMode.TEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputMode.URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputMode.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InputMode.NUMERIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InputMode.DECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Theme.values().length];
            try {
                iArr2[Theme.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Theme.TRANSPARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Status.values().length];
            try {
                iArr3[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Status.READ_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Status.NEUTRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[LabelPosition.values().length];
            try {
                iArr4[LabelPosition.INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[LabelPosition.OUTSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[LabelPosition.BEFORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Size.values().length];
            try {
                iArr5[Size.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[Size.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[State.values().length];
            try {
                iArr6[State.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[State.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[State.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$30(InputView inputView, View view, MotionEvent motionEvent) {
        Editable text;
        if (motionEvent.getAction() == 0 && !inputView.isClickOnIcons(motionEvent) && inputView.inputTextView.isEnabled()) {
            inputView.inputTextView.requestFocus();
            inputView.inputTextView.setCursorVisible(true);
            inputView.inputTextView.setLongClickable(true);
            OzonTextInput ozonTextInput = inputView.inputTextView;
            Intrinsics.checkNotNullParameter(ozonTextInput, "<this>");
            Object systemService = ozonTextInput.getContext().getSystemService("input_method");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(ozonTextInput, 1);
            if (inputView.inputTextView.length() > 0 && (text = inputView.inputTextView.getText()) != null) {
                inputView.inputTextView.setSelection(text.length());
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _set_maxLength_$lambda$0(InputView inputView, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        if (spanned.length() >= inputView.maxLength) {
            return "";
        }
        return null;
    }

    private final void changeState(State state) {
        InfoAction infoAction;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        L80.a.a(TAG, "changeState " + state);
        int i11 = WhenMappings.$EnumSwitchMapping$5[state.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                OzonTextInput ozonTextInput = this.inputTextView;
                enableInputText(ozonTextInput);
                ozonTextInput.setTextColor(this.inputTextColor);
                ozonTextInput.setFocusableInTouchMode(true);
                ozonTextInput.setAlpha(1.0f);
                ozonTextInput.setLongClickable(true);
                ozonTextInput.setCursorVisible(true);
                ozonTextInput.setTextIsSelectable(true);
                ozonTextInput.setVisibility(0);
                this.infoIconView.setAlpha(1.0f);
                TextAreaInfoActionIconView textAreaInfoActionIconView = this.infoTextAreaIconView;
                if (textAreaInfoActionIconView != null) {
                    textAreaInfoActionIconView.setAlpha(1.0f);
                }
                this.finInputBgView.setAlpha(1.0f);
                String inputText = getInputText();
                if (inputText != null && inputText.length() != 0) {
                    infoAction = InfoAction.CLEAR;
                }
            } else if (i11 == 3) {
                OzonTextInput ozonTextInput2 = this.inputTextView;
                ViewExtKt.disable(ozonTextInput2);
                ozonTextInput2.setTextColor(this.commonTextColor);
                ozonTextInput2.setLongClickable(false);
                ozonTextInput2.setCursorVisible(false);
                ozonTextInput2.setTextIsSelectable(false);
                ozonTextInput2.setAlpha(ALPHA_DISABLED);
                ozonTextInput2.setVisibility(0);
                this.infoIconView.setAlpha(ALPHA_DISABLED);
                TextAreaInfoActionIconView textAreaInfoActionIconView2 = this.infoTextAreaIconView;
                if (textAreaInfoActionIconView2 != null) {
                    textAreaInfoActionIconView2.setAlpha(ALPHA_DISABLED);
                }
                this.finInputBgView.setAlpha(ALPHA_DISABLED);
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                infoAction = InfoAction.LOADING;
                OzonTextInput ozonTextInput3 = this.inputTextView;
                ViewExtKt.disable(ozonTextInput3);
                ozonTextInput3.setFocusableInTouchMode(false);
                ozonTextInput3.clearFocus();
                ozonTextInput3.setLongClickable(false);
                ozonTextInput3.setCursorVisible(false);
                ozonTextInput3.setTextIsSelectable(false);
                ozonTextInput3.setTextColor(this.inputTextColor);
                ozonTextInput3.setVisibility(0);
                ozonTextInput3.setAlpha(1.0f);
                this.infoIconView.setAlpha(1.0f);
                this.infoIconView.setVisibility(0);
                TextAreaInfoActionIconView textAreaInfoActionIconView3 = this.infoTextAreaIconView;
                if (textAreaInfoActionIconView3 != null) {
                    textAreaInfoActionIconView3.setAlpha(1.0f);
                }
                this.finInputBgView.setAlpha(1.0f);
            }
            if (this.style == Style.INPUT && this.infoIconView.getVisibility() == 0 && infoAction != null) {
                this.infoIconView.changeState(infoAction);
            }
            appCompatTextView = this.labelView;
            if (appCompatTextView != null && appCompatTextView.getVisibility() == 0 && (appCompatTextView2 = this.labelView) != null) {
                appCompatTextView2.setAlpha(getCommonTextAlpha());
            }
            this.bgDrawable.I(getBorderWidth(), getBorderStrokeColor());
        }
        OzonTextInput ozonTextInput4 = this.inputTextView;
        enableInputText(ozonTextInput4);
        ozonTextInput4.setTextColor(this.inputTextColor);
        ozonTextInput4.setFocusableInTouchMode(true);
        ozonTextInput4.setAlpha(1.0f);
        ozonTextInput4.setLongClickable(true);
        ozonTextInput4.setCursorVisible(true);
        ozonTextInput4.setTextIsSelectable(true);
        ozonTextInput4.setVisibility(0);
        this.infoIconView.setAlpha(1.0f);
        TextAreaInfoActionIconView textAreaInfoActionIconView4 = this.infoTextAreaIconView;
        if (textAreaInfoActionIconView4 != null) {
            textAreaInfoActionIconView4.setAlpha(1.0f);
        }
        this.finInputBgView.setAlpha(1.0f);
        infoAction = null;
        if (this.style == Style.INPUT) {
            this.infoIconView.changeState(infoAction);
        }
        appCompatTextView = this.labelView;
        if (appCompatTextView != null) {
            appCompatTextView2.setAlpha(getCommonTextAlpha());
        }
        this.bgDrawable.I(getBorderWidth(), getBorderStrokeColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeStatus(Status status) {
        InfoAction infoAction;
        AppCompatTextView appCompatTextView;
        State state;
        String inputText;
        L80.a.a(TAG, "changeStatus " + status);
        Style style = this.style;
        Style style2 = Style.TEXTAREA;
        if (style == style2 && (inputText = getInputText()) != null && inputText.length() != 0) {
            Status status2 = Status.READ_ONLY;
        }
        Integer num = this.captionColor;
        int intValue = num != null ? num.intValue() : this.commonTextColor;
        int i11 = this.iconColorDefault;
        TextAreaAction textAreaAction = TextAreaAction.INFO;
        int i12 = WhenMappings.$EnumSwitchMapping$2[status.ordinal()];
        if (i12 == 1) {
            intValue = this.successColor;
            if (getInputText().length() > 0 && getInputHasFocus()) {
                infoAction = InfoAction.CLEAR;
            } else if (this.state == State.LOADING) {
                infoAction = InfoAction.LOADING;
            } else {
                i11 = this.successColor;
                infoAction = InfoAction.SUCCESS;
            }
        } else if (i12 == 2) {
            intValue = this.errorTextColor;
            String inputText2 = getInputText();
            if (inputText2 != null && inputText2.length() != 0 && getInputHasFocus() && ((state = this.state) == State.ACTIVE || state == State.DEFAULT)) {
                infoAction = InfoAction.CLEAR;
            } else if (this.state == State.LOADING) {
                infoAction = InfoAction.LOADING;
            } else {
                i11 = this.errorColor;
                infoAction = InfoAction.ERROR;
            }
        } else if (i12 == 3) {
            infoAction = this.state == State.LOADING ? InfoAction.LOADING : InfoAction.READ_ONLY;
            Editable text = this.inputTextView.getText();
            if (text != null && text.length() != 0) {
                textAreaAction = TextAreaAction.COPY;
            }
        } else {
            if (i12 != 4) {
                throw new o();
            }
            infoAction = (getInputText().length() <= 0 || !(this.inputTextView.hasFocus() || this.state == State.ACTIVE || this.allowInputClearWhenInactive)) ? this.state == State.LOADING ? InfoAction.LOADING : InfoAction.NONE : InfoAction.CLEAR;
        }
        if (status == Status.READ_ONLY) {
            OzonTextInput ozonTextInput = this.inputTextView;
            ozonTextInput.setFocusableInTouchMode(false);
            ozonTextInput.clearFocus();
            ozonTextInput.setTextColor(this.inputTextColor);
            ozonTextInput.setLongClickable(false);
            ozonTextInput.setCursorVisible(false);
            ozonTextInput.setAlpha(1.0f);
        } else {
            State state2 = this.state;
            if (state2 != State.DISABLED && state2 != State.LOADING) {
                OzonTextInput ozonTextInput2 = this.inputTextView;
                enableInputText(ozonTextInput2);
                ozonTextInput2.setTextColor(this.inputTextColor);
                ozonTextInput2.setFocusableInTouchMode(true);
                ozonTextInput2.setAlpha(1.0f);
                ozonTextInput2.setLongClickable(true);
                ozonTextInput2.setCursorVisible(true);
            }
        }
        InputInfoActionIconView inputInfoActionIconView = this.infoIconView;
        if (this.style == Style.INPUT) {
            inputInfoActionIconView.setVisibility(infoAction == InfoAction.NONE ? 8 : 0);
            changeStatus$updateInfoAction(inputInfoActionIconView, infoAction, i11);
        } else if (infoAction == InfoAction.CLEAR) {
            updateTextAreaInfoActionIconViewState(TextAreaAction.CLEAR);
            Status status3 = Status.ERROR;
            if (status == status3 || status == Status.SUCCESS) {
                Pair pair = status == status3 ? new Pair(InfoAction.ERROR, Integer.valueOf(this.errorColor)) : new Pair(InfoAction.SUCCESS, Integer.valueOf(this.successColor));
                changeStatus$updateInfoAction(this.infoIconView, (InfoAction) pair.a(), ((Number) pair.b()).intValue());
            }
        } else {
            inputInfoActionIconView.changeState(infoAction);
            this.infoIconView.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
            updateTextAreaInfoActionIconViewState(textAreaAction);
        }
        if (this.style == style2) {
            layoutInputState();
            updateTextAreaInfoActionIconViewLayoutParams();
            updateIconInfoLayoutParams();
        }
        AppCompatTextView appCompatTextView2 = this.captionView;
        if (appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0 && (appCompatTextView = this.captionView) != null) {
            appCompatTextView.setTextColor(intValue);
        }
        this.bgDrawable.I(getBorderWidth(), getBorderStrokeColor());
    }

    private static final void changeStatus$updateInfoAction(InputInfoActionIconView inputInfoActionIconView, InfoAction infoAction, int i11) {
        inputInfoActionIconView.changeState(infoAction);
        inputInfoActionIconView.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
    }

    private final void changeTheme(Theme th2) {
        this.bgDrawable.B(ColorStateList.valueOf(getColorByTheme()));
        this.bgDrawable.I(getBorderWidth(), getBorderStrokeColor());
    }

    private final AppCompatTextView createCaptionView() {
        int intValue;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R.id.finInputCaption);
        appCompatTextView.setMaxLines(this.captionMaxLines);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, UniTextStyles.BODY_300_X_SMALL.getResId());
        if (this.status == Status.ERROR) {
            intValue = this.errorTextColor;
        } else {
            Integer num = this.captionColor;
            intValue = num != null ? num.intValue() : this.commonTextColor;
        }
        appCompatTextView.setTextColor(intValue);
        this.captionView = appCompatTextView;
        addView(appCompatTextView, getCaptionLayoutParams());
        updateBackgroundLayoutParams();
        return appCompatTextView;
    }

    private final CounterView createCounterView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CounterView counterView = new CounterView(context, null, 0, 6, null);
        counterView.setVisibility(8);
        counterView.setTextColor(this.commonTextColor);
        counterView.setAlpha(0.6f);
        this.counterView = counterView;
        addView(getCounterView());
        return counterView;
    }

    private final AppCompatImageView createFirstIconView() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(R.id.finFirstIcon);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setOnClickListener(new HY.c(this, 8));
        this.firstIconView = appCompatImageView;
        if (getFirstSecondIconsContainer().getChildCount() != 0) {
            getFirstSecondIconsContainer().addView(this.firstIconView, 0);
            return appCompatImageView;
        }
        getFirstSecondIconsContainer().addView(this.firstIconView);
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createFirstIconView$lambda$32$lambda$31(InputView inputView, View view) {
        inputView.firstIconClickListener.invoke();
    }

    private final AppCompatImageView createSecondIconView() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(R.id.finSecondIcon);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setOnClickListener(new BQ.b(this, 8));
        this.secondIconView = appCompatImageView;
        getFirstSecondIconsContainer().addView(this.secondIconView);
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSecondIconView$lambda$34$lambda$33(InputView inputView, View view) {
        inputView.secondIconClickListener.invoke();
    }

    private final TextAreaInfoActionIconView createTextAreaInfoActionIconView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAreaInfoActionIconView textAreaInfoActionIconView = new TextAreaInfoActionIconView(context, null, 0, 6, null);
        textAreaInfoActionIconView.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
        this.infoTextAreaIconView = textAreaInfoActionIconView;
        textAreaInfoActionIconView.setOnClickListener(new Au.c(7, textAreaInfoActionIconView, this));
        addView(textAreaInfoActionIconView);
        return textAreaInfoActionIconView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTextAreaInfoActionIconView$lambda$11$lambda$10(TextAreaInfoActionIconView textAreaInfoActionIconView, InputView inputView, View view) {
        TextAreaAction action = textAreaInfoActionIconView.getAction();
        if (action == TextAreaAction.CLEAR) {
            inputView.setInputText("");
        }
        Function1<? super TextAreaAction, Unit> function1 = inputView.infoTextAreaIconClickListener;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    private final void enableInputText(OzonTextInput ozonTextInput) {
        ViewExtKt.enable(ozonTextInput);
        ozonTextInput.setLongClickable(true);
        ozonTextInput.setTextIsSelectable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout firstSecondIconsContainer_delegate$lambda$27(Context context, InputView inputView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.finIconsContainer);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        inputView.addView(linearLayout, new ConstraintLayout.b(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusChangeListener$lambda$15(InputView inputView, View view, boolean z11) {
        State state;
        String label;
        if (z11) {
            inputView.previousState = inputView.state;
            state = State.ACTIVE;
        } else {
            state = inputView.state;
            if (state != State.LOADING) {
                state = inputView.previousState;
            }
        }
        inputView.setState(state);
        AppCompatTextView appCompatTextView = inputView.labelView;
        if ((appCompatTextView != null && appCompatTextView.getVisibility() == 0) || ((label = inputView.getLabel()) != null && label.length() != 0 && inputView.size == Size.SIZE_500)) {
            inputView.updateInputTextViewLayoutParams();
            inputView.updateLabelLayoutParams();
            inputView.updatePlaceHolderAndLabelState();
        }
        Q9.a aVar = inputView.maskListener;
        if (aVar != null) {
            aVar.onFocusChange(view, z11);
        }
    }

    private final ConstraintLayout.b getBackgroundViewLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        updateBgMatchConstraintMinHeight(bVar);
        return bVar;
    }

    private final int getBorderStrokeColor() {
        int i11 = WhenMappings.$EnumSwitchMapping$2[this.status.ordinal()];
        return i11 != 1 ? i11 != 2 ? this.state == State.ACTIVE ? this.activeColor : this.borderColor : this.errorColor : this.successColor;
    }

    private final float getBorderWidth() {
        State state = this.state;
        State state2 = State.ACTIVE;
        return UiExtKt.toPxF(state == state2 ? 2 : (this.theme == Theme.TRANSPARENT && state != state2 && C7714v.b0(Status.NEUTRAL, Status.READ_ONLY).contains(this.status)) ? 0 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getBottomBarInternal() {
        if (this.style == Style.TEXTAREA) {
            return this.status != Status.NEUTRAL || this.bottomBar;
        }
        return false;
    }

    private final ConstraintLayout.b getCaptionLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = R.id.finInputBgView;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.setMargins(this.defaultMargin, 0, 0, 0);
        return bVar;
    }

    private final int getColorByTheme() {
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.theme.ordinal()];
        if (i11 == 1) {
            return androidx.core.content.a.getColor(getContext(), R.color.transparent);
        }
        if (i11 == 2) {
            return androidx.core.content.a.getColor(getContext(), R.color.oz_semantic_ctrl_neutral_pale);
        }
        throw new o();
    }

    private final float getCommonTextAlpha() {
        if (this.state == State.DISABLED) {
            return ALPHA_DISABLED;
        }
        return 0.6f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CounterView getCounterView() {
        CounterView counterView = this.counterView;
        if (counterView == null) {
            counterView = createCounterView();
        }
        Editable text = this.inputTextView.getText();
        counterView.setCurrentCount(text != null ? Integer.valueOf(text.length()) : null);
        counterView.setMaxCount(this.counterInternal);
        return counterView;
    }

    private final LinearLayout getFirstSecondIconsContainer() {
        return (LinearLayout) this.firstSecondIconsContainer.getValue();
    }

    private final int getLabelTextColorByPosition(LabelPosition position) {
        int i11 = WhenMappings.$EnumSwitchMapping$3[position.ordinal()];
        if (i11 == 1) {
            return androidx.core.content.a.getColor(getContext(), UniColors.TEXT_TERTIARY.getResId());
        }
        if (i11 != 2 && i11 != 3) {
            throw new o();
        }
        return androidx.core.content.a.getColor(getContext(), UniColors.TEXT_SECONDARY.getResId());
    }

    private final int getTextToInfoPadding() {
        return UiExtKt.toPx(55);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit infoActionClickListener$lambda$12(InfoAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void infoIconView$lambda$22$lambda$21(InputInfoActionIconView inputInfoActionIconView, InputView inputView, View view) {
        InfoAction action = inputInfoActionIconView.getAction();
        if (action == InfoAction.CLEAR) {
            inputView.setInputText("");
        }
        inputView.infoActionClickListener.invoke(action);
    }

    private final boolean isClickOnIcons(MotionEvent event) {
        int i11;
        int i12;
        int[] iArr = new int[2];
        this.infoIconView.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        TextAreaInfoActionIconView textAreaInfoActionIconView = this.infoTextAreaIconView;
        if (textAreaInfoActionIconView != null) {
            textAreaInfoActionIconView.getLocationOnScreen(iArr2);
        }
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        if (this.infoIconView.getVisibility() != 0 || rawX < (i11 = iArr[0]) || rawX > this.infoIconView.getWidth() + i11 || rawY < (i12 = iArr[1]) || rawY > this.infoIconView.getHeight() + i12) {
            if (textAreaInfoActionIconView != null && textAreaInfoActionIconView.getVisibility() == 0 && getX() >= iArr2[0]) {
                if (getX() <= textAreaInfoActionIconView.getWidth() + iArr2[0] && getY() >= iArr2[1]) {
                    if (getY() <= textAreaInfoActionIconView.getHeight() + iArr2[1]) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCounterVisible() {
        return this.style == Style.TEXTAREA && getBottomBarInternal() && this.counterInternal != Integer.MAX_VALUE;
    }

    private final boolean isMaskAcceptable(String mask, S9.c notation) {
        try {
            R9.c cVar = new R9.c(C7714v.a0(notation));
            if (mask == null) {
                mask = "";
            }
            cVar.a(mask);
            return true;
        } catch (c.a unused) {
            return false;
        }
    }

    private final void layoutInputState() {
        State state;
        State state2;
        L80.a.a(TAG, "layoutInputState");
        String inputText = getInputText();
        int i11 = 0;
        boolean z11 = (inputText == null || inputText.length() == 0 || ((state2 = this.state) != State.ACTIVE && state2 != State.DEFAULT)) ? false : true;
        String inputText2 = getInputText();
        boolean z12 = (z11 || (inputText2 != null && inputText2.length() != 0 && (((state = this.state) == State.ACTIVE || state == State.DEFAULT) && this.status == Status.SUCCESS))) ? false : true;
        CounterView counterView = getCounterView();
        if (counterView != null) {
            counterView.setVisibility(isCounterVisible() ? 0 : 8);
        }
        InputInfoActionIconView inputInfoActionIconView = this.infoIconView;
        Style style = this.style;
        if ((style != Style.INPUT || this.state == State.DISABLED || z12) && (style != Style.TEXTAREA || this.status == Status.NEUTRAL)) {
            i11 = 8;
        }
        inputInfoActionIconView.setVisibility(i11);
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
            updateLabelLayoutParams();
            updateBackgroundLayoutParams();
        }
        if (this.infoIconView.getVisibility() == 0) {
            int i12 = WhenMappings.$EnumSwitchMapping$2[this.status.ordinal()];
            if (i12 == 1) {
                this.infoIconView.changeState(InfoAction.SUCCESS);
                updateIconInfoLayoutParams();
            } else if (i12 == 3) {
                this.infoIconView.changeState(InfoAction.READ_ONLY);
                updateIconInfoLayoutParams();
            }
        }
        Style style2 = this.style;
        Style style3 = Style.TEXTAREA;
        if (style2 == style3 && getBottomBarInternal()) {
            updateCounterLayoutParams();
        }
        if (this.style == style3) {
            updateTextAreaInfoActionIconViewLayoutParams();
        }
        updateInputTextViewLayoutParams();
    }

    private final void reSetOnFocusChangeListener(OzonTextInput ozonTextInput) {
        ozonTextInput.setOnFocusChangeListener(this.focusChangeListener);
    }

    private final void updateBackgroundLayoutParams() {
        View view = this.finInputBgView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        L80.a.a(TAG, "updateBackgroundLayoutParams");
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
            if (WhenMappings.$EnumSwitchMapping$3[this.labelPosition.ordinal()] == 2) {
                bVar.f41638j = R.id.finInputLabel;
                bVar.f41636i = -1;
                bVar.f41642l = -1;
            } else {
                bVar.f41638j = -1;
                bVar.f41636i = 0;
            }
        }
        AppCompatTextView appCompatTextView2 = this.captionView;
        if (appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0) {
            bVar.f41640k = R.id.finInputCaption;
            bVar.f41642l = -1;
        }
        view.setLayoutParams(bVar);
    }

    private final void updateBgMatchConstraintMinHeight(ConstraintLayout.b bVar) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$4[this.size.ordinal()];
        if (i12 == 1) {
            i11 = 44;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = 56;
        }
        bVar.f41608O = UiExtKt.toPx(i11);
    }

    private final Unit updateCounterLayoutParams() {
        CounterView counterView = getCounterView();
        if (counterView == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = counterView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        L80.a.a(TAG, "updateCounterLayoutParams");
        bVar.f41638j = R.id.finInputEditText;
        bVar.f41642l = R.id.finInputBgView;
        bVar.f41656t = -1;
        if (this.infoIconView.getVisibility() == 0) {
            bVar.f41657u = R.id.finInputInfoIcon;
            bVar.setMarginEnd(this.smallMargin);
        } else {
            bVar.f41657u = R.id.finTextAreaInfoIcon;
            bVar.setMarginEnd(this.smallMargin);
        }
        int i11 = this.smallMargin;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        bVar.f41598E = 1.0f;
        counterView.setLayoutParams(bVar);
        return Unit.f71690a;
    }

    private final void updateFirstAndSecondIconsLayoutParams() {
        L80.a.a(TAG, "updateFirstAndSecondIconsLayoutParams");
        getFirstSecondIconsContainer().setVisibility((this.firstIconToken != null || this.secondIconToken != null) && this.state != State.LOADING ? 0 : 8);
        LinearLayout firstSecondIconsContainer = getFirstSecondIconsContainer();
        ViewGroup.LayoutParams layoutParams = firstSecondIconsContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41658v = R.id.finInputBgView;
        bVar.f41636i = R.id.finInputBgView;
        bVar.f41642l = R.id.finInputBgView;
        bVar.f41656t = -1;
        bVar.setMargins(0, 0, this.defaultMargin, 0);
        firstSecondIconsContainer.setLayoutParams(bVar);
        AppCompatImageView appCompatImageView = this.firstIconView;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(this.firstIconToken != null ? 0 : 8);
        }
        AppCompatImageView appCompatImageView2 = this.secondIconView;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(this.secondIconToken != null ? 0 : 8);
        }
        int px = UiExtKt.toPx((this.firstIconToken == null || this.secondIconToken == null) ? 0 : 10);
        AppCompatImageView appCompatImageView3 = this.firstIconView;
        if (appCompatImageView3 != null) {
            ViewGroup.LayoutParams layoutParams2 = appCompatImageView3.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(0, 0, px, 0);
            layoutParams3.gravity = 16;
            appCompatImageView3.setLayoutParams(layoutParams3);
        }
        AppCompatImageView appCompatImageView4 = this.secondIconView;
        if (appCompatImageView4 != null) {
            ViewGroup.LayoutParams layoutParams4 = appCompatImageView4.getLayoutParams();
            Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
            layoutParams5.gravity = 16;
            appCompatImageView4.setLayoutParams(layoutParams5);
        }
        updateIconInfoLayoutParams();
    }

    private final void updateIconInfoLayoutParams() {
        int i11;
        InputInfoActionIconView inputInfoActionIconView = this.infoIconView;
        ViewGroup.LayoutParams layoutParams = inputInfoActionIconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        L80.a.a(TAG, "updateIconInfoLayoutParams");
        int i12 = this.defaultMargin;
        Style style = this.style;
        if (style == Style.INPUT) {
            if (this.firstIconToken == null && this.secondIconToken == null) {
                bVar.f41658v = R.id.finInputBgView;
                i11 = i12;
            } else {
                bVar.f41658v = -1;
                bVar.f41657u = R.id.finIconsContainer;
                i11 = this.marginBetweenIcons;
            }
            bVar.f41636i = R.id.finInputBgView;
            bVar.f41642l = R.id.finInputBgView;
            bVar.f41656t = -1;
            bVar.f41655s = -1;
            bVar.f41595B = i12;
            i12 = i11;
        } else if (style == Style.TEXTAREA && getBottomBarInternal() && this.status != Status.NEUTRAL) {
            bVar.f41638j = R.id.finInputEditText;
            bVar.f41642l = R.id.finInputBgView;
            bVar.f41636i = -1;
            TextAreaInfoActionIconView textAreaInfoActionIconView = this.infoTextAreaIconView;
            if (textAreaInfoActionIconView == null || textAreaInfoActionIconView.getVisibility() != 0) {
                bVar.f41658v = R.id.finInputBgView;
                bVar.f41657u = -1;
            } else {
                bVar.f41657u = R.id.finTextAreaInfoIcon;
                bVar.f41658v = -1;
                i12 = this.smallMargin;
            }
            bVar.f41655s = -1;
        }
        bVar.setMargins(0, 0, i12, 0);
        inputInfoActionIconView.setLayoutParams(bVar);
    }

    private final void updateInputTextViewInputMode(InputMode value) {
        int i11;
        OzonTextInput ozonTextInput = this.inputTextView;
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
            case 2:
                if (this.style != Style.TEXTAREA) {
                    i11 = 1;
                    break;
                } else {
                    i11 = 131073;
                    break;
                }
            case 3:
                i11 = 3;
                break;
            case 4:
                i11 = 17;
                break;
            case 5:
                i11 = 33;
                break;
            case 6:
                i11 = 2;
                break;
            case 7:
                i11 = 8194;
                break;
            default:
                throw new o();
        }
        ozonTextInput.setInputType(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInputTextViewLayoutParams() {
        int i11;
        int i12;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Pair pair;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        OzonTextInput ozonTextInput = this.inputTextView;
        ViewGroup.LayoutParams layoutParams = ozonTextInput.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        L80.a.a(TAG, "updateInputTextViewLayoutParams");
        int i13 = this.defaultMargin;
        Style style = this.style;
        Style style2 = Style.INPUT;
        if (style == style2 && this.infoIconView.getVisibility() == 0) {
            i11 = this.smallMargin;
            i12 = R.id.finInputInfoIcon;
        } else if (this.style == style2 && (((appCompatImageView = this.firstIconView) != null && appCompatImageView.getVisibility() == 0) || ((appCompatImageView2 = this.secondIconView) != null && appCompatImageView2.getVisibility() == 0))) {
            i11 = this.smallMargin;
            i12 = R.id.finIconsContainer;
        } else if (this.style != Style.TEXTAREA || getBottomBarInternal()) {
            bVar.f41658v = R.id.finInputBgView;
            i11 = i13;
            i12 = -1;
        } else {
            i11 = this.smallMargin;
            i12 = R.id.finTextAreaInfoIcon;
        }
        bVar.f41657u = i12;
        if (this.labelPosition == LabelPosition.BEFORE) {
            bVar.f41655s = R.id.finInputLabel;
            bVar.f41656t = -1;
            i13 = this.verySmallMargin;
            bVar.f41594A = this.defaultMargin;
        } else {
            bVar.f41656t = R.id.finInputBgView;
        }
        bVar.f41640k = -1;
        bVar.f41642l = R.id.finInputBgView;
        AppCompatTextView appCompatTextView7 = this.labelView;
        boolean z11 = appCompatTextView7 != null && appCompatTextView7.getVisibility() == 0 && (getInputTextLength() != 0 || getInputHasFocus()) && this.labelPosition == LabelPosition.INSIDE && this.size == Size.SIZE_600;
        if (z11) {
            bVar.f41638j = R.id.finInputLabel;
            bVar.f41636i = -1;
            bVar.f41604K = 2;
            bVar.f41599F = 0.0f;
        } else {
            bVar.f41636i = R.id.finInputBgView;
            bVar.f41638j = -1;
            bVar.f41599F = this.style == style2 ? BIASS_CENTER : 0.0f;
        }
        Style style3 = this.style;
        Style style4 = Style.TEXTAREA;
        if (style3 == style4) {
            pair = (getBottomBarInternal() && (appCompatTextView6 = this.labelView) != null && appCompatTextView6.getVisibility() == 0 && z11) ? new Pair(Integer.valueOf(this.verySmallMargin), Integer.valueOf(this.inputTextBottomBarMargin)) : (!getBottomBarInternal() || (appCompatTextView5 = this.labelView) == null || appCompatTextView5.getVisibility() != 0 || z11) ? (!getBottomBarInternal() || (appCompatTextView4 = this.labelView) == null || appCompatTextView4.getVisibility() == 0) ? (getBottomBarInternal() || (appCompatTextView3 = this.labelView) == null || appCompatTextView3.getVisibility() != 0 || z11) ? (getBottomBarInternal() || (appCompatTextView2 = this.labelView) == null || appCompatTextView2.getVisibility() != 0 || !z11) ? (getBottomBarInternal() || (appCompatTextView = this.labelView) == null || appCompatTextView.getVisibility() == 0) ? new Pair(0, 0) : new Pair(Integer.valueOf(this.defaultMargin), 0) : new Pair(Integer.valueOf(this.verySmallMargin), 0) : new Pair(Integer.valueOf(this.defaultMargin), 0) : new Pair(Integer.valueOf(this.defaultMargin), Integer.valueOf(this.inputTextBottomBarMargin)) : new Pair(Integer.valueOf(this.defaultMargin), Integer.valueOf(this.inputTextBottomBarMargin));
        } else {
            AppCompatTextView appCompatTextView8 = this.labelView;
            pair = (appCompatTextView8 != null && appCompatTextView8.getVisibility() == 0 && z11) ? new Pair(Integer.valueOf(this.verySmallMargin), 0) : new Pair(0, 0);
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        this.inputTextView.setPadding(0, 0, 0, (this.style != style4 || getBottomBarInternal()) ? 0 : this.smallMargin);
        bVar.setMargins(i13, intValue, i11, intValue2);
        ozonTextInput.setLayoutParams(bVar);
    }

    private final AppCompatTextView updateLabelLayoutParams() {
        String label;
        int i11;
        int i12;
        int resId;
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView == null) {
            return null;
        }
        L80.a.a(TAG, "updateLabelLayoutParams " + this.labelPosition);
        int i13 = 0;
        boolean z11 = getInputTextLength() == 0 && !getInputHasFocus();
        boolean z12 = getInputTextLength() == 0 && !getInputHasFocus() && this.rows > 1;
        appCompatTextView.setVisibility(((this.size == Size.SIZE_500 && this.labelPosition == LabelPosition.INSIDE && !z11) || (label = getLabel()) == null || label.length() == 0) ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        boolean z13 = this.status == Status.READ_ONLY && z11;
        UiExtKt.toPx(55);
        LabelPosition labelPosition = this.labelPosition;
        int[] iArr = WhenMappings.$EnumSwitchMapping$3;
        int i14 = iArr[labelPosition.ordinal()];
        if (i14 == 1) {
            bVar.f41656t = z13 ? R.id.finInputEditText : R.id.finInputBgView;
            bVar.f41658v = R.id.finInputBgView;
            if (z12) {
                bVar.f41636i = R.id.finInputBgView;
                bVar.f41599F = 0.0f;
            } else if (z11) {
                bVar.f41636i = R.id.finInputEditText;
                bVar.f41640k = -1;
                bVar.f41599F = BIASS_CENTER;
                bVar.f41642l = R.id.finInputEditText;
            } else {
                bVar.f41636i = R.id.finInputBgView;
                bVar.f41599F = 0.0f;
                if (this.style == Style.INPUT) {
                    bVar.f41640k = R.id.finInputEditText;
                    bVar.f41604K = 2;
                }
            }
            bVar.f41598E = 0.0f;
            int i15 = z13 ? 0 : this.defaultMargin;
            Style style = this.style;
            Style style2 = Style.TEXTAREA;
            if (style == style2 && z11 && getBottomBarInternal()) {
                i11 = this.smallMargin;
            } else {
                Style style3 = this.style;
                i11 = (style3 == style2 && z12) ? this.smallMargin : ((style3 == style2 && z11) || z11) ? 0 : this.verySmallMargin;
            }
            int i16 = i11;
            i12 = i15;
            i13 = i16;
        } else if (i14 == 2) {
            bVar.f41636i = 0;
            bVar.f41656t = 0;
            bVar.f41642l = -1;
            bVar.f41640k = R.id.finInputBgView;
            bVar.f41658v = R.id.finInputBgView;
            i12 = this.defaultMargin;
            bVar.f41598E = 0.0f;
        } else {
            if (i14 != 3) {
                throw new o();
            }
            bVar.f41656t = R.id.finInputBgView;
            bVar.f41636i = R.id.finInputBgView;
            bVar.f41642l = R.id.finInputBgView;
            bVar.f41640k = -1;
            i12 = this.defaultMargin;
            bVar.f41604K = 0;
            bVar.f41598E = 0.0f;
            bVar.f41599F = BIASS_CENTER;
        }
        appCompatTextView.setTextColor(getLabelTextColorByPosition(this.labelPosition));
        bVar.setMargins(i12, i13, getTextToInfoPadding(), ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        appCompatTextView.setLayoutParams(bVar);
        int i17 = iArr[this.labelPosition.ordinal()];
        if (i17 == 1) {
            resId = z11 ? UniTextStyles.BODY_500_MEDIUM.getResId() : UniTextStyles.BODY_300_X_SMALL.getResId();
        } else if (i17 == 2) {
            resId = UniTextStyles.BODY_400_SMALL.getResId();
        } else {
            if (i17 != 3) {
                throw new o();
            }
            resId = UniTextStyles.BODY_500_MEDIUM.getResId();
        }
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, resId);
        return appCompatTextView;
    }

    private final void updatePlaceHolderAndLabelState() {
        L80.a.a(TAG, "updatePlaceHolderAndLabelState");
        if (this.placeHolder != null) {
            String label = getLabel();
            if (label == null || label.length() == 0 || this.labelPosition != LabelPosition.INSIDE || getInputTextLength() != 0 || getInputHasFocus()) {
                this.inputTextView.setHint(this.placeHolder);
            } else {
                this.inputTextView.setHint("");
            }
        }
    }

    private final void updateState(State newValue) {
        L80.a.a(TAG, "updateState");
        changeState(newValue);
        changeStatus(this.status);
        updateFirstAndSecondIconsLayoutParams();
    }

    private final Unit updateTextAreaInfoActionIconViewLayoutParams() {
        TextAreaInfoActionIconView textAreaInfoActionIconView = this.infoTextAreaIconView;
        if (textAreaInfoActionIconView == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = textAreaInfoActionIconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        L80.a.a(TAG, "updateTextAreaInfoActionIconViewLayoutParams");
        v vVar = ((getBottomBarInternal() || !this.isResize) && this.rows <= 1) ? (getBottomBarInternal() || this.isResize) ? new v(Integer.valueOf(this.defaultMargin), 8, 8) : new v(Integer.valueOf(this.defaultMargin), 0, 0) : new v(Integer.valueOf(this.defaultMargin), Integer.valueOf(this.defaultMargin), Integer.valueOf(this.defaultMargin));
        int intValue = ((Number) vVar.a()).intValue();
        int intValue2 = ((Number) vVar.b()).intValue();
        int intValue3 = ((Number) vVar.d()).intValue();
        bVar.f41658v = R.id.finInputBgView;
        bVar.f41656t = -1;
        bVar.f41636i = -1;
        bVar.f41655s = -1;
        bVar.f41638j = -1;
        bVar.f41642l = -1;
        if (getBottomBarInternal()) {
            bVar.f41638j = R.id.finInputEditText;
            bVar.f41642l = R.id.finInputBgView;
        } else if ((getBottomBarInternal() || !this.isResize) && this.rows <= 1) {
            bVar.f41636i = R.id.finInputBgView;
            bVar.f41642l = R.id.finInputBgView;
        } else {
            bVar.f41636i = R.id.finInputBgView;
        }
        bVar.f41595B = this.defaultMargin;
        bVar.setMargins(0, intValue2, intValue, intValue3);
        textAreaInfoActionIconView.setLayoutParams(bVar);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTextAreaInfoActionIconViewState(TextAreaAction action) {
        Boolean bool;
        TextAreaAction textAreaAction = TextAreaAction.CLEAR;
        if (action == textAreaAction && this.disabledTextAreaClearButton && this.hasInfoIcon) {
            action = TextAreaAction.INFO;
        } else if (action == textAreaAction && this.disabledTextAreaClearButton && !this.hasInfoIcon) {
            action = TextAreaAction.NONE;
        } else if (action == TextAreaAction.INFO && !this.hasInfoIcon) {
            action = TextAreaAction.NONE;
        }
        TextAreaInfoActionIconView textAreaInfoActionIconView = this.infoTextAreaIconView;
        if (textAreaInfoActionIconView != null) {
            textAreaInfoActionIconView.changeState(action);
        }
        TextAreaInfoActionIconView textAreaInfoActionIconView2 = this.infoTextAreaIconView;
        if (textAreaInfoActionIconView2 != null) {
            textAreaInfoActionIconView2.setVisibility((this.style != Style.TEXTAREA || action == TextAreaAction.NONE) ? 8 : 0);
        }
        TextAreaInfoActionIconView textAreaInfoActionIconView3 = this.infoTextAreaIconView;
        if (textAreaInfoActionIconView3 != null) {
            bool = Boolean.valueOf(textAreaInfoActionIconView3.getVisibility() == 0);
        } else {
            bool = null;
        }
        L80.a.a(TAG, "updateTextAreaInfoActionIconViewState " + bool + " " + action);
    }

    private final void updateTextPreserveCursorV2(OzonTextInput ozonTextInput, String str) {
        String str2;
        Editable text = ozonTextInput.getText();
        if (text == null || (str2 = text.toString()) == null) {
            str2 = "";
        }
        int selectionStart = ozonTextInput.getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        }
        int length = str2.length() - selectionStart;
        ozonTextInput.setText(str);
        ozonTextInput.setSelection(h.e(str.length() - length, 0, str.length()));
    }

    public final boolean getAllowInputClearWhenInactive() {
        return this.allowInputClearWhenInactive;
    }

    @NotNull
    public final S9.c getAnySymbolNotation() {
        return this.anySymbolNotation;
    }

    public final boolean getBottomBar() {
        return this.bottomBar;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final Integer getCaptionColor() {
        return this.captionColor;
    }

    public final int getCaptionMaxLines() {
        return this.captionMaxLines;
    }

    public final Integer getCounter() {
        return this.counter;
    }

    public final boolean getDisabledTextAreaClearButton() {
        return this.disabledTextAreaClearButton;
    }

    @NotNull
    public final Function0<Unit> getFirstIconClickListener() {
        return this.firstIconClickListener;
    }

    public final Integer getFirstIconToken() {
        return this.firstIconToken;
    }

    public final AppCompatImageView getFirstIconView() {
        return this.firstIconView;
    }

    public final boolean getHasInfoIcon() {
        return this.hasInfoIcon;
    }

    @NotNull
    public final Function1<InfoAction, Unit> getInfoActionClickListener() {
        return this.infoActionClickListener;
    }

    public final Function1<TextAreaAction, Unit> getInfoTextAreaIconClickListener() {
        return this.infoTextAreaIconClickListener;
    }

    public final boolean getInputHasFocus() {
        return this.inputTextView.hasFocus();
    }

    public final String getInputMask() {
        return this.inputMask;
    }

    @NotNull
    public final InputMode getInputMode() {
        return this.inputMode;
    }

    @NotNull
    public final String getInputText() {
        return String.valueOf(this.inputTextView.getText());
    }

    public final int getInputTextLength() {
        Editable text = this.inputTextView.getText();
        if (text != null) {
            return text.length();
        }
        return 0;
    }

    @NotNull
    public final OzonTextInput getInputTextView() {
        return this.inputTextView;
    }

    public final String getLabel() {
        CharSequence text;
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView == null || (text = appCompatTextView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @NotNull
    public final LabelPosition getLabelPosition() {
        return this.labelPosition;
    }

    public final a.InterfaceC0452a getMaskValueListener() {
        return this.maskValueListener;
    }

    public final int getMaxInputLines() {
        return this.maxInputLines;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final String getPlaceHolder() {
        return this.placeHolder;
    }

    public final int getRows() {
        return this.rows;
    }

    @NotNull
    public final Function0<Unit> getSecondIconClickListener() {
        return this.secondIconClickListener;
    }

    public final Integer getSecondIconToken() {
        return this.secondIconToken;
    }

    public final AppCompatImageView getSecondIconView() {
        return this.secondIconView;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: isResize, reason: from getter */
    public final boolean getIsResize() {
        return this.isResize;
    }

    public final void setAllowInputClearWhenInactive(boolean z11) {
        this.allowInputClearWhenInactive = z11;
    }

    public final void setBottomBar(boolean z11) {
        if (this.bottomBar == z11) {
            return;
        }
        this.bottomBar = z11;
        layoutInputState();
        updateTextAreaInfoActionIconViewLayoutParams();
        updateIconInfoLayoutParams();
    }

    public final void setCaption(String str) {
        if (Intrinsics.d(this.caption, str)) {
            return;
        }
        this.caption = str;
        if (str == null || str.length() == 0) {
            AppCompatTextView appCompatTextView = this.captionView;
            if (appCompatTextView != null) {
                ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(appCompatTextView);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = this.captionView;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = createCaptionView();
        }
        appCompatTextView2.setVisibility(0);
        appCompatTextView2.setText(this.caption);
    }

    public final void setCaptionColor(Integer num) {
        if (Intrinsics.d(this.captionColor, num)) {
            return;
        }
        this.captionColor = num;
        if (num != null) {
            int intValue = num.intValue();
            AppCompatTextView appCompatTextView = this.captionView;
            if (appCompatTextView != null) {
                appCompatTextView.setTextColor(intValue);
            }
        }
    }

    public final void setCaptionMaxLines(int i11) {
        if (this.captionMaxLines == i11) {
            return;
        }
        this.captionMaxLines = i11;
        AppCompatTextView appCompatTextView = this.captionView;
        if (appCompatTextView != null) {
            appCompatTextView.setMaxLines(i11);
        }
    }

    public final void setCounter(Integer num) {
        if (Intrinsics.d(this.counter, num)) {
            return;
        }
        this.counter = num;
        int intValue = (num == null || num.intValue() <= 0) ? Integer.MAX_VALUE : num.intValue();
        this.counterInternal = intValue;
        setMaxLength(intValue);
        CounterView counterView = getCounterView();
        if (counterView != null) {
            counterView.setMaxCount(intValue);
        }
        CounterView counterView2 = getCounterView();
        if (counterView2 != null) {
            Editable text = this.inputTextView.getText();
            counterView2.setCurrentCount(text != null ? Integer.valueOf(text.length()) : null);
        }
        layoutInputState();
    }

    public final void setDisabledTextAreaClearButton(boolean z11) {
        if (this.disabledTextAreaClearButton == z11) {
            return;
        }
        this.disabledTextAreaClearButton = z11;
        updateTextAreaInfoActionIconViewState(TextAreaAction.INFO);
    }

    public final void setFirstIconClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.firstIconClickListener = function0;
    }

    public final void setFirstIconToken(Integer num) {
        AppCompatImageView appCompatImageView;
        if (Intrinsics.d(this.firstIconToken, num)) {
            return;
        }
        this.firstIconToken = num;
        if (num != null && this.firstIconView == null) {
            createFirstIconView();
        }
        if (num != null && (appCompatImageView = this.firstIconView) != null) {
            appCompatImageView.setImageResource(num.intValue());
            appCompatImageView.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
        }
        updateFirstAndSecondIconsLayoutParams();
    }

    public final void setFirstIconView(AppCompatImageView appCompatImageView) {
        this.firstIconView = appCompatImageView;
    }

    public final void setHasInfoIcon(boolean z11) {
        this.hasInfoIcon = z11;
    }

    public final void setInfoActionClickListener(@NotNull Function1<? super InfoAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.infoActionClickListener = function1;
    }

    public final void setInfoTextAreaIconClickListener(Function1<? super TextAreaAction, Unit> function1) {
        this.infoTextAreaIconClickListener = function1;
    }

    public final void setInputMask(String primaryFormat) {
        if (Intrinsics.d(this.inputMask, primaryFormat)) {
            return;
        }
        if (!isMaskAcceptable(primaryFormat, this.anySymbolNotation)) {
            L80.a.a("OFFLINER", "InputMask is not acceptable");
            return;
        }
        this.inputMask = primaryFormat;
        if (primaryFormat == null) {
            Q9.a aVar = this.maskListener;
            if (aVar != null) {
                this.inputTextView.removeTextChangedListener(aVar);
            }
            this.maskListener = null;
            return;
        }
        Q9.a aVar2 = this.maskListener;
        if (aVar2 != null) {
            aVar2.d(primaryFormat);
            return;
        }
        OzonTextInput editText = this.inputTextView;
        a.InterfaceC0452a interfaceC0452a = this.maskValueListener;
        List customNotations = C7714v.a0(this.anySymbolNotation);
        K affineFormats = K.f71697a;
        R9.a affinityCalculationStrategy = R9.a.WHOLE_STRING;
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(primaryFormat, "primaryFormat");
        Intrinsics.checkNotNullParameter(affineFormats, "affineFormats");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        Intrinsics.checkNotNullParameter(affinityCalculationStrategy, "affinityCalculationStrategy");
        Q9.a aVar3 = new Q9.a(primaryFormat, affineFormats, customNotations, affinityCalculationStrategy, editText, interfaceC0452a);
        editText.addTextChangedListener(aVar3);
        editText.setOnFocusChangeListener(aVar3);
        this.maskListener = aVar3;
        reSetOnFocusChangeListener(this.inputTextView);
    }

    public final void setInputMode(@NotNull InputMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.inputMode == value) {
            return;
        }
        this.inputMode = value;
        updateInputTextViewInputMode(value);
    }

    public final void setInputText(@NotNull String value) {
        CounterView counterView;
        Intrinsics.checkNotNullParameter(value, "value");
        if (String.valueOf(this.inputTextView.getText()).equals(value)) {
            return;
        }
        boolean hasFocus = this.inputTextView.hasFocus();
        changeState(this.state);
        updateInputTextViewLayoutParams();
        updateLabelLayoutParams();
        if (hasFocus) {
            OzonTextInput ozonTextInput = this.inputTextView;
            ozonTextInput.requestFocus();
            updateTextPreserveCursorV2(ozonTextInput, value);
            ozonTextInput.setCursorVisible(true);
        } else {
            this.inputTextView.setText(value);
        }
        setLongClickable(true);
        if (this.style != Style.TEXTAREA || (counterView = getCounterView()) == null) {
            return;
        }
        Editable text = this.inputTextView.getText();
        counterView.setCurrentCount(text != null ? Integer.valueOf(text.length()) : null);
    }

    public final void setLabel(String str) {
        AppCompatTextView appCompatTextView;
        if (Intrinsics.d(this.label, str) || (appCompatTextView = this.labelView) == null) {
            return;
        }
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        layoutInputState();
        updatePlaceHolderAndLabelState();
    }

    public final void setLabelPosition(@NotNull LabelPosition value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.labelPosition == value) {
            return;
        }
        this.labelPosition = value;
        updateLabelLayoutParams();
        updateInputTextViewLayoutParams();
        updatePlaceHolderAndLabelState();
        updateBackgroundLayoutParams();
    }

    public final void setMaskValueListener(a.InterfaceC0452a interfaceC0452a) {
        this.maskValueListener = interfaceC0452a;
    }

    public final void setMaxInputLines(int i11) {
        this.maxInputLines = i11;
        this.inputTextView.setMaxLines(i11);
    }

    public final void setMaxLength(int i11) {
        if (this.maxLength == i11) {
            return;
        }
        this.maxLength = i11;
        if (this.style == Style.INPUT) {
            this.inputTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxLength)});
        } else {
            this.inputTextView.setFilters(new InputFilter[]{new InputFilter() { // from class: ru.ozon.fintech.ui.input.e
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i12, int i13, Spanned spanned, int i14, int i15) {
                    CharSequence _set_maxLength_$lambda$0;
                    _set_maxLength_$lambda$0 = InputView._set_maxLength_$lambda$0(InputView.this, charSequence, i12, i13, spanned, i14, i15);
                    return _set_maxLength_$lambda$0;
                }
            }});
        }
    }

    public final void setPlaceHolder(String str) {
        if (Intrinsics.d(this.placeHolder, str)) {
            return;
        }
        this.placeHolder = str;
        updatePlaceHolderAndLabelState();
    }

    public final void setResize(boolean z11) {
        this.isResize = z11;
        OzonTextInput ozonTextInput = this.inputTextView;
        if (!z11) {
            ozonTextInput.setMaxLines(this.rows);
        } else {
            ozonTextInput.setMaxLines(Integer.MAX_VALUE);
            ozonTextInput.setMinLines(this.rows);
        }
    }

    public final void setRows(int i11) {
        this.rows = i11 >= 1 ? i11 : 1;
        OzonTextInput ozonTextInput = this.inputTextView;
        ozonTextInput.setMinLines(i11);
        ozonTextInput.setMaxLines(i11);
        layoutInputState();
    }

    public final void setSecondIconClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.secondIconClickListener = function0;
    }

    public final void setSecondIconToken(Integer num) {
        AppCompatImageView appCompatImageView;
        if (Intrinsics.d(this.secondIconToken, num)) {
            return;
        }
        this.secondIconToken = num;
        if (num != null && this.secondIconView == null) {
            createSecondIconView();
        }
        if (num != null && (appCompatImageView = this.secondIconView) != null) {
            appCompatImageView.setImageResource(num.intValue());
            appCompatImageView.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
        }
        updateFirstAndSecondIconsLayoutParams();
    }

    public final void setSecondIconView(AppCompatImageView appCompatImageView) {
        this.secondIconView = appCompatImageView;
    }

    public final void setSize(@NotNull Size value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.size == value) {
            return;
        }
        this.size = value;
        View view = this.finInputBgView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        updateBgMatchConstraintMinHeight(bVar);
        view.setLayoutParams(bVar);
        updateLabelLayoutParams();
        updateInputTextViewLayoutParams();
    }

    public final void setState(@NotNull State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.state == value) {
            return;
        }
        this.state = value;
        updateState(value);
    }

    public final void setStatus(@NotNull Status value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.status == value) {
            return;
        }
        this.status = value;
        changeStatus(value);
    }

    public final void setStyle(@NotNull Style value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.style == value) {
            return;
        }
        this.style = value;
        setLabelPosition(LabelPosition.INSIDE);
        if (value == Style.TEXTAREA && this.infoTextAreaIconView == null) {
            createTextAreaInfoActionIconView();
        }
        layoutInputState();
    }

    public final void setTheme(@NotNull Theme value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.theme == value) {
            return;
        }
        this.theme = value;
        changeTheme(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputView(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = State.DEFAULT;
        this.status = Status.NEUTRAL;
        this.labelPosition = LabelPosition.OUTSIDE;
        this.theme = Theme.SOLID;
        this.maxLength = Integer.MAX_VALUE;
        this.size = Size.SIZE_600;
        this.captionMaxLines = 1;
        this.style = Style.INPUT;
        this.counterInternal = Integer.MAX_VALUE;
        this.rows = 1;
        this.anySymbolNotation = new S9.c();
        this.inputMode = InputMode.TEXT;
        this.infoActionClickListener = new a(0);
        this.firstIconClickListener = new b(0);
        this.secondIconClickListener = new c();
        this.focusChangeListener = new Dk0.a(this, 3);
        this.defaultMargin = UiExtKt.toPx(16);
        this.marginTextToInfo = UiExtKt.toPx(40);
        this.marginBetweenIcons = UiExtKt.toPx(8);
        this.smallMargin = UiExtKt.toPx(8);
        this.verySmallMargin = UiExtKt.toPx(4);
        this.inputTextBottomBarMargin = UiExtKt.toPx(40);
        this.textAreaIconInfoEndMargin = UiExtKt.toPx(20);
        this.textAreaIconInfoTopMargin = UiExtKt.toPx(12);
        this.iconColorDefault = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId());
        this.successColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId());
        this.activeColor = ThemeExtKt.themeColor(context, R.attr.graphicActionPrimary);
        this.errorColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEGATIVE_PRIMARY.getResId());
        int i12 = WhenMappings.$EnumSwitchMapping$1[this.theme.ordinal()];
        if (i12 == 1) {
            color = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId());
        } else if (i12 == 2) {
            color = androidx.core.content.a.getColor(context, R.color.transparent);
        } else {
            throw new o();
        }
        this.borderColor = color;
        int color2 = androidx.core.content.a.getColor(context, UniColors.TEXT_TERTIARY.getResId());
        this.hintColor = color2;
        int color3 = androidx.core.content.a.getColor(context, UniColors.TEXT_PRIMARY.getResId());
        this.inputTextColor = color3;
        this.commonTextColor = androidx.core.content.a.getColor(context, UniColors.TEXT_SECONDARY.getResId());
        this.errorTextColor = androidx.core.content.a.getColor(context, UniColors.TEXT_NEGATIVE.getResId());
        this.previousState = this.state;
        C10856g c10856g = new C10856g();
        c10856g.y(UiExtKt.toPxF(12));
        c10856g.I(getBorderWidth(), color);
        c10856g.B(ColorStateList.valueOf(getColorByTheme()));
        c10856g.E(Paint.Style.FILL_AND_STROKE);
        this.bgDrawable = c10856g;
        View view = new View(context);
        view.setId(R.id.finInputBgView);
        view.setBackground(c10856g);
        this.finInputBgView = view;
        this.maxInputLines = 1;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        int i14 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        final OzonTextInput ozonTextInput = new OzonTextInput(context, attributeSet2, i13, i14, defaultConstructorMarker);
        ozonTextInput.setId(R.id.finInputEditText);
        ozonTextInput.setBackground(null);
        ozonTextInput.setGravity(8388659);
        ozonTextInput.setMaxLines(this.maxInputLines);
        TextViewExtKt.applyStyle(ozonTextInput, context, UniTextStyles.BODY_500_MEDIUM.getResId());
        ozonTextInput.setTextColor(color3);
        ozonTextInput.setHintTextColor(color2);
        ozonTextInput.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.fintech.ui.input.InputView$inputTextView$lambda$20$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
            
                r2 = r0.this$0.getCounterView();
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                boolean bottomBarInternal;
                int i15;
                InputInfoActionIconView inputInfoActionIconView;
                boolean isCounterVisible;
                CounterView counterView;
                int i16;
                if (!InputView.this.getIsResize()) {
                    i16 = InputView.this.inputViewInitialHeight;
                    if (i16 == 0) {
                        InputView.this.inputViewInitialHeight = ozonTextInput.getHeight();
                    }
                }
                bottomBarInternal = InputView.this.getBottomBarInternal();
                if (bottomBarInternal) {
                    isCounterVisible = InputView.this.isCounterVisible();
                    if (isCounterVisible && counterView != null) {
                        counterView.setCurrentCount(text != null ? Integer.valueOf(text.length()) : null);
                    }
                }
                InfoAction infoAction = ((InputView.this.getState() != InputView.State.ACTIVE && !InputView.this.getAllowInputClearWhenInactive()) || text == null || text.length() == 0) ? InfoAction.NONE : InfoAction.CLEAR;
                if (InputView.this.getStyle() == InputView.Style.INPUT) {
                    inputInfoActionIconView = InputView.this.infoIconView;
                    inputInfoActionIconView.changeState(infoAction);
                }
                InputView.Style style = InputView.this.getStyle();
                InputView.Style style2 = InputView.Style.TEXTAREA;
                if (style == style2) {
                    if (infoAction == InfoAction.CLEAR) {
                        InputView.this.updateTextAreaInfoActionIconViewState(TextAreaAction.CLEAR);
                    } else {
                        InputView.this.updateTextAreaInfoActionIconViewState(TextAreaAction.INFO);
                    }
                }
                InputView inputView = InputView.this;
                inputView.changeStatus(inputView.getStatus());
                if (InputView.this.getStyle() == style2) {
                    i15 = InputView.this.inputViewInitialHeight;
                    int i17 = i15 != 0 ? InputView.this.inputViewInitialHeight : 0;
                    OzonTextInput ozonTextInput2 = ozonTextInput;
                    ConstraintLayout.b bVar = new ConstraintLayout.b(0, i17);
                    bVar.f41606M = 1;
                    bVar.f41616W = true;
                    ozonTextInput2.setLayoutParams(bVar);
                }
                InputView.this.updateInputTextViewLayoutParams();
            }
        });
        reSetOnFocusChangeListener(ozonTextInput);
        this.inputTextView = ozonTextInput;
        InputInfoActionIconView inputInfoActionIconView = new InputInfoActionIconView(context, attributeSet2, i13, i14, defaultConstructorMarker);
        inputInfoActionIconView.setVisibility(8);
        inputInfoActionIconView.setOnClickListener(new IK.a(5, inputInfoActionIconView, this));
        this.infoIconView = inputInfoActionIconView;
        this.firstSecondIconsContainer = k.a(n.PUBLICATION, new Function0() { // from class: ru.ozon.fintech.ui.input.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LinearLayout firstSecondIconsContainer_delegate$lambda$27;
                firstSecondIconsContainer_delegate$lambda$27 = InputView.firstSecondIconsContainer_delegate$lambda$27(context, this);
                return firstSecondIconsContainer_delegate$lambda$27;
            }
        });
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.finInputLabel);
        appCompatTextView.setVisibility(8);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(getLabelTextColorByPosition(this.labelPosition));
        appCompatTextView.setAlpha(getCommonTextAlpha());
        this.labelView = appCompatTextView;
        addView(appCompatTextView, new ConstraintLayout.b(-2, -2));
        this.labelView = appCompatTextView;
        addView(view, getBackgroundViewLayoutParams());
        addView(ozonTextInput, new ConstraintLayout.b(0, -2));
        addView(inputInfoActionIconView);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        updateInputTextViewLayoutParams();
        updateIconInfoLayoutParams();
        setOnTouchListener(new ViewOnTouchListenerC6882a(this, 1));
    }
}
