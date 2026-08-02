package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation;

import An.C2439a;
import V.e;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "state", "", "", "params", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;Ljava/util/Map;LWZ/t;)V", "copy", "(JLru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;Ljava/util/Map;LWZ/t;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "getState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "StateVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLegalInnMobileVO implements c {
    private final long id;
    private final Map<String, String> params;

    @NotNull
    private final StateVO state;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "", "inn", "", "<init>", "(Ljava/lang/String;)V", "getInn", "()Ljava/lang/String;", "Success", "Error", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class StateVO {

        @NotNull
        private final String inn;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO$Error;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "", "inn", "errorText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInn", "getErrorText", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends StateVO {

            @NotNull
            private final String errorText;

            @NotNull
            private final String inn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String inn, @NotNull String errorText) {
                super(inn, null);
                Intrinsics.checkNotNullParameter(inn, "inn");
                Intrinsics.checkNotNullParameter(errorText, "errorText");
                this.inn = inn;
                this.errorText = errorText;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.d(this.inn, error.inn) && Intrinsics.d(this.errorText, error.errorText);
            }

            @NotNull
            public final String getErrorText() {
                return this.errorText;
            }

            @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO.StateVO
            @NotNull
            public String getInn() {
                return this.inn;
            }

            public int hashCode() {
                return this.errorText.hashCode() + (this.inn.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Error(inn=", this.inn, ", errorText=", this.errorText, ")");
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO$Success;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "", "inn", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/LegalVO;", "legals", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInn", "Ljava/util/List;", "getLegals", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends StateVO {

            @NotNull
            private final String inn;

            @NotNull
            private final List<LegalVO> legals;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String inn, @NotNull List<LegalVO> legals) {
                super(inn, null);
                Intrinsics.checkNotNullParameter(inn, "inn");
                Intrinsics.checkNotNullParameter(legals, "legals");
                this.inn = inn;
                this.legals = legals;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.inn, success.inn) && Intrinsics.d(this.legals, success.legals);
            }

            @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO.StateVO
            @NotNull
            public String getInn() {
                return this.inn;
            }

            @NotNull
            public final List<LegalVO> getLegals() {
                return this.legals;
            }

            public int hashCode() {
                return this.legals.hashCode() + (this.inn.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("Success(inn=", this.inn, ", legals=", ")", this.legals);
            }
        }

        public /* synthetic */ StateVO(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public String getInn() {
            return this.inn;
        }

        private StateVO(String str) {
            this.inn = str;
        }
    }

    public AddLegalInnMobileVO(long j11, @NotNull StateVO state, Map<String, String> map, t tVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.params = map;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ AddLegalInnMobileVO copy$default(AddLegalInnMobileVO addLegalInnMobileVO, long j11, StateVO stateVO, Map map, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addLegalInnMobileVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            stateVO = addLegalInnMobileVO.state;
        }
        StateVO stateVO2 = stateVO;
        if ((i11 & 4) != 0) {
            map = addLegalInnMobileVO.params;
        }
        Map map2 = map;
        if ((i11 & 8) != 0) {
            tVar = addLegalInnMobileVO.tokenizedEvent;
        }
        return addLegalInnMobileVO.copy(j12, stateVO2, map2, tVar);
    }

    @NotNull
    public final AddLegalInnMobileVO copy(long id2, @NotNull StateVO state, Map<String, String> params, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new AddLegalInnMobileVO(id2, state, params, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLegalInnMobileVO)) {
            return false;
        }
        AddLegalInnMobileVO addLegalInnMobileVO = (AddLegalInnMobileVO) other;
        return this.id == addLegalInnMobileVO.id && Intrinsics.d(this.state, addLegalInnMobileVO.state) && Intrinsics.d(this.params, addLegalInnMobileVO.params) && Intrinsics.d(this.tokenizedEvent, addLegalInnMobileVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final StateVO getState() {
        return this.state;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Map<String, String> map = this.params;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddLegalInnMobileVO(id=" + this.id + ", state=" + this.state + ", params=" + this.params + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
