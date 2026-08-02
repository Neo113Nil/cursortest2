package com.sofascore.model.mvvm.model;

import com.appsflyer.internal.i;
import com.sofascore.model.Sports;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.ph0;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u000eJ0\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010!J\u001a\u0010)\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010!\"\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010/R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0019¨\u00064"}, d2 = {"Lcom/sofascore/model/mvvm/model/Status;", "Ljava/io/Serializable;", "", "code", "", "description", "type", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lt5h;)V", "component2", "()Ljava/lang/String;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Status;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "setDescription", "(Ljava/lang/String;)V", "sportName", "getDescription", "(Ljava/lang/String;)Ljava/lang/String;", "", "isExtraTime", "()Z", "component1", "()I", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/Status;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "setCode", "(I)V", "Ljava/lang/String;", "getType", "setType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Status implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int code;

    @Nullable
    private String description;

    @NotNull
    private String type;

    public /* synthetic */ Status(int i, int i2, String str, String str2, t5h t5hVar) {
        if (6 != (i & 6)) {
            oea.z(i, 6, Status$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.code = 0;
        } else {
            this.code = i2;
        }
        this.description = str;
        this.type = str2;
    }

    /* renamed from: component2, reason: from getter */
    private final String getDescription() {
        return this.description;
    }

    public static /* synthetic */ Status copy$default(Status status, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = status.code;
        }
        if ((i2 & 2) != 0) {
            str = status.description;
        }
        if ((i2 & 4) != 0) {
            str2 = status.type;
        }
        return status.copy(i, str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(Status self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.code != 0) {
            output.u(0, self.code, serialDesc);
        }
        output.h(serialDesc, 1, uhi.a, self.description);
        output.y(serialDesc, 2, self.type);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Status copy(int code, @Nullable String description, @NotNull String type) {
        type.getClass();
        return new Status(code, description, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return this.code == status.code && Intrinsics.c(this.description, status.description) && Intrinsics.c(this.type, status.type);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription(@NotNull String sportName) {
        String str;
        sportName.getClass();
        String str2 = this.description;
        if (Sports.ICE_HOCKEY.equals(sportName) && str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1210766649) {
                if (hashCode != -412388685) {
                    if (hashCode == 2095 && str2.equals("AP")) {
                        str2 = "AS";
                    }
                } else if (str2.equals("Awaiting penalties")) {
                    str2 = "Aw. Sho.";
                }
            } else if (str2.equals("Penalties")) {
                str2 = "Shootout";
            }
        }
        String str3 = null;
        if (str2 != null) {
            Locale locale = Locale.US;
            str = i.k(locale, str2, locale);
        } else {
            str = null;
        }
        if ("not started".equals(str)) {
            str3 = "-";
        } else if ("Halftime".equals(str2)) {
            str3 = "HT";
        } else {
            if (!"Ended".equals(str2)) {
                if ("Overtime".equals(str2)) {
                    str3 = PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE;
                } else if (!"Removed".equals(str2)) {
                    if ("Awaiting extra time".equals(str2)) {
                        str3 = "Aw. ET";
                    } else if ("Extra time halftime".equals(str2)) {
                        str3 = "ET HT";
                    } else if ("Awaiting penalties".equals(str2)) {
                        str3 = "Aw. Pen.";
                    } else if ("Start delayed".equals(str2)) {
                        str3 = "Delayed";
                    } else if ("First break".equals(str2)) {
                        str3 = "1. break";
                    } else if ("Second break".equals(str2)) {
                        str3 = "2. break";
                    } else if ("Third break".equals(str2)) {
                        str3 = "3. break";
                    } else if (str2 != null) {
                        str3 = new Regex("(\\d)(st|nd|rd|th)").a.matcher(str2).replaceFirst("$1.");
                        str3.getClass();
                    }
                }
            }
            str3 = "FT";
        }
        return str3 == null ? "" : str3;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.description;
        return this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isExtraTime() {
        return ph0.a0(new Integer[]{32, 33, 34, 110, 50, 120, 40, 41, 42}).contains(Integer.valueOf(this.code));
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDescription(@NotNull String description) {
        description.getClass();
        this.description = description;
    }

    public final void setType(@NotNull String str) {
        str.getClass();
        this.type = str;
    }

    @NotNull
    public String toString() {
        int i = this.code;
        String str = this.description;
        return mz1.o(dmi.t(i, "Status(code=", ", description=", str, ", type="), this.type, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Status$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Status;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Status$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Status(int i, @Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.code = i;
        this.description = str;
        this.type = str2;
    }

    public /* synthetic */ Status(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }
}
