package com.sofascore.model.mvvm.model;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u0006-"}, d2 = {"Lcom/sofascore/model/mvvm/model/ShirtColor;", "Ljava/io/Serializable;", "", "primary", "number", "fancyNumber", "outline", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/ShirtColor;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getPrimary", "getNumber", "getFancyNumber", "getOutline", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/ShirtColor;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShirtColor implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String fancyNumber;

    @Nullable
    private final String number;

    @Nullable
    private final String outline;

    @Nullable
    private final String primary;

    public /* synthetic */ ShirtColor(int i, String str, String str2, String str3, String str4, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, ShirtColor$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.primary = str;
        this.number = str2;
        this.fancyNumber = str3;
        this.outline = str4;
    }

    /* renamed from: component1, reason: from getter */
    private final String getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    private final String getNumber() {
        return this.number;
    }

    /* renamed from: component3, reason: from getter */
    private final String getFancyNumber() {
        return this.fancyNumber;
    }

    /* renamed from: component4, reason: from getter */
    private final String getOutline() {
        return this.outline;
    }

    public static /* synthetic */ ShirtColor copy$default(ShirtColor shirtColor, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shirtColor.primary;
        }
        if ((i & 2) != 0) {
            str2 = shirtColor.number;
        }
        if ((i & 4) != 0) {
            str3 = shirtColor.fancyNumber;
        }
        if ((i & 8) != 0) {
            str4 = shirtColor.outline;
        }
        return shirtColor.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$model_release(ShirtColor self, wf3 output, SerialDescriptor serialDesc) {
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.primary);
        output.h(serialDesc, 1, uhiVar, self.number);
        output.h(serialDesc, 2, uhiVar, self.fancyNumber);
        output.h(serialDesc, 3, uhiVar, self.outline);
    }

    @NotNull
    public final ShirtColor copy(@Nullable String primary, @Nullable String number, @Nullable String fancyNumber, @Nullable String outline) {
        return new ShirtColor(primary, number, fancyNumber, outline);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShirtColor)) {
            return false;
        }
        ShirtColor shirtColor = (ShirtColor) other;
        return Intrinsics.c(this.primary, shirtColor.primary) && Intrinsics.c(this.number, shirtColor.number) && Intrinsics.c(this.fancyNumber, shirtColor.fancyNumber) && Intrinsics.c(this.outline, shirtColor.outline);
    }

    @Nullable
    public final String getFancyNumber() {
        String str = this.fancyNumber;
        if (str != null) {
            if (c.v(str, "#", false)) {
                str = null;
            }
            if (str != null) {
                return dmi.q("#", this.fancyNumber);
            }
        }
        return this.fancyNumber;
    }

    @Nullable
    public final String getNumber() {
        String str = this.number;
        if (str != null) {
            if (c.v(str, "#", false)) {
                str = null;
            }
            if (str != null) {
                return dmi.q("#", this.number);
            }
        }
        return this.number;
    }

    @Nullable
    public final String getOutline() {
        String str = this.outline;
        if (str != null) {
            if (c.v(str, "#", false)) {
                str = null;
            }
            if (str != null) {
                return dmi.q("#", this.outline);
            }
        }
        return this.outline;
    }

    @Nullable
    public final String getPrimary() {
        String str = this.primary;
        if (str != null) {
            if (c.v(str, "#", false)) {
                str = null;
            }
            if (str != null) {
                return dmi.q("#", this.primary);
            }
        }
        return this.primary;
    }

    public int hashCode() {
        String str = this.primary;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fancyNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.outline;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.primary;
        String str2 = this.number;
        return fc6.o(mz1.s("ShirtColor(primary=", str, ", number=", str2, ", fancyNumber="), this.fancyNumber, ", outline=", this.outline, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/ShirtColor$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ShirtColor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ShirtColor$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShirtColor(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.primary = str;
        this.number = str2;
        this.fancyNumber = str3;
        this.outline = str4;
    }
}
