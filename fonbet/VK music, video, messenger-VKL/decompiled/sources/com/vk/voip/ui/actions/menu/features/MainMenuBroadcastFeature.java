package com.vk.voip.ui.actions.menu.features;

import android.content.Context;
import com.vk.log.L;
import com.vk.voip.ui.c;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.f;
import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.bdz;
import xsna.bqs;
import xsna.mau;
import xsna.nrw0;
import xsna.oe00;
import xsna.td5;
import xsna.u59;
import xsna.vl0;
import xsna.wj8;
import xsna.wmc;
import xsna.xbx0;
import xsna.z7w;
import xsna.zrp;

/* compiled from: MainMenuBroadcastFeature.kt */
/* loaded from: classes7.dex */
public final class MainMenuBroadcastFeature {
    public final Context a;
    public final u59 b;
    public final nrw0.h c;
    public final d<wj8> d = d.O0(new wj8(0));
    public final f<a> e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final f<Object> g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MainMenuBroadcastFeature.kt */
    public static final class Option {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Option[] $VALUES;
        public static final Option ASR_RECORD;
        public static final Option RECORD;
        public static final Option SCREENCAST;
        public static final Option STREAM;
        public static final Option WATCH_TOGETHER;

        static {
            Option option = new Option("SCREENCAST", 0);
            SCREENCAST = option;
            Option option2 = new Option("RECORD", 1);
            RECORD = option2;
            Option option3 = new Option("STREAM", 2);
            STREAM = option3;
            Option option4 = new Option("ASR_RECORD", 3);
            ASR_RECORD = option4;
            Option option5 = new Option("WATCH_TOGETHER", 4);
            WATCH_TOGETHER = option5;
            Option[] optionArr = {option, option2, option3, option4, option5};
            $VALUES = optionArr;
            $ENTRIES = new asp(optionArr);
        }

        public Option() {
            throw null;
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) $VALUES.clone();
        }
    }

    /* compiled from: MainMenuBroadcastFeature.kt */
    public interface a {

        /* compiled from: MainMenuBroadcastFeature.kt */
        /* renamed from: com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature$a$a, reason: collision with other inner class name */
        public static final class C2009a implements a {
            public final Option a;

            public C2009a(Option option) {
                this.a = option;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2009a) && this.a == ((C2009a) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ToggleOptionAction(option=" + this.a + ')';
            }
        }
    }

    /* compiled from: MainMenuBroadcastFeature.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Option.values().length];
            try {
                iArr[Option.STREAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Option.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Option.ASR_RECORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Option.SCREENCAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Option.WATCH_TOGETHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MainMenuBroadcastFeature(Context context, u59 u59Var, nrw0.h hVar) {
        this.a = context;
        this.b = u59Var;
        this.c = hVar;
        f<a> fVar = new f<>();
        this.e = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        this.g = new f<>();
        bVar.b(fVar.w0(100L, TimeUnit.MILLISECONDS).F(new vl0(new wmc(L.a, 4), 28)).subscribe(new bqs(new com.vk.voip.ui.actions.menu.features.a(1, this, MainMenuBroadcastFeature.class, "handleEvent", "handleEvent(Lcom/vk/voip/ui/actions/menu/features/MainMenuBroadcastFeature$Action;)V", 0), 4)));
        c.b.getClass();
        bVar.b(new p1(new xbx0(c.k0()).a(), new mau(new z7w(1), 3)).subscribe(new bdz(new td5(1, this, MainMenuBroadcastFeature.class, "onWatchTogetherStateChanged", "onWatchTogetherStateChanged(Lcom/vk/voip/ui/viewholder/watchtogether/WatchTogetherButtonState;)V", 0, 12), 1)));
    }

    public final wj8 a() {
        return this.d.P0();
    }

    public final void b(int i) {
        this.g.onNext(new oe00(i));
    }

    public final void c(Option option) {
        this.e.onNext(new a.C2009a(option));
    }

    public final void d(wj8 wj8Var) {
        this.d.onNext(wj8Var);
    }
}
