package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar;

import B0.A0;
import B0.C2454a;
import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.ranges.h;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0004\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\nµ\u0001¶\u0001·\u0001¸\u0001¹\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001c¢\u0006\u0004\b%\u0010\u001fJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\b'\u0010\u001fJ\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u001c¢\u0006\u0004\b,\u0010\u001fJ\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010*J\u0017\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b3\u00102J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u0010*J\u001b\u00109\u001a\u00020\u00002\f\u00108\u001a\b\u0012\u0004\u0012\u00020706¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0006¢\u0006\u0004\b<\u0010*J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\f¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\t¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001cH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u001cH\u0002¢\u0006\u0004\bP\u0010OJ\u000f\u0010Q\u001a\u00020\u001cH\u0002¢\u0006\u0004\bQ\u0010OJ\u000f\u0010R\u001a\u00020\u001cH\u0002¢\u0006\u0004\bR\u0010OJ\u0017\u0010S\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bS\u0010\u0017J\u0017\u0010T\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bT\u0010\u0017J\u0017\u0010U\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bU\u0010\u0017J\u0017\u0010V\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bV\u0010\u0017J\u0017\u0010W\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bW\u0010\u0017J\u0017\u0010X\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\\\u0010[J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010MJ\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010MJ\u0019\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010]\u001a\u00020\u001cH\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020\f2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020^2\u0006\u0010]\u001a\u00020\u001cH\u0002¢\u0006\u0004\be\u0010`J\u000f\u0010f\u001a\u00020\tH\u0002¢\u0006\u0004\bf\u0010MJ\u000f\u0010g\u001a\u00020\tH\u0002¢\u0006\u0004\bg\u0010MJ\u0017\u0010j\u001a\u00020\u001c2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020a2\u0006\u0010l\u001a\u00020\u001cH\u0002¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u00020a*\u00020h2\u0006\u0010;\u001a\u00020hH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\t2\u0006\u0010q\u001a\u00020\u0006H\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\t2\u0006\u0010q\u001a\u00020aH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\t2\u0006\u0010q\u001a\u00020aH\u0002¢\u0006\u0004\bv\u0010uJ\u0017\u0010x\u001a\u00020\t2\u0006\u0010w\u001a\u00020\fH\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\tH\u0002¢\u0006\u0004\bz\u0010MJ\u000f\u0010{\u001a\u00020\tH\u0002¢\u0006\u0004\b{\u0010MJ\u0017\u0010}\u001a\u00020a2\u0006\u0010|\u001a\u00020aH\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u007f\u0010MJ'\u0010\u0081\u0001\u001a\u00020h\"\u000b\b\u0000\u0010\u0080\u0001*\u0004\u0018\u00010h2\u0006\u0010q\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u0083\u0001R\u0017\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0083\u0001R\u0017\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u0084\u0001R\u0017\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0084\u0001R&\u0010+\u001a\u00020\u001c2\u0006\u0010q\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\u000e\n\u0005\b+\u0010\u0083\u0001\"\u0005\b,\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0083\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0083\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0083\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0084\u0001R\u0017\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0083\u0001R(\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010q\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0084\u0001\"\u0005\b\u008e\u0001\u0010sR\u0019\u0010\u008f\u0001\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0083\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0083\u0001R\u0019\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u0093\u0001R\u0019\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bE\u0010\u0094\u0001R\u0017\u0010$\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b$\u0010\u0083\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0083\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0083\u0001R\u0017\u0010&\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0083\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0083\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0083\u0001R\u0019\u0010\u0099\u0001\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0090\u0001R\u0019\u0010\u009a\u0001\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0090\u0001R\u0019\u0010w\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bw\u0010\u009b\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009b\u0001R\u001a\u0010 \u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010£\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u009e\u0001R\u001a\u0010¥\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¨\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0084\u0001R\u0019\u0010«\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u0084\u0001R\u0017\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010\u0084\u0001R\u0017\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010¨\u0001R\u001f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00020h8BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010´\u0001\u001a\u00020h8BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010±\u0001¨\u0006º\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "cornerRadius", "setCornerRadius", "(F)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "minValue", "setMinValue", "maxValue", "setMaxValue", "minStartValue", "setMinStartValue", "maxStartValue", "setMaxStartValue", "barColor", "setBarColor", "(I)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "barHeight", "setBarHeight", "barHighlightColor", "setBarHighlightColor", "Landroid/graphics/Bitmap;", "bitmap", "setLeftThumbBitmap", "(Landroid/graphics/Bitmap;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "setRightThumbBitmap", "dataType", "setDataType", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "pointsList", "setPoints", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "step", "setStep", "isInRangeMode", "setIsInRangeMode", "(Z)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarChangeListener;", "onRangeSeekbarChangeListener", "setOnRangeSeekbarChangeListener", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarChangeListener;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarFinalValueListener;", "onRangeSeekbarFinalValueListener", "setOnRangeSeekbarFinalValueListener", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarFinalValueListener;)V", "", "automatizationId", "setAutomatizationId", "(Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "apply", "()V", "getThumbWidth", "()F", "getThumbHeight", "getBarHeight", "getBarPadding", "setupBar", "setupHighlightBar", "setupLeftThumb", "setupRightThumb", "setupLabels", "trackTouchEvent", "(Landroid/view/MotionEvent;)V", "getMeasureSpecWith", "(I)I", "getMeasureSpecHeight", "touchX", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "evalPressedThumb", "(F)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "", "normalizedThumbValue", "isInThumbRange", "(FD)Z", "findClosestThumb", "onStartTrackingTouch", "onStopTrackingTouch", "", "normalizedCoord", "normalizedToScreen", "(Ljava/lang/Number;)F", "screenCoord", "screenToNormalized", "(F)D", "roundToStep", "(Ljava/lang/Number;Ljava/lang/Number;)D", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setNormalizedStep", "(I)V", "setNormalizedMinValue", "(D)V", "setNormalizedMaxValue", "leftThumb", "addFixGap", "(Z)V", "addMinGap", "addMaxGap", "normalized", "normalizedToValue", "(D)D", "attemptClaimDrag", "T", "formatValue", "(Ljava/lang/Number;)Ljava/lang/Number;", "F", "I", "labelDotsColor", "(F)V", "barPadding", "dotOnBarRadius", "thumbWidth", "thumbHeight", "thumbDiameter", "thumbColor", "steps", "setSteps", "normalizedStep", "D", "gap", "fixGap", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarChangeListener;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarFinalValueListener;", "absoluteMinValue", "absoluteMinStartValue", "absoluteMaxValue", "absoluteMaxStartValue", "normalizedMinValue", "normalizedMaxValue", "Landroid/graphics/Bitmap;", "Landroid/graphics/RectF;", "leftThumbRect", "Landroid/graphics/RectF;", "rightThumb", "rightThumbRect", "pressedThumb", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "rect", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "isDragging", "Z", "seekBarTouchEnabled", "pointerIndex", "activePointerId", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$VisibleLabel;", "visibleLabels", "Ljava/util/List;", "getSelectedMinValue", "()Ljava/lang/Number;", "selectedMinValue", "getSelectedMaxValue", "selectedMaxValue", "Thumb", "OnRangeSeekbarChangeListener", "OnRangeSeekbarFinalValueListener", "Label", "VisibleLabel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FilterSeekbar extends View {
    private float absoluteMaxStartValue;
    private float absoluteMaxValue;
    private float absoluteMinStartValue;
    private float absoluteMinValue;
    private int activePointerId;
    private int barColor;
    private float barHeight;
    private int barHighlightColor;
    private float barPadding;
    private float cornerRadius;
    private int dataType;
    private float dotOnBarRadius;
    private float fixGap;
    private float gap;
    private boolean isDragging;
    private boolean isInRangeMode;
    private int labelDotsColor;
    private Bitmap leftThumb;

    @NotNull
    private RectF leftThumbRect;
    private float maxStartValue;
    private float maxValue;
    private float minStartValue;
    private float minValue;
    private double normalizedMaxValue;
    private double normalizedMinValue;
    private double normalizedStep;
    private OnRangeSeekbarChangeListener onRangeSeekbarChangeListener;
    private OnRangeSeekbarFinalValueListener onRangeSeekbarFinalValueListener;

    @NotNull
    private Paint paint;
    private int pointerIndex;
    private Thumb pressedThumb;

    @NotNull
    private RectF rect;
    private Bitmap rightThumb;

    @NotNull
    private RectF rightThumbRect;
    private boolean seekBarTouchEnabled;
    private int steps;
    private int thumbColor;
    private float thumbDiameter;
    private float thumbHeight;
    private float thumbWidth;

    @NotNull
    private final List<VisibleLabel> visibleLabels;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarChangeListener;", "", "valueChanged", "", "minValue", "", "maxValue", "thumb", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnRangeSeekbarChangeListener {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void valueChanged$default(OnRangeSeekbarChangeListener onRangeSeekbarChangeListener, Number number, Number number2, Thumb thumb, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: valueChanged");
                }
                if ((i11 & 4) != 0) {
                    thumb = null;
                }
                onRangeSeekbarChangeListener.valueChanged(number, number2, thumb);
            }
        }

        void valueChanged(@NotNull Number minValue, @NotNull Number maxValue, Thumb thumb);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$OnRangeSeekbarFinalValueListener;", "", "finalValue", "", "minValue", "", "maxValue", "thumb", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnRangeSeekbarFinalValueListener {
        void finalValue(@NotNull Number minValue, @NotNull Number maxValue, Thumb thumb);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "", "<init>", "(Ljava/lang/String;I)V", "MIN", "MAX", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Thumb {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Thumb[] $VALUES;
        public static final Thumb MIN = new Thumb("MIN", 0);
        public static final Thumb MAX = new Thumb("MAX", 1);

        private static final /* synthetic */ Thumb[] $values() {
            return new Thumb[]{MIN, MAX};
        }

        static {
            Thumb[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Thumb(String str, int i11) {
        }

        public static Thumb valueOf(String str) {
            return (Thumb) Enum.valueOf(Thumb.class, str);
        }

        public static Thumb[] values() {
            return (Thumb[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$VisibleLabel;", "", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "label", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "getLabel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class VisibleLabel {

        @NotNull
        private final Label label;

        @NotNull
        private final TextAtomV2View view;

        public VisibleLabel(@NotNull TextAtomV2View view, @NotNull Label label) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(label, "label");
            this.view = view;
            this.label = label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisibleLabel)) {
                return false;
            }
            VisibleLabel visibleLabel = (VisibleLabel) other;
            return Intrinsics.d(this.view, visibleLabel.view) && Intrinsics.d(this.label, visibleLabel.label);
        }

        @NotNull
        public final Label getLabel() {
            return this.label;
        }

        @NotNull
        public final TextAtomV2View getView() {
            return this.view;
        }

        public int hashCode() {
            return this.label.hashCode() + (this.view.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "VisibleLabel(view=" + this.view + ", label=" + this.label + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterSeekbar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxValue = 100.0f;
        this.barColor = ThemeExtKt.themeColor(context, R$attr.bgOverlap);
        this.barHighlightColor = context.getColor(UniColors.BG_ACTION_SECONDARY_SOLID.getResId());
        this.labelDotsColor = context.getColor(UniColors.GRAPHIC_QUATERNARY.getResId());
        this.thumbDiameter = ResourceExtKt.toPxF(24, context);
        this.thumbColor = ThemeExtKt.themeColor(context, R$attr.graphicActionOnLight);
        this.steps = -1;
        this.normalizedStep = 1.0d;
        this.fixGap = -1.0f;
        this.normalizedMaxValue = 100.0d;
        this.leftThumbRect = new RectF();
        this.rightThumbRect = new RectF();
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.activePointerId = 255;
        this.isInRangeMode = true;
        this.visibleLabels = new ArrayList();
        this.absoluteMinValue = this.minValue;
        this.absoluteMaxValue = this.maxValue;
        float max = (float) Math.max(0.0d, Math.min(this.gap, r3 - r1));
        float f7 = this.absoluteMaxValue;
        this.gap = (max / (f7 - this.absoluteMinValue)) * 100.0f;
        float f11 = this.fixGap;
        if (f11 != -1.0f) {
            this.fixGap = (((float) Math.min(f11, f7)) / (this.absoluteMaxValue - this.absoluteMinValue)) * 100.0f;
            addFixGap(true);
        }
        this.thumbWidth = getThumbWidth();
        this.thumbHeight = getThumbHeight();
        this.pressedThumb = null;
        setBarHeight(getBarHeight());
        this.barPadding = getBarPadding();
        setMinStartValue();
        setMaxStartValue();
        setWillNotDraw(false);
    }

    private final void addFixGap(boolean leftThumb) {
        if (leftThumb) {
            double d11 = this.normalizedMinValue;
            float f7 = this.fixGap;
            double d12 = d11 + f7;
            this.normalizedMaxValue = d12;
            if (d12 >= 100.0d) {
                this.normalizedMaxValue = 100.0d;
                this.normalizedMinValue = 100.0d - f7;
                return;
            }
            return;
        }
        double d13 = this.normalizedMaxValue;
        float f11 = this.fixGap;
        double d14 = d13 - f11;
        this.normalizedMinValue = d14;
        if (d14 <= 0.0d) {
            this.normalizedMinValue = 0.0d;
            this.normalizedMaxValue = 0.0d + f11;
        }
    }

    private final void addMaxGap() {
        double d11 = this.normalizedMaxValue;
        float f7 = this.gap;
        if (d11 - f7 < this.normalizedMinValue) {
            double d12 = d11 - f7;
            this.normalizedMinValue = d12;
            double max = Math.max(0.0d, Math.min(100.0d, Math.min(d12, d11)));
            this.normalizedMinValue = max;
            double d13 = this.normalizedMaxValue;
            float f11 = this.gap;
            if (d13 <= f11 + max) {
                this.normalizedMaxValue = max + f11;
            }
        }
    }

    private final void addMinGap() {
        double d11 = this.normalizedMinValue;
        float f7 = this.gap;
        if (f7 + d11 > this.normalizedMaxValue) {
            double d12 = f7 + d11;
            this.normalizedMaxValue = d12;
            double max = Math.max(0.0d, Math.min(100.0d, Math.max(d12, d11)));
            this.normalizedMaxValue = max;
            double d13 = this.normalizedMinValue;
            float f11 = this.gap;
            if (d13 >= max - f11) {
                this.normalizedMinValue = max - f11;
            }
        }
    }

    private final void attemptClaimDrag() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private final Thumb evalPressedThumb(float touchX) {
        boolean z11 = this.isInRangeMode && isInThumbRange(touchX, this.normalizedMinValue);
        boolean isInThumbRange = isInThumbRange(touchX, this.normalizedMaxValue);
        Thumb thumb = (z11 && isInThumbRange) ? touchX / ((float) getWidth()) > 0.5f ? Thumb.MIN : Thumb.MAX : z11 ? Thumb.MIN : isInThumbRange ? Thumb.MAX : null;
        return (this.seekBarTouchEnabled && thumb == null) ? findClosestThumb(touchX) : thumb;
    }

    private final Thumb findClosestThumb(float touchX) {
        float normalizedToScreen = normalizedToScreen(Double.valueOf(this.normalizedMinValue));
        if (touchX >= normalizedToScreen(Double.valueOf(this.normalizedMaxValue))) {
            return Thumb.MAX;
        }
        if (touchX > normalizedToScreen && Math.abs(normalizedToScreen - touchX) >= Math.abs(r1 - touchX)) {
            return Thumb.MAX;
        }
        return Thumb.MIN;
    }

    private final <T extends Number> Number formatValue(T value) {
        Intrinsics.g(value, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue = ((Double) value).doubleValue();
        int i11 = this.dataType;
        if (i11 == 0) {
            return Long.valueOf((long) doubleValue);
        }
        if (i11 == 1) {
            return Double.valueOf(doubleValue);
        }
        if (i11 == 2) {
            return Long.valueOf(Math.round(doubleValue));
        }
        if (i11 == 3) {
            return Float.valueOf((float) doubleValue);
        }
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(A0.b("Number class '", value.getClass().getName(), "' is not supported"));
        }
        return Integer.valueOf((int) doubleValue);
    }

    private final float getBarHeight() {
        float f7 = this.barHeight;
        return f7 > 0.0f ? f7 : this.thumbHeight * 0.5f * 0.3f;
    }

    private final float getBarPadding() {
        return this.thumbWidth * 0.5f;
    }

    private final int getMeasureSpecHeight(int heightMeasureSpec) {
        int round = Math.round(this.thumbHeight);
        return View.MeasureSpec.getMode(heightMeasureSpec) != 0 ? (int) Math.min(round, View.MeasureSpec.getSize(heightMeasureSpec)) : round;
    }

    private final int getMeasureSpecWith(int widthMeasureSpec) {
        return View.MeasureSpec.getMode(widthMeasureSpec) != 0 ? View.MeasureSpec.getSize(widthMeasureSpec) : m.e.DEFAULT_DRAG_ANIMATION_DURATION;
    }

    private final Number getSelectedMaxValue() {
        double d11 = this.normalizedMaxValue;
        int i11 = this.steps;
        if (i11 <= 0.0f || i11 > Math.abs(this.absoluteMaxValue) / 2.0f) {
            int i12 = this.steps;
            if (i12 > 0) {
                throw new IllegalStateException(Ej.b.a(i12, "steps out of range ").toString());
            }
        } else {
            float f7 = (this.steps / (this.absoluteMaxValue - this.absoluteMinValue)) * 100.0f;
            double d12 = f7;
            double d13 = d11 % d12;
            d11 = d13 > ((double) (f7 / 2.0f)) ? (d11 - d13) + d12 : d11 - d13;
        }
        Number formatValue = formatValue(Double.valueOf(normalizedToValue(d11)));
        int i13 = this.steps;
        return i13 != -1 ? Float.valueOf(h.d((float) roundToStep(formatValue, Integer.valueOf(i13)), this.minValue, this.maxValue)) : formatValue;
    }

    private final Number getSelectedMinValue() {
        double d11 = this.normalizedMinValue;
        int i11 = this.steps;
        if (i11 <= 0.0f || i11 > Math.abs(this.absoluteMaxValue) / 2.0f) {
            int i12 = this.steps;
            if (i12 > 0) {
                throw new IllegalStateException(Ej.b.a(i12, "steps out of range ").toString());
            }
        } else {
            float f7 = (this.steps / (this.absoluteMaxValue - this.absoluteMinValue)) * 100.0f;
            double d12 = f7;
            double d13 = d11 % d12;
            d11 = d13 > ((double) (f7 / 2.0f)) ? (d11 - d13) + d12 : d11 - d13;
        }
        Number formatValue = formatValue(Double.valueOf(normalizedToValue(d11)));
        int i13 = this.steps;
        return i13 != -1 ? Float.valueOf(h.d((float) roundToStep(formatValue, Integer.valueOf(i13)), this.minValue, this.maxValue)) : formatValue;
    }

    private final float getThumbHeight() {
        return this.leftThumb != null ? r0.getHeight() : this.thumbDiameter;
    }

    private final float getThumbWidth() {
        return this.leftThumb != null ? r0.getWidth() : this.thumbDiameter;
    }

    private final boolean isInThumbRange(float touchX, double normalizedThumbValue) {
        float normalizedToScreen = normalizedToScreen(Double.valueOf(normalizedThumbValue));
        float thumbWidth = normalizedToScreen - (getThumbWidth() / 2.0f);
        float thumbWidth2 = (getThumbWidth() / 2.0f) + normalizedToScreen;
        float thumbWidth3 = touchX - (getThumbWidth() / 2.0f);
        if (normalizedToScreen <= getWidth() - this.thumbWidth) {
            touchX = thumbWidth3;
        }
        return thumbWidth <= touchX && touchX <= thumbWidth2;
    }

    private final float normalizedToScreen(Number normalizedCoord) {
        Integer valueOf = Integer.valueOf(getWidth());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return (normalizedCoord.floatValue() / 100.0f) * ((valueOf != null ? valueOf.intValue() : getMeasuredWidth()) - (this.barPadding * 2.0f));
    }

    private final double normalizedToValue(double normalized) {
        float f7 = this.maxValue;
        return ((normalized / 100.0d) * (f7 - r1)) + this.minValue;
    }

    private final void onStartTrackingTouch() {
        this.isDragging = true;
    }

    private final void onStopTrackingTouch() {
        this.isDragging = false;
    }

    private final double roundToStep(Number number, Number number2) {
        double doubleValue = number2.doubleValue();
        return Math.rint(number.doubleValue() / doubleValue) * doubleValue;
    }

    private final double screenToNormalized(float screenCoord) {
        double width = getWidth();
        float f7 = this.barPadding;
        if (width <= f7 * 2.0f) {
            return 0.0d;
        }
        double d11 = width - (2.0f * f7);
        return Math.min(100.0d, Math.max(0.0d, ((screenCoord / d11) * 100.0d) - ((f7 / d11) * 100.0d)));
    }

    private final void setBarHeight(float f7) {
        this.barHeight = f7;
        this.dotOnBarRadius = f7 / 2.0f;
    }

    private final void setNormalizedMaxValue(double value) {
        double max = Math.max(0.0d, Math.min(100.0d, Math.max(value, this.normalizedMinValue)));
        if (this.steps != -1) {
            max = roundToStep(Double.valueOf(max), Double.valueOf(this.normalizedStep));
        }
        this.normalizedMaxValue = max;
        float f7 = this.fixGap;
        if (f7 != -1.0f && f7 > 0.0f) {
            addFixGap(false);
        } else {
            addMaxGap();
        }
        invalidate();
    }

    private final void setNormalizedMinValue(double value) {
        double max = Math.max(0.0d, Math.min(100.0d, Math.min(value, this.normalizedMaxValue)));
        if (this.steps != -1) {
            max = roundToStep(Double.valueOf(max), Double.valueOf(this.normalizedStep));
        }
        this.normalizedMinValue = max;
        float f7 = this.fixGap;
        if (f7 != -1.0f && f7 > 0.0f) {
            addFixGap(true);
        } else {
            addMinGap();
        }
        invalidate();
    }

    private final void setNormalizedStep(int value) {
        this.normalizedStep = (value / (this.maxValue - this.minValue)) * 100.0d;
    }

    private final void setSteps(int i11) {
        this.steps = i11;
        setNormalizedStep(i11);
    }

    private final void setupBar(Canvas canvas) {
        RectF rectF = this.rect;
        rectF.left = this.barPadding;
        rectF.top = (this.thumbHeight - this.barHeight) * 0.5f;
        rectF.right = getWidth() - this.barPadding;
        rectF.bottom = (this.thumbHeight + this.barHeight) * 0.5f;
        this.paint.setColor(this.barColor);
        float f7 = this.cornerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.paint);
    }

    private final void setupHighlightBar(Canvas canvas) {
        RectF rectF = this.rect;
        rectF.left = normalizedToScreen(Double.valueOf(this.normalizedMinValue)) + this.barPadding;
        rectF.right = normalizedToScreen(Double.valueOf(this.normalizedMaxValue)) + this.barPadding;
        this.paint.setColor(this.barHighlightColor);
        float f7 = this.cornerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.paint);
    }

    private final void setupLabels(Canvas canvas) {
        for (VisibleLabel visibleLabel : this.visibleLabels) {
            float f7 = visibleLabel.getLabel().getTextPosition().x;
            float f11 = visibleLabel.getLabel().getTextPosition().y;
            TextAtomV2View view = visibleLabel.getView();
            int save = canvas.save();
            canvas.translate(f7, f11);
            try {
                view.draw(canvas);
                canvas.restoreToCount(save);
                this.paint.setColor(this.labelDotsColor);
                canvas.drawCircle(visibleLabel.getLabel().getDotPosition().x, visibleLabel.getLabel().getDotPosition().y, this.dotOnBarRadius, this.paint);
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    private final void setupLeftThumb(Canvas canvas) {
        this.paint.setColor(this.thumbColor);
        RectF rectF = this.leftThumbRect;
        rectF.left = normalizedToScreen(Double.valueOf(this.normalizedMinValue));
        rectF.top = 0.0f;
        rectF.right = (float) Math.min((getThumbWidth() / 2.0f) + r1 + this.barPadding, getWidth());
        rectF.bottom = this.thumbHeight;
        Bitmap bitmap = this.leftThumb;
        if (bitmap == null) {
            canvas.drawOval(this.leftThumbRect, this.paint);
        } else {
            RectF rectF2 = this.leftThumbRect;
            canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.paint);
        }
    }

    private final void setupRightThumb(Canvas canvas) {
        this.paint.setColor(this.thumbColor);
        RectF rectF = this.rightThumbRect;
        rectF.left = normalizedToScreen(Double.valueOf(this.normalizedMaxValue));
        rectF.right = (float) Math.min((getThumbWidth() / 2.0f) + r1 + this.barPadding, getWidth());
        rectF.top = 0.0f;
        rectF.bottom = this.thumbHeight;
        Bitmap bitmap = this.rightThumb;
        if (bitmap == null) {
            canvas.drawOval(this.rightThumbRect, this.paint);
        } else {
            RectF rectF2 = this.rightThumbRect;
            canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.paint);
        }
    }

    private final void trackTouchEvent(MotionEvent event) {
        try {
            float x11 = event.getX(event.findPointerIndex(this.activePointerId));
            Thumb thumb = Thumb.MIN;
            Thumb thumb2 = this.pressedThumb;
            if (thumb == thumb2) {
                setNormalizedMinValue(screenToNormalized(x11));
            } else if (Thumb.MAX == thumb2) {
                setNormalizedMaxValue(screenToNormalized(x11));
            }
        } catch (Exception unused) {
        }
    }

    public final void apply() {
        this.normalizedMinValue = 0.0d;
        this.normalizedMaxValue = 100.0d;
        float max = (float) Math.max(0.0d, Math.min(this.gap, this.absoluteMaxValue - this.absoluteMinValue));
        float f7 = this.absoluteMaxValue;
        this.gap = (max / (f7 - this.absoluteMinValue)) * 100.0f;
        float f11 = this.fixGap;
        if (f11 != -1.0f) {
            this.fixGap = (((float) Math.min(f11, f7)) / (this.absoluteMaxValue - this.absoluteMinValue)) * 100.0f;
            addFixGap(true);
        }
        this.thumbWidth = getThumbWidth();
        this.thumbHeight = getThumbHeight();
        setBarHeight(getBarHeight());
        this.barPadding = this.thumbWidth * 0.5f;
        float f12 = this.minStartValue;
        if (f12 <= this.absoluteMinValue) {
            this.minStartValue = 0.0f;
            setNormalizedMinValue(0.0f);
        } else {
            float f13 = this.absoluteMaxValue;
            if (f12 >= f13) {
                this.minStartValue = f13;
                setMinStartValue();
            } else {
                setMinStartValue();
            }
        }
        float f14 = this.maxStartValue;
        if (f14 <= this.absoluteMinValue || f14 <= this.absoluteMinStartValue) {
            this.maxStartValue = 0.0f;
            setNormalizedMaxValue(0.0f);
        } else {
            float f15 = this.absoluteMaxValue;
            if (f14 >= f15) {
                this.maxStartValue = f15;
                setMaxStartValue();
            } else {
                setMaxStartValue();
            }
        }
        requestLayout();
        invalidate();
        OnRangeSeekbarChangeListener onRangeSeekbarChangeListener = this.onRangeSeekbarChangeListener;
        if (onRangeSeekbarChangeListener == null || onRangeSeekbarChangeListener == null) {
            return;
        }
        OnRangeSeekbarChangeListener.DefaultImpls.valueChanged$default(onRangeSeekbarChangeListener, getSelectedMinValue(), getSelectedMaxValue(), null, 4, null);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        setupBar(canvas);
        setupHighlightBar(canvas);
        setupLabels(canvas);
        if (this.isInRangeMode) {
            setupLeftThumb(canvas);
        }
        setupRightThumb(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        for (VisibleLabel visibleLabel : this.visibleLabels) {
            LayoutExtKt.layoutLeftTop(visibleLabel.getView(), (int) visibleLabel.getLabel().getTextPosition().x, (int) visibleLabel.getLabel().getTextPosition().y);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int i11 = 0;
        for (VisibleLabel visibleLabel : this.visibleLabels) {
            TextAtomV2View view = visibleLabel.getView();
            MeasureExtKt.measureAtMost(view, -2, -2);
            if (view.getMeasuredHeight() > i11) {
                i11 = view.getMeasuredHeight();
            }
            float d11 = h.d((normalizedToScreen(Float.valueOf(visibleLabel.getLabel().getHorizontalPositionPercent())) - (view.getMeasuredWidth() / 2.0f)) + this.barPadding, 0.0f, getMeasuredWidth() - view.getMeasuredWidth());
            float measuredHeight = this.thumbHeight - (view.getMeasuredHeight() * 0.375f);
            visibleLabel.getLabel().getTextPosition().x = d11;
            visibleLabel.getLabel().getTextPosition().y = measuredHeight;
            float d12 = h.d(normalizedToScreen(Float.valueOf(visibleLabel.getLabel().getHorizontalPositionPercent())) + this.barPadding, 0.0f, getMeasuredWidth());
            float f7 = this.thumbHeight / 2;
            visibleLabel.getLabel().getDotPosition().x = d12;
            visibleLabel.getLabel().getDotPosition().y = f7;
        }
        setMeasuredDimension(getMeasureSpecWith(widthMeasureSpec), View.resolveSize((int) ((i11 * 0.625f) + this.thumbHeight), getMeasureSpecHeight(heightMeasureSpec)));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public synchronized boolean onTouchEvent(@NotNull MotionEvent event) {
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!isEnabled()) {
                return false;
            }
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                int pointerId = event.getPointerId(event.getPointerCount() - 1);
                this.activePointerId = pointerId;
                int findPointerIndex = event.findPointerIndex(pointerId);
                this.pointerIndex = findPointerIndex;
                if (findPointerIndex >= 0 && findPointerIndex < event.getPointerCount()) {
                    Thumb evalPressedThumb = evalPressedThumb(event.getX(this.pointerIndex));
                    this.pressedThumb = evalPressedThumb;
                    if (evalPressedThumb == null) {
                        return super.onTouchEvent(event);
                    }
                    setPressed(true);
                    invalidate();
                    onStartTrackingTouch();
                    trackTouchEvent(event);
                    attemptClaimDrag();
                }
                return false;
            }
            if (actionMasked == 1) {
                if (this.isDragging) {
                    trackTouchEvent(event);
                    onStopTrackingTouch();
                    setPressed(false);
                    OnRangeSeekbarFinalValueListener onRangeSeekbarFinalValueListener = this.onRangeSeekbarFinalValueListener;
                    if (onRangeSeekbarFinalValueListener != null) {
                        onRangeSeekbarFinalValueListener.finalValue(getSelectedMinValue(), getSelectedMaxValue(), this.pressedThumb);
                    }
                } else {
                    onStartTrackingTouch();
                    trackTouchEvent(event);
                    onStopTrackingTouch();
                }
                this.pressedThumb = null;
                invalidate();
                OnRangeSeekbarChangeListener onRangeSeekbarChangeListener = this.onRangeSeekbarChangeListener;
                if (onRangeSeekbarChangeListener != null) {
                    OnRangeSeekbarChangeListener.DefaultImpls.valueChanged$default(onRangeSeekbarChangeListener, getSelectedMinValue(), getSelectedMaxValue(), null, 4, null);
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.isDragging) {
                        onStopTrackingTouch();
                        setPressed(false);
                    }
                    invalidate();
                }
            } else if (this.pressedThumb != null) {
                if (this.isDragging) {
                    trackTouchEvent(event);
                }
                OnRangeSeekbarChangeListener onRangeSeekbarChangeListener2 = this.onRangeSeekbarChangeListener;
                if (onRangeSeekbarChangeListener2 != null) {
                    onRangeSeekbarChangeListener2.valueChanged(getSelectedMinValue(), getSelectedMaxValue(), this.pressedThumb);
                }
            }
            return true;
        } finally {
        }
    }

    @NotNull
    public final FilterSeekbar setAutomatizationId(String automatizationId) {
        setContentDescription(automatizationId);
        return this;
    }

    @NotNull
    public final FilterSeekbar setBarColor(int barColor) {
        this.barColor = barColor;
        return this;
    }

    @NotNull
    public final FilterSeekbar setBarHighlightColor(int barHighlightColor) {
        this.barHighlightColor = barHighlightColor;
        return this;
    }

    @NotNull
    public final FilterSeekbar setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    @NotNull
    public final FilterSeekbar setDataType(int dataType) {
        this.dataType = dataType;
        return this;
    }

    @NotNull
    public final FilterSeekbar setIsInRangeMode(boolean isInRangeMode) {
        this.isInRangeMode = isInRangeMode;
        return this;
    }

    @NotNull
    public final FilterSeekbar setLeftThumbBitmap(Bitmap bitmap) {
        this.leftThumb = bitmap;
        return this;
    }

    @NotNull
    public final FilterSeekbar setMaxStartValue(float maxStartValue) {
        this.maxStartValue = maxStartValue;
        this.absoluteMaxStartValue = maxStartValue;
        return this;
    }

    @NotNull
    public final FilterSeekbar setMaxValue(float maxValue) {
        this.maxValue = maxValue;
        this.absoluteMaxValue = maxValue;
        return this;
    }

    @NotNull
    public final FilterSeekbar setMinStartValue(float minStartValue) {
        this.minStartValue = minStartValue;
        this.absoluteMinStartValue = minStartValue;
        return this;
    }

    @NotNull
    public final FilterSeekbar setMinValue(float minValue) {
        this.minValue = minValue;
        this.absoluteMinValue = minValue;
        return this;
    }

    public final void setOnRangeSeekbarChangeListener(OnRangeSeekbarChangeListener onRangeSeekbarChangeListener) {
        this.onRangeSeekbarChangeListener = onRangeSeekbarChangeListener;
        if (onRangeSeekbarChangeListener != null) {
            OnRangeSeekbarChangeListener.DefaultImpls.valueChanged$default(onRangeSeekbarChangeListener, getSelectedMinValue(), getSelectedMaxValue(), null, 4, null);
        }
    }

    public final void setOnRangeSeekbarFinalValueListener(OnRangeSeekbarFinalValueListener onRangeSeekbarFinalValueListener) {
        this.onRangeSeekbarFinalValueListener = onRangeSeekbarFinalValueListener;
    }

    @NotNull
    public final FilterSeekbar setPoints(@NotNull List<Label> pointsList) {
        Intrinsics.checkNotNullParameter(pointsList, "pointsList");
        this.visibleLabels.clear();
        for (Label label : pointsList) {
            q qVar = q.f64554a;
            d b11 = N.b(TextAtomV2View.class);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
            textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            TextHolderKt.bind$default(textAtomV2View, label.getText(), null, 2, null);
            this.visibleLabels.add(new VisibleLabel(textAtomV2View, label));
        }
        return this;
    }

    @NotNull
    public final FilterSeekbar setRightThumbBitmap(Bitmap bitmap) {
        this.rightThumb = bitmap;
        return this;
    }

    @NotNull
    public final FilterSeekbar setStep(int step) {
        setSteps(step);
        return this;
    }

    private final void setMaxStartValue() {
        float f7 = this.maxStartValue;
        if (f7 <= this.absoluteMaxValue) {
            float f11 = this.absoluteMinValue;
            if (f7 <= f11 || f7 < this.absoluteMinStartValue) {
                return;
            }
            float max = (float) Math.max(this.absoluteMaxStartValue, f11);
            float f12 = this.absoluteMinValue;
            float f13 = ((max - f12) / (this.absoluteMaxValue - f12)) * 100.0f;
            this.maxStartValue = f13;
            setNormalizedMaxValue(f13);
        }
    }

    private final void setMinStartValue() {
        float f7 = this.minStartValue;
        if (f7 <= this.minValue || f7 > this.maxValue) {
            return;
        }
        float min = (float) Math.min(f7, this.absoluteMaxValue);
        float f11 = this.absoluteMinValue;
        float f12 = ((min - f11) / (this.absoluteMaxValue - f11)) * 100.0f;
        this.minStartValue = f12;
        setNormalizedMinValue(f12);
    }

    @NotNull
    /* renamed from: setBarHeight, reason: collision with other method in class */
    public final FilterSeekbar m1238setBarHeight(float barHeight) {
        setBarHeight(barHeight);
        return this;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "horizontalPositionPercent", "Landroid/graphics/PointF;", "textPosition", "dotPosition", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;IFLandroid/graphics/PointF;Landroid/graphics/PointF;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getValue", "F", "getHorizontalPositionPercent", "()F", "Landroid/graphics/PointF;", "getTextPosition", "()Landroid/graphics/PointF;", "getDotPosition", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Label {

        @NotNull
        private final PointF dotPosition;
        private final float horizontalPositionPercent;

        @NotNull
        private final TextDTO text;

        @NotNull
        private final PointF textPosition;
        private final int value;

        public Label(@NotNull TextDTO text, int i11, float f7, @NotNull PointF textPosition, @NotNull PointF dotPosition) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textPosition, "textPosition");
            Intrinsics.checkNotNullParameter(dotPosition, "dotPosition");
            this.text = text;
            this.value = i11;
            this.horizontalPositionPercent = f7;
            this.textPosition = textPosition;
            this.dotPosition = dotPosition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.d(this.text, label.text) && this.value == label.value && Float.compare(this.horizontalPositionPercent, label.horizontalPositionPercent) == 0 && Intrinsics.d(this.textPosition, label.textPosition) && Intrinsics.d(this.dotPosition, label.dotPosition);
        }

        @NotNull
        public final PointF getDotPosition() {
            return this.dotPosition;
        }

        public final float getHorizontalPositionPercent() {
            return this.horizontalPositionPercent;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final PointF getTextPosition() {
            return this.textPosition;
        }

        public int hashCode() {
            return this.dotPosition.hashCode() + ((this.textPosition.hashCode() + Pk0.b.a(this.horizontalPositionPercent, C2454a.a(this.value, this.text.hashCode() * 31, 31), 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Label(text=" + this.text + ", value=" + this.value + ", horizontalPositionPercent=" + this.horizontalPositionPercent + ", textPosition=" + this.textPosition + ", dotPosition=" + this.dotPosition + ")";
        }

        public /* synthetic */ Label(TextDTO textDTO, int i11, float f7, PointF pointF, PointF pointF2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, i11, f7, (i12 & 8) != 0 ? new PointF() : pointF, (i12 & 16) != 0 ? new PointF() : pointF2);
        }
    }
}
