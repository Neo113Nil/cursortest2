package com.sports.insider.ui.settings;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e1;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import c1.a1;
import c4.o;
import c4.u;
import c4.y;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.settings.SettingFragment;
import com.sports.insider.ui.views.AvatarView;
import com.sports.insider.ui.views.LineDivGradientView;
import com.sports.insider.ui.views.SwitchButton;
import ec.z;
import eg.c0;
import eg.h1;
import eg.m0;
import eg.t1;
import g.b;
import gf.k;
import gf.t;
import hg.t0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.q;
import k2.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.d;
import m2.f0;
import mf.c;
import ne.a;
import ne.g;
import ne.h;
import org.json.JSONObject;
import pd.v;
import q4.i;
import q4.j;
import qd.e;
import rc.b0;
import sd.l;
import sd.m;
import sd.n;
import ve.o0;
import zc.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sports/insider/ui/settings/SettingFragment;", "Lqd/e;", "Lec/z;", "Landroid/view/View$OnClickListener;", "Lve/o0;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingFragment.kt\ncom/sports/insider/ui/settings/SettingFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n*L\n1#1,603:1\n17#2:604\n1#3:605\n414#4,5:606\n*S KotlinDebug\n*F\n+ 1 SettingFragment.kt\ncom/sports/insider/ui/settings/SettingFragment\n*L\n127#1:604\n138#1:606,5\n*E\n"})
/* loaded from: classes.dex */
public final class SettingFragment extends e<z> implements View.OnClickListener, o0 {

    /* renamed from: f, reason: collision with root package name */
    public final a f7010f;

    /* renamed from: g, reason: collision with root package name */
    public final a f7011g;

    /* renamed from: h, reason: collision with root package name */
    public final a f7012h;

    /* renamed from: i, reason: collision with root package name */
    public final a f7013i;
    public final a j;

    /* renamed from: k, reason: collision with root package name */
    public final a f7014k;

    /* renamed from: l, reason: collision with root package name */
    public final a f7015l;

    /* renamed from: m, reason: collision with root package name */
    public final a f7016m;

    /* renamed from: n, reason: collision with root package name */
    public final t f7017n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7018o;

    /* renamed from: p, reason: collision with root package name */
    public final b f7019p;
    public final Object q;

