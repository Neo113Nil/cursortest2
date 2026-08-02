package ru.ozon.fintech.network.models;

import B0.C2454a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.util.Log;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012¨\u0006\""}, d2 = {"Lru/ozon/fintech/network/models/TestingFeaturesV2Dto;", "", "Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;", "delete", "", "", "edit", "<init>", "(Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;Ljava/util/Map;)V", "toJson", "()Ljava/lang/String;", "getEditAsString", "", "isEmpty", "()Z", "component1", "()Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;", "component2", "()Ljava/util/Map;", "copy", "(Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;Ljava/util/Map;)Lru/ozon/fintech/network/models/TestingFeaturesV2Dto;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/network/models/TestingFeaturesV2DeleteDto;", "getDelete", "Ljava/util/Map;", "getEdit", "Companion", "a", "fintech-network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestingFeaturesV2Dto {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String TAG = "TestingFeaturesV2Dto";

    @NotNull
    private static final InterfaceC4008j<JsonAdapter<TestingFeaturesV2Dto>> jsonAdapter$delegate;

    @NotNull
    private static final InterfaceC4008j<JsonAdapter<Map<String, Object>>> mapAdapter$delegate;

    @NotNull
    private final TestingFeaturesV2DeleteDto delete;

    @NotNull
    private final Map<String, Object> edit;

    /* renamed from: ru.ozon.fintech.network.models.TestingFeaturesV2Dto$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static TestingFeaturesV2Dto a(String str, String str2, String str3) {
            Map map;
            List b11 = b(str);
            List b12 = b(str2);
            try {
                Object value = TestingFeaturesV2Dto.mapAdapter$delegate.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                map = (Map) ((JsonAdapter) value).fromJson(str3);
            } catch (Throwable th2) {
                Log.d(TestingFeaturesV2Dto.TAG, "Не удалось распарсить map в json: ".concat(str3), th2);
                map = null;
            }
            TestingFeaturesV2DeleteDto testingFeaturesV2DeleteDto = new TestingFeaturesV2DeleteDto(b11, b12);
            if (map == null) {
                map = U.c();
            }
            return new TestingFeaturesV2Dto(testingFeaturesV2DeleteDto, map);
        }

        private static List b(String str) {
            if (h.K(str)) {
                return K.f71697a;
            }
            List m11 = h.m(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
            Iterator it = m11.iterator();
            while (it.hasNext()) {
                C2454a.g((String) it.next(), arrayList);
            }
            return arrayList;
        }
    }

    static {
        n nVar = n.PUBLICATION;
        jsonAdapter$delegate = k.a(nVar, new c());
        mapAdapter$delegate = k.a(nVar, new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TestingFeaturesV2Dto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestingFeaturesV2Dto copy$default(TestingFeaturesV2Dto testingFeaturesV2Dto, TestingFeaturesV2DeleteDto testingFeaturesV2DeleteDto, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            testingFeaturesV2DeleteDto = testingFeaturesV2Dto.delete;
        }
        if ((i11 & 2) != 0) {
            map = testingFeaturesV2Dto.edit;
        }
        return testingFeaturesV2Dto.copy(testingFeaturesV2DeleteDto, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter jsonAdapter_delegate$lambda$0() {
        return new Moshi(new Moshi.a()).c(TestingFeaturesV2Dto.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter mapAdapter_delegate$lambda$1() {
        Y9.b e11 = D.e(Map.class, String.class, Object.class);
        Moshi.a aVar = new Moshi.a();
        aVar.b(new CustomMapAdapter());
        return new Moshi(aVar).d(e11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TestingFeaturesV2DeleteDto getDelete() {
        return this.delete;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.edit;
    }

    @NotNull
    public final TestingFeaturesV2Dto copy(@NotNull TestingFeaturesV2DeleteDto delete, @NotNull Map<String, ? extends Object> edit) {
        Intrinsics.checkNotNullParameter(delete, "delete");
        Intrinsics.checkNotNullParameter(edit, "edit");
        return new TestingFeaturesV2Dto(delete, edit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestingFeaturesV2Dto)) {
            return false;
        }
        TestingFeaturesV2Dto testingFeaturesV2Dto = (TestingFeaturesV2Dto) other;
        return Intrinsics.d(this.delete, testingFeaturesV2Dto.delete) && Intrinsics.d(this.edit, testingFeaturesV2Dto.edit);
    }

    @NotNull
    public final TestingFeaturesV2DeleteDto getDelete() {
        return this.delete;
    }

    @NotNull
    public final Map<String, Object> getEdit() {
        return this.edit;
    }

    public final String getEditAsString() {
        if (this.edit.isEmpty()) {
            return "";
        }
        try {
            INSTANCE.getClass();
            Object value = mapAdapter$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return ((JsonAdapter) value).toJson(this.edit);
        } catch (Throwable th2) {
            Log.d(TAG, "Не удалось распарсить в json: " + this, th2);
            return null;
        }
    }

    public int hashCode() {
        return this.edit.hashCode() + (this.delete.hashCode() * 31);
    }

    public final boolean isEmpty() {
        return this.delete.getFlags().isEmpty() && this.delete.getRealtimeSwitches().isEmpty() && this.edit.isEmpty();
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
        return "TestingFeaturesV2Dto(delete=" + this.delete + ", edit=" + this.edit + ")";
    }

    public TestingFeaturesV2Dto(@NotNull TestingFeaturesV2DeleteDto delete, @NotNull Map<String, ? extends Object> edit) {
        Intrinsics.checkNotNullParameter(delete, "delete");
        Intrinsics.checkNotNullParameter(edit, "edit");
        this.delete = delete;
        this.edit = edit;
    }

    public /* synthetic */ TestingFeaturesV2Dto(TestingFeaturesV2DeleteDto testingFeaturesV2DeleteDto, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new TestingFeaturesV2DeleteDto(null, null, 3, null) : testingFeaturesV2DeleteDto, (i11 & 2) != 0 ? U.c() : map);
    }
}
