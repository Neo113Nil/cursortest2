package com.vk.channels.impl.post_settings;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.channels.impl.post_settings.adapter.PostSettingType;
import com.vk.channels.impl.post_settings.e;
import com.vk.channels.impl.post_settings.g;
import com.vk.channels.impl.post_settings.visible_to_dons.VisibleToDonsPickerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7c0;
import xsna.ao50;
import xsna.b7c0;
import xsna.baf0;
import xsna.bwu;
import xsna.c09;
import xsna.c5g;
import xsna.c7c0;
import xsna.ckc0;
import xsna.cn70;
import xsna.d7c0;
import xsna.e3m;
import xsna.e7c0;
import xsna.ekc0;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.fi6;
import xsna.g7c0;
import xsna.h7u0;
import xsna.hfz;
import xsna.iah0;
import xsna.ikv0;
import xsna.j7c0;
import xsna.lyk;
import xsna.m33;
import xsna.mhy;
import xsna.pp80;
import xsna.pvo0;
import xsna.rj60;
import xsna.rl3;
import xsna.s3q0;
import xsna.s5u0;
import xsna.utj;
import xsna.xz5;
import xsna.yn50;
import xsna.zk70;
import xsna.zla;

/* compiled from: PostSettingsViewController.kt */
/* loaded from: classes16.dex */
public final class f extends fi6<j7c0, e> implements e7c0 {
    public static final int n = cn70.b(64);
    public final lyk f;
    public final s5u0 g;
    public final Context h;
    public ViewGroup i;
    public a7c0 j;
    public VkButton k;
    public final SimpleDateFormat l;
    public final SimpleDateFormat m;

    public f(PostSettingsFragment postSettingsFragment, lyk lykVar, s5u0 s5u0Var) {
        super(R.layout.im_channel_post_settings, null);
        this.f = lykVar;
        this.g = s5u0Var;
        this.h = postSettingsFragment.requireContext();
        this.l = new SimpleDateFormat("dd MMM", Locale.getDefault());
        this.m = new SimpleDateFormat("HH:mm", Locale.getDefault());
    }

