package androidx.compose.ui.platform;

import B.G;
import X.r;
import X.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.view.AbstractC2088g0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2193s;
import b0.f;
import c0.AbstractC2475b;
import c0.AbstractC2476c;
import c0.InterfaceC2474a;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import e0.AbstractC4130a;
import i3.C4527h;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u0004:\u0002\u0006\u0007J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0018J \u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u001cJ1\u0010&\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010\u0018J\u0017\u00101\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010\u0018J!\u00105\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J)\u0010B\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u000107H\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0016H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020GH\u0016¢\u0006\u0004\bJ\u0010IJ\u0017\u0010\u0006\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0006\u0010FJ/\u0010P\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u0016H\u0016¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u0016H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0012J\u001f\u0010W\u001a\u00020\u00102\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0014¢\u0006\u0004\bW\u0010XJ7\u0010\\\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\u00102\u0006\u0010_\u001a\u00020^H\u0014¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00102\u0006\u0010_\u001a\u00020^H\u0014¢\u0006\u0004\bb\u0010aJ!\u0010f\u001a\u00020\u00102\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00100c¢\u0006\u0004\bf\u0010gJ\u0013\u0010h\u001a\u00020\u0010H\u0086@ø\u0001\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0010H\u0014¢\u0006\u0004\bj\u0010*J\u000f\u0010k\u001a\u00020\u0010H\u0014¢\u0006\u0004\bk\u0010*J!\u0010o\u001a\u00020\u00102\b\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010n\u001a\u00020\u0005H\u0016¢\u0006\u0004\bo\u0010pJ\u001d\u0010t\u001a\u00020\u00102\f\u0010s\u001a\b\u0012\u0004\u0012\u00020r0qH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bv\u0010\u0018J\u0017\u0010w\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\bw\u0010\u0018J\u0017\u0010x\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u0005H\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u0005H\u0016¢\u0006\u0004\bz\u0010yJ\u001d\u0010}\u001a\u00020{2\u0006\u0010|\u001a\u00020{H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u007f\u0010/J\u001f\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001f\u0010\u0085\u0001\u001a\u00020{2\u0006\u0010|\u001a\u00020{H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\b\u0085\u0001\u0010~J\u001c\u0010\u0088\u0001\u001a\u00020\u00102\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001b\u0010\u008b\u0001\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020\u0005H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0018J\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u0005¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0090\u0001\u0010/R\u0018\u0010\u0092\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0006\u0010\u0091\u0001R+\u0010\u0098\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b\u0007\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u009c\u0001\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bR\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010¢\u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u0019\u0010£\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0091\u0001R4\u0010¨\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\u00100c8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bT\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010gR-\u0010¬\u0001\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u001c\n\u0005\bP\u0010\u0091\u0001\u0012\u0005\b«\u0001\u0010*\u001a\u0005\b©\u0001\u0010/\"\u0005\bª\u0001\u0010FR\u001c\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R%\u0010´\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0019\u0010¶\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0091\u0001R \u0010¼\u0001\u001a\u00030·\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R!\u0010Á\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R!\u0010Ã\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\bÃ\u0001\u0010Â\u0001R/\u0010Ê\u0001\u001a\u00020#8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\bZ\u0010Ä\u0001\u0012\u0005\bÉ\u0001\u0010*\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u0091\u0001R!\u0010Í\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b.\u0010Ä\u0001R6\u0010Ó\u0001\u001a\u0004\u0018\u00010d2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010d8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\bh\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010Ö\u0001\u001a\u0004\u0018\u00010d8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\f\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ð\u0001R&\u0010×\u0001\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u0010\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010¤\u0001R4\u0010Ý\u0001\u001a\u00030Ø\u00012\b\u0010\u0094\u0001\u001a\u00030Ø\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b[\u0010Î\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010ß\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010Þ\u0001R4\u0010\u008a\u0001\u001a\u00030à\u00012\b\u0010\u0094\u0001\u001a\u00030à\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0017\u0010Î\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R\u001f\u0010é\u0001\u001a\u00030å\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R\u001a\u0010ë\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010ê\u0001R\u0017\u0010î\u0001\u001a\u00030ì\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010í\u0001R\u0018\u0010ï\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0091\u0001R\u0018\u0010ð\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u0091\u0001R'\u0010ò\u0001\u001a\u00030ñ\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bò\u0001\u0010ó\u0001\u0012\u0005\bö\u0001\u0010*\u001a\u0006\bô\u0001\u0010õ\u0001R\u001b\u0010ø\u0001\u001a\u00020\u0005*\u00030\u0086\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b[\u0010÷\u0001R \u0010ú\u0001\u001a\u00030ù\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001R\u0017\u0010\u0080\u0002\u001a\u0002038VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R \u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u0089\u0002\u001a\u00030\u0086\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R \u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R \u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0019\u0010t\u001a\u0005\u0018\u00010\u0094\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R \u0010\u0098\u0002\u001a\u00030\u0097\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R \u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R \u0010¢\u0002\u001a\u00030¡\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002R\u0018\u0010¨\u0002\u001a\u00030\u00ad\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010§\u0002R\u0017\u0010ª\u0002\u001a\u00020#8VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010Æ\u0001R\u0016\u0010¬\u0002\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0002\u0010/R \u0010®\u0002\u001a\u00030\u00ad\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b®\u0002\u0010¯\u0002\u001a\u0006\b°\u0002\u0010±\u0002R \u0010³\u0002\u001a\u00030²\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b³\u0002\u0010´\u0002\u001a\u0006\bµ\u0002\u0010¶\u0002R \u0010¸\u0002\u001a\u00030·\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¸\u0002\u0010¹\u0002\u001a\u0006\bº\u0002\u0010»\u0002R\u0018\u0010¿\u0002\u001a\u00030¼\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002R \u0010Á\u0002\u001a\u00030À\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002R \u0010Æ\u0002\u001a\u00030Å\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÆ\u0002\u0010Ç\u0002\u001a\u0006\bÈ\u0002\u0010É\u0002R \u0010Ë\u0002\u001a\u00030Ê\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bË\u0002\u0010Ì\u0002\u001a\u0006\bÍ\u0002\u0010Î\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ï\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/d;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "a", com.google.crypto.tink.integration.android.b.f37029b, "Lkotlin/ULong;", "C", "(II)J", "measureSpec", "p", "(I)J", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "w", "(Landroidx/compose/ui/node/LayoutNode;)V", "v", "Landroid/view/MotionEvent;", "event", "", "t", "(Landroid/view/MotionEvent;)Z", "motionEvent", "LT/c;", "s", "(Landroid/view/MotionEvent;)I", "lastEvent", "u", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "y", "G", "action", "", "eventTime", "forceHover", "H", "(Landroid/view/MotionEvent;IJZ)V", "z", "D", "()V", "E", "(Landroid/view/MotionEvent;)V", "F", "n", "()Z", C5444x.f55808b, "A", "accessibilityId", "Landroid/view/View;", "currentView", "q", "(ILandroid/view/View;)Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "gainFocus", EventKeys.DIRECTION_KEY, "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEventPreIme", "sendPointerUpdate", "layoutNode", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "g", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "c", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "f", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "r", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", EventKeys.VALUES_KEY, "autofill", "(Landroid/util/SparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "(I)Z", "canScrollVertically", "LM/d;", "localPosition", "B", "(J)J", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", com.bumptech.glide.gifdecoder.e.f29601m, "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", ViewProps.LAYOUT_DIRECTION, "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "shouldDelayChildPressedState", "Z", "superclassInitComplete", "Le0/d;", "<set-?>", "Le0/d;", "getDensity", "()Le0/d;", "density", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "LX/s;", W9.d.f13160a, "LX/s;", "getRootForTest", "()LX/s;", "rootForTest", "isDrawingContent", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/g;", C4527h.f48087o, "Landroidx/compose/ui/platform/g;", "_androidViewsHandler", "Le0/b;", com.google.android.material.shape.i.f35755A, "Le0/b;", "onMeasureConstraints", "j", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/platform/n;", "k", "Landroidx/compose/ui/platform/n;", "getViewConfiguration", "()Landroidx/compose/ui/platform/n;", "viewConfiguration", "", "tmpPositionArray", "[I", "LN/k;", "viewToWindowMatrix", "[F", "windowToViewMatrix", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", X9.m.f13664a, "forceUseMatrixCache", "windowPosition", "LB/s;", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "LB/G;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Lb0/f$a;", "getFontFamilyResolver", "()Lb0/f$a;", "setFontFamilyResolver", "(Lb0/f$a;)V", "fontFamilyResolver", "I", "currentFontWeightAdjustment", "Le0/k;", "getLayoutDirection", "()Le0/k;", "setLayoutDirection", "(Le0/k;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/view/MotionEvent;", "previousMotionEvent", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "sendHoverExitEvent", "hoverExitReceived", "keyboardModifiersRequireUpdate", "Lb0/e;", "fontLoader", "Lb0/e;", "getFontLoader", "()Lb0/e;", "getFontLoader$annotations", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "LX/i;", "sharedDrawScope", "LX/i;", "getSharedDrawScope", "()LX/i;", "getView", "()Landroid/view/View;", "view", "LL/a;", "focusOwner", "LL/a;", "getFocusOwner", "()LL/a;", "Landroidx/compose/ui/platform/o;", "getWindowInfo", "()Landroidx/compose/ui/platform/o;", "windowInfo", "LZ/e;", "semanticsOwner", "LZ/e;", "getSemanticsOwner", "()LZ/e;", "LK/b;", "autofillTree", "LK/b;", "getAutofillTree", "()LK/b;", "LK/a;", "getAutofill", "()LK/a;", "Landroidx/compose/ui/platform/c;", "clipboardManager", "Landroidx/compose/ui/platform/c;", "getClipboardManager", "()Landroidx/compose/ui/platform/c;", "Landroidx/compose/ui/platform/b;", "accessibilityManager", "Landroidx/compose/ui/platform/b;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/b;", "LX/r;", "snapshotObserver", "LX/r;", "getSnapshotObserver", "()LX/r;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/g;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lc0/b;", "platformTextInputPluginRegistry", "Lc0/b;", "getPlatformTextInputPluginRegistry", "()Lc0/b;", "Lc0/c;", "textInputService", "Lc0/c;", "getTextInputService", "()Lc0/c;", "LQ/a;", "hapticFeedBack", "LQ/a;", "getHapticFeedBack", "()LQ/a;", "LR/a;", "getInputModeManager", "()LR/a;", "inputModeManager", "LW/a;", "modifierLocalManager", "LW/a;", "getModifierLocalManager", "()LW/a;", "Landroidx/compose/ui/platform/m;", "textToolbar", "Landroidx/compose/ui/platform/m;", "getTextToolbar", "()Landroidx/compose/ui/platform/m;", "LT/a;", "pointerIconService", "LT/a;", "getPointerIconService", "()LT/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor", "VisibleForTests"})
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2051:1\n979#1,3:2081\n979#1,3:2084\n1182#2:2052\n1161#2,2:2053\n81#3:2055\n107#3,2:2056\n81#3:2058\n81#3:2059\n107#3,2:2060\n81#3:2062\n107#3,2:2063\n523#4:2065\n728#4,2:2066\n460#4,11:2095\n460#4,11:2107\n26#5,5:2068\n26#5,5:2073\n26#5,3:2078\n30#5:2087\n26#5,5:2122\n47#6,5:2088\n1#7:2093\n197#8:2094\n197#8:2106\n20#9,2:2118\n20#9,2:2120\n217#10,6:2127\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n953#1:2081,3\n954#1:2084,3\n479#1:2052\n479#1:2053,2\n339#1:2055\n339#1:2056,2\n348#1:2058\n401#1:2059\n401#1:2060,2\n415#1:2062\n415#1:2063,2\n691#1:2065\n704#1:2066,2\n1207#1:2095,11\n1215#1:2107,11\n877#1:2068,5\n889#1:2073,5\n949#1:2078,3\n949#1:2087\n1364#1:2122,5\n1133#1:2088,5\n1207#1:2094\n1215#1:2106\n1227#1:2118,2\n1282#1:2120,2\n1442#1:2127,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.d, s, DefaultLifecycleObserver {

    /* renamed from: A, reason: collision with root package name */
    public static Class f17638A;

    /* renamed from: B, reason: collision with root package name */
    public static Method f17639B;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean superclassInitComplete;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public e0.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode root;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final s rootForTest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isDrawingContent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Function1 configurationChangeObserver;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public g _androidViewsHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public e0.b onMeasureConstraints;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean wasMeasuredWithMultipleConstraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final n viewConfiguration;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean forceUseMatrixCache;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long windowPosition;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final B.s _viewTreeOwners;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final G viewTreeOwners;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Function1 onViewTreeOwnersAvailable;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final B.s fontFamilyResolver;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int currentFontWeightAdjustment;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final B.s layoutDirection;

    @NotNull
    private final int[] tmpPositionArray;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext coroutineContext;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public MotionEvent previousMotionEvent;

    @NotNull
    private final float[] viewToWindowMatrix;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Runnable sendHoverExitEvent;

    @NotNull
    private final float[] windowToViewMatrix;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean hoverExitReceived;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public boolean keyboardModifiersRequireUpdate;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b() {
            try {
                if (AndroidComposeView.f17638A == null) {
                    AndroidComposeView.f17638A = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f17638A;
                    AndroidComposeView.f17639B = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f17639B;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public Companion() {
        }
    }

    public static final class b {
        public abstract InterfaceC2193s a();
    }

    public static /* synthetic */ void I(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.H(motionEvent, i10, j10, z10);
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final b get_viewTreeOwners() {
        return (b) this._viewTreeOwners.getValue();
    }

    private void setFontFamilyResolver(f.a aVar) {
        this.fontFamilyResolver.setValue(aVar);
    }

    private void setLayoutDirection(e0.k kVar) {
        this.layoutDirection.setValue(kVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this._viewTreeOwners.setValue(bVar);
    }

    public final boolean A(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    public long B(long localPosition) {
        D();
        long c10 = N.k.c(this.viewToWindowMatrix, localPosition);
        return M.e.a(M.d.c(c10) + M.d.c(this.windowPosition), M.d.d(c10) + M.d.d(this.windowPosition));
    }

    public final long C(int a10, int b10) {
        return ULong.m321constructorimpl(ULong.m321constructorimpl(b10) | ULong.m321constructorimpl(ULong.m321constructorimpl(a10) << 32));
    }

    public final void D() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            F();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = M.e.a(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    public final void E(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        F();
        long c10 = N.k.c(this.viewToWindowMatrix, M.e.a(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = M.e.a(motionEvent.getRawX() - M.d.c(c10), motionEvent.getRawY() - M.d.d(c10));
    }

    public final void F() {
        throw null;
    }

    public final int G(MotionEvent motionEvent) {
        if (!this.keyboardModifiersRequireUpdate) {
            throw null;
        }
        this.keyboardModifiersRequireUpdate = false;
        T.b.a(motionEvent.getMetaState());
        throw null;
    }

    public final void H(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i10 = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            i10 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i10 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((i10 < 0 || i13 < i10) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long B10 = B(M.e.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = M.d.c(B10);
            pointerCoords.y = M.d.d(B10);
            i13++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        Intrinsics.checkNotNullExpressionValue(event, "event");
        throw null;
    }

    @Override // androidx.compose.ui.node.d
    public void a(boolean sendPointerUpdate) {
        throw null;
    }

    @Override // android.view.View
    public void autofill(SparseArray values) {
        Intrinsics.checkNotNullParameter(values, "values");
        n();
    }

    @Override // androidx.compose.ui.node.d
    public void c(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!affectsLookahead) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        throw null;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            v(getRoot());
        }
        androidx.compose.ui.node.d.b(this, false, 1, null);
        this.isDrawingContent = true;
        throw null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event.getActionMasked() == 8 ? event.isFromSource(4194304) ? t(event) : (x(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : T.c.b(s(event)) : super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (x(event) || !isAttachedToWindow()) {
            return false;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        T.b.a(event.getMetaState());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEventPreIme(event);
        }
        getFocusOwner();
        S.a.a(event);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || u(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (x(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !A(motionEvent)) {
            return false;
        }
        int s10 = s(motionEvent);
        if (T.c.a(s10)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return T.c.b(s10);
    }

    @Override // androidx.compose.ui.node.d
    public long e(long localPosition) {
        D();
        return N.k.c(this.viewToWindowMatrix, localPosition);
    }

    @Override // androidx.compose.ui.node.d
    public void f(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        throw null;
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return q(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.node.d
    public void g(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!affectsLookahead) {
            throw null;
        }
        throw null;
    }

    @NotNull
    /* renamed from: getAccessibilityManager, reason: collision with other method in class */
    public androidx.compose.ui.platform.b m46getAccessibilityManager() {
        return null;
    }

    @NotNull
    public final g getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            g gVar = new g(context);
            this._androidViewsHandler = gVar;
            addView(gVar);
        }
        g gVar2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(gVar2);
        return gVar2;
    }

    @Nullable
    public K.a getAutofill() {
        return null;
    }

    @NotNull
    public K.b getAutofillTree() {
        return null;
    }

    @NotNull
    public c getClipboardManager() {
        return null;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public e0.d getDensity() {
        return this.density;
    }

    @NotNull
    public L.a getFocusOwner() {
        return null;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        getFocusOwner();
        throw null;
    }

    @NotNull
    public f.a getFontFamilyResolver() {
        return (f.a) this.fontFamilyResolver.getValue();
    }

    @NotNull
    public b0.e getFontLoader() {
        return null;
    }

    @NotNull
    public Q.a getHapticFeedBack() {
        return null;
    }

    public boolean getHasPendingMeasureOrLayout() {
        throw null;
    }

    @NotNull
    public R.a getInputModeManager() {
        return null;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent
    @NotNull
    public e0.k getLayoutDirection() {
        return (e0.k) this.layoutDirection.getValue();
    }

    public long getMeasureIteration() {
        throw null;
    }

    @NotNull
    public W.a getModifierLocalManager() {
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC2474a getPlatformTextInputPluginRegistry() {
        m48getPlatformTextInputPluginRegistry();
        return null;
    }

    @NotNull
    public T.a getPointerIconService() {
        return null;
    }

    @Override // androidx.compose.ui.node.d
    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @NotNull
    public s getRootForTest() {
        return this.rootForTest;
    }

    @NotNull
    public Z.e getSemanticsOwner() {
        return null;
    }

    @Override // androidx.compose.ui.node.d
    @NotNull
    public X.i getSharedDrawScope() {
        return null;
    }

    @Override // androidx.compose.ui.node.d
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.d
    @NotNull
    public r getSnapshotObserver() {
        return null;
    }

    @NotNull
    public AbstractC2476c getTextInputService() {
        return null;
    }

    @NotNull
    public m getTextToolbar() {
        return null;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @NotNull
    public n getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Nullable
    public final b getViewTreeOwners() {
        return (b) this.viewTreeOwners.getValue();
    }

    @NotNull
    public o getWindowInfo() {
        return null;
    }

    public final boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final Object o(Continuation continuation) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(getRoot());
        v(getRoot());
        getSnapshotObserver();
        throw null;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        m48getPlatformTextInputPluginRegistry();
        throw null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.density = AbstractC4130a.a(context);
        if (r(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = r(newConfig);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(b0.i.a(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        m48getPlatformTextInputPluginRegistry();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver();
        throw null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        getFocusOwner();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        throw null;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                w(getRoot());
            }
            long p10 = p(widthMeasureSpec);
            int m321constructorimpl = (int) ULong.m321constructorimpl(p10 >>> 32);
            int m321constructorimpl2 = (int) ULong.m321constructorimpl(p10 & BodyPartID.bodyIdMax);
            long p11 = p(heightMeasureSpec);
            long a10 = e0.c.a(m321constructorimpl, m321constructorimpl2, (int) ULong.m321constructorimpl(p11 >>> 32), (int) ULong.m321constructorimpl(BodyPartID.bodyIdMax & p11));
            e0.b bVar = this.onMeasureConstraints;
            boolean z10 = false;
            if (bVar != null) {
                if (bVar != null) {
                    z10 = e0.b.e(bVar.m(), a10);
                }
                if (!z10) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            } else {
                this.onMeasureConstraints = e0.b.b(a10);
                this.wasMeasuredWithMultipleConstraints = false;
            }
            throw null;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        n();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC2193s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(INSTANCE.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        e0.k b10;
        if (this.superclassInitComplete) {
            b10 = e.b(layoutDirection);
            setLayoutDirection(b10);
            getFocusOwner();
            throw null;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        throw null;
    }

    public final long p(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return C(0, size);
        }
        if (mode == 0) {
            return C(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return C(size, size);
        }
        throw new IllegalStateException();
    }

    public final View q(int accessibilityId, View currentView) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
                    View q10 = q(accessibilityId, childAt);
                    if (q10 != null) {
                        return q10;
                    }
                }
            }
        }
        return null;
    }

    public final int r(Configuration configuration) {
        int i10;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i10 = configuration.fontWeightAdjustment;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:5:0x0015, B:7:0x001f, B:11:0x002e, B:13:0x0034, B:15:0x003a, B:18:0x0044, B:19:0x0057, B:27:0x0069, B:29:0x006f, B:31:0x0080, B:32:0x0083, B:38:0x0056), top: B:4:0x0015, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        removeCallbacks(null);
        try {
            E(motionEvent);
            boolean z10 = true;
            this.forceUseMatrixCache = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.previousMotionEvent;
                boolean z11 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                if (motionEvent3 != null && u(motionEvent, motionEvent3)) {
                    if (y(motionEvent3)) {
                        throw null;
                    }
                    if (motionEvent3.getActionMasked() != 10 && z11) {
                        I(this, motionEvent3, 10, motionEvent3.getEventTime(), false, 8, null);
                        motionEvent2 = motionEvent3;
                        if (motionEvent.getToolType(0) == 3) {
                            z10 = false;
                        }
                        if (!z11 && z10 && actionMasked != 3 && actionMasked != 9 && z(motionEvent)) {
                            I(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                        }
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                        int G10 = G(motionEvent);
                        Trace.endSection();
                        return G10;
                    }
                }
                motionEvent2 = motionEvent3;
                if (motionEvent.getToolType(0) == 3) {
                }
                if (!z11) {
                    I(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int G102 = G(motionEvent);
                Trace.endSection();
                return G102;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super b, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getViewTreeOwners();
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        new U.a(AbstractC2088g0.j(viewConfiguration, getContext()) * f10, f10 * AbstractC2088g0.f(viewConfiguration, getContext()), event.getEventTime());
        getFocusOwner();
        throw null;
    }

    public final boolean u(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    public final void v(LayoutNode node) {
        node.z();
        C.a y10 = node.y();
        int l10 = y10.l();
        if (l10 > 0) {
            Object[] k10 = y10.k();
            int i10 = 0;
            do {
                v((LayoutNode) k10[i10]);
                i10++;
            } while (i10 < l10);
        }
    }

    public final void w(LayoutNode node) {
        int i10 = 0;
        androidx.compose.ui.node.c.a(null, node, false, 2, null);
        C.a y10 = node.y();
        int l10 = y10.l();
        if (l10 > 0) {
            Object[] k10 = y10.k();
            do {
                w((LayoutNode) k10[i10]);
                i10++;
            } while (i10 < l10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(MotionEvent event) {
        boolean z10;
        float x10 = event.getX();
        if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
            float y10 = event.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10)) {
                float rawX = event.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = event.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z10 = false;
                        if (!z10) {
                            int pointerCount = event.getPointerCount();
                            for (int i10 = 1; i10 < pointerCount; i10++) {
                                float x11 = event.getX(i10);
                                if (!Float.isInfinite(x11) && !Float.isNaN(x11)) {
                                    float y11 = event.getY(i10);
                                    if (!Float.isInfinite(y11) && !Float.isNaN(y11) && (Build.VERSION.SDK_INT < 29 || l.f17702a.a(event, i10))) {
                                        z10 = false;
                                        if (!z10) {
                                            break;
                                        }
                                    }
                                }
                                z10 = true;
                                if (!z10) {
                                }
                            }
                        }
                        return z10;
                    }
                }
            }
        }
        z10 = true;
        if (!z10) {
        }
        return z10;
    }

    public final boolean y(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    public final boolean z(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public /* bridge */ /* synthetic */ a getAccessibilityManager() {
        m46getAccessibilityManager();
        return null;
    }

    /* renamed from: getClipboardManager, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ h m47getClipboardManager() {
        getClipboardManager();
        return null;
    }

    @NotNull
    /* renamed from: getPlatformTextInputPluginRegistry, reason: collision with other method in class */
    public AbstractC2475b m48getPlatformTextInputPluginRegistry() {
        return null;
    }
}
