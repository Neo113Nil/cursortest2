package ru.ozon.fintech.features.camera.presentation.camera;

import B90.m0;
import Bl.C2639a;
import C.C;
import C.C2697q;
import C.I;
import C.InterfaceC2688h;
import C.InterfaceC2689i;
import C.InterfaceC2694n;
import C.U;
import C.Y;
import C.e0;
import E30.f;
import H30.u;
import H30.z;
import L30.j;
import Q.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import V.g;
import W.A;
import W.C4845p;
import W.C4851w;
import W.K;
import W.W;
import W.f0;
import W.r;
import W.t0;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C;
import androidx.annotation.NonNull;
import androidx.camera.core.h;
import androidx.camera.core.w;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import androidx.core.view.C5353y0;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import com.google.common.util.concurrent.m;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.camera.databinding.CameraFragmentBinding;
import ru.ozon.fintech.features.camera.databinding.CameraViewLayoutBinding;
import ru.ozon.fintech.features.camera.di.CameraApi;
import ru.ozon.fintech.features.camera.di.CameraComponent;
import ru.ozon.fintech.features.camera.domain.CameraActions;
import ru.ozon.fintech.features.camera.domain.State;
import ru.ozon.fintech.features.camera.domain.scanner.bankcard.BankCardAnalyzer;
import ru.ozon.fintech.features.camera.domain.scanner.phone.PhoneNumberAnalyzer;
import ru.ozon.fintech.features.camera.domain.scanner.qr.BarCodeAnalyzer;
import ru.ozon.fintech.features.camera.domain.tips.TipsType;
import ru.ozon.fintech.features.camera.ui.DocFrameOrientation;
import ru.ozon.fintech.features.camera.ui.DocFrameView;
import ru.ozon.fintech.features.camera.ui.FeedbackCircleView;
import ru.ozon.fintech.features.camera.ui.PhoneFrameView;
import ru.ozon.fintech.features.camera.ui.QrScannerView;
import ru.ozon.fintech.features.camera.ui.SelfieDocFrameView;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u90.C9987a;
import x2.InterfaceC10646a;
import xe.C10727i;

