package com.vk.channels.impl.channel_screen.footer;

import com.vk.channels.api.ChannelEntryPoint;
import com.vk.im.engine.events.JoiningToChannelError;
import xsna.a1w;
import xsna.feb;

/* compiled from: ChannelFooterInteractor.kt */
/* loaded from: classes16.dex */
public final class f {
    public final a1w a;
    public final ChannelEntryPoint b;
    public final feb c;

    /* compiled from: ChannelFooterInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JoiningToChannelError.values().length];
            try {
                iArr[JoiningToChannelError.LIMITS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JoiningToChannelError.ACCESS_DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JoiningToChannelError.CHANNEL_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JoiningToChannelError.INVALID_INVITE_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(a1w a1wVar, ChannelEntryPoint channelEntryPoint, feb febVar) {
        this.a = a1wVar;
        this.b = channelEntryPoint;
        this.c = febVar;
    }
}
