package com.sofascore.model;

import defpackage.a7a;
import defpackage.joa;
import defpackage.km5;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.t63;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0007\u0018\u0000 82\u00020\u0001:\u000298BW\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB?\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010B5\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\r\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010 R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b6\u00105¨\u0006:"}, d2 = {"Lcom/sofascore/model/Country;", "Ljava/io/Serializable;", "", "", "mccList", "", "iso2Alpha", "iso3Alpha", "ioc", "name", "channelIds", "", "hasRegions", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "mcc", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/Country;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getIoc", "()Ljava/lang/String;", "hasMcc", "(Ljava/lang/Integer;)Z", "", "o", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/util/List;", "getMccList", "()Ljava/util/List;", "Ljava/lang/String;", "getIso2Alpha", "getIso3Alpha", "getName", "getChannelIds", "setChannelIds", "(Ljava/util/List;)V", "Z", "getHasRegions", "()Z", "getHasChannels", "hasChannels", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Country implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private List<Integer> channelIds;
    private final boolean hasRegions;

    @Nullable
    private final String ioc;

    @NotNull
    private final String iso2Alpha;

    @Nullable
    private final String iso3Alpha;

    @NotNull
    private final List<Integer> mccList;

    @NotNull
    private final String name;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new t63(16)), null, null, null, null, ypa.a(ysaVar, new t63(17)), null};
    }

    public Country(int i, List list, String str, String str2, String str3, String str4, List list2, boolean z, t5h t5hVar) {
        if (29 != (i & 29)) {
            oea.z(i, 29, Country$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.mccList = list;
        if ((i & 2) == 0) {
            this.iso2Alpha = "";
        } else {
            this.iso2Alpha = str;
        }
        this.iso3Alpha = str2;
        this.ioc = str3;
        this.name = str4;
        if ((i & 32) == 0) {
            this.channelIds = km5.a;
        } else {
            this.channelIds = list2;
        }
        if ((i & 64) == 0) {
            this.hasRegions = false;
        } else {
            this.hasRegions = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    public static final void write$Self$model_release(Country self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.mccList);
        if (output.o(serialDesc) || !Intrinsics.c(self.iso2Alpha, "")) {
            output.y(serialDesc, 1, self.iso2Alpha);
        }
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.iso3Alpha);
        output.h(serialDesc, 3, uhiVar, self.ioc);
        output.y(serialDesc, 4, self.name);
        if (output.o(serialDesc) || !Intrinsics.c(self.channelIds, km5.a)) {
            output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.channelIds);
        }
        if (output.o(serialDesc) || self.hasRegions) {
            output.x(serialDesc, 6, self.hasRegions);
        }
    }

    public boolean equals(@Nullable Object o) {
        if (o instanceof Country) {
            return Intrinsics.c(((Country) o).name, this.name);
        }
        return false;
    }

    @NotNull
    public final List<Integer> getChannelIds() {
        return this.channelIds;
    }

    public final boolean getHasChannels() {
        return !this.channelIds.isEmpty();
    }

    public final boolean getHasRegions() {
        return this.hasRegions;
    }

    @Nullable
    public final String getIoc() {
        String str = this.ioc;
        return str == null ? this.iso3Alpha : str;
    }

    @NotNull
    public final String getIso2Alpha() {
        return this.iso2Alpha;
    }

    @Nullable
    public final String getIso3Alpha() {
        return this.iso3Alpha;
    }

    @NotNull
    public final List<Integer> getMccList() {
        return this.mccList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean hasMcc(@Nullable Integer mcc) {
        return CollectionsKt.R(this.mccList, mcc);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setChannelIds(@NotNull List<Integer> list) {
        list.getClass();
        this.channelIds = list;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/Country$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/Country;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Country$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(@NotNull List<Integer> list, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this((List) list, str, str2, str3, str4, (List) null, false, 96, (DefaultConstructorMarker) null);
        list.getClass();
        str.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(@NotNull List<Integer> list, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull List<Integer> list2) {
        this((List) list, str, str2, str3, str4, (List) list2, false, 64, (DefaultConstructorMarker) null);
        list.getClass();
        str.getClass();
        str4.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(@NotNull List<Integer> list, @Nullable String str, @Nullable String str2, @NotNull String str3) {
        this((List) list, (String) null, str, str2, str3, (List) null, false, 98, (DefaultConstructorMarker) null);
        list.getClass();
        str3.getClass();
    }

    public Country(@NotNull List<Integer> list, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull List<Integer> list2, boolean z) {
        list.getClass();
        str.getClass();
        str4.getClass();
        list2.getClass();
        this.mccList = list;
        this.iso2Alpha = str;
        this.iso3Alpha = str2;
        this.ioc = str3;
        this.name = str4;
        this.channelIds = list2;
        this.hasRegions = z;
    }

    public Country(List list, String str, String str2, String str3, String str4, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, str2, str3, str4, (i & 32) != 0 ? km5.a : list2, (i & 64) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(int i, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, boolean z) {
        this(a.c(Integer.valueOf(i)), str, str2, str3, str4, km5.a, z);
        str.getClass();
        str4.getClass();
    }

    public /* synthetic */ Country(int i, String str, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(int i, @NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this(a.c(Integer.valueOf(i)), str, str2, str3, str4, (List) null, false, 96, (DefaultConstructorMarker) null);
        str.getClass();
        str4.getClass();
    }
}
