package com.vk.channelrestrictions;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bmj;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.g13;
import xsna.i71;
import xsna.j71;
import xsna.nwy;
import xsna.qcy;
import xsna.zlj;

/* compiled from: ChannelRestrictionsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ChannelRestrictionsComponentImpl implements ChannelRestrictionsComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ChannelRestrictionsComponentImpl.class, "contentWarningLauncher", "getContentWarningLauncher()Lcom/vk/channelrestrictions/ContentWarningLauncherImpl;", 0), fp.c(0, ChannelRestrictionsComponentImpl.class, "ageRestrictionLauncher", "getAgeRestrictionLauncher()Lcom/vk/channelrestrictions/AgeRestrictionLauncherImpl;", fpf0.a)};
    public final nwy a = new nwy(new com.vk.movika.sdk.android.defaultplayer.interactive.b(5));
    public final nwy b = new nwy(new g13(5));

    /* compiled from: ChannelRestrictionsComponentImpl.kt */
    public static final class a implements b7m<ChannelRestrictionsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChannelRestrictionsComponentImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.channelrestrictions.ChannelRestrictionsComponent
    public final zlj ad() {
        qcy<Object> qcyVar = c[0];
        return (bmj) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.channelrestrictions.ChannelRestrictionsComponent
    public final i71 h2() {
        qcy<Object> qcyVar = c[1];
        return (j71) this.b.c();
    }
}
