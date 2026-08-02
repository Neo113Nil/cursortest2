package com.sports.insider.ui.subs;

import ag.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.q0;
import c4.w;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.subs.ListSubsFragment;
import com.sports.insider.ui.views.FrameGradientWithHead;
import ec.d;
import eg.m0;
import eg.y;
import gf.k;
import gf.t;
import ic.i0;
import java.lang.reflect.Method;
import java.util.Arrays;
import jg.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import lg.e;
import q4.r;
import rd.a;
import se.b;
import se.j;
import se.p;
import u6.h;
import wc.i;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/subs/ListSubsFragment;", "Lrd/a;", "Lec/d;", "<init>", "()V", "Lse/e;", "safeArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListSubsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSubsFragment.kt\ncom/sports/insider/ui/subs/ListSubsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,304:1\n42#2,3:305\n*S KotlinDebug\n*F\n+ 1 ListSubsFragment.kt\ncom/sports/insider/ui/subs/ListSubsFragment\n*L\n78#1:305,3\n*E\n"})
/* loaded from: classes.dex */
public final class ListSubsFragment extends a<d> {

    /* renamed from: b, reason: collision with root package name */
    public final t f7037b = k.b(new me.a(16, this));

    /* renamed from: c, reason: collision with root package name */
    public final b f7038c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7039d;

    /* renamed from: e, reason: collision with root package name */
    public final b f7040e;

    /* renamed from: f, reason: collision with root package name */
    public final b f7041f;

    /* renamed from: g, reason: collision with root package name */
    public final b f7042g;

    /* renamed from: h, reason: collision with root package name */
    public final b f7043h;

    /* renamed from: i, reason: collision with root package name */
    public final b f7044i;

