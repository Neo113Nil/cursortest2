package ru.ozon.app.android.returns.creation.widgets.steps.data;

import C.o0;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/data/ReturnCreationStepsDTO;", "", "steps", "", "Lru/ozon/app/android/returns/creation/widgets/steps/data/Step;", "separatorColor", "", "backgroundColor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getSteps", "()Ljava/util/List;", "getSeparatorColor", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationStepsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final String separatorColor;

    @NotNull
    private final List<Step> steps;

    public ReturnCreationStepsDTO(@NotNull List<Step> steps, String str, String str2) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.steps = steps;
        this.separatorColor = str;
        this.backgroundColor = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnCreationStepsDTO copy$default(ReturnCreationStepsDTO returnCreationStepsDTO, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = returnCreationStepsDTO.steps;
        }
        if ((i11 & 2) != 0) {
            str = returnCreationStepsDTO.separatorColor;
        }
        if ((i11 & 4) != 0) {
            str2 = returnCreationStepsDTO.backgroundColor;
        }
        return returnCreationStepsDTO.copy(list, str, str2);
    }

    @NotNull
    public final List<Step> component1() {
        return this.steps;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ReturnCreationStepsDTO copy(@NotNull List<Step> steps, String separatorColor, String backgroundColor) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new ReturnCreationStepsDTO(steps, separatorColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationStepsDTO)) {
            return false;
        }
        ReturnCreationStepsDTO returnCreationStepsDTO = (ReturnCreationStepsDTO) other;
        return Intrinsics.d(this.steps, returnCreationStepsDTO.steps) && Intrinsics.d(this.separatorColor, returnCreationStepsDTO.separatorColor) && Intrinsics.d(this.backgroundColor, returnCreationStepsDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    @NotNull
    public final List<Step> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int hashCode = this.steps.hashCode() * 31;
        String str = this.separatorColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Step> list = this.steps;
        String str = this.separatorColor;
        return o0.c(C4055a.a("ReturnCreationStepsDTO(steps=", ", separatorColor=", str, ", backgroundColor=", list), this.backgroundColor, ")");
    }
}
