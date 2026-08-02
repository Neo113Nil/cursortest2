package com.vk.voip.ui.settings.participants_view;

import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.oq;
import xsna.shy;
import xsna.zrp;

/* compiled from: CallParticipantsViewModel.kt */
/* loaded from: classes7.dex */
public final class CallParticipantsViewModel {
    public final Integer a;
    public final String b;
    public final int c;
    public final b d;
    public final c e;
    public final a f;
    public final BottomControlState g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallParticipantsViewModel.kt */
    public static final class BottomControlState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BottomControlState[] $VALUES;
        public static final BottomControlState ADD_BUTTON_DISABLED;
        public static final BottomControlState ADD_BUTTON_ENABLED;
        public static final BottomControlState ADD_BUTTON_ENABLED_SINGLE;
        public static final BottomControlState HIDE;
        public static final BottomControlState SHARE_BUTTON_SINGLE;

        static {
            BottomControlState bottomControlState = new BottomControlState("ADD_BUTTON_ENABLED", 0);
            ADD_BUTTON_ENABLED = bottomControlState;
            BottomControlState bottomControlState2 = new BottomControlState("ADD_BUTTON_DISABLED", 1);
            ADD_BUTTON_DISABLED = bottomControlState2;
            BottomControlState bottomControlState3 = new BottomControlState("ADD_BUTTON_ENABLED_SINGLE", 2);
            ADD_BUTTON_ENABLED_SINGLE = bottomControlState3;
            BottomControlState bottomControlState4 = new BottomControlState("SHARE_BUTTON_SINGLE", 3);
            SHARE_BUTTON_SINGLE = bottomControlState4;
            BottomControlState bottomControlState5 = new BottomControlState("HIDE", 4);
            HIDE = bottomControlState5;
            BottomControlState[] bottomControlStateArr = {bottomControlState, bottomControlState2, bottomControlState3, bottomControlState4, bottomControlState5};
            $VALUES = bottomControlStateArr;
            $ENTRIES = new asp(bottomControlStateArr);
        }

        public BottomControlState() {
            throw null;
        }

        public static BottomControlState valueOf(String str) {
            return (BottomControlState) Enum.valueOf(BottomControlState.class, str);
        }

        public static BottomControlState[] values() {
            return (BottomControlState[]) $VALUES.clone();
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static abstract class a {

        /* compiled from: CallParticipantsViewModel.kt */
        /* renamed from: com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel$a$a, reason: collision with other inner class name */
        public static final class C2083a extends a {
            public static final C2083a a = new C2083a();
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static abstract class b {

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: CallParticipantsViewModel.kt */
        /* renamed from: com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel$b$b, reason: collision with other inner class name */
        public static final class C2084b extends b {
            public final ArrayList a;

            public C2084b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2084b) && epx.f(this.a, ((C2084b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Info(items="), this.a);
            }
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class c extends b {
            public static final c a = new c();
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static abstract class c {

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class a extends c {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class b extends c {
            public static final b a = new b();
        }

        /* compiled from: CallParticipantsViewModel.kt */
        /* renamed from: com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel$c$c, reason: collision with other inner class name */
        public static final class C2085c extends c {
            public static final C2085c a = new C2085c();
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public static final class d extends c {
            public final String a;

            public d(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Ready(requestCode="), this.a, ')');
            }
        }
    }

    public CallParticipantsViewModel(Integer num, String str, int i, b bVar, c cVar, a aVar, BottomControlState bottomControlState) {
        this.a = num;
        this.b = str;
        this.c = i;
        this.d = bVar;
        this.e = cVar;
        this.f = aVar;
        this.g = bottomControlState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallParticipantsViewModel)) {
            return false;
        }
        CallParticipantsViewModel callParticipantsViewModel = (CallParticipantsViewModel) obj;
        return epx.f(this.a, callParticipantsViewModel.a) && epx.f(this.b, callParticipantsViewModel.b) && this.c == callParticipantsViewModel.c && epx.f(this.d, callParticipantsViewModel.d) && epx.f(this.e, callParticipantsViewModel.e) && epx.f(this.f, callParticipantsViewModel.f) && this.g == callParticipantsViewModel.g;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CallParticipantsViewModel(inCallParticipantsCount=" + this.a + ", searchQuery=" + this.b + ", inviteCount=" + this.c + ", call=" + this.d + ", shareLink=" + this.e + ", addToCall=" + this.f + ", bottomControlState=" + this.g + ')';
    }
}
