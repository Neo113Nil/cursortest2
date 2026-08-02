package ru.ozon.push.sdk.internal.updater;

import G.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Wh0.d;
import androidx.work.e;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import gh0.InterfaceC6738d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh0.C7429a;
import jh0.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class PushTokenUpdateResultsConverter {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97726a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006'"}, d2 = {"Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper;", "", "Ljh0/b;", "pushTokenType", "Ljh0/c;", "updateTrigger", "", "token", "Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;", "resultType", "<init>", "(Ljh0/b;Ljh0/c;Ljava/lang/String;Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;)V", "component1", "()Ljh0/b;", "component2", "()Ljh0/c;", "component3", "()Ljava/lang/String;", "component4", "()Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;", "copy", "(Ljh0/b;Ljh0/c;Ljava/lang/String;Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;)Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljh0/b;", "getPushTokenType", "Ljh0/c;", "getUpdateTrigger", "Ljava/lang/String;", "getToken", "Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;", "getResultType", "a", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes3.dex */
    public static final /* data */ class PushTokenUpdateResultWrapper {

        @NotNull
        private final jh0.b pushTokenType;

        @NotNull
        private final a resultType;

        @NotNull
        private final String token;

        @NotNull
        private final c updateTrigger;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a SUCCESS = new a("SUCCESS", 0);
            public static final a FAILURE = new a("FAILURE", 1);

            private static final /* synthetic */ a[] $values() {
                return new a[]{SUCCESS, FAILURE};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private a(String str, int i11) {
            }

            @NotNull
            public static Xc.a<a> getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public PushTokenUpdateResultWrapper(@i(name = "pushTokenType") @NotNull jh0.b pushTokenType, @i(name = "updateTrigger") @NotNull c updateTrigger, @i(name = "token") @NotNull String token, @i(name = "resultType") @NotNull a resultType) {
            Intrinsics.checkNotNullParameter(pushTokenType, "pushTokenType");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(resultType, "resultType");
            this.pushTokenType = pushTokenType;
            this.updateTrigger = updateTrigger;
            this.token = token;
            this.resultType = resultType;
        }

        public static /* synthetic */ PushTokenUpdateResultWrapper copy$default(PushTokenUpdateResultWrapper pushTokenUpdateResultWrapper, jh0.b bVar, c cVar, String str, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = pushTokenUpdateResultWrapper.pushTokenType;
            }
            if ((i11 & 2) != 0) {
                cVar = pushTokenUpdateResultWrapper.updateTrigger;
            }
            if ((i11 & 4) != 0) {
                str = pushTokenUpdateResultWrapper.token;
            }
            if ((i11 & 8) != 0) {
                aVar = pushTokenUpdateResultWrapper.resultType;
            }
            return pushTokenUpdateResultWrapper.copy(bVar, cVar, str, aVar);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final jh0.b getPushTokenType() {
            return this.pushTokenType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final c getUpdateTrigger() {
            return this.updateTrigger;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final a getResultType() {
            return this.resultType;
        }

        @NotNull
        public final PushTokenUpdateResultWrapper copy(@i(name = "pushTokenType") @NotNull jh0.b pushTokenType, @i(name = "updateTrigger") @NotNull c updateTrigger, @i(name = "token") @NotNull String token, @i(name = "resultType") @NotNull a resultType) {
            Intrinsics.checkNotNullParameter(pushTokenType, "pushTokenType");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(resultType, "resultType");
            return new PushTokenUpdateResultWrapper(pushTokenType, updateTrigger, token, resultType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushTokenUpdateResultWrapper)) {
                return false;
            }
            PushTokenUpdateResultWrapper pushTokenUpdateResultWrapper = (PushTokenUpdateResultWrapper) other;
            return this.pushTokenType == pushTokenUpdateResultWrapper.pushTokenType && this.updateTrigger == pushTokenUpdateResultWrapper.updateTrigger && Intrinsics.d(this.token, pushTokenUpdateResultWrapper.token) && this.resultType == pushTokenUpdateResultWrapper.resultType;
        }

        @NotNull
        public final jh0.b getPushTokenType() {
            return this.pushTokenType;
        }

        @NotNull
        public final a getResultType() {
            return this.resultType;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final c getUpdateTrigger() {
            return this.updateTrigger;
        }

        public int hashCode() {
            return this.resultType.hashCode() + g.a((this.updateTrigger.hashCode() + (this.pushTokenType.hashCode() * 31)) * 31, 31, this.token);
        }

        @NotNull
        public String toString() {
            return "PushTokenUpdateResultWrapper(pushTokenType=" + this.pushTokenType + ", updateTrigger=" + this.updateTrigger + ", token=" + this.token + ", resultType=" + this.resultType + ")";
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97727a;

        static {
            int[] iArr = new int[PushTokenUpdateResultWrapper.a.values().length];
            try {
                iArr[PushTokenUpdateResultWrapper.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PushTokenUpdateResultWrapper.a.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97727a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function0<JsonAdapter<List<? extends PushTokenUpdateResultWrapper>>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Moshi f97728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Moshi moshi) {
            super(0);
            this.f97728b = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<List<? extends PushTokenUpdateResultWrapper>> invoke() {
            return this.f97728b.d(D.e(List.class, PushTokenUpdateResultWrapper.class));
        }
    }

    public PushTokenUpdateResultsConverter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f97726a = k.b(new b(moshi));
    }

    @NotNull
    public final ArrayList a(@NotNull e data) {
        d bVar;
        Intrinsics.checkNotNullParameter(data, "data");
        String d11 = data.d("RESULTS_KEY");
        if (d11 == null) {
            d11 = "";
        }
        Object value = this.f97726a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Iterable iterable = (List) ((JsonAdapter) value).fromJson(d11);
        if (iterable == null) {
            iterable = K.f71697a;
        }
        Iterable<PushTokenUpdateResultWrapper> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable2, 10));
        for (PushTokenUpdateResultWrapper pushTokenUpdateResultWrapper : iterable2) {
            jh0.b pushTokenType = pushTokenUpdateResultWrapper.getPushTokenType();
            c updateTrigger = pushTokenUpdateResultWrapper.getUpdateTrigger();
            int i11 = a.f97727a[pushTokenUpdateResultWrapper.getResultType().ordinal()];
            if (i11 == 1) {
                bVar = new d.b(new C7429a(pushTokenUpdateResultWrapper.getToken(), pushTokenUpdateResultWrapper.getPushTokenType(), pushTokenUpdateResultWrapper.getUpdateTrigger()));
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                bVar = new d.a(null);
            }
            arrayList.add(new InterfaceC6738d.a(pushTokenType, updateTrigger, bVar));
        }
        return arrayList;
    }

    public final void b(@NotNull e.a dataBuilder, @NotNull ArrayList results) {
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        Intrinsics.checkNotNullParameter(results, "results");
        ArrayList arrayList = new ArrayList(C7714v.z(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            InterfaceC6738d.a aVar = (InterfaceC6738d.a) it.next();
            Pair pair = aVar.b() instanceof d.b ? new Pair(((C7429a) ((d.b) aVar.b()).a()).a(), PushTokenUpdateResultWrapper.a.SUCCESS) : new Pair("", PushTokenUpdateResultWrapper.a.FAILURE);
            arrayList.add(new PushTokenUpdateResultWrapper(aVar.a(), aVar.c(), (String) pair.a(), (PushTokenUpdateResultWrapper.a) pair.b()));
        }
        Object value = this.f97726a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        dataBuilder.f("RESULTS_KEY", ((JsonAdapter) value).toJson(arrayList));
    }
}