    @Override // xsna.e7c0
    public final void M() {
        O(e.d.b);
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.post_settings_list);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        a7c0 a7c0Var = new a7c0();
        a7c0Var.y0(new c7c0(this));
        a7c0Var.y0(new d7c0(this));
        a7c0Var.y0(new g7c0(this));
        a7c0Var.y0(new bwu());
        a7c0Var.y0(new zla(this));
        this.j = a7c0Var;
        recyclerView.setAdapter(a7c0Var);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.snackbar_container);
        this.i = viewGroup;
        f4m.q(n, viewGroup);
        VkButton vkButton = (VkButton) view.findViewById(R.id.publish_post_button);
        vkButton.setVisibility(0);
        vkButton.setOnClickListener(new xz5(this, 11));
        this.k = vkButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, int i2, String str) {
        ikv0.a aVar = new ikv0.a(this.h);
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(i2), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(str), (ikv0.d.b) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.o = Integer.valueOf(cn70.b(8));
        ikv0 b = aVar.b();
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            viewGroup = null;
        }
        utj utjVar = b.b;
        utjVar.l = null;
        utjVar.m = new WeakReference<>(viewGroup);
        utjVar.e();
    }

    public final String S(pp80 pp80Var) {
        boolean f = epx.f(pp80Var, pp80.a.a);
        Context context = this.h;
        if (f) {
            return context.getString(R.string.vkim_channels_post_settings_visible_to_dons_always);
        }
        if (pp80Var instanceof pp80.b) {
            return enj.f(R.plurals.days, ((pp80.b) pp80Var).a, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.e7c0
    public final void h(PostSettingType postSettingType) {
        O(new e.g(postSettingType));
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        boolean z = yn50Var instanceof g.b;
        Context context = this.h;
        if (z) {
            ekc0 a = this.f.a(R.string.vkim_channels_post_settings_delay_send_dialog_title, context);
            a.c = new rj60(this, 9);
            Date date = ((g.b) yn50Var).a;
            Calendar d = pvo0.d();
            d.add(12, 1);
            s3q0 s3q0Var = s3q0.a;
            ckc0.c(a, date, d.getTime(), null, 4);
            return;
        }
        if (!(yn50Var instanceof g.f)) {
            if (yn50Var instanceof g.c) {
                R(R.drawable.vk_icon_error_circle_outline_24, R.attr.vk_ui_background_negative, zk70.b(((g.c) yn50Var).a));
                return;
            }
            if (yn50Var instanceof g.a) {
                R(R.drawable.vk_icon_check_circle_outline_28, R.attr.vk_ui_icon_positive, context.getString(R.string.vkim_channels_post_settings_advertising_added));
                return;
            }
            if (yn50Var instanceof g.e) {
                R(R.drawable.vk_icon_loudspeaker_slash_outline_28, R.attr.vk_ui_icon_negative, context.getString(R.string.vkim_channels_post_settings_advertising_removed));
                return;
            } else {
                if (yn50Var instanceof g.d) {
                    g.d dVar = (g.d) yn50Var;
                    new ChannelMonetizationFragment.a(dVar.a, dVar.b).k(context);
                    return;
                }
                return;
            }
        }
        pp80 pp80Var = ((g.f) yn50Var).a;
        final s5u0 s5u0Var = this.g;
        Context context2 = s5u0Var.a;
        mhy.b(context2);
        if (pp80Var == null) {
            pp80Var = pp80.a.a;
        }
        s5u0Var.c = pp80Var;
        View inflate = LayoutInflater.from(context2).inflate(R.layout.post_settings_visible_to_dons_dialog, (ViewGroup) null, false);
        final VisibleToDonsPickerView visibleToDonsPickerView = (VisibleToDonsPickerView) inflate.findViewById(R.id.pickerView);
        pp80 pp80Var2 = s5u0Var.c;
        if (pp80Var2 != null) {
            visibleToDonsPickerView.setVisibilityToDons(pp80Var2);
        }
        visibleToDonsPickerView.setEndDrawable(new baf0(m33.a(R.drawable.vk_icon_dropdown_24, context2), e3m.f(R.attr.vk_ui_icon_secondary, context2)));
        visibleToDonsPickerView.setEndDrawablePadding(iah0.a(16));
        h7u0.a aVar = new h7u0.a(context2);
        aVar.g0(R.string.vkim_channels_post_settings_only_visible_to_dons_dialog_title);
        aVar.c0(R.string.save, new DialogInterface.OnClickListener() { // from class: xsna.r5u0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                es00 es00Var = s5u0.this.b;
                if (es00Var != null) {
                    es00Var.invoke(visibleToDonsPickerView.getVisibilityToDons());
                }
            }
        });
        aVar.W(R.string.cancel, null);
        aVar.f = inflate;
        aVar.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0045, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x005c, code lost:
    
        if (r3.e != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ao50 ao50Var) {
        String str;
        String str2;
        String str3;
        j7c0 j7c0Var = (j7c0) ao50Var;
        ChannelMsgSendConfig channelMsgSendConfig = j7c0Var.a;
        ChannelMsgSendState channelMsgSendState = j7c0Var.d;
        ChannelType channelType = channelMsgSendState.i;
        boolean z = channelMsgSendState.g;
        boolean z2 = channelMsgSendState.c;
        boolean z3 = channelType == ChannelType.COMMUNITY_CHANNEL;
        ImFeatures imFeatures = ImFeatures.DONUTS_EASY_FLOW_IN_CHANNEL;
        imFeatures.getClass();
        boolean z4 = com.vk.toggle.b.A.a(imFeatures) && z3;
        pp80 pp80Var = j7c0Var.b;
        Object obj = null;
        if (!z4) {
            String str4 = null;
            Object c2594e = new b7c0.e.C2594e(pp80Var, null, !z2, channelMsgSendConfig.u());
            str = str4;
            if (pp80Var == null) {
                if (!z2) {
                    str = str4;
                }
                obj = str;
                str2 = str;
            }
            obj = c2594e;
            str2 = str4;
        } else if (channelMsgSendState.f) {
            String str5 = null;
            obj = new b7c0.a.C2591a(channelMsgSendState.e, pp80Var, null, channelMsgSendConfig.u(), b7c0.a.b.C2593b.a);
            str2 = str5;
            str2 = str5;
            str = str5;
            if (pp80Var == null) {
            }
        } else {
            str2 = null;
        }
        Object dVar = new b7c0.e.d(channelMsgSendConfig.B());
        if (!channelMsgSendState.d || j7c0Var.b == null) {
            dVar = str2;
        }
        Object bVar = new b7c0.e.b(channelMsgSendConfig.l(), str2);
        if (z2 && !channelMsgSendState.b) {
            bVar = str2;
        }
        b7c0.e.c cVar = new b7c0.e.c(channelMsgSendConfig.f() && z, z);
        b7c0.e.a aVar = new b7c0.e.a(channelMsgSendConfig.d());
        Object gVar = new b7c0.e.g(channelMsgSendConfig.n());
        if (z2) {
            gVar = str2;
        }
        b7c0.e.f fVar = new b7c0.e.f(j7c0Var.e && j7c0Var.b(), j7c0Var.b(), channelMsgSendConfig.D());
        if (z2 || !z3) {
            fVar = null;
        }
        b7c0.c cVar2 = new b7c0.c(R.string.post_settings_header_monetization);
        if (obj == null && dVar == null) {
            cVar2 = null;
        }
        List<hfz> I = rl3.I(new hfz[]{bVar, cVar, aVar, gVar, fVar, cVar2, obj, dVar, new b7c0.c(R.string.post_settings_header_ads), new b7c0.d(j7c0Var.c, channelMsgSendConfig.j(), channelMsgSendConfig.k(), channelMsgSendState.c, channelMsgSendConfig.p())});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        for (hfz hfzVar : I) {
            boolean z5 = hfzVar instanceof b7c0.e.b;
            Context context = this.h;
            if (z5) {
                b7c0.e.b bVar2 = (b7c0.e.b) hfzVar;
                Date date = bVar2.j;
                if (date != null) {
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(date);
                    String string = c09.c(calendar, calendar2) ? context.getString(R.string.today) : c09.e(calendar, calendar2) ? context.getString(R.string.tomorrow) : this.l.format(date);
                    str3 = string + ' ' + context.getString(R.string.date_at) + ' ' + this.m.format(date);
                } else {
                    str3 = null;
                }
                hfzVar = new b7c0.e.b(bVar2.j, str3);
            } else if (hfzVar instanceof b7c0.e.C2594e) {
                b7c0.e.C2594e c2594e2 = (b7c0.e.C2594e) hfzVar;
                pp80 pp80Var2 = c2594e2.j;
                hfzVar = new b7c0.e.C2594e(c2594e2.j, pp80Var2 != null ? S(pp80Var2) : null, c2594e2.l, c2594e2.m);
            } else if (hfzVar instanceof b7c0.a.C2591a) {
                b7c0.a.C2591a c2591a = (b7c0.a.C2591a) hfzVar;
                boolean z6 = c2591a.f;
                pp80 pp80Var3 = c2591a.g;
                String S = z6 ? pp80Var3 != null ? S(pp80Var3) : context.getString(R.string.vkim_channels_post_settings_only_visible_to_dons_subtitle) : context.getString(R.string.vkim_channels_post_settings_only_visible_to_dons_with_disabled_donut_subtitle);
                boolean z7 = c2591a.f;
                hfzVar = new b7c0.a.C2591a(z7, c2591a.g, S, c2591a.i, z7 ? new b7c0.a.b.c(pp80Var3 != null) : new b7c0.a.b.C2592a());
            }
            arrayList.add(hfzVar);
        }
        a7c0 a7c0Var = this.j;
        if (a7c0Var == null) {
            a7c0Var = null;
        }
        a7c0Var.setItems(arrayList);
        VkButton vkButton = this.k;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setEnabled(channelMsgSendState.h);
    }
}
