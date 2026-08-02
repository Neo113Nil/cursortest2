package ru.ozon.fintech.network.models;

import Ak.C2436a;
import B0.C2454a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.util.Log;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ0\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/network/models/TestingFeaturesDto;", "", "", "", "flags", "realtimeSwitches", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toJson", "()Ljava/lang/String;", "getFeaturesString", "", "isEmpty", "()Z", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lru/ozon/fintech/network/models/TestingFeaturesDto;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFlags", "getRealtimeSwitches", "Companion", "a", "fintech-network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestingFeaturesDto {

    @NotNull
    private static final String TAG = "TestingFeaturesDto";

    @NotNull
    private final List<String> flags;

    @NotNull
    private final List<String> realtimeSwitches;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final InterfaceC4008j<JsonAdapter<TestingFeaturesDto>> jsonAdapter$delegate = k.a(n.PUBLICATION, new b());

    /* renamed from: ru.ozon.fintech.network.models.TestingFeaturesDto$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @NotNull
        public static TestingFeaturesDto a(String str) {
            ?? r12;
            if (str == null || h.K(str)) {
                r12 = K.f71697a;
            } else {
                List m11 = h.m(str, new String[]{","}, 0, 6);
                r12 = new ArrayList(C7714v.z(m11, 10));
                Iterator it = m11.iterator();
                while (it.hasNext()) {
                    C2454a.g((String) it.next(), r12);
                }
            }
            return new TestingFeaturesDto(r12, null, 2, 0 == true ? 1 : 0);
        }
    }

    public TestingFeaturesDto(@NotNull List<String> flags, @NotNull List<String> realtimeSwitches) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(realtimeSwitches, "realtimeSwitches");
        this.flags = flags;
        this.realtimeSwitches = realtimeSwitches;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestingFeaturesDto copy$default(TestingFeaturesDto testingFeaturesDto, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = testingFeaturesDto.flags;
        }
        if ((i11 & 2) != 0) {
            list2 = testingFeaturesDto.realtimeSwitches;
        }
        return testingFeaturesDto.copy(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getFeaturesString$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return h.z0(it).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter jsonAdapter_delegate$lambda$1() {
        return new Moshi(new Moshi.a()).c(TestingFeaturesDto.class);
    }

    @NotNull
    public final List<String> component1() {
        return this.flags;
    }

    @NotNull
    public final List<String> component2() {
        return this.realtimeSwitches;
    }

    @NotNull
    public final TestingFeaturesDto copy(@NotNull List<String> flags, @NotNull List<String> realtimeSwitches) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(realtimeSwitches, "realtimeSwitches");
        return new TestingFeaturesDto(flags, realtimeSwitches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestingFeaturesDto)) {
            return false;
        }
        TestingFeaturesDto testingFeaturesDto = (TestingFeaturesDto) other;
        return Intrinsics.d(this.flags, testingFeaturesDto.flags) && Intrinsics.d(this.realtimeSwitches, testingFeaturesDto.realtimeSwitches);
    }

    @NotNull
    public final String getFeaturesString() {
        return C7714v.V(this.flags, ",", null, null, new Ea.b(1), 30);
    }

    @NotNull
    public final List<String> getFlags() {
        return this.flags;
    }

    @NotNull
    public final List<String> getRealtimeSwitches() {
        return this.realtimeSwitches;
    }

    public int hashCode() {
        return this.realtimeSwitches.hashCode() + (this.flags.hashCode() * 31);
    }

    public final boolean isEmpty() {
        return this.flags.isEmpty();
    }

    public final String toJson() {
        try {
            INSTANCE.getClass();
            Object value = jsonAdapter$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return ((JsonAdapter) value).toJson(this);
        } catch (Throwable th2) {
            Log.d(TAG, "Не удалось распарсить в json: " + this, th2);
            return null;
        }
    }

    @NotNull
    public String toString() {
        return C2436a.b("TestingFeaturesDto(flags=", this.flags, ", realtimeSwitches=", ")", this.realtimeSwitches);
    }

    public /* synthetic */ TestingFeaturesDto(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? C7714v.b0("mobilePiMtsEnabled", "fullUpgradeByMobileId", "fullUpgradeByPhoto", "installment", "simpleUpgrade", "mobilePiBeelineEnabled", "mobilePiMegafonEnabled", "suggestForRequisites", "me2meEnabled", "c2bEnabled", "optionalEmail", "fullUpgradeByEsia", "fullUpgradeByInstallment", "newProductButtonSavings", "newProductButtonDeposit", "domesticTransfersEnabled") : list2);
    }
}
