package com.sports.insider.ui.support;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e1;
import androidx.fragment.app.p0;
import androidx.lifecycle.c;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c4.o;
import cd.d;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.support.SupportChat;
import ec.g;
import eg.c0;
import eg.m0;
import eg.t1;
import gf.k;
import gf.l;
import gf.t;
import i3.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.v;
import ka.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lg.e;
import md.m;
import oe.j;
import p8.h;
import rc.b0;
import rd.b;
import sd.f;
import te.a0;
import te.h0;
import te.j0;
import te.l0;
import te.p;
import te.q;
import te.s;
import te.y;
import te.z;
import ve.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/support/SupportChat;", "Lrd/b;", "Lec/g;", "Lte/p;", "Lsd/f;", "<init>", "()V", "Lte/a0;", "safeArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSupportChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportChat.kt\ncom/sports/insider/ui/support/SupportChat\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 5 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n+ 6 Color.kt\nandroidx/core/graphics/ColorKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,597:1\n42#2,3:598\n1#3:601\n35#4,3:602\n17#4:605\n38#4,6:606\n44#4,2:613\n35#4,3:615\n17#4:618\n38#4,6:619\n44#4,2:626\n35#4,3:628\n17#4:631\n38#4,6:632\n44#4,2:639\n17#4:642\n17#4:643\n35#4,3:644\n17#4:647\n38#4,6:648\n44#4,2:655\n38#5:612\n38#5:625\n38#5:638\n38#5:654\n404#6:641\n13805#7,2:657\n*S KotlinDebug\n*F\n+ 1 SupportChat.kt\ncom/sports/insider/ui/support/SupportChat\n*L\n183#1:598,3\n215#1:602,3\n215#1:605\n215#1:606,6\n215#1:613,2\n217#1:615,3\n217#1:618\n217#1:619,6\n217#1:626,2\n219#1:628,3\n219#1:631\n219#1:632,6\n219#1:639,2\n233#1:642\n259#1:643\n129#1:644,3\n129#1:647\n129#1:648,6\n129#1:655,2\n215#1:612\n217#1:625\n219#1:638\n129#1:654\n230#1:641\n543#1:657,2\n*E\n"})
/* loaded from: classes.dex */
public final class SupportChat extends b<g> implements p, f {

    /* renamed from: c, reason: collision with root package name */
    public final Object f7045c;

    /* renamed from: d, reason: collision with root package name */
    public final t f7046d;

    /* renamed from: e, reason: collision with root package name */
    public x f7047e;

    /* renamed from: f, reason: collision with root package name */
    public InputMethodManager f7048f;

    /* renamed from: g, reason: collision with root package name */
    public q f7049g;

    /* renamed from: h, reason: collision with root package name */
    public t1 f7050h;

    /* renamed from: i, reason: collision with root package name */
    public final y f7051i = new y(this);
    public final te.t j;

    /* renamed from: k, reason: collision with root package name */
    public final te.t f7052k;

    /* renamed from: l, reason: collision with root package name */
    public final te.t f7053l;

    /* renamed from: m, reason: collision with root package name */
    public final te.t f7054m;

    /* renamed from: n, reason: collision with root package name */
    public final g.b f7055n;

    /* renamed from: o, reason: collision with root package name */
    public final g.b f7056o;

    /* renamed from: p, reason: collision with root package name */
    public final g.b f7057p;
    public final te.t q;

    /* renamed from: r, reason: collision with root package name */
    public a f7058r;

    /* renamed from: s, reason: collision with root package name */
    public final g.b f7059s;

