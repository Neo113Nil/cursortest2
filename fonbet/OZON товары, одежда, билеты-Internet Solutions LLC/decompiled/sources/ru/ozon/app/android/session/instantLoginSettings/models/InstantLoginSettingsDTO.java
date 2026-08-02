package ru.ozon.app.android.session.instantLoginSettings.models;

import B90.C2619v;
import Ih.a;
import K1.G;
import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subTitle", "isEnabled", "", "actionTurnOn", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "actionTurnOff", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "()Z", "getActionTurnOn", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getActionTurnOff", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InstantLoginSettingsDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final AtomActionDTO actionTurnOff;

    @NotNull
    private final AtomActionDTO actionTurnOn;
    private final boolean isEnabled;

    @NotNull
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;

    public InstantLoginSettingsDTO(@NotNull TextAtom title, @NotNull TextAtom subTitle, boolean z11, @NotNull AtomActionDTO actionTurnOn, @NotNull AtomActionDTO actionTurnOff) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(actionTurnOn, "actionTurnOn");
        Intrinsics.checkNotNullParameter(actionTurnOff, "actionTurnOff");
        this.title = title;
        this.subTitle = subTitle;
        this.isEnabled = z11;
        this.actionTurnOn = actionTurnOn;
        this.actionTurnOff = actionTurnOff;
    }

    public static /* synthetic */ InstantLoginSettingsDTO copy$default(InstantLoginSettingsDTO instantLoginSettingsDTO, TextAtom textAtom, TextAtom textAtom2, boolean z11, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = instantLoginSettingsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = instantLoginSettingsDTO.subTitle;
        }
        if ((i11 & 4) != 0) {
            z11 = instantLoginSettingsDTO.isEnabled;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = instantLoginSettingsDTO.actionTurnOn;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO2 = instantLoginSettingsDTO.actionTurnOff;
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        boolean z12 = z11;
        return instantLoginSettingsDTO.copy(textAtom, textAtom2, z12, atomActionDTO, atomActionDTO3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getActionTurnOn() {
        return this.actionTurnOn;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getActionTurnOff() {
        return this.actionTurnOff;
    }

    @NotNull
    public final InstantLoginSettingsDTO copy(@NotNull TextAtom title, @NotNull TextAtom subTitle, boolean isEnabled, @NotNull AtomActionDTO actionTurnOn, @NotNull AtomActionDTO actionTurnOff) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(actionTurnOn, "actionTurnOn");
        Intrinsics.checkNotNullParameter(actionTurnOff, "actionTurnOff");
        return new InstantLoginSettingsDTO(title, subTitle, isEnabled, actionTurnOn, actionTurnOff);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantLoginSettingsDTO)) {
            return false;
        }
        InstantLoginSettingsDTO instantLoginSettingsDTO = (InstantLoginSettingsDTO) other;
        return Intrinsics.d(this.title, instantLoginSettingsDTO.title) && Intrinsics.d(this.subTitle, instantLoginSettingsDTO.subTitle) && this.isEnabled == instantLoginSettingsDTO.isEnabled && Intrinsics.d(this.actionTurnOn, instantLoginSettingsDTO.actionTurnOn) && Intrinsics.d(this.actionTurnOff, instantLoginSettingsDTO.actionTurnOff);
    }

    @NotNull
    public final AtomActionDTO getActionTurnOff() {
        return this.actionTurnOff;
    }

    @NotNull
    public final AtomActionDTO getActionTurnOn() {
        return this.actionTurnOn;
    }

    @NotNull
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.actionTurnOff.hashCode() + a.b(this.actionTurnOn, C3532b.a(C2619v.b(this.title.hashCode() * 31, 31, this.subTitle), 31, this.isEnabled), 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        boolean z11 = this.isEnabled;
        AtomActionDTO atomActionDTO = this.actionTurnOn;
        AtomActionDTO atomActionDTO2 = this.actionTurnOff;
        StringBuilder a11 = HY.a.a("InstantLoginSettingsDTO(title=", textAtom, ", subTitle=", textAtom2, ", isEnabled=");
        a11.append(z11);
        a11.append(", actionTurnOn=");
        a11.append(atomActionDTO);
        a11.append(", actionTurnOff=");
        return G.c(a11, atomActionDTO2, ")");
    }
}
