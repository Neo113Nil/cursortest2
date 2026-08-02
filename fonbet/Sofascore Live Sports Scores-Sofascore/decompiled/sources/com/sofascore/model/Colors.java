package com.sofascore.model;

import com.ironsource.U3;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b+\u0010\u0019¨\u0006."}, d2 = {"Lcom/sofascore/model/Colors;", "Ljava/io/Serializable;", "", "primary", U3.i.Y, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "number", "outline", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/Colors;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/Colors;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrimary", "getSecondary", "getText", "getNumber", "getOutline", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Colors implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String number;

    @Nullable
    private final String outline;

    @NotNull
    private final String primary;

    @Nullable
    private final String secondary;

    @Nullable
    private final String text;

    public /* synthetic */ Colors(int i, String str, String str2, String str3, String str4, String str5, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Colors$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.primary = str;
        this.secondary = str2;
        this.text = str3;
        if ((i & 8) == 0) {
            this.number = null;
        } else {
            this.number = str4;
        }
        if ((i & 16) == 0) {
            this.outline = null;
        } else {
            this.outline = str5;
        }
    }

    public static /* synthetic */ Colors copy$default(Colors colors, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colors.primary;
        }
        if ((i & 2) != 0) {
            str2 = colors.secondary;
        }
        if ((i & 4) != 0) {
            str3 = colors.text;
        }
        return colors.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(Colors self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.primary);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.secondary);
        output.h(serialDesc, 2, uhiVar, self.text);
        if (output.o(serialDesc) || self.number != null) {
            output.h(serialDesc, 3, uhiVar, self.number);
        }
        if (!output.o(serialDesc) && self.outline == null) {
            return;
        }
        output.h(serialDesc, 4, uhiVar, self.outline);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPrimary() {
        return this.primary;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSecondary() {
        return this.secondary;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final Colors copy(@NotNull String primary, @Nullable String secondary, @Nullable String text) {
        primary.getClass();
        return new Colors(primary, secondary, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Colors)) {
            return false;
        }
        Colors colors = (Colors) other;
        return Intrinsics.c(this.primary, colors.primary) && Intrinsics.c(this.secondary, colors.secondary) && Intrinsics.c(this.text, colors.text);
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final String getOutline() {
        return this.outline;
    }

    @NotNull
    public final String getPrimary() {
        return this.primary;
    }

    @Nullable
    public final String getSecondary() {
        return this.secondary;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.primary.hashCode() * 31;
        String str = this.secondary;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.primary;
        String str2 = this.secondary;
        return mz1.o(mz1.s("Colors(primary=", str, ", secondary=", str2, ", text="), this.text, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/Colors$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/Colors;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Colors$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Colors(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        this.primary = str;
        this.secondary = str2;
        this.text = str3;
    }
}
