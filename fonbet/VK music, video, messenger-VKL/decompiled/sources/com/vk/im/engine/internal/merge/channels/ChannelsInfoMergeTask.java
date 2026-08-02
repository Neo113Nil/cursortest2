package com.vk.im.engine.internal.merge.channels;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.b920;
import xsna.eeb;
import xsna.qt5;
import xsna.w2w;
import xsna.yta;
import xsna.zrp;

/* compiled from: ChannelsInfoMergeTask.kt */
/* loaded from: classes2.dex */
public final class ChannelsInfoMergeTask extends b920 {
    public final Collection<eeb> c;
    public final Integer d;
    public final boolean e;
    public final Boolean f;
    public final InfoSource g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsInfoMergeTask.kt */
    public static final class InfoSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InfoSource[] $VALUES;
        public static final InfoSource API;
        public static final InfoSource WEBSOCKET;

        static {
            InfoSource infoSource = new InfoSource("WEBSOCKET", 0);
            WEBSOCKET = infoSource;
            InfoSource infoSource2 = new InfoSource("API", 1);
            API = infoSource2;
            InfoSource[] infoSourceArr = {infoSource, infoSource2};
            $VALUES = infoSourceArr;
            $ENTRIES = new asp(infoSourceArr);
        }

        public InfoSource() {
            throw null;
        }

        public static InfoSource valueOf(String str) {
            return (InfoSource) Enum.valueOf(InfoSource.class, str);
        }

        public static InfoSource[] values() {
            return (InfoSource[]) $VALUES.clone();
        }
    }

    /* compiled from: ChannelsInfoMergeTask.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoSource.values().length];
            try {
                iArr[InfoSource.WEBSOCKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoSource.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChannelsInfoMergeTask(Collection collection, Integer num, boolean z, Boolean bool, InfoSource infoSource, int i) {
        num = (i & 2) != 0 ? null : num;
        z = (i & 4) != 0 ? true : z;
        bool = (i & 8) != 0 ? null : bool;
        infoSource = (i & 16) != 0 ? InfoSource.API : infoSource;
        this.c = collection;
        this.d = num;
        this.e = z;
        this.f = bool;
        this.g = infoSource;
    }

    public static void q(w2w w2wVar, yta ytaVar) {
        Long l = ytaVar.h;
        long j = ytaVar.a;
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"ChannelsInfoMergeTask.saveChannelTs(): channelId = " + j + " version = " + l});
        }
        if (l != null) {
            w2wVar.I0().system().a(j, l.longValue());
        }
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        return this.c.isEmpty() ? EmptyList.b : (List) w2wVar.I0().u(new qt5(2, this, w2wVar));
    }
}
