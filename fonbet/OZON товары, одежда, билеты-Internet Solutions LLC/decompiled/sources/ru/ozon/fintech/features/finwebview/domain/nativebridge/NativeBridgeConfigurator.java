package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import Ae.C0;
import Ae.E0;
import B0.A0;
import C.o0;
import I0.C3173b;
import Le.InterfaceC3583a;
import N3.C3660k;
import Oe.G;
import Oe.K;
import Oe.N;
import Oe.W;
import Oe.Z;
import Pe.b;
import Pe.v;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import We.E;
import a40.C4942a;
import a40.b;
import a60.C4956b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Keep;
import b40.InterfaceC5539a;
import b60.C5566a;
import b60.C5568c;
import b60.C5569d;
import b60.C5570e;
import b60.C5571f;
import c60.C5756a;
import c60.C5757b;
import c90.InterfaceC5773a;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import d60.C6095a;
import d60.C6096b;
import e40.C6293a;
import e60.C6311a;
import f60.C6440a;
import f60.C6441b;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import g.C6594f;
import g30.InterfaceC6618a;
import g60.C6654a;
import h3.C6788a;
import h60.C6820a;
import i60.C7016a;
import j60.C7291a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k40.InterfaceC7480a;
import k60.C7596a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l60.C7883a;
import l60.C7884b;
import l60.C7885c;
import l60.C7886d;
import l60.C7887e;
import l60.C7888f;
import l60.C7889g;
import l60.C7890h;
import m60.C8093A;
import m60.C8094B;
import m60.C8095C;
import m60.C8096a;
import m60.C8097b;
import m60.C8098c;
import m60.t;
import m60.u;
import m60.w;
import m60.x;
import m60.y;
import m60.z;
import n60.C8447a;
import o40.InterfaceC8640a;
import o60.C8652a;
import o60.C8653b;
import o60.C8654c;
import org.jetbrains.annotations.NotNull;
import p60.C8867d;
import q60.AbstractC8994a;
import r60.C9212c;
import r90.InterfaceC9218a;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.exchanger.datapass.CbottomLifecycle2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.appearance.SystemBarsAppearance;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks.CanOpenInterface;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.file.models.OpenFileRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.push.GetJwt;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.push.SetJwt;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.NavigationLifecycleEvent;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.testing.utils.webViewSpy.WebSpyAgency;
import s60.C9605c;
import t60.C9773a;
import t90.AbstractC9782b;
import ta0.InterfaceC9791a;
import u60.C9977a;
import v60.C10263a;
import v60.C10264b;
import v60.C10265c;
import w60.C10443a;
import x60.C10669a;
import xe.C10727i;
import xe.M;
import y60.C10849a;
import ya0.C10877b;

/* loaded from: classes3.dex */
public final class NativeBridgeConfigurator {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final v30.d f95513A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final K80.b f95514B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final Q90.c f95515C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final S50.a f95516D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final T50.a f95517E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final Q90.n f95518F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final InterfaceC7480a f95519G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f95520H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final Ib.a<InterfaceC5773a> f95521I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final InterfaceC5539a f95522J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final N30.b f95523K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final P60.d f95524L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final K70.b f95525M;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private final d70.d f95526N;

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final C10877b f95527O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final L30.i f95528P;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private final L30.h f95529Q;

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private final Z50.g f95530R;

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private final S60.a f95531S;

    /* renamed from: T, reason: collision with root package name */
    private String f95532T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f95533U;

    /* renamed from: V, reason: collision with root package name */
    private r90.f f95534V;

    /* renamed from: W, reason: collision with root package name */
    private C5571f f95535W;

    /* renamed from: X, reason: collision with root package name */
    private g60.d f95536X;

    /* renamed from: Y, reason: collision with root package name */
    private A60.b f95537Y;

    /* renamed from: Z, reason: collision with root package name */
    private z60.e f95538Z;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f95539a;

    /* renamed from: a0, reason: collision with root package name */
    private t60.h f95540a0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f95541b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f95542b0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final F60.a f95543c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f95544c0;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final E f95545d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f95546d0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f95547e;

    /* renamed from: e0, reason: collision with root package name */
    private n f95548e0;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Z30.a f95549f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f95550f0;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Application f95551g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f95552g0;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f95553h;

    /* renamed from: h0, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.features.finwebview.domain.nativebridge.b f95554h0;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Moshi f95555i;

    /* renamed from: i0, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f95556i0;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final B30.a f95557j;

    /* renamed from: j0, reason: collision with root package name */
    @NotNull
    private final HashMap<Class<? extends Object>, U50.n<Object>> f95558j0;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final B30.f f95559k;

    /* renamed from: k0, reason: collision with root package name */
    @NotNull
    private final HashMap f95560k0;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f95561l;

    /* renamed from: l0, reason: collision with root package name */
    @NotNull
    private final HashMap f95562l0;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final R30.a f95563m;

    /* renamed from: m0, reason: collision with root package name */
    @NotNull
    private final HashMap f95564m0;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final V70.b f95565n;

    /* renamed from: n0, reason: collision with root package name */
    @NotNull
    private final C0 f95566n0;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final P60.o f95567o;

    /* renamed from: o0, reason: collision with root package name */
    public M60.c f95568o0;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final P60.r f95569p;

    /* renamed from: p0, reason: collision with root package name */
    private WeakReference<FintechWebView> f95570p0;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final A30.m f95571q;

    /* renamed from: q0, reason: collision with root package name */
    private C6788a f95572q0;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f95573r;

    /* renamed from: r0, reason: collision with root package name */
    private String f95574r0;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final L30.d f95575s;

    /* renamed from: s0, reason: collision with root package name */
    private String f95576s0;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final Ib.a<SharedPreferences> f95577t;

    /* renamed from: t0, reason: collision with root package name */
    private Function0<String> f95578t0;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f95579u;

    /* renamed from: u0, reason: collision with root package name */
    private Function0<String> f95580u0;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final U30.a f95581v;

    /* renamed from: v0, reason: collision with root package name */
    private Function0<String> f95582v0;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final InterfaceC8640a f95583w;

    /* renamed from: w0, reason: collision with root package name */
    private Function0<Integer> f95584w0;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final h90.f f95585x;

    /* renamed from: x0, reason: collision with root package name */
    private Function0<Unit> f95586x0;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final S30.a f95587y;

    /* renamed from: y0, reason: collision with root package name */
    private Function1<? super OpenFileRequest, Unit> f95588y0;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final K40.a f95589z;

