package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.hay;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudiobookActItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("app_state")
    private final AppState appState;

    @pmi0("book_id")
    private final int bookId;

    @pmi0("client_time")
    private final long clientTime;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class AppState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppState[] $VALUES;
        public static final AppState ACTIVE_STATE;
        public static final AppState BACKGROUND_STATE;
        public static final AppState UNKNOWN_STATE;
        private final int value;

        /* compiled from: CommonAudioStat.kt */
        public static final class Serializer implements uay<AppState> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((AppState) obj).value));
            }
        }

        static {
            AppState appState = new AppState("BACKGROUND_STATE", 0, 0);
            BACKGROUND_STATE = appState;
            AppState appState2 = new AppState("ACTIVE_STATE", 1, 1);
            ACTIVE_STATE = appState2;
            AppState appState3 = new AppState("UNKNOWN_STATE", 2, 99);
            UNKNOWN_STATE = appState3;
            AppState[] appStateArr = {appState, appState2, appState3};
            $VALUES = appStateArr;
            $ENTRIES = new asp(appStateArr);
        }

        public AppState(String str, int i, int i2) {
            this.value = i2;
        }

        public static AppState valueOf(String str) {
            return (AppState) Enum.valueOf(AppState.class, str);
        }

        public static AppState[] values() {
            return (AppState[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudiobookActItem>, a9y<CommonAudioStat$TypeAudiobookActItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$TypeAudiobookActItem((Type) dq.f(x9yVar, "type", tru.a(), Type.class), fai.p(x9yVar, "book_id"), fai.s(x9yVar, "track_code"), fai.q(x9yVar, "client_time"), (AppState) dq.f(x9yVar, "app_state", tru.a(), AppState.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudiobookActItem commonAudioStat$TypeAudiobookActItem = (CommonAudioStat$TypeAudiobookActItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(commonAudioStat$TypeAudiobookActItem.d()));
            x9yVar.n("book_id", Integer.valueOf(commonAudioStat$TypeAudiobookActItem.b()));
            x9yVar.o("track_code", commonAudioStat$TypeAudiobookActItem.a);
            x9yVar.n("client_time", Long.valueOf(commonAudioStat$TypeAudiobookActItem.c()));
            x9yVar.o("app_state", tru.a().toJson(commonAudioStat$TypeAudiobookActItem.a()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("add")
        public static final Type ADD;

        @pmi0("delete")
        public static final Type DELETE;

        static {
            Type type = new Type("ADD", 0);
            ADD = type;
            Type type2 = new Type("DELETE", 1);
            DELETE = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudiobookActItem(Type type, int i, String str, long j, AppState appState) {
        this.type = type;
        this.bookId = i;
        this.a = str;
        this.clientTime = j;
        this.appState = appState;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final AppState a() {
        return this.appState;
    }

    public final int b() {
        return this.bookId;
    }

    public final long c() {
        return this.clientTime;
    }

    public final Type d() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudiobookActItem)) {
            return false;
        }
        CommonAudioStat$TypeAudiobookActItem commonAudioStat$TypeAudiobookActItem = (CommonAudioStat$TypeAudiobookActItem) obj;
        return this.type == commonAudioStat$TypeAudiobookActItem.type && this.bookId == commonAudioStat$TypeAudiobookActItem.bookId && epx.f(this.a, commonAudioStat$TypeAudiobookActItem.a) && this.clientTime == commonAudioStat$TypeAudiobookActItem.clientTime && this.appState == commonAudioStat$TypeAudiobookActItem.appState;
    }

    public final int hashCode() {
        return this.appState.hashCode() + bh10.a(urd0.a(shy.a(this.bookId, this.type.hashCode() * 31, 31), 31, this.a), 31, this.clientTime);
    }

    public final String toString() {
        return "TypeAudiobookActItem(type=" + this.type + ", bookId=" + this.bookId + ", trackCode=" + this.a + ", clientTime=" + this.clientTime + ", appState=" + this.appState + ')';
    }
}