    /* JADX WARN: Type inference failed for: r0v2, types: [se.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [se.b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [se.b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [se.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [se.b] */
    /* JADX WARN: Type inference failed for: r0v7, types: [se.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [se.b] */
    public ListSubsFragment() {
        final int i5 = 3;
        this.f7038c = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i5) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 4;
        this.f7039d = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i10) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 5;
        this.f7040e = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i11) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 6;
        this.f7041f = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i12) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 0;
        this.f7042g = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i13) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f7043h = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i14) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 2;
        this.f7044i = new q0(this) { // from class: se.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListSubsFragment f23519b;

            {
                this.f23519b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.d dVar;
                ec.d dVar2;
                c0 c0Var;
                ec.d dVar3;
                ec.d dVar4;
                ec.d dVar5;
                switch (i15) {
                    case 0:
                        ic.g gVar = (ic.g) obj;
                        if (gVar != null && (dVar = (ec.d) this.f23519b.f22459a) != null) {
                            dVar.f8904l.setDetails(gVar);
                            break;
                        }
                        break;
                    case 1:
                        ic.g gVar2 = (ic.g) obj;
                        if (gVar2 != null && (dVar2 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar2.f8898e.setDetails(gVar2);
                            break;
                        }
                        break;
                    case 2:
                        ListSubsFragment listSubsFragment = this.f23519b;
                        i0 i0Var = (i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(listSubsFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 3:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            ListSubsFragment listSubsFragment2 = this.f23519b;
                            ec.d dVar6 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar6 != null) {
                                dVar6.f8915x.set1RubWeekCloudPayment(bool.booleanValue());
                            }
                            ec.d dVar7 = (ec.d) listSubsFragment2.f22459a;
                            if (dVar7 != null) {
                                dVar7.J.set1RubWeekCloudPayment(bool.booleanValue());
                                break;
                            }
                        }
                        break;
                    case 4:
                        ic.g gVar3 = (ic.g) obj;
                        if (gVar3 != null && (dVar3 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar3.f8915x.setDetails(gVar3);
                            break;
                        }
                        break;
                    case 5:
                        ic.g gVar4 = (ic.g) obj;
                        if (gVar4 != null && (dVar4 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar4.f8914w.setDetails(gVar4);
                            break;
                        }
                        break;
                    default:
                        ic.g gVar5 = (ic.g) obj;
                        if (gVar5 != null && (dVar5 = (ec.d) this.f23519b.f22459a) != null) {
                            dVar5.J.setDetails(gVar5);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_list_price_subs, viewGroup, false);
        int i5 = R.id.desc;
        TextView textView = (TextView) y3.j(R.id.desc, inflate);
        if (textView != null) {
            i5 = R.id.diamondDesc;
            TextView textView2 = (TextView) y3.j(R.id.diamondDesc, inflate);
            if (textView2 != null) {
                i5 = R.id.diamondFirstPrice;
                TextView textView3 = (TextView) y3.j(R.id.diamondFirstPrice, inflate);
                if (textView3 != null) {
                    i5 = R.id.diamondFrame;
                    FrameGradientWithHead frameGradientWithHead = (FrameGradientWithHead) y3.j(R.id.diamondFrame, inflate);
                    if (frameGradientWithHead != null) {
                        i5 = R.id.diamondFreePeriod;
                        TextView textView4 = (TextView) y3.j(R.id.diamondFreePeriod, inflate);
                        if (textView4 != null) {
                            i5 = R.id.diamondOldPrice;
                            TextView textView5 = (TextView) y3.j(R.id.diamondOldPrice, inflate);
                            if (textView5 != null) {
                                i5 = R.id.diamondPrice;
                                TextView textView6 = (TextView) y3.j(R.id.diamondPrice, inflate);
                                if (textView6 != null) {
                                    i5 = R.id.diamondTitle;
                                    TextView textView7 = (TextView) y3.j(R.id.diamondTitle, inflate);
                                    if (textView7 != null) {
                                        i5 = R.id.expressDesc;
                                        TextView textView8 = (TextView) y3.j(R.id.expressDesc, inflate);
                                        if (textView8 != null) {
                                            i5 = R.id.expressFirstPrice;
                                            TextView textView9 = (TextView) y3.j(R.id.expressFirstPrice, inflate);
                                            if (textView9 != null) {
                                                i5 = R.id.expressFrame;
                                                FrameGradientWithHead frameGradientWithHead2 = (FrameGradientWithHead) y3.j(R.id.expressFrame, inflate);
                                                if (frameGradientWithHead2 != null) {
                                                    i5 = R.id.expressFreePeriod;
                                                    TextView textView10 = (TextView) y3.j(R.id.expressFreePeriod, inflate);
                                                    if (textView10 != null) {
                                                        i5 = R.id.expressOldPrice;
                                                        TextView textView11 = (TextView) y3.j(R.id.expressOldPrice, inflate);
                                                        if (textView11 != null) {
                                                            i5 = R.id.expressPrice;
                                                            TextView textView12 = (TextView) y3.j(R.id.expressPrice, inflate);
                                                            if (textView12 != null) {
                                                                i5 = R.id.expressTitle;
                                                                TextView textView13 = (TextView) y3.j(R.id.expressTitle, inflate);
                                                                if (textView13 != null) {
                                                                    i5 = R.id.hintGoogle;
                                                                    TextView textView14 = (TextView) y3.j(R.id.hintGoogle, inflate);
                                                                    if (textView14 != null) {
                                                                        i5 = R.id.hintGoogleAfterExpress;
                                                                        TextView textView15 = (TextView) y3.j(R.id.hintGoogleAfterExpress, inflate);
                                                                        if (textView15 != null) {
                                                                            i5 = R.id.hintGoogleAfterLiveMonth;
                                                                            TextView textView16 = (TextView) y3.j(R.id.hintGoogleAfterLiveMonth, inflate);
                                                                            if (textView16 != null) {
                                                                                i5 = R.id.hintGoogleAfterLiveWeek;
                                                                                TextView textView17 = (TextView) y3.j(R.id.hintGoogleAfterLiveWeek, inflate);
                                                                                if (textView17 != null) {
                                                                                    i5 = R.id.hintGoogleAfterPremium;
                                                                                    TextView textView18 = (TextView) y3.j(R.id.hintGoogleAfterPremium, inflate);
                                                                                    if (textView18 != null) {
                                                                                        i5 = R.id.liveDesc;
                                                                                        TextView textView19 = (TextView) y3.j(R.id.liveDesc, inflate);
                                                                                        if (textView19 != null) {
                                                                                            i5 = R.id.liveFrameMonth;
                                                                                            FrameGradientWithHead frameGradientWithHead3 = (FrameGradientWithHead) y3.j(R.id.liveFrameMonth, inflate);
                                                                                            if (frameGradientWithHead3 != null) {
                                                                                                i5 = R.id.liveFrameWeek;
                                                                                                FrameGradientWithHead frameGradientWithHead4 = (FrameGradientWithHead) y3.j(R.id.liveFrameWeek, inflate);
                                                                                                if (frameGradientWithHead4 != null) {
                                                                                                    i5 = R.id.liveFreeDesc;
                                                                                                    TextView textView20 = (TextView) y3.j(R.id.liveFreeDesc, inflate);
                                                                                                    if (textView20 != null) {
                                                                                                        i5 = R.id.liveMonthFirstPrice;
                                                                                                        TextView textView21 = (TextView) y3.j(R.id.liveMonthFirstPrice, inflate);
                                                                                                        if (textView21 != null) {
                                                                                                            i5 = R.id.liveMonthFreePeriod;
                                                                                                            TextView textView22 = (TextView) y3.j(R.id.liveMonthFreePeriod, inflate);
                                                                                                            if (textView22 != null) {
                                                                                                                i5 = R.id.liveMonthOldPrice;
                                                                                                                TextView textView23 = (TextView) y3.j(R.id.liveMonthOldPrice, inflate);
                                                                                                                if (textView23 != null) {
                                                                                                                    i5 = R.id.liveMonthPrice;
                                                                                                                    TextView textView24 = (TextView) y3.j(R.id.liveMonthPrice, inflate);
                                                                                                                    if (textView24 != null) {
                                                                                                                        i5 = R.id.liveWeekFirstPrice;
                                                                                                                        TextView textView25 = (TextView) y3.j(R.id.liveWeekFirstPrice, inflate);
                                                                                                                        if (textView25 != null) {
                                                                                                                            i5 = R.id.liveWeekFreePeriod;
                                                                                                                            TextView textView26 = (TextView) y3.j(R.id.liveWeekFreePeriod, inflate);
                                                                                                                            if (textView26 != null) {
                                                                                                                                i5 = R.id.liveWeekOldPrice;
                                                                                                                                TextView textView27 = (TextView) y3.j(R.id.liveWeekOldPrice, inflate);
                                                                                                                                if (textView27 != null) {
                                                                                                                                    i5 = R.id.liveWeekPrice;
                                                                                                                                    TextView textView28 = (TextView) y3.j(R.id.liveWeekPrice, inflate);
                                                                                                                                    if (textView28 != null) {
                                                                                                                                        i5 = R.id.premiumDesc;
                                                                                                                                        TextView textView29 = (TextView) y3.j(R.id.premiumDesc, inflate);
                                                                                                                                        if (textView29 != null) {
                                                                                                                                            i5 = R.id.premiumFirstPrice;
                                                                                                                                            TextView textView30 = (TextView) y3.j(R.id.premiumFirstPrice, inflate);
                                                                                                                                            if (textView30 != null) {
                                                                                                                                                i5 = R.id.premiumFrame;
                                                                                                                                                FrameGradientWithHead frameGradientWithHead5 = (FrameGradientWithHead) y3.j(R.id.premiumFrame, inflate);
                                                                                                                                                if (frameGradientWithHead5 != null) {
                                                                                                                                                    i5 = R.id.premiumFreePeriod;
                                                                                                                                                    TextView textView31 = (TextView) y3.j(R.id.premiumFreePeriod, inflate);
                                                                                                                                                    if (textView31 != null) {
                                                                                                                                                        i5 = R.id.premiumOldPrice;
                                                                                                                                                        TextView textView32 = (TextView) y3.j(R.id.premiumOldPrice, inflate);
                                                                                                                                                        if (textView32 != null) {
                                                                                                                                                            i5 = R.id.premiumPrice;
                                                                                                                                                            TextView textView33 = (TextView) y3.j(R.id.premiumPrice, inflate);
                                                                                                                                                            if (textView33 != null) {
                                                                                                                                                                i5 = R.id.space_nav;
                                                                                                                                                                if (((FrameLayout) y3.j(R.id.space_nav, inflate)) != null) {
                                                                                                                                                                    d dVar = new d(inflate, textView, textView2, textView3, frameGradientWithHead, textView4, textView5, textView6, textView7, textView8, textView9, frameGradientWithHead2, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, frameGradientWithHead3, frameGradientWithHead4, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, frameGradientWithHead5, textView31, textView32, textView33);
                                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                                                                                                                                                                    return dVar;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public final p G() {
        return (p) this.f7037b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        p G = G();
        G.getClass();
        u1.a i5 = d1.i(G);
        e eVar = m0.f9201a;
        fg.e eVar2 = q.f18523a;
        CoroutineContext coroutineContext = G.L;
        eVar2.getClass();
        Continuation continuation = null;
        final int i10 = 2;
        eg.c0.t(i5, kotlin.coroutines.e.c(eVar2, coroutineContext), null, new se.k(G, null), 2);
        final int i11 = 4;
        final int i12 = 3;
        eg.c0.t(MyApp.f6830c, null, null, new r(G, continuation, i11), 3);
        u1.a i13 = d1.i(G);
        y yVar = new y("Sdk observer purchases");
        i iVar = G.A;
        iVar.getClass();
        w wVar = zc.a.f25907a;
        CoroutineContext c2 = kotlin.coroutines.e.c(yVar, wVar);
        lg.d dVar = lg.d.f20063c;
        final int i14 = 1;
        G.S = eg.c0.t(i13, c2.t(dVar), null, new j(G, continuation, i14), 2);
        u1.a i15 = d1.i(G);
        y yVar2 = new y("Sdk observer purchases");
        iVar.getClass();
        G.R = eg.c0.t(i15, kotlin.coroutines.e.c(yVar2, wVar).t(dVar), null, new j(G, continuation, i10), 2);
        G.N = eg.c0.t(d1.i(G), G.g(), null, new j(G, continuation, i12), 2);
        G.O = eg.c0.t(d1.i(G), G.g(), null, new j(G, continuation, i11), 2);
        G.P = eg.c0.t(d1.i(G), G.g(), null, new j(G, continuation, 5), 2);
        G.Q = eg.c0.t(d1.i(G), G.g(), null, new j(G, continuation, 6), 2);
        i.h(iVar);
        eg.c0.t(d1.i(G), null, null, new j(G, continuation, 8), 3);
        G().C.e(getViewLifecycleOwner(), this.f7044i);
        d1.a(G().D).e(getViewLifecycleOwner(), this.f7039d);
        d1.a(G().E).e(getViewLifecycleOwner(), this.f7040e);
        d1.a(G().F).e(getViewLifecycleOwner(), this.f7041f);
        d1.a(G().G).e(getViewLifecycleOwner(), this.f7042g);
        d1.a(G().H).e(getViewLifecycleOwner(), this.f7043h);
        G().K.e(getViewLifecycleOwner(), this.f7038c);
        d dVar2 = (d) this.f22459a;
        if (dVar2 != null) {
            final int i16 = 0;
            io.sentry.config.a.y(dVar2.J, 600L, new Function1(this) { // from class: se.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ListSubsFragment f23517b;

                {
                    this.f23517b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            ListSubsFragment listSubsFragment = this.f23517b;
                            p G2 = listSubsFragment.G();
                            p0 activity = listSubsFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            G2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            wc.i iVar2 = G2.A;
                            iVar2.getClass();
                            if (!da.r.c() && !da.r.f()) {
                                Object[] objArr = 0;
                                if (((Boolean) wc.i.a().f21709i.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar2.f25110a, null, new wc.f(iVar2, objArr == true ? 1 : 0, 15), 2);
                                } else {
                                    G2.J = "premium";
                                    String str = G2.f23580f;
                                    nc.f fVar = G2.f23596x;
                                    String planId = fVar != null ? fVar.planId() : null;
                                    nc.f fVar2 = G2.f23596x;
                                    G2.h(activity, str, planId, fVar2 != null ? fVar2.offerId() : null);
                                }
                            }
                            break;
                        case 1:
                            ListSubsFragment listSubsFragment2 = this.f23517b;
                            p G3 = listSubsFragment2.G();
                            p0 activity2 = listSubsFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                            G3.getClass();
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            wc.i iVar3 = G3.A;
                            iVar3.getClass();
                            if (!da.r.c() && !da.r.d()) {
                                Object[] objArr2 = 0;
                                if (((Boolean) wc.i.a().j.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar3.f25110a, null, new wc.f(iVar3, objArr2 == true ? 1 : 0, 13), 2);
                                } else {
                                    G3.J = "express";
                                    String str2 = G3.f23582h;
                                    nc.f fVar3 = G3.f23597y;
                                    String planId2 = fVar3 != null ? fVar3.planId() : null;
                                    nc.f fVar4 = G3.f23597y;
                                    G3.h(activity2, str2, planId2, fVar4 != null ? fVar4.offerId() : null);
                                }
                            }
                            break;
                        case 2:
                            ListSubsFragment listSubsFragment3 = this.f23517b;
                            p G4 = listSubsFragment3.G();
                            p0 activity3 = listSubsFragment3.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity3, "requireActivity(...)");
                            G4.getClass();
                            Intrinsics.checkNotNullParameter(activity3, "activity");
                            wc.i iVar4 = G4.A;
                            iVar4.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                Object[] objArr3 = 0;
                                if (((Boolean) wc.i.a().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar4.f25110a, null, new wc.f(iVar4, objArr3 == true ? 1 : 0, 12), 2);
                                } else {
                                    G4.J = "diamond";
                                    String str3 = G4.j;
                                    nc.f fVar5 = G4.f23598z;
                                    String planId3 = fVar5 != null ? fVar5.planId() : null;
                                    nc.f fVar6 = G4.f23598z;
                                    G4.h(activity3, str3, planId3, fVar6 != null ? fVar6.offerId() : null);
                                }
                            }
                            break;
                        case 3:
                            ListSubsFragment listSubsFragment4 = this.f23517b;
                            p G5 = listSubsFragment4.G();
                            p0 activity4 = listSubsFragment4.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity4, "requireActivity(...)");
                            G5.getClass();
                            Intrinsics.checkNotNullParameter(activity4, "activity");
                            wc.i iVar5 = G5.A;
                            iVar5.getClass();
                            if (!da.r.e()) {
                                Object[] objArr4 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar5.f25110a, null, new wc.f(iVar5, objArr4 == true ? 1 : 0, 14), 2);
                                } else {
                                    G5.J = "live";
                                    String str4 = G5.f23576b;
                                    nc.f fVar7 = G5.f23594v;
                                    String planId4 = fVar7 != null ? fVar7.planId() : null;
                                    nc.f fVar8 = G5.f23594v;
                                    G5.h(activity4, str4, planId4, fVar8 != null ? fVar8.offerId() : null);
                                }
                            }
                            break;
                        default:
                            ListSubsFragment listSubsFragment5 = this.f23517b;
                            p G6 = listSubsFragment5.G();
                            p0 activity5 = listSubsFragment5.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity5, "requireActivity(...)");
                            G6.getClass();
                            Intrinsics.checkNotNullParameter(activity5, "activity");
                            wc.i iVar6 = G6.A;
                            iVar6.getClass();
                            if (!da.r.e()) {
                                Object[] objArr5 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar6.f25110a, null, new wc.f(iVar6, objArr5 == true ? 1 : 0, 14), 2);
                                } else {
                                    G6.J = "live";
                                    String str5 = G6.f23578d;
                                    nc.f fVar9 = G6.f23595w;
                                    String planId5 = fVar9 != null ? fVar9.planId() : null;
                                    nc.f fVar10 = G6.f23595w;
                                    G6.h(activity5, str5, planId5, fVar10 != null ? fVar10.offerId() : null);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d dVar3 = (d) this.f22459a;
        if (dVar3 != null) {
            io.sentry.config.a.y(dVar3.f8904l, 600L, new Function1(this) { // from class: se.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ListSubsFragment f23517b;

                {
                    this.f23517b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            ListSubsFragment listSubsFragment = this.f23517b;
                            p G2 = listSubsFragment.G();
                            p0 activity = listSubsFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            G2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            wc.i iVar2 = G2.A;
                            iVar2.getClass();
                            if (!da.r.c() && !da.r.f()) {
                                Object[] objArr = 0;
                                if (((Boolean) wc.i.a().f21709i.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar2.f25110a, null, new wc.f(iVar2, objArr == true ? 1 : 0, 15), 2);
                                } else {
                                    G2.J = "premium";
                                    String str = G2.f23580f;
                                    nc.f fVar = G2.f23596x;
                                    String planId = fVar != null ? fVar.planId() : null;
                                    nc.f fVar2 = G2.f23596x;
                                    G2.h(activity, str, planId, fVar2 != null ? fVar2.offerId() : null);
                                }
                            }
                            break;
                        case 1:
                            ListSubsFragment listSubsFragment2 = this.f23517b;
                            p G3 = listSubsFragment2.G();
                            p0 activity2 = listSubsFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                            G3.getClass();
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            wc.i iVar3 = G3.A;
                            iVar3.getClass();
                            if (!da.r.c() && !da.r.d()) {
                                Object[] objArr2 = 0;
                                if (((Boolean) wc.i.a().j.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar3.f25110a, null, new wc.f(iVar3, objArr2 == true ? 1 : 0, 13), 2);
                                } else {
                                    G3.J = "express";
                                    String str2 = G3.f23582h;
                                    nc.f fVar3 = G3.f23597y;
                                    String planId2 = fVar3 != null ? fVar3.planId() : null;
                                    nc.f fVar4 = G3.f23597y;
                                    G3.h(activity2, str2, planId2, fVar4 != null ? fVar4.offerId() : null);
                                }
                            }
                            break;
                        case 2:
                            ListSubsFragment listSubsFragment3 = this.f23517b;
                            p G4 = listSubsFragment3.G();
                            p0 activity3 = listSubsFragment3.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity3, "requireActivity(...)");
                            G4.getClass();
                            Intrinsics.checkNotNullParameter(activity3, "activity");
                            wc.i iVar4 = G4.A;
                            iVar4.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                Object[] objArr3 = 0;
                                if (((Boolean) wc.i.a().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar4.f25110a, null, new wc.f(iVar4, objArr3 == true ? 1 : 0, 12), 2);
                                } else {
                                    G4.J = "diamond";
                                    String str3 = G4.j;
                                    nc.f fVar5 = G4.f23598z;
                                    String planId3 = fVar5 != null ? fVar5.planId() : null;
                                    nc.f fVar6 = G4.f23598z;
                                    G4.h(activity3, str3, planId3, fVar6 != null ? fVar6.offerId() : null);
                                }
                            }
                            break;
                        case 3:
                            ListSubsFragment listSubsFragment4 = this.f23517b;
                            p G5 = listSubsFragment4.G();
                            p0 activity4 = listSubsFragment4.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity4, "requireActivity(...)");
                            G5.getClass();
                            Intrinsics.checkNotNullParameter(activity4, "activity");
                            wc.i iVar5 = G5.A;
                            iVar5.getClass();
                            if (!da.r.e()) {
                                Object[] objArr4 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar5.f25110a, null, new wc.f(iVar5, objArr4 == true ? 1 : 0, 14), 2);
                                } else {
                                    G5.J = "live";
                                    String str4 = G5.f23576b;
                                    nc.f fVar7 = G5.f23594v;
                                    String planId4 = fVar7 != null ? fVar7.planId() : null;
                                    nc.f fVar8 = G5.f23594v;
                                    G5.h(activity4, str4, planId4, fVar8 != null ? fVar8.offerId() : null);
                                }
                            }
                            break;
                        default:
                            ListSubsFragment listSubsFragment5 = this.f23517b;
                            p G6 = listSubsFragment5.G();
                            p0 activity5 = listSubsFragment5.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity5, "requireActivity(...)");
                            G6.getClass();
                            Intrinsics.checkNotNullParameter(activity5, "activity");
                            wc.i iVar6 = G6.A;
                            iVar6.getClass();
                            if (!da.r.e()) {
                                Object[] objArr5 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar6.f25110a, null, new wc.f(iVar6, objArr5 == true ? 1 : 0, 14), 2);
                                } else {
                                    G6.J = "live";
                                    String str5 = G6.f23578d;
                                    nc.f fVar9 = G6.f23595w;
                                    String planId5 = fVar9 != null ? fVar9.planId() : null;
                                    nc.f fVar10 = G6.f23595w;
                                    G6.h(activity5, str5, planId5, fVar10 != null ? fVar10.offerId() : null);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d dVar4 = (d) this.f22459a;
        if (dVar4 != null) {
            io.sentry.config.a.y(dVar4.f8898e, 600L, new Function1(this) { // from class: se.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ListSubsFragment f23517b;

                {
                    this.f23517b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i10) {
                        case 0:
                            ListSubsFragment listSubsFragment = this.f23517b;
                            p G2 = listSubsFragment.G();
                            p0 activity = listSubsFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            G2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            wc.i iVar2 = G2.A;
                            iVar2.getClass();
                            if (!da.r.c() && !da.r.f()) {
                                Object[] objArr = 0;
                                if (((Boolean) wc.i.a().f21709i.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar2.f25110a, null, new wc.f(iVar2, objArr == true ? 1 : 0, 15), 2);
                                } else {
                                    G2.J = "premium";
                                    String str = G2.f23580f;
                                    nc.f fVar = G2.f23596x;
                                    String planId = fVar != null ? fVar.planId() : null;
                                    nc.f fVar2 = G2.f23596x;
                                    G2.h(activity, str, planId, fVar2 != null ? fVar2.offerId() : null);
                                }
                            }
                            break;
                        case 1:
                            ListSubsFragment listSubsFragment2 = this.f23517b;
                            p G3 = listSubsFragment2.G();
                            p0 activity2 = listSubsFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                            G3.getClass();
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            wc.i iVar3 = G3.A;
                            iVar3.getClass();
                            if (!da.r.c() && !da.r.d()) {
                                Object[] objArr2 = 0;
                                if (((Boolean) wc.i.a().j.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar3.f25110a, null, new wc.f(iVar3, objArr2 == true ? 1 : 0, 13), 2);
                                } else {
                                    G3.J = "express";
                                    String str2 = G3.f23582h;
                                    nc.f fVar3 = G3.f23597y;
                                    String planId2 = fVar3 != null ? fVar3.planId() : null;
                                    nc.f fVar4 = G3.f23597y;
                                    G3.h(activity2, str2, planId2, fVar4 != null ? fVar4.offerId() : null);
                                }
                            }
                            break;
                        case 2:
                            ListSubsFragment listSubsFragment3 = this.f23517b;
                            p G4 = listSubsFragment3.G();
                            p0 activity3 = listSubsFragment3.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity3, "requireActivity(...)");
                            G4.getClass();
                            Intrinsics.checkNotNullParameter(activity3, "activity");
                            wc.i iVar4 = G4.A;
                            iVar4.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                Object[] objArr3 = 0;
                                if (((Boolean) wc.i.a().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar4.f25110a, null, new wc.f(iVar4, objArr3 == true ? 1 : 0, 12), 2);
                                } else {
                                    G4.J = "diamond";
                                    String str3 = G4.j;
                                    nc.f fVar5 = G4.f23598z;
                                    String planId3 = fVar5 != null ? fVar5.planId() : null;
                                    nc.f fVar6 = G4.f23598z;
                                    G4.h(activity3, str3, planId3, fVar6 != null ? fVar6.offerId() : null);
                                }
                            }
                            break;
                        case 3:
                            ListSubsFragment listSubsFragment4 = this.f23517b;
                            p G5 = listSubsFragment4.G();
                            p0 activity4 = listSubsFragment4.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity4, "requireActivity(...)");
                            G5.getClass();
                            Intrinsics.checkNotNullParameter(activity4, "activity");
                            wc.i iVar5 = G5.A;
                            iVar5.getClass();
                            if (!da.r.e()) {
                                Object[] objArr4 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar5.f25110a, null, new wc.f(iVar5, objArr4 == true ? 1 : 0, 14), 2);
                                } else {
                                    G5.J = "live";
                                    String str4 = G5.f23576b;
                                    nc.f fVar7 = G5.f23594v;
                                    String planId4 = fVar7 != null ? fVar7.planId() : null;
                                    nc.f fVar8 = G5.f23594v;
                                    G5.h(activity4, str4, planId4, fVar8 != null ? fVar8.offerId() : null);
                                }
                            }
                            break;
                        default:
                            ListSubsFragment listSubsFragment5 = this.f23517b;
                            p G6 = listSubsFragment5.G();
                            p0 activity5 = listSubsFragment5.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity5, "requireActivity(...)");
                            G6.getClass();
                            Intrinsics.checkNotNullParameter(activity5, "activity");
                            wc.i iVar6 = G6.A;
                            iVar6.getClass();
                            if (!da.r.e()) {
                                Object[] objArr5 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar6.f25110a, null, new wc.f(iVar6, objArr5 == true ? 1 : 0, 14), 2);
                                } else {
                                    G6.J = "live";
                                    String str5 = G6.f23578d;
                                    nc.f fVar9 = G6.f23595w;
                                    String planId5 = fVar9 != null ? fVar9.planId() : null;
                                    nc.f fVar10 = G6.f23595w;
                                    G6.h(activity5, str5, planId5, fVar10 != null ? fVar10.offerId() : null);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d dVar5 = (d) this.f22459a;
        if (dVar5 != null) {
            io.sentry.config.a.y(dVar5.f8915x, 600L, new Function1(this) { // from class: se.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ListSubsFragment f23517b;

                {
                    this.f23517b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i12) {
                        case 0:
                            ListSubsFragment listSubsFragment = this.f23517b;
                            p G2 = listSubsFragment.G();
                            p0 activity = listSubsFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            G2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            wc.i iVar2 = G2.A;
                            iVar2.getClass();
                            if (!da.r.c() && !da.r.f()) {
                                Object[] objArr = 0;
                                if (((Boolean) wc.i.a().f21709i.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar2.f25110a, null, new wc.f(iVar2, objArr == true ? 1 : 0, 15), 2);
                                } else {
                                    G2.J = "premium";
                                    String str = G2.f23580f;
                                    nc.f fVar = G2.f23596x;
                                    String planId = fVar != null ? fVar.planId() : null;
                                    nc.f fVar2 = G2.f23596x;
                                    G2.h(activity, str, planId, fVar2 != null ? fVar2.offerId() : null);
                                }
                            }
                            break;
                        case 1:
                            ListSubsFragment listSubsFragment2 = this.f23517b;
                            p G3 = listSubsFragment2.G();
                            p0 activity2 = listSubsFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                            G3.getClass();
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            wc.i iVar3 = G3.A;
                            iVar3.getClass();
                            if (!da.r.c() && !da.r.d()) {
                                Object[] objArr2 = 0;
                                if (((Boolean) wc.i.a().j.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar3.f25110a, null, new wc.f(iVar3, objArr2 == true ? 1 : 0, 13), 2);
                                } else {
                                    G3.J = "express";
                                    String str2 = G3.f23582h;
                                    nc.f fVar3 = G3.f23597y;
                                    String planId2 = fVar3 != null ? fVar3.planId() : null;
                                    nc.f fVar4 = G3.f23597y;
                                    G3.h(activity2, str2, planId2, fVar4 != null ? fVar4.offerId() : null);
                                }
                            }
                            break;
                        case 2:
                            ListSubsFragment listSubsFragment3 = this.f23517b;
                            p G4 = listSubsFragment3.G();
                            p0 activity3 = listSubsFragment3.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity3, "requireActivity(...)");
                            G4.getClass();
                            Intrinsics.checkNotNullParameter(activity3, "activity");
                            wc.i iVar4 = G4.A;
                            iVar4.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                Object[] objArr3 = 0;
                                if (((Boolean) wc.i.a().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar4.f25110a, null, new wc.f(iVar4, objArr3 == true ? 1 : 0, 12), 2);
                                } else {
                                    G4.J = "diamond";
                                    String str3 = G4.j;
                                    nc.f fVar5 = G4.f23598z;
                                    String planId3 = fVar5 != null ? fVar5.planId() : null;
                                    nc.f fVar6 = G4.f23598z;
                                    G4.h(activity3, str3, planId3, fVar6 != null ? fVar6.offerId() : null);
                                }
                            }
                            break;
                        case 3:
                            ListSubsFragment listSubsFragment4 = this.f23517b;
                            p G5 = listSubsFragment4.G();
                            p0 activity4 = listSubsFragment4.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity4, "requireActivity(...)");
                            G5.getClass();
                            Intrinsics.checkNotNullParameter(activity4, "activity");
                            wc.i iVar5 = G5.A;
                            iVar5.getClass();
                            if (!da.r.e()) {
                                Object[] objArr4 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar5.f25110a, null, new wc.f(iVar5, objArr4 == true ? 1 : 0, 14), 2);
                                } else {
                                    G5.J = "live";
                                    String str4 = G5.f23576b;
                                    nc.f fVar7 = G5.f23594v;
                                    String planId4 = fVar7 != null ? fVar7.planId() : null;
                                    nc.f fVar8 = G5.f23594v;
                                    G5.h(activity4, str4, planId4, fVar8 != null ? fVar8.offerId() : null);
                                }
                            }
                            break;
                        default:
                            ListSubsFragment listSubsFragment5 = this.f23517b;
                            p G6 = listSubsFragment5.G();
                            p0 activity5 = listSubsFragment5.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity5, "requireActivity(...)");
                            G6.getClass();
                            Intrinsics.checkNotNullParameter(activity5, "activity");
                            wc.i iVar6 = G6.A;
                            iVar6.getClass();
                            if (!da.r.e()) {
                                Object[] objArr5 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar6.f25110a, null, new wc.f(iVar6, objArr5 == true ? 1 : 0, 14), 2);
                                } else {
                                    G6.J = "live";
                                    String str5 = G6.f23578d;
                                    nc.f fVar9 = G6.f23595w;
                                    String planId5 = fVar9 != null ? fVar9.planId() : null;
                                    nc.f fVar10 = G6.f23595w;
                                    G6.h(activity5, str5, planId5, fVar10 != null ? fVar10.offerId() : null);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d dVar6 = (d) this.f22459a;
        if (dVar6 != null) {
            io.sentry.config.a.y(dVar6.f8914w, 600L, new Function1(this) { // from class: se.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ListSubsFragment f23517b;

                {
                    this.f23517b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            ListSubsFragment listSubsFragment = this.f23517b;
                            p G2 = listSubsFragment.G();
                            p0 activity = listSubsFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            G2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            wc.i iVar2 = G2.A;
                            iVar2.getClass();
                            if (!da.r.c() && !da.r.f()) {
                                Object[] objArr = 0;
                                if (((Boolean) wc.i.a().f21709i.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar2.f25110a, null, new wc.f(iVar2, objArr == true ? 1 : 0, 15), 2);
                                } else {
                                    G2.J = "premium";
                                    String str = G2.f23580f;
                                    nc.f fVar = G2.f23596x;
                                    String planId = fVar != null ? fVar.planId() : null;
                                    nc.f fVar2 = G2.f23596x;
                                    G2.h(activity, str, planId, fVar2 != null ? fVar2.offerId() : null);
                                }
                            }
                            break;
                        case 1:
                            ListSubsFragment listSubsFragment2 = this.f23517b;
                            p G3 = listSubsFragment2.G();
                            p0 activity2 = listSubsFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                            G3.getClass();
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            wc.i iVar3 = G3.A;
                            iVar3.getClass();
                            if (!da.r.c() && !da.r.d()) {
                                Object[] objArr2 = 0;
                                if (((Boolean) wc.i.a().j.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar3.f25110a, null, new wc.f(iVar3, objArr2 == true ? 1 : 0, 13), 2);
                                } else {
                                    G3.J = "express";
                                    String str2 = G3.f23582h;
                                    nc.f fVar3 = G3.f23597y;
                                    String planId2 = fVar3 != null ? fVar3.planId() : null;
                                    nc.f fVar4 = G3.f23597y;
                                    G3.h(activity2, str2, planId2, fVar4 != null ? fVar4.offerId() : null);
                                }
                            }
                            break;
                        case 2:
                            ListSubsFragment listSubsFragment3 = this.f23517b;
                            p G4 = listSubsFragment3.G();
                            p0 activity3 = listSubsFragment3.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity3, "requireActivity(...)");
                            G4.getClass();
                            Intrinsics.checkNotNullParameter(activity3, "activity");
                            wc.i iVar4 = G4.A;
                            iVar4.getClass();
                            if (!da.r.c() && (!da.r.d() || !da.r.f())) {
                                Object[] objArr3 = 0;
                                if (((Boolean) wc.i.a().f21708h.getValue()).booleanValue()) {
                                    eg.c0.t(MyApp.f6830c, iVar4.f25110a, null, new wc.f(iVar4, objArr3 == true ? 1 : 0, 12), 2);
                                } else {
                                    G4.J = "diamond";
                                    String str3 = G4.j;
                                    nc.f fVar5 = G4.f23598z;
                                    String planId3 = fVar5 != null ? fVar5.planId() : null;
                                    nc.f fVar6 = G4.f23598z;
                                    G4.h(activity3, str3, planId3, fVar6 != null ? fVar6.offerId() : null);
                                }
                            }
                            break;
                        case 3:
                            ListSubsFragment listSubsFragment4 = this.f23517b;
                            p G5 = listSubsFragment4.G();
                            p0 activity4 = listSubsFragment4.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity4, "requireActivity(...)");
                            G5.getClass();
                            Intrinsics.checkNotNullParameter(activity4, "activity");
                            wc.i iVar5 = G5.A;
                            iVar5.getClass();
                            if (!da.r.e()) {
                                Object[] objArr4 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar5.f25110a, null, new wc.f(iVar5, objArr4 == true ? 1 : 0, 14), 2);
                                } else {
                                    G5.J = "live";
                                    String str4 = G5.f23576b;
                                    nc.f fVar7 = G5.f23594v;
                                    String planId4 = fVar7 != null ? fVar7.planId() : null;
                                    nc.f fVar8 = G5.f23594v;
                                    G5.h(activity4, str4, planId4, fVar8 != null ? fVar8.offerId() : null);
                                }
                            }
                            break;
                        default:
                            ListSubsFragment listSubsFragment5 = this.f23517b;
                            p G6 = listSubsFragment5.G();
                            p0 activity5 = listSubsFragment5.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity5, "requireActivity(...)");
                            G6.getClass();
                            Intrinsics.checkNotNullParameter(activity5, "activity");
                            wc.i iVar6 = G6.A;
                            iVar6.getClass();
                            if (!da.r.e()) {
                                Object[] objArr5 = 0;
                                if (wc.i.c()) {
                                    eg.c0.t(MyApp.f6830c, iVar6.f25110a, null, new wc.f(iVar6, objArr5 == true ? 1 : 0, 14), 2);
                                } else {
                                    G6.J = "live";
                                    String str5 = G6.f23578d;
                                    nc.f fVar9 = G6.f23595w;
                                    String planId5 = fVar9 != null ? fVar9.planId() : null;
                                    nc.f fVar10 = G6.f23595w;
                                    G6.h(activity5, str5, planId5, fVar10 != null ? fVar10.offerId() : null);
                                }
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        G().f();
        G().C.i(this.f7044i);
        d1.a(G().D).i(this.f7039d);
        d1.a(G().E).i(this.f7040e);
        d1.a(G().F).i(this.f7041f);
        d1.a(G().G).i(this.f7042g);
        d1.a(G().H).i(this.f7043h);
        G().K.i(this.f7038c);
        d dVar = (d) this.f22459a;
        if (dVar != null) {
            dVar.J.setOnClickListener(null);
            dVar.f8904l.setOnClickListener(null);
            dVar.f8898e.setOnClickListener(null);
            dVar.f8914w.setOnClickListener(null);
            dVar.f8915x.setOnClickListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        c navArgsClass = Reflection.getOrCreateKotlinClass(se.e.class);
        i3.i argumentProducer = new i3.i(12, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        p G = G();
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        int a7 = ((se.e) ((y1.i) invoke)).a();
        G.getClass();
        p.T = a7;
        i.h(G.A);
        G().A.getClass();
        new io.sentry.hints.j(6).E("open_plan");
        new cd.d().c("open_plan", null);
        eg.c0.t(d1.g(this), null, null, new me.y(this, null, 25), 3);
    }
}