    /* renamed from: z0, reason: collision with root package name */
    @NotNull
    private final Object f95590z0;

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeBridgeConfigurator$NativeBridgeV2Post;", "", "", "type", "id", "result", "LPe/g;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LPe/g;)V", "", "seen0", "LOe/W;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LPe/g;LOe/W;)V", "self", "LNe/b;", "output", "LMe/f;", "serialDesc", "", "write$Self$finwebview_prodRelease", "(Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeBridgeConfigurator$NativeBridgeV2Post;LNe/b;LMe/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()LPe/g;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LPe/g;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeBridgeConfigurator$NativeBridgeV2Post;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getId", "getResult", "LPe/g;", "getData", "setData", "(LPe/g;)V", "Companion", "a", "b", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativeBridgeV2Post {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(0);
        private Pe.g data;

        @NotNull
        private final String id;

        @NotNull
        private final String result;

        @NotNull
        private final String type;

        @InterfaceC3999a
        public /* synthetic */ class a implements Oe.r<NativeBridgeV2Post> {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f95592a;

            @NotNull
            private static final Me.f descriptor;

            static {
                a aVar = new a();
                f95592a = aVar;
                N n11 = new N("NativeBridgeV2Post", aVar, 4);
                n11.j("type", false);
                n11.j("id", false);
                n11.j("result", false);
                n11.j("data", false);
                descriptor = n11;
            }

            @Override // Oe.r
            @NotNull
            public final InterfaceC3583a<?>[] a() {
                InterfaceC3583a interfaceC3583a = Pe.m.f22295a;
                Intrinsics.checkNotNullParameter(interfaceC3583a, "<this>");
                if (!((Me.h) interfaceC3583a.b()).b()) {
                    interfaceC3583a = new G(interfaceC3583a);
                }
                Z z11 = Z.f20279a;
                return new InterfaceC3583a[]{z11, z11, z11, interfaceC3583a};
            }

            @Override // Le.f
            @NotNull
            public final Me.f b() {
                return descriptor;
            }

            @Override // Le.f
            public final void c(Ne.a encoder, Object obj) {
                NativeBridgeV2Post value = (NativeBridgeV2Post) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                Me.f fVar = descriptor;
                Ne.b e11 = encoder.e(fVar);
                NativeBridgeV2Post.write$Self$finwebview_prodRelease(value, e11, fVar);
                e11.B(fVar);
            }
        }

        /* renamed from: ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$NativeBridgeV2Post$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final InterfaceC3583a<NativeBridgeV2Post> serializer() {
                return a.f95592a;
            }

            public /* synthetic */ Companion(int i11) {
                this();
            }
        }

        public /* synthetic */ NativeBridgeV2Post(int i11, String str, String str2, String str3, Pe.g gVar, W w11) {
            if (15 != (i11 & 15)) {
                K.a(i11, 15, a.f95592a.b());
                throw null;
            }
            this.type = str;
            this.id = str2;
            this.result = str3;
            this.data = gVar;
        }

        public static /* synthetic */ NativeBridgeV2Post copy$default(NativeBridgeV2Post nativeBridgeV2Post, String str, String str2, String str3, Pe.g gVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = nativeBridgeV2Post.type;
            }
            if ((i11 & 2) != 0) {
                str2 = nativeBridgeV2Post.id;
            }
            if ((i11 & 4) != 0) {
                str3 = nativeBridgeV2Post.result;
            }
            if ((i11 & 8) != 0) {
                gVar = nativeBridgeV2Post.data;
            }
            return nativeBridgeV2Post.copy(str, str2, str3, gVar);
        }

        public static final /* synthetic */ void write$Self$finwebview_prodRelease(NativeBridgeV2Post self, Ne.b output, Me.f serialDesc) {
            output.k(serialDesc, 0, self.type);
            output.k(serialDesc, 1, self.id);
            output.k(serialDesc, 2, self.result);
            output.t(serialDesc, 3, Pe.m.f22295a, self.data);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        /* renamed from: component4, reason: from getter */
        public final Pe.g getData() {
            return this.data;
        }

        @NotNull
        public final NativeBridgeV2Post copy(@NotNull String type, @NotNull String id2, @NotNull String result, Pe.g data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(result, "result");
            return new NativeBridgeV2Post(type, id2, result, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NativeBridgeV2Post)) {
                return false;
            }
            NativeBridgeV2Post nativeBridgeV2Post = (NativeBridgeV2Post) other;
            return Intrinsics.d(this.type, nativeBridgeV2Post.type) && Intrinsics.d(this.id, nativeBridgeV2Post.id) && Intrinsics.d(this.result, nativeBridgeV2Post.result) && Intrinsics.d(this.data, nativeBridgeV2Post.data);
        }

        public final Pe.g getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getResult() {
            return this.result;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int a11 = G.g.a(G.g.a(this.type.hashCode() * 31, 31, this.id), 31, this.result);
            Pe.g gVar = this.data;
            return a11 + (gVar == null ? 0 : gVar.hashCode());
        }

        public final void setData(Pe.g gVar) {
            this.data = gVar;
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.id;
            String str3 = this.result;
            Pe.g gVar = this.data;
            StringBuilder d11 = C3660k.d("NativeBridgeV2Post(type=", str, ", id=", str2, ", result=");
            d11.append(str3);
            d11.append(", data=");
            d11.append(gVar);
            d11.append(")");
            return d11.toString();
        }

        public NativeBridgeV2Post(@NotNull String type, @NotNull String id2, @NotNull String result, Pe.g gVar) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(result, "result");
            this.type = type;
            this.id = id2;
            this.result = result;
            this.data = gVar;
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95593a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f95594b;

        static {
            int[] iArr = new int[CbottomLifecycle2.b.values().length];
            try {
                iArr[CbottomLifecycle2.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CbottomLifecycle2.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CbottomLifecycle2.b.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CbottomLifecycle2.b.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f95593a = iArr;
            int[] iArr2 = new int[q60.b.values().length];
            try {
                iArr2[q60.b.FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q60.b.GALLERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f95594b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$onActivityResult$1", f = "NativeBridgeConfigurator.kt", l = {796}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95595d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Intent f95597f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Intent intent, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f95597f = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new b(this.f95597f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95595d;
            if (i11 == 0) {
                Sc.s.b(obj);
                G60.a b11 = NativeBridgeConfigurator.this.J().b();
                if (b11 != null) {
                    Intent intent = this.f95597f;
                    String stringExtra = intent != null ? intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE) : null;
                    this.f95595d = 1;
                    obj = b11.a(stringExtra, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$onCreate$2$1$1", f = "NativeBridgeConfigurator.kt", l = {645}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95598d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ActionResult2 f95600f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActionResult2 actionResult2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f95600f = actionResult2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new c(this.f95600f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95598d;
            if (i11 == 0) {
                Sc.s.b(obj);
                NativeBridgeConfigurator nativeBridgeConfigurator = NativeBridgeConfigurator.this;
                H60.a a11 = nativeBridgeConfigurator.J().a();
                if (a11 != null) {
                    Function0 function0 = nativeBridgeConfigurator.f95578t0;
                    if (function0 != null) {
                    }
                    this.f95598d = 1;
                    obj = a11.a(this.f95600f, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$onCreate$3$1", f = "NativeBridgeConfigurator.kt", l = {663}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95601d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CbottomLifecycle2 f95603f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CbottomLifecycle2 cbottomLifecycle2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f95603f = cbottomLifecycle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new d(this.f95603f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95601d;
            if (i11 == 0) {
                Sc.s.b(obj);
                NativeBridgeConfigurator nativeBridgeConfigurator = NativeBridgeConfigurator.this;
                H60.a a11 = nativeBridgeConfigurator.J().a();
                if (a11 != null) {
                    String cbottomId = this.f95603f.getCbottomId();
                    Function0 function0 = nativeBridgeConfigurator.f95578t0;
                    if (function0 != null) {
                    }
                    this.f95601d = 1;
                    obj = a11.b(cbottomId, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$onCreate$3$2", f = "NativeBridgeConfigurator.kt", l = {672}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95604d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CbottomLifecycle2 f95606f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CbottomLifecycle2 cbottomLifecycle2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f95606f = cbottomLifecycle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new e(this.f95606f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95604d;
            if (i11 == 0) {
                Sc.s.b(obj);
                NativeBridgeConfigurator nativeBridgeConfigurator = NativeBridgeConfigurator.this;
                H60.a a11 = nativeBridgeConfigurator.J().a();
                if (a11 != null) {
                    String cbottomId = this.f95606f.getCbottomId();
                    Function0 function0 = nativeBridgeConfigurator.f95578t0;
                    if (function0 != null) {
                    }
                    this.f95604d = 1;
                    obj = a11.d(cbottomId, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$onCreate$3$3", f = "NativeBridgeConfigurator.kt", l = {681}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95607d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CbottomLifecycle2 f95609f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CbottomLifecycle2 cbottomLifecycle2, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f95609f = cbottomLifecycle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new f(this.f95609f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95607d;
            if (i11 == 0) {
                Sc.s.b(obj);
                NativeBridgeConfigurator nativeBridgeConfigurator = NativeBridgeConfigurator.this;
                H60.a a11 = nativeBridgeConfigurator.J().a();
                if (a11 != null) {
                    String cbottomId = this.f95609f.getCbottomId();
                    Function0 function0 = nativeBridgeConfigurator.f95578t0;
                    if (function0 != null) {
                    }
                    this.f95607d = 1;
                    obj = a11.e(cbottomId, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$onCreate$3$4", f = "NativeBridgeConfigurator.kt", l = {690}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95610d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CbottomLifecycle2 f95612f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CbottomLifecycle2 cbottomLifecycle2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f95612f = cbottomLifecycle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new g(this.f95612f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95610d;
            if (i11 == 0) {
                Sc.s.b(obj);
                NativeBridgeConfigurator nativeBridgeConfigurator = NativeBridgeConfigurator.this;
                H60.a a11 = nativeBridgeConfigurator.J().a();
                if (a11 != null) {
                    String cbottomId = this.f95612f.getCbottomId();
                    Function0 function0 = nativeBridgeConfigurator.f95578t0;
                    if (function0 != null) {
                    }
                    this.f95610d = 1;
                    obj = a11.c(cbottomId, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$sendStartEventFragment$1$1", f = "NativeBridgeConfigurator.kt", l = {859}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95613d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95615f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f95615f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NativeBridgeConfigurator.this.new h(this.f95615f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95613d;
            if (i11 == 0) {
                Sc.s.b(obj);
                J60.a c11 = NativeBridgeConfigurator.this.J().c();
                if (c11 != null) {
                    NavigationLifecycleEvent navigationLifecycleEvent = new NavigationLifecycleEvent(this.f95615f);
                    this.f95613d = 1;
                    if (c11.d(navigationLifecycleEvent, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* synthetic */ class i extends C7735q implements Function1<C4942a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C4942a c4942a) {
            C4942a p02 = c4942a;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((NativeBridgeConfigurator) this.receiver).F(p02);
            return Unit.f71690a;
        }
    }

    public NativeBridgeConfigurator(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull F60.a webBridge, @NotNull E okHttpClient, @NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull Z30.a digRoubleApi, @NotNull Application application, @NotNull InterfaceC6083a exchanger, @NotNull Moshi moshi, @NotNull B30.a biometricAuth, @NotNull B30.f biometricSecurityStorage, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull R30.a appCoroutineScopes, @NotNull V70.b audioRecordInteractor, @NotNull P60.o installedBankAppsInteractor, @NotNull P60.r installedTargetAppsInteractor, @NotNull A30.m fintechAuthInteractor, @NotNull InterfaceC9791a mirPayWalletManager, @NotNull L30.d funVibrator, @NotNull Ib.a cryptoSharedPreferences, @NotNull SharedPreferences sharedPreferences, @NotNull U30.a fileManager, @NotNull InterfaceC8640a forceUpdateInteractor, @NotNull h90.f notificationInteractor, @NotNull S30.a applicationInfoDataSource, @NotNull K40.a cbottomDisplay, @NotNull v30.d fintechAntiFraudInteractor, @NotNull K80.b fintechLocationManager, @NotNull Q90.c featureToggles, @NotNull S50.a sensorInteractor, @NotNull T50.a externalTabBadgeManager, @NotNull Q90.n ultraManager, @NotNull InterfaceC7480a reviewInteractor, @NotNull InterfaceC9218a fintechPermissionManager, @NotNull Ib.a testEnvironmentManagerLazy, @NotNull InterfaceC5539a esiaApi, @NotNull O30.b fintechLibType, @NotNull N30.b widgetConfig, @NotNull P60.d installedAppsInteractor, @NotNull K70.b otpSmsInteractor, @NotNull d70.d offlineManager, @NotNull C10877b fintechWebviewHeadersInfoProvider, @NotNull L30.i fintechLockScreenManager, @NotNull L30.h fintechBrightnessManager, @NotNull Z50.g fintechEncryptManager, @NotNull S60.a fintechMetrixInteractor) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(webBridge, "webBridge");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(biometricAuth, "biometricAuth");
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(audioRecordInteractor, "audioRecordInteractor");
        Intrinsics.checkNotNullParameter(installedBankAppsInteractor, "installedBankAppsInteractor");
        Intrinsics.checkNotNullParameter(installedTargetAppsInteractor, "installedTargetAppsInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(funVibrator, "funVibrator");
        Intrinsics.checkNotNullParameter(cryptoSharedPreferences, "cryptoSharedPreferences");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechLocationManager, "fintechLocationManager");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(sensorInteractor, "sensorInteractor");
        Intrinsics.checkNotNullParameter(externalTabBadgeManager, "externalTabBadgeManager");
        Intrinsics.checkNotNullParameter(ultraManager, "ultraManager");
        Intrinsics.checkNotNullParameter(reviewInteractor, "reviewInteractor");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(testEnvironmentManagerLazy, "testEnvironmentManagerLazy");
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(installedAppsInteractor, "installedAppsInteractor");
        Intrinsics.checkNotNullParameter(otpSmsInteractor, "otpSmsInteractor");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(fintechWebviewHeadersInfoProvider, "fintechWebviewHeadersInfoProvider");
        Intrinsics.checkNotNullParameter(fintechLockScreenManager, "fintechLockScreenManager");
        Intrinsics.checkNotNullParameter(fintechBrightnessManager, "fintechBrightnessManager");
        Intrinsics.checkNotNullParameter(fintechEncryptManager, "fintechEncryptManager");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        this.f95539a = fintechSettings;
        this.f95541b = fintechNavigation;
        this.f95543c = webBridge;
        this.f95545d = okHttpClient;
        this.f95547e = externalNetworkSettings;
        this.f95549f = digRoubleApi;
        this.f95551g = application;
        this.f95553h = exchanger;
        this.f95555i = moshi;
        this.f95557j = biometricAuth;
        this.f95559k = biometricSecurityStorage;
        this.f95561l = fintechAnalyticInteractor;
        this.f95563m = appCoroutineScopes;
        this.f95565n = audioRecordInteractor;
        this.f95567o = installedBankAppsInteractor;
        this.f95569p = installedTargetAppsInteractor;
        this.f95571q = fintechAuthInteractor;
        this.f95573r = mirPayWalletManager;
        this.f95575s = funVibrator;
        this.f95577t = cryptoSharedPreferences;
        this.f95579u = sharedPreferences;
        this.f95581v = fileManager;
        this.f95583w = forceUpdateInteractor;
        this.f95585x = notificationInteractor;
        this.f95587y = applicationInfoDataSource;
        this.f95589z = cbottomDisplay;
        this.f95513A = fintechAntiFraudInteractor;
        this.f95514B = fintechLocationManager;
        this.f95515C = featureToggles;
        this.f95516D = sensorInteractor;
        this.f95517E = externalTabBadgeManager;
        this.f95518F = ultraManager;
        this.f95519G = reviewInteractor;
        this.f95520H = fintechPermissionManager;
        this.f95521I = testEnvironmentManagerLazy;
        this.f95522J = esiaApi;
        this.f95523K = widgetConfig;
        this.f95524L = installedAppsInteractor;
        this.f95525M = otpSmsInteractor;
        this.f95526N = offlineManager;
        this.f95527O = fintechWebviewHeadersInfoProvider;
        this.f95528P = fintechLockScreenManager;
        this.f95529Q = fintechBrightnessManager;
        this.f95530R = fintechEncryptManager;
        this.f95531S = fintechMetrixInteractor;
        this.f95548e0 = new n(this);
        webBridge.d(new ru.ozon.fintech.features.finwebview.domain.nativebridge.a(1, this, NativeBridgeConfigurator.class, "allowNativeBridge", "allowNativeBridge(Ljava/lang/String;)Z", 0));
        this.f95554h0 = new ru.ozon.fintech.features.finwebview.domain.nativebridge.b(this);
        this.f95556i0 = Sc.k.b(new B50.a(this, 4));
        this.f95558j0 = new HashMap<>();
        this.f95560k0 = new HashMap();
        this.f95562l0 = new HashMap();
        this.f95564m0 = new HashMap();
        this.f95566n0 = E0.b(0, 0, null, 7);
        this.f95590z0 = Sc.k.a(Sc.n.PUBLICATION, new B50.b(this, 1));
    }

    public static final String A(NativeBridgeConfigurator nativeBridgeConfigurator) {
        return nativeBridgeConfigurator.f95532T;
    }

    public static final void B(NativeBridgeConfigurator nativeBridgeConfigurator) {
        String invoke;
        Function0<String> function0 = nativeBridgeConfigurator.f95580u0;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            Function0<String> function02 = nativeBridgeConfigurator.f95582v0;
            invoke = function02 != null ? function02.invoke() : null;
        }
        if (invoke != null) {
            C6788a c6788a = nativeBridgeConfigurator.f95572q0;
            if (c6788a != null) {
                C10727i.c(c6788a, null, null, new o(nativeBridgeConfigurator, null), 3);
            } else {
                Intrinsics.n("scope");
                throw null;
            }
        }
    }

    private static String D(String str, String str2, boolean z11) {
        b.a aVar = Pe.b.f22280c;
        v.a aVar2 = v.Companion;
        InterfaceC3583a<v> serializer = aVar2.serializer();
        int i11 = Pe.h.f22294b;
        return o0.c(C3660k.d("window.postMessage({type:\"native_bridge\", id:", aVar.a(serializer, str == null ? Pe.r.INSTANCE : new Pe.p(str)), ", result:", aVar.a(aVar2.serializer(), new Pe.p(z11 ? "success" : "failure")), ", data:"), str2, "}, \"*\");");
    }

    private final void K(String str) {
        Window window;
        String str2;
        Activity c11 = this.f95541b.c();
        if (c11 == null || (window = c11.getWindow()) == null || (str2 = this.f95574r0) == null || str2.equals(str)) {
            return;
        }
        this.f95528P.c(window, true);
    }

    public static Activity a(NativeBridgeConfigurator nativeBridgeConfigurator) {
        FintechWebView fintechWebView;
        WeakReference<FintechWebView> weakReference = nativeBridgeConfigurator.f95570p0;
        Context context = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
        return (Activity) context;
    }

    private final void a0() {
        String invoke;
        if (this.f95544c0 && this.f95546d0) {
            Function0<String> function0 = this.f95580u0;
            if (function0 == null || (invoke = function0.invoke()) == null) {
                Function0<String> function02 = this.f95582v0;
                invoke = function02 != null ? function02.invoke() : null;
            }
            if (invoke != null) {
                C6788a c6788a = this.f95572q0;
                if (c6788a != null) {
                    C10727i.c(c6788a, null, null, new h(invoke, null), 3);
                } else {
                    Intrinsics.n("scope");
                    throw null;
                }
            }
        }
    }

    public static String b(NativeBridgeConfigurator nativeBridgeConfigurator, String interfaceGroupName, String interfaceName, String data) {
        Intrinsics.checkNotNullParameter(interfaceGroupName, "interfaceGroupName");
        Intrinsics.checkNotNullParameter(interfaceName, "interfaceName");
        Intrinsics.checkNotNullParameter(data, "data");
        Map map = (Map) nativeBridgeConfigurator.f95560k0.get(interfaceGroupName);
        U50.c cVar = map != null ? (U50.c) map.get(interfaceName) : null;
        U50.d dVar = cVar instanceof U50.d ? (U50.d) cVar : null;
        String str = "";
        if (dVar == null) {
            String str2 = "Interface handler not found.Interface group: " + interfaceGroupName + ", Interface name: " + interfaceName;
            L80.a.b("NativeBridgeConfigurator", str2);
            C6788a c6788a = nativeBridgeConfigurator.f95572q0;
            if (c6788a != null) {
                C10727i.c(c6788a, null, null, new l(nativeBridgeConfigurator, str2, interfaceGroupName, interfaceName, null), 3);
                return "";
            }
            Intrinsics.n("scope");
            throw null;
        }
        NativeResult handleSync = dVar.handleSync(nativeBridgeConfigurator.f95570p0, data);
        if (!(handleSync instanceof NativeResult.Error)) {
            if (!(handleSync instanceof NativeResult.Success)) {
                throw new Sc.o();
            }
            C6788a c6788a2 = nativeBridgeConfigurator.f95572q0;
            if (c6788a2 != null) {
                C10727i.c(c6788a2, null, null, new k(nativeBridgeConfigurator, (NativeResult.Success) handleSync, interfaceGroupName, interfaceName, null), 3);
                return ((NativeResult.Success) handleSync).getResult();
            }
            Intrinsics.n("scope");
            throw null;
        }
        NativeResult.Error error = (NativeResult.Error) handleSync;
        try {
            str = nativeBridgeConfigurator.f95555i.c(ErrorResult.class).toJson(new ErrorResult(error.getErrorMessage(), error.getErrorCode().ordinal()));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        String str3 = str;
        C6788a c6788a3 = nativeBridgeConfigurator.f95572q0;
        if (c6788a3 != null) {
            C10727i.c(c6788a3, null, null, new j(nativeBridgeConfigurator, str3, interfaceGroupName, interfaceName, null), 3);
            return str3;
        }
        Intrinsics.n("scope");
        throw null;
    }

    public static Unit c(NativeBridgeConfigurator nativeBridgeConfigurator, Intent intent) {
        Bundle extras;
        FintechWebView fintechWebView;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (!Intrinsics.d(intent.getAction(), SmsRetriever.SMS_RETRIEVED_ACTION)) {
                extras = null;
            }
            if (extras != null) {
                Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                Status status = obj instanceof Status ? (Status) obj : null;
                if (status == null || status.getStatusCode() != 0) {
                    Log.d("NativeBridgeConfigurator", "smsRetrieverStatus is " + status);
                    nativeBridgeConfigurator.f95561l.M1(status != null ? status.getStatusMessage() : null, null);
                } else {
                    Intent intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT);
                    if (intent2 != null) {
                        try {
                            WeakReference<FintechWebView> weakReference = nativeBridgeConfigurator.f95570p0;
                            Context context = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getContext();
                            Activity activity = context instanceof Activity ? (Activity) context : null;
                            if (activity != null) {
                                activity.startActivityForResult(intent2, 2);
                                Unit unit = Unit.f71690a;
                            }
                        } catch (Exception e11) {
                            L80.a.c("NativeBridgeConfigurator", null, e11);
                            nativeBridgeConfigurator.f95561l.M1("Error while invoke: activity?.startActivityForResult(intent, SMS_CONSENT_REQUEST)", e11);
                            Unit unit2 = Unit.f71690a;
                        }
                    } else {
                        nativeBridgeConfigurator.f95561l.M1("extras.getParcelable<Intent>(SmsRetriever.EXTRA_CONSENT_INTENT) is null", null);
                    }
                }
            }
        }
        return Unit.f71690a;
    }

    public static Unit d(NativeBridgeConfigurator nativeBridgeConfigurator, CbottomLifecycle2 cbottomLifecycle2) {
        Intrinsics.checkNotNullParameter(cbottomLifecycle2, "cbottomLifecycle2");
        int i11 = a.f95593a[cbottomLifecycle2.getType().ordinal()];
        if (i11 == 1) {
            C6788a c6788a = nativeBridgeConfigurator.f95572q0;
            if (c6788a == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a, null, null, nativeBridgeConfigurator.new d(cbottomLifecycle2, null), 3);
        } else if (i11 == 2) {
            C6788a c6788a2 = nativeBridgeConfigurator.f95572q0;
            if (c6788a2 == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a2, null, null, nativeBridgeConfigurator.new e(cbottomLifecycle2, null), 3);
        } else if (i11 == 3) {
            C6788a c6788a3 = nativeBridgeConfigurator.f95572q0;
            if (c6788a3 == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a3, null, null, nativeBridgeConfigurator.new f(cbottomLifecycle2, null), 3);
        } else {
            if (i11 != 4) {
                throw new Sc.o();
            }
            C6788a c6788a4 = nativeBridgeConfigurator.f95572q0;
            if (c6788a4 == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a4, null, null, nativeBridgeConfigurator.new g(cbottomLifecycle2, null), 3);
        }
        return Unit.f71690a;
    }

    public static Unit e(NativeBridgeConfigurator nativeBridgeConfigurator, boolean z11) {
        nativeBridgeConfigurator.f95576s0 = z11 ? nativeBridgeConfigurator.f95532T : null;
        return Unit.f71690a;
    }

    public static Unit f(NativeBridgeConfigurator nativeBridgeConfigurator, String str) {
        WeakReference<FintechWebView> weakReference;
        FintechWebView fintechWebView;
        if (str != null && (weakReference = nativeBridgeConfigurator.f95570p0) != null && (fintechWebView = weakReference.get()) != null) {
            fintechWebView.evaluateJavascript(str, null);
        }
        return Unit.f71690a;
    }

    public static FintechBridgeMessageHandler g(final NativeBridgeConfigurator nativeBridgeConfigurator) {
        return new FintechBridgeMessageHandler(new fd.p() { // from class: U50.g
            @Override // fd.p
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int intValue = ((Integer) obj5).intValue();
                return NativeBridgeConfigurator.i(NativeBridgeConfigurator.this, (String) obj, (String) obj2, (String) obj3, (String) obj4, intValue);
            }
        }, new InterfaceC6512o() { // from class: U50.h
            @Override // fd.InterfaceC6512o
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ((Integer) obj4).getClass();
                return NativeBridgeConfigurator.b(NativeBridgeConfigurator.this, (String) obj, (String) obj2, (String) obj3);
            }
        }, new Function2() { // from class: U50.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeBridgeConfigurator.r(NativeBridgeConfigurator.this, (String) obj, (String) obj2);
            }
        }, nativeBridgeConfigurator.f95551g);
    }

    public static Unit h(NativeBridgeConfigurator nativeBridgeConfigurator, ActionResult2 actionResult2) {
        Intrinsics.checkNotNullParameter(actionResult2, "actionResult2");
        U50.n<Object> nVar = nativeBridgeConfigurator.f95558j0.get(actionResult2.getClass());
        if ((nVar instanceof U50.a) && ((String) nativeBridgeConfigurator.f95564m0.get(nVar.getClass())) != null) {
            C6788a c6788a = nativeBridgeConfigurator.f95572q0;
            if (c6788a == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a, null, null, nativeBridgeConfigurator.new c(actionResult2, null), 3);
        }
        return Unit.f71690a;
    }

    public static Unit i(NativeBridgeConfigurator nativeBridgeConfigurator, String interfaceGroupName, String interfaceName, String callBackUuid, String data, int i11) {
        Intrinsics.checkNotNullParameter(interfaceGroupName, "interfaceGroupName");
        Intrinsics.checkNotNullParameter(interfaceName, "interfaceName");
        Intrinsics.checkNotNullParameter(callBackUuid, "callBackUuid");
        Intrinsics.checkNotNullParameter(data, "data");
        Map map = (Map) nativeBridgeConfigurator.f95560k0.get(interfaceGroupName);
        Object obj = map != null ? (U50.c) map.get(interfaceName) : null;
        U50.a aVar = obj instanceof U50.a ? (U50.a) obj : null;
        if (aVar != null) {
            aVar.handle(nativeBridgeConfigurator.f95570p0, data, new U50.j(i11, nativeBridgeConfigurator, callBackUuid, interfaceGroupName, interfaceName));
        } else {
            StringBuilder d11 = C3660k.d("Interface handler not found.Interface group: ", interfaceGroupName, ", Interface name: ", interfaceName, ", callback uuid: ");
            d11.append(callBackUuid);
            L80.a.b("NativeBridgeConfigurator", d11.toString());
        }
        return Unit.f71690a;
    }

    public static Unit j(NativeBridgeConfigurator nativeBridgeConfigurator, boolean z11) {
        String str = z11 ? nativeBridgeConfigurator.f95532T : null;
        nativeBridgeConfigurator.f95574r0 = str;
        L80.a.a("NativeBridgeConfigurator", "AutoLock disabled: " + z11 + " for url: " + str);
        return Unit.f71690a;
    }

    public static void k(NativeBridgeConfigurator nativeBridgeConfigurator, boolean z11, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        L80.a.c("NativeBridgeConfigurator", "autoSmsEnabledListener - Failure task", it);
        nativeBridgeConfigurator.f95561l.F1(it);
    }

    public static Unit l(NativeBridgeConfigurator nativeBridgeConfigurator, C6293a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        U50.n<Object> nVar = nativeBridgeConfigurator.f95558j0.get(it.getClass());
        if (nVar != null) {
            nVar.a(it);
        }
        return Unit.f71690a;
    }

    public static Activity m(NativeBridgeConfigurator nativeBridgeConfigurator) {
        FintechWebView fintechWebView;
        WeakReference<FintechWebView> weakReference = nativeBridgeConfigurator.f95570p0;
        Context context = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
        return (Activity) context;
    }

    public static Unit n(int i11, NativeBridgeConfigurator nativeBridgeConfigurator, String str, String str2, String str3, NativeResult nativeResult) {
        String a11;
        int i12 = 2;
        Intrinsics.checkNotNullParameter(nativeResult, "nativeResult");
        String str4 = "";
        if (i11 == 2) {
            nativeBridgeConfigurator.getClass();
            if (nativeResult instanceof NativeResult.Error) {
                NativeResult.Error error = (NativeResult.Error) nativeResult;
                try {
                    str4 = nativeBridgeConfigurator.f95555i.c(ErrorResult.class).toJson(new ErrorResult(error.getErrorMessage(), error.getErrorCode().ordinal()));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                Ns.b.c("NativeResult.Error (v2): ", str4, "NativeBridgeConfigurator");
                a11 = D(str, str4, false);
            } else {
                if (!(nativeResult instanceof NativeResult.Success)) {
                    throw new Sc.o();
                }
                NativeResult.Success success = (NativeResult.Success) nativeResult;
                L80.a.a("NativeBridgeConfigurator", "NativeResult.Success (v2): " + success.getResult());
                a11 = D(str, success.getResult(), true);
            }
        } else {
            nativeBridgeConfigurator.getClass();
            b.a aVar = Pe.b.f22280c;
            InterfaceC3583a<v> serializer = v.Companion.serializer();
            int i13 = Pe.h.f22294b;
            String a12 = aVar.a(serializer, str == null ? Pe.r.INSTANCE : new Pe.p(str));
            if (nativeResult instanceof NativeResult.Error) {
                NativeResult.Error error2 = (NativeResult.Error) nativeResult;
                try {
                    str4 = nativeBridgeConfigurator.f95555i.c(ErrorResult.class).toJson(new ErrorResult(error2.getErrorMessage(), error2.getErrorCode().ordinal()));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                L80.a.a("NativeBridgeConfigurator", "NativeResult.Error: " + str4);
                StringBuilder sb2 = new StringBuilder("window.native_bridge.callbacks[");
                sb2.append(a12);
                a11 = C6594f.a("].failure(", str4, ")", sb2);
            } else {
                if (!(nativeResult instanceof NativeResult.Success)) {
                    throw new Sc.o();
                }
                NativeResult.Success success2 = (NativeResult.Success) nativeResult;
                L80.a.a("NativeBridgeConfigurator", "NativeResult.Success: " + success2.getResult());
                a11 = V.e.a("window.native_bridge.callbacks[", a12, "].success(", success2.getResult(), ")");
            }
        }
        String str5 = a11;
        C6788a c6788a = nativeBridgeConfigurator.f95572q0;
        if (c6788a == null) {
            Intrinsics.n("scope");
            throw null;
        }
        C10727i.c(c6788a, null, null, new ru.ozon.fintech.features.finwebview.domain.nativebridge.i(nativeBridgeConfigurator, str5, str2, str3, null), 3);
        new Handler(Looper.getMainLooper()).post(new L2.b(i12, nativeBridgeConfigurator, str5));
        return Unit.f71690a;
    }

    public static androidx.fragment.app.G o(NativeBridgeConfigurator nativeBridgeConfigurator) {
        Activity c11 = nativeBridgeConfigurator.f95541b.c();
        androidx.fragment.app.r rVar = c11 instanceof androidx.fragment.app.r ? (androidx.fragment.app.r) c11 : null;
        if (rVar != null) {
            return rVar.getSupportFragmentManager();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static boolean p(NativeBridgeConfigurator nativeBridgeConfigurator) {
        return ((FintechBridgeMessageHandler) nativeBridgeConfigurator.f95590z0.getValue()).getShouldItHandle();
    }

    public static void q(NativeBridgeConfigurator nativeBridgeConfigurator, String str) {
        FintechWebView fintechWebView;
        WeakReference<FintechWebView> weakReference = nativeBridgeConfigurator.f95570p0;
        if (weakReference == null || (fintechWebView = weakReference.get()) == null) {
            return;
        }
        fintechWebView.evaluateJavascript(str, new U50.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r(NativeBridgeConfigurator nativeBridgeConfigurator, String interfaceGroupName, String interfaceName) {
        Object obj;
        Intrinsics.checkNotNullParameter(interfaceGroupName, "interfaceGroupName");
        Intrinsics.checkNotNullParameter(interfaceName, "interfaceName");
        nativeBridgeConfigurator.getClass();
        boolean A11 = kotlin.text.h.A(interfaceName, "_sync", false);
        Map map = (Map) nativeBridgeConfigurator.f95560k0.get(interfaceGroupName);
        try {
            if (map != null && (obj = (U50.c) map.get(kotlin.text.h.U(interfaceName, "_sync"))) != null) {
                if (A11) {
                    if (obj instanceof U50.d) {
                        obj = (U50.d) obj;
                    }
                }
                return nativeBridgeConfigurator.f95555i.c(CheckMethodResult.class).toJson(!(obj instanceof U50.d) ? new CheckMethodResult(true, "sync") : obj instanceof U50.a ? new CheckMethodResult(true, "async") : new CheckMethodResult(false, null));
            }
            return nativeBridgeConfigurator.f95555i.c(CheckMethodResult.class).toJson(!(obj instanceof U50.d) ? new CheckMethodResult(true, "sync") : obj instanceof U50.a ? new CheckMethodResult(true, "async") : new CheckMethodResult(false, null));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
        obj = null;
    }

    public static final void s(final NativeBridgeConfigurator nativeBridgeConfigurator, final boolean z11) {
        FintechWebView fintechWebView;
        SmsRetriever.getClient(nativeBridgeConfigurator.f95551g).startSmsUserConsent(null).addOnFailureListener(new OnFailureListener() { // from class: U50.k
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                NativeBridgeConfigurator.k(NativeBridgeConfigurator.this, z11, exc);
            }
        });
        WeakReference<FintechWebView> weakReference = nativeBridgeConfigurator.f95570p0;
        Context context = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        InterfaceC4008j interfaceC4008j = nativeBridgeConfigurator.f95556i0;
        if (activity != null && z11 && !nativeBridgeConfigurator.f95542b0) {
            nativeBridgeConfigurator.f95542b0 = true;
            if (Build.VERSION.SDK_INT > 32) {
                activity.registerReceiver((F30.a) interfaceC4008j.getValue(), new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), SmsRetriever.SEND_PERMISSION, null, 2);
                return;
            } else {
                activity.registerReceiver((F30.a) interfaceC4008j.getValue(), new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), SmsRetriever.SEND_PERMISSION, null);
                return;
            }
        }
        if (activity == null || z11 || !nativeBridgeConfigurator.f95542b0) {
            return;
        }
        nativeBridgeConfigurator.f95542b0 = false;
        activity.unregisterReceiver((F30.a) interfaceC4008j.getValue());
    }

    public final boolean C(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int i11 = R80.a.f24791c;
        return R80.a.a(url, this.f95539a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Sc.j, java.lang.Object] */
    public final void E(@NotNull String url, @NotNull FintechWebView.c from) {
        FintechWebView fintechWebView;
        FintechWebView fintechWebView2;
        FintechWebView fintechWebView3;
        FintechWebView fintechWebView4;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(from, "from");
        ((FintechBridgeMessageHandler) this.f95590z0.getValue()).setShouldItHandle(true);
        WeakReference<FintechWebView> weakReference = this.f95570p0;
        if (weakReference == null || (fintechWebView = weakReference.get()) == null) {
            return;
        }
        ValueCallback<String> valueCallback = null;
        fintechWebView.evaluateJavascript("\n        function generateUUID() { // Public Domain/MIT\n            var d = new Date().getTime();//Timestamp\n            var d2 = ((typeof performance !== 'undefined') && performance.now && (performance.now()*1000)) || 0;//Time in microseconds since page-load or 0 if unsupported\n            return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {\n                var r = Math.random() * 16;//random number between 0 and 16\n                if(d > 0){//Use timestamp until depleted\n                    r = (d + r)%16 | 0;\n                    d = Math.floor(d/16);\n                } else {//Use microseconds since page-load if supported\n                    r = (d2 + r)%16 | 0;\n                    d2 = Math.floor(d2/16);\n                }\n                return (c === 'x' ? r : (r & 0x3 | 0x8)).toString(16);\n            });\n        }\n        ", null);
        fintechWebView.evaluateJavascript("           \n        \n        console.log(\"decide to init nativeBridge = \" + window.native_bridge)\n\n        if (window.native_bridge === undefined) {\n\n            function NativeBridgeError(message, initialData) {\n                this.name = 'NativeBridgeError';\n                this.message = message || '';\n                this.initialData = initialData;\n            }\n            NativeBridgeError.prototype = Error.prototype;\n\n            console.log(\"nativeBridge do INIT\")\n            window.native_bridge = function() {};\n            window.native_bridge.callbacks = {};\n            window.native_bridge.call_interface = function(interface_group, interface_name, data) {\n\n            let promise = new Promise(function(resolve, reject) {\n    \n            let callback_uuid = generateUUID();\n            window.native_bridge.callbacks[callback_uuid] = {\n                \"success\": function(response) {\n                    try {\n                        window.native_bridge.callbacks[callback_uuid] = undefined;\n                        resolve(response)\n                    } catch (e) {\n                        reject(new NativeBridgeError(e.message, response));\n                    }\n                },\n                \"failure\": function(error) {\n                    try {\n                        window.native_bridge.callbacks[callback_uuid] = undefined;\n                        reject(error)\n                    } catch (e) {\n                        reject(new NativeBridgeError(e.message, error));\n                    }\n                }\n            }\n            native_bridge_message_handler.call(\n                JSON.stringify({\n                    \"handler\": interface_group,\n                    \"interface\": interface_name,\n                    \"data\": JSON.stringify(data),\n                    \"callback_uuid\": callback_uuid\n                }));\n            });\n            return promise;\n            };\n    \n    \n            window.native_bridge.call_interface_sync = function(interface_group, interface_name, data) {    \n        \n            let res = native_bridge_message_handler.callSync(\n            JSON.stringify({\n                    \"handler\": interface_group,\n                    \"interface\": interface_name,\n                    \"data\": JSON.stringify(data),\n                    \"callback_uuid\": \"\"\n                }));\n            return JSON.parse(res);\n            };\n            \n            console.log(\"nativeBridge finallyInited= \" + (window.native_bridge !== undefined))\n        } else {\n            console.log(\"nativeBridge already INITED, skip\")\n        }  \n", null);
        ArrayList arrayList = this.f95533U;
        if (arrayList == null) {
            Intrinsics.n("bridgeInterfaceGroups");
            throw null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U50.b bVar = (U50.b) it.next();
            WeakReference<FintechWebView> weakReference2 = this.f95570p0;
            if (weakReference2 != null && (fintechWebView2 = weakReference2.get()) != null) {
                fintechWebView2.evaluateJavascript("window.native_bridge." + bVar.getName() + " = function() {};", valueCallback);
                for (U50.c cVar : bVar.a()) {
                    if (cVar instanceof U50.a) {
                        String name = bVar.getName();
                        U50.a aVar = (U50.a) cVar;
                        WeakReference<FintechWebView> weakReference3 = this.f95570p0;
                        if (weakReference3 != null && (fintechWebView4 = weakReference3.get()) != null) {
                            fintechWebView4.evaluateJavascript(C3173b.c(C3660k.d("window.native_bridge.", name, ".", aVar.getInterfaceName(), " = function(data) {\n                return window.native_bridge.call_interface(\""), name, "\", \"", aVar.getInterfaceName(), "\", data)\n            };"), null);
                        }
                    }
                    if (cVar instanceof U50.d) {
                        String name2 = bVar.getName();
                        U50.d dVar = (U50.d) cVar;
                        WeakReference<FintechWebView> weakReference4 = this.f95570p0;
                        if (weakReference4 != null && (fintechWebView3 = weakReference4.get()) != null) {
                            fintechWebView3.evaluateJavascript(C3173b.c(C3660k.d("window.native_bridge.", name2, ".", dVar.getInterfaceName(), "_sync = function(data) {\n                return window.native_bridge.call_interface_sync(\""), name2, "\", \"", dVar.getInterfaceName(), "\", data)\n            };"), null);
                        }
                    }
                }
            }
            valueCallback = null;
        }
        fintechWebView.evaluateJavascript("window.native_bridge.version = 2;", null);
        if (from == FintechWebView.c.ON_PAGE_COMMIT_VISIBLE) {
            this.f95549f.d(new F90.d(this, 4), new U50.l(this, 0));
        }
        if (this.f95539a.isUnderAutotest()) {
            fintechWebView.evaluateJavascript("\n        javascript:(function() {\n            if (window.__networkSpyInjected) return;\n            window.__networkSpyInjected = true;\n    \n            const bridge = window[\"NetworkResponseSpy\"];\n    \n            console.log(\"🕵️ [NetworkSpy] Script injected. Bridge: \", typeof bridge !== 'undefined' ? 'Found' : 'Not found');\n    \n            const originalFetch = window.fetch;\n            \n            window.fetch = async function(...args) {\n                let reqUrl = typeof args[0] === 'string' ? args[0] : (args[0] && args[0].url ? args[0].url : 'unknown_url');\n                let reqMethod = args[1]?.method || (args[0] instanceof Request ? args[0].method : 'GET');\n                \n                try {\n                    const response = await originalFetch.apply(this, args);\n                    const clone = response.clone();\n                    \n                    clone.text().then(bodyText => {\n                        const headersObj = {};\n                        for (let [k, v] of clone.headers.entries()) {\n                            headersObj[k] = v;\n                        }\n                        \n                        const payload = {\n                            url: clone.url,\n                            method: reqMethod,\n                            status: clone.status,\n                            headers: headersObj, \n                            body: bodyText\n                        };\n\n                        if (typeof bridge !== 'undefined') {\n                            bridge.onResponseReceived(JSON.stringify(payload));\n                            console.log(\"🕵️ [NetworkSpy] ✅ Response data sent to Android: \" + clone.url);\n                        }\n                    }).catch(err => console.error(\"🕵️ [NetworkSpy] ❌ Failed to read response: \", err));\n    \n                    return response;\n                    \n                } catch (error) {\n                    throw error;\n                }\n            };\n        })();\n        ", null);
        }
    }

    public final void F(@NotNull C4942a digRoubleResult) {
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(digRoubleResult, "digRoubleResult");
        Log.d("DIG_ROUBLE", "window.postMessage digRoubleResult=" + digRoubleResult);
        String b11 = A0.b("window.postMessage(", Pe.b.f22280c.a(C4942a.Companion.serializer(), digRoubleResult), ", '*');");
        WeakReference<FintechWebView> weakReference = this.f95570p0;
        if (weakReference == null || (fintechWebView = weakReference.get()) == null) {
            return;
        }
        fintechWebView.evaluateJavascript(b11, null);
    }

    @NotNull
    public final S80.b G() {
        return this.f95541b;
    }

    @NotNull
    public final M60.c H() {
        M60.c cVar = this.f95568o0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("fintechWebViewClient");
        throw null;
    }

    @NotNull
    public final HashMap I() {
        return this.f95562l0;
    }

    @NotNull
    public final F60.a J() {
        return this.f95543c;
    }

    public final void L(@NotNull List<? extends Uri> uris, @NotNull q60.b type) {
        Object c1378a;
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = a.f95594b[type.ordinal()];
        if (i11 == 1) {
            c1378a = new AbstractC8994a.C1378a(uris);
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            c1378a = new AbstractC8994a.b(uris);
        }
        U50.n<Object> nVar = this.f95558j0.get(c1378a.getClass());
        if (nVar != null) {
            nVar.a(c1378a);
        }
    }

    public final boolean M() {
        return this.f95533U != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean N() {
        return ((FintechBridgeMessageHandler) this.f95590z0.getValue()).getShouldItHandle();
    }

    @NotNull
    public final C0 O() {
        return this.f95566n0;
    }

    public final void P(int i11, int i12, Intent intent, boolean z11) {
        if (i11 == 2) {
            if (z11) {
                C6788a c6788a = this.f95572q0;
                if (c6788a != null) {
                    C10727i.c(c6788a, null, null, new b(intent, null), 3);
                    return;
                } else {
                    Intrinsics.n("scope");
                    throw null;
                }
            }
            return;
        }
        if (i11 == this.f95539a.getTokenizationRequestCode()) {
            C7596a c7596a = new C7596a(i12, intent);
            U50.n<Object> nVar = this.f95558j0.get(C7596a.class);
            if (nVar != null) {
                nVar.a(c7596a);
            }
        }
    }

    public final void Q() {
        C5571f c5571f = this.f95535W;
        if (c5571f == null) {
            Intrinsics.n("requestContactsPermissionBridgeInterface");
            throw null;
        }
        c5571f.d(false);
        c5571f.f();
        g60.d dVar = this.f95536X;
        if (dVar == null) {
            Intrinsics.n("requestLocationPermissionBridgeInterface");
            throw null;
        }
        dVar.d(false);
        dVar.f();
        A60.b bVar = this.f95537Y;
        if (bVar == null) {
            Intrinsics.n("shareQrBridgeInterface");
            throw null;
        }
        bVar.i();
        z60.e eVar = this.f95538Z;
        if (eVar == null) {
            Intrinsics.n("shareFileBridgeInterface");
            throw null;
        }
        eVar.p();
        t60.h hVar = this.f95540a0;
        if (hVar == null) {
            Intrinsics.n("requestPermissionBridgeInterface");
            throw null;
        }
        hVar.d(false);
        hVar.h();
    }

    public final void R() {
        String str;
        String invoke;
        Function0<String> function0 = this.f95578t0;
        String e11 = U7.d.e(function0 != null ? function0.invoke() : null, C6293a.class.getSimpleName());
        C6788a c6788a = this.f95572q0;
        if (c6788a == null) {
            Intrinsics.n("scope");
            throw null;
        }
        Ca.r rVar = new Ca.r(this, 2);
        InterfaceC6083a interfaceC6083a = this.f95553h;
        interfaceC6083a.b(e11, c6788a, false, rVar);
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        Function0<String> function02 = this.f95578t0;
        String str2 = "";
        if (function02 == null || (str = function02.invoke()) == null) {
            str = "";
        }
        companion.getClass();
        String a11 = ActionResult2.Companion.a(str);
        C6788a c6788a2 = this.f95572q0;
        if (c6788a2 == null) {
            Intrinsics.n("scope");
            throw null;
        }
        interfaceC6083a.b(a11, c6788a2, false, new C90.d(this, 4));
        CbottomLifecycle2.Companion companion2 = CbottomLifecycle2.INSTANCE;
        Function0<String> function03 = this.f95578t0;
        if (function03 != null && (invoke = function03.invoke()) != null) {
            str2 = invoke;
        }
        companion2.getClass();
        String a12 = CbottomLifecycle2.Companion.a(str2);
        C6788a c6788a3 = this.f95572q0;
        if (c6788a3 == null) {
            Intrinsics.n("scope");
            throw null;
        }
        interfaceC6083a.b(a12, c6788a3, false, new Ca.s(this, 2));
        E30.e.a().add(this.f95554h0);
    }

    public final void S() {
        String str;
        FintechWebView fintechWebView;
        FintechWebView fintechWebView2;
        WeakReference<FintechWebView> weakReference = this.f95570p0;
        if (weakReference != null && (fintechWebView2 = weakReference.get()) != null) {
            fintechWebView2.removeCallbacks(this.f95548e0);
        }
        if (this.f95542b0) {
            WeakReference<FintechWebView> weakReference2 = this.f95570p0;
            Context context = (weakReference2 == null || (fintechWebView = weakReference2.get()) == null) ? null : fintechWebView.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.unregisterReceiver((F30.a) this.f95556i0.getValue());
            }
            this.f95542b0 = false;
        }
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        Function0<String> function0 = this.f95578t0;
        if (function0 == null || (str = function0.invoke()) == null) {
            str = "";
        }
        companion.getClass();
        String a11 = ActionResult2.Companion.a(str);
        InterfaceC6083a interfaceC6083a = this.f95553h;
        interfaceC6083a.a(a11);
        Function0<String> function02 = this.f95578t0;
        String invoke = function02 != null ? function02.invoke() : null;
        interfaceC6083a.a(invoke + C6293a.class.getSimpleName());
        E30.e.a().remove(this.f95554h0);
    }

    public final void T(@NotNull String url) {
        Window window;
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        K(url);
        Activity c11 = this.f95541b.c();
        if (c11 == null || (window = c11.getWindow()) == null || (str = this.f95576s0) == null || str.equals(url)) {
            return;
        }
        this.f95529Q.b(window);
    }

    public final void U() {
        this.f95546d0 = true;
        a0();
    }

    public final void V(@NotNull androidx.fragment.app.r activity) {
        r90.f fVar;
        r90.f fVar2;
        r90.f fVar3;
        r90.f fVar4;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C5571f c5571f = this.f95535W;
        if (c5571f != null && c5571f.e() != null && (fVar4 = this.f95534V) != null) {
            fVar4.b(activity);
        }
        g60.d dVar = this.f95536X;
        if (dVar != null && dVar.e() != null && (fVar3 = this.f95534V) != null) {
            fVar3.c(activity);
        }
        A60.b bVar = this.f95537Y;
        if (bVar != null && bVar.g() != null && (fVar2 = this.f95534V) != null) {
            fVar2.g(activity);
        }
        z60.e eVar = this.f95538Z;
        if (eVar != null && eVar.o() != null && (fVar = this.f95534V) != null) {
            fVar.g(activity);
        }
        t60.h hVar = this.f95540a0;
        if (hVar == null || hVar.e() == null) {
            return;
        }
        t60.h hVar2 = this.f95540a0;
        if (hVar2 != null) {
            hVar2.g(activity);
        } else {
            Intrinsics.n("requestPermissionBridgeInterface");
            throw null;
        }
    }

    public final void W() {
        FintechWebView fintechWebView;
        FintechWebView fintechWebView2;
        this.f95544c0 = true;
        WeakReference<FintechWebView> weakReference = this.f95570p0;
        if (weakReference != null && (fintechWebView2 = weakReference.get()) != null) {
            fintechWebView2.removeCallbacks(this.f95548e0);
        }
        WeakReference<FintechWebView> weakReference2 = this.f95570p0;
        if (weakReference2 != null && (fintechWebView = weakReference2.get()) != null) {
            Function0<String> function0 = this.f95582v0;
            fintechWebView.onResume("onStart " + (function0 != null ? function0.invoke() : null));
        }
        if (this.f95550f0) {
            C6788a c6788a = this.f95572q0;
            if (c6788a == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a, null, null, new p(this, null), 3);
        }
        a0();
        this.f95550f0 = false;
        this.f95552g0 = false;
        m mVar = new m(0, this, NativeBridgeConfigurator.class, "sendRotatedEvent", "sendRotatedEvent()V", 0);
        S50.a aVar = this.f95516D;
        aVar.i(mVar);
        aVar.g();
    }

    public final void X() {
        String invoke;
        FintechWebView fintechWebView;
        FintechWebView fintechWebView2;
        androidx.fragment.app.r parentFragmentActivity;
        Window window;
        this.f95544c0 = false;
        Function0<String> function0 = this.f95580u0;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            Function0<String> function02 = this.f95582v0;
            invoke = function02 != null ? function02.invoke() : null;
        }
        if (invoke != null) {
            C6788a c6788a = this.f95572q0;
            if (c6788a == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a, null, null, new r(this, invoke, null), 3);
        }
        if (this.f95552g0) {
            C6788a c6788a2 = this.f95572q0;
            if (c6788a2 == null) {
                Intrinsics.n("scope");
                throw null;
            }
            C10727i.c(c6788a2, null, null, new q(this, null), 3);
        }
        this.f95550f0 = false;
        this.f95552g0 = false;
        S50.a aVar = this.f95516D;
        aVar.i(null);
        aVar.h();
        WeakReference<FintechWebView> weakReference = this.f95570p0;
        if (weakReference != null && (fintechWebView2 = weakReference.get()) != null && (parentFragmentActivity = fintechWebView2.getParentFragmentActivity()) != null && (window = parentFragmentActivity.getWindow()) != null) {
            this.f95528P.c(window, true);
            this.f95529Q.b(window);
        }
        WeakReference<FintechWebView> weakReference2 = this.f95570p0;
        if (weakReference2 == null || (fintechWebView = weakReference2.get()) == null) {
            return;
        }
        fintechWebView.post(this.f95548e0);
    }

    public final void Y(String str) {
        Window window;
        String str2;
        K(str);
        Activity c11 = this.f95541b.c();
        if (c11 == null || (window = c11.getWindow()) == null || (str2 = this.f95576s0) == null || str2.equals(str)) {
            return;
        }
        this.f95529Q.b(window);
    }

    public final void Z(AbstractC9782b abstractC9782b) {
        C5571f c5571f = this.f95535W;
        if (c5571f == null) {
            Intrinsics.n("requestContactsPermissionBridgeInterface");
            throw null;
        }
        c5571f.c(abstractC9782b);
        g60.d dVar = this.f95536X;
        if (dVar == null) {
            Intrinsics.n("requestLocationPermissionBridgeInterface");
            throw null;
        }
        dVar.c(abstractC9782b);
        t60.h hVar = this.f95540a0;
        if (hVar == null) {
            Intrinsics.n("requestPermissionBridgeInterface");
            throw null;
        }
        hVar.c(abstractC9782b);
        A60.b bVar = this.f95537Y;
        if (bVar == null) {
            Intrinsics.n("shareQrBridgeInterface");
            throw null;
        }
        bVar.c(abstractC9782b);
        z60.e eVar = this.f95538Z;
        if (eVar != null) {
            eVar.c(abstractC9782b);
        } else {
            Intrinsics.n("shareFileBridgeInterface");
            throw null;
        }
    }

    public final void b0(@NotNull Function0 provideAppConfigId, @NotNull Function0 provideTabIndex, @NotNull Function0 provideTabId, @NotNull Function0 provideUUID, @NotNull Function1 attemptNativeNavigation, @NotNull Function0 navigationWindowClose, @NotNull Function1 pageLoadedListener, r90.f fVar, @NotNull Function1 tabsVisibilityCallback, @NotNull C6788a scope, @NotNull Function0 tabInfoCallback, @NotNull InterfaceC6511n goTab, @NotNull Function0 refreshCallback, @NotNull Function0 reloadWebViewCallback, @NotNull Function0 openGalleryRequest, @NotNull Function1 openFileRequest) {
        Intrinsics.checkNotNullParameter(provideAppConfigId, "provideAppConfigId");
        Intrinsics.checkNotNullParameter(provideTabIndex, "provideTabIndex");
        Intrinsics.checkNotNullParameter(provideTabId, "provideTabId");
        Intrinsics.checkNotNullParameter(provideUUID, "provideUUID");
        Intrinsics.checkNotNullParameter(attemptNativeNavigation, "attemptNativeNavigation");
        Intrinsics.checkNotNullParameter(navigationWindowClose, "navigationWindowClose");
        Intrinsics.checkNotNullParameter(pageLoadedListener, "pageLoadedListener");
        Intrinsics.checkNotNullParameter(tabsVisibilityCallback, "tabsVisibilityCallback");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tabInfoCallback, "tabInfoCallback");
        Intrinsics.checkNotNullParameter(goTab, "goTab");
        Intrinsics.checkNotNullParameter(refreshCallback, "refreshCallback");
        Intrinsics.checkNotNullParameter(reloadWebViewCallback, "reloadWebViewCallback");
        Intrinsics.checkNotNullParameter(openGalleryRequest, "openGalleryRequest");
        Intrinsics.checkNotNullParameter(openFileRequest, "openFileRequest");
        this.f95580u0 = provideAppConfigId;
        this.f95584w0 = provideTabIndex;
        this.f95582v0 = provideTabId;
        this.f95578t0 = provideUUID;
        this.f95534V = fVar;
        this.f95572q0 = scope;
        this.f95586x0 = openGalleryRequest;
        this.f95588y0 = openFileRequest;
        Ca.i iVar = new Ca.i(this, 2);
        L30.i iVar2 = this.f95528P;
        iVar2.d(iVar);
        L60.b bVar = new L60.b(this, 1);
        L30.h hVar = this.f95529Q;
        hVar.c(bVar);
        Moshi moshi = this.f95555i;
        this.f95535W = new C5571f(moshi, fVar);
        this.f95536X = new g60.d(moshi, fVar);
        this.f95540a0 = new t60.h(moshi, fVar);
        Application application = this.f95551g;
        S80.b bVar2 = this.f95541b;
        U30.a aVar = this.f95581v;
        h90.f fVar2 = this.f95585x;
        ru.ozon.fintech.settings.domain.a aVar2 = this.f95539a;
        this.f95537Y = new A60.b(application, bVar2, aVar, fVar2, fVar, moshi, aVar2);
        InterfaceC6618a interfaceC6618a = this.f95561l;
        this.f95538Z = new z60.e(application, bVar2, aVar, fVar2, fVar, moshi, interfaceC6618a, scope, aVar2);
        Q90.c cVar = this.f95515C;
        C10877b c10877b = this.f95527O;
        M60.c cVar2 = new M60.c(provideAppConfigId, aVar2, scope, cVar, interfaceC6618a, c10877b);
        Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
        this.f95568o0 = cVar2;
        s sVar = new s(1, this, NativeBridgeConfigurator.class, "autoSmsEnabledListener", "autoSmsEnabledListener(Z)Z", 0);
        R30.a aVar3 = this.f95563m;
        Z50.d dVar = new Z50.d(application, bVar2, aVar3.c(), provideUUID, cVar, aVar2, interfaceC6618a, this.f95530R, moshi);
        HashMap<Class<? extends Object>, U50.n<Object>> hashMap = this.f95558j0;
        hashMap.put(C6293a.class, dVar);
        InterfaceC9791a interfaceC9791a = this.f95573r;
        k60.g gVar = new k60.g(interfaceC9791a, aVar2, interfaceC6618a, moshi);
        hashMap.put(C7596a.class, gVar);
        K40.a aVar4 = this.f95589z;
        a60.j jVar = new a60.j(moshi, aVar4, provideUUID);
        hashMap.put(ActionResult2.class, jVar);
        C6788a c6788a = this.f95572q0;
        if (c6788a == null) {
            Intrinsics.n("scope");
            throw null;
        }
        C9605c c9605c = new C9605c(application, aVar, interfaceC6618a, c6788a, cVar, this.f95586x0, moshi);
        C6788a c6788a2 = this.f95572q0;
        if (c6788a2 == null) {
            Intrinsics.n("scope");
            throw null;
        }
        C9212c c9212c = new C9212c(application, aVar, interfaceC6618a, c6788a2, cVar, this.f95588y0, moshi);
        hashMap.put(AbstractC8994a.b.class, c9605c);
        hashMap.put(AbstractC8994a.C1378a.class, c9212c);
        A30.m mVar = this.f95571q;
        X50.b bVar3 = new X50.b(cVar, aVar3, mVar, bVar2);
        S60.a aVar5 = this.f95531S;
        X50.a aVar6 = new X50.a(bVar3, new X50.c(mVar, interfaceC6618a, aVar2, aVar5));
        B30.a aVar7 = this.f95557j;
        j60.c cVar3 = new j60.c(new C7291a(aVar7, moshi), new j60.b(aVar7));
        B30.f fVar3 = this.f95559k;
        B60.g gVar2 = new B60.g(new B60.k(aVar7, fVar3, interfaceC6618a, bVar2, moshi), new B60.m(fVar3, interfaceC6618a, mVar, bVar2, moshi), new B60.i(fVar3, interfaceC6618a, mVar, bVar2, moshi), new B60.f(fVar3, interfaceC6618a, bVar2, moshi), new B60.c(mVar, bVar2, interfaceC6618a, moshi), new B60.d(mVar, moshi));
        Z50.b bVar4 = new Z50.b(new Z50.a(application, moshi), dVar, new Z50.f(bVar2));
        C7888f c7888f = new C7888f(new C7884b(this.f95575s, this.f95580u0, interfaceC6618a, new ru.ozon.fintech.features.finwebview.domain.nativebridge.c(0, this, NativeBridgeConfigurator.class, "provideCurrentUrl", "provideCurrentUrl()Ljava/lang/String;", 0)), new C7883a(iVar2, interfaceC6618a, this.f95580u0, new ru.ozon.fintech.features.finwebview.domain.nativebridge.d(0, this, NativeBridgeConfigurator.class, "provideCurrentUrl", "provideCurrentUrl()Ljava/lang/String;", 0)), new C7885c(hVar, interfaceC6618a, this.f95580u0, new ru.ozon.fintech.features.finwebview.domain.nativebridge.e(0, this, NativeBridgeConfigurator.class, "provideCurrentUrl", "provideCurrentUrl()Ljava/lang/String;", 0)), new C7889g(hVar, interfaceC6618a, this.f95580u0, new ru.ozon.fintech.features.finwebview.domain.nativebridge.f(0, this, NativeBridgeConfigurator.class, "provideCurrentUrl", "provideCurrentUrl()Ljava/lang/String;", 0)), new C7890h(sVar), new C7886d(application, moshi, interfaceC6618a), new C7887e(this.f95525M, moshi));
        m60.o oVar = new m60.o(new C8096a(attemptNativeNavigation), new m60.h(navigationWindowClose, interfaceC6618a, this.f95580u0), new m60.j(bVar2, interfaceC6618a), new m60.f(moshi), new m60.r(moshi, pageLoadedListener), new y(bVar2), new C8093A(moshi, bVar2, this.f95545d, aVar3.b(), interfaceC6618a, aVar), new m60.l(interfaceC6618a, this.f95580u0), new C8095C(application, moshi), new C8094B(tabsVisibilityCallback, interfaceC6618a, new ru.ozon.fintech.features.finwebview.domain.nativebridge.g(0, this, NativeBridgeConfigurator.class, "provideCurrentUrl", "provideCurrentUrl()Ljava/lang/String;", 0), this.f95580u0), new m60.s(bVar2, moshi), new z(moshi, tabInfoCallback), new m60.m(moshi, goTab, bVar2, cVar, interfaceC6618a, this.f95580u0), new m60.v(refreshCallback, interfaceC6618a, this.f95580u0), new m60.p(bVar2, aVar2, interfaceC6618a, this.f95580u0), new x(moshi, aVar3, interfaceC6618a, this.f95580u0), new w(moshi, cVar, this.f95583w, tabInfoCallback, interfaceC6618a), new m60.n(bVar2, this.f95579u, cVar, aVar2, fVar, moshi), new C8098c(interfaceC6618a, this.f95580u0), new m60.d(reloadWebViewCallback, interfaceC6618a, this.f95580u0), new C8097b(this.f95517E, moshi), new m60.e(bVar2), new t(bVar2, interfaceC6618a, this.f95580u0), new u(bVar2, interfaceC6618a, this.f95580u0), new m60.i(cVar, interfaceC6618a), new m60.k(moshi, cVar), new m60.g(bVar2, interfaceC6618a), new m60.q(aVar5));
        k60.j jVar2 = new k60.j(gVar, new k60.i(moshi, interfaceC6618a, interfaceC9791a), new k60.m(moshi, interfaceC6618a, interfaceC9791a), new k60.w(interfaceC9791a, interfaceC6618a), new k60.p(moshi, interfaceC6618a, interfaceC9791a), new k60.s(moshi, interfaceC6618a, interfaceC9791a), new k60.v(interfaceC9791a, moshi, aVar3));
        P60.o oVar2 = this.f95567o;
        Y50.a aVar8 = new Y50.a(new Y50.e(moshi, cVar, aVar2, interfaceC6618a, oVar2, aVar3), new Y50.f(moshi, cVar, interfaceC6618a, oVar2), new CanOpenInterface(application, moshi, interfaceC6618a, this.f95580u0), new Y50.c(moshi, cVar, aVar2, interfaceC6618a, this.f95569p, aVar3));
        C5756a c5756a = new C5756a(new C5757b(application, moshi));
        C5569d c5569d = new C5569d(moshi, fVar);
        C5571f c5571f = this.f95535W;
        if (c5571f == null) {
            Intrinsics.n("requestContactsPermissionBridgeInterface");
            throw null;
        }
        C5570e c5570e = new C5570e(application, moshi, aVar3);
        C6788a c6788a3 = this.f95572q0;
        if (c6788a3 == null) {
            Intrinsics.n("scope");
            throw null;
        }
        C5566a c5566a = new C5566a(c5569d, c5571f, c5570e, new C5568c(application, aVar, c6788a3, moshi));
        V70.b bVar5 = this.f95565n;
        C10263a c10263a = new C10263a(new C10264b(fVar, moshi, cVar, bVar5, interfaceC6618a), new C10265c(bVar5, interfaceC6618a));
        i60.b bVar6 = new i60.b(new C7016a(), new i60.c(moshi), new i60.d(moshi));
        w60.b bVar7 = new w60.b(new C10443a(aVar2, cVar, this.f95519G, interfaceC6618a));
        h60.b bVar8 = new h60.b(new C6820a(moshi, this.f95580u0, new ru.ozon.fintech.features.finwebview.domain.nativebridge.h(0, this, NativeBridgeConfigurator.class, "provideCurrentUrl", "provideCurrentUrl()Ljava/lang/String;", 0), c10877b));
        g60.d dVar2 = this.f95536X;
        if (dVar2 == null) {
            Intrinsics.n("requestLocationPermissionBridgeInterface");
            throw null;
        }
        C6654a c6654a = new C6654a(dVar2, new g60.c(moshi, fVar), new g60.b(moshi, fVar, this.f95514B));
        A60.b bVar9 = this.f95537Y;
        if (bVar9 == null) {
            Intrinsics.n("shareQrBridgeInterface");
            throw null;
        }
        z60.e eVar = this.f95538Z;
        if (eVar == null) {
            Intrinsics.n("shareFileBridgeInterface");
            throw null;
        }
        C10849a c10849a = new C10849a(bVar9, eVar);
        C8867d c8867d = new C8867d(c9605c, c9212c);
        Ib.a<SharedPreferences> aVar9 = this.f95577t;
        x60.i iVar3 = new x60.i(new x60.f(moshi, aVar9), new x60.g(moshi, aVar9), new C10669a(this.f95513A, moshi, interfaceC6618a, this.f95580u0), new x60.h(moshi, this.f95582v0, this.f95584w0), new x60.e(this.f95524L, cVar, aVar3, moshi));
        t60.d dVar3 = new t60.d(moshi, fVar);
        t60.h hVar2 = this.f95540a0;
        if (hVar2 == null) {
            Intrinsics.n("requestPermissionBridgeInterface");
            throw null;
        }
        t60.c cVar4 = new t60.c(dVar3, hVar2, new t60.e(application, bVar2), new C9773a(application));
        a60.c cVar5 = new a60.c(jVar, new a60.g(aVar4, provideUUID), new a60.e(aVar4, provideUUID), new C4956b(aVar4, provideUUID), new a60.h(aVar4, moshi));
        S30.a aVar10 = this.f95587y;
        C9977a c9977a = new C9977a(new GetJwt(moshi, fVar2, aVar10), new SetJwt(moshi, fVar2, aVar10, interfaceC6618a));
        D60.b bVar10 = new D60.b(new D60.a(fVar2));
        Q90.n nVar = this.f95518F;
        C60.d dVar4 = new C60.d(new C60.a(nVar, bVar2), new C60.b(nVar), new C60.c(nVar));
        n60.b bVar11 = new n60.b(new C8447a(application, this.f95520H, moshi));
        InterfaceC5539a interfaceC5539a = this.f95522J;
        C6096b c6096b = new C6096b(new C6095a(interfaceC5539a, interfaceC6618a, moshi), new d60.c(application, interfaceC5539a, moshi, interfaceC6618a));
        C6440a c6440a = new C6440a(new C6441b(bVar2, aVar2));
        E60.c cVar6 = new E60.c(new E60.b(application, this.f95523K, moshi), new E60.a(application));
        d70.d dVar5 = this.f95526N;
        ArrayList m02 = C7714v.m0(C6311a.f62026a, aVar6, cVar3, gVar2, bVar4, c7888f, oVar, jVar2, aVar8, c5756a, c5566a, c10263a, bVar6, bVar7, bVar8, c6654a, c10849a, c8867d, iVar3, cVar4, cVar5, c9977a, bVar10, dVar4, bVar11, c6096b, c6440a, cVar6, new C8652a(new C8654c(dVar5), new C8653b(moshi, dVar5, cVar)));
        if (Build.VERSION.SDK_INT >= 31) {
            m02.add(new W50.a(new SystemBarsAppearance(moshi, interfaceC6618a, this.f95580u0)));
        }
        this.f95533U = m02;
    }

    public final void c0(String str) {
        this.f95532T = str;
    }

    public final void d0(boolean z11) {
        this.f95550f0 = z11;
    }

    public final void e0(boolean z11) {
        this.f95552g0 = z11;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [Sc.j, java.lang.Object] */
    public final void f0(@NotNull FintechWebView webView) {
        NativeBridgeConfigurator nativeBridgeConfigurator;
        WeakReference<FintechWebView> weakReference;
        FintechWebView fintechWebView;
        WebView webView2;
        FintechWebView fintechWebView2;
        Intrinsics.checkNotNullParameter(webView, "webView");
        WeakReference<FintechWebView> weakReference2 = new WeakReference<>(webView);
        this.f95570p0 = weakReference2;
        FintechWebView fintechWebView3 = weakReference2.get();
        if (fintechWebView3 != null) {
            fintechWebView3.addJavascriptInterface((FintechBridgeMessageHandler) this.f95590z0.getValue(), "native_bridge_message_handler");
        }
        ArrayList arrayList = this.f95533U;
        if (arrayList == null) {
            Intrinsics.n("bridgeInterfaceGroups");
            throw null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U50.b bVar = (U50.b) it.next();
            HashMap hashMap = this.f95560k0;
            String name = bVar.getName();
            List<U50.c> a11 = bVar.a();
            int h11 = U.h(C7714v.z(a11, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (Object obj : a11) {
                linkedHashMap.put(((U50.c) obj).getInterfaceName(), obj);
            }
            hashMap.put(name, linkedHashMap);
            HashMap hashMap2 = this.f95564m0;
            List<U50.c> a12 = bVar.a();
            int h12 = U.h(C7714v.z(a12, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
            Iterator<T> it2 = a12.iterator();
            while (it2.hasNext()) {
                Pair pair = new Pair(((U50.c) it2.next()).getClass(), bVar.getName());
                linkedHashMap2.put(pair.e(), pair.f());
            }
            hashMap2.putAll(linkedHashMap2);
            HashMap hashMap3 = this.f95562l0;
            String name2 = bVar.getName();
            List<U50.c> a13 = bVar.a();
            ArrayList arrayList2 = new ArrayList(C7714v.z(a13, 10));
            Iterator<T> it3 = a13.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((U50.c) it3.next()).getInterfaceName());
            }
            hashMap3.put(name2, new ArrayList(arrayList2));
        }
        this.f95543c.e(webView);
        WeakReference<FintechWebView> weakReference3 = this.f95570p0;
        if (weakReference3 == null || (fintechWebView2 = weakReference3.get()) == null) {
            nativeBridgeConfigurator = this;
        } else {
            Z30.a aVar = this.f95549f;
            nativeBridgeConfigurator = this;
            i iVar = new i(1, nativeBridgeConfigurator, NativeBridgeConfigurator.class, "digRoublePostMessageCallback", "digRoublePostMessageCallback(Lru/ozon/fintech/digrouble/api/bridge/interfaces/DigRoubleResult;)V", 0);
            nativeBridgeConfigurator.f95547e.get$externalOkHttpSettings().getClass();
            b.a.C0690a b11 = aVar.b(iVar, new U50.m(this, 0), new B50.e(this, 3), new Ca.h(this, 2));
            nativeBridgeConfigurator.f95549f.getClass();
            fintechWebView2.addJavascriptInterface(b11, "");
        }
        if (!nativeBridgeConfigurator.f95539a.isUnderAutotest() || (weakReference = nativeBridgeConfigurator.f95570p0) == null || (fintechWebView = weakReference.get()) == null || (webView2 = fintechWebView.getWebView()) == null) {
            return;
        }
        WebSpyAgency.INSTANCE.attachSpyTo(webView2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void g0() {
        FintechWebView fintechWebView;
        ((FintechBridgeMessageHandler) this.f95590z0.getValue()).setShouldItHandle(false);
        WeakReference<FintechWebView> weakReference = this.f95570p0;
        if (weakReference == null || (fintechWebView = weakReference.get()) == null) {
            return;
        }
        fintechWebView.evaluateJavascript("window.native_bridge.call_interface = undefined;", null);
        L80.a.a("NativeBridgeConfigurator", "Undefined native bridge");
    }
}