@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0007*\nµ\u0001Õ\u0001Ø\u0001Û\u0001Þ\u0001\u0018\u0000 á\u00012\u00020\u00012\u00020\u0002:\u0006á\u0001â\u0001ã\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J/\u0010%\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&J)\u0010*\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010(H\u0017¢\u0006\u0004\b*\u0010+J+\u00101\u001a\u0002002\b\u0010,\u001a\u0004\u0018\u00010\u00122\u0006\u0010-\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b8\u00106J\u0015\u00109\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b9\u00106J\u001f\u0010<\u001a\u00020\u00072\u0006\u0010:\u001a\u0002002\u0006\u0010;\u001a\u000200H\u0003¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H\u0003¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u000200H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020\u00072\b\b\u0002\u0010F\u001a\u000200H\u0002¢\u0006\u0004\bG\u0010AJ\u0019\u0010J\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010N\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010W\u001a\u00020U2\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020UH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\\H\u0002¢\u0006\u0004\ba\u0010_J\u0019\u0010c\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010h\u001a\u00020\u00072\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u000200H\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0007H\u0002¢\u0006\u0004\bj\u0010\u0004J\u0019\u0010l\u001a\u00020\u00072\b\b\u0002\u0010k\u001a\u00020\u001eH\u0003¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0007H\u0002¢\u0006\u0004\bn\u0010\u0004J\u000f\u0010o\u001a\u00020\u0007H\u0002¢\u0006\u0004\bo\u0010\u0004J\u001b\u0010q\u001a\u00020\u0007*\u00020\u00122\u0006\u0010p\u001a\u00020\u001eH\u0002¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u0007*\u00020\u00122\u0006\u0010p\u001a\u00020\u001eH\u0002¢\u0006\u0004\bs\u0010rJ\u000f\u0010t\u001a\u00020\u0007H\u0003¢\u0006\u0004\bt\u0010\u0004J\u0017\u0010v\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\\H\u0002¢\u0006\u0004\bv\u0010_J\u000f\u0010w\u001a\u00020\u0007H\u0002¢\u0006\u0004\bw\u0010\u0004J\u000f\u0010x\u001a\u000200H\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u000200H\u0002¢\u0006\u0004\bz\u0010yJ\u000f\u0010{\u001a\u00020\u0007H\u0002¢\u0006\u0004\b{\u0010\u0004J\u000f\u0010|\u001a\u00020\u0007H\u0002¢\u0006\u0004\b|\u0010\u0004J \u0010\u007f\u001a\u00020\u001e2\u0006\u0010}\u001a\u00020\u001e2\u0006\u0010~\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u0004J\u0011\u0010\u0082\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u0004J\u001b\u0010\u0084\u0001\u001a\u00020\u001e2\u0007\u0010\u0083\u0001\u001a\u00020!H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0004R!\u0010\u008c\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R#\u0010\u0099\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010¨\u0001\u001a\u00030§\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010«\u0001\u001a\u00030ª\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010:\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010\u00ad\u0001R\u0017\u0010;\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u00ad\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010±\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001a\u0010¶\u0001\u001a\u00030µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R!\u0010¿\u0001\u001a\u00030»\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u0089\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u0089\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Å\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010´\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010´\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010´\u0001R\u0019\u0010È\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010´\u0001R\u0019\u0010É\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010\u00ad\u0001R*\u0010Ë\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u001f\u0010Ñ\u0001\u001a\u00020!8\u0016X\u0096D¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010Ü\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010ß\u0001\u001a\u00030Þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001¨\u0006ä\u0001"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment;", "LE30/c;", "Landroid/view/View$OnKeyListener;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onStart", "onPause", "onStop", "onDestroyView", "onDestroy", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "p0", "keyCode", "Landroid/view/KeyEvent;", "p2", "", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Landroid/net/Uri;", "uri", "testPhotoTakeQR", "(Landroid/net/Uri;)V", "testPhotoScanQR", "testPhotoScanPhoneNumber", "testPhotoScanBankCardNumber", "andRestartVideo", "andCombineChunks", "videoRecordingStop", "(ZZ)V", "createVideoChunk", "subscribe", "subscribeKeyEventListener", "(Z)V", "Lru/ozon/fintech/features/camera/databinding/CameraFragmentBinding;", "binding", "initImageCaptureButton", "(Lru/ozon/fintech/features/camera/databinding/CameraFragmentBinding;)V", "isVolumeDown", "capturePhoto", "Lt90/a;", "action", "handlePermissionActionFlow", "(Lt90/a;)V", "Lu90/a;", "permissionsScreenState", "handlePermissionViewStateFlow", "(Lu90/a;)V", "Lru/ozon/fintech/features/camera/domain/State;", "state", "handleCameraViewStateFlow", "(Lru/ozon/fintech/features/camera/domain/State;)V", "angle", "Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "current", "resolveOrientation", "(ILru/ozon/fintech/features/camera/ui/DocFrameOrientation;)Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "orientation", "switchSelfieDocFrame", "(Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;)V", "", "percent", "updateGuideLinePosition", "(F)V", "newBias", "updatePreviewBias", "Lru/ozon/fintech/features/camera/domain/CameraActions;", "handleCameraActionsFlow", "(Lru/ozon/fintech/features/camera/domain/CameraActions;)V", "LC/i;", "cameraControl", "enable", "enableCameraTorch", "(LC/i;Z)V", "setUpCamera", "flash", "bindCameraUseCases", "(I)V", "updateCloseButtonMargin", "updateConfirmButtonsMargin", "margin", "updateBottomMargin", "(Landroid/view/View;I)V", "updateTopMargin", "setupFocusOnTap", "scaleFactor", "scaleZoom", "updateCameraSwitchButton", "hasBackCamera", "()Z", "hasFrontCamera", "hideSystemBarUi", "returnSystemBarUi", "width", "height", "aspectRatio", "(II)I", "handleFlashClick", "stopCameraBinding", "barName", "getBarSize", "(Ljava/lang/String;)I", "startAutoFocus", "Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/fintech/features/camera/presentation/camera/CameraViewModel;", "viewModel", "Lru/ozon/fintech/features/camera/databinding/CameraFragmentBinding;", "LC/h;", "camera", "LC/h;", "LV/g;", "cameraProvider", "LV/g;", "LC/I;", "imageCapture", "LC/I;", "LW/f0;", "LW/K;", "videoCapture", "LW/f0;", "LC/Y;", "preview", "LC/Y;", "LW/W;", "videoRecording", "LW/W;", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "Lru/ozon/fintech/features/camera/ui/FeedbackCircleView;", "focusCircleView", "Lru/ozon/fintech/features/camera/ui/FeedbackCircleView;", "Landroid/view/GestureDetector;", "tapDetector", "Landroid/view/GestureDetector;", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "Z", "Landroid/view/OrientationEventListener;", "orientationEventListener", "Landroid/view/OrientationEventListener;", "currentOrientation", "Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "lastAngle", "I", "ru/ozon/fintech/features/camera/presentation/camera/CameraFragment$backCallback$1", "backCallback", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$backCallback$1;", "Landroid/util/Size;", "captureImageResolution", "Landroid/util/Size;", "LQ/b;", "qrResolutionSelector$delegate", "getQrResolutionSelector", "()LQ/b;", "qrResolutionSelector", "LW/A;", "qualitySelector$delegate", "getQualitySelector", "()LW/A;", "qualitySelector", "iconColor", "shortAnimationDuration", "savedSystemBarColor", "savedNavBarColor", "isCameraNotUnderSystemBars", "LT30/c;", "executorProvider", "LT30/c;", "getExecutorProvider$camera_prodRelease", "()LT30/c;", "setExecutorProvider$camera_prodRelease", "(LT30/c;)V", "fragmentName", "Ljava/lang/String;", "getFragmentName", "()Ljava/lang/String;", "ru/ozon/fintech/features/camera/presentation/camera/CameraFragment$imageCaptureCallback$1", "imageCaptureCallback", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$imageCaptureCallback$1;", "ru/ozon/fintech/features/camera/presentation/camera/CameraFragment$torchCallback$1", "torchCallback", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$torchCallback$1;", "ru/ozon/fintech/features/camera/presentation/camera/CameraFragment$scaleGestureDetectorListener$1", "scaleGestureDetectorListener", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$scaleGestureDetectorListener$1;", "ru/ozon/fintech/features/camera/presentation/camera/CameraFragment$tapGestureDetectorListener$1", "tapGestureDetectorListener", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$tapGestureDetectorListener$1;", "Companion", "WorkingMode", "ScanAction", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraFragment extends E30.c implements View.OnKeyListener {
    private static final long AUTOFOCUS_INTERVAL = 2000;

    @NotNull
    public static final String BARCODE_FORMATS = "BARCODE_FORMATS";

    @NotNull
    private static final String CONFIRM_TITLE_DEFAULT = "";

    @NotNull
    public static final String CONFIRM_TITLE_KEY = "confirm_title";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FOR_UNIQUE_UUID = "FOR_UNIQUE_UUID";
    private static final boolean IS_BACK_CAMERA_DEFAULT = true;

    @NotNull
    public static final String IS_BACK_CAMERA_KEY = "IS_BACK_CAMERA";

    @NotNull
    private static final String NAVIGATION_BAR = "navigation_bar_height";

    @NotNull
    public static final String NO_BOTTOM_TABS = "NO_BOTTOM_TABS";

    @NotNull
    public static final String PHONE_REGEX = "PHONE_REGEX";

    @NotNull
    public static final String PREVIEW_CAMERA_TITLE_KEY = "PREVIEW_CAMERA_TITLE_KEY";

    @NotNull
    public static final String QR_BUTTON_TEXT = "QR_BUTTON_TEXT";

    @NotNull
    public static final String QR_CONFIRM_DIALOG = "QR_CONFIRM";
    private static final boolean QR_CONFIRM_DIALOG_DEFAULT = false;

    @NotNull
    public static final String QR_DETECT_AUTOCLOSE = "QR_DETECT_AUTOCLOSE";
    private static final boolean QR_DETECT_AUTOCLOSE_DEFAULT = true;
    private static final double RATIO_16_9_VALUE = 1.7777777777777777d;
    private static final double RATIO_4_3_VALUE = 1.3333333333333333d;

    @NotNull
    public static final String ROUND_FACE_FRAME_ENABLED = "ROUND_FACE_FRAME_ENABLED";

    @NotNull
    public static final String SCAN_ACTION = "QR_ACTION";
    private static final float SELFIE_MASK_TIP_BOTTOM_GUIDELINE = 0.12f;

    @NotNull
    private static final String STATUS_BAR = "status_bar_height";

    @NotNull
    private static final String TAG = "finCamera";

    @NotNull
    public static final String TIPS_OPTIONS_ELEMENTS = "TIPS_OPTIONS_ELEMENT";

    @NotNull
    public static final String TIPS_OPTIONS_TYPE = "TIPS_OPTIONS_TYPE";

    @NotNull
    public static final String VIDEO_CHUNK_DURATION_MS = "VIDEO_CHUNK_DURATION_MS";

    @NotNull
    public static final String VIDEO_ENABLED = "VIDEO_ENABLED";

    @NotNull
    public static final String VIDEO_QUALITY = "VIDEO_QUALITY";

    @NotNull
    public static final String WORKING_MODE = "WORKING_MODE";
    private boolean andCombineChunks;
    private boolean andRestartVideo;

    @NotNull
    private CameraFragment$backCallback$1 backCallback;
    private CameraFragmentBinding binding;
    private InterfaceC2688h camera;

    @NotNull
    private final ExecutorService cameraExecutor;
    private g cameraProvider;

    @NotNull
    private final Size captureImageResolution;

    @NotNull
    private DocFrameOrientation currentOrientation;
    public T30.c executorProvider;
    private FeedbackCircleView focusCircleView;

    @NotNull
    private final String fragmentName;
    private int iconColor;
    private I imageCapture;

    @NotNull
    private final CameraFragment$imageCaptureCallback$1 imageCaptureCallback;
    private boolean isCameraNotUnderSystemBars;
    private int lastAngle;
    private OrientationEventListener orientationEventListener;
    private Y preview;

    /* renamed from: qrResolutionSelector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j qrResolutionSelector;

    /* renamed from: qualitySelector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j qualitySelector;
    private int savedNavBarColor;
    private int savedSystemBarColor;
    private ScaleGestureDetector scaleDetector;

    @NotNull
    private final CameraFragment$scaleGestureDetectorListener$1 scaleGestureDetectorListener;
    private int shortAnimationDuration;
    private GestureDetector tapDetector;

    @NotNull
    private final CameraFragment$tapGestureDetectorListener$1 tapGestureDetectorListener;

    @NotNull
    private final CameraFragment$torchCallback$1 torchCallback;
    private f0<K> videoCapture;
    private W videoRecording;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÓ\u0001\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u000e2\b\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010=JÓ\u0001\u0010>\u001a\u00020?2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010@\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00100\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u000e2\b\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010AR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$Companion;", "", "<init>", "()V", "TAG", "", "RATIO_4_3_VALUE", "", "RATIO_16_9_VALUE", "QR_CONFIRM_DIALOG_DEFAULT", "", "QR_DETECT_AUTOCLOSE_DEFAULT", "IS_BACK_CAMERA_DEFAULT", "AUTOFOCUS_INTERVAL", "", "SELFIE_MASK_TIP_BOTTOM_GUIDELINE", "", "CONFIRM_TITLE_DEFAULT", "NAVIGATION_BAR", "STATUS_BAR", CameraFragment.WORKING_MODE, "CONFIRM_TITLE_KEY", CameraFragment.NO_BOTTOM_TABS, "SCAN_ACTION", "QR_CONFIRM_DIALOG", CameraFragment.FOR_UNIQUE_UUID, CameraFragment.QR_DETECT_AUTOCLOSE, "IS_BACK_CAMERA_KEY", CameraFragment.PREVIEW_CAMERA_TITLE_KEY, "TIPS_OPTIONS_ELEMENTS", CameraFragment.TIPS_OPTIONS_TYPE, CameraFragment.PHONE_REGEX, CameraFragment.BARCODE_FORMATS, CameraFragment.QR_BUTTON_TEXT, CameraFragment.VIDEO_ENABLED, CameraFragment.VIDEO_CHUNK_DURATION_MS, CameraFragment.VIDEO_QUALITY, CameraFragment.ROUND_FACE_FRAME_ENABLED, "newInstance", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment;", "workingMode", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "confirmPhotoTitle", "scanAction", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;", "noBottomTabs", "forUniqueUuid", "qrDetectAutoclose", "qrConfirmDialog", "isBackCamera", "previewCameraTitle", "tipsTextsAtoms", "tipsTextsType", "phoneNumberRegex", "barcodeFormats", "", "qrButtonText", "videoEnabled", "videoChunkDurationMs", "videoQuality", "roundFaceFrameEnabled", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;Ljava/lang/String;Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment;", "getBundle", "Landroid/os/Bundle;", SelectionItemFormDTO.TITLE_FIELD_NAME, "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;Ljava/lang/String;Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Landroid/os/Bundle;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle getBundle(@NotNull WorkingMode workingMode, @NotNull String title, @NotNull ScanAction scanAction, boolean noBottomTabs, boolean qrDetectAutoclose, String forUniqueUuid, boolean qrConfirmDialog, boolean isBackCamera, @NotNull String previewCameraTitle, String tipsTextsAtoms, String tipsTextsType, String phoneNumberRegex, List<String> barcodeFormats, String qrButtonText, boolean videoEnabled, Long videoChunkDurationMs, String videoQuality, Boolean roundFaceFrameEnabled) {
            Intrinsics.checkNotNullParameter(workingMode, "workingMode");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(scanAction, "scanAction");
            Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
            return d.b(new Pair(CameraFragment.WORKING_MODE, workingMode), new Pair(CameraFragment.CONFIRM_TITLE_KEY, title), new Pair(CameraFragment.NO_BOTTOM_TABS, Boolean.valueOf(noBottomTabs)), new Pair(CameraFragment.SCAN_ACTION, scanAction), new Pair(CameraFragment.QR_CONFIRM_DIALOG, Boolean.valueOf(qrConfirmDialog)), new Pair(CameraFragment.QR_DETECT_AUTOCLOSE, Boolean.valueOf(qrDetectAutoclose)), new Pair(CameraFragment.FOR_UNIQUE_UUID, forUniqueUuid), new Pair(CameraFragment.IS_BACK_CAMERA_KEY, Boolean.valueOf(isBackCamera)), new Pair(CameraFragment.PREVIEW_CAMERA_TITLE_KEY, previewCameraTitle), new Pair(CameraFragment.TIPS_OPTIONS_ELEMENTS, tipsTextsAtoms), new Pair(CameraFragment.TIPS_OPTIONS_TYPE, tipsTextsType), new Pair(CameraFragment.PHONE_REGEX, phoneNumberRegex), new Pair(CameraFragment.BARCODE_FORMATS, barcodeFormats != null ? (String[]) barcodeFormats.toArray(new String[0]) : null), new Pair(CameraFragment.QR_BUTTON_TEXT, qrButtonText), new Pair(CameraFragment.VIDEO_ENABLED, Boolean.valueOf(videoEnabled)), new Pair(CameraFragment.VIDEO_CHUNK_DURATION_MS, videoChunkDurationMs), new Pair(CameraFragment.VIDEO_QUALITY, videoQuality), new Pair(CameraFragment.ROUND_FACE_FRAME_ENABLED, roundFaceFrameEnabled));
        }

        @NotNull
        public final CameraFragment newInstance(@NotNull WorkingMode workingMode, @NotNull String confirmPhotoTitle, @NotNull ScanAction scanAction, boolean noBottomTabs, String forUniqueUuid, boolean qrDetectAutoclose, boolean qrConfirmDialog, boolean isBackCamera, @NotNull String previewCameraTitle, String tipsTextsAtoms, String tipsTextsType, String phoneNumberRegex, List<String> barcodeFormats, String qrButtonText, boolean videoEnabled, Long videoChunkDurationMs, String videoQuality, Boolean roundFaceFrameEnabled) {
            Intrinsics.checkNotNullParameter(workingMode, "workingMode");
            Intrinsics.checkNotNullParameter(confirmPhotoTitle, "confirmPhotoTitle");
            Intrinsics.checkNotNullParameter(scanAction, "scanAction");
            Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
            CameraFragment cameraFragment = new CameraFragment();
            cameraFragment.setArguments(CameraFragment.INSTANCE.getBundle(workingMode, confirmPhotoTitle, scanAction, noBottomTabs, qrDetectAutoclose, forUniqueUuid, qrConfirmDialog, isBackCamera, previewCameraTitle, tipsTextsAtoms, tipsTextsType, phoneNumberRegex, barcodeFormats, qrButtonText, videoEnabled, videoChunkDurationMs, videoQuality, roundFaceFrameEnabled));
            return cameraFragment;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$ScanAction;", "", "<init>", "(Ljava/lang/String;I)V", "TRY_TO_GO_TO", "RETURN_VALUE", "PHOTO", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScanAction {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ScanAction[] $VALUES;
        public static final ScanAction TRY_TO_GO_TO = new ScanAction("TRY_TO_GO_TO", 0);
        public static final ScanAction RETURN_VALUE = new ScanAction("RETURN_VALUE", 1);
        public static final ScanAction PHOTO = new ScanAction("PHOTO", 2);

        private static final /* synthetic */ ScanAction[] $values() {
            return new ScanAction[]{TRY_TO_GO_TO, RETURN_VALUE, PHOTO};
        }

        static {
            ScanAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ScanAction(String str, int i11) {
        }

        @NotNull
        public static Xc.a<ScanAction> getEntries() {
            return $ENTRIES;
        }

        public static ScanAction valueOf(String str) {
            return (ScanAction) Enum.valueOf(ScanAction.class, str);
        }

        public static ScanAction[] values() {
            return (ScanAction[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TipsType.values().length];
            try {
                iArr[TipsType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TipsType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WorkingMode.values().length];
            try {
                iArr2[WorkingMode.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WorkingMode.REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WorkingMode.QR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WorkingMode.BARCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WorkingMode.QR_AND_BARCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WorkingMode.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[WorkingMode.TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WorkingMode.BANK_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DocFrameOrientation.values().length];
            try {
                iArr3[DocFrameOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DocFrameOrientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "", "<init>", "(Ljava/lang/String;I)V", TakePhotoRequest.QR_SCANNER_TYPE, "PASSPORT", "NONE", TakePhotoRequest.BARCODE_SCANNER_TYPE, "QR_AND_BARCODE", "REGISTRATION", "TEXT", TakePhotoRequest.BANK_CARD, "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WorkingMode {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ WorkingMode[] $VALUES;
        public static final WorkingMode QR = new WorkingMode(TakePhotoRequest.QR_SCANNER_TYPE, 0);
        public static final WorkingMode PASSPORT = new WorkingMode("PASSPORT", 1);
        public static final WorkingMode NONE = new WorkingMode("NONE", 2);
        public static final WorkingMode BARCODE = new WorkingMode(TakePhotoRequest.BARCODE_SCANNER_TYPE, 3);
        public static final WorkingMode QR_AND_BARCODE = new WorkingMode("QR_AND_BARCODE", 4);
        public static final WorkingMode REGISTRATION = new WorkingMode("REGISTRATION", 5);
        public static final WorkingMode TEXT = new WorkingMode("TEXT", 6);
        public static final WorkingMode BANK_CARD = new WorkingMode(TakePhotoRequest.BANK_CARD, 7);

        private static final /* synthetic */ WorkingMode[] $values() {
            return new WorkingMode[]{QR, PASSPORT, NONE, BARCODE, QR_AND_BARCODE, REGISTRATION, TEXT, BANK_CARD};
        }

        static {
            WorkingMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private WorkingMode(String str, int i11) {
        }

        @NotNull
        public static Xc.a<WorkingMode> getEntries() {
            return $ENTRIES;
        }

        public static WorkingMode valueOf(String str) {
            return (WorkingMode) Enum.valueOf(WorkingMode.class, str);
        }

        public static WorkingMode[] values() {
            return (WorkingMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$imageCaptureCallback$1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$scaleGestureDetectorListener$1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$tapGestureDetectorListener$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$backCallback$1] */
    public CameraFragment() {
        C90.a aVar = new C90.a(this, 1);
        InterfaceC4008j a11 = k.a(n.NONE, new CameraFragment$special$$inlined$viewModels$default$2(new CameraFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(CameraViewModel.class), new CameraFragment$special$$inlined$viewModels$default$3(a11), new CameraFragment$special$$inlined$viewModels$default$4(null, a11), aVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.cameraExecutor = newSingleThreadExecutor;
        this.currentOrientation = DocFrameOrientation.PORTRAIT;
        this.lastAngle = -1;
        this.backCallback = new C() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$backCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                CameraFragmentBinding cameraFragmentBinding;
                CameraViewModel viewModel;
                PermissionsScreenStateView permissionsScreenStateView;
                cameraFragmentBinding = CameraFragment.this.binding;
                if (cameraFragmentBinding == null || (permissionsScreenStateView = cameraFragmentBinding.permissionsScreenState) == null || !permissionsScreenStateView.close()) {
                    viewModel = CameraFragment.this.getViewModel();
                    CameraViewModel.closeByUser$default(viewModel, false, 1, null);
                }
            }
        };
        this.captureImageResolution = new Size(1080, 1920);
        n nVar = n.PUBLICATION;
        this.qrResolutionSelector = k.a(nVar, new C90.b(this, 1));
        this.qualitySelector = k.a(nVar, new a(this, 0));
        this.isCameraNotUnderSystemBars = Build.VERSION.SDK_INT < 31;
        this.fragmentName = "CameraFragment";
        this.imageCaptureCallback = new I.f() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$imageCaptureCallback$1
            @Override // C.I.f
            public /* bridge */ /* synthetic */ void onCaptureProcessProgressed(int i11) {
            }

            @Override // C.I.f
            public /* bridge */ /* synthetic */ void onCaptureStarted() {
            }

            @Override // C.I.f
            public void onError(C.K exception) {
                CameraViewModel viewModel;
                Intrinsics.checkNotNullParameter(exception, "exception");
                L80.a.a("finCamera", "Ошибка при попытке сделать фото");
                L80.a.g(exception);
                viewModel = CameraFragment.this.getViewModel();
                viewModel.sendTakePhotoErrorAnalytics();
            }

            @Override // C.I.f
            public void onImageSaved(I.h outputFileResults) {
                CameraViewModel viewModel;
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                viewModel = CameraFragment.this.getViewModel();
                viewModel.photoTaken(outputFileResults.a());
                CameraFragment.this.videoRecordingStop(false, true);
                L80.a.a("finCamera", "Фото успешно получено: " + outputFileResults.a());
            }

            @Override // C.I.f
            public /* bridge */ /* synthetic */ void onPostviewBitmapAvailable(@NonNull Bitmap bitmap) {
            }
        };
        this.torchCallback = new CameraFragment$torchCallback$1(this);
        this.scaleGestureDetectorListener = new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$scaleGestureDetectorListener$1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                CameraFragment.this.scaleZoom(detector.getScaleFactor());
                return super.onScale(detector);
            }
        };
        this.tapGestureDetectorListener = new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$tapGestureDetectorListener$1
            /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
            
                r3 = r2.binding;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
            
                r2 = r2.focusCircleView;
             */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onSingleTapUp(MotionEvent e11) {
                CameraFragmentBinding cameraFragmentBinding;
                CameraViewLayoutBinding cameraViewLayoutBinding;
                PreviewView previewView;
                InterfaceC2688h interfaceC2688h;
                CameraViewModel viewModel;
                CameraFragmentBinding cameraFragmentBinding2;
                CameraViewLayoutBinding cameraViewLayoutBinding2;
                PreviewView previewView2;
                FeedbackCircleView feedbackCircleView;
                InterfaceC2689i a12;
                Intrinsics.checkNotNullParameter(e11, "e");
                cameraFragmentBinding = CameraFragment.this.binding;
                if (cameraFragmentBinding != null && (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) != null && (previewView = cameraViewLayoutBinding.cameraView) != null) {
                    CameraFragment cameraFragment = CameraFragment.this;
                    U b11 = new e0(previewView.getWidth(), previewView.getHeight()).b(e11.getX(), e11.getY());
                    Intrinsics.checkNotNullExpressionValue(b11, "createPoint(...)");
                    interfaceC2688h = cameraFragment.camera;
                    if (interfaceC2688h != null && (a12 = interfaceC2688h.a()) != null) {
                        C.a aVar2 = new C.a(b11);
                        aVar2.b();
                        a12.f(aVar2.a());
                    }
                    viewModel = cameraFragment.getViewModel();
                    if (!viewModel.isQrScannerFlow() && cameraFragmentBinding2 != null && (cameraViewLayoutBinding2 = cameraFragmentBinding2.cameraLayout) != null && (previewView2 = cameraViewLayoutBinding2.cameraView) != null && feedbackCircleView != null) {
                        previewView2.removeView(feedbackCircleView);
                        previewView2.addView(feedbackCircleView);
                        feedbackCircleView.showAt(e11.getX() - (feedbackCircleView.getWidth() / 2), e11.getY() - (feedbackCircleView.getHeight() / 2));
                    }
                    previewView.performClick();
                }
                return true;
            }
        };
    }

    private final int aspectRatio(int width, int height) {
        double max = Math.max(width, height) / Math.min(width, height);
        return Math.abs(max - RATIO_4_3_VALUE) <= Math.abs(max - RATIO_16_9_VALUE) ? 0 : 1;
    }

    @SuppressLint({"RestrictedApi"})
    private final void bindCameraUseCases(int flash) {
        V.b bVar;
        final CameraViewLayoutBinding cameraViewLayoutBinding;
        final CameraViewLayoutBinding cameraViewLayoutBinding2;
        final CameraViewLayoutBinding cameraViewLayoutBinding3;
        CameraViewLayoutBinding cameraViewLayoutBinding4;
        PreviewView previewView;
        C2697q.a aVar = new C2697q.a();
        aVar.c(getViewModel().getLensFacing());
        C2697q b11 = aVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "build(...)");
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) ((cameraFragmentBinding == null || (cameraViewLayoutBinding4 = cameraFragmentBinding.cameraLayout) == null || (previewView = cameraViewLayoutBinding4.cameraView) == null) ? null : previewView.getLayoutParams());
        int aspectRatio = bVar2 != null ? aspectRatio(((ViewGroup.MarginLayoutParams) bVar2).width, ((ViewGroup.MarginLayoutParams) bVar2).height) : -1;
        ArrayList arrayList = new ArrayList();
        Y.a aVar2 = new Y.a();
        if (getViewModel().isQrScannerFlow()) {
            aVar2.g(getQrResolutionSelector());
        } else {
            aVar2.i(aspectRatio);
        }
        Y c11 = aVar2.c();
        arrayList.add(c11);
        this.preview = c11;
        if (getViewModel().isTakePhotoFlow() || getViewModel().getScanAction() == ScanAction.PHOTO) {
            I.b bVar3 = new I.b();
            bVar3.f();
            bVar3.o(this.captureImageResolution);
            I c12 = bVar3.c();
            arrayList.add(c12);
            c12.c0(flash);
            this.imageCapture = c12;
        }
        if (getViewModel().isSaveBackgroundVideo()) {
            if (this.videoCapture == null) {
                K.h hVar = new K.h();
                hVar.b(this.cameraExecutor);
                hVar.c(getQualitySelector());
                K a11 = hVar.a();
                Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
                this.videoCapture = f0.o0(a11);
            }
            f0<K> f0Var = this.videoCapture;
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        if (getViewModel().isQrScannerFlow()) {
            h.c cVar = new h.c();
            cVar.f();
            cVar.i(getQrResolutionSelector());
            h c13 = cVar.c();
            c13.Y(getExecutorProvider$camera_prodRelease().a(), getViewModel().getBarCodeAnalyzer());
            CameraFragmentBinding cameraFragmentBinding2 = this.binding;
            if (cameraFragmentBinding2 != null && (cameraViewLayoutBinding3 = cameraFragmentBinding2.cameraLayout) != null) {
                getViewModel().getBarCodeAnalyzer().setPreview(cameraViewLayoutBinding3.cameraView);
                final ConstraintLayout constraintLayout = cameraViewLayoutBinding3.getConstraintLayout();
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$bindCameraUseCases$lambda$65$lambda$64$$inlined$afterMeasured$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        CameraViewModel viewModel;
                        if (constraintLayout.getMeasuredWidth() <= 0 || constraintLayout.getMeasuredHeight() <= 0) {
                            return;
                        }
                        constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        viewModel = this.getViewModel();
                        viewModel.getBarCodeAnalyzer().setBoxRect(cameraViewLayoutBinding3.qrView.getScannerAreaRectFinish());
                    }
                });
            }
            arrayList.add(c13);
        }
        if (getViewModel().isPhoneScannerFlow()) {
            final PhoneNumberAnalyzer phoneNumberAnalyzer = getViewModel().getPhoneNumberAnalyzer();
            h.c cVar2 = new h.c();
            cVar2.f();
            cVar2.i(getQrResolutionSelector());
            h c14 = cVar2.c();
            c14.Y(getExecutorProvider$camera_prodRelease().a(), phoneNumberAnalyzer);
            CameraFragmentBinding cameraFragmentBinding3 = this.binding;
            if (cameraFragmentBinding3 != null && (cameraViewLayoutBinding2 = cameraFragmentBinding3.cameraLayout) != null) {
                phoneNumberAnalyzer.setPreview(cameraViewLayoutBinding2.cameraView);
                final ConstraintLayout constraintLayout2 = cameraViewLayoutBinding2.getConstraintLayout();
                constraintLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$bindCameraUseCases$lambda$68$lambda$67$$inlined$afterMeasured$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (constraintLayout2.getMeasuredWidth() <= 0 || constraintLayout2.getMeasuredHeight() <= 0) {
                            return;
                        }
                        constraintLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        phoneNumberAnalyzer.setBoxRect(cameraViewLayoutBinding2.phoneView.getScannerAreaRectFinish());
                    }
                });
            }
            arrayList.add(c14);
        }
        if (getViewModel().isBankCardScannerFlow()) {
            final BankCardAnalyzer bankCardAnalyzer = getViewModel().getBankCardAnalyzer();
            h.c cVar3 = new h.c();
            cVar3.f();
            cVar3.i(getQrResolutionSelector());
            h c15 = cVar3.c();
            c15.Y(getExecutorProvider$camera_prodRelease().a(), bankCardAnalyzer);
            CameraFragmentBinding cameraFragmentBinding4 = this.binding;
            if (cameraFragmentBinding4 != null && (cameraViewLayoutBinding = cameraFragmentBinding4.cameraLayout) != null) {
                bankCardAnalyzer.setPreview(cameraViewLayoutBinding.cameraView);
                final ConstraintLayout constraintLayout3 = cameraViewLayoutBinding.getConstraintLayout();
                constraintLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$bindCameraUseCases$lambda$71$lambda$70$$inlined$afterMeasured$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (constraintLayout3.getMeasuredWidth() <= 0 || constraintLayout3.getMeasuredHeight() <= 0) {
                            return;
                        }
                        constraintLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        bankCardAnalyzer.setBoxRect(cameraViewLayoutBinding.phoneView.getScannerAreaRectFinish());
                    }
                });
            }
            arrayList.add(c15);
        }
        L80.a.a("VIDEO_FLOW", "useCases " + arrayList.size() + " " + arrayList);
        g gVar = this.cameraProvider;
        if (gVar != null) {
            gVar.j();
        }
        try {
            if (this.binding != null) {
                g gVar2 = this.cameraProvider;
                if (gVar2 != null) {
                    J viewLifecycleOwner = getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    w[] wVarArr = (w[]) arrayList.toArray(new w[0]);
                    bVar = gVar2.f(viewLifecycleOwner, b11, (w[]) Arrays.copyOf(wVarArr, wVarArr.length));
                } else {
                    bVar = null;
                }
                this.camera = bVar;
                Y y11 = this.preview;
                if (y11 != null) {
                    CameraFragmentBinding cameraFragmentBinding5 = this.binding;
                    CameraViewLayoutBinding cameraViewLayoutBinding5 = cameraFragmentBinding5 != null ? cameraFragmentBinding5.cameraLayout : null;
                    Intrinsics.f(cameraViewLayoutBinding5);
                    y11.X(cameraViewLayoutBinding5.cameraView.c());
                }
                setupFocusOnTap();
                if (this.videoRecording == null && getViewModel().isSaveBackgroundVideo()) {
                    createVideoChunk();
                }
                InterfaceC2688h interfaceC2688h = this.camera;
                L80.a.a("VIDEO_FLOW", "Камера успешно проинициализиаровована: " + (interfaceC2688h != null ? interfaceC2688h.b() : null));
                getViewModel().cameraSuccessOpen();
            }
        } catch (Exception e11) {
            L80.a.b("VIDEO_FLOW", "Ошибка при привязке к жизненному циклу " + e11.getMessage());
            L80.a.g(e11);
            getViewModel().onBindsCameraUserCasesToLifecycleError(e11);
        }
        if (getViewModel().isQrScannerFlow()) {
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$1(this, getViewModel().getBarCodeAnalyzer().getDetectedDataFlow(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$2(this, getViewModel().getBarCodeAnalyzer().getNeedAutoFocusFlow(), null, this), 3);
        }
        if (getViewModel().isPhoneScannerFlow()) {
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$3(this, getViewModel().getPhoneNumberAnalyzer().getDetectedDataFlow(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$4(this, getViewModel().getPhoneNumberAnalyzer().getNeedAutoFocusFlow(), null, this), 3);
        }
        if (getViewModel().isBankCardScannerFlow()) {
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$5(this, getViewModel().getBankCardAnalyzer().getDetectedDataFlow(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$6(this, getViewModel().getBankCardAnalyzer().getNeedAutoFocusFlow(), null, this), 3);
        }
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$bindCameraUseCases$$inlined$observe$7(this, getViewModel().getOpenPickerIntentAction(), null, this), 3);
    }

    static /* synthetic */ void bindCameraUseCases$default(CameraFragment cameraFragment, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        cameraFragment.bindCameraUseCases(i11);
    }

    private final void capturePhoto(boolean isVolumeDown) {
        Context context;
        I i11 = this.imageCapture;
        if (i11 == null || (context = getContext()) == null) {
            return;
        }
        File takePhoto = getViewModel().takePhoto(context, isVolumeDown);
        I.d dVar = new I.d();
        I.g.a aVar = new I.g.a(takePhoto);
        aVar.b(dVar);
        I.g a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        i11.e0(a11, this.cameraExecutor, this.imageCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void capturePhoto$default(CameraFragment cameraFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        cameraFragment.capturePhoto(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void createVideoChunk() {
        W w11;
        File createChunkFile = getViewModel().createChunkFile();
        L80.a.a("VIDEO_FLOW", "createVideoOutputAndStart videoFile=" + createChunkFile.getName());
        r a11 = new r.a(createChunkFile).a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        f0<K> f0Var = this.videoCapture;
        if (f0Var != null) {
            C4851w C11 = f0Var.i0().C(requireContext(), a11);
            C11.a();
            w11 = C11.i(androidx.core.content.a.getMainExecutor(requireContext()), new InterfaceC10646a() { // from class: ru.ozon.fintech.features.camera.presentation.camera.b
                @Override // x2.InterfaceC10646a
                public final void accept(Object obj) {
                    CameraFragment.createVideoChunk$lambda$4(CameraFragment.this, (t0) obj);
                }
            });
        } else {
            w11 = null;
        }
        this.videoRecording = w11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createVideoChunk$lambda$4(CameraFragment cameraFragment, t0 t0Var) {
        L80.a.a("VIDEO_FLOW", "videoRecordEvent=" + t0Var);
        if (t0Var instanceof t0.a) {
            L80.a.a("VIDEO_FLOW", "videoRecordEvent Finalize");
            if (cameraFragment.andRestartVideo) {
                cameraFragment.createVideoChunk();
            }
            if (cameraFragment.andCombineChunks) {
                H30.k.a(new m0(cameraFragment, 6));
                return;
            }
            return;
        }
        if (t0Var instanceof t0.d) {
            L80.a.a("VIDEO_FLOW", "videoRecordEvent Start");
            return;
        }
        if (t0Var instanceof t0.c) {
            L80.a.a("VIDEO_FLOW", "videoRecordEvent Resume");
            return;
        }
        if (!(t0Var instanceof t0.e)) {
            if (t0Var instanceof t0.b) {
                L80.a.a("VIDEO_FLOW", "videoRecordEvent Pause");
                return;
            }
            return;
        }
        long c11 = ((t0.e) t0Var).b().c() / 1000000;
        L80.a.a("VIDEO_FLOW", "videoRecordEvent dur=" + c11);
        cameraFragment.getViewModel().setLastChunkDurationMs(c11);
        if (c11 > cameraFragment.getViewModel().getVideoChunkDurationMs()) {
            cameraFragment.videoRecordingStop(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createVideoChunk$lambda$4$lambda$3(CameraFragment cameraFragment) {
        cameraFragment.getViewModel().createCombinedLastChunks();
        return Unit.f71690a;
    }

    private final void enableCameraTorch(InterfaceC2689i cameraControl, boolean enable) {
        m<Void> e11 = cameraControl.e(enable);
        Intrinsics.checkNotNullExpressionValue(e11, "enableTorch(...)");
        com.google.common.util.concurrent.h.a(e11, this.torchCallback, this.cameraExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBarSize(String barName) {
        Integer valueOf = Integer.valueOf(getResources().getIdentifier(barName, "dimen", "android"));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return -1;
        }
        return getResources().getDimensionPixelSize(valueOf.intValue());
    }

    @NotNull
    public static final Bundle getBundle(@NotNull WorkingMode workingMode, @NotNull String str, @NotNull ScanAction scanAction, boolean z11, boolean z12, String str2, boolean z13, boolean z14, @NotNull String str3, String str4, String str5, String str6, List<String> list, String str7, boolean z15, Long l11, String str8, Boolean bool) {
        return INSTANCE.getBundle(workingMode, str, scanAction, z11, z12, str2, z13, z14, str3, str4, str5, str6, list, str7, z15, l11, str8, bool);
    }

    private final Q.b getQrResolutionSelector() {
        return (Q.b) this.qrResolutionSelector.getValue();
    }

    private final A getQualitySelector() {
        return (A) this.qualitySelector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraViewModel getViewModel() {
        return (CameraViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCameraActionsFlow(CameraActions action) {
        InterfaceC2688h interfaceC2688h;
        InterfaceC2689i a11;
        CameraViewLayoutBinding cameraViewLayoutBinding;
        ImageView imageView;
        CameraViewLayoutBinding cameraViewLayoutBinding2;
        ImageView imageView2;
        if (action instanceof CameraActions.ChangeCamera) {
            bindCameraUseCases$default(this, 0, 1, null);
            CameraFragmentBinding cameraFragmentBinding = this.binding;
            if (cameraFragmentBinding != null && (cameraViewLayoutBinding2 = cameraFragmentBinding.cameraLayout) != null && (imageView2 = cameraViewLayoutBinding2.ivFlash) != null) {
                imageView2.setVisibility(getViewModel().getIsBackCamera() ? 0 : 8);
            }
        } else if ((action instanceof CameraActions.Flash) && (interfaceC2688h = this.camera) != null && (a11 = interfaceC2688h.a()) != null) {
            enableCameraTorch(a11, ((CameraActions.Flash) action).getFlashViewType() == CameraActions.Flash.FlashViewType.FLASH_ON);
        }
        CameraFragmentBinding cameraFragmentBinding2 = this.binding;
        if (cameraFragmentBinding2 == null || (cameraViewLayoutBinding = cameraFragmentBinding2.cameraLayout) == null || (imageView = cameraViewLayoutBinding.ivFlash) == null) {
            return;
        }
        imageView.setColorFilter(this.iconColor, PorterDuff.Mode.SRC_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCameraViewStateFlow(State state) {
        CameraFragmentBinding cameraFragmentBinding;
        Window window;
        Window window2;
        if (state instanceof State.CameraPreview) {
            final CameraFragmentBinding cameraFragmentBinding2 = this.binding;
            if (cameraFragmentBinding2 != null) {
                ConstraintLayout cameraContainer = cameraFragmentBinding2.cameraLayout.cameraContainer;
                Intrinsics.checkNotNullExpressionValue(cameraContainer, "cameraContainer");
                z.b(this.shortAnimationDuration, cameraContainer);
                ConstraintLayout confirmContainer = cameraFragmentBinding2.confirmLayout.confirmContainer;
                Intrinsics.checkNotNullExpressionValue(confirmContainer, "confirmContainer");
                z.c(this.shortAnimationDuration, confirmContainer);
                State.CameraPreview cameraPreview = (State.CameraPreview) state;
                switch (WhenMappings.$EnumSwitchMapping$1[cameraPreview.getWorkingMode().ordinal()]) {
                    case 1:
                    case 2:
                        androidx.fragment.app.r activity = getActivity();
                        if (activity != null && (window = activity.getWindow()) != null) {
                            u.e(window);
                        }
                        QrScannerView qrView = cameraFragmentBinding2.cameraLayout.qrView;
                        Intrinsics.checkNotNullExpressionValue(qrView, "qrView");
                        qrView.setVisibility(8);
                        ImageView ivCloseCamera = cameraFragmentBinding2.cameraLayout.ivCloseCamera;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCamera, "ivCloseCamera");
                        ivCloseCamera.setVisibility(0);
                        ImageView ivCloseCameraConfirm = cameraFragmentBinding2.confirmLayout.ivCloseCameraConfirm;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCameraConfirm, "ivCloseCameraConfirm");
                        ivCloseCameraConfirm.setVisibility(0);
                        cameraFragmentBinding2.cameraLayout.documentFrame.setRegistrationFormat(cameraPreview.getWorkingMode() == WorkingMode.REGISTRATION);
                        if (getViewModel().getIsNeedSelfieDocumentFrame()) {
                            DocFrameView documentFrame = cameraFragmentBinding2.cameraLayout.documentFrame;
                            Intrinsics.checkNotNullExpressionValue(documentFrame, "documentFrame");
                            documentFrame.setVisibility(8);
                            cameraFragmentBinding2.cameraLayout.selfieDocumentFrame.setRoundFace(getViewModel().getRoundFaceFrameEnabled());
                            SelfieDocFrameView selfieDocumentFrame = cameraFragmentBinding2.cameraLayout.selfieDocumentFrame;
                            Intrinsics.checkNotNullExpressionValue(selfieDocumentFrame, "selfieDocumentFrame");
                            z.b(this.shortAnimationDuration, selfieDocumentFrame);
                            final ConstraintLayout constraintLayout = cameraFragmentBinding2.cameraLayout.getConstraintLayout();
                            constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$handleCameraViewStateFlow$lambda$52$$inlined$afterMeasured$2
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    if (constraintLayout.getMeasuredWidth() <= 0 || constraintLayout.getMeasuredHeight() <= 0) {
                                        return;
                                    }
                                    constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    this.updateGuideLinePosition(0.12f);
                                }
                            });
                        } else {
                            SelfieDocFrameView selfieDocumentFrame2 = cameraFragmentBinding2.cameraLayout.selfieDocumentFrame;
                            Intrinsics.checkNotNullExpressionValue(selfieDocumentFrame2, "selfieDocumentFrame");
                            selfieDocumentFrame2.setVisibility(8);
                            DocFrameView documentFrame2 = cameraFragmentBinding2.cameraLayout.documentFrame;
                            Intrinsics.checkNotNullExpressionValue(documentFrame2, "documentFrame");
                            z.b(this.shortAnimationDuration, documentFrame2);
                            final ConstraintLayout constraintLayout2 = cameraFragmentBinding2.cameraLayout.getConstraintLayout();
                            constraintLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$handleCameraViewStateFlow$lambda$52$$inlined$afterMeasured$1
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    if (constraintLayout2.getMeasuredWidth() <= 0 || constraintLayout2.getMeasuredHeight() <= 0) {
                                        return;
                                    }
                                    constraintLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    this.updateGuideLinePosition(cameraFragmentBinding2.cameraLayout.documentFrame.getDocFrameAreaRect().top / cameraFragmentBinding2.cameraLayout.getConstraintLayout().getHeight());
                                }
                            });
                        }
                        updatePreviewBias(cameraPreview.getPreviewCameraTitleBias());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        boolean z11 = getViewModel().getScanAction() != ScanAction.PHOTO;
                        androidx.fragment.app.r activity2 = getActivity();
                        if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                            u.e(window2);
                        }
                        DocFrameView documentFrame3 = cameraFragmentBinding2.cameraLayout.documentFrame;
                        Intrinsics.checkNotNullExpressionValue(documentFrame3, "documentFrame");
                        documentFrame3.setVisibility(8);
                        SelfieDocFrameView selfieDocumentFrame3 = cameraFragmentBinding2.cameraLayout.selfieDocumentFrame;
                        Intrinsics.checkNotNullExpressionValue(selfieDocumentFrame3, "selfieDocumentFrame");
                        selfieDocumentFrame3.setVisibility(8);
                        QrScannerView qrView2 = cameraFragmentBinding2.cameraLayout.qrView;
                        Intrinsics.checkNotNullExpressionValue(qrView2, "qrView");
                        z.b(this.shortAnimationDuration, qrView2);
                        ImageButton captureButton = cameraFragmentBinding2.cameraLayout.captureButton;
                        Intrinsics.checkNotNullExpressionValue(captureButton, "captureButton");
                        captureButton.setVisibility(!z11 ? 0 : 8);
                        ImageView ivChangeCamera = cameraFragmentBinding2.cameraLayout.ivChangeCamera;
                        Intrinsics.checkNotNullExpressionValue(ivChangeCamera, "ivChangeCamera");
                        ivChangeCamera.setVisibility(8);
                        ImageView ivGalleryScan = cameraFragmentBinding2.cameraLayout.ivGalleryScan;
                        Intrinsics.checkNotNullExpressionValue(ivGalleryScan, "ivGalleryScan");
                        ivGalleryScan.setVisibility((z11 && getViewModel().isGalleryAllow()) ? 0 : 8);
                        ImageView ivCloseScan = cameraFragmentBinding2.cameraLayout.ivCloseScan;
                        Intrinsics.checkNotNullExpressionValue(ivCloseScan, "ivCloseScan");
                        ivCloseScan.setVisibility(z11 ? 0 : 8);
                        ImageView ivCloseCamera2 = cameraFragmentBinding2.cameraLayout.ivCloseCamera;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCamera2, "ivCloseCamera");
                        ivCloseCamera2.setVisibility(!z11 ? 0 : 8);
                        ImageView ivCloseCameraConfirm2 = cameraFragmentBinding2.confirmLayout.ivCloseCameraConfirm;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCameraConfirm2, "ivCloseCameraConfirm");
                        ivCloseCameraConfirm2.setVisibility(z11 ? 8 : 0);
                        final ConstraintLayout constraintLayout3 = cameraFragmentBinding2.cameraLayout.getConstraintLayout();
                        constraintLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$handleCameraViewStateFlow$lambda$52$$inlined$afterMeasured$3
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                if (constraintLayout3.getMeasuredWidth() <= 0 || constraintLayout3.getMeasuredHeight() <= 0) {
                                    return;
                                }
                                constraintLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                this.updateGuideLinePosition(cameraFragmentBinding2.cameraLayout.qrView.getScannerAreaRectFinish().top / cameraFragmentBinding2.cameraLayout.getConstraintLayout().getHeight());
                            }
                        });
                        updatePreviewBias(cameraPreview.getPreviewCameraTitleBias());
                        break;
                    case 6:
                        QrScannerView qrView3 = cameraFragmentBinding2.cameraLayout.qrView;
                        Intrinsics.checkNotNullExpressionValue(qrView3, "qrView");
                        qrView3.setVisibility(8);
                        DocFrameView documentFrame4 = cameraFragmentBinding2.cameraLayout.documentFrame;
                        Intrinsics.checkNotNullExpressionValue(documentFrame4, "documentFrame");
                        documentFrame4.setVisibility(8);
                        SelfieDocFrameView selfieDocumentFrame4 = cameraFragmentBinding2.cameraLayout.selfieDocumentFrame;
                        Intrinsics.checkNotNullExpressionValue(selfieDocumentFrame4, "selfieDocumentFrame");
                        selfieDocumentFrame4.setVisibility(8);
                        updatePreviewBias(cameraPreview.getPreviewCameraTitleBias());
                        break;
                    case 7:
                        QrScannerView qrView4 = cameraFragmentBinding2.cameraLayout.qrView;
                        Intrinsics.checkNotNullExpressionValue(qrView4, "qrView");
                        qrView4.setVisibility(8);
                        DocFrameView documentFrame5 = cameraFragmentBinding2.cameraLayout.documentFrame;
                        Intrinsics.checkNotNullExpressionValue(documentFrame5, "documentFrame");
                        documentFrame5.setVisibility(8);
                        SelfieDocFrameView selfieDocumentFrame5 = cameraFragmentBinding2.cameraLayout.selfieDocumentFrame;
                        Intrinsics.checkNotNullExpressionValue(selfieDocumentFrame5, "selfieDocumentFrame");
                        selfieDocumentFrame5.setVisibility(8);
                        ImageButton captureButton2 = cameraFragmentBinding2.cameraLayout.captureButton;
                        Intrinsics.checkNotNullExpressionValue(captureButton2, "captureButton");
                        captureButton2.setVisibility(8);
                        ImageView ivChangeCamera2 = cameraFragmentBinding2.cameraLayout.ivChangeCamera;
                        Intrinsics.checkNotNullExpressionValue(ivChangeCamera2, "ivChangeCamera");
                        ivChangeCamera2.setVisibility(8);
                        ImageView ivGalleryScan2 = cameraFragmentBinding2.cameraLayout.ivGalleryScan;
                        Intrinsics.checkNotNullExpressionValue(ivGalleryScan2, "ivGalleryScan");
                        ivGalleryScan2.setVisibility(8);
                        ImageView ivCloseScan2 = cameraFragmentBinding2.cameraLayout.ivCloseScan;
                        Intrinsics.checkNotNullExpressionValue(ivCloseScan2, "ivCloseScan");
                        ivCloseScan2.setVisibility(0);
                        ImageView ivCloseCamera3 = cameraFragmentBinding2.cameraLayout.ivCloseCamera;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCamera3, "ivCloseCamera");
                        ivCloseCamera3.setVisibility(8);
                        ImageView ivCloseCameraConfirm3 = cameraFragmentBinding2.confirmLayout.ivCloseCameraConfirm;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCameraConfirm3, "ivCloseCameraConfirm");
                        ivCloseCameraConfirm3.setVisibility(8);
                        PhoneFrameView phoneView = cameraFragmentBinding2.cameraLayout.phoneView;
                        Intrinsics.checkNotNullExpressionValue(phoneView, "phoneView");
                        z.b(this.shortAnimationDuration, phoneView);
                        final ConstraintLayout constraintLayout4 = cameraFragmentBinding2.cameraLayout.getConstraintLayout();
                        constraintLayout4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$handleCameraViewStateFlow$lambda$52$$inlined$afterMeasured$4
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                if (constraintLayout4.getMeasuredWidth() <= 0 || constraintLayout4.getMeasuredHeight() <= 0) {
                                    return;
                                }
                                constraintLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                this.updateGuideLinePosition(cameraFragmentBinding2.cameraLayout.phoneView.getScannerAreaRectFinish().top / cameraFragmentBinding2.cameraLayout.getConstraintLayout().getHeight());
                            }
                        });
                        updatePreviewBias(cameraPreview.getPreviewCameraTitleBias());
                        break;
                    case 8:
                        QrScannerView qrView5 = cameraFragmentBinding2.cameraLayout.qrView;
                        Intrinsics.checkNotNullExpressionValue(qrView5, "qrView");
                        qrView5.setVisibility(8);
                        DocFrameView documentFrame6 = cameraFragmentBinding2.cameraLayout.documentFrame;
                        Intrinsics.checkNotNullExpressionValue(documentFrame6, "documentFrame");
                        documentFrame6.setVisibility(8);
                        SelfieDocFrameView selfieDocumentFrame6 = cameraFragmentBinding2.cameraLayout.selfieDocumentFrame;
                        Intrinsics.checkNotNullExpressionValue(selfieDocumentFrame6, "selfieDocumentFrame");
                        selfieDocumentFrame6.setVisibility(8);
                        ImageButton captureButton3 = cameraFragmentBinding2.cameraLayout.captureButton;
                        Intrinsics.checkNotNullExpressionValue(captureButton3, "captureButton");
                        captureButton3.setVisibility(8);
                        ImageView ivChangeCamera3 = cameraFragmentBinding2.cameraLayout.ivChangeCamera;
                        Intrinsics.checkNotNullExpressionValue(ivChangeCamera3, "ivChangeCamera");
                        ivChangeCamera3.setVisibility(8);
                        ImageView ivGalleryScan3 = cameraFragmentBinding2.cameraLayout.ivGalleryScan;
                        Intrinsics.checkNotNullExpressionValue(ivGalleryScan3, "ivGalleryScan");
                        ivGalleryScan3.setVisibility(8);
                        ImageView ivCloseScan3 = cameraFragmentBinding2.cameraLayout.ivCloseScan;
                        Intrinsics.checkNotNullExpressionValue(ivCloseScan3, "ivCloseScan");
                        ivCloseScan3.setVisibility(0);
                        ImageView ivCloseCamera4 = cameraFragmentBinding2.cameraLayout.ivCloseCamera;
                        Intrinsics.checkNotNullExpressionValue(ivCloseCamera4, "ivCloseCamera");
                        ivCloseCamera4.setVisibility(8);
                        PhoneFrameView phoneView2 = cameraFragmentBinding2.cameraLayout.phoneView;
                        Intrinsics.checkNotNullExpressionValue(phoneView2, "phoneView");
                        z.b(this.shortAnimationDuration, phoneView2);
                        final ConstraintLayout constraintLayout5 = cameraFragmentBinding2.cameraLayout.getConstraintLayout();
                        constraintLayout5.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$handleCameraViewStateFlow$lambda$52$$inlined$afterMeasured$5
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                if (constraintLayout5.getMeasuredWidth() <= 0 || constraintLayout5.getMeasuredHeight() <= 0) {
                                    return;
                                }
                                constraintLayout5.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                this.updateGuideLinePosition(cameraFragmentBinding2.cameraLayout.phoneView.getScannerAreaRectFinish().top / cameraFragmentBinding2.cameraLayout.getConstraintLayout().getHeight());
                            }
                        });
                        updatePreviewBias(cameraPreview.getPreviewCameraTitleBias());
                        break;
                    default:
                        throw new o();
                }
                if (cameraPreview.getPreviewCameraTitle().length() > 0) {
                    TextView previewTitle = cameraFragmentBinding2.cameraLayout.previewTitle;
                    Intrinsics.checkNotNullExpressionValue(previewTitle, "previewTitle");
                    previewTitle.setVisibility(0);
                    cameraFragmentBinding2.cameraLayout.previewTitle.setText(cameraPreview.getPreviewCameraTitle());
                }
            }
        } else if ((state instanceof State.NeedConfirm) && (cameraFragmentBinding = this.binding) != null) {
            State.NeedConfirm needConfirm = (State.NeedConfirm) state;
            com.bumptech.glide.c.m(this).load(needConfirm.getPhotoFileUri()).into(cameraFragmentBinding.confirmLayout.photoView);
            if (needConfirm.getTitleText().length() > 0) {
                TextView textView = cameraFragmentBinding.confirmLayout.confirmTitle;
                textView.setText(needConfirm.getTitleText());
                z.b(this.shortAnimationDuration, textView);
            }
            ConstraintLayout cameraContainer2 = cameraFragmentBinding.cameraLayout.cameraContainer;
            Intrinsics.checkNotNullExpressionValue(cameraContainer2, "cameraContainer");
            z.c(this.shortAnimationDuration, cameraContainer2);
            ConstraintLayout confirmContainer2 = cameraFragmentBinding.confirmLayout.confirmContainer;
            Intrinsics.checkNotNullExpressionValue(confirmContainer2, "confirmContainer");
            z.b(this.shortAnimationDuration, confirmContainer2);
        }
        getViewModel().sendViewStateAnalytics(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFlashClick() {
        InterfaceC2694n b11;
        InterfaceC2688h interfaceC2688h = this.camera;
        if (interfaceC2688h == null || (b11 = interfaceC2688h.b()) == null || !b11.k()) {
            return;
        }
        getViewModel().flashClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePermissionActionFlow(AbstractC9781a action) {
        if (action != null) {
            if (!(action instanceof AbstractC9781a.b)) {
                if (!(action instanceof AbstractC9781a.C2181a)) {
                    throw new o();
                }
                requireContext().startActivity(((AbstractC9781a.C2181a) action).a());
            } else {
                List<InterfaceC9636e> a11 = ((AbstractC9781a.b) action).a();
                ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                Iterator<T> it = a11.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC9636e) it.next()).a());
                }
                requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePermissionViewStateFlow(C9987a permissionsScreenState) {
        PermissionsScreenStateView permissionsScreenStateView;
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding == null || (permissionsScreenStateView = cameraFragmentBinding.permissionsScreenState) == null) {
            return;
        }
        permissionsScreenStateView.setVisibility(permissionsScreenState != null ? 0 : 8);
        if (permissionsScreenState != null) {
            permissionsScreenStateView.c(permissionsScreenState);
            permissionsScreenStateView.expand();
        }
    }

    private final boolean hasBackCamera() {
        g gVar = this.cameraProvider;
        if (gVar == null) {
            return false;
        }
        C2697q DEFAULT_BACK_CAMERA = C2697q.f4215c;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
        return gVar.h(DEFAULT_BACK_CAMERA);
    }

    private final boolean hasFrontCamera() {
        g gVar = this.cameraProvider;
        if (gVar == null) {
            return false;
        }
        C2697q DEFAULT_FRONT_CAMERA = C2697q.f4214b;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
        return gVar.h(DEFAULT_FRONT_CAMERA);
    }

    private final void hideSystemBarUi() {
        int barSize;
        if (!this.isCameraNotUnderSystemBars) {
            CameraFragmentBinding cameraFragmentBinding = this.binding;
            if (cameraFragmentBinding == null || (barSize = getBarSize(NAVIGATION_BAR)) <= 0) {
                return;
            }
            cameraFragmentBinding.permissionsScreenState.setPadding(0, 0, 0, barSize);
            cameraFragmentBinding.scannerError.setPadding(0, 0, 0, barSize);
            return;
        }
        Window window = requireActivity().getWindow();
        this.savedSystemBarColor = window.getStatusBarColor();
        this.savedNavBarColor = window.getNavigationBarColor();
        int color = androidx.core.content.a.getColor(requireContext(), R.color.fintech_camera_black_color);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8209));
    }

    private final void initImageCaptureButton(CameraFragmentBinding binding) {
        ImageButton imageButton = binding.cameraLayout.captureButton;
        imageButton.setActivated(true);
        imageButton.setOnClickListener(new CC.a(this, 15));
    }

    @NotNull
    public static final CameraFragment newInstance(@NotNull WorkingMode workingMode, @NotNull String str, @NotNull ScanAction scanAction, boolean z11, String str2, boolean z12, boolean z13, boolean z14, @NotNull String str3, String str4, String str5, String str6, List<String> list, String str7, boolean z15, Long l11, String str8, Boolean bool) {
        return INSTANCE.newInstance(workingMode, str, scanAction, z11, str2, z12, z13, z14, str3, str4, str5, str6, list, str7, z15, l11, str8, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$27$lambda$11$lambda$10(CameraFragment cameraFragment, View view) {
        CameraViewModel.closeByUser$default(cameraFragment.getViewModel(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$27$lambda$19$lambda$13(CameraFragment cameraFragment, View view) {
        if (cameraFragment.imageCapture != null) {
            cameraFragment.getViewModel().changeCamera();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$27$lambda$19$lambda$14(CameraFragment cameraFragment, View view) {
        CameraViewModel.closeByUser$default(cameraFragment.getViewModel(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$27$lambda$19$lambda$16(CameraFragment cameraFragment, View view) {
        CameraViewModel.closeByUser$default(cameraFragment.getViewModel(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$27$lambda$19$lambda$17(CameraFragment cameraFragment, View view) {
        cameraFragment.getViewModel().openGalleryClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$27$lambda$19$lambda$18(CameraFragment cameraFragment, View view) {
        cameraFragment.getViewModel().qrButtonTextClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 onViewCreated$lambda$27$lambda$26(View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q.b qrResolutionSelector_delegate$lambda$1(CameraFragment cameraFragment) {
        b.a aVar = new b.a();
        aVar.f(new Q.c(new Size(cameraFragment.getViewModel().getMobScannerConfig().getMaxSize(), cameraFragment.getViewModel().getMobScannerConfig().getMaxSize()), 4));
        aVar.c(1);
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A qualitySelector_delegate$lambda$2(CameraFragment cameraFragment) {
        return A.a(cameraFragment.getViewModel().getVideoQualityParsed(), C4845p.a(cameraFragment.getViewModel().getVideoQualityParsed()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocFrameOrientation resolveOrientation(int angle, DocFrameOrientation current) {
        int i11 = WhenMappings.$EnumSwitchMapping$2[current.ordinal()];
        if (i11 == 1) {
            return ((60 > angle || angle >= 121) && (240 > angle || angle >= 301)) ? DocFrameOrientation.PORTRAIT : DocFrameOrientation.LANDSCAPE;
        }
        if (i11 == 2) {
            return ((angle < 0 || angle >= 31) && (330 > angle || angle >= 360) && (150 > angle || angle >= 211)) ? DocFrameOrientation.LANDSCAPE : DocFrameOrientation.PORTRAIT;
        }
        throw new o();
    }

    private final void returnSystemBarUi() {
        Window window;
        if (!this.isCameraNotUnderSystemBars || (window = requireActivity().getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(this.savedSystemBarColor);
        window.setNavigationBarColor(this.savedNavBarColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scaleZoom(float scaleFactor) {
        InterfaceC2688h interfaceC2688h;
        InterfaceC2689i a11;
        float f7 = scaleFactor < 1.0f ? (1 - scaleFactor) * (-1) : scaleFactor - 1;
        if (f7 < 0.0f || f7 > 1.0f || (interfaceC2688h = this.camera) == null || (a11 = interfaceC2688h.a()) == null) {
            return;
        }
        a11.a(f7);
    }

    private final void setUpCamera() {
        int i11 = g.f27884i;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        m a11 = g.a.a(requireContext);
        ((I.d) a11).a(new Dx.a(2, this, a11), androidx.core.content.a.getMainExecutor(requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUpCamera$lambda$58(CameraFragment cameraFragment, m mVar) {
        boolean z11;
        try {
            cameraFragment.cameraProvider = (g) mVar.get();
            CameraViewModel viewModel = cameraFragment.getViewModel();
            if (cameraFragment.getViewModel().getIsBackCamera() && cameraFragment.hasBackCamera()) {
                z11 = true;
            } else {
                if (cameraFragment.getViewModel().getIsBackCamera() || !cameraFragment.hasFrontCamera()) {
                    L80.a.b(TAG, "Задняя и передняя камеры недоступны");
                }
                z11 = false;
            }
            viewModel.setBackCamera(z11);
            cameraFragment.updateCameraSwitchButton();
            bindCameraUseCases$default(cameraFragment, 0, 1, null);
        } catch (Exception e11) {
            L80.a.c("CameraFragment#cameraProviderFuture.get(): ", null, e11);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setupFocusOnTap() {
        CameraViewLayoutBinding cameraViewLayoutBinding;
        PreviewView previewView;
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding == null || (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) == null || (previewView = cameraViewLayoutBinding.cameraView) == null) {
            return;
        }
        previewView.setOnTouchListener(new FY.c(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupFocusOnTap$lambda$87$lambda$86(CameraFragment cameraFragment, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = cameraFragment.tapDetector;
        if (gestureDetector == null) {
            Intrinsics.n("tapDetector");
            throw null;
        }
        gestureDetector.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = cameraFragment.scaleDetector;
        if (scaleGestureDetector != null) {
            return scaleGestureDetector.onTouchEvent(motionEvent);
        }
        Intrinsics.n("scaleDetector");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAutoFocus() {
        InterfaceC2689i a11;
        U b11 = new e0(1.0f, 1.0f).b(0.5f, 0.5f);
        Intrinsics.checkNotNullExpressionValue(b11, "createPoint(...)");
        C.a aVar = new C.a(b11);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.d();
        C.C a12 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a12, "build(...)");
        InterfaceC2688h interfaceC2688h = this.camera;
        if (interfaceC2688h == null || (a11 = interfaceC2688h.a()) == null) {
            return;
        }
        a11.f(a12);
    }

    private final void stopCameraBinding() {
        try {
            int i11 = g.f27884i;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            m a11 = g.a.a(requireContext);
            I.d dVar = (I.d) a11;
            if (dVar.isDone() || dVar.isCancelled()) {
                return;
            }
            a11.cancel(true);
        } catch (Exception e11) {
            L80.a.c(TAG, "Ошибка при попытке стопнуть ProcessCameraProvider", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeKeyEventListener(boolean subscribe) {
        E30.a aVar;
        boolean z11 = !getViewModel().isQrScannerFlow() || getViewModel().getScanAction() == ScanAction.PHOTO;
        if (subscribe && z11) {
            androidx.fragment.app.r activity = getActivity();
            aVar = activity instanceof E30.a ? (E30.a) activity : null;
            if (aVar != null) {
                aVar.K(this);
                return;
            }
            return;
        }
        if (subscribe || !z11) {
            return;
        }
        androidx.fragment.app.r activity2 = getActivity();
        aVar = activity2 instanceof E30.a ? (E30.a) activity2 : null;
        if (aVar != null) {
            aVar.L(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchSelfieDocFrame(DocFrameOrientation orientation) {
        CameraViewLayoutBinding cameraViewLayoutBinding;
        SelfieDocFrameView selfieDocFrameView;
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding == null || (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) == null || (selfieDocFrameView = cameraViewLayoutBinding.selfieDocumentFrame) == null) {
            return;
        }
        selfieDocFrameView.setOrientation(orientation);
    }

    private final void updateBottomMargin(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        view.setLayoutParams(bVar);
    }

    private final void updateCameraSwitchButton() {
        CameraViewLayoutBinding cameraViewLayoutBinding;
        ImageView imageView;
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding == null || (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) == null || (imageView = cameraViewLayoutBinding.ivChangeCamera) == null) {
            return;
        }
        imageView.setEnabled(hasBackCamera() && hasFrontCamera());
    }

    private final void updateCloseButtonMargin() {
        int g10 = this.isCameraNotUnderSystemBars ? f.g() : j.d() + f.g();
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding != null) {
            ImageView ivCloseCamera = cameraFragmentBinding.cameraLayout.ivCloseCamera;
            Intrinsics.checkNotNullExpressionValue(ivCloseCamera, "ivCloseCamera");
            updateTopMargin(ivCloseCamera, g10);
            ImageView ivCloseCameraConfirm = cameraFragmentBinding.confirmLayout.ivCloseCameraConfirm;
            Intrinsics.checkNotNullExpressionValue(ivCloseCameraConfirm, "ivCloseCameraConfirm");
            updateTopMargin(ivCloseCameraConfirm, g10);
        }
    }

    private final void updateConfirmButtonsMargin() {
        int g10 = this.isCameraNotUnderSystemBars ? f.g() : j.c();
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding != null) {
            FinLargeButtonView retakeButton = cameraFragmentBinding.confirmLayout.retakeButton;
            Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
            updateBottomMargin(retakeButton, g10);
            FinLargeButtonView confirmButton = cameraFragmentBinding.confirmLayout.confirmButton;
            Intrinsics.checkNotNullExpressionValue(confirmButton, "confirmButton");
            updateBottomMargin(confirmButton, g10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGuideLinePosition(float percent) {
        CameraViewLayoutBinding cameraViewLayoutBinding;
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding == null || (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) == null) {
            return;
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(cameraViewLayoutBinding.getConstraintLayout());
        dVar.b0(percent, R.id.qr_frame_up_guideline);
        dVar.f(cameraViewLayoutBinding.getConstraintLayout());
    }

    private final void updatePreviewBias(float newBias) {
        CameraViewLayoutBinding cameraViewLayoutBinding;
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding == null || (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) == null) {
            return;
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(cameraViewLayoutBinding.getConstraintLayout());
        dVar.f0(newBias, R.id.preview_title);
        dVar.f(cameraViewLayoutBinding.getConstraintLayout());
    }

    private final void updateTopMargin(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        view.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void videoRecordingStop(boolean andRestartVideo, boolean andCombineChunks) {
        this.andRestartVideo = andRestartVideo;
        this.andCombineChunks = andCombineChunks;
        W w11 = this.videoRecording;
        if (w11 != null) {
            w11.close();
        }
        W w12 = this.videoRecording;
        if (w12 != null) {
            w12.close();
        }
        this.videoRecording = null;
    }

    @NotNull
    public final T30.c getExecutorProvider$camera_prodRelease() {
        T30.c cVar = this.executorProvider;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("executorProvider");
        throw null;
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public String getF96590a() {
        return this.fragmentName;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @InterfaceC3999a
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        getViewModel().onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((CameraComponent) O30.a.a(O30.c.a(requireActivity)).a(CameraApi.class)).inject(this);
        super.onAttach(context);
        this.shortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.focusCircleView = new FeedbackCircleView(requireContext, null, 0, 6, null);
        this.tapDetector = new GestureDetector(requireContext(), this.tapGestureDetectorListener);
        this.scaleDetector = new ScaleGestureDetector(requireContext(), this.scaleGestureDetectorListener);
        this.iconColor = androidx.core.content.a.getColor(requireContext(), R.color.oz_white_1);
        Bundle arguments = getArguments();
        if (arguments != null) {
            CameraViewModel viewModel = getViewModel();
            Serializable serializable = arguments.getSerializable(WORKING_MODE);
            Intrinsics.g(serializable, "null cannot be cast to non-null type ru.ozon.fintech.features.camera.presentation.camera.CameraFragment.WorkingMode");
            WorkingMode workingMode = (WorkingMode) serializable;
            String string = arguments.getString(CONFIRM_TITLE_KEY, "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            boolean z11 = arguments.getBoolean(QR_CONFIRM_DIALOG, false);
            boolean z12 = arguments.getBoolean(QR_DETECT_AUTOCLOSE, true);
            String string2 = arguments.getString(FOR_UNIQUE_UUID);
            Serializable serializable2 = arguments.getSerializable(SCAN_ACTION);
            ScanAction scanAction = serializable2 instanceof ScanAction ? (ScanAction) serializable2 : null;
            if (scanAction == null) {
                scanAction = ScanAction.TRY_TO_GO_TO;
            }
            boolean z13 = arguments.getBoolean(IS_BACK_CAMERA_KEY, true);
            String string3 = arguments.getString(PREVIEW_CAMERA_TITLE_KEY, "");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = arguments.getString(TIPS_OPTIONS_ELEMENTS, null);
            String string5 = arguments.getString(TIPS_OPTIONS_TYPE, null);
            String string6 = arguments.getString(PHONE_REGEX, null);
            String[] stringArray = arguments.getStringArray(BARCODE_FORMATS);
            List<String> f02 = stringArray != null ? C7705l.f0(stringArray) : null;
            ScanAction scanAction2 = scanAction;
            String uniqueUuid = getUniqueUuid();
            String string7 = arguments.getString(QR_BUTTON_TEXT, null);
            boolean z14 = arguments.getBoolean(VIDEO_ENABLED, false);
            long j11 = arguments.getLong(VIDEO_CHUNK_DURATION_MS, 5000L);
            String string8 = arguments.getString(VIDEO_QUALITY, "HD");
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            viewModel.onCreate(workingMode, string, scanAction2, z11, z12, z13, string2, string3, string4, string5, string6, f02, uniqueUuid, string7, z14, j11, string8, arguments.getBoolean(ROUND_FACE_FRAME_ENABLED, false));
            getViewModel().resetChunkFiles();
            getViewModel().resetCombinedFile();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        CameraFragmentBinding inflate = CameraFragmentBinding.inflate(inflater, container, false);
        this.binding = inflate;
        FrameLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        this.cameraExecutor.shutdown();
        getViewModel().resetChunkFiles();
        this.focusCircleView = null;
        getViewModel().getBarCodeAnalyzer().setPreview(null);
        getViewModel().getBarCodeAnalyzer().setBoxRect(null);
        getViewModel().getPhoneNumberAnalyzer().setPreview(null);
        getViewModel().getPhoneNumberAnalyzer().setBoxRect(null);
        getViewModel().getBankCardAnalyzer().setPreview(null);
        getViewModel().getBankCardAnalyzer().setBoxRect(null);
        getViewModel().onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        Window window;
        CameraFragmentBinding cameraFragmentBinding;
        CameraViewLayoutBinding cameraViewLayoutBinding;
        PreviewView previewView;
        remove();
        CameraViewModel viewModel = getViewModel();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onDestroyView(requireActivity);
        if (!getViewModel().isQrScannerFlow() && (cameraFragmentBinding = this.binding) != null && (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) != null && (previewView = cameraViewLayoutBinding.cameraView) != null) {
            previewView.removeView(this.focusCircleView);
        }
        androidx.fragment.app.r activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            u.d(window);
        }
        stopCameraBinding();
        returnSystemBarUi();
        this.binding = null;
        this.orientationEventListener = null;
        super.onDestroyView();
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View p02, int keyCode, KeyEvent p22) {
        if (keyCode == 24 || keyCode == 25) {
            capturePhoto(true);
        }
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @InterfaceC3999a
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        CameraViewModel viewModel = getViewModel();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        CameraViewModel viewModel = getViewModel();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onPermissionResumeOrResult(requireActivity);
        getViewModel().resetQrData();
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        getViewModel().onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        getViewModel().onStop();
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.backCallback);
        final Context requireContext = requireContext();
        this.orientationEventListener = new OrientationEventListener(requireContext) { // from class: ru.ozon.fintech.features.camera.presentation.camera.CameraFragment$onViewCreated$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int angle) {
                int i11;
                DocFrameOrientation docFrameOrientation;
                DocFrameOrientation resolveOrientation;
                DocFrameOrientation docFrameOrientation2;
                CameraViewModel viewModel;
                if (angle == -1) {
                    return;
                }
                i11 = CameraFragment.this.lastAngle;
                if (Math.abs(angle - i11) < 3) {
                    return;
                }
                CameraFragment.this.lastAngle = angle;
                CameraFragment cameraFragment = CameraFragment.this;
                docFrameOrientation = cameraFragment.currentOrientation;
                resolveOrientation = cameraFragment.resolveOrientation(angle, docFrameOrientation);
                docFrameOrientation2 = CameraFragment.this.currentOrientation;
                if (resolveOrientation != docFrameOrientation2) {
                    CameraFragment.this.currentOrientation = resolveOrientation;
                    viewModel = CameraFragment.this.getViewModel();
                    viewModel.onOrientationChanged(resolveOrientation);
                }
            }
        };
        setUpCamera();
        hideSystemBarUi();
        CameraViewModel viewModel = getViewModel();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onCreateView(requireActivity);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$1(this, getViewModel().getStartVideoFlow(), null, this), 3);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$2(this, getViewModel().getScreenStateFlow(), null, this), 3);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$3(this, getViewModel().getOrientationFlow(), null, this), 3);
        CameraFragmentBinding cameraFragmentBinding = this.binding;
        if (cameraFragmentBinding != null) {
            cameraFragmentBinding.confirmLayout.ivCloseCameraConfirm.setOnClickListener(new CD.a(this, 9));
            CameraViewLayoutBinding cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout;
            cameraViewLayoutBinding.ivChangeCamera.setOnClickListener(new Dc0.m(this, 18));
            cameraViewLayoutBinding.ivChangeCamera.setEnabled(false);
            cameraViewLayoutBinding.ivCloseCamera.setOnClickListener(new Dc0.n(this, 19));
            ImageView imageView = cameraViewLayoutBinding.ivCloseCamera;
            int i11 = this.iconColor;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(i11, mode);
            cameraViewLayoutBinding.ivGalleryScan.setColorFilter(this.iconColor, mode);
            cameraViewLayoutBinding.ivChangeCamera.setColorFilter(this.iconColor, mode);
            cameraViewLayoutBinding.ivCloseScan.setColorFilter(this.iconColor, mode);
            cameraViewLayoutBinding.ivFlash.setOnClickListener(new CG.a(this, 16));
            cameraViewLayoutBinding.ivFlash.setColorFilter(this.iconColor, mode);
            ImageView ivFlash = cameraViewLayoutBinding.ivFlash;
            Intrinsics.checkNotNullExpressionValue(ivFlash, "ivFlash");
            ivFlash.setVisibility(getViewModel().getIsBackCamera() ? 0 : 8);
            cameraViewLayoutBinding.ivCloseScan.setOnClickListener(new CG.b(this, 20));
            cameraViewLayoutBinding.ivGalleryScan.setOnClickListener(new FX.a(this, 12));
            cameraViewLayoutBinding.tvQrButton.setOnClickListener(new OD.a(this, 8));
            updateCloseButtonMargin();
            updateConfirmButtonsMargin();
            initImageCaptureButton(cameraFragmentBinding);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$lambda$27$$inlined$observe$1(this, getViewModel().getPermissionAction(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$lambda$27$$inlined$observe$2(this, getViewModel().getPermissionScreenState(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$lambda$27$$inlined$observe$3(this, getViewModel().getViewState(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$lambda$27$$inlined$observe$4(this, getViewModel().getCameraActions(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$lambda$27$$inlined$observe$5(this, getViewModel().getQrBorderPhotoAction(), null, this), 3);
            C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$lambda$27$$inlined$observe$6(this, getViewModel().getQrChooserAction(), null, this), 3);
            androidx.core.view.Y.J(cameraFragmentBinding.getConstraintLayout(), new C2639a());
        }
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$4(this, getViewModel().getSubscribeKeyEventState(), null, this), 3);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$5(this, getViewModel().getConfirmButtons(), null, this), 3);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$6(this, getViewModel().getOpenErrorBottomSheet(), null, this), 3);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observeWithoutRepeatOnLifeCycle$1(getViewModel().getTextTipsState(), null, this), 3);
        C10727i.c(D40.a.b(this, "getViewLifecycleOwner(...)"), null, null, new CameraFragment$onViewCreated$$inlined$observe$7(this, getViewModel().getQrButtonTextState(), null, this), 3);
    }

    public final void setExecutorProvider$camera_prodRelease(@NotNull T30.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.executorProvider = cVar;
    }

    public final void testPhotoScanBankCardNumber(@NotNull Uri uri) {
        ContentResolver contentResolver;
        InputStream openInputStream;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = getContext();
        if (context == null || (contentResolver = context.getContentResolver()) == null || (openInputStream = contentResolver.openInputStream(uri)) == null) {
            return;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            BankCardAnalyzer bankCardAnalyzer = getViewModel().getBankCardAnalyzer();
            Intrinsics.f(decodeStream);
            bankCardAnalyzer.manualFromBitmap(decodeStream);
            Unit unit = Unit.f71690a;
            openInputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(openInputStream, th2);
                throw th3;
            }
        }
    }

    public final void testPhotoScanPhoneNumber(@NotNull Uri uri) {
        ContentResolver contentResolver;
        InputStream openInputStream;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = getContext();
        if (context == null || (contentResolver = context.getContentResolver()) == null || (openInputStream = contentResolver.openInputStream(uri)) == null) {
            return;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            PhoneNumberAnalyzer phoneNumberAnalyzer = getViewModel().getPhoneNumberAnalyzer();
            Intrinsics.f(decodeStream);
            phoneNumberAnalyzer.manualFromBitmap(decodeStream);
            Unit unit = Unit.f71690a;
            openInputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(openInputStream, th2);
                throw th3;
            }
        }
    }

    public final void testPhotoScanQR(@NotNull Uri uri) {
        ContentResolver contentResolver;
        InputStream openInputStream;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = getContext();
        if (context == null || (contentResolver = context.getContentResolver()) == null || (openInputStream = contentResolver.openInputStream(uri)) == null) {
            return;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            BarCodeAnalyzer barCodeAnalyzer = getViewModel().getBarCodeAnalyzer();
            Intrinsics.f(decodeStream);
            barCodeAnalyzer.manualFromBitmap(decodeStream);
            Unit unit = Unit.f71690a;
            openInputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(openInputStream, th2);
                throw th3;
            }
        }
    }

    public final void testPhotoTakeQR(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        getViewModel().photoTaken(uri);
    }
}