    /* JADX WARN: Type inference failed for: r0v0, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ne.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ne.a] */
    public SettingFragment() {
        final int i5 = 0;
        this.f7010f = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f7011g = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f7012h = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f7013i = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 4;
        this.j = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 5;
        this.f7014k = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 6;
        this.f7015l = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 7;
        this.f7016m = new q0(this) { // from class: ne.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20867b;

            {
                this.f20867b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        z zVar = (z) this.f20867b.f22459a;
                        if (zVar != null) {
                            zVar.f9076e.setText(str);
                            break;
                        }
                        break;
                    case 1:
                        String str2 = (String) obj;
                        z zVar2 = (z) this.f20867b.f22459a;
                        if (zVar2 != null) {
                            zVar2.f9077f.setText(str2);
                            break;
                        }
                        break;
                    case 2:
                        String str3 = (String) obj;
                        SettingFragment settingFragment = this.f20867b;
                        if (str3 != null) {
                            z zVar3 = (z) settingFragment.f22459a;
                            if (zVar3 != null) {
                                zVar3.D.setText(str3);
                                break;
                            }
                        } else {
                            z zVar4 = (z) settingFragment.f22459a;
                            if (zVar4 != null) {
                                zVar4.D.setText(R.string.with_store);
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        SettingFragment settingFragment2 = this.f20867b;
                        if (str4 != null) {
                            z zVar5 = (z) settingFragment2.f22459a;
                            if (zVar5 != null) {
                                zVar5.C.setText(str4);
                                break;
                            }
                        } else {
                            z zVar6 = (z) settingFragment2.f22459a;
                            if (zVar6 != null) {
                                zVar6.C.setText(R.string.sign_in);
                                break;
                            }
                        }
                        break;
                    case 4:
                        SettingFragment settingFragment3 = this.f20867b;
                        c0.t(d1.g(settingFragment3), null, null, new u(settingFragment3, (String) obj, (Continuation) null), 3);
                        break;
                    case 5:
                        String str5 = (String) obj;
                        z zVar7 = (z) this.f20867b.f22459a;
                        if (zVar7 != null) {
                            zVar7.E.setText(str5);
                            break;
                        }
                        break;
                    case 6:
                        Boolean bool = (Boolean) obj;
                        z zVar8 = (z) this.f20867b.f22459a;
                        if (zVar8 != null) {
                            zVar8.f9081k.setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        z zVar9 = (z) this.f20867b.f22459a;
                        if (zVar9 != null) {
                            zVar9.f9078g.setVisibility(Intrinsics.areEqual(bool2, Boolean.TRUE) ? 0 : 8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i17 = 0;
        this.f7017n = k.b(new Function0(this) { // from class: ne.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20869b;

            {
                this.f20869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        SettingFragment owner = this.f20869b;
                        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        o1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        m1 factory = owner.getDefaultViewModelProviderFactory();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        x xVar = new x(store, factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(oe.k.class, "modelClass");
                        Intrinsics.checkNotNullParameter(oe.k.class, "<this>");
                        ag.c modelClass = Reflection.getOrCreateKotlinClass(oe.k.class);
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        String r5 = d5.r(modelClass);
                        if (r5 != null) {
                            return (oe.k) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    case 1:
                        p0 requireActivity = this.f20869b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        return new m(requireActivity);
                    default:
                        p0 context = this.f20869b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        l lVar = new l(context);
                        lVar.requestWindowFeature(1);
                        Window window = lVar.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        int i18 = (int) (context.getResources().getDisplayMetrics().density * 16);
                        layoutParams.setMargins(i18, i18, i18, i18);
                        layoutParams.gravity = 17;
                        frameLayout.setLayoutParams(layoutParams);
                        Context context2 = frameLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        ve.h hVar = new ve.h(context2);
                        lVar.f23492c = hVar;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 17;
                        hVar.setLayoutParams(layoutParams2);
                        frameLayout.addView(hVar);
                        lVar.setOnDismissListener(new sd.i(0, lVar));
                        lVar.setContentView(frameLayout);
                        Window window2 = lVar.getWindow();
                        if (window2 != null) {
                            window2.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        lVar.setCanceledOnTouchOutside(true);
                        return lVar;
                }
            }
        });
        gf.l lVar = gf.l.f10028b;
        final int i18 = 1;
        this.f7018o = k.a(lVar, new Function0(this) { // from class: ne.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20869b;

            {
                this.f20869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        SettingFragment owner = this.f20869b;
                        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        o1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        m1 factory = owner.getDefaultViewModelProviderFactory();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        x xVar = new x(store, factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(oe.k.class, "modelClass");
                        Intrinsics.checkNotNullParameter(oe.k.class, "<this>");
                        ag.c modelClass = Reflection.getOrCreateKotlinClass(oe.k.class);
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        String r5 = d5.r(modelClass);
                        if (r5 != null) {
                            return (oe.k) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    case 1:
                        p0 requireActivity = this.f20869b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        return new m(requireActivity);
                    default:
                        p0 context = this.f20869b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        l lVar2 = new l(context);
                        lVar2.requestWindowFeature(1);
                        Window window = lVar2.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        int i182 = (int) (context.getResources().getDisplayMetrics().density * 16);
                        layoutParams.setMargins(i182, i182, i182, i182);
                        layoutParams.gravity = 17;
                        frameLayout.setLayoutParams(layoutParams);
                        Context context2 = frameLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        ve.h hVar = new ve.h(context2);
                        lVar2.f23492c = hVar;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 17;
                        hVar.setLayoutParams(layoutParams2);
                        frameLayout.addView(hVar);
                        lVar2.setOnDismissListener(new sd.i(0, lVar2));
                        lVar2.setContentView(frameLayout);
                        Window window2 = lVar2.getWindow();
                        if (window2 != null) {
                            window2.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        lVar2.setCanceledOnTouchOutside(true);
                        return lVar2;
                }
            }
        });
        b registerForActivityResult = registerForActivityResult(new e1(3), new io.sentry.clientreport.a(15));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f7019p = registerForActivityResult;
        final int i19 = 2;
        this.q = k.a(lVar, new Function0(this) { // from class: ne.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingFragment f20869b;

            {
                this.f20869b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        SettingFragment owner = this.f20869b;
                        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        o1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        m1 factory = owner.getDefaultViewModelProviderFactory();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        x xVar = new x(store, factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(oe.k.class, "modelClass");
                        Intrinsics.checkNotNullParameter(oe.k.class, "<this>");
                        ag.c modelClass = Reflection.getOrCreateKotlinClass(oe.k.class);
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        String r5 = d5.r(modelClass);
                        if (r5 != null) {
                            return (oe.k) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    case 1:
                        p0 requireActivity = this.f20869b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        return new m(requireActivity);
                    default:
                        p0 context = this.f20869b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        l lVar2 = new l(context);
                        lVar2.requestWindowFeature(1);
                        Window window = lVar2.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        int i182 = (int) (context.getResources().getDisplayMetrics().density * 16);
                        layoutParams.setMargins(i182, i182, i182, i182);
                        layoutParams.gravity = 17;
                        frameLayout.setLayoutParams(layoutParams);
                        Context context2 = frameLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        ve.h hVar = new ve.h(context2);
                        lVar2.f23492c = hVar;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.gravity = 17;
                        hVar.setLayoutParams(layoutParams2);
                        frameLayout.addView(hVar);
                        lVar2.setOnDismissListener(new sd.i(0, lVar2));
                        lVar2.setContentView(frameLayout);
                        Window window2 = lVar2.getWindow();
                        if (window2 != null) {
                            window2.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        lVar2.setCanceledOnTouchOutside(true);
                        return lVar2;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(SettingFragment settingFragment, c cVar) {
        g gVar;
        Object obj;
        int i5;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f20884c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f20884c = i10 - Integer.MIN_VALUE;
                obj = gVar.f20882a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f20884c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (Build.VERSION.SDK_INT >= 33) {
                        oe.k M = settingFragment.M();
                        gVar.f20884c = 1;
                        M.getClass();
                        k.b(new v(9));
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(d.f20063c, new a1(2, null, 8), gVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f19194a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                if (!((Boolean) obj).booleanValue()) {
                    settingFragment.f7019p.a("android.permission.POST_NOTIFICATIONS");
                }
                return Unit.f19194a;
            }
        }
        gVar = new g(settingFragment, cVar);
        obj = gVar.f20882a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = gVar.f20884c;
        if (i5 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.f19194a;
    }

    public static final void K(SettingFragment settingFragment, c4.m mVar) {
        AvatarView avatarView;
        settingFragment.getClass();
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        z zVar = (z) settingFragment.f22459a;
        if (zVar == null || (avatarView = zVar.f9073b) == null) {
            return;
        }
        avatarView.setBitmap(bitmap);
    }

    public static final void L(SettingFragment settingFragment, Context context, String str, int i5, int i10) {
        settingFragment.getClass();
        boolean z5 = str == null || str.length() == 0 || StringsKt.H(str);
        o a7 = y.a(context);
        q4.e eVar = new q4.e(context);
        int i11 = R.drawable.placeholder;
        Object obj = str;
        if (z5) {
            obj = Integer.valueOf(R.drawable.placeholder);
        }
        eVar.f21940c = obj;
        eVar.f21951o = r4.g.f22299b;
        if (i5 > 0 && i10 > 0) {
            eVar.c(i5, i10);
        }
        j.c(eVar, R.drawable.placeholder);
        eVar.f21948l = new eb.b(i11, 9);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        i.a(eVar, kotlin.collections.t.c(new t4.a()));
        eVar.f21941d = new i2.d(23, settingFragment);
        ((c4.v) a7).a(eVar.a());
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.settings_activity, viewGroup, false);
        int i5 = R.id.avatar;
        AvatarView avatarView = (AvatarView) y3.j(R.id.avatar, inflate);
        if (avatarView != null) {
            i5 = R.id.clearRepoAppFrame;
            LinearLayout linearLayout = (LinearLayout) y3.j(R.id.clearRepoAppFrame, inflate);
            if (linearLayout != null) {
                i5 = R.id.cloudPaymentPrioritySwitch;
                SwitchButton switchButton = (SwitchButton) y3.j(R.id.cloudPaymentPrioritySwitch, inflate);
                if (switchButton != null) {
                    i5 = R.id.current_lang;
                    TextView textView = (TextView) y3.j(R.id.current_lang, inflate);
                    if (textView != null) {
                        i5 = R.id.current_lang_en;
                        TextView textView2 = (TextView) y3.j(R.id.current_lang_en, inflate);
                        if (textView2 != null) {
                            i5 = R.id.div_profile;
                            if (((LineDivGradientView) y3.j(R.id.div_profile, inflate)) != null) {
                                i5 = R.id.elementCloudPaymentPriority;
                                if (((LinearLayout) y3.j(R.id.elementCloudPaymentPriority, inflate)) != null) {
                                    i5 = R.id.frameAlternativePayment;
                                    LinearLayout linearLayout2 = (LinearLayout) y3.j(R.id.frameAlternativePayment, inflate);
                                    if (linearLayout2 != null) {
                                        i5 = R.id.lang_linear;
                                        LinearLayout linearLayout3 = (LinearLayout) y3.j(R.id.lang_linear, inflate);
                                        if (linearLayout3 != null) {
                                            i5 = R.id.liveStateBtnSwitch;
                                            SwitchButton switchButton2 = (SwitchButton) y3.j(R.id.liveStateBtnSwitch, inflate);
                                            if (switchButton2 != null) {
                                                i5 = R.id.liveStateBtnSwitchDesc;
                                                TextView textView3 = (TextView) y3.j(R.id.liveStateBtnSwitchDesc, inflate);
                                                if (textView3 != null) {
                                                    i5 = R.id.memoryClearDataFrame;
                                                    LinearLayout linearLayout4 = (LinearLayout) y3.j(R.id.memoryClearDataFrame, inflate);
                                                    if (linearLayout4 != null) {
                                                        i5 = R.id.profile_frame;
                                                        LinearLayout linearLayout5 = (LinearLayout) y3.j(R.id.profile_frame, inflate);
                                                        if (linearLayout5 != null) {
                                                            i5 = R.id.profile_title;
                                                            TextView textView4 = (TextView) y3.j(R.id.profile_title, inflate);
                                                            if (textView4 != null) {
                                                                i5 = R.id.pushNewPredictionSwitch;
                                                                SwitchButton switchButton3 = (SwitchButton) y3.j(R.id.pushNewPredictionSwitch, inflate);
                                                                if (switchButton3 != null) {
                                                                    i5 = R.id.pushNewPredictionSwitchDesc;
                                                                    TextView textView5 = (TextView) y3.j(R.id.pushNewPredictionSwitchDesc, inflate);
                                                                    if (textView5 != null) {
                                                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                                                        i5 = R.id.supportSendMailFrame;
                                                                        LinearLayout linearLayout6 = (LinearLayout) y3.j(R.id.supportSendMailFrame, inflate);
                                                                        if (linearLayout6 != null) {
                                                                            i5 = R.id.testPushFrame;
                                                                            FrameLayout frameLayout2 = (FrameLayout) y3.j(R.id.testPushFrame, inflate);
                                                                            if (frameLayout2 != null) {
                                                                                i5 = R.id.textCloudPaymentPriority;
                                                                                TextView textView6 = (TextView) y3.j(R.id.textCloudPaymentPriority, inflate);
                                                                                if (textView6 != null) {
                                                                                    i5 = R.id.titleCloudPaymentPriority;
                                                                                    TextView textView7 = (TextView) y3.j(R.id.titleCloudPaymentPriority, inflate);
                                                                                    if (textView7 != null) {
                                                                                        i5 = R.id.tvCP;
                                                                                        TextView textView8 = (TextView) y3.j(R.id.tvCP, inflate);
                                                                                        if (textView8 != null) {
                                                                                            i5 = R.id.tvClear;
                                                                                            TextView textView9 = (TextView) y3.j(R.id.tvClear, inflate);
                                                                                            if (textView9 != null) {
                                                                                                i5 = R.id.tvClearDesc;
                                                                                                TextView textView10 = (TextView) y3.j(R.id.tvClearDesc, inflate);
                                                                                                if (textView10 != null) {
                                                                                                    i5 = R.id.tvLanguageTitle;
                                                                                                    TextView textView11 = (TextView) y3.j(R.id.tvLanguageTitle, inflate);
                                                                                                    if (textView11 != null) {
                                                                                                        i5 = R.id.tvMemory;
                                                                                                        TextView textView12 = (TextView) y3.j(R.id.tvMemory, inflate);
                                                                                                        if (textView12 != null) {
                                                                                                            i5 = R.id.tvNotify;
                                                                                                            TextView textView13 = (TextView) y3.j(R.id.tvNotify, inflate);
                                                                                                            if (textView13 != null) {
                                                                                                                i5 = R.id.tv_profile;
                                                                                                                TextView textView14 = (TextView) y3.j(R.id.tv_profile, inflate);
                                                                                                                if (textView14 != null) {
                                                                                                                    i5 = R.id.tvSupport;
                                                                                                                    TextView textView15 = (TextView) y3.j(R.id.tvSupport, inflate);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i5 = R.id.tvSupportDesc;
                                                                                                                        TextView textView16 = (TextView) y3.j(R.id.tvSupportDesc, inflate);
                                                                                                                        if (textView16 != null) {
                                                                                                                            i5 = R.id.user_data_tv;
                                                                                                                            TextView textView17 = (TextView) y3.j(R.id.user_data_tv, inflate);
                                                                                                                            if (textView17 != null) {
                                                                                                                                i5 = R.id.user_email_tv;
                                                                                                                                TextView textView18 = (TextView) y3.j(R.id.user_email_tv, inflate);
                                                                                                                                if (textView18 != null) {
                                                                                                                                    i5 = R.id.version_tv;
                                                                                                                                    TextView textView19 = (TextView) y3.j(R.id.version_tv, inflate);
                                                                                                                                    if (textView19 != null) {
                                                                                                                                        z zVar = new z(frameLayout, avatarView, linearLayout, switchButton, textView, textView2, linearLayout2, linearLayout3, switchButton2, textView3, linearLayout4, linearLayout5, textView4, switchButton3, textView5, linearLayout6, frameLayout2, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19);
                                                                                                                                        Intrinsics.checkNotNullExpressionValue(zVar, "inflate(...)");
                                                                                                                                        return zVar;
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

    @Override // qd.e
    public final void H(String authPlatformToken) {
        Continuation continuation = null;
        if (authPlatformToken == null || Intrinsics.areEqual(authPlatformToken, this.f22106b)) {
            M().getClass();
            t0 t0Var = rc.x.f22455a;
            Intrinsics.checkNotNullParameter("google authorization error", "msg");
            rc.x.f22455a.b(new gf.u(null, 500, "google authorization error"));
            return;
        }
        oe.k M = M();
        M.getClass();
        Intrinsics.checkNotNullParameter(authPlatformToken, "authPlatformToken");
        c0.t(d1.i(M), null, null, new oe.j(M, authPlatformToken, continuation, 0), 3);
    }

    public final oe.k M() {
        return (oe.k) this.f7017n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [gf.i, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        z zVar = (z) this.f22459a;
        Continuation continuation = null;
        if (Intrinsics.areEqual(view, zVar != null ? zVar.f9086p : null)) {
            M().getClass();
            new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickSupport"));
            try {
                M().getClass();
                k.b(new v(9));
                new cd.d().i("SettingScreen");
                ne.i iVar = new ne.i();
                Intrinsics.checkNotNullExpressionValue(iVar, "actionSettingFragmentToSupportChat(...)");
                p0 activity = getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new io.sentry.android.replay.util.c(13, this, iVar));
                    return;
                }
                return;
            } catch (IllegalArgumentException | Exception unused) {
                return;
            }
        }
        z zVar2 = (z) this.f22459a;
        int i5 = 2;
        if (Intrinsics.areEqual(view, zVar2 != null ? zVar2.f9074c : null)) {
            M().getClass();
            new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickMemoryClear"));
            m mVar = (m) this.f7018o.getValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(n.f23497d);
            Unit unit = Unit.f19194a;
            c0.t(d1.g(this), null, null, new f0(mVar, new sd.d(arrayList, 2), this, continuation, 6), 3);
            return;
        }
        z zVar3 = (z) this.f22459a;
        if (Intrinsics.areEqual(view, zVar3 != null ? zVar3.f9079h : null)) {
            M().getClass();
            new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickLanguage"));
            c0.t(d1.g(this), null, null, new h(this, continuation, 0), 3);
            return;
        }
        z zVar4 = (z) this.f22459a;
        if (!Intrinsics.areEqual(view, zVar4 != null ? zVar4.f9082l : null)) {
            z zVar5 = (z) this.f22459a;
            if (Intrinsics.areEqual(view, zVar5 != null ? zVar5.q : null)) {
                c0.t(d1.g(this), null, null, new bd.b(i5, continuation, 10), 3);
                return;
            }
            return;
        }
        M().getClass();
        new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickProfile"));
        AtomicBoolean atomicBoolean = M().f21209b;
        Boolean valueOf = atomicBoolean != null ? Boolean.valueOf(atomicBoolean.get()) : null;
        if (valueOf != null) {
            if (!valueOf.booleanValue()) {
                G();
                return;
            }
            oe.k M = M();
            int i10 = 0;
            h1 initLogoutDialog = new h1(1, this, SettingFragment.class, "initLogoutDialog", "initLogoutDialog(Lkotlinx/coroutines/CompletableDeferred;)V", i10, 2);
            k2.u funLogoutSignInGoogle = new k2.u(0, this, SettingFragment.class, "logoutSignInPlatformAsync", "logoutSignInPlatformAsync()Lkotlinx/coroutines/Deferred;", i10, 1);
            M.getClass();
            Intrinsics.checkNotNullParameter(initLogoutDialog, "initLogoutDialog");
            Intrinsics.checkNotNullParameter(funLogoutSignInGoogle, "funLogoutSignInGoogle");
            u1.a i11 = d1.i(M);
            lg.e eVar = m0.f9201a;
            c0.t(i11, q.f18523a, null, new f0(initLogoutDialog, funLogoutSignInGoogle, M, continuation, 7), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        z zVar = (z) this.f22459a;
        if (zVar != null) {
            zVar.f9075d.setOnCheckedChangeListener(this);
        }
        z zVar2 = (z) this.f22459a;
        if (zVar2 != null) {
            zVar2.f9084n.setOnCheckedChangeListener(this);
        }
        z zVar3 = (z) this.f22459a;
        if (zVar3 != null) {
            zVar3.f9080i.setOnCheckedChangeListener(this);
        }
        z zVar4 = (z) this.f22459a;
        if (zVar4 != null) {
            zVar4.f9086p.setOnClickListener(this);
        }
        z zVar5 = (z) this.f22459a;
        if (zVar5 != null) {
            zVar5.f9079h.setOnClickListener(this);
        }
        z zVar6 = (z) this.f22459a;
        if (zVar6 != null) {
            zVar6.f9082l.setOnClickListener(this);
        }
        z zVar7 = (z) this.f22459a;
        if (zVar7 != null) {
            zVar7.f9074c.setOnClickListener(this);
        }
        z zVar8 = (z) this.f22459a;
        if (zVar8 != null) {
            zVar8.q.setOnClickListener(this);
        }
        z zVar9 = (z) this.f22459a;
        if (zVar9 != null) {
            io.sentry.config.a.y(zVar9.E, 1000L, new d0(12));
        }
        oe.k M = M();
        M.getClass();
        Continuation continuation = null;
        c0.t(MyApp.f6830c, null, null, new ad.a(M, continuation, 21), 3);
        oe.k M2 = M();
        M2.getClass();
        u1.a i5 = d1.i(M2);
        lg.e eVar = m0.f9201a;
        c0.t(i5, d.f20063c, null, new oe.h(M2, continuation, 1), 2);
        c0.t(d1.i(M2), null, null, new oe.h(M2, continuation, 3), 3);
        androidx.lifecycle.p0 p0Var = M2.f21213f;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 9;
        ((zc.k) k.b(new v(i10)).getValue()).getClass();
        sb2.append(zc.k.h(R.string.txt_version));
        sb2.append(" 1.2.44.123 (google)\nClick to check the update");
        p0Var.j(sb2.toString());
        k.b(new v(i10));
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int i11 = Intrinsics.areEqual(c2, f.f25914e.getLanguage()) ? R.string.es_lang : Intrinsics.areEqual(c2, f.f25913d.getLanguage()) ? R.string.de_lang : Intrinsics.areEqual(c2, f.f25912c.getLanguage()) ? R.string.fr_lang : Intrinsics.areEqual(c2, f.f25911b.getLanguage()) ? R.string.pt_lang : Intrinsics.areEqual(c2, f.f25915f.getLanguage()) ? R.string.ru_lang : R.string.en_lang;
        androidx.lifecycle.p0 p0Var2 = M2.f21211d;
        t b10 = k.b(new v(i10));
        k.b(new v(i10));
        String language = d2.i.c();
        Intrinsics.checkNotNullParameter(language, "language");
        ((zc.k) b10.getValue()).getClass();
        Intrinsics.checkNotNullParameter(language, "language");
        p0Var2.j(((za.i) zc.k.e()).f(i11, language));
        androidx.lifecycle.p0 p0Var3 = M2.f21212e;
        t b11 = k.b(new v(i10));
        String language2 = f.f25910a.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
        Intrinsics.checkNotNullParameter(language2, "language");
        ((zc.k) b11.getValue()).getClass();
        Intrinsics.checkNotNullParameter(language2, "language");
        p0Var3.j(((za.i) zc.k.e()).f(i11, language2));
        M().f21211d.e(getViewLifecycleOwner(), this.f7010f);
        M().f21212e.e(getViewLifecycleOwner(), this.f7011g);
        M().f21213f.e(getViewLifecycleOwner(), this.f7014k);
        M().f21214g.e(getViewLifecycleOwner(), this.f7012h);
        M().f21215h.e(getViewLifecycleOwner(), this.f7013i);
        M().f21216i.e(getViewLifecycleOwner(), this.j);
        d1.a(M().f21217k).e(getViewLifecycleOwner(), this.f7016m);
        d1.a(M().j).e(getViewLifecycleOwner(), this.f7015l);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        z zVar = (z) this.f22459a;
        if (zVar != null) {
            zVar.f9075d.setOnCheckedChangeListener(null);
        }
        z zVar2 = (z) this.f22459a;
        if (zVar2 != null) {
            zVar2.f9084n.setOnCheckedChangeListener(null);
        }
        z zVar3 = (z) this.f22459a;
        if (zVar3 != null) {
            zVar3.f9080i.setOnCheckedChangeListener(null);
        }
        z zVar4 = (z) this.f22459a;
        if (zVar4 != null) {
            zVar4.f9086p.setOnClickListener(null);
        }
        z zVar5 = (z) this.f22459a;
        if (zVar5 != null) {
            zVar5.f9079h.setOnClickListener(null);
        }
        z zVar6 = (z) this.f22459a;
        if (zVar6 != null) {
            zVar6.f9082l.setOnClickListener(null);
        }
        z zVar7 = (z) this.f22459a;
        if (zVar7 != null) {
            zVar7.f9074c.setOnClickListener(null);
        }
        z zVar8 = (z) this.f22459a;
        if (zVar8 != null) {
            zVar8.q.setOnClickListener(null);
        }
        z zVar9 = (z) this.f22459a;
        if (zVar9 != null) {
            zVar9.E.setOnClickListener(null);
        }
        M().f21211d.i(this.f7010f);
        M().f21212e.i(this.f7011g);
        M().f21213f.i(this.f7014k);
        M().f21214g.i(this.f7012h);
        M().f21215h.i(this.f7013i);
        M().f21216i.i(this.j);
        d1.a(M().f21217k).i(this.f7016m);
        d1.a(M().j).i(this.f7015l);
        oe.k M = M();
        t1 t1Var = M.f21210c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        M.f21210c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Continuation continuation = null;
        c0.t(d1.g(this), null, null, new ne.f(this, continuation, 1), 3);
        c0.t(d1.g(this), null, null, new h(this, continuation, 4), 3);
    }
}
