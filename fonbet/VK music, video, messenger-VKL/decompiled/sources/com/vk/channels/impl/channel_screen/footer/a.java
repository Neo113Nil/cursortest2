package com.vk.channels.impl.channel_screen.footer;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import com.vk.channels.impl.channel_screen.footer.j;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.e3m;
import xsna.fi6;
import xsna.h9k0;
import xsna.kkm;
import xsna.mh;
import xsna.qjg;
import xsna.yfb;
import xsna.yn50;
import xsna.z4;

/* compiled from: BaseChannelFooterViewController.kt */
/* loaded from: classes16.dex */
public abstract class a extends fi6<k, b> {
    public final Context f;
    public final h9k0 g;
    public final kkm h;
    public final z4 i;
    public final mh j;
    public final defpackage.f k;

    /* compiled from: BaseChannelFooterViewController.kt */
    /* renamed from: com.vk.channels.impl.channel_screen.footer.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0527a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelJoiningError.values().length];
            try {
                iArr[ChannelJoiningError.ACCESS_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(Context context, h9k0 h9k0Var, kkm kkmVar, z4 z4Var, mh mhVar, defpackage.f fVar) {
        super(R.layout.im_channel_footer_old, null);
        this.f = context;
        this.g = h9k0Var;
        this.h = kkmVar;
        this.i = z4Var;
        this.j = mhVar;
        this.k = fVar;
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        boolean z = yn50Var instanceof j.d;
        h9k0 h9k0Var = this.g;
        Context context = this.f;
        if (z) {
            h9k0Var.c(((Boolean) this.k.invoke()).booleanValue() ? context.getString(R.string.vkapp_channels_joining_to_channel_only_success) : ((Boolean) this.j.invoke()).booleanValue() ? context.getString(R.string.vkapp_channels_joining_to_channel_only_success) : ((Boolean) this.i.invoke()).booleanValue() ? context.getString(R.string.vkim_channels_profile_join_request_sent) : context.getString(R.string.vkim_channels_joining_to_channel_success), null);
            return;
        }
        if (yn50Var instanceof j.c) {
            h9k0Var.f(C0527a.$EnumSwitchMapping$0[((j.c) yn50Var).a.ordinal()] == 1 ? context.getString(R.string.vkim_channels_joining_to_channel_error_acces_denied) : context.getString(R.string.vkim_channels_joining_to_channel_error_unknow));
            return;
        }
        if (yn50Var instanceof j.f) {
            h9k0Var.c(context.getString(R.string.vkim_channels_notifications_enabled), null);
            return;
        }
        if (yn50Var instanceof j.e) {
            h9k0Var.c(context.getString(R.string.vkim_channels_notifications_disabled), null);
            return;
        }
        if (yn50Var instanceof j.b) {
            h9k0Var.c(context.getString(R.string.vkim_channels_unarchived), null);
            return;
        }
        if (yn50Var instanceof j.a) {
            BanReasonBottomSheet.Params params = ((j.a) yn50Var).a;
            BanReasonBottomSheet.a aVar = BanReasonBottomSheet.g1;
            BanReasonBottomSheet banReasonBottomSheet = new BanReasonBottomSheet();
            banReasonBottomSheet.setArguments(yfb.b(new Pair(BanReasonBottomSheet.Params.class.getSimpleName(), params)));
            banReasonBottomSheet.Td(((AppCompatActivity) e3m.h(context)).getSupportFragmentManager(), qjg.a(aVar));
        }
    }
}