    /* JADX WARN: Type inference failed for: r0v15, types: [te.t] */
    /* JADX WARN: Type inference failed for: r0v5, types: [te.t] */
    /* JADX WARN: Type inference failed for: r0v6, types: [te.t] */
    /* JADX WARN: Type inference failed for: r0v7, types: [te.t] */
    /* JADX WARN: Type inference failed for: r0v8, types: [te.t] */
    public SupportChat() {
        final int i5 = 0;
        this.f7045c = k.a(l.f10028b, new Function0(this) { // from class: te.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23926b;

            {
                this.f23926b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        p0 requireActivity = this.f23926b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        return new sd.m(requireActivity);
                    default:
                        SupportChat owner = this.f23926b;
                        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
                        ge.n factory = new ge.n(12);
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        o1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(l0.class, "modelClass");
                        ag.c modelClass = u6.h.m(l0.class);
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        String r5 = d5.r(modelClass);
                        if (r5 != null) {
                            return (l0) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            }
        });
        final int i10 = 1;
        this.f7046d = k.b(new Function0(this) { // from class: te.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23926b;

            {
                this.f23926b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        p0 requireActivity = this.f23926b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        return new sd.m(requireActivity);
                    default:
                        SupportChat owner = this.f23926b;
                        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
                        ge.n factory = new ge.n(12);
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        o1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(l0.class, "modelClass");
                        ag.c modelClass = u6.h.m(l0.class);
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        String r5 = d5.r(modelClass);
                        if (r5 != null) {
                            return (l0) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            }
        });
        this.j = new q0(this) { // from class: te.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23921b;

            {
                this.f23921b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                y1.c0 c0Var;
                ec.g gVar;
                switch (i10) {
                    case 0:
                        SupportChat supportChat = this.f23921b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(supportChat).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        SupportChat supportChat2 = this.f23921b;
                        if (supportChat2.isAdded() && (gVar = (ec.g) supportChat2.f22459a) != null) {
                            gVar.j.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 2:
                        int i11 = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) ? 0 : 8;
                        ec.g gVar2 = (ec.g) this.f23921b.f22459a;
                        if (gVar2 != null) {
                            gVar2.f8942e.setVisibility(i11);
                            break;
                        }
                        break;
                    case 3:
                        List newList = (List) obj;
                        q qVar = this.f23921b.f7049g;
                        if (qVar != null) {
                            if (newList == null) {
                                newList = kotlin.collections.e0.f19204a;
                            }
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            he.a aVar = (he.a) qVar.f23916d;
                            ArrayList oldList = (ArrayList) qVar.f23914b;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            qVar.f23914b = CollectionsKt.X(newList);
                            androidx.recyclerview.widget.d.c(aVar, false).f(new androidx.recyclerview.widget.c(qVar));
                            break;
                        }
                        break;
                    default:
                        f0 it = (f0) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportChat supportChat3 = this.f23921b;
                        ec.g gVar3 = (ec.g) supportChat3.f22459a;
                        if (gVar3 != null) {
                            ImageView imageView = gVar3.f8939b;
                            supportChat3.I().getClass();
                            int i12 = it == null ? -1 : g0.$EnumSwitchMapping$0[it.ordinal()];
                            Integer valueOf = Integer.valueOf(i12 != 1 ? i12 != 2 ? R.drawable.ic_clip : R.drawable.ic_image : R.drawable.ic_file);
                            c4.o a7 = c4.y.a(imageView.getContext());
                            q4.e eVar = new q4.e(imageView.getContext());
                            eVar.f21940c = valueOf;
                            q4.j.d(eVar, imageView);
                            ((c4.v) a7).a(eVar.a());
                        }
                        ec.g gVar4 = (ec.g) supportChat3.f22459a;
                        if (gVar4 != null) {
                            ImageView imageView2 = gVar4.f8940c;
                            int ordinal = it.ordinal();
                            imageView2.setVisibility((ordinal == 1 || !(ordinal == 2 || ordinal == 3)) ? 8 : 0);
                        }
                        ec.g gVar5 = (ec.g) supportChat3.f22459a;
                        if (gVar5 != null) {
                            gVar5.f8941d.setVisibility(x.$EnumSwitchMapping$0[it.ordinal()] != 1 ? 8 : 0);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f7052k = new q0(this) { // from class: te.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23921b;

            {
                this.f23921b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                y1.c0 c0Var;
                ec.g gVar;
                switch (i11) {
                    case 0:
                        SupportChat supportChat = this.f23921b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(supportChat).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        SupportChat supportChat2 = this.f23921b;
                        if (supportChat2.isAdded() && (gVar = (ec.g) supportChat2.f22459a) != null) {
                            gVar.j.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 2:
                        int i112 = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) ? 0 : 8;
                        ec.g gVar2 = (ec.g) this.f23921b.f22459a;
                        if (gVar2 != null) {
                            gVar2.f8942e.setVisibility(i112);
                            break;
                        }
                        break;
                    case 3:
                        List newList = (List) obj;
                        q qVar = this.f23921b.f7049g;
                        if (qVar != null) {
                            if (newList == null) {
                                newList = kotlin.collections.e0.f19204a;
                            }
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            he.a aVar = (he.a) qVar.f23916d;
                            ArrayList oldList = (ArrayList) qVar.f23914b;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            qVar.f23914b = CollectionsKt.X(newList);
                            androidx.recyclerview.widget.d.c(aVar, false).f(new androidx.recyclerview.widget.c(qVar));
                            break;
                        }
                        break;
                    default:
                        f0 it = (f0) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportChat supportChat3 = this.f23921b;
                        ec.g gVar3 = (ec.g) supportChat3.f22459a;
                        if (gVar3 != null) {
                            ImageView imageView = gVar3.f8939b;
                            supportChat3.I().getClass();
                            int i12 = it == null ? -1 : g0.$EnumSwitchMapping$0[it.ordinal()];
                            Integer valueOf = Integer.valueOf(i12 != 1 ? i12 != 2 ? R.drawable.ic_clip : R.drawable.ic_image : R.drawable.ic_file);
                            c4.o a7 = c4.y.a(imageView.getContext());
                            q4.e eVar = new q4.e(imageView.getContext());
                            eVar.f21940c = valueOf;
                            q4.j.d(eVar, imageView);
                            ((c4.v) a7).a(eVar.a());
                        }
                        ec.g gVar4 = (ec.g) supportChat3.f22459a;
                        if (gVar4 != null) {
                            ImageView imageView2 = gVar4.f8940c;
                            int ordinal = it.ordinal();
                            imageView2.setVisibility((ordinal == 1 || !(ordinal == 2 || ordinal == 3)) ? 8 : 0);
                        }
                        ec.g gVar5 = (ec.g) supportChat3.f22459a;
                        if (gVar5 != null) {
                            gVar5.f8941d.setVisibility(x.$EnumSwitchMapping$0[it.ordinal()] != 1 ? 8 : 0);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f7053l = new q0(this) { // from class: te.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23921b;

            {
                this.f23921b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                y1.c0 c0Var;
                ec.g gVar;
                switch (i12) {
                    case 0:
                        SupportChat supportChat = this.f23921b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(supportChat).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        SupportChat supportChat2 = this.f23921b;
                        if (supportChat2.isAdded() && (gVar = (ec.g) supportChat2.f22459a) != null) {
                            gVar.j.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 2:
                        int i112 = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) ? 0 : 8;
                        ec.g gVar2 = (ec.g) this.f23921b.f22459a;
                        if (gVar2 != null) {
                            gVar2.f8942e.setVisibility(i112);
                            break;
                        }
                        break;
                    case 3:
                        List newList = (List) obj;
                        q qVar = this.f23921b.f7049g;
                        if (qVar != null) {
                            if (newList == null) {
                                newList = kotlin.collections.e0.f19204a;
                            }
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            he.a aVar = (he.a) qVar.f23916d;
                            ArrayList oldList = (ArrayList) qVar.f23914b;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            qVar.f23914b = CollectionsKt.X(newList);
                            androidx.recyclerview.widget.d.c(aVar, false).f(new androidx.recyclerview.widget.c(qVar));
                            break;
                        }
                        break;
                    default:
                        f0 it = (f0) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportChat supportChat3 = this.f23921b;
                        ec.g gVar3 = (ec.g) supportChat3.f22459a;
                        if (gVar3 != null) {
                            ImageView imageView = gVar3.f8939b;
                            supportChat3.I().getClass();
                            int i122 = it == null ? -1 : g0.$EnumSwitchMapping$0[it.ordinal()];
                            Integer valueOf = Integer.valueOf(i122 != 1 ? i122 != 2 ? R.drawable.ic_clip : R.drawable.ic_image : R.drawable.ic_file);
                            c4.o a7 = c4.y.a(imageView.getContext());
                            q4.e eVar = new q4.e(imageView.getContext());
                            eVar.f21940c = valueOf;
                            q4.j.d(eVar, imageView);
                            ((c4.v) a7).a(eVar.a());
                        }
                        ec.g gVar4 = (ec.g) supportChat3.f22459a;
                        if (gVar4 != null) {
                            ImageView imageView2 = gVar4.f8940c;
                            int ordinal = it.ordinal();
                            imageView2.setVisibility((ordinal == 1 || !(ordinal == 2 || ordinal == 3)) ? 8 : 0);
                        }
                        ec.g gVar5 = (ec.g) supportChat3.f22459a;
                        if (gVar5 != null) {
                            gVar5.f8941d.setVisibility(x.$EnumSwitchMapping$0[it.ordinal()] != 1 ? 8 : 0);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 4;
        this.f7054m = new q0(this) { // from class: te.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23921b;

            {
                this.f23921b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                y1.c0 c0Var;
                ec.g gVar;
                switch (i13) {
                    case 0:
                        SupportChat supportChat = this.f23921b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(supportChat).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        SupportChat supportChat2 = this.f23921b;
                        if (supportChat2.isAdded() && (gVar = (ec.g) supportChat2.f22459a) != null) {
                            gVar.j.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 2:
                        int i112 = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) ? 0 : 8;
                        ec.g gVar2 = (ec.g) this.f23921b.f22459a;
                        if (gVar2 != null) {
                            gVar2.f8942e.setVisibility(i112);
                            break;
                        }
                        break;
                    case 3:
                        List newList = (List) obj;
                        q qVar = this.f23921b.f7049g;
                        if (qVar != null) {
                            if (newList == null) {
                                newList = kotlin.collections.e0.f19204a;
                            }
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            he.a aVar = (he.a) qVar.f23916d;
                            ArrayList oldList = (ArrayList) qVar.f23914b;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            qVar.f23914b = CollectionsKt.X(newList);
                            androidx.recyclerview.widget.d.c(aVar, false).f(new androidx.recyclerview.widget.c(qVar));
                            break;
                        }
                        break;
                    default:
                        f0 it = (f0) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportChat supportChat3 = this.f23921b;
                        ec.g gVar3 = (ec.g) supportChat3.f22459a;
                        if (gVar3 != null) {
                            ImageView imageView = gVar3.f8939b;
                            supportChat3.I().getClass();
                            int i122 = it == null ? -1 : g0.$EnumSwitchMapping$0[it.ordinal()];
                            Integer valueOf = Integer.valueOf(i122 != 1 ? i122 != 2 ? R.drawable.ic_clip : R.drawable.ic_image : R.drawable.ic_file);
                            c4.o a7 = c4.y.a(imageView.getContext());
                            q4.e eVar = new q4.e(imageView.getContext());
                            eVar.f21940c = valueOf;
                            q4.j.d(eVar, imageView);
                            ((c4.v) a7).a(eVar.a());
                        }
                        ec.g gVar4 = (ec.g) supportChat3.f22459a;
                        if (gVar4 != null) {
                            ImageView imageView2 = gVar4.f8940c;
                            int ordinal = it.ordinal();
                            imageView2.setVisibility((ordinal == 1 || !(ordinal == 2 || ordinal == 3)) ? 8 : 0);
                        }
                        ec.g gVar5 = (ec.g) supportChat3.f22459a;
                        if (gVar5 != null) {
                            gVar5.f8941d.setVisibility(x.$EnumSwitchMapping$0[it.ordinal()] != 1 ? 8 : 0);
                            break;
                        }
                        break;
                }
            }
        };
        g.b registerForActivityResult = registerForActivityResult(new e1(2), new h(26));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f7055n = registerForActivityResult;
        g.b registerForActivityResult2 = registerForActivityResult(new e1(4), new s(this, 3));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f7056o = registerForActivityResult2;
        g.b registerForActivityResult3 = registerForActivityResult(new e1(1), new s(this, 0));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.f7057p = registerForActivityResult3;
        final int i14 = 0;
        this.q = new q0(this) { // from class: te.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SupportChat f23921b;

            {
                this.f23921b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                y1.c0 c0Var;
                ec.g gVar;
                switch (i14) {
                    case 0:
                        SupportChat supportChat = this.f23921b;
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(supportChat).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 1:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        SupportChat supportChat2 = this.f23921b;
                        if (supportChat2.isAdded() && (gVar = (ec.g) supportChat2.f22459a) != null) {
                            gVar.j.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 2:
                        int i112 = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE) ? 0 : 8;
                        ec.g gVar2 = (ec.g) this.f23921b.f22459a;
                        if (gVar2 != null) {
                            gVar2.f8942e.setVisibility(i112);
                            break;
                        }
                        break;
                    case 3:
                        List newList = (List) obj;
                        q qVar = this.f23921b.f7049g;
                        if (qVar != null) {
                            if (newList == null) {
                                newList = kotlin.collections.e0.f19204a;
                            }
                            Intrinsics.checkNotNullParameter(newList, "inputElements");
                            he.a aVar = (he.a) qVar.f23916d;
                            ArrayList oldList = (ArrayList) qVar.f23914b;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(oldList, "oldList");
                            Intrinsics.checkNotNullParameter(newList, "newList");
                            aVar.f10585e = oldList;
                            aVar.f10586f = newList;
                            qVar.f23914b = CollectionsKt.X(newList);
                            androidx.recyclerview.widget.d.c(aVar, false).f(new androidx.recyclerview.widget.c(qVar));
                            break;
                        }
                        break;
                    default:
                        f0 it = (f0) obj;
                        Intrinsics.checkNotNullParameter(it, "it");
                        SupportChat supportChat3 = this.f23921b;
                        ec.g gVar3 = (ec.g) supportChat3.f22459a;
                        if (gVar3 != null) {
                            ImageView imageView = gVar3.f8939b;
                            supportChat3.I().getClass();
                            int i122 = it == null ? -1 : g0.$EnumSwitchMapping$0[it.ordinal()];
                            Integer valueOf = Integer.valueOf(i122 != 1 ? i122 != 2 ? R.drawable.ic_clip : R.drawable.ic_image : R.drawable.ic_file);
                            c4.o a7 = c4.y.a(imageView.getContext());
                            q4.e eVar = new q4.e(imageView.getContext());
                            eVar.f21940c = valueOf;
                            q4.j.d(eVar, imageView);
                            ((c4.v) a7).a(eVar.a());
                        }
                        ec.g gVar4 = (ec.g) supportChat3.f22459a;
                        if (gVar4 != null) {
                            ImageView imageView2 = gVar4.f8940c;
                            int ordinal = it.ordinal();
                            imageView2.setVisibility((ordinal == 1 || !(ordinal == 2 || ordinal == 3)) ? 8 : 0);
                        }
                        ec.g gVar5 = (ec.g) supportChat3.f22459a;
                        if (gVar5 != null) {
                            gVar5.f8941d.setVisibility(x.$EnumSwitchMapping$0[it.ordinal()] != 1 ? 8 : 0);
                            break;
                        }
                        break;
                }
            }
        };
        g.b registerForActivityResult4 = registerForActivityResult(new e1(2), new s(this, 2));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult4, "registerForActivityResult(...)");
        this.f7059s = registerForActivityResult4;
    }

    public static void H(ConstraintLayout constraintLayout, View view, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (Build.VERSION.SDK_INT >= 30) {
            constraintLayout.setPadding(0, 0, 0, windowInsets.getInsets(WindowInsets.Type.ime()).bottom);
            windowInsets.getInsets(WindowInsets.Type.ime() | WindowInsets.Type.systemGestures());
        }
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_support_chat, viewGroup, false);
        int i5 = R.id.ic_assets;
        ImageView imageView = (ImageView) y3.j(R.id.ic_assets, inflate);
        if (imageView != null) {
            i5 = R.id.ic_assets_ok;
            ImageView imageView2 = (ImageView) y3.j(R.id.ic_assets_ok, inflate);
            if (imageView2 != null) {
                i5 = R.id.ic_assets_wait;
                ImageView imageView3 = (ImageView) y3.j(R.id.ic_assets_wait, inflate);
                if (imageView3 != null) {
                    i5 = R.id.input_panel;
                    ConstraintLayout constraintLayout = (ConstraintLayout) y3.j(R.id.input_panel, inflate);
                    if (constraintLayout != null) {
                        i5 = R.id.rvSupport;
                        RecyclerView recyclerView = (RecyclerView) y3.j(R.id.rvSupport, inflate);
                        if (recyclerView != null) {
                            i5 = R.id.supportInputField;
                            EditText editText = (EditText) y3.j(R.id.supportInputField, inflate);
                            if (editText != null) {
                                i5 = R.id.supportOkButton;
                                FrameLayout frameLayout = (FrameLayout) y3.j(R.id.supportOkButton, inflate);
                                if (frameLayout != null) {
                                    i5 = R.id.supportOkButtonIc;
                                    ImageView imageView4 = (ImageView) y3.j(R.id.supportOkButtonIc, inflate);
                                    if (imageView4 != null) {
                                        i5 = R.id.swipe_refresh;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) y3.j(R.id.swipe_refresh, inflate);
                                        if (swipeRefreshLayout != null) {
                                            g gVar = new g((ConstraintLayout) inflate, imageView, imageView2, imageView3, constraintLayout, recyclerView, editText, frameLayout, imageView4, swipeRefreshLayout);
                                            Intrinsics.checkNotNullExpressionValue(gVar, "inflate(...)");
                                            return gVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final l0 I() {
        return (l0) this.f7046d.getValue();
    }

    @Override // te.p
    public final void a(String str) {
        l0 I = I();
        m mVar = I.f23900d;
        mVar.getClass();
        if (Intrinsics.areEqual(str, "TESTPUSH")) {
            mVar.l();
            return;
        }
        c0.t(MyApp.f6830c, b0.b(), null, new c(new d(), str == null ? "AnotherQuestion" : str, null, 10, false), 2);
        if (str == null || str.length() == 0) {
            y1.a aVar = new y1.a(R.id.action_global_faqFragment);
            Intrinsics.checkNotNullExpressionValue(aVar, "actionGlobalFaqFragment(...)");
            I.k(aVar);
            return;
        }
        if (Intrinsics.areEqual(str, "Academy")) {
            y1.a aVar2 = new y1.a(R.id.action_global_academyFragment);
            Intrinsics.checkNotNullExpressionValue(aVar2, "actionGlobalAcademyFragment(...)");
            I.k(aVar2);
            return;
        }
        if (CollectionsKt.A(u.f("Responsible", "premium_prediction", "express_prediction", "vip_access", "how_to_get_a_bonus", "how_to_pay", "subs_live_prediction", "how_place_bet", "how_register_bk", "how_logout_oauth"), str)) {
            te.c0 c0Var = new te.c0();
            c0Var.f23868a.put("destination", str);
            Intrinsics.checkNotNullExpressionValue(c0Var, "setDestination(...)");
            I.k(c0Var);
            return;
        }
        if (!CollectionsKt.A(u.f("Sports_betting_first_steps", "Sports_betting_types", "Common_mistakes_newbies", "Flat_strategy_for_those_who_are_just_starting", "Strategy_Corridor", "Why_is_psychology_so_important", "Mathematical_rates", "Deepen_bets_on_yellow_cards_and_corner_cards", "Value_Betting", "beating_totals", "Rational_income_maximization_principle", "What_is_losing_streak_and_how_to_deal_with_it", "Both_teams_to_score"), str)) {
            y1.a aVar3 = new y1.a(R.id.action_global_faqFragment);
            Intrinsics.checkNotNullExpressionValue(aVar3, "actionGlobalFaqFragment(...)");
            I.k(aVar3);
        } else {
            te.b0 b0Var = new te.b0();
            b0Var.f23866a.put("destination", str);
            Intrinsics.checkNotNullExpressionValue(b0Var, "setDestination(...)");
            I.k(b0Var);
        }
    }

    @Override // te.p
    public final void d(int i5) {
        l0 I = I();
        I.getClass();
        u1.a i10 = d1.i(I);
        e eVar = m0.f9201a;
        c0.t(i10, jg.q.f18523a, null, new cd.k(i5, I, (Continuation) null, 16), 2);
    }

    @Override // rd.b, ve.w0
    public final void k(int i5) {
        if (i5 == 3) {
            c0.t(d1.g(this), null, null, new z(this, null, 0), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        final ConstraintLayout constraintLayout;
        super.onCreate(bundle);
        if (this.f7048f == null) {
            Object systemService = requireContext().getSystemService("input_method");
            this.f7048f = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            requireActivity().getWindow().setSoftInputMode(18);
            return;
        }
        g gVar = (g) this.f22459a;
        if (gVar == null || (constraintLayout = gVar.f8938a) == null) {
            return;
        }
        constraintLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: te.r
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                SupportChat.H(ConstraintLayout.this, view, windowInsets);
                return windowInsets;
            }
        });
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        I().f23906k.i(this.j);
        g gVar = (g) this.f22459a;
        if (gVar != null) {
            gVar.j.setRefreshing(false);
        }
        g gVar2 = (g) this.f22459a;
        if (gVar2 != null) {
            gVar2.f8943f.setAdapter(null);
        }
        this.f7049g = null;
        this.f7047e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        RecyclerView recyclerView;
        ImageView imageView;
        FrameLayout frameLayout;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        super.onPause();
        g gVar = (g) this.f22459a;
        if (gVar != null && (swipeRefreshLayout2 = gVar.j) != null) {
            swipeRefreshLayout2.setEnabled(false);
        }
        g gVar2 = (g) this.f22459a;
        if (gVar2 != null && (swipeRefreshLayout = gVar2.j) != null) {
            swipeRefreshLayout.setOnRefreshListener(null);
        }
        g gVar3 = (g) this.f22459a;
        if (gVar3 != null && (frameLayout = gVar3.f8945h) != null) {
            frameLayout.setOnClickListener(null);
        }
        g gVar4 = (g) this.f22459a;
        if (gVar4 != null && (imageView = gVar4.f8939b) != null) {
            imageView.setOnClickListener(null);
        }
        g gVar5 = (g) this.f22459a;
        if (gVar5 == null || (recyclerView = gVar5.f8943f) == null) {
            return;
        }
        recyclerView.setOnTouchListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = (g) this.f22459a;
        if (gVar != null) {
            gVar.j.setEnabled(true);
        }
        g gVar2 = (g) this.f22459a;
        if (gVar2 != null) {
            gVar2.j.setOnRefreshListener(new s(this, 1));
        }
        g gVar3 = (g) this.f22459a;
        if (gVar3 != null) {
            final int i5 = 0;
            io.sentry.config.a.y(gVar3.f8945h, 600L, new Function1(this) { // from class: te.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SupportChat f23923b;

                {
                    this.f23923b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
                
                    if (r1.getPackageManager().resolveActivity(new android.content.Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) goto L40;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
                
                    r3 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
                
                    if (android.os.Build.VERSION.SDK_INT >= 34) goto L40;
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            SupportChat supportChat = this.f23923b;
                            eg.c0.t(d1.g(supportChat), null, null, new z(supportChat, null, 1), 3);
                            break;
                        default:
                            SupportChat supportChat2 = this.f23923b;
                            l0 I = supportChat2.I();
                            androidx.lifecycle.p0 p0Var = I.f23904h;
                            boolean z5 = true;
                            boolean z7 = I.f23903g == null || I.f23902f == null;
                            Continuation continuation = null;
                            if (!z7 && p0Var.d() != f0.f23875b) {
                                p0Var.j(f0.f23874a);
                                I.f23902f = null;
                                I.f23903g = null;
                            }
                            if (z7) {
                                p0 activity = supportChat2.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                                Intrinsics.checkNotNullParameter(activity, "activity");
                                final com.android.billingclient.api.i iVar = new com.android.billingclient.api.i();
                                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity);
                                iVar.f4029c = bottomSheetDialog;
                                bottomSheetDialog.setContentView(activity.getLayoutInflater().inflate(R.layout.gallery_bottom_sheet, (ViewGroup) null));
                                TextView textView = (TextView) bottomSheetDialog.findViewById(R.id.pickVisualMedia_tv);
                                if (textView != null) {
                                    textView.setVisibility(iVar.f4027a ? 0 : 8);
                                }
                                eg.c0.t(d1.g(bottomSheetDialog), null, null, new oe.j(iVar, activity, continuation, 25), 3);
                                TextView textView2 = (TextView) bottomSheetDialog.findViewById(R.id.gallery_tv);
                                if (textView2 != null) {
                                    final int i10 = 0;
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: sd.e
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i10) {
                                                case 0:
                                                    com.android.billingclient.api.i iVar2 = iVar;
                                                    f fVar = (f) iVar2.f4028b;
                                                    if (fVar != null) {
                                                        SupportChat supportChat3 = (SupportChat) fVar;
                                                        g.b bVar = supportChat3.f7056o;
                                                        supportChat3.I().getClass();
                                                        Intent intent = new Intent();
                                                        intent.setType("*/*");
                                                        ArrayList arrayList = new ArrayList();
                                                        arrayList.addAll(lc.d.f19672b);
                                                        arrayList.addAll(lc.d.f19671a);
                                                        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[0]));
                                                        intent.setAction("android.intent.action.GET_CONTENT");
                                                        Intent createChooser = Intent.createChooser(intent, "Select File");
                                                        Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
                                                        bVar.a(createChooser);
                                                        supportChat3.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 4), 2);
                                                    }
                                                    iVar2.a();
                                                    break;
                                                default:
                                                    com.android.billingclient.api.i iVar3 = iVar;
                                                    f fVar2 = (f) iVar3.f4028b;
                                                    if (fVar2 != null) {
                                                        SupportChat supportChat4 = (SupportChat) fVar2;
                                                        g.b bVar2 = supportChat4.f7057p;
                                                        h.b.b();
                                                        h.e mediaType = h.e.f10341a;
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        h.c defaultTab = h.c.f10339a;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        h.b.b();
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        g.i iVar4 = new g.i();
                                                        iVar4.f9647a = h.d.f10340a;
                                                        h.b.b();
                                                        iVar4.f9648b = defaultTab;
                                                        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                        iVar4.f9647a = mediaType;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "<set-?>");
                                                        iVar4.f9648b = defaultTab;
                                                        bVar2.a(iVar4);
                                                        supportChat4.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 5), 2);
                                                    }
                                                    iVar3.a();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                TextView textView3 = (TextView) bottomSheetDialog.findViewById(R.id.pickVisualMedia_tv);
                                if (textView3 != null) {
                                    final int i11 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: sd.e
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i11) {
                                                case 0:
                                                    com.android.billingclient.api.i iVar2 = iVar;
                                                    f fVar = (f) iVar2.f4028b;
                                                    if (fVar != null) {
                                                        SupportChat supportChat3 = (SupportChat) fVar;
                                                        g.b bVar = supportChat3.f7056o;
                                                        supportChat3.I().getClass();
                                                        Intent intent = new Intent();
                                                        intent.setType("*/*");
                                                        ArrayList arrayList = new ArrayList();
                                                        arrayList.addAll(lc.d.f19672b);
                                                        arrayList.addAll(lc.d.f19671a);
                                                        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[0]));
                                                        intent.setAction("android.intent.action.GET_CONTENT");
                                                        Intent createChooser = Intent.createChooser(intent, "Select File");
                                                        Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
                                                        bVar.a(createChooser);
                                                        supportChat3.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 4), 2);
                                                    }
                                                    iVar2.a();
                                                    break;
                                                default:
                                                    com.android.billingclient.api.i iVar3 = iVar;
                                                    f fVar2 = (f) iVar3.f4028b;
                                                    if (fVar2 != null) {
                                                        SupportChat supportChat4 = (SupportChat) fVar2;
                                                        g.b bVar2 = supportChat4.f7057p;
                                                        h.b.b();
                                                        h.e mediaType = h.e.f10341a;
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        h.c defaultTab = h.c.f10339a;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        h.b.b();
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        g.i iVar4 = new g.i();
                                                        iVar4.f9647a = h.d.f10340a;
                                                        h.b.b();
                                                        iVar4.f9648b = defaultTab;
                                                        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                        iVar4.f9647a = mediaType;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "<set-?>");
                                                        iVar4.f9648b = defaultTab;
                                                        bVar2.a(iVar4);
                                                        supportChat4.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 5), 2);
                                                    }
                                                    iVar3.a();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Context context = supportChat2.getContext();
                                if (context == null) {
                                    break;
                                } else {
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    if (!aa.b.h()) {
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        break;
                                    }
                                    iVar.f4027a = z5;
                                    TextView textView4 = (TextView) bottomSheetDialog.findViewById(R.id.pickVisualMedia_tv);
                                    if (textView4 != null) {
                                        textView4.setVisibility(iVar.f4027a ? 0 : 8);
                                    }
                                    if (((sd.h) iVar.f4030d) != null) {
                                        RecyclerView recyclerView = (RecyclerView) bottomSheetDialog.findViewById(R.id.gallery_recycler);
                                        if (recyclerView != null) {
                                            recyclerView.setAdapter(null);
                                            recyclerView.setAdapter((sd.h) iVar.f4030d);
                                        }
                                        sd.h hVar = (sd.h) iVar.f4030d;
                                        if (hVar != null) {
                                            hVar.notifyDataSetChanged();
                                        }
                                    }
                                    iVar.f4028b = supportChat2;
                                    bottomSheetDialog.show();
                                    supportChat2.I().getClass();
                                    eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), null, 1), 2);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        g gVar4 = (g) this.f22459a;
        if (gVar4 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(gVar4.f8939b, 600L, new Function1(this) { // from class: te.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SupportChat f23923b;

                {
                    this.f23923b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
                
                    if (r1.getPackageManager().resolveActivity(new android.content.Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) goto L40;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
                
                    r3 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
                
                    if (android.os.Build.VERSION.SDK_INT >= 34) goto L40;
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            SupportChat supportChat = this.f23923b;
                            eg.c0.t(d1.g(supportChat), null, null, new z(supportChat, null, 1), 3);
                            break;
                        default:
                            SupportChat supportChat2 = this.f23923b;
                            l0 I = supportChat2.I();
                            androidx.lifecycle.p0 p0Var = I.f23904h;
                            boolean z5 = true;
                            boolean z7 = I.f23903g == null || I.f23902f == null;
                            Continuation continuation = null;
                            if (!z7 && p0Var.d() != f0.f23875b) {
                                p0Var.j(f0.f23874a);
                                I.f23902f = null;
                                I.f23903g = null;
                            }
                            if (z7) {
                                p0 activity = supportChat2.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                                Intrinsics.checkNotNullParameter(activity, "activity");
                                final com.android.billingclient.api.i iVar = new com.android.billingclient.api.i();
                                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity);
                                iVar.f4029c = bottomSheetDialog;
                                bottomSheetDialog.setContentView(activity.getLayoutInflater().inflate(R.layout.gallery_bottom_sheet, (ViewGroup) null));
                                TextView textView = (TextView) bottomSheetDialog.findViewById(R.id.pickVisualMedia_tv);
                                if (textView != null) {
                                    textView.setVisibility(iVar.f4027a ? 0 : 8);
                                }
                                eg.c0.t(d1.g(bottomSheetDialog), null, null, new oe.j(iVar, activity, continuation, 25), 3);
                                TextView textView2 = (TextView) bottomSheetDialog.findViewById(R.id.gallery_tv);
                                if (textView2 != null) {
                                    final int i102 = 0;
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: sd.e
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i102) {
                                                case 0:
                                                    com.android.billingclient.api.i iVar2 = iVar;
                                                    f fVar = (f) iVar2.f4028b;
                                                    if (fVar != null) {
                                                        SupportChat supportChat3 = (SupportChat) fVar;
                                                        g.b bVar = supportChat3.f7056o;
                                                        supportChat3.I().getClass();
                                                        Intent intent = new Intent();
                                                        intent.setType("*/*");
                                                        ArrayList arrayList = new ArrayList();
                                                        arrayList.addAll(lc.d.f19672b);
                                                        arrayList.addAll(lc.d.f19671a);
                                                        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[0]));
                                                        intent.setAction("android.intent.action.GET_CONTENT");
                                                        Intent createChooser = Intent.createChooser(intent, "Select File");
                                                        Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
                                                        bVar.a(createChooser);
                                                        supportChat3.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 4), 2);
                                                    }
                                                    iVar2.a();
                                                    break;
                                                default:
                                                    com.android.billingclient.api.i iVar3 = iVar;
                                                    f fVar2 = (f) iVar3.f4028b;
                                                    if (fVar2 != null) {
                                                        SupportChat supportChat4 = (SupportChat) fVar2;
                                                        g.b bVar2 = supportChat4.f7057p;
                                                        h.b.b();
                                                        h.e mediaType = h.e.f10341a;
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        h.c defaultTab = h.c.f10339a;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        h.b.b();
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        g.i iVar4 = new g.i();
                                                        iVar4.f9647a = h.d.f10340a;
                                                        h.b.b();
                                                        iVar4.f9648b = defaultTab;
                                                        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                        iVar4.f9647a = mediaType;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "<set-?>");
                                                        iVar4.f9648b = defaultTab;
                                                        bVar2.a(iVar4);
                                                        supportChat4.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 5), 2);
                                                    }
                                                    iVar3.a();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                TextView textView3 = (TextView) bottomSheetDialog.findViewById(R.id.pickVisualMedia_tv);
                                if (textView3 != null) {
                                    final int i11 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: sd.e
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i11) {
                                                case 0:
                                                    com.android.billingclient.api.i iVar2 = iVar;
                                                    f fVar = (f) iVar2.f4028b;
                                                    if (fVar != null) {
                                                        SupportChat supportChat3 = (SupportChat) fVar;
                                                        g.b bVar = supportChat3.f7056o;
                                                        supportChat3.I().getClass();
                                                        Intent intent = new Intent();
                                                        intent.setType("*/*");
                                                        ArrayList arrayList = new ArrayList();
                                                        arrayList.addAll(lc.d.f19672b);
                                                        arrayList.addAll(lc.d.f19671a);
                                                        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[0]));
                                                        intent.setAction("android.intent.action.GET_CONTENT");
                                                        Intent createChooser = Intent.createChooser(intent, "Select File");
                                                        Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
                                                        bVar.a(createChooser);
                                                        supportChat3.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 4), 2);
                                                    }
                                                    iVar2.a();
                                                    break;
                                                default:
                                                    com.android.billingclient.api.i iVar3 = iVar;
                                                    f fVar2 = (f) iVar3.f4028b;
                                                    if (fVar2 != null) {
                                                        SupportChat supportChat4 = (SupportChat) fVar2;
                                                        g.b bVar2 = supportChat4.f7057p;
                                                        h.b.b();
                                                        h.e mediaType = h.e.f10341a;
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        h.c defaultTab = h.c.f10339a;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        h.b.b();
                                                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                                                        g.i iVar4 = new g.i();
                                                        iVar4.f9647a = h.d.f10340a;
                                                        h.b.b();
                                                        iVar4.f9648b = defaultTab;
                                                        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                        iVar4.f9647a = mediaType;
                                                        Intrinsics.checkNotNullParameter(defaultTab, "<set-?>");
                                                        iVar4.f9648b = defaultTab;
                                                        bVar2.a(iVar4);
                                                        supportChat4.I().getClass();
                                                        c0.t(MyApp.f6830c, b0.b(), null, new cd.s(new cd.d(), null, 5), 2);
                                                    }
                                                    iVar3.a();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Context context = supportChat2.getContext();
                                if (context == null) {
                                    break;
                                } else {
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    if (!aa.b.h()) {
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        break;
                                    }
                                    iVar.f4027a = z5;
                                    TextView textView4 = (TextView) bottomSheetDialog.findViewById(R.id.pickVisualMedia_tv);
                                    if (textView4 != null) {
                                        textView4.setVisibility(iVar.f4027a ? 0 : 8);
                                    }
                                    if (((sd.h) iVar.f4030d) != null) {
                                        RecyclerView recyclerView = (RecyclerView) bottomSheetDialog.findViewById(R.id.gallery_recycler);
                                        if (recyclerView != null) {
                                            recyclerView.setAdapter(null);
                                            recyclerView.setAdapter((sd.h) iVar.f4030d);
                                        }
                                        sd.h hVar = (sd.h) iVar.f4030d;
                                        if (hVar != null) {
                                            hVar.notifyDataSetChanged();
                                        }
                                    }
                                    iVar.f4028b = supportChat2;
                                    bottomSheetDialog.show();
                                    supportChat2.I().getClass();
                                    eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), null, 1), 2);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        g gVar5 = (g) this.f22459a;
        if (gVar5 != null) {
            gVar5.f8943f.setOnTouchListener(new View.OnTouchListener() { // from class: te.v
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    EditText editText;
                    SupportChat supportChat = SupportChat.this;
                    ec.g gVar6 = (ec.g) supportChat.f22459a;
                    if (gVar6 == null || (editText = gVar6.f8944g) == null || !editText.isFocused()) {
                        return false;
                    }
                    editText.clearFocus();
                    InputMethodManager inputMethodManager = supportChat.f7048f;
                    if (inputMethodManager == null) {
                        return true;
                    }
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return true;
                }
            });
        }
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        l0 I = I();
        t1 t1Var = I.f23905i;
        Continuation continuation = null;
        if (t1Var != null) {
            t1Var.k(null);
        }
        I.f23905i = null;
        c0.t(MyApp.f6830c, null, null, new h0(I, continuation, 3), 3);
        u1.a i5 = d1.i(I);
        e eVar = m0.f9201a;
        c0.t(i5, lg.d.f20063c, null, new j0(I, continuation, 1), 2);
        pd.x G = G();
        G.f21807d.h((List) G.f21818p.getValue());
        I().f23904h.e(getViewLifecycleOwner(), this.f7054m);
        I().f23899c.e(getViewLifecycleOwner(), this.q);
        q qVar = this.f7049g;
        if (qVar != null) {
            qVar.registerAdapterDataObserver(this.f7051i);
        }
        I().i(false);
        I().f23908m.e(this, this.f7052k);
        d1.a(I().j).e(this, this.f7053l);
        androidx.lifecycle.z lifecycleScope = d1.g(this);
        e0 lifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "getViewLifecycleOwner(...)");
        v block = new v(2, this, SupportChat.class, "progress", "progress(Lcom/sports/insider/domain/entity/common/ProgressSF;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4);
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f7050h = c0.t(lifecycleScope, m0.f9201a, null, new j(lifecycleOwner, block, continuation, 20), 2);
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        t1 t1Var = this.f7050h;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f7050h = null;
        l0 I = I();
        t1 t1Var2 = I.f23905i;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        I.f23905i = null;
        I().f23908m.i(this.f7052k);
        d1.a(I().j).i(this.f7053l);
        I().f23904h.i(this.f7054m);
        I().f23899c.i(this.q);
        q qVar = this.f7049g;
        if (qVar != null) {
            qVar.unregisterAdapterDataObserver(this.f7051i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x020a, code lost:
    
        r0 = new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"};
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ag.c navArgsClass = Reflection.getOrCreateKotlinClass(a0.class);
        i argumentProducer = new i(14, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        l0 I = I();
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = u6.h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object[] objArr = {bundle2};
        String[] strArr = null;
        Object invoke = method.invoke(null, objArr);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        int a7 = ((a0) ((y1.i) invoke)).a();
        I.f23901e = a7 == -1 ? null : Integer.valueOf(a7);
        g gVar = (g) this.f22459a;
        if (gVar != null) {
            EditText editText = gVar.f8944g;
            editText.setScroller(new Scroller(view.getContext()));
            editText.setMovementMethod(new ScrollingMovementMethod());
        }
        q qVar = new q(this);
        this.f7049g = qVar;
        g gVar2 = (g) this.f22459a;
        if (gVar2 != null) {
            gVar2.f8943f.setAdapter(qVar);
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f7047e = new x(context);
        g gVar3 = (g) this.f22459a;
        if (gVar3 != null) {
            ImageView imageView = gVar3.f8939b;
            Integer valueOf = Integer.valueOf(R.drawable.ic_clip);
            o a10 = c4.y.a(imageView.getContext());
            q4.e eVar2 = new q4.e(imageView.getContext());
            eVar2.f21940c = valueOf;
            q4.j.d(eVar2, imageView);
            ((c4.v) a10).a(eVar2.a());
        }
        g gVar4 = (g) this.f22459a;
        if (gVar4 != null) {
            ImageView imageView2 = gVar4.f8940c;
            Integer valueOf2 = Integer.valueOf(R.drawable.ok_one);
            o a11 = c4.y.a(imageView2.getContext());
            q4.e eVar3 = new q4.e(imageView2.getContext());
            eVar3.f21940c = valueOf2;
            q4.j.d(eVar3, imageView2);
            ((c4.v) a11).a(eVar3.a());
        }
        g gVar5 = (g) this.f22459a;
        if (gVar5 != null) {
            ImageView imageView3 = gVar5.f8941d;
            Integer valueOf3 = Integer.valueOf(R.drawable.ic_hourglass_empty);
            o a12 = c4.y.a(imageView3.getContext());
            q4.e eVar4 = new q4.e(imageView3.getContext());
            eVar4.f21940c = valueOf3;
            q4.j.d(eVar4, imageView3);
            ((c4.v) a12).a(eVar4.a());
        }
        g gVar6 = (g) this.f22459a;
        if (gVar6 != null) {
            ImageView imageView4 = gVar6.f8946i;
            Context context2 = imageView4.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            q4.e eVar5 = new q4.e(context2);
            eVar5.f21940c = 2131231076;
            t4.b[] bVarArr = {new xe.h(Color.parseColor("#48A3C5"))};
            c4.k kVar = q4.i.f21995a;
            q4.i.a(eVar5, kotlin.collections.p.z(bVarArr));
            q4.j.d(eVar5, imageView4);
            q4.h a13 = eVar5.a();
            Context context3 = imageView4.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ((c4.v) c4.y.a(context3)).a(a13);
        }
        g gVar7 = (g) this.f22459a;
        if (gVar7 != null) {
            ConstraintLayout constraintLayout = gVar7.f8942e;
            Context context4 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            q4.e eVar6 = new q4.e(context4);
            eVar6.f21940c = Integer.valueOf(R.drawable.support_edittext_background);
            eVar6.f21941d = new r7.a(10, constraintLayout);
            q4.h a14 = eVar6.a();
            Context context5 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            ((c4.v) c4.y.a(context5)).a(a14);
        }
        I().f23906k.e(getViewLifecycleOwner(), this.j);
        l0 I2 = I();
        Context context6 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        I2.getClass();
        Intrinsics.checkNotNullParameter(context6, "context");
        I2.f23900d.getClass();
        Intrinsics.checkNotNullParameter(context6, "context");
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullParameter(context6, "context");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33) {
            if (i5 < 33) {
            }
        } else if (i5 != 33) {
            if (i5 < 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            }
        }
        if (strArr != null) {
            this.f7055n.a(strArr);
        }
    }
}
