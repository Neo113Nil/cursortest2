package com.sofascore.model.newNetwork;

import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t2e;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/sofascore/model/newNetwork/PageInfo;", "", "", "page", "", "minStartDate", "maxStartDate", "", "", "eventFilters", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PageInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getPage", "()I", "Ljava/lang/String;", "getMinStartDate", "()Ljava/lang/String;", "getMaxStartDate", "Ljava/util/Map;", "getEventFilters", "()Ljava/util/Map;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PageInfo {

    @NotNull
    private final Map<String, List<String>> eventFilters;

    @NotNull
    private final String maxStartDate;

    @NotNull
    private final String minStartDate;
    private final int page;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new t2e(1))};

    public /* synthetic */ PageInfo(int i, int i2, String str, String str2, Map map, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, PageInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.page = i2;
        this.minStartDate = str;
        this.maxStartDate = str2;
        this.eventFilters = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, new xg0(uhiVar, 0), 1);
    }

    public static final /* synthetic */ void write$Self$model_release(PageInfo self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.page, serialDesc);
        output.y(serialDesc, 1, self.minStartDate);
        output.y(serialDesc, 2, self.maxStartDate);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.eventFilters);
    }

    @NotNull
    public final Map<String, List<String>> getEventFilters() {
        return this.eventFilters;
    }

    @NotNull
    public final String getMaxStartDate() {
        return this.maxStartDate;
    }

    @NotNull
    public final String getMinStartDate() {
        return this.minStartDate;
    }

    public final int getPage() {
        return this.page;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PageInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PageInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PageInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageInfo(int i, @NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends List<String>> map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.page = i;
        this.minStartDate = str;
        this.maxStartDate = str2;
        this.eventFilters = map;
    }
}
