package q30;

import android.content.Context;
import android.content.SharedPreferences;
import c30.C5742a;
import c30.i;
import c30.j;
import com.squareup.moshi.Moshi;
import d30.l;
import e30.C6289b;
import i30.C7005b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f81547a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f81548b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S30.a f81549c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f81550d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR;
        public static final a EVENT;
        public static final a RESULT;

        static {
            a aVar = new a("EVENT", 0);
            EVENT = aVar;
            a aVar2 = new a("ERROR", 1);
            ERROR = aVar2;
            a aVar3 = new a("RESULT", 2);
            RESULT = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public c(@NotNull Context context, @NotNull l dao, @NotNull C7005b mobileHealthConfig, @NotNull O30.b fintechLibType, @NotNull S30.a applicationInfoDataSource, @NotNull i locationProvider, @NotNull j networkInfoProvider, @NotNull SharedPreferences sharedPreferences, @NotNull C5742a batteryInfoProvider, @NotNull c30.b deviceIdsProvider, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(batteryInfoProvider, "batteryInfoProvider");
        Intrinsics.checkNotNullParameter(deviceIdsProvider, "deviceIdsProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f81547a = context;
        this.f81548b = dao;
        this.f81549c = applicationInfoDataSource;
        this.f81550d = locationProvider;
    }

    public final Object a(@NotNull ArrayList arrayList, @NotNull d dVar) {
        Object d11 = this.f81548b.d(arrayList, dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final Object b(@NotNull d<? super List<C6289b>> dVar) {
        return this.f81548b.c(dVar);
    }

    public final Object c(int i11, @NotNull d<? super List<C6289b>> dVar) {
        return this.f81548b.a(i11, dVar);
    }

    public final Object d(@NotNull d<? super Integer> dVar) {
        return this.f81548b.b(dVar);
    }

    public final void e() {
        Context context = this.f81547a;
        if (androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f81550d.d();
        }
    }
}
