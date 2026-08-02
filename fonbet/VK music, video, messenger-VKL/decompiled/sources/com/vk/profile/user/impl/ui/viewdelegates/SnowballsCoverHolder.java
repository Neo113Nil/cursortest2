package com.vk.profile.user.impl.ui.viewdelegates;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction;
import com.vk.stat.scheme.SchemeStat$TypeSnowballEvents;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.mixed.q;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.awt0;
import xsna.b0u0;
import xsna.bpn0;
import xsna.c230;
import xsna.cbq;
import xsna.d9f0;
import xsna.da50;
import xsna.dw20;
import xsna.e3m;
import xsna.edk0;
import xsna.enj;
import xsna.fdk0;
import xsna.g880;
import xsna.gzp0;
import xsna.gzs;
import xsna.hz20;
import xsna.iah0;
import xsna.idk0;
import xsna.it40;
import xsna.iut0;
import xsna.izs;
import xsna.klw;
import xsna.lov;
import xsna.o19;
import xsna.rdl;
import xsna.s3q0;
import xsna.yy0;
import xsna.zrp;

/* compiled from: SnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public final class SnowballsCoverHolder implements lov {
    public final SnowballsCoverView a;
    public d9f0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public dw20 g;
    public final bpn0 h;
    public final int b = iah0.a(25);
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final int f = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SnowballsCoverHolder.kt */
    public static final class SnowballModalEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SnowballModalEvent[] $VALUES;
        public static final SnowballModalEvent ACTION_BUTTON_CLICK;
        public static final SnowballModalEvent CLOSE;
        public static final SnowballModalEvent SECONDARY;
        public static final SnowballModalEvent SKIP;

        /* compiled from: SnowballsCoverHolder.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SnowballModalEvent.values().length];
                try {
                    iArr[SnowballModalEvent.ACTION_BUTTON_CLICK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SnowballModalEvent.SKIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SnowballModalEvent.CLOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SnowballModalEvent.SECONDARY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            SnowballModalEvent snowballModalEvent = new SnowballModalEvent("ACTION_BUTTON_CLICK", 0);
            ACTION_BUTTON_CLICK = snowballModalEvent;
            SnowballModalEvent snowballModalEvent2 = new SnowballModalEvent(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 1);
            SKIP = snowballModalEvent2;
            SnowballModalEvent snowballModalEvent3 = new SnowballModalEvent("CLOSE", 2);
            CLOSE = snowballModalEvent3;
            SnowballModalEvent snowballModalEvent4 = new SnowballModalEvent("SECONDARY", 3);
            SECONDARY = snowballModalEvent4;
            SnowballModalEvent[] snowballModalEventArr = {snowballModalEvent, snowballModalEvent2, snowballModalEvent3, snowballModalEvent4};
            $VALUES = snowballModalEventArr;
            $ENTRIES = new asp(snowballModalEventArr);
        }

        public SnowballModalEvent() {
            throw null;
        }

        public static SnowballModalEvent valueOf(String str) {
            return (SnowballModalEvent) Enum.valueOf(SnowballModalEvent.class, str);
        }

        public static SnowballModalEvent[] values() {
            return (SnowballModalEvent[]) $VALUES.clone();
        }
    }

    /* compiled from: SnowballsCoverHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<SnowballsCoverView.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(SnowballsCoverView.a aVar) {
            d9f0 d9f0Var;
            String str;
            final SnowballsCoverView.a aVar2 = aVar;
            final SnowballsCoverHolder snowballsCoverHolder = (SnowballsCoverHolder) this.receiver;
            final Context context = snowballsCoverHolder.a.getContext();
            dw20.b bVar = new dw20.b(context, null);
            cbq.a(bVar);
            d9f0 d9f0Var2 = snowballsCoverHolder.c;
            if ((d9f0Var2 == null || (str = d9f0Var2.d.f) == null || ((dw20.b) dw20.a.g0(bVar, new klw(new rdl(context), str), false, 6)) == null) && (d9f0Var = snowballsCoverHolder.c) != null) {
                Integer valueOf = d9f0Var.d.e == null ? Integer.valueOf(R.drawable.vk_icon_illustration_snowball_192h) : null;
                if (valueOf != null) {
                    bVar.L(valueOf.intValue());
                }
            }
            float f = 56;
            bVar.Q0(iah0.a(f), iah0.a(f));
            d9f0 d9f0Var3 = snowballsCoverHolder.c;
            String str2 = d9f0Var3 != null ? d9f0Var3.d.a : null;
            String string = context.getString((d9f0Var3 == null || !d9f0Var3.f) ? R.string.received_throws_friend_title : R.string.received_throws_current_user_title);
            if (str2 == null) {
                str2 = string;
            }
            bVar.w0(str2);
            bVar.A0(Integer.valueOf(R.style.VkUiTypography_Title2));
            d9f0 d9f0Var4 = snowballsCoverHolder.c;
            String str3 = d9f0Var4 != null ? d9f0Var4.d.b : null;
            String string2 = context.getString(R.string.received_throws_subtitle);
            if (str3 == null) {
                str3 = string2;
            }
            bVar.s0(str3);
            Integer valueOf2 = Integer.valueOf(R.style.VkUiTypography_Subhead);
            e.a aVar3 = bVar.d;
            aVar3.d0 = valueOf2;
            bVar.t0(e3m.f(R.attr.vk_ui_text_subhead, context));
            d9f0 d9f0Var5 = snowballsCoverHolder.c;
            String str4 = d9f0Var5 != null ? d9f0Var5.d.c : null;
            String string3 = context.getString(R.string.received_throws_btn);
            if (str4 == null) {
                str4 = string3;
            }
            bVar.j0(str4, new yy0(snowballsCoverHolder, aVar2, context, 7));
            d9f0 d9f0Var6 = snowballsCoverHolder.c;
            String str5 = d9f0Var6 != null ? d9f0Var6.d.g : null;
            if (str5 != null) {
                hz20 hz20Var = new hz20(aVar2, context) { // from class: xsna.ddk0
                    public final /* synthetic */ Context c;

                    {
                        this.c = context;
                    }

                    @Override // xsna.hz20
                    public final void a(int i) {
                        String str6;
                        SnowballsCoverHolder.SnowballModalEvent snowballModalEvent = SnowballsCoverHolder.SnowballModalEvent.SECONDARY;
                        SnowballsCoverHolder snowballsCoverHolder2 = SnowballsCoverHolder.this;
                        snowballsCoverHolder2.c(snowballModalEvent);
                        dw20 dw20Var = snowballsCoverHolder2.g;
                        if (dw20Var != null) {
                            dw20Var.dismiss();
                        }
                        maz mazVar = (maz) snowballsCoverHolder2.h.getValue();
                        d9f0 d9f0Var7 = snowballsCoverHolder2.c;
                        if (d9f0Var7 == null || (str6 = d9f0Var7.d.h) == null) {
                            str6 = "https://vk.cc/snowballs";
                        }
                        maz.c(mazVar, this.c, str6, LaunchContext.A, null, null, 24);
                    }
                };
                Integer valueOf3 = Integer.valueOf(R.drawable.transparent);
                aVar3.O0 = str5;
                aVar3.P0 = hz20Var;
                aVar3.Q0 = valueOf3;
                bVar.M0();
            }
            bVar.F(enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, context), context.getString(R.string.accessibility_close));
            bVar.b0(new c230(snowballsCoverHolder, aVar2)).X(new g880(snowballsCoverHolder, aVar2));
            d9f0 d9f0Var7 = snowballsCoverHolder.c;
            if (d9f0Var7 != null) {
                gzp0.a.c(new SchemeStat$TypeSnowballEvents(d9f0Var7.b, Long.valueOf(d9f0Var7.g), Boolean.valueOf(d9f0Var7.f)));
            }
            snowballsCoverHolder.g = bVar.I0(null);
            return s3q0.a;
        }
    }

    /* compiled from: SnowballsCoverHolder.kt */
    public static final class b implements f {
        public final /* synthetic */ izs b;

        public b(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    /* compiled from: SnowballsCoverHolder.kt */
    public static final class c implements l {
        public final /* synthetic */ izs b;

        public c(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public SnowballsCoverHolder(SnowballsCoverView snowballsCoverView) {
        this.a = snowballsCoverView;
        snowballsCoverView.addOnAttachStateChangeListener(new d(snowballsCoverView, this));
        snowballsCoverView.setOnSnowballClick(new a(1, this, SnowballsCoverHolder.class, "showModalBottomSheet", "showModalBottomSheet(Lcom/vk/profile/design/view/cover/SnowballsCoverView$Snowball;)V", 0));
        this.h = new bpn0(new da50(this, 23));
    }

    @Override // xsna.lov
    public final void b(d9f0 d9f0Var, gzs<? extends List<Rect>> gzsVar, int i, int i2) {
        if (d9f0Var.equals(this.c)) {
            return;
        }
        this.c = d9f0Var;
        SnowballsCoverView snowballsCoverView = this.a;
        snowballsCoverView.getForbiddenZones().clear();
        List<Rect> invoke = gzsVar.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            if (o19.b((Rect) obj) > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            snowballsCoverView.a(i, (Rect) it.next());
            if (arrayList.size() == snowballsCoverView.getForbiddenZones().size()) {
                int i3 = d9f0Var.b;
                awt0.v(snowballsCoverView, true);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (snowballsCoverView.isLaidOut()) {
                    io.reactivex.rxjava3.disposables.c cVar = this.d;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.e.e();
                    this.d = new n(new q(new v(new fdk0(this, i3, i2)).q(io.reactivex.rxjava3.schedulers.a.a()), new c(new com.vk.profile.user.impl.ui.viewdelegates.b(this))).E0().m(io.reactivex.rxjava3.android.schedulers.a.b()), new b(new it40(this, 1))).subscribe(new b(new idk0(this)));
                } else {
                    snowballsCoverView.addOnLayoutChangeListener(new edk0(this, i3, i2));
                }
            }
        }
    }

    public final void c(SnowballModalEvent snowballModalEvent) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.Type type;
        snowballModalEvent.getClass();
        int i = SnowballModalEvent.a.$EnumSwitchMapping$0[snowballModalEvent.ordinal()];
        if (i == 1) {
            type = MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.Type.TRANSITION;
        } else if (i == 2) {
            type = MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.Type.SKIP;
        } else if (i == 3) {
            type = MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.Type.CLOSE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            type = MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.Type.SECONDARY;
        }
        d9f0 d9f0Var = this.c;
        gzp0.a.c(new MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction(type, d9f0Var != null ? Long.valueOf(d9f0Var.g) : null));
    }

    /* compiled from: ViewExt.kt */
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ SnowballsCoverHolder c;

        public d(SnowballsCoverView snowballsCoverView, SnowballsCoverHolder snowballsCoverHolder) {
            this.b = snowballsCoverView;
            this.c = snowballsCoverHolder;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            SnowballsCoverHolder snowballsCoverHolder = this.c;
            io.reactivex.rxjava3.disposables.c cVar = snowballsCoverHolder.d;
            if (cVar != null) {
                cVar.dispose();
            }
            snowballsCoverHolder.e.e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
