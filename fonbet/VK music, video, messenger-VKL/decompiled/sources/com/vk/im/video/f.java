package com.vk.im.video;

import android.content.ContentUris;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.DownloadingState;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vkontakte.android.R;
import xsna.ajx;
import xsna.azt;
import xsna.bi0;
import xsna.cjx;
import xsna.dhr0;
import xsna.ek30;
import xsna.f14;
import xsna.f1x0;
import xsna.f5z;
import xsna.gzs;
import xsna.izs;
import xsna.ju;
import xsna.k82;
import xsna.m8v0;
import xsna.p1a0;
import xsna.qqw0;
import xsna.rg50;
import xsna.s3q0;
import xsna.skm0;
import xsna.svz;
import xsna.t4w;
import xsna.tfp0;
import xsna.w7w0;
import xsna.wng0;
import xsna.ync;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                g gVar = (g) obj3;
                t4w t4wVar = (t4w) obj2;
                f14 f14Var = (f14) obj;
                VKEnhancedImageView vKEnhancedImageView = gVar.C;
                if (vKEnhancedImageView == null) {
                    vKEnhancedImageView = null;
                }
                AttachWithVideo attachWithVideo = gVar.q;
                if (attachWithVideo == null) {
                    attachWithVideo = null;
                }
                vKEnhancedImageView.setLocalImage(attachWithVideo.Y8());
                VKEnhancedImageView vKEnhancedImageView2 = gVar.C;
                if (vKEnhancedImageView2 == null) {
                    vKEnhancedImageView2 = null;
                }
                AttachWithVideo attachWithVideo2 = gVar.q;
                if (attachWithVideo2 == null) {
                    attachWithVideo2 = null;
                }
                vKEnhancedImageView2.setRemoteImage(attachWithVideo2.Z2());
                VKEnhancedImageView vKEnhancedImageView3 = gVar.C;
                if (vKEnhancedImageView3 == null) {
                    vKEnhancedImageView3 = null;
                }
                ek30 ek30Var = gVar.Z;
                if (ek30Var == null) {
                    ek30Var = null;
                }
                vKEnhancedImageView3.setPlaceholder(ek30Var);
                View view = gVar.M;
                if (view == null) {
                    view = null;
                }
                view.setBackgroundColor(t4wVar.p0() ? t4wVar.U0() : 0);
                VKEnhancedImageView vKEnhancedImageView4 = gVar.C;
                if (vKEnhancedImageView4 == null) {
                    vKEnhancedImageView4 = null;
                }
                int i2 = f14Var.a;
                int i3 = f14Var.b;
                vKEnhancedImageView4.Y0(i2, i2, i3, i3);
                ek30 ek30Var2 = gVar.Z;
                wng0.e(gVar.d0, ek30Var2 != null ? ek30Var2 : null);
                break;
            case 1:
                izs izsVar = (izs) obj2;
                rg50 rg50Var = (rg50) obj;
                if (!(obj3 instanceof DownloadingState.Downloading)) {
                    if (obj3 instanceof DownloadingState.NotLoaded) {
                        rg50Var.C(rg50Var.getIntValue() + 1);
                    }
                    izsVar.invoke(tfp0.b.g.b);
                }
                break;
            case 2:
                p1a0 p1a0Var = (p1a0) obj3;
                View view2 = (View) obj2;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj;
                int i4 = m8v0.M;
                Lifecycle lifecycle = p1a0Var.b.getLifecycle();
                f5z f5zVar = p1a0Var.b;
                VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Cyan;
                String string = view2.getContext().getString(R.string.vkim_channels_personal_channels_onboarding);
                VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style3;
                VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size96;
                VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                boolean z = dhr0.C().b;
                VkOnboardingComponent vkOnboardingComponent = p1a0Var.a;
                VkOnboardingStat$Type vkOnboardingStat$Type = VkOnboardingStat$Type.Tooltip;
                String str = vkOnboardingCampaign.b;
                VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                m8v0.a.a(view2, string, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, new ync(p1a0Var, view2, vkOnboardingCampaign, 6), new ju(18, p1a0Var, vkOnboardingCampaign), new svz(17), new azt(15), new bi0(28, p1a0Var, vkOnboardingCampaign), new k82(19, p1a0Var, vkOnboardingCampaign), vkOnboardingComponent.ac(vkOnboardingStat$Type, str), 0, true, lifecycle, f5zVar, false, null, z, 5275652);
                break;
            case 3:
                ((cjx) obj3).b((ajx) obj2);
                ((skm0.a) obj).l0();
                break;
            default:
                qqw0 qqw0Var = (qqw0) obj3;
                f1x0 f1x0Var = (f1x0) obj2;
                w7w0 w7w0Var = (w7w0) obj;
                int i5 = qqw0.j1;
                Long l = f1x0Var.g;
                Intent data = l != null ? new Intent("android.intent.action.EDIT").setData(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, l.longValue())) : new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
                Bundle bundle = new Bundle();
                bundle.putString("title", f1x0Var.a);
                bundle.putString("description", f1x0Var.b);
                bundle.putBoolean("allDay", f1x0Var.d);
                bundle.putLong("beginTime", f1x0Var.e);
                bundle.putLong("endTime", f1x0Var.f);
                bundle.putString("rrule", f1x0Var.c);
                Intent createChooser = Intent.createChooser(data.putExtras(bundle), qqw0Var.getString(R.string.share));
                if (createChooser != null) {
                    w7w0Var.invoke(createChooser);
                }
                break;
        }
        return s3q0.a;
    }
}
