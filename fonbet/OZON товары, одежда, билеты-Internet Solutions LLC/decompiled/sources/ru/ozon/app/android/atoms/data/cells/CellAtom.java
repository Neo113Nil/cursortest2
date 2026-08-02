package ru.ozon.app.android.atoms.data.cells;

import B4.V;
import Bl.C2639a;
import C.J;
import D40.c;
import De.C2859b;
import Ds.C2880a;
import G.g;
import K1.G;
import Kk.C3532b;
import N3.C3660k;
import Pk0.f;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004./01B{\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u0082\u0001\u0003234¨\u00065"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "", "colorDisabledAsEnabled", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLru/ozon/uni/atoms/data/Type;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "()Ljava/lang/String;", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "()Z", "getColorDisabledAsEnabled", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "CellRegular24IconPicker", "CellRegularPicker", "CellAtomWithSubtitle", "Align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegularPicker;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CellAtom extends AtomDTO {
    private final AtomActionDTO action;

    @NotNull
    private final Align align;
    private final boolean colorDisabledAsEnabled;
    private final String context;
    private final boolean hideSeparator;
    private final Integer maxLines;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString title;

    @NotNull
    private final String titleColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGN_TYPE_TOP", "ALIGN_TYPE_CENTER", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Align {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;

        @i(name = "ALIGN_TYPE_TOP")
        public static final Align ALIGN_TYPE_TOP = new Align("ALIGN_TYPE_TOP", 0);

        @i(name = "ALIGN_TYPE_CENTER")
        public static final Align ALIGN_TYPE_CENTER = new Align("ALIGN_TYPE_CENTER", 1);

        private static final /* synthetic */ Align[] $values() {
            return new Align[]{ALIGN_TYPE_TOP, ALIGN_TYPE_CENTER};
        }

        static {
            Align[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Align(String str, int i11) {
        }

        @NotNull
        public static a<Align> getEntries() {
            return $ENTRIES;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001323456789:;<=>?@ABCDB\u008d\u0001\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101\u0082\u0001\u0013EFGHIJKLMNOPQRSTUVW¨\u0006X"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", "subtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitleColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "", "colorDisabledAsEnabled", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLru/ozon/uni/atoms/data/Type;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitleColor", "()Ljava/lang/String;", "getTitle", "getTitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "()Z", "getColorDisabledAsEnabled", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "CellWithSubtitle48Icon", "CellWithSubtitle48IconCheckboxRadio", "CellWithSubtitle40IconCheckboxRadio", "CellWithSubtitle32Icon", "CellWithSubtitle40Icon", "CellWithSubtitle24IconCheckboxRadio", "CellWithSubtitle24Icon", "CellWithSubtitle24IconPicker", "CellWithSubtitleCounter", "CellWithReverseSubtitleCounter", "CellWithSubtitleValue", "CellWithSubtitleToggle", "CellWithSubtitleCheckboxRadio", "CellWithSubtitleDefault", "CellWithSubtitleCheckboxRadioCounter", "CellWithSubtitle24IconCounter", "CellWithSubtitle24IconCheckboxRadioCounter", "CellWithSubtitleToggleCounter", "CellWithSubtitle24IconToggleCounter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithReverseSubtitleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconPicker;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconToggleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle32Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48IconCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleValue;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CellAtomWithSubtitle extends CellAtom {
        private final AtomActionDTO action;

        @NotNull
        private final Align align;
        private final boolean colorDisabledAsEnabled;
        private final String context;
        private final boolean hideSeparator;
        private final Integer maxLines;
        private final OzonSpannableString subtitle;

        @NotNull
        private final String subtitleColor;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;

        @NotNull
        private final String titleColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final Type type;

        public /* synthetic */ CellAtomWithSubtitle(OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, String str2, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, Type type, String str3, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, str, ozonSpannableString2, str2, align, num, atomActionDTO, z11, z12, type, str3, testInfo, map);
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public Align getAlign() {
            return this.align;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public boolean getColorDisabledAsEnabled() {
            return this.colorDisabledAsEnabled;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public boolean getHideSeparator() {
            return this.hideSeparator;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public Integer getMaxLines() {
            return this.maxLines;
        }

        public OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public String getSubtitleColor() {
            return this.subtitleColor;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public String getTitleColor() {
            return this.titleColor;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public /* synthetic */ CellAtomWithSubtitle(OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, String str2, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, Type type, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, str, ozonSpannableString2, str2, align, num, atomActionDTO, z11, z12, type, str3, (i11 & 2048) != 0 ? null : testInfo, (i11 & 4096) != 0 ? null : map, null);
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        @NotNull
        public Type getType() {
            return this.type;
        }

        private CellAtomWithSubtitle(OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, String str2, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, Type type, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(ozonSpannableString2, str2, align, num, atomActionDTO, z11, z12, type, str3, testInfo, map, null);
            this.subtitle = ozonSpannableString;
            this.subtitleColor = str;
            this.title = ozonSpannableString2;
            this.titleColor = str2;
            this.align = align;
            this.maxLines = num;
            this.action = atomActionDTO;
            this.hideSeparator = z11;
            this.colorDisabledAsEnabled = z12;
            this.type = type;
            this.context = str3;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00104\u001a\u00020\u0010H\u0016J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0017\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003JÈ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020\u0010J\u0013\u0010H\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\u0010HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\u0016\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010 R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010 R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0014\u0010\u0014\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006R"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "isSelected", "", "isRadio", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadio;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle24IconCheckboxRadio extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle24IconCheckboxRadio> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final boolean hideSeparator;

            @NotNull
            private final String icon;
            private final String iconTintColor;
            private final boolean isRadio;
            private final boolean isSelected;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle24IconCheckboxRadio> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconCheckboxRadio createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString3 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    boolean z13 = z12;
                    String readString4 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle24IconCheckboxRadio.class.getClassLoader());
                    boolean z14 = parcel2.readInt() != 0;
                    boolean z15 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString5 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle24IconCheckboxRadio.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitle24IconCheckboxRadio.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle24IconCheckboxRadio(readString, readString2, z11, z13, create, readString3, create2, readString4, valueOf, num, atomActionDTO, z14, z15, readString5, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconCheckboxRadio[] newArray(int i11) {
                    return new CellWithSubtitle24IconCheckboxRadio[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle24IconCheckboxRadio(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, ru.ozon.uni.atoms.utils.OzonSpannableString r25, java.lang.String r26, ru.ozon.uni.atoms.utils.OzonSpannableString r27, java.lang.String r28, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r29, java.lang.Integer r30, ru.ozon.uni.atoms.data.AtomActionDTO r31, boolean r32, boolean r33, java.lang.String r34, ru.ozon.uni.atoms.data.TestInfo r35, java.util.Map r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
                /*
                    r20 = this;
                    r0 = r37
                    r1 = r0 & 4
                    r2 = 0
                    if (r1 == 0) goto L9
                    r6 = r2
                    goto Lb
                L9:
                    r6 = r23
                Lb:
                    r1 = r0 & 8
                    if (r1 == 0) goto L11
                    r7 = r2
                    goto L13
                L11:
                    r7 = r24
                L13:
                    r1 = r0 & 32
                    if (r1 == 0) goto L1f
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r9 = r1
                    goto L21
                L1f:
                    r9 = r26
                L21:
                    r1 = r0 & 64
                    r3 = 0
                    if (r1 == 0) goto L28
                    r10 = r3
                    goto L2a
                L28:
                    r10 = r27
                L2a:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L36
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY
                    java.lang.String r1 = r1.getValue()
                    r11 = r1
                    goto L38
                L36:
                    r11 = r28
                L38:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L40
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r12 = r1
                    goto L42
                L40:
                    r12 = r29
                L42:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L48
                    r13 = r3
                    goto L4a
                L48:
                    r13 = r30
                L4a:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L50
                    r14 = r3
                    goto L52
                L50:
                    r14 = r31
                L52:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L58
                    r15 = r2
                    goto L5a
                L58:
                    r15 = r32
                L5a:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L61
                    r16 = r2
                    goto L63
                L61:
                    r16 = r33
                L63:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L6a
                    r17 = r3
                    goto L6c
                L6a:
                    r17 = r34
                L6c:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L73
                    r18 = r3
                    goto L75
                L73:
                    r18 = r35
                L75:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L86
                    r19 = r3
                    r4 = r21
                    r5 = r22
                    r8 = r25
                    r3 = r20
                    goto L90
                L86:
                    r19 = r36
                    r3 = r20
                    r4 = r21
                    r5 = r22
                    r8 = r25
                L90:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio.<init>(java.lang.String, java.lang.String, boolean, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component10, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component11, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component12, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component14, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component15, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component16() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsRadio() {
                return this.isRadio;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component7, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            @NotNull
            public final CellWithSubtitle24IconCheckboxRadio copy(@NotNull String icon, String iconTintColor, boolean isSelected, boolean isRadio, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle24IconCheckboxRadio(icon, iconTintColor, isSelected, isRadio, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle24IconCheckboxRadio)) {
                    return false;
                }
                CellWithSubtitle24IconCheckboxRadio cellWithSubtitle24IconCheckboxRadio = (CellWithSubtitle24IconCheckboxRadio) other;
                return Intrinsics.d(this.icon, cellWithSubtitle24IconCheckboxRadio.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle24IconCheckboxRadio.iconTintColor) && this.isSelected == cellWithSubtitle24IconCheckboxRadio.isSelected && this.isRadio == cellWithSubtitle24IconCheckboxRadio.isRadio && Intrinsics.d(this.title, cellWithSubtitle24IconCheckboxRadio.title) && Intrinsics.d(this.titleColor, cellWithSubtitle24IconCheckboxRadio.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle24IconCheckboxRadio.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle24IconCheckboxRadio.subtitleColor) && this.align == cellWithSubtitle24IconCheckboxRadio.align && Intrinsics.d(this.maxLines, cellWithSubtitle24IconCheckboxRadio.maxLines) && Intrinsics.d(this.action, cellWithSubtitle24IconCheckboxRadio.action) && this.hideSeparator == cellWithSubtitle24IconCheckboxRadio.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle24IconCheckboxRadio.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle24IconCheckboxRadio.context) && Intrinsics.d(this.testInfo, cellWithSubtitle24IconCheckboxRadio.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle24IconCheckboxRadio.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle24_icon_checkbox_radio;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                String str = this.iconTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a(C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected), 31, this.isRadio), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str2 = this.context;
                int hashCode3 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isRadio() {
                return this.isRadio;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                boolean z11 = this.isSelected;
                boolean z12 = this.isRadio;
                OzonSpannableString ozonSpannableString = this.title;
                String str3 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str4 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z13 = this.hideSeparator;
                boolean z14 = this.colorDisabledAsEnabled;
                String str5 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle24IconCheckboxRadio(icon=", str, ", iconTintColor=", str2, ", isSelected=");
                f.c(", isRadio=", ", title=", d11, z11, z12);
                HY.a.c(", titleColor=", str3, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str4, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z13);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str5, ", testInfo=", d11, z14);
                return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeInt(this.isRadio ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle24IconCheckboxRadio(@NotNull String icon, String str, boolean z11, boolean z12, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z13, z14, Type.CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO, str2, testInfo, map, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = icon;
                this.iconTintColor = str;
                this.isSelected = z11;
                this.isRadio = z12;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z13;
                this.colorDisabledAsEnabled = z14;
                this.context = str2;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u00109\u001a\u00020\u0015H\u0016J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u000eHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003Jö\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020\u0015J\u0013\u0010P\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\u0015HÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010#R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010#R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010#R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u0010\u0018\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0014\u0010\u0019\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&¨\u0006Z"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "isSelected", "", "isRadio", "showParanjaAndPaddings", "selectedTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isParanjaHidden", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/Map;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "()Z", "getShowParanjaAndPaddings", "getSelectedTrackingInfo", "()Ljava/util/Map;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/Map;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle40IconCheckboxRadio extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle40IconCheckboxRadio> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final boolean hideSeparator;
            private final String icon;
            private final String iconTintColor;
            private final boolean isParanjaHidden;
            private final boolean isRadio;
            private final boolean isSelected;
            private final Integer maxLines;
            private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;
            private final boolean showParanjaAndPaddings;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle40IconCheckboxRadio> {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle40IconCheckboxRadio createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    int i11;
                    LinkedHashMap linkedHashMap2;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    boolean z11 = false;
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    if (parcel2.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel2.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                        for (int i12 = 0; i12 != readInt; i12 = C2859b.a(CellWithSubtitle40IconCheckboxRadio.class, parcel2, linkedHashMap3, parcel2.readString(), i12, 1)) {
                        }
                        linkedHashMap = linkedHashMap3;
                    }
                    if (parcel2.readInt() != 0) {
                        i11 = 0;
                        z11 = true;
                    } else {
                        i11 = 0;
                    }
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    boolean z15 = z12;
                    String readString3 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString4 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle40IconCheckboxRadio.class.getClassLoader());
                    boolean z16 = z13;
                    boolean z17 = parcel2.readInt() != 0 ? 1 : i11;
                    boolean z18 = parcel2.readInt() != 0 ? 1 : i11;
                    String readString5 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle40IconCheckboxRadio.class.getClassLoader());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int readInt2 = parcel2.readInt();
                        int i13 = i11;
                        linkedHashMap2 = new LinkedHashMap(readInt2);
                        while (i13 != readInt2) {
                            i13 = C2859b.a(CellWithSubtitle40IconCheckboxRadio.class, parcel2, linkedHashMap2, parcel2.readString(), i13, 1);
                            parcel2 = parcel;
                            readInt2 = readInt2;
                        }
                    }
                    return new CellWithSubtitle40IconCheckboxRadio(readString, readString2, z15, z16, z14, linkedHashMap, z11, create, readString3, create2, readString4, valueOf, valueOf2, atomActionDTO, z17, z18, readString5, testInfo, linkedHashMap2);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle40IconCheckboxRadio[] newArray(int i11) {
                    return new CellWithSubtitle40IconCheckboxRadio[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle40IconCheckboxRadio(java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, boolean r28, java.util.Map r29, boolean r30, ru.ozon.uni.atoms.utils.OzonSpannableString r31, java.lang.String r32, ru.ozon.uni.atoms.utils.OzonSpannableString r33, java.lang.String r34, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r35, java.lang.Integer r36, ru.ozon.uni.atoms.data.AtomActionDTO r37, boolean r38, boolean r39, java.lang.String r40, ru.ozon.uni.atoms.data.TestInfo r41, java.util.Map r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
                /*
                    Method dump skipped, instructions count: 178
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, java.util.Map, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitle40IconCheckboxRadio copy$default(CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio, String str, String str2, boolean z11, boolean z12, boolean z13, Map map, boolean z14, OzonSpannableString ozonSpannableString, String str3, OzonSpannableString ozonSpannableString2, String str4, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z15, boolean z16, String str5, TestInfo testInfo, Map map2, int i11, Object obj) {
                Map map3;
                TestInfo testInfo2;
                String str6 = (i11 & 1) != 0 ? cellWithSubtitle40IconCheckboxRadio.icon : str;
                String str7 = (i11 & 2) != 0 ? cellWithSubtitle40IconCheckboxRadio.iconTintColor : str2;
                boolean z17 = (i11 & 4) != 0 ? cellWithSubtitle40IconCheckboxRadio.isSelected : z11;
                boolean z18 = (i11 & 8) != 0 ? cellWithSubtitle40IconCheckboxRadio.isRadio : z12;
                boolean z19 = (i11 & 16) != 0 ? cellWithSubtitle40IconCheckboxRadio.showParanjaAndPaddings : z13;
                Map map4 = (i11 & 32) != 0 ? cellWithSubtitle40IconCheckboxRadio.selectedTrackingInfo : map;
                boolean z21 = (i11 & 64) != 0 ? cellWithSubtitle40IconCheckboxRadio.isParanjaHidden : z14;
                OzonSpannableString ozonSpannableString3 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle40IconCheckboxRadio.title : ozonSpannableString;
                String str8 = (i11 & 256) != 0 ? cellWithSubtitle40IconCheckboxRadio.titleColor : str3;
                OzonSpannableString ozonSpannableString4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle40IconCheckboxRadio.subtitle : ozonSpannableString2;
                String str9 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle40IconCheckboxRadio.subtitleColor : str4;
                Align align2 = (i11 & 2048) != 0 ? cellWithSubtitle40IconCheckboxRadio.align : align;
                Integer num2 = (i11 & 4096) != 0 ? cellWithSubtitle40IconCheckboxRadio.maxLines : num;
                AtomActionDTO atomActionDTO2 = (i11 & 8192) != 0 ? cellWithSubtitle40IconCheckboxRadio.action : atomActionDTO;
                String str10 = str6;
                boolean z22 = (i11 & 16384) != 0 ? cellWithSubtitle40IconCheckboxRadio.hideSeparator : z15;
                boolean z23 = (i11 & 32768) != 0 ? cellWithSubtitle40IconCheckboxRadio.colorDisabledAsEnabled : z16;
                String str11 = (i11 & 65536) != 0 ? cellWithSubtitle40IconCheckboxRadio.context : str5;
                TestInfo testInfo3 = (i11 & 131072) != 0 ? cellWithSubtitle40IconCheckboxRadio.testInfo : testInfo;
                if ((i11 & 262144) != 0) {
                    testInfo2 = testInfo3;
                    map3 = cellWithSubtitle40IconCheckboxRadio.trackingInfo;
                } else {
                    map3 = map2;
                    testInfo2 = testInfo3;
                }
                return cellWithSubtitle40IconCheckboxRadio.copy(str10, str7, z17, z18, z19, map4, z21, ozonSpannableString3, str8, ozonSpannableString4, str9, align2, num2, atomActionDTO2, z22, z23, str11, testInfo2, map3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component10, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component13, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component14, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component15, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component16, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component17, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component18, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component19() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsRadio() {
                return this.isRadio;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowParanjaAndPaddings() {
                return this.showParanjaAndPaddings;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.selectedTrackingInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsParanjaHidden() {
                return this.isParanjaHidden;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            @NotNull
            public final CellWithSubtitle40IconCheckboxRadio copy(String icon, String iconTintColor, boolean isSelected, boolean isRadio, boolean showParanjaAndPaddings, Map<String, TokenizedTrackingInfo> selectedTrackingInfo, boolean isParanjaHidden, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle40IconCheckboxRadio(icon, iconTintColor, isSelected, isRadio, showParanjaAndPaddings, selectedTrackingInfo, isParanjaHidden, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle40IconCheckboxRadio)) {
                    return false;
                }
                CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio = (CellWithSubtitle40IconCheckboxRadio) other;
                return Intrinsics.d(this.icon, cellWithSubtitle40IconCheckboxRadio.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle40IconCheckboxRadio.iconTintColor) && this.isSelected == cellWithSubtitle40IconCheckboxRadio.isSelected && this.isRadio == cellWithSubtitle40IconCheckboxRadio.isRadio && this.showParanjaAndPaddings == cellWithSubtitle40IconCheckboxRadio.showParanjaAndPaddings && Intrinsics.d(this.selectedTrackingInfo, cellWithSubtitle40IconCheckboxRadio.selectedTrackingInfo) && this.isParanjaHidden == cellWithSubtitle40IconCheckboxRadio.isParanjaHidden && Intrinsics.d(this.title, cellWithSubtitle40IconCheckboxRadio.title) && Intrinsics.d(this.titleColor, cellWithSubtitle40IconCheckboxRadio.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle40IconCheckboxRadio.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle40IconCheckboxRadio.subtitleColor) && this.align == cellWithSubtitle40IconCheckboxRadio.align && Intrinsics.d(this.maxLines, cellWithSubtitle40IconCheckboxRadio.maxLines) && Intrinsics.d(this.action, cellWithSubtitle40IconCheckboxRadio.action) && this.hideSeparator == cellWithSubtitle40IconCheckboxRadio.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle40IconCheckboxRadio.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle40IconCheckboxRadio.context) && Intrinsics.d(this.testInfo, cellWithSubtitle40IconCheckboxRadio.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle40IconCheckboxRadio.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle40_icon_checkbox_radio;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
                return this.selectedTrackingInfo;
            }

            public final boolean getShowParanjaAndPaddings() {
                return this.showParanjaAndPaddings;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.icon;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconTintColor;
                int a11 = C3532b.a(C3532b.a(C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSelected), 31, this.isRadio), 31, this.showParanjaAndPaddings);
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                int a12 = g.a(P.c(this.title, C3532b.a((a11 + (map == null ? 0 : map.hashCode())) * 31, 31, this.isParanjaHidden), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a12 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a13 = C3532b.a(C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str3 = this.context;
                int hashCode3 = (a13 + (str3 == null ? 0 : str3.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                return hashCode4 + (map2 != null ? map2.hashCode() : 0);
            }

            public final boolean isParanjaHidden() {
                return this.isParanjaHidden;
            }

            public final boolean isRadio() {
                return this.isRadio;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                boolean z11 = this.isSelected;
                boolean z12 = this.isRadio;
                boolean z13 = this.showParanjaAndPaddings;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                boolean z14 = this.isParanjaHidden;
                OzonSpannableString ozonSpannableString = this.title;
                String str3 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str4 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z15 = this.hideSeparator;
                boolean z16 = this.colorDisabledAsEnabled;
                String str5 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle40IconCheckboxRadio(icon=", str, ", iconTintColor=", str2, ", isSelected=");
                f.c(", isRadio=", ", showParanjaAndPaddings=", d11, z11, z12);
                d11.append(z13);
                d11.append(", selectedTrackingInfo=");
                d11.append(map);
                d11.append(", isParanjaHidden=");
                d11.append(z14);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str3, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str4);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z15, z16);
                C4070a.b(d11, str5, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map2, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeInt(this.isRadio ? 1 : 0);
                dest.writeInt(this.showParanjaAndPaddings ? 1 : 0);
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                dest.writeInt(this.isParanjaHidden ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                if (map2 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e12 = J.e(map2, dest, 1);
                while (e12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) e12.next();
                    dest.writeString((String) entry2.getKey());
                    dest.writeParcelable((Parcelable) entry2.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle40IconCheckboxRadio(String str, String str2, boolean z11, boolean z12, boolean z13, Map<String, TokenizedTrackingInfo> map, boolean z14, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z15, boolean z16, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map2) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z15, z16, Type.CELL_WITH_SUBTITLE_40ICON_CHECKBOX_RADIO, str3, testInfo, map2, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = str;
                this.iconTintColor = str2;
                this.isSelected = z11;
                this.isRadio = z12;
                this.showParanjaAndPaddings = z13;
                this.selectedTrackingInfo = map;
                this.isParanjaHidden = z14;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z15;
                this.colorDisabledAsEnabled = z16;
                this.context = str3;
                this.testInfo = testInfo;
                this.trackingInfo = map2;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00106\u001a\u00020\u0011H\u0016J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003JÒ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020\u0011J\u0013\u0010K\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0011HÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001J\u0016\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010!R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010!R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\u0014\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006U"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48IconCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "isSelected", "", "isRadio", "showParanjaAndPaddings", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "()Z", "getShowParanjaAndPaddings", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48IconCheckboxRadio;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle48IconCheckboxRadio extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle48IconCheckboxRadio> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final boolean hideSeparator;

            @NotNull
            private final String icon;
            private final String iconTintColor;
            private final boolean isRadio;
            private final boolean isSelected;
            private final Integer maxLines;
            private final boolean showParanjaAndPaddings;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle48IconCheckboxRadio> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle48IconCheckboxRadio createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    boolean z14 = z11;
                    String readString3 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString4 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle48IconCheckboxRadio.class.getClassLoader());
                    boolean z15 = parcel2.readInt() != 0;
                    boolean z16 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString5 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle48IconCheckboxRadio.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitle48IconCheckboxRadio.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle48IconCheckboxRadio(readString, readString2, z14, z12, z13, create, readString3, create2, readString4, valueOf, num, atomActionDTO, z15, z16, readString5, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle48IconCheckboxRadio[] newArray(int i11) {
                    return new CellWithSubtitle48IconCheckboxRadio[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle48IconCheckboxRadio(java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, boolean r26, ru.ozon.uni.atoms.utils.OzonSpannableString r27, java.lang.String r28, ru.ozon.uni.atoms.utils.OzonSpannableString r29, java.lang.String r30, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r31, java.lang.Integer r32, ru.ozon.uni.atoms.data.AtomActionDTO r33, boolean r34, boolean r35, java.lang.String r36, ru.ozon.uni.atoms.data.TestInfo r37, java.util.Map r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
                /*
                    r21 = this;
                    r0 = r39
                    r1 = r0 & 4
                    r2 = 0
                    if (r1 == 0) goto L9
                    r6 = r2
                    goto Lb
                L9:
                    r6 = r24
                Lb:
                    r1 = r0 & 8
                    if (r1 == 0) goto L11
                    r7 = r2
                    goto L13
                L11:
                    r7 = r25
                L13:
                    r1 = r0 & 16
                    if (r1 == 0) goto L19
                    r8 = r2
                    goto L1b
                L19:
                    r8 = r26
                L1b:
                    r1 = r0 & 64
                    if (r1 == 0) goto L27
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r10 = r1
                    goto L29
                L27:
                    r10 = r28
                L29:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    r3 = 0
                    if (r1 == 0) goto L30
                    r11 = r3
                    goto L32
                L30:
                    r11 = r29
                L32:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L3e
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r12 = r1
                    goto L40
                L3e:
                    r12 = r30
                L40:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L48
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r13 = r1
                    goto L4a
                L48:
                    r13 = r31
                L4a:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L50
                    r14 = r3
                    goto L52
                L50:
                    r14 = r32
                L52:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L58
                    r15 = r3
                    goto L5a
                L58:
                    r15 = r33
                L5a:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L61
                    r16 = r2
                    goto L63
                L61:
                    r16 = r34
                L63:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L6a
                    r17 = r2
                    goto L6c
                L6a:
                    r17 = r35
                L6c:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L73
                    r18 = r3
                    goto L75
                L73:
                    r18 = r36
                L75:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L7e
                    r19 = r3
                    goto L80
                L7e:
                    r19 = r37
                L80:
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L90
                    r20 = r3
                    r4 = r22
                    r5 = r23
                    r9 = r27
                    r3 = r21
                    goto L9a
                L90:
                    r20 = r38
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r9 = r27
                L9a:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle48IconCheckboxRadio.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitle48IconCheckboxRadio copy$default(CellWithSubtitle48IconCheckboxRadio cellWithSubtitle48IconCheckboxRadio, String str, String str2, boolean z11, boolean z12, boolean z13, OzonSpannableString ozonSpannableString, String str3, OzonSpannableString ozonSpannableString2, String str4, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z14, boolean z15, String str5, TestInfo testInfo, Map map, int i11, Object obj) {
                Map map2;
                TestInfo testInfo2;
                String str6;
                CellWithSubtitle48IconCheckboxRadio cellWithSubtitle48IconCheckboxRadio2;
                String str7;
                String str8;
                boolean z16;
                boolean z17;
                boolean z18;
                OzonSpannableString ozonSpannableString3;
                String str9;
                OzonSpannableString ozonSpannableString4;
                String str10;
                Align align2;
                Integer num2;
                AtomActionDTO atomActionDTO2;
                boolean z19;
                boolean z21;
                String str11 = (i11 & 1) != 0 ? cellWithSubtitle48IconCheckboxRadio.icon : str;
                String str12 = (i11 & 2) != 0 ? cellWithSubtitle48IconCheckboxRadio.iconTintColor : str2;
                boolean z22 = (i11 & 4) != 0 ? cellWithSubtitle48IconCheckboxRadio.isSelected : z11;
                boolean z23 = (i11 & 8) != 0 ? cellWithSubtitle48IconCheckboxRadio.isRadio : z12;
                boolean z24 = (i11 & 16) != 0 ? cellWithSubtitle48IconCheckboxRadio.showParanjaAndPaddings : z13;
                OzonSpannableString ozonSpannableString5 = (i11 & 32) != 0 ? cellWithSubtitle48IconCheckboxRadio.title : ozonSpannableString;
                String str13 = (i11 & 64) != 0 ? cellWithSubtitle48IconCheckboxRadio.titleColor : str3;
                OzonSpannableString ozonSpannableString6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle48IconCheckboxRadio.subtitle : ozonSpannableString2;
                String str14 = (i11 & 256) != 0 ? cellWithSubtitle48IconCheckboxRadio.subtitleColor : str4;
                Align align3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle48IconCheckboxRadio.align : align;
                Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle48IconCheckboxRadio.maxLines : num;
                AtomActionDTO atomActionDTO3 = (i11 & 2048) != 0 ? cellWithSubtitle48IconCheckboxRadio.action : atomActionDTO;
                boolean z25 = (i11 & 4096) != 0 ? cellWithSubtitle48IconCheckboxRadio.hideSeparator : z14;
                boolean z26 = (i11 & 8192) != 0 ? cellWithSubtitle48IconCheckboxRadio.colorDisabledAsEnabled : z15;
                String str15 = str11;
                String str16 = (i11 & 16384) != 0 ? cellWithSubtitle48IconCheckboxRadio.context : str5;
                TestInfo testInfo3 = (i11 & 32768) != 0 ? cellWithSubtitle48IconCheckboxRadio.testInfo : testInfo;
                if ((i11 & 65536) != 0) {
                    testInfo2 = testInfo3;
                    map2 = cellWithSubtitle48IconCheckboxRadio.trackingInfo;
                    str7 = str16;
                    str8 = str12;
                    z16 = z22;
                    z17 = z23;
                    z18 = z24;
                    ozonSpannableString3 = ozonSpannableString5;
                    str9 = str13;
                    ozonSpannableString4 = ozonSpannableString6;
                    str10 = str14;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z19 = z25;
                    z21 = z26;
                    str6 = str15;
                    cellWithSubtitle48IconCheckboxRadio2 = cellWithSubtitle48IconCheckboxRadio;
                } else {
                    map2 = map;
                    testInfo2 = testInfo3;
                    str6 = str15;
                    cellWithSubtitle48IconCheckboxRadio2 = cellWithSubtitle48IconCheckboxRadio;
                    str7 = str16;
                    str8 = str12;
                    z16 = z22;
                    z17 = z23;
                    z18 = z24;
                    ozonSpannableString3 = ozonSpannableString5;
                    str9 = str13;
                    ozonSpannableString4 = ozonSpannableString6;
                    str10 = str14;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z19 = z25;
                    z21 = z26;
                }
                return cellWithSubtitle48IconCheckboxRadio2.copy(str6, str8, z16, z17, z18, ozonSpannableString3, str9, ozonSpannableString4, str10, align2, num2, atomActionDTO2, z19, z21, str7, testInfo2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component16, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component17() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsRadio() {
                return this.isRadio;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowParanjaAndPaddings() {
                return this.showParanjaAndPaddings;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final CellWithSubtitle48IconCheckboxRadio copy(@NotNull String icon, String iconTintColor, boolean isSelected, boolean isRadio, boolean showParanjaAndPaddings, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle48IconCheckboxRadio(icon, iconTintColor, isSelected, isRadio, showParanjaAndPaddings, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle48IconCheckboxRadio)) {
                    return false;
                }
                CellWithSubtitle48IconCheckboxRadio cellWithSubtitle48IconCheckboxRadio = (CellWithSubtitle48IconCheckboxRadio) other;
                return Intrinsics.d(this.icon, cellWithSubtitle48IconCheckboxRadio.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle48IconCheckboxRadio.iconTintColor) && this.isSelected == cellWithSubtitle48IconCheckboxRadio.isSelected && this.isRadio == cellWithSubtitle48IconCheckboxRadio.isRadio && this.showParanjaAndPaddings == cellWithSubtitle48IconCheckboxRadio.showParanjaAndPaddings && Intrinsics.d(this.title, cellWithSubtitle48IconCheckboxRadio.title) && Intrinsics.d(this.titleColor, cellWithSubtitle48IconCheckboxRadio.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle48IconCheckboxRadio.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle48IconCheckboxRadio.subtitleColor) && this.align == cellWithSubtitle48IconCheckboxRadio.align && Intrinsics.d(this.maxLines, cellWithSubtitle48IconCheckboxRadio.maxLines) && Intrinsics.d(this.action, cellWithSubtitle48IconCheckboxRadio.action) && this.hideSeparator == cellWithSubtitle48IconCheckboxRadio.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle48IconCheckboxRadio.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle48IconCheckboxRadio.context) && Intrinsics.d(this.testInfo, cellWithSubtitle48IconCheckboxRadio.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle48IconCheckboxRadio.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle48_icon_checkbox_radio;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final boolean getShowParanjaAndPaddings() {
                return this.showParanjaAndPaddings;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                String str = this.iconTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a(C3532b.a(C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected), 31, this.isRadio), 31, this.showParanjaAndPaddings), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str2 = this.context;
                int hashCode3 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isRadio() {
                return this.isRadio;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                boolean z11 = this.isSelected;
                boolean z12 = this.isRadio;
                boolean z13 = this.showParanjaAndPaddings;
                OzonSpannableString ozonSpannableString = this.title;
                String str3 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str4 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z14 = this.hideSeparator;
                boolean z15 = this.colorDisabledAsEnabled;
                String str5 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle48IconCheckboxRadio(icon=", str, ", iconTintColor=", str2, ", isSelected=");
                f.c(", isRadio=", ", showParanjaAndPaddings=", d11, z11, z12);
                d11.append(z13);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str3, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str4);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z14, z15);
                C4070a.b(d11, str5, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeInt(this.isRadio ? 1 : 0);
                dest.writeInt(this.showParanjaAndPaddings ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle48IconCheckboxRadio(@NotNull String icon, String str, boolean z11, boolean z12, boolean z13, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z14, boolean z15, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z14, z15, Type.CELL_WITH_SUBTITLE_48ICON_CHECKBOX_RADIO, str2, testInfo, map, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = icon;
                this.iconTintColor = str;
                this.isSelected = z11;
                this.isRadio = z12;
                this.showParanjaAndPaddings = z13;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z14;
                this.colorDisabledAsEnabled = z15;
                this.context = str2;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00101\u001a\u00020\u000fH\u0016J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J¼\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\u000fJ\u0013\u0010D\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000fHÖ\u0001J\t\u0010H\u001a\u00020\tHÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\u0012\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006N"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "isSelected", "", "isRadio", "isAutoToggleDisabled", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "()Ljava/lang/String;", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ZZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleCheckboxRadio extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleCheckboxRadio> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final boolean hideSeparator;
            private final transient boolean isAutoToggleDisabled;
            private final boolean isRadio;
            private final boolean isSelected;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleCheckboxRadio> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleCheckboxRadio createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString2 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleCheckboxRadio.class.getClassLoader());
                    Integer num = valueOf2;
                    boolean z14 = parcel2.readInt() != 0;
                    boolean z15 = parcel2.readInt() != 0;
                    String readString3 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleCheckboxRadio.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitleCheckboxRadio.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitleCheckboxRadio(z11, z12, z13, create, readString, create2, readString2, valueOf, num, atomActionDTO, z14, z15, readString3, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleCheckboxRadio[] newArray(int i11) {
                    return new CellWithSubtitleCheckboxRadio[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitleCheckboxRadio(boolean r20, boolean r21, boolean r22, ru.ozon.uni.atoms.utils.OzonSpannableString r23, java.lang.String r24, ru.ozon.uni.atoms.utils.OzonSpannableString r25, java.lang.String r26, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r27, java.lang.Integer r28, ru.ozon.uni.atoms.data.AtomActionDTO r29, boolean r30, boolean r31, java.lang.String r32, ru.ozon.uni.atoms.data.TestInfo r33, java.util.Map r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
                /*
                    r19 = this;
                    r0 = r35
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L9
                    r4 = r2
                    goto Lb
                L9:
                    r4 = r20
                Lb:
                    r1 = r0 & 2
                    if (r1 == 0) goto L11
                    r5 = r2
                    goto L13
                L11:
                    r5 = r21
                L13:
                    r1 = r0 & 4
                    if (r1 == 0) goto L19
                    r6 = r2
                    goto L1b
                L19:
                    r6 = r22
                L1b:
                    r1 = r0 & 16
                    if (r1 == 0) goto L27
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r8 = r1
                    goto L29
                L27:
                    r8 = r24
                L29:
                    r1 = r0 & 32
                    r3 = 0
                    if (r1 == 0) goto L30
                    r9 = r3
                    goto L32
                L30:
                    r9 = r25
                L32:
                    r1 = r0 & 64
                    if (r1 == 0) goto L3e
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r10 = r1
                    goto L40
                L3e:
                    r10 = r26
                L40:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L48
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r11 = r1
                    goto L4a
                L48:
                    r11 = r27
                L4a:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L50
                    r12 = r3
                    goto L52
                L50:
                    r12 = r28
                L52:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L58
                    r13 = r3
                    goto L5a
                L58:
                    r13 = r29
                L5a:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L60
                    r14 = r2
                    goto L62
                L60:
                    r14 = r30
                L62:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L68
                    r15 = r2
                    goto L6a
                L68:
                    r15 = r31
                L6a:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L71
                    r16 = r3
                    goto L73
                L71:
                    r16 = r32
                L73:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L7a
                    r17 = r3
                    goto L7c
                L7a:
                    r17 = r33
                L7c:
                    r0 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r0 == 0) goto L87
                    r18 = r3
                    r7 = r23
                    r3 = r19
                    goto L8d
                L87:
                    r18 = r34
                    r3 = r19
                    r7 = r23
                L8d:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.<init>(boolean, boolean, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component10, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component11, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component12, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component13, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component14, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component15() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsRadio() {
                return this.isRadio;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsAutoToggleDisabled() {
                return this.isAutoToggleDisabled;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            @NotNull
            public final CellWithSubtitleCheckboxRadio copy(boolean isSelected, boolean isRadio, boolean isAutoToggleDisabled, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleCheckboxRadio(isSelected, isRadio, isAutoToggleDisabled, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleCheckboxRadio)) {
                    return false;
                }
                CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio = (CellWithSubtitleCheckboxRadio) other;
                return this.isSelected == cellWithSubtitleCheckboxRadio.isSelected && this.isRadio == cellWithSubtitleCheckboxRadio.isRadio && this.isAutoToggleDisabled == cellWithSubtitleCheckboxRadio.isAutoToggleDisabled && Intrinsics.d(this.title, cellWithSubtitleCheckboxRadio.title) && Intrinsics.d(this.titleColor, cellWithSubtitleCheckboxRadio.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleCheckboxRadio.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleCheckboxRadio.subtitleColor) && this.align == cellWithSubtitleCheckboxRadio.align && Intrinsics.d(this.maxLines, cellWithSubtitleCheckboxRadio.maxLines) && Intrinsics.d(this.action, cellWithSubtitleCheckboxRadio.action) && this.hideSeparator == cellWithSubtitleCheckboxRadio.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleCheckboxRadio.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleCheckboxRadio.context) && Intrinsics.d(this.testInfo, cellWithSubtitleCheckboxRadio.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleCheckboxRadio.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_checkbox_radio;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(P.c(this.title, C3532b.a(C3532b.a(Boolean.hashCode(this.isSelected) * 31, 31, this.isRadio), 31, this.isAutoToggleDisabled), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str = this.context;
                int hashCode2 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isAutoToggleDisabled() {
                return this.isAutoToggleDisabled;
            }

            public final boolean isRadio() {
                return this.isRadio;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                boolean z12 = this.isRadio;
                boolean z13 = this.isAutoToggleDisabled;
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str2 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z14 = this.hideSeparator;
                boolean z15 = this.colorDisabledAsEnabled;
                String str3 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = Lh.a.d("CellWithSubtitleCheckboxRadio(isSelected=", ", isRadio=", ", isAutoToggleDisabled=", z11, z12);
                d11.append(z13);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str2);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z14, z15);
                C4070a.b(d11, str3, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeInt(this.isRadio ? 1 : 0);
                dest.writeInt(this.isAutoToggleDisabled ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleCheckboxRadio(boolean z11, boolean z12, boolean z13, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z14, boolean z15, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z14, z15, Type.CELL_WITH_SUBTITLE_CHECKBOX_RADIO, str, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.isSelected = z11;
                this.isRadio = z12;
                this.isAutoToggleDisabled = z13;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z14;
                this.colorDisabledAsEnabled = z15;
                this.context = str;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010/\u001a\u00020\rH\u0016J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J¨\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010>J\u0006\u0010?\u001a\u00020\rJ\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\rHÖ\u0001J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0010\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006J"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "()Ljava/lang/String;", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleToggle extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleToggle> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final boolean hideSeparator;
            private final boolean isSelected;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleToggle> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleToggle createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    boolean z12 = z11;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString2 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleToggle.class.getClassLoader());
                    Integer num = valueOf2;
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    String readString3 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleToggle.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitleToggle.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitleToggle(z12, create, readString, create2, readString2, valueOf, num, atomActionDTO, z13, z14, readString3, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleToggle[] newArray(int i11) {
                    return new CellWithSubtitleToggle[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitleToggle(boolean r18, ru.ozon.uni.atoms.utils.OzonSpannableString r19, java.lang.String r20, ru.ozon.uni.atoms.utils.OzonSpannableString r21, java.lang.String r22, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r23, java.lang.Integer r24, ru.ozon.uni.atoms.data.AtomActionDTO r25, boolean r26, boolean r27, java.lang.String r28, ru.ozon.uni.atoms.data.TestInfo r29, java.util.Map r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
                /*
                    r17 = this;
                    r0 = r31
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L9
                    r4 = r2
                    goto Lb
                L9:
                    r4 = r18
                Lb:
                    r1 = r0 & 4
                    if (r1 == 0) goto L17
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r6 = r1
                    goto L19
                L17:
                    r6 = r20
                L19:
                    r1 = r0 & 8
                    r3 = 0
                    if (r1 == 0) goto L20
                    r7 = r3
                    goto L22
                L20:
                    r7 = r21
                L22:
                    r1 = r0 & 16
                    if (r1 == 0) goto L2e
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r8 = r1
                    goto L30
                L2e:
                    r8 = r22
                L30:
                    r1 = r0 & 32
                    if (r1 == 0) goto L38
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r9 = r1
                    goto L3a
                L38:
                    r9 = r23
                L3a:
                    r1 = r0 & 64
                    if (r1 == 0) goto L40
                    r10 = r3
                    goto L42
                L40:
                    r10 = r24
                L42:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L48
                    r11 = r3
                    goto L4a
                L48:
                    r11 = r25
                L4a:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L50
                    r12 = r2
                    goto L52
                L50:
                    r12 = r26
                L52:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L58
                    r13 = r2
                    goto L5a
                L58:
                    r13 = r27
                L5a:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L60
                    r14 = r3
                    goto L62
                L60:
                    r14 = r28
                L62:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L68
                    r15 = r3
                    goto L6a
                L68:
                    r15 = r29
                L6a:
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L75
                    r16 = r3
                    r5 = r19
                    r3 = r17
                    goto L7b
                L75:
                    r16 = r30
                    r3 = r17
                    r5 = r19
                L7b:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.<init>(boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitleToggle copy$default(CellWithSubtitleToggle cellWithSubtitleToggle, boolean z11, OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, String str2, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = cellWithSubtitleToggle.isSelected;
                }
                return cellWithSubtitleToggle.copy(z11, (i11 & 2) != 0 ? cellWithSubtitleToggle.title : ozonSpannableString, (i11 & 4) != 0 ? cellWithSubtitleToggle.titleColor : str, (i11 & 8) != 0 ? cellWithSubtitleToggle.subtitle : ozonSpannableString2, (i11 & 16) != 0 ? cellWithSubtitleToggle.subtitleColor : str2, (i11 & 32) != 0 ? cellWithSubtitleToggle.align : align, (i11 & 64) != 0 ? cellWithSubtitleToggle.maxLines : num, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitleToggle.action : atomActionDTO, (i11 & 256) != 0 ? cellWithSubtitleToggle.hideSeparator : z12, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitleToggle.colorDisabledAsEnabled : z13, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitleToggle.context : str3, (i11 & 2048) != 0 ? cellWithSubtitleToggle.testInfo : testInfo, (i11 & 4096) != 0 ? cellWithSubtitleToggle.trackingInfo : map);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component11, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component12, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component13() {
                return this.trackingInfo;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component4, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component7, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component8, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component9, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final CellWithSubtitleToggle copy(boolean isSelected, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleToggle(isSelected, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleToggle)) {
                    return false;
                }
                CellWithSubtitleToggle cellWithSubtitleToggle = (CellWithSubtitleToggle) other;
                return this.isSelected == cellWithSubtitleToggle.isSelected && Intrinsics.d(this.title, cellWithSubtitleToggle.title) && Intrinsics.d(this.titleColor, cellWithSubtitleToggle.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleToggle.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleToggle.subtitleColor) && this.align == cellWithSubtitleToggle.align && Intrinsics.d(this.maxLines, cellWithSubtitleToggle.maxLines) && Intrinsics.d(this.action, cellWithSubtitleToggle.action) && this.hideSeparator == cellWithSubtitleToggle.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleToggle.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleToggle.context) && Intrinsics.d(this.testInfo, cellWithSubtitleToggle.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleToggle.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_toggle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(P.c(this.title, Boolean.hashCode(this.isSelected) * 31, 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str = this.context;
                int hashCode2 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                OzonSpannableString ozonSpannableString = this.title;
                String str = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str2 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str3 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("CellWithSubtitleToggle(isSelected=");
                sb2.append(z11);
                sb2.append(", title=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", titleColor=");
                B6.b.c(str, ", subtitle=", ", subtitleColor=", sb2, ozonSpannableString2);
                sb2.append(str2);
                sb2.append(", align=");
                sb2.append(align);
                sb2.append(", maxLines=");
                sb2.append(num);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", sb2, z12, z13);
                C4070a.b(sb2, str3, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(sb2, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSelected ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleToggle(boolean z11, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_TOGGLE, str, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.isSelected = z11;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00108\u001a\u00020\u0011H\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003JØ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0011J\u0013\u0010M\u001a\u00020\b2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0011HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u0010\u0015\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006W"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithReverseSubtitleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "counter", "", "counterColor", "counterBackground", "disclosureTintColor", "hideDisclosure", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getCounter", "()Ljava/lang/String;", "getCounterColor", "getCounterBackground", "getDisclosureTintColor", "getHideDisclosure", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithReverseSubtitleCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithReverseSubtitleCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithReverseSubtitleCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;
            private final String counterBackground;
            private final String counterColor;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithReverseSubtitleCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithReverseSubtitleCounter createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString5 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString6 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithReverseSubtitleCounter.class.getClassLoader());
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString7 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithReverseSubtitleCounter.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithReverseSubtitleCounter.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithReverseSubtitleCounter(readString, readString2, readString3, readString4, z11, create, readString5, create2, readString6, valueOf, num, atomActionDTO, z12, z13, readString7, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithReverseSubtitleCounter[] newArray(int i11) {
                    return new CellWithReverseSubtitleCounter[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithReverseSubtitleCounter(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, ru.ozon.uni.atoms.utils.OzonSpannableString r26, java.lang.String r27, ru.ozon.uni.atoms.utils.OzonSpannableString r28, java.lang.String r29, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r30, java.lang.Integer r31, ru.ozon.uni.atoms.data.AtomActionDTO r32, boolean r33, boolean r34, java.lang.String r35, ru.ozon.uni.atoms.data.TestInfo r36, java.util.Map r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
                /*
                    r20 = this;
                    r0 = r38
                    r1 = r0 & 8
                    if (r1 == 0) goto Le
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r6 = r1
                    goto L10
                Le:
                    r6 = r24
                L10:
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L17
                    r7 = r2
                    goto L19
                L17:
                    r7 = r25
                L19:
                    r1 = r0 & 64
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r9 = r1
                    goto L27
                L25:
                    r9 = r27
                L27:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    r3 = 0
                    if (r1 == 0) goto L2e
                    r10 = r3
                    goto L30
                L2e:
                    r10 = r28
                L30:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L3c
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY
                    java.lang.String r1 = r1.getValue()
                    r11 = r1
                    goto L3e
                L3c:
                    r11 = r29
                L3e:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L46
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r12 = r1
                    goto L48
                L46:
                    r12 = r30
                L48:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L4e
                    r13 = r3
                    goto L50
                L4e:
                    r13 = r31
                L50:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L56
                    r14 = r3
                    goto L58
                L56:
                    r14 = r32
                L58:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L5e
                    r15 = r2
                    goto L60
                L5e:
                    r15 = r33
                L60:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L67
                    r16 = r2
                    goto L69
                L67:
                    r16 = r34
                L69:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L70
                    r17 = r3
                    goto L72
                L70:
                    r17 = r35
                L72:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L7b
                    r18 = r3
                    goto L7d
                L7b:
                    r18 = r36
                L7d:
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L8f
                    r19 = r3
                    r2 = r20
                    r4 = r22
                    r5 = r23
                    r8 = r26
                    r3 = r21
                    goto L9b
                L8f:
                    r19 = r37
                    r2 = r20
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r8 = r26
                L9b:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithReverseSubtitleCounter copy$default(CellWithReverseSubtitleCounter cellWithReverseSubtitleCounter, String str, String str2, String str3, String str4, boolean z11, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str7, TestInfo testInfo, Map map, int i11, Object obj) {
                Map map2;
                TestInfo testInfo2;
                String str8;
                CellWithReverseSubtitleCounter cellWithReverseSubtitleCounter2;
                String str9;
                String str10;
                String str11;
                String str12;
                boolean z14;
                OzonSpannableString ozonSpannableString3;
                String str13;
                OzonSpannableString ozonSpannableString4;
                String str14;
                Align align2;
                Integer num2;
                AtomActionDTO atomActionDTO2;
                boolean z15;
                boolean z16;
                String str15 = (i11 & 1) != 0 ? cellWithReverseSubtitleCounter.counter : str;
                String str16 = (i11 & 2) != 0 ? cellWithReverseSubtitleCounter.counterColor : str2;
                String str17 = (i11 & 4) != 0 ? cellWithReverseSubtitleCounter.counterBackground : str3;
                String str18 = (i11 & 8) != 0 ? cellWithReverseSubtitleCounter.disclosureTintColor : str4;
                boolean z17 = (i11 & 16) != 0 ? cellWithReverseSubtitleCounter.hideDisclosure : z11;
                OzonSpannableString ozonSpannableString5 = (i11 & 32) != 0 ? cellWithReverseSubtitleCounter.title : ozonSpannableString;
                String str19 = (i11 & 64) != 0 ? cellWithReverseSubtitleCounter.titleColor : str5;
                OzonSpannableString ozonSpannableString6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithReverseSubtitleCounter.subtitle : ozonSpannableString2;
                String str20 = (i11 & 256) != 0 ? cellWithReverseSubtitleCounter.subtitleColor : str6;
                Align align3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithReverseSubtitleCounter.align : align;
                Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithReverseSubtitleCounter.maxLines : num;
                AtomActionDTO atomActionDTO3 = (i11 & 2048) != 0 ? cellWithReverseSubtitleCounter.action : atomActionDTO;
                boolean z18 = (i11 & 4096) != 0 ? cellWithReverseSubtitleCounter.hideSeparator : z12;
                boolean z19 = (i11 & 8192) != 0 ? cellWithReverseSubtitleCounter.colorDisabledAsEnabled : z13;
                String str21 = str15;
                String str22 = (i11 & 16384) != 0 ? cellWithReverseSubtitleCounter.context : str7;
                TestInfo testInfo3 = (i11 & 32768) != 0 ? cellWithReverseSubtitleCounter.testInfo : testInfo;
                if ((i11 & 65536) != 0) {
                    testInfo2 = testInfo3;
                    map2 = cellWithReverseSubtitleCounter.trackingInfo;
                    str9 = str22;
                    str10 = str16;
                    str11 = str17;
                    str12 = str18;
                    z14 = z17;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z15 = z18;
                    z16 = z19;
                    str8 = str21;
                    cellWithReverseSubtitleCounter2 = cellWithReverseSubtitleCounter;
                } else {
                    map2 = map;
                    testInfo2 = testInfo3;
                    str8 = str21;
                    cellWithReverseSubtitleCounter2 = cellWithReverseSubtitleCounter;
                    str9 = str22;
                    str10 = str16;
                    str11 = str17;
                    str12 = str18;
                    z14 = z17;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z15 = z18;
                    z16 = z19;
                }
                return cellWithReverseSubtitleCounter2.copy(str8, str10, str11, str12, z14, ozonSpannableString3, str13, ozonSpannableString4, str14, align2, num2, atomActionDTO2, z15, z16, str9, testInfo2, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component16, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component17() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final CellWithReverseSubtitleCounter copy(String counter, String counterColor, String counterBackground, String disclosureTintColor, boolean hideDisclosure, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithReverseSubtitleCounter(counter, counterColor, counterBackground, disclosureTintColor, hideDisclosure, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithReverseSubtitleCounter)) {
                    return false;
                }
                CellWithReverseSubtitleCounter cellWithReverseSubtitleCounter = (CellWithReverseSubtitleCounter) other;
                return Intrinsics.d(this.counter, cellWithReverseSubtitleCounter.counter) && Intrinsics.d(this.counterColor, cellWithReverseSubtitleCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithReverseSubtitleCounter.counterBackground) && Intrinsics.d(this.disclosureTintColor, cellWithReverseSubtitleCounter.disclosureTintColor) && this.hideDisclosure == cellWithReverseSubtitleCounter.hideDisclosure && Intrinsics.d(this.title, cellWithReverseSubtitleCounter.title) && Intrinsics.d(this.titleColor, cellWithReverseSubtitleCounter.titleColor) && Intrinsics.d(this.subtitle, cellWithReverseSubtitleCounter.subtitle) && Intrinsics.d(this.subtitleColor, cellWithReverseSubtitleCounter.subtitleColor) && this.align == cellWithReverseSubtitleCounter.align && Intrinsics.d(this.maxLines, cellWithReverseSubtitleCounter.maxLines) && Intrinsics.d(this.action, cellWithReverseSubtitleCounter.action) && this.hideSeparator == cellWithReverseSubtitleCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithReverseSubtitleCounter.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithReverseSubtitleCounter.context) && Intrinsics.d(this.testInfo, cellWithReverseSubtitleCounter.testInfo) && Intrinsics.d(this.trackingInfo, cellWithReverseSubtitleCounter.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            public final String getCounterBackground() {
                return this.counterBackground;
            }

            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_reverse_subtitle_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.counter;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.counterColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.counterBackground;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.disclosureTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.hideDisclosure), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode4 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str5 = this.context;
                int hashCode5 = (a12 + (str5 == null ? 0 : str5.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode6 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.counter;
                String str2 = this.counterColor;
                String str3 = this.counterBackground;
                String str4 = this.disclosureTintColor;
                boolean z11 = this.hideDisclosure;
                OzonSpannableString ozonSpannableString = this.title;
                String str5 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str6 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str7 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithReverseSubtitleCounter(counter=", str, ", counterColor=", str2, ", counterBackground=");
                Nh.a.h(d11, str3, ", disclosureTintColor=", str4, ", hideDisclosure=");
                d11.append(z11);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str5, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str6);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z12, z13);
                C4070a.b(d11, str7, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.counter);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.disclosureTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithReverseSubtitleCounter(String str, String str2, String str3, String str4, boolean z11, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str5, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_REVERSE_SUBTITLE_COUNTER, str5, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.counter = str;
                this.counterColor = str2;
                this.counterBackground = str3;
                this.disclosureTintColor = str4;
                this.hideDisclosure = z11;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str5;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00106\u001a\u00020\u0010H\u0016J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003JÌ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010HJ\u0006\u0010I\u001a\u00020\u0010J\u0013\u0010J\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0014\u0010\u0014\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006T"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle32Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "disclosureTintColor", "hideDisclosure", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getDisclosureTintColor", "getHideDisclosure", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle32Icon;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle32Icon extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle32Icon> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final String icon;
            private final String iconTintColor;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle32Icon> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle32Icon createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString4 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    boolean z12 = z11;
                    String readString5 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle32Icon.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString6 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle32Icon.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitle32Icon.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle32Icon(readString, readString2, readString3, z12, create, readString4, create2, readString5, valueOf, num, atomActionDTO, z13, z14, readString6, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle32Icon[] newArray(int i11) {
                    return new CellWithSubtitle32Icon[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle32Icon(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, ru.ozon.uni.atoms.utils.OzonSpannableString r24, java.lang.String r25, ru.ozon.uni.atoms.utils.OzonSpannableString r26, java.lang.String r27, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r28, java.lang.Integer r29, ru.ozon.uni.atoms.data.AtomActionDTO r30, boolean r31, boolean r32, java.lang.String r33, ru.ozon.uni.atoms.data.TestInfo r34, java.util.Map r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
                /*
                    r19 = this;
                    r0 = r36
                    r1 = r0 & 4
                    if (r1 == 0) goto Le
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r5 = r1
                    goto L10
                Le:
                    r5 = r22
                L10:
                    r1 = r0 & 8
                    r2 = 0
                    if (r1 == 0) goto L17
                    r6 = r2
                    goto L19
                L17:
                    r6 = r23
                L19:
                    r1 = r0 & 32
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r8 = r1
                    goto L27
                L25:
                    r8 = r25
                L27:
                    r1 = r0 & 64
                    r3 = 0
                    if (r1 == 0) goto L2e
                    r9 = r3
                    goto L30
                L2e:
                    r9 = r26
                L30:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L3c
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r10 = r1
                    goto L3e
                L3c:
                    r10 = r27
                L3e:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L46
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r11 = r1
                    goto L48
                L46:
                    r11 = r28
                L48:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L4e
                    r12 = r3
                    goto L50
                L4e:
                    r12 = r29
                L50:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L56
                    r13 = r3
                    goto L58
                L56:
                    r13 = r30
                L58:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L5e
                    r14 = r2
                    goto L60
                L5e:
                    r14 = r31
                L60:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L66
                    r15 = r2
                    goto L68
                L66:
                    r15 = r32
                L68:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L6f
                    r16 = r3
                    goto L71
                L6f:
                    r16 = r33
                L71:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L78
                    r17 = r3
                    goto L7a
                L78:
                    r17 = r34
                L7a:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L8b
                    r18 = r3
                    r2 = r19
                    r4 = r21
                    r7 = r24
                    r3 = r20
                    goto L95
                L8b:
                    r18 = r35
                    r2 = r19
                    r3 = r20
                    r4 = r21
                    r7 = r24
                L95:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle32Icon.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component10, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component11, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component12, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component14, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component15, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component16() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component7, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            @NotNull
            public final CellWithSubtitle32Icon copy(String icon, String iconTintColor, String disclosureTintColor, boolean hideDisclosure, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle32Icon(icon, iconTintColor, disclosureTintColor, hideDisclosure, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle32Icon)) {
                    return false;
                }
                CellWithSubtitle32Icon cellWithSubtitle32Icon = (CellWithSubtitle32Icon) other;
                return Intrinsics.d(this.icon, cellWithSubtitle32Icon.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle32Icon.iconTintColor) && Intrinsics.d(this.disclosureTintColor, cellWithSubtitle32Icon.disclosureTintColor) && this.hideDisclosure == cellWithSubtitle32Icon.hideDisclosure && Intrinsics.d(this.title, cellWithSubtitle32Icon.title) && Intrinsics.d(this.titleColor, cellWithSubtitle32Icon.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle32Icon.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle32Icon.subtitleColor) && this.align == cellWithSubtitle32Icon.align && Intrinsics.d(this.maxLines, cellWithSubtitle32Icon.maxLines) && Intrinsics.d(this.action, cellWithSubtitle32Icon.action) && this.hideSeparator == cellWithSubtitle32Icon.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle32Icon.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle32Icon.context) && Intrinsics.d(this.testInfo, cellWithSubtitle32Icon.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle32Icon.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle32_icon;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.icon;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconTintColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclosureTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.hideDisclosure), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str4 = this.context;
                int hashCode4 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                String str3 = this.disclosureTintColor;
                boolean z11 = this.hideDisclosure;
                OzonSpannableString ozonSpannableString = this.title;
                String str4 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str5 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str6 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle32Icon(icon=", str, ", iconTintColor=", str2, ", disclosureTintColor=");
                C2880a.c(str3, ", hideDisclosure=", ", title=", d11, z11);
                HY.a.c(", titleColor=", str4, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str5, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z12);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str6, ", testInfo=", d11, z13);
                return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeString(this.disclosureTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle32Icon(String str, String str2, String str3, boolean z11, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_32ICON, str4, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = str;
                this.iconTintColor = str2;
                this.disclosureTintColor = str3;
                this.hideDisclosure = z11;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str4;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00106\u001a\u00020\u0010H\u0016J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003JÌ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010HJ\u0006\u0010I\u001a\u00020\u0010J\u0013\u0010J\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0014\u0010\u0014\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006T"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "disclosureTintColor", "hideDisclosure", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getDisclosureTintColor", "getHideDisclosure", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle40Icon extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle40Icon> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final String icon;
            private final String iconTintColor;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle40Icon> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle40Icon createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString4 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    boolean z12 = z11;
                    String readString5 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle40Icon.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString6 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle40Icon.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitle40Icon.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle40Icon(readString, readString2, readString3, z12, create, readString4, create2, readString5, valueOf, num, atomActionDTO, z13, z14, readString6, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle40Icon[] newArray(int i11) {
                    return new CellWithSubtitle40Icon[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle40Icon(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, ru.ozon.uni.atoms.utils.OzonSpannableString r24, java.lang.String r25, ru.ozon.uni.atoms.utils.OzonSpannableString r26, java.lang.String r27, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r28, java.lang.Integer r29, ru.ozon.uni.atoms.data.AtomActionDTO r30, boolean r31, boolean r32, java.lang.String r33, ru.ozon.uni.atoms.data.TestInfo r34, java.util.Map r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
                /*
                    r19 = this;
                    r0 = r36
                    r1 = r0 & 4
                    if (r1 == 0) goto Le
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r5 = r1
                    goto L10
                Le:
                    r5 = r22
                L10:
                    r1 = r0 & 8
                    r2 = 0
                    if (r1 == 0) goto L17
                    r6 = r2
                    goto L19
                L17:
                    r6 = r23
                L19:
                    r1 = r0 & 32
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r8 = r1
                    goto L27
                L25:
                    r8 = r25
                L27:
                    r1 = r0 & 64
                    r3 = 0
                    if (r1 == 0) goto L2e
                    r9 = r3
                    goto L30
                L2e:
                    r9 = r26
                L30:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L3c
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r10 = r1
                    goto L3e
                L3c:
                    r10 = r27
                L3e:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L46
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r11 = r1
                    goto L48
                L46:
                    r11 = r28
                L48:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L4e
                    r12 = r3
                    goto L50
                L4e:
                    r12 = r29
                L50:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L56
                    r13 = r3
                    goto L58
                L56:
                    r13 = r30
                L58:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L5e
                    r14 = r2
                    goto L60
                L5e:
                    r14 = r31
                L60:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L66
                    r15 = r2
                    goto L68
                L66:
                    r15 = r32
                L68:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L6f
                    r16 = r3
                    goto L71
                L6f:
                    r16 = r33
                L71:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L78
                    r17 = r3
                    goto L7a
                L78:
                    r17 = r34
                L7a:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L8b
                    r18 = r3
                    r2 = r19
                    r4 = r21
                    r7 = r24
                    r3 = r20
                    goto L95
                L8b:
                    r18 = r35
                    r2 = r19
                    r3 = r20
                    r4 = r21
                    r7 = r24
                L95:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component10, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component11, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component12, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component14, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component15, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component16() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component7, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            @NotNull
            public final CellWithSubtitle40Icon copy(String icon, String iconTintColor, String disclosureTintColor, boolean hideDisclosure, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle40Icon(icon, iconTintColor, disclosureTintColor, hideDisclosure, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle40Icon)) {
                    return false;
                }
                CellWithSubtitle40Icon cellWithSubtitle40Icon = (CellWithSubtitle40Icon) other;
                return Intrinsics.d(this.icon, cellWithSubtitle40Icon.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle40Icon.iconTintColor) && Intrinsics.d(this.disclosureTintColor, cellWithSubtitle40Icon.disclosureTintColor) && this.hideDisclosure == cellWithSubtitle40Icon.hideDisclosure && Intrinsics.d(this.title, cellWithSubtitle40Icon.title) && Intrinsics.d(this.titleColor, cellWithSubtitle40Icon.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle40Icon.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle40Icon.subtitleColor) && this.align == cellWithSubtitle40Icon.align && Intrinsics.d(this.maxLines, cellWithSubtitle40Icon.maxLines) && Intrinsics.d(this.action, cellWithSubtitle40Icon.action) && this.hideSeparator == cellWithSubtitle40Icon.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle40Icon.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle40Icon.context) && Intrinsics.d(this.testInfo, cellWithSubtitle40Icon.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle40Icon.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle40_icon;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.icon;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconTintColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclosureTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.hideDisclosure), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str4 = this.context;
                int hashCode4 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                String str3 = this.disclosureTintColor;
                boolean z11 = this.hideDisclosure;
                OzonSpannableString ozonSpannableString = this.title;
                String str4 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str5 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str6 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle40Icon(icon=", str, ", iconTintColor=", str2, ", disclosureTintColor=");
                C2880a.c(str3, ", hideDisclosure=", ", title=", d11, z11);
                HY.a.c(", titleColor=", str4, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str5, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z12);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str6, ", testInfo=", d11, z13);
                return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeString(this.disclosureTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle40Icon(String str, String str2, String str3, boolean z11, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_40ICON, str4, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = str;
                this.iconTintColor = str2;
                this.disclosureTintColor = str3;
                this.hideDisclosure = z11;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str4;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00108\u001a\u00020\u0011H\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003JÖ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0011J\u0013\u0010M\u001a\u00020\u00072\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0011HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0014\u0010\u0015\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006W"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "disclosureTintColor", "hideDisclosure", "", "showParanjaAndPaddings", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getDisclosureTintColor", "getHideDisclosure", "()Z", "getShowParanjaAndPaddings", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle48Icon;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle48Icon extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle48Icon> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final String icon;
            private final String iconTintColor;
            private final Integer maxLines;
            private final boolean showParanjaAndPaddings;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle48Icon> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle48Icon createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString4 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString5 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle48Icon.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString6 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle48Icon.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitle48Icon.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle48Icon(readString, readString2, readString3, z11, z12, create, readString4, create2, readString5, valueOf, num, atomActionDTO, z13, z14, readString6, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle48Icon[] newArray(int i11) {
                    return new CellWithSubtitle48Icon[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle48Icon(java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, ru.ozon.uni.atoms.utils.OzonSpannableString r26, java.lang.String r27, ru.ozon.uni.atoms.utils.OzonSpannableString r28, java.lang.String r29, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r30, java.lang.Integer r31, ru.ozon.uni.atoms.data.AtomActionDTO r32, boolean r33, boolean r34, java.lang.String r35, ru.ozon.uni.atoms.data.TestInfo r36, java.util.Map r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
                /*
                    r20 = this;
                    r0 = r38
                    r1 = r0 & 4
                    if (r1 == 0) goto Le
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r5 = r1
                    goto L10
                Le:
                    r5 = r23
                L10:
                    r1 = r0 & 8
                    r2 = 0
                    if (r1 == 0) goto L17
                    r6 = r2
                    goto L19
                L17:
                    r6 = r24
                L19:
                    r1 = r0 & 16
                    if (r1 == 0) goto L1f
                    r7 = r2
                    goto L21
                L1f:
                    r7 = r25
                L21:
                    r1 = r0 & 64
                    if (r1 == 0) goto L2d
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r9 = r1
                    goto L2f
                L2d:
                    r9 = r27
                L2f:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    r3 = 0
                    if (r1 == 0) goto L36
                    r10 = r3
                    goto L38
                L36:
                    r10 = r28
                L38:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L44
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r11 = r1
                    goto L46
                L44:
                    r11 = r29
                L46:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L4e
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r12 = r1
                    goto L50
                L4e:
                    r12 = r30
                L50:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L56
                    r13 = r3
                    goto L58
                L56:
                    r13 = r31
                L58:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L5e
                    r14 = r3
                    goto L60
                L5e:
                    r14 = r32
                L60:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L66
                    r15 = r2
                    goto L68
                L66:
                    r15 = r33
                L68:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L6f
                    r16 = r2
                    goto L71
                L6f:
                    r16 = r34
                L71:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L78
                    r17 = r3
                    goto L7a
                L78:
                    r17 = r35
                L7a:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L83
                    r18 = r3
                    goto L85
                L83:
                    r18 = r36
                L85:
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L95
                    r19 = r3
                    r2 = r20
                    r4 = r22
                    r8 = r26
                    r3 = r21
                    goto L9f
                L95:
                    r19 = r37
                    r2 = r20
                    r3 = r21
                    r4 = r22
                    r8 = r26
                L9f:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle48Icon.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitle48Icon copy$default(CellWithSubtitle48Icon cellWithSubtitle48Icon, String str, String str2, String str3, boolean z11, boolean z12, OzonSpannableString ozonSpannableString, String str4, OzonSpannableString ozonSpannableString2, String str5, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str6, TestInfo testInfo, Map map, int i11, Object obj) {
                Map map2;
                TestInfo testInfo2;
                String str7;
                CellWithSubtitle48Icon cellWithSubtitle48Icon2;
                String str8;
                String str9;
                String str10;
                boolean z15;
                boolean z16;
                OzonSpannableString ozonSpannableString3;
                String str11;
                OzonSpannableString ozonSpannableString4;
                String str12;
                Align align2;
                Integer num2;
                AtomActionDTO atomActionDTO2;
                boolean z17;
                boolean z18;
                String str13 = (i11 & 1) != 0 ? cellWithSubtitle48Icon.icon : str;
                String str14 = (i11 & 2) != 0 ? cellWithSubtitle48Icon.iconTintColor : str2;
                String str15 = (i11 & 4) != 0 ? cellWithSubtitle48Icon.disclosureTintColor : str3;
                boolean z19 = (i11 & 8) != 0 ? cellWithSubtitle48Icon.hideDisclosure : z11;
                boolean z21 = (i11 & 16) != 0 ? cellWithSubtitle48Icon.showParanjaAndPaddings : z12;
                OzonSpannableString ozonSpannableString5 = (i11 & 32) != 0 ? cellWithSubtitle48Icon.title : ozonSpannableString;
                String str16 = (i11 & 64) != 0 ? cellWithSubtitle48Icon.titleColor : str4;
                OzonSpannableString ozonSpannableString6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle48Icon.subtitle : ozonSpannableString2;
                String str17 = (i11 & 256) != 0 ? cellWithSubtitle48Icon.subtitleColor : str5;
                Align align3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle48Icon.align : align;
                Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle48Icon.maxLines : num;
                AtomActionDTO atomActionDTO3 = (i11 & 2048) != 0 ? cellWithSubtitle48Icon.action : atomActionDTO;
                boolean z22 = (i11 & 4096) != 0 ? cellWithSubtitle48Icon.hideSeparator : z13;
                boolean z23 = (i11 & 8192) != 0 ? cellWithSubtitle48Icon.colorDisabledAsEnabled : z14;
                String str18 = str13;
                String str19 = (i11 & 16384) != 0 ? cellWithSubtitle48Icon.context : str6;
                TestInfo testInfo3 = (i11 & 32768) != 0 ? cellWithSubtitle48Icon.testInfo : testInfo;
                if ((i11 & 65536) != 0) {
                    testInfo2 = testInfo3;
                    map2 = cellWithSubtitle48Icon.trackingInfo;
                    str8 = str19;
                    str9 = str14;
                    str10 = str15;
                    z15 = z19;
                    z16 = z21;
                    ozonSpannableString3 = ozonSpannableString5;
                    str11 = str16;
                    ozonSpannableString4 = ozonSpannableString6;
                    str12 = str17;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z17 = z22;
                    z18 = z23;
                    str7 = str18;
                    cellWithSubtitle48Icon2 = cellWithSubtitle48Icon;
                } else {
                    map2 = map;
                    testInfo2 = testInfo3;
                    str7 = str18;
                    cellWithSubtitle48Icon2 = cellWithSubtitle48Icon;
                    str8 = str19;
                    str9 = str14;
                    str10 = str15;
                    z15 = z19;
                    z16 = z21;
                    ozonSpannableString3 = ozonSpannableString5;
                    str11 = str16;
                    ozonSpannableString4 = ozonSpannableString6;
                    str12 = str17;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z17 = z22;
                    z18 = z23;
                }
                return cellWithSubtitle48Icon2.copy(str7, str9, str10, z15, z16, ozonSpannableString3, str11, ozonSpannableString4, str12, align2, num2, atomActionDTO2, z17, z18, str8, testInfo2, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component16, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component17() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowParanjaAndPaddings() {
                return this.showParanjaAndPaddings;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final CellWithSubtitle48Icon copy(String icon, String iconTintColor, String disclosureTintColor, boolean hideDisclosure, boolean showParanjaAndPaddings, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle48Icon(icon, iconTintColor, disclosureTintColor, hideDisclosure, showParanjaAndPaddings, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle48Icon)) {
                    return false;
                }
                CellWithSubtitle48Icon cellWithSubtitle48Icon = (CellWithSubtitle48Icon) other;
                return Intrinsics.d(this.icon, cellWithSubtitle48Icon.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle48Icon.iconTintColor) && Intrinsics.d(this.disclosureTintColor, cellWithSubtitle48Icon.disclosureTintColor) && this.hideDisclosure == cellWithSubtitle48Icon.hideDisclosure && this.showParanjaAndPaddings == cellWithSubtitle48Icon.showParanjaAndPaddings && Intrinsics.d(this.title, cellWithSubtitle48Icon.title) && Intrinsics.d(this.titleColor, cellWithSubtitle48Icon.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle48Icon.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle48Icon.subtitleColor) && this.align == cellWithSubtitle48Icon.align && Intrinsics.d(this.maxLines, cellWithSubtitle48Icon.maxLines) && Intrinsics.d(this.action, cellWithSubtitle48Icon.action) && this.hideSeparator == cellWithSubtitle48Icon.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle48Icon.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle48Icon.context) && Intrinsics.d(this.testInfo, cellWithSubtitle48Icon.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle48Icon.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle48_icon;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final boolean getShowParanjaAndPaddings() {
                return this.showParanjaAndPaddings;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.icon;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconTintColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclosureTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a(C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.hideDisclosure), 31, this.showParanjaAndPaddings), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str4 = this.context;
                int hashCode4 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                String str3 = this.disclosureTintColor;
                boolean z11 = this.hideDisclosure;
                boolean z12 = this.showParanjaAndPaddings;
                OzonSpannableString ozonSpannableString = this.title;
                String str4 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str5 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z13 = this.hideSeparator;
                boolean z14 = this.colorDisabledAsEnabled;
                String str6 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle48Icon(icon=", str, ", iconTintColor=", str2, ", disclosureTintColor=");
                C2880a.c(str3, ", hideDisclosure=", ", showParanjaAndPaddings=", d11, z11);
                d11.append(z12);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str4, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str5);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z13, z14);
                C4070a.b(d11, str6, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeString(this.disclosureTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                dest.writeInt(this.showParanjaAndPaddings ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle48Icon(String str, String str2, String str3, boolean z11, boolean z12, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z13, z14, Type.CELL_WITH_SUBTITLE_48ICON, str4, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = str;
                this.iconTintColor = str2;
                this.disclosureTintColor = str3;
                this.hideDisclosure = z11;
                this.showParanjaAndPaddings = z12;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z13;
                this.colorDisabledAsEnabled = z14;
                this.context = str4;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00108\u001a\u00020\u0011H\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003JØ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0011J\u0013\u0010M\u001a\u00020\b2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0011HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u0010\u0015\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006W"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "counter", "", "counterColor", "counterBackground", "disclosureTintColor", "hideDisclosure", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getCounter", "()Ljava/lang/String;", "getCounterColor", "getCounterBackground", "getDisclosureTintColor", "getHideDisclosure", "()Z", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;
            private final String counterBackground;
            private final String counterColor;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleCounter createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString5 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString6 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleCounter.class.getClassLoader());
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString7 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleCounter.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitleCounter.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitleCounter(readString, readString2, readString3, readString4, z11, create, readString5, create2, readString6, valueOf, num, atomActionDTO, z12, z13, readString7, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleCounter[] newArray(int i11) {
                    return new CellWithSubtitleCounter[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitleCounter(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, ru.ozon.uni.atoms.utils.OzonSpannableString r26, java.lang.String r27, ru.ozon.uni.atoms.utils.OzonSpannableString r28, java.lang.String r29, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r30, java.lang.Integer r31, ru.ozon.uni.atoms.data.AtomActionDTO r32, boolean r33, boolean r34, java.lang.String r35, ru.ozon.uni.atoms.data.TestInfo r36, java.util.Map r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
                /*
                    r20 = this;
                    r0 = r38
                    r1 = r0 & 8
                    if (r1 == 0) goto Le
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r6 = r1
                    goto L10
                Le:
                    r6 = r24
                L10:
                    r1 = r0 & 16
                    r2 = 0
                    if (r1 == 0) goto L17
                    r7 = r2
                    goto L19
                L17:
                    r7 = r25
                L19:
                    r1 = r0 & 64
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r9 = r1
                    goto L27
                L25:
                    r9 = r27
                L27:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    r3 = 0
                    if (r1 == 0) goto L2e
                    r10 = r3
                    goto L30
                L2e:
                    r10 = r28
                L30:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L3c
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r11 = r1
                    goto L3e
                L3c:
                    r11 = r29
                L3e:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L46
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r12 = r1
                    goto L48
                L46:
                    r12 = r30
                L48:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L4e
                    r13 = r3
                    goto L50
                L4e:
                    r13 = r31
                L50:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L56
                    r14 = r3
                    goto L58
                L56:
                    r14 = r32
                L58:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L5e
                    r15 = r2
                    goto L60
                L5e:
                    r15 = r33
                L60:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L67
                    r16 = r2
                    goto L69
                L67:
                    r16 = r34
                L69:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L70
                    r17 = r3
                    goto L72
                L70:
                    r17 = r35
                L72:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L7b
                    r18 = r3
                    goto L7d
                L7b:
                    r18 = r36
                L7d:
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L8f
                    r19 = r3
                    r2 = r20
                    r4 = r22
                    r5 = r23
                    r8 = r26
                    r3 = r21
                    goto L9b
                L8f:
                    r19 = r37
                    r2 = r20
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r8 = r26
                L9b:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitleCounter copy$default(CellWithSubtitleCounter cellWithSubtitleCounter, String str, String str2, String str3, String str4, boolean z11, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str7, TestInfo testInfo, Map map, int i11, Object obj) {
                Map map2;
                TestInfo testInfo2;
                String str8;
                CellWithSubtitleCounter cellWithSubtitleCounter2;
                String str9;
                String str10;
                String str11;
                String str12;
                boolean z14;
                OzonSpannableString ozonSpannableString3;
                String str13;
                OzonSpannableString ozonSpannableString4;
                String str14;
                Align align2;
                Integer num2;
                AtomActionDTO atomActionDTO2;
                boolean z15;
                boolean z16;
                String str15 = (i11 & 1) != 0 ? cellWithSubtitleCounter.counter : str;
                String str16 = (i11 & 2) != 0 ? cellWithSubtitleCounter.counterColor : str2;
                String str17 = (i11 & 4) != 0 ? cellWithSubtitleCounter.counterBackground : str3;
                String str18 = (i11 & 8) != 0 ? cellWithSubtitleCounter.disclosureTintColor : str4;
                boolean z17 = (i11 & 16) != 0 ? cellWithSubtitleCounter.hideDisclosure : z11;
                OzonSpannableString ozonSpannableString5 = (i11 & 32) != 0 ? cellWithSubtitleCounter.title : ozonSpannableString;
                String str19 = (i11 & 64) != 0 ? cellWithSubtitleCounter.titleColor : str5;
                OzonSpannableString ozonSpannableString6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitleCounter.subtitle : ozonSpannableString2;
                String str20 = (i11 & 256) != 0 ? cellWithSubtitleCounter.subtitleColor : str6;
                Align align3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitleCounter.align : align;
                Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitleCounter.maxLines : num;
                AtomActionDTO atomActionDTO3 = (i11 & 2048) != 0 ? cellWithSubtitleCounter.action : atomActionDTO;
                boolean z18 = (i11 & 4096) != 0 ? cellWithSubtitleCounter.hideSeparator : z12;
                boolean z19 = (i11 & 8192) != 0 ? cellWithSubtitleCounter.colorDisabledAsEnabled : z13;
                String str21 = str15;
                String str22 = (i11 & 16384) != 0 ? cellWithSubtitleCounter.context : str7;
                TestInfo testInfo3 = (i11 & 32768) != 0 ? cellWithSubtitleCounter.testInfo : testInfo;
                if ((i11 & 65536) != 0) {
                    testInfo2 = testInfo3;
                    map2 = cellWithSubtitleCounter.trackingInfo;
                    str9 = str22;
                    str10 = str16;
                    str11 = str17;
                    str12 = str18;
                    z14 = z17;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z15 = z18;
                    z16 = z19;
                    str8 = str21;
                    cellWithSubtitleCounter2 = cellWithSubtitleCounter;
                } else {
                    map2 = map;
                    testInfo2 = testInfo3;
                    str8 = str21;
                    cellWithSubtitleCounter2 = cellWithSubtitleCounter;
                    str9 = str22;
                    str10 = str16;
                    str11 = str17;
                    str12 = str18;
                    z14 = z17;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z15 = z18;
                    z16 = z19;
                }
                return cellWithSubtitleCounter2.copy(str8, str10, str11, str12, z14, ozonSpannableString3, str13, ozonSpannableString4, str14, align2, num2, atomActionDTO2, z15, z16, str9, testInfo2, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component16, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component17() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final CellWithSubtitleCounter copy(String counter, String counterColor, String counterBackground, String disclosureTintColor, boolean hideDisclosure, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleCounter(counter, counterColor, counterBackground, disclosureTintColor, hideDisclosure, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleCounter)) {
                    return false;
                }
                CellWithSubtitleCounter cellWithSubtitleCounter = (CellWithSubtitleCounter) other;
                return Intrinsics.d(this.counter, cellWithSubtitleCounter.counter) && Intrinsics.d(this.counterColor, cellWithSubtitleCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithSubtitleCounter.counterBackground) && Intrinsics.d(this.disclosureTintColor, cellWithSubtitleCounter.disclosureTintColor) && this.hideDisclosure == cellWithSubtitleCounter.hideDisclosure && Intrinsics.d(this.title, cellWithSubtitleCounter.title) && Intrinsics.d(this.titleColor, cellWithSubtitleCounter.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleCounter.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleCounter.subtitleColor) && this.align == cellWithSubtitleCounter.align && Intrinsics.d(this.maxLines, cellWithSubtitleCounter.maxLines) && Intrinsics.d(this.action, cellWithSubtitleCounter.action) && this.hideSeparator == cellWithSubtitleCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleCounter.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleCounter.context) && Intrinsics.d(this.testInfo, cellWithSubtitleCounter.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleCounter.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            public final String getCounterBackground() {
                return this.counterBackground;
            }

            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.counter;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.counterColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.counterBackground;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.disclosureTintColor;
                int a11 = g.a(P.c(this.title, C3532b.a((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.hideDisclosure), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode4 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str5 = this.context;
                int hashCode5 = (a12 + (str5 == null ? 0 : str5.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode6 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.counter;
                String str2 = this.counterColor;
                String str3 = this.counterBackground;
                String str4 = this.disclosureTintColor;
                boolean z11 = this.hideDisclosure;
                OzonSpannableString ozonSpannableString = this.title;
                String str5 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str6 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str7 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitleCounter(counter=", str, ", counterColor=", str2, ", counterBackground=");
                Nh.a.h(d11, str3, ", disclosureTintColor=", str4, ", hideDisclosure=");
                d11.append(z11);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str5, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str6);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z12, z13);
                C4070a.b(d11, str7, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.counter);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.disclosureTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleCounter(String str, String str2, String str3, String str4, boolean z11, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str5, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_COUNTER, str5, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.counter = str;
                this.counterColor = str2;
                this.counterBackground = str3;
                this.disclosureTintColor = str4;
                this.hideDisclosure = z11;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str5;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u00102\u001a\u00020\u000eH\u0016J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J´\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\u000eJ\u0013\u0010D\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000eHÖ\u0001J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006N"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "hideDisclosure", "", "disclosureTintColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getHideDisclosure", "()Z", "getDisclosureTintColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleDefault extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleDefault> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleDefault> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleDefault createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    String readString = parcel2.readString();
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    boolean z12 = z11;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString2 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString3 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleDefault.class.getClassLoader());
                    Integer num = valueOf2;
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    String readString4 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleDefault.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitleDefault.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitleDefault(z12, readString, create, readString2, create2, readString3, valueOf, num, atomActionDTO, z13, z14, readString4, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleDefault[] newArray(int i11) {
                    return new CellWithSubtitleDefault[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitleDefault(boolean r19, java.lang.String r20, ru.ozon.uni.atoms.utils.OzonSpannableString r21, java.lang.String r22, ru.ozon.uni.atoms.utils.OzonSpannableString r23, java.lang.String r24, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r25, java.lang.Integer r26, ru.ozon.uni.atoms.data.AtomActionDTO r27, boolean r28, boolean r29, java.lang.String r30, ru.ozon.uni.atoms.data.TestInfo r31, java.util.Map r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
                /*
                    r18 = this;
                    r0 = r33
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L9
                    r4 = r2
                    goto Lb
                L9:
                    r4 = r19
                Lb:
                    r1 = r0 & 2
                    if (r1 == 0) goto L17
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r5 = r1
                    goto L19
                L17:
                    r5 = r20
                L19:
                    r1 = r0 & 8
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r7 = r1
                    goto L27
                L25:
                    r7 = r22
                L27:
                    r1 = r0 & 16
                    r3 = 0
                    if (r1 == 0) goto L2e
                    r8 = r3
                    goto L30
                L2e:
                    r8 = r23
                L30:
                    r1 = r0 & 32
                    if (r1 == 0) goto L3c
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY
                    java.lang.String r1 = r1.getValue()
                    r9 = r1
                    goto L3e
                L3c:
                    r9 = r24
                L3e:
                    r1 = r0 & 64
                    if (r1 == 0) goto L46
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r10 = r1
                    goto L48
                L46:
                    r10 = r25
                L48:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L4e
                    r11 = r3
                    goto L50
                L4e:
                    r11 = r26
                L50:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L56
                    r12 = r3
                    goto L58
                L56:
                    r12 = r27
                L58:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L5e
                    r13 = r2
                    goto L60
                L5e:
                    r13 = r28
                L60:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L66
                    r14 = r2
                    goto L68
                L66:
                    r14 = r29
                L68:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L6e
                    r15 = r3
                    goto L70
                L6e:
                    r15 = r30
                L70:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L77
                    r16 = r3
                    goto L79
                L77:
                    r16 = r31
                L79:
                    r0 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r0 == 0) goto L84
                    r17 = r3
                    r6 = r21
                    r3 = r18
                    goto L8a
                L84:
                    r17 = r32
                    r3 = r18
                    r6 = r21
                L8a:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.<init>(boolean, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component11, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component12, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component13, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component14() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component5, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component8, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component9, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final CellWithSubtitleDefault copy(boolean hideDisclosure, String disclosureTintColor, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleDefault(hideDisclosure, disclosureTintColor, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleDefault)) {
                    return false;
                }
                CellWithSubtitleDefault cellWithSubtitleDefault = (CellWithSubtitleDefault) other;
                return this.hideDisclosure == cellWithSubtitleDefault.hideDisclosure && Intrinsics.d(this.disclosureTintColor, cellWithSubtitleDefault.disclosureTintColor) && Intrinsics.d(this.title, cellWithSubtitleDefault.title) && Intrinsics.d(this.titleColor, cellWithSubtitleDefault.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleDefault.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleDefault.subtitleColor) && this.align == cellWithSubtitleDefault.align && Intrinsics.d(this.maxLines, cellWithSubtitleDefault.maxLines) && Intrinsics.d(this.action, cellWithSubtitleDefault.action) && this.hideSeparator == cellWithSubtitleDefault.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleDefault.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleDefault.context) && Intrinsics.d(this.testInfo, cellWithSubtitleDefault.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleDefault.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_default;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.hideDisclosure) * 31;
                String str = this.disclosureTintColor;
                int a11 = g.a(P.c(this.title, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str2 = this.context;
                int hashCode3 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                boolean z11 = this.hideDisclosure;
                String str = this.disclosureTintColor;
                OzonSpannableString ozonSpannableString = this.title;
                String str2 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str3 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str4 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = G.d("CellWithSubtitleDefault(hideDisclosure=", ", disclosureTintColor=", str, ", title=", z11);
                HY.a.c(", titleColor=", str2, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str3, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z12);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str4, ", testInfo=", d11, z13);
                return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                dest.writeString(this.disclosureTintColor);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleDefault(boolean z11, String str, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_DEFAULT, str2, testInfo, map, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.hideDisclosure = z11;
                this.disclosureTintColor = str;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str2;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00104\u001a\u00020\u000fH\u0016J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0017\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J¾\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010EJ\u0006\u0010F\u001a\u00020\u000fJ\u0013\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\u000fHÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001J\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006Q"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleValue;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "hideDisclosure", "", "disclosureTintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getValue", "()Ljava/lang/String;", "getHideDisclosure", "()Z", "getDisclosureTintColor", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleValue;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleValue extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleValue> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final String value;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleValue> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleValue createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    String readString2 = parcel2.readString();
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString3 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString4 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleValue.class.getClassLoader());
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString5 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleValue.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitleValue.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitleValue(readString, z11, readString2, create, readString3, create2, readString4, valueOf, num, atomActionDTO, z12, z13, readString5, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleValue[] newArray(int i11) {
                    return new CellWithSubtitleValue[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitleValue(java.lang.String r20, boolean r21, java.lang.String r22, ru.ozon.uni.atoms.utils.OzonSpannableString r23, java.lang.String r24, ru.ozon.uni.atoms.utils.OzonSpannableString r25, java.lang.String r26, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r27, java.lang.Integer r28, ru.ozon.uni.atoms.data.AtomActionDTO r29, boolean r30, boolean r31, java.lang.String r32, ru.ozon.uni.atoms.data.TestInfo r33, java.util.Map r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
                /*
                    r19 = this;
                    r0 = r35
                    r1 = r0 & 2
                    r2 = 0
                    if (r1 == 0) goto L9
                    r5 = r2
                    goto Lb
                L9:
                    r5 = r21
                Lb:
                    r1 = r0 & 4
                    if (r1 == 0) goto L17
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r6 = r1
                    goto L19
                L17:
                    r6 = r22
                L19:
                    r1 = r0 & 16
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r8 = r1
                    goto L27
                L25:
                    r8 = r24
                L27:
                    r1 = r0 & 32
                    r3 = 0
                    if (r1 == 0) goto L2e
                    r9 = r3
                    goto L30
                L2e:
                    r9 = r25
                L30:
                    r1 = r0 & 64
                    if (r1 == 0) goto L3c
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r10 = r1
                    goto L3e
                L3c:
                    r10 = r26
                L3e:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L46
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r11 = r1
                    goto L48
                L46:
                    r11 = r27
                L48:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L4e
                    r12 = r3
                    goto L50
                L4e:
                    r12 = r28
                L50:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L56
                    r13 = r3
                    goto L58
                L56:
                    r13 = r29
                L58:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L5e
                    r14 = r2
                    goto L60
                L5e:
                    r14 = r30
                L60:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L66
                    r15 = r2
                    goto L68
                L66:
                    r15 = r31
                L68:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L6f
                    r16 = r3
                    goto L71
                L6f:
                    r16 = r32
                L71:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L78
                    r17 = r3
                    goto L7a
                L78:
                    r17 = r33
                L7a:
                    r0 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r0 == 0) goto L87
                    r18 = r3
                    r4 = r20
                    r7 = r23
                    r3 = r19
                    goto L8f
                L87:
                    r18 = r34
                    r3 = r19
                    r4 = r20
                    r7 = r23
                L8f:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleValue.<init>(java.lang.String, boolean, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* renamed from: component10, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component11, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component12, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component13, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component14, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component15() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            @NotNull
            public final CellWithSubtitleValue copy(@NotNull String value, boolean hideDisclosure, String disclosureTintColor, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleValue(value, hideDisclosure, disclosureTintColor, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleValue)) {
                    return false;
                }
                CellWithSubtitleValue cellWithSubtitleValue = (CellWithSubtitleValue) other;
                return Intrinsics.d(this.value, cellWithSubtitleValue.value) && this.hideDisclosure == cellWithSubtitleValue.hideDisclosure && Intrinsics.d(this.disclosureTintColor, cellWithSubtitleValue.disclosureTintColor) && Intrinsics.d(this.title, cellWithSubtitleValue.title) && Intrinsics.d(this.titleColor, cellWithSubtitleValue.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleValue.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleValue.subtitleColor) && this.align == cellWithSubtitleValue.align && Intrinsics.d(this.maxLines, cellWithSubtitleValue.maxLines) && Intrinsics.d(this.action, cellWithSubtitleValue.action) && this.hideSeparator == cellWithSubtitleValue.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleValue.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleValue.context) && Intrinsics.d(this.testInfo, cellWithSubtitleValue.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleValue.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_value;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int a11 = C3532b.a(this.value.hashCode() * 31, 31, this.hideDisclosure);
                String str = this.disclosureTintColor;
                int a12 = g.a(P.c(this.title, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a12 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a13 = C3532b.a(C3532b.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str2 = this.context;
                int hashCode2 = (a13 + (str2 == null ? 0 : str2.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.value;
                boolean z11 = this.hideDisclosure;
                String str2 = this.disclosureTintColor;
                OzonSpannableString ozonSpannableString = this.title;
                String str3 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str4 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str5 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder b11 = C4636t5.b("CellWithSubtitleValue(value=", str, ", hideDisclosure=", ", disclosureTintColor=", z11);
                B6.b.c(str2, ", title=", ", titleColor=", b11, ozonSpannableString);
                B6.b.c(str3, ", subtitle=", ", subtitleColor=", b11, ozonSpannableString2);
                b11.append(str4);
                b11.append(", align=");
                b11.append(align);
                b11.append(", maxLines=");
                b11.append(num);
                b11.append(", action=");
                b11.append(atomActionDTO);
                b11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", b11, z12, z13);
                C4070a.b(b11, str5, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(b11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.value);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                dest.writeString(this.disclosureTintColor);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleValue(@NotNull String value, boolean z11, String str, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_VALUE, str2, testInfo, map, null);
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.value = value;
                this.hideDisclosure = z11;
                this.disclosureTintColor = str;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str2;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00108\u001a\u00020\u0011H\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003JÖ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0011J\u0013\u0010M\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0011HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006W"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", "iconTintColor", "hideDisclosure", "", "disclosureTintColor", "separatorColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getHideDisclosure", "()Z", "getDisclosureTintColor", "getSeparatorColor", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle24Icon extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle24Icon> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;
            private final String icon;
            private final String iconTintColor;
            private final Integer maxLines;

            @NotNull
            private final String separatorColor;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle24Icon> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24Icon createFromParcel(Parcel parcel) {
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    boolean z11 = parcel2.readInt() != 0;
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    boolean z12 = z11;
                    String readString5 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString6 = parcel2.readString();
                    Align valueOf = Align.valueOf(parcel2.readString());
                    LinkedHashMap linkedHashMap = null;
                    Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle24Icon.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    Integer num = valueOf2;
                    String readString7 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle24Icon.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        int i11 = 0;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            i11 = C2859b.a(CellWithSubtitle24Icon.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt = readInt;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle24Icon(readString, readString2, z12, readString3, readString4, create, readString5, create2, readString6, valueOf, num, atomActionDTO, z13, z14, readString7, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24Icon[] newArray(int i11) {
                    return new CellWithSubtitle24Icon[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle24Icon(java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, java.lang.String r26, ru.ozon.uni.atoms.utils.OzonSpannableString r27, java.lang.String r28, ru.ozon.uni.atoms.utils.OzonSpannableString r29, java.lang.String r30, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r31, java.lang.Integer r32, ru.ozon.uni.atoms.data.AtomActionDTO r33, boolean r34, boolean r35, java.lang.String r36, ru.ozon.uni.atoms.data.TestInfo r37, java.util.Map r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
                /*
                    r21 = this;
                    r0 = r39
                    r1 = r0 & 4
                    r2 = 0
                    if (r1 == 0) goto L9
                    r6 = r2
                    goto Lb
                L9:
                    r6 = r24
                Lb:
                    r1 = r0 & 8
                    if (r1 == 0) goto L17
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r7 = r1
                    goto L19
                L17:
                    r7 = r25
                L19:
                    r1 = r0 & 16
                    if (r1 == 0) goto L25
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_SEPARATOR
                    java.lang.String r1 = r1.getValue()
                    r8 = r1
                    goto L27
                L25:
                    r8 = r26
                L27:
                    r1 = r0 & 64
                    if (r1 == 0) goto L33
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r10 = r1
                    goto L35
                L33:
                    r10 = r28
                L35:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    r3 = 0
                    if (r1 == 0) goto L3c
                    r11 = r3
                    goto L3e
                L3c:
                    r11 = r29
                L3e:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L4a
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r12 = r1
                    goto L4c
                L4a:
                    r12 = r30
                L4c:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L54
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r13 = r1
                    goto L56
                L54:
                    r13 = r31
                L56:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L5c
                    r14 = r3
                    goto L5e
                L5c:
                    r14 = r32
                L5e:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L64
                    r15 = r3
                    goto L66
                L64:
                    r15 = r33
                L66:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L6d
                    r16 = r2
                    goto L6f
                L6d:
                    r16 = r34
                L6f:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L76
                    r17 = r2
                    goto L78
                L76:
                    r17 = r35
                L78:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L7f
                    r18 = r3
                    goto L81
                L7f:
                    r18 = r36
                L81:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L8a
                    r19 = r3
                    goto L8c
                L8a:
                    r19 = r37
                L8c:
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L9c
                    r20 = r3
                    r4 = r22
                    r5 = r23
                    r9 = r27
                    r3 = r21
                    goto La6
                L9c:
                    r20 = r38
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r9 = r27
                La6:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitle24Icon copy$default(CellWithSubtitle24Icon cellWithSubtitle24Icon, String str, String str2, boolean z11, String str3, String str4, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str7, TestInfo testInfo, Map map, int i11, Object obj) {
                Map map2;
                TestInfo testInfo2;
                String str8;
                CellWithSubtitle24Icon cellWithSubtitle24Icon2;
                String str9;
                String str10;
                boolean z14;
                String str11;
                String str12;
                OzonSpannableString ozonSpannableString3;
                String str13;
                OzonSpannableString ozonSpannableString4;
                String str14;
                Align align2;
                Integer num2;
                AtomActionDTO atomActionDTO2;
                boolean z15;
                boolean z16;
                String str15 = (i11 & 1) != 0 ? cellWithSubtitle24Icon.icon : str;
                String str16 = (i11 & 2) != 0 ? cellWithSubtitle24Icon.iconTintColor : str2;
                boolean z17 = (i11 & 4) != 0 ? cellWithSubtitle24Icon.hideDisclosure : z11;
                String str17 = (i11 & 8) != 0 ? cellWithSubtitle24Icon.disclosureTintColor : str3;
                String str18 = (i11 & 16) != 0 ? cellWithSubtitle24Icon.separatorColor : str4;
                OzonSpannableString ozonSpannableString5 = (i11 & 32) != 0 ? cellWithSubtitle24Icon.title : ozonSpannableString;
                String str19 = (i11 & 64) != 0 ? cellWithSubtitle24Icon.titleColor : str5;
                OzonSpannableString ozonSpannableString6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle24Icon.subtitle : ozonSpannableString2;
                String str20 = (i11 & 256) != 0 ? cellWithSubtitle24Icon.subtitleColor : str6;
                Align align3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle24Icon.align : align;
                Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle24Icon.maxLines : num;
                AtomActionDTO atomActionDTO3 = (i11 & 2048) != 0 ? cellWithSubtitle24Icon.action : atomActionDTO;
                boolean z18 = (i11 & 4096) != 0 ? cellWithSubtitle24Icon.hideSeparator : z12;
                boolean z19 = (i11 & 8192) != 0 ? cellWithSubtitle24Icon.colorDisabledAsEnabled : z13;
                String str21 = str15;
                String str22 = (i11 & 16384) != 0 ? cellWithSubtitle24Icon.context : str7;
                TestInfo testInfo3 = (i11 & 32768) != 0 ? cellWithSubtitle24Icon.testInfo : testInfo;
                if ((i11 & 65536) != 0) {
                    testInfo2 = testInfo3;
                    map2 = cellWithSubtitle24Icon.trackingInfo;
                    str9 = str22;
                    str10 = str16;
                    z14 = z17;
                    str11 = str17;
                    str12 = str18;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z15 = z18;
                    z16 = z19;
                    str8 = str21;
                    cellWithSubtitle24Icon2 = cellWithSubtitle24Icon;
                } else {
                    map2 = map;
                    testInfo2 = testInfo3;
                    str8 = str21;
                    cellWithSubtitle24Icon2 = cellWithSubtitle24Icon;
                    str9 = str22;
                    str10 = str16;
                    z14 = z17;
                    str11 = str17;
                    str12 = str18;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z15 = z18;
                    z16 = z19;
                }
                return cellWithSubtitle24Icon2.copy(str8, str10, z14, str11, str12, ozonSpannableString3, str13, ozonSpannableString4, str14, align2, num2, atomActionDTO2, z15, z16, str9, testInfo2, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component16, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component17() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getSeparatorColor() {
                return this.separatorColor;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final CellWithSubtitle24Icon copy(String icon, String iconTintColor, boolean hideDisclosure, String disclosureTintColor, @NotNull String separatorColor, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(separatorColor, "separatorColor");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle24Icon(icon, iconTintColor, hideDisclosure, disclosureTintColor, separatorColor, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle24Icon)) {
                    return false;
                }
                CellWithSubtitle24Icon cellWithSubtitle24Icon = (CellWithSubtitle24Icon) other;
                return Intrinsics.d(this.icon, cellWithSubtitle24Icon.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle24Icon.iconTintColor) && this.hideDisclosure == cellWithSubtitle24Icon.hideDisclosure && Intrinsics.d(this.disclosureTintColor, cellWithSubtitle24Icon.disclosureTintColor) && Intrinsics.d(this.separatorColor, cellWithSubtitle24Icon.separatorColor) && Intrinsics.d(this.title, cellWithSubtitle24Icon.title) && Intrinsics.d(this.titleColor, cellWithSubtitle24Icon.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle24Icon.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle24Icon.subtitleColor) && this.align == cellWithSubtitle24Icon.align && Intrinsics.d(this.maxLines, cellWithSubtitle24Icon.maxLines) && Intrinsics.d(this.action, cellWithSubtitle24Icon.action) && this.hideSeparator == cellWithSubtitle24Icon.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle24Icon.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle24Icon.context) && Intrinsics.d(this.testInfo, cellWithSubtitle24Icon.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle24Icon.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle24_icon;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @NotNull
            public final String getSeparatorColor() {
                return this.separatorColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.icon;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.iconTintColor;
                int a11 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.hideDisclosure);
                String str3 = this.disclosureTintColor;
                int a12 = g.a(P.c(this.title, g.a((a11 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.separatorColor), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a12 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a13 = C3532b.a(C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str4 = this.context;
                int hashCode3 = (a13 + (str4 == null ? 0 : str4.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.iconTintColor;
                boolean z11 = this.hideDisclosure;
                String str3 = this.disclosureTintColor;
                String str4 = this.separatorColor;
                OzonSpannableString ozonSpannableString = this.title;
                String str5 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str6 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str7 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle24Icon(icon=", str, ", iconTintColor=", str2, ", hideDisclosure=");
                C5766e.a(", disclosureTintColor=", str3, ", separatorColor=", d11, z11);
                B6.b.c(str4, ", title=", ", titleColor=", d11, ozonSpannableString);
                B6.b.c(str5, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str6);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z12, z13);
                C4070a.b(d11, str7, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                dest.writeString(this.disclosureTintColor);
                dest.writeString(this.separatorColor);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle24Icon(String str, String str2, boolean z11, String str3, @NotNull String separatorColor, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_24ICON, str4, testInfo, map, null);
                Intrinsics.checkNotNullParameter(separatorColor, "separatorColor");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = str;
                this.iconTintColor = str2;
                this.hideDisclosure = z11;
                this.disclosureTintColor = str3;
                this.separatorColor = separatorColor;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str4;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010:\u001a\u00020\u0011H\u0016J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003JÔ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010MJ\u0006\u0010N\u001a\u00020\u0011J\u0013\u0010O\u001a\u00020\b2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0011HÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0014\u0010\f\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006Y"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconPicker;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "icon", "iconTintColor", "disclosureTintColor", "hideDisclosure", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getValue", "()Ljava/lang/String;", "getIcon", "getIconTintColor", "getDisclosureTintColor", "getHideDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "()Z", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconPicker;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle24IconPicker extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle24IconPicker> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String disclosureTintColor;
            private final Boolean hideDisclosure;
            private final boolean hideSeparator;

            @NotNull
            private final String icon;
            private final String iconTintColor;
            private final Integer maxLines;

            @NotNull
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final String value;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle24IconPicker> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconPicker createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    LinkedHashMap linkedHashMap = null;
                    int i11 = 0;
                    if (parcel2.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel2.readInt() != 0);
                    }
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString5 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    Boolean bool = valueOf;
                    String readString6 = parcel2.readString();
                    Align valueOf2 = Align.valueOf(parcel2.readString());
                    Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle24IconPicker.class.getClassLoader());
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    Integer num = valueOf3;
                    String readString7 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle24IconPicker.class.getClassLoader());
                    if (parcel2.readInt() != 0) {
                        int readInt = parcel2.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (i11 != readInt) {
                            int i12 = readInt;
                            LinkedHashMap linkedHashMap3 = linkedHashMap2;
                            i11 = C2859b.a(CellWithSubtitle24IconPicker.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            linkedHashMap2 = linkedHashMap3;
                            readInt = i12;
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CellWithSubtitle24IconPicker(readString, readString2, readString3, readString4, bool, create, readString5, create2, readString6, valueOf2, num, atomActionDTO, z11, z12, readString7, testInfo, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconPicker[] newArray(int i11) {
                    return new CellWithSubtitle24IconPicker[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle24IconPicker(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Boolean r25, ru.ozon.uni.atoms.utils.OzonSpannableString r26, java.lang.String r27, ru.ozon.uni.atoms.utils.OzonSpannableString r28, java.lang.String r29, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r30, java.lang.Integer r31, ru.ozon.uni.atoms.data.AtomActionDTO r32, boolean r33, boolean r34, java.lang.String r35, ru.ozon.uni.atoms.data.TestInfo r36, java.util.Map r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
                /*
                    r20 = this;
                    r0 = r38
                    r1 = r0 & 8
                    if (r1 == 0) goto Le
                    ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell$Companion r1 = ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell.INSTANCE
                    java.lang.String r1 = r1.getDEFAULT_DISCLOSURE_TINT_COLOR()
                    r6 = r1
                    goto L10
                Le:
                    r6 = r24
                L10:
                    r1 = r0 & 16
                    if (r1 == 0) goto L18
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    r7 = r1
                    goto L1a
                L18:
                    r7 = r25
                L1a:
                    r1 = r0 & 64
                    if (r1 == 0) goto L26
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r9 = r1
                    goto L28
                L26:
                    r9 = r27
                L28:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L34
                    ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                    java.lang.String r1 = r1.getValue()
                    r11 = r1
                    goto L36
                L34:
                    r11 = r29
                L36:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L3e
                    ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                    r12 = r1
                    goto L40
                L3e:
                    r12 = r30
                L40:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    r2 = 0
                    if (r1 == 0) goto L47
                    r13 = r2
                    goto L49
                L47:
                    r13 = r31
                L49:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L4f
                    r14 = r2
                    goto L51
                L4f:
                    r14 = r32
                L51:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    r3 = 0
                    if (r1 == 0) goto L58
                    r15 = r3
                    goto L5a
                L58:
                    r15 = r33
                L5a:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L61
                    r16 = r3
                    goto L63
                L61:
                    r16 = r34
                L63:
                    r1 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r1 == 0) goto L6a
                    r17 = r2
                    goto L6c
                L6a:
                    r17 = r35
                L6c:
                    r1 = 32768(0x8000, float:4.5918E-41)
                    r1 = r1 & r0
                    if (r1 == 0) goto L75
                    r18 = r2
                    goto L77
                L75:
                    r18 = r36
                L77:
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L8b
                    r19 = r2
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r8 = r26
                    r10 = r28
                    r2 = r20
                    goto L99
                L8b:
                    r19 = r37
                    r2 = r20
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r8 = r26
                    r10 = r28
                L99:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconPicker.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitle24IconPicker copy$default(CellWithSubtitle24IconPicker cellWithSubtitle24IconPicker, String str, String str2, String str3, String str4, Boolean bool, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, String str7, TestInfo testInfo, Map map, int i11, Object obj) {
                Map map2;
                TestInfo testInfo2;
                String str8;
                CellWithSubtitle24IconPicker cellWithSubtitle24IconPicker2;
                String str9;
                String str10;
                String str11;
                String str12;
                Boolean bool2;
                OzonSpannableString ozonSpannableString3;
                String str13;
                OzonSpannableString ozonSpannableString4;
                String str14;
                Align align2;
                Integer num2;
                AtomActionDTO atomActionDTO2;
                boolean z13;
                boolean z14;
                String str15 = (i11 & 1) != 0 ? cellWithSubtitle24IconPicker.value : str;
                String str16 = (i11 & 2) != 0 ? cellWithSubtitle24IconPicker.icon : str2;
                String str17 = (i11 & 4) != 0 ? cellWithSubtitle24IconPicker.iconTintColor : str3;
                String str18 = (i11 & 8) != 0 ? cellWithSubtitle24IconPicker.disclosureTintColor : str4;
                Boolean bool3 = (i11 & 16) != 0 ? cellWithSubtitle24IconPicker.hideDisclosure : bool;
                OzonSpannableString ozonSpannableString5 = (i11 & 32) != 0 ? cellWithSubtitle24IconPicker.title : ozonSpannableString;
                String str19 = (i11 & 64) != 0 ? cellWithSubtitle24IconPicker.titleColor : str5;
                OzonSpannableString ozonSpannableString6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle24IconPicker.subtitle : ozonSpannableString2;
                String str20 = (i11 & 256) != 0 ? cellWithSubtitle24IconPicker.subtitleColor : str6;
                Align align3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle24IconPicker.align : align;
                Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle24IconPicker.maxLines : num;
                AtomActionDTO atomActionDTO3 = (i11 & 2048) != 0 ? cellWithSubtitle24IconPicker.action : atomActionDTO;
                boolean z15 = (i11 & 4096) != 0 ? cellWithSubtitle24IconPicker.hideSeparator : z11;
                boolean z16 = (i11 & 8192) != 0 ? cellWithSubtitle24IconPicker.colorDisabledAsEnabled : z12;
                String str21 = str15;
                String str22 = (i11 & 16384) != 0 ? cellWithSubtitle24IconPicker.context : str7;
                TestInfo testInfo3 = (i11 & 32768) != 0 ? cellWithSubtitle24IconPicker.testInfo : testInfo;
                if ((i11 & 65536) != 0) {
                    testInfo2 = testInfo3;
                    map2 = cellWithSubtitle24IconPicker.trackingInfo;
                    str9 = str22;
                    str10 = str16;
                    str11 = str17;
                    str12 = str18;
                    bool2 = bool3;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z13 = z15;
                    z14 = z16;
                    str8 = str21;
                    cellWithSubtitle24IconPicker2 = cellWithSubtitle24IconPicker;
                } else {
                    map2 = map;
                    testInfo2 = testInfo3;
                    str8 = str21;
                    cellWithSubtitle24IconPicker2 = cellWithSubtitle24IconPicker;
                    str9 = str22;
                    str10 = str16;
                    str11 = str17;
                    str12 = str18;
                    bool2 = bool3;
                    ozonSpannableString3 = ozonSpannableString5;
                    str13 = str19;
                    ozonSpannableString4 = ozonSpannableString6;
                    str14 = str20;
                    align2 = align3;
                    num2 = num3;
                    atomActionDTO2 = atomActionDTO3;
                    z13 = z15;
                    z14 = z16;
                }
                return cellWithSubtitle24IconPicker2.copy(str8, str10, str11, str12, bool2, ozonSpannableString3, str13, ozonSpannableString4, str14, align2, num2, atomActionDTO2, z13, z14, str9, testInfo2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component16, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component17() {
                return this.trackingInfo;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component3, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            public final CellWithSubtitle24IconPicker copy(@NotNull String value, @NotNull String icon, String iconTintColor, String disclosureTintColor, Boolean hideDisclosure, @NotNull OzonSpannableString title, @NotNull String titleColor, @NotNull OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle24IconPicker(value, icon, iconTintColor, disclosureTintColor, hideDisclosure, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle24IconPicker)) {
                    return false;
                }
                CellWithSubtitle24IconPicker cellWithSubtitle24IconPicker = (CellWithSubtitle24IconPicker) other;
                return Intrinsics.d(this.value, cellWithSubtitle24IconPicker.value) && Intrinsics.d(this.icon, cellWithSubtitle24IconPicker.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle24IconPicker.iconTintColor) && Intrinsics.d(this.disclosureTintColor, cellWithSubtitle24IconPicker.disclosureTintColor) && Intrinsics.d(this.hideDisclosure, cellWithSubtitle24IconPicker.hideDisclosure) && Intrinsics.d(this.title, cellWithSubtitle24IconPicker.title) && Intrinsics.d(this.titleColor, cellWithSubtitle24IconPicker.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle24IconPicker.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle24IconPicker.subtitleColor) && this.align == cellWithSubtitle24IconPicker.align && Intrinsics.d(this.maxLines, cellWithSubtitle24IconPicker.maxLines) && Intrinsics.d(this.action, cellWithSubtitle24IconPicker.action) && this.hideSeparator == cellWithSubtitle24IconPicker.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle24IconPicker.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle24IconPicker.context) && Intrinsics.d(this.testInfo, cellWithSubtitle24IconPicker.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle24IconPicker.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final Boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle24_icon_picker;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int a11 = g.a(this.value.hashCode() * 31, 31, this.icon);
                String str = this.iconTintColor;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.disclosureTintColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.hideDisclosure;
                int b11 = Bi.b.b(this.align, g.a(P.c(this.subtitle, g.a(P.c(this.title, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31, this.titleColor), 31), 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a12 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str3 = this.context;
                int hashCode4 = (a12 + (str3 == null ? 0 : str3.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.value;
                String str2 = this.icon;
                String str3 = this.iconTintColor;
                String str4 = this.disclosureTintColor;
                Boolean bool = this.hideDisclosure;
                OzonSpannableString ozonSpannableString = this.title;
                String str5 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str6 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z11 = this.hideSeparator;
                boolean z12 = this.colorDisabledAsEnabled;
                String str7 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("CellWithSubtitle24IconPicker(value=", str, ", icon=", str2, ", iconTintColor=");
                Nh.a.h(d11, str3, ", disclosureTintColor=", str4, ", hideDisclosure=");
                d11.append(bool);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str5, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str6);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z11, z12);
                C4070a.b(d11, str7, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.value);
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeString(this.disclosureTintColor);
                Boolean bool = this.hideDisclosure;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    c.c(dest, 1, bool);
                }
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle24IconPicker(@NotNull String value, @NotNull String icon, String str, String str2, Boolean bool, @NotNull OzonSpannableString title, @NotNull String titleColor, @NotNull OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(subtitle, subtitleColor, title, titleColor, align, num, atomActionDTO, z11, z12, Type.CELL_WITH_SUBTITLE_24ICON_PICKER, str3, testInfo, map, null);
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.value = value;
                this.icon = icon;
                this.iconTintColor = str;
                this.disclosureTintColor = str2;
                this.hideDisclosure = bool;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = subtitle;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z11;
                this.colorDisabledAsEnabled = z12;
                this.context = str3;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\"\u0010#J\b\u0010B\u001a\u00020\u0019H\u0016J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\u0017HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010S\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010 HÆ\u0003J\u0017\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0096\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010ZJ\u0006\u0010[\u001a\u00020\u0019J\u0013\u0010\\\u001a\u00020\u00032\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\u0019HÖ\u0001J\t\u0010`\u001a\u00020\u0006HÖ\u0001J\u0016\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0014\u0010\u0015\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010\u001c\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0014\u0010\u001d\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010/¨\u0006f"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "isSelected", "", "isRadio", "icon", "", "iconTintColor", "counter", "counterColor", "counterBackground", "counterIcon", "counterIconPosition", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "selectedTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getCounter", "getCounterColor", "getCounterBackground", "getCounterIcon", "getCounterIconPosition", "()Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "getSelectedTrackingInfo", "()Ljava/util/Map;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle24IconCheckboxRadioCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle24IconCheckboxRadioCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;

            @NotNull
            private final String counterBackground;

            @NotNull
            private final String counterColor;
            private final String counterIcon;

            @NotNull
            private final Badge.IconPosition counterIconPosition;
            private final boolean hideSeparator;

            @NotNull
            private final String icon;
            private final String iconTintColor;
            private final boolean isRadio;
            private final boolean isSelected;
            private final Integer maxLines;
            private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle24IconCheckboxRadioCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconCheckboxRadioCounter createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    LinkedHashMap linkedHashMap2;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    String readString5 = parcel2.readString();
                    String readString6 = parcel2.readString();
                    Badge.IconPosition valueOf = Badge.IconPosition.valueOf(parcel2.readString());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel2.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            int i12 = readInt;
                            LinkedHashMap linkedHashMap4 = linkedHashMap3;
                            i11 = C2859b.a(CellWithSubtitle24IconCheckboxRadioCounter.class, parcel2, linkedHashMap4, parcel2.readString(), i11, 1);
                            linkedHashMap3 = linkedHashMap4;
                            readInt = i12;
                        }
                        linkedHashMap = linkedHashMap3;
                    }
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString7 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString8 = parcel2.readString();
                    Align valueOf2 = Align.valueOf(parcel2.readString());
                    Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle24IconCheckboxRadioCounter.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    String readString9 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle24IconCheckboxRadioCounter.class.getClassLoader());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int readInt2 = parcel2.readInt();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt2);
                        int i13 = 0;
                        while (i13 != readInt2) {
                            i13 = C2859b.a(CellWithSubtitle24IconCheckboxRadioCounter.class, parcel2, linkedHashMap5, parcel2.readString(), i13, 1);
                            parcel2 = parcel;
                        }
                        linkedHashMap2 = linkedHashMap5;
                    }
                    return new CellWithSubtitle24IconCheckboxRadioCounter(z11, z12, readString, readString2, readString3, readString4, readString5, readString6, valueOf, linkedHashMap, create, readString7, create2, readString8, valueOf2, valueOf3, atomActionDTO, z13, z14, readString9, testInfo, linkedHashMap2);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconCheckboxRadioCounter[] newArray(int i11) {
                    return new CellWithSubtitle24IconCheckboxRadioCounter[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitle24IconCheckboxRadioCounter(boolean r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, ru.ozon.uni.atoms.data.badge.Badge.IconPosition r35, java.util.Map r36, ru.ozon.uni.atoms.utils.OzonSpannableString r37, java.lang.String r38, ru.ozon.uni.atoms.utils.OzonSpannableString r39, java.lang.String r40, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r41, java.lang.Integer r42, ru.ozon.uni.atoms.data.AtomActionDTO r43, boolean r44, boolean r45, java.lang.String r46, ru.ozon.uni.atoms.data.TestInfo r47, java.util.Map r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
                /*
                    Method dump skipped, instructions count: 226
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.badge.Badge$IconPosition, java.util.Map, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitle24IconCheckboxRadioCounter copy$default(CellWithSubtitle24IconCheckboxRadioCounter cellWithSubtitle24IconCheckboxRadioCounter, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, String str6, Badge.IconPosition iconPosition, Map map, OzonSpannableString ozonSpannableString, String str7, OzonSpannableString ozonSpannableString2, String str8, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str9, TestInfo testInfo, Map map2, int i11, Object obj) {
                Map map3;
                TestInfo testInfo2;
                boolean z15 = (i11 & 1) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.isSelected : z11;
                boolean z16 = (i11 & 2) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.isRadio : z12;
                String str10 = (i11 & 4) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.icon : str;
                String str11 = (i11 & 8) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.iconTintColor : str2;
                String str12 = (i11 & 16) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.counter : str3;
                String str13 = (i11 & 32) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.counterColor : str4;
                String str14 = (i11 & 64) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.counterBackground : str5;
                String str15 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.counterIcon : str6;
                Badge.IconPosition iconPosition2 = (i11 & 256) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.counterIconPosition : iconPosition;
                Map map4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.selectedTrackingInfo : map;
                OzonSpannableString ozonSpannableString3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.title : ozonSpannableString;
                String str16 = (i11 & 2048) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.titleColor : str7;
                OzonSpannableString ozonSpannableString4 = (i11 & 4096) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.subtitle : ozonSpannableString2;
                String str17 = (i11 & 8192) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.subtitleColor : str8;
                boolean z17 = z15;
                Align align2 = (i11 & 16384) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.align : align;
                Integer num2 = (i11 & 32768) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.maxLines : num;
                AtomActionDTO atomActionDTO2 = (i11 & 65536) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.action : atomActionDTO;
                boolean z18 = (i11 & 131072) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.hideSeparator : z13;
                boolean z19 = (i11 & 262144) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.colorDisabledAsEnabled : z14;
                String str18 = (i11 & 524288) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.context : str9;
                TestInfo testInfo3 = (i11 & 1048576) != 0 ? cellWithSubtitle24IconCheckboxRadioCounter.testInfo : testInfo;
                if ((i11 & 2097152) != 0) {
                    testInfo2 = testInfo3;
                    map3 = cellWithSubtitle24IconCheckboxRadioCounter.trackingInfo;
                } else {
                    map3 = map2;
                    testInfo2 = testInfo3;
                }
                return cellWithSubtitle24IconCheckboxRadioCounter.copy(z17, z16, str10, str11, str12, str13, str14, str15, iconPosition2, map4, ozonSpannableString3, str16, ozonSpannableString4, str17, align2, num2, atomActionDTO2, z18, z19, str18, testInfo2, map3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public final Map<String, TokenizedTrackingInfo> component10() {
                return this.selectedTrackingInfo;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component13, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component14, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component15, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component16, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component17, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component18, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component19, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsRadio() {
                return this.isRadio;
            }

            /* renamed from: component20, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component21, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component22() {
                return this.trackingInfo;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component4, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            /* renamed from: component8, reason: from getter */
            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            @NotNull
            public final CellWithSubtitle24IconCheckboxRadioCounter copy(boolean isSelected, boolean isRadio, @NotNull String icon, String iconTintColor, String counter, @NotNull String counterColor, @NotNull String counterBackground, String counterIcon, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> selectedTrackingInfo, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle24IconCheckboxRadioCounter(isSelected, isRadio, icon, iconTintColor, counter, counterColor, counterBackground, counterIcon, counterIconPosition, selectedTrackingInfo, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle24IconCheckboxRadioCounter)) {
                    return false;
                }
                CellWithSubtitle24IconCheckboxRadioCounter cellWithSubtitle24IconCheckboxRadioCounter = (CellWithSubtitle24IconCheckboxRadioCounter) other;
                return this.isSelected == cellWithSubtitle24IconCheckboxRadioCounter.isSelected && this.isRadio == cellWithSubtitle24IconCheckboxRadioCounter.isRadio && Intrinsics.d(this.icon, cellWithSubtitle24IconCheckboxRadioCounter.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle24IconCheckboxRadioCounter.iconTintColor) && Intrinsics.d(this.counter, cellWithSubtitle24IconCheckboxRadioCounter.counter) && Intrinsics.d(this.counterColor, cellWithSubtitle24IconCheckboxRadioCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithSubtitle24IconCheckboxRadioCounter.counterBackground) && Intrinsics.d(this.counterIcon, cellWithSubtitle24IconCheckboxRadioCounter.counterIcon) && this.counterIconPosition == cellWithSubtitle24IconCheckboxRadioCounter.counterIconPosition && Intrinsics.d(this.selectedTrackingInfo, cellWithSubtitle24IconCheckboxRadioCounter.selectedTrackingInfo) && Intrinsics.d(this.title, cellWithSubtitle24IconCheckboxRadioCounter.title) && Intrinsics.d(this.titleColor, cellWithSubtitle24IconCheckboxRadioCounter.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle24IconCheckboxRadioCounter.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle24IconCheckboxRadioCounter.subtitleColor) && this.align == cellWithSubtitle24IconCheckboxRadioCounter.align && Intrinsics.d(this.maxLines, cellWithSubtitle24IconCheckboxRadioCounter.maxLines) && Intrinsics.d(this.action, cellWithSubtitle24IconCheckboxRadioCounter.action) && this.hideSeparator == cellWithSubtitle24IconCheckboxRadioCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle24IconCheckboxRadioCounter.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle24IconCheckboxRadioCounter.context) && Intrinsics.d(this.testInfo, cellWithSubtitle24IconCheckboxRadioCounter.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle24IconCheckboxRadioCounter.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            @NotNull
            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle24_icon_checkbox_radio_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
                return this.selectedTrackingInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(C3532b.a(Boolean.hashCode(this.isSelected) * 31, 31, this.isRadio), 31, this.icon);
                String str = this.iconTintColor;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.counter;
                int a12 = g.a(g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.counterColor), 31, this.counterBackground);
                String str3 = this.counterIcon;
                int hashCode2 = (this.counterIconPosition.hashCode() + ((a12 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                int a13 = g.a(P.c(this.title, (hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a13 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a14 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str4 = this.context;
                int hashCode4 = (a14 + (str4 == null ? 0 : str4.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                return hashCode5 + (map2 != null ? map2.hashCode() : 0);
            }

            public final boolean isRadio() {
                return this.isRadio;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                boolean z12 = this.isRadio;
                String str = this.icon;
                String str2 = this.iconTintColor;
                String str3 = this.counter;
                String str4 = this.counterColor;
                String str5 = this.counterBackground;
                String str6 = this.counterIcon;
                Badge.IconPosition iconPosition = this.counterIconPosition;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                OzonSpannableString ozonSpannableString = this.title;
                String str7 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str8 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z13 = this.hideSeparator;
                boolean z14 = this.colorDisabledAsEnabled;
                String str9 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                StringBuilder d11 = Lh.a.d("CellWithSubtitle24IconCheckboxRadioCounter(isSelected=", ", isRadio=", ", icon=", z11, z12);
                Nh.a.h(d11, str, ", iconTintColor=", str2, ", counter=");
                Nh.a.h(d11, str3, ", counterColor=", str4, ", counterBackground=");
                Nh.a.h(d11, str5, ", counterIcon=", str6, ", counterIconPosition=");
                d11.append(iconPosition);
                d11.append(", selectedTrackingInfo=");
                d11.append(map);
                d11.append(", title=");
                HY.a.c(", titleColor=", str7, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str8, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z13);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str9, ", testInfo=", d11, z14);
                return C2639a.a(", trackingInfo=", ")", d11, map2, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeInt(this.isRadio ? 1 : 0);
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeString(this.counter);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.counterIcon);
                dest.writeString(this.counterIconPosition.name());
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                if (map2 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e12 = J.e(map2, dest, 1);
                while (e12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) e12.next();
                    dest.writeString((String) entry2.getKey());
                    dest.writeParcelable((Parcelable) entry2.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle24IconCheckboxRadioCounter(boolean z11, boolean z12, @NotNull String icon, String str, String str2, @NotNull String counterColor, @NotNull String counterBackground, String str3, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> map, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map2) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z13, z14, Type.CELL_WITH_SUBTITLE_24ICON_CHECKBOX_RADIO_COUNTER, str4, testInfo, map2, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.isSelected = z11;
                this.isRadio = z12;
                this.icon = icon;
                this.iconTintColor = str;
                this.counter = str2;
                this.counterColor = counterColor;
                this.counterBackground = counterBackground;
                this.counterIcon = str3;
                this.counterIconPosition = counterIconPosition;
                this.selectedTrackingInfo = map;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z13;
                this.colorDisabledAsEnabled = z14;
                this.context = str4;
                this.testInfo = testInfo;
                this.trackingInfo = map2;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\"\u0010#J\b\u0010B\u001a\u00020\u0019H\u0016J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0017HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010S\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010 HÆ\u0003J\u0017\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0096\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010ZJ\u0006\u0010[\u001a\u00020\u0019J\u0013\u0010\\\u001a\u00020\u00032\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\u0019HÖ\u0001J\t\u0010`\u001a\u00020\u0005HÖ\u0001J\u0016\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010$R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0014\u0010\u0015\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010\u001c\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0014\u0010\u001d\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-¨\u0006f"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconToggleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "isSelected", "", "counter", "", "counterColor", "counterBackground", "counterIcon", "counterIconPosition", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "selectedTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "icon", "iconTintColor", "isAutoToggleDisabled", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getCounter", "()Ljava/lang/String;", "getCounterColor", "getCounterBackground", "getCounterIcon", "getCounterIconPosition", "()Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "getSelectedTrackingInfo", "()Ljava/util/Map;", "getIcon", "getIconTintColor", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconToggleCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle24IconToggleCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle24IconToggleCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;

            @NotNull
            private final String counterBackground;

            @NotNull
            private final String counterColor;
            private final String counterIcon;

            @NotNull
            private final Badge.IconPosition counterIconPosition;
            private final boolean hideSeparator;

            @NotNull
            private final String icon;
            private final String iconTintColor;
            private final transient boolean isAutoToggleDisabled;
            private final boolean isSelected;
            private final Integer maxLines;
            private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle24IconToggleCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconToggleCounter createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    LinkedHashMap linkedHashMap2;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    Badge.IconPosition valueOf = Badge.IconPosition.valueOf(parcel2.readString());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel2.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11 = C2859b.a(CellWithSubtitle24IconToggleCounter.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1)) {
                        }
                        linkedHashMap = linkedHashMap3;
                    }
                    String readString5 = parcel2.readString();
                    String readString6 = parcel2.readString();
                    boolean z12 = parcel2.readInt() != 0;
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString7 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString8 = parcel2.readString();
                    Align valueOf2 = Align.valueOf(parcel2.readString());
                    Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitle24IconToggleCounter.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    String readString9 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitle24IconToggleCounter.class.getClassLoader());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int readInt2 = parcel2.readInt();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt2);
                        int i12 = 0;
                        while (i12 != readInt2) {
                            i12 = C2859b.a(CellWithSubtitle24IconToggleCounter.class, parcel2, linkedHashMap4, parcel2.readString(), i12, 1);
                            parcel2 = parcel;
                        }
                        linkedHashMap2 = linkedHashMap4;
                    }
                    return new CellWithSubtitle24IconToggleCounter(z11, readString, readString2, readString3, readString4, valueOf, linkedHashMap, readString5, readString6, z12, create, readString7, create2, readString8, valueOf2, valueOf3, atomActionDTO, z13, z14, readString9, testInfo, linkedHashMap2);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconToggleCounter[] newArray(int i11) {
                    return new CellWithSubtitle24IconToggleCounter[i11];
                }
            }

            public /* synthetic */ CellWithSubtitle24IconToggleCounter(boolean z11, String str, String str2, String str3, String str4, Badge.IconPosition iconPosition, Map map, String str5, String str6, boolean z12, OzonSpannableString ozonSpannableString, String str7, OzonSpannableString ozonSpannableString2, String str8, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str9, TestInfo testInfo, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue() : str2, (i11 & 8) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_PARANDJA.getValue() : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? Badge.IconPosition.ICON_POSITION_LEFT : iconPosition, (i11 & 64) != 0 ? null : map, str5, str6, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z12, ozonSpannableString, (i11 & 2048) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str7, (i11 & 4096) != 0 ? null : ozonSpannableString2, (i11 & 8192) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue() : str8, (i11 & 16384) != 0 ? Align.ALIGN_TYPE_TOP : align, (32768 & i11) != 0 ? null : num, (65536 & i11) != 0 ? null : atomActionDTO, (131072 & i11) != 0 ? false : z13, (262144 & i11) != 0 ? false : z14, (524288 & i11) != 0 ? null : str9, (1048576 & i11) != 0 ? null : testInfo, (i11 & 2097152) != 0 ? null : map2);
            }

            public static /* synthetic */ CellWithSubtitle24IconToggleCounter copy$default(CellWithSubtitle24IconToggleCounter cellWithSubtitle24IconToggleCounter, boolean z11, String str, String str2, String str3, String str4, Badge.IconPosition iconPosition, Map map, String str5, String str6, boolean z12, OzonSpannableString ozonSpannableString, String str7, OzonSpannableString ozonSpannableString2, String str8, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str9, TestInfo testInfo, Map map2, int i11, Object obj) {
                Map map3;
                TestInfo testInfo2;
                boolean z15 = (i11 & 1) != 0 ? cellWithSubtitle24IconToggleCounter.isSelected : z11;
                String str10 = (i11 & 2) != 0 ? cellWithSubtitle24IconToggleCounter.counter : str;
                String str11 = (i11 & 4) != 0 ? cellWithSubtitle24IconToggleCounter.counterColor : str2;
                String str12 = (i11 & 8) != 0 ? cellWithSubtitle24IconToggleCounter.counterBackground : str3;
                String str13 = (i11 & 16) != 0 ? cellWithSubtitle24IconToggleCounter.counterIcon : str4;
                Badge.IconPosition iconPosition2 = (i11 & 32) != 0 ? cellWithSubtitle24IconToggleCounter.counterIconPosition : iconPosition;
                Map map4 = (i11 & 64) != 0 ? cellWithSubtitle24IconToggleCounter.selectedTrackingInfo : map;
                String str14 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle24IconToggleCounter.icon : str5;
                String str15 = (i11 & 256) != 0 ? cellWithSubtitle24IconToggleCounter.iconTintColor : str6;
                boolean z16 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle24IconToggleCounter.isAutoToggleDisabled : z12;
                OzonSpannableString ozonSpannableString3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle24IconToggleCounter.title : ozonSpannableString;
                String str16 = (i11 & 2048) != 0 ? cellWithSubtitle24IconToggleCounter.titleColor : str7;
                OzonSpannableString ozonSpannableString4 = (i11 & 4096) != 0 ? cellWithSubtitle24IconToggleCounter.subtitle : ozonSpannableString2;
                String str17 = (i11 & 8192) != 0 ? cellWithSubtitle24IconToggleCounter.subtitleColor : str8;
                boolean z17 = z15;
                Align align2 = (i11 & 16384) != 0 ? cellWithSubtitle24IconToggleCounter.align : align;
                Integer num2 = (i11 & 32768) != 0 ? cellWithSubtitle24IconToggleCounter.maxLines : num;
                AtomActionDTO atomActionDTO2 = (i11 & 65536) != 0 ? cellWithSubtitle24IconToggleCounter.action : atomActionDTO;
                boolean z18 = (i11 & 131072) != 0 ? cellWithSubtitle24IconToggleCounter.hideSeparator : z13;
                boolean z19 = (i11 & 262144) != 0 ? cellWithSubtitle24IconToggleCounter.colorDisabledAsEnabled : z14;
                String str18 = (i11 & 524288) != 0 ? cellWithSubtitle24IconToggleCounter.context : str9;
                TestInfo testInfo3 = (i11 & 1048576) != 0 ? cellWithSubtitle24IconToggleCounter.testInfo : testInfo;
                if ((i11 & 2097152) != 0) {
                    testInfo2 = testInfo3;
                    map3 = cellWithSubtitle24IconToggleCounter.trackingInfo;
                } else {
                    map3 = map2;
                    testInfo2 = testInfo3;
                }
                return cellWithSubtitle24IconToggleCounter.copy(z17, str10, str11, str12, str13, iconPosition2, map4, str14, str15, z16, ozonSpannableString3, str16, ozonSpannableString4, str17, align2, num2, atomActionDTO2, z18, z19, str18, testInfo2, map3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getIsAutoToggleDisabled() {
                return this.isAutoToggleDisabled;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component13, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component14, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component15, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component16, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component17, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component18, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component19, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            /* renamed from: component20, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component21, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component22() {
                return this.trackingInfo;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            public final Map<String, TokenizedTrackingInfo> component7() {
                return this.selectedTrackingInfo;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component9, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @NotNull
            public final CellWithSubtitle24IconToggleCounter copy(boolean isSelected, String counter, @NotNull String counterColor, @NotNull String counterBackground, String counterIcon, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> selectedTrackingInfo, @NotNull String icon, String iconTintColor, boolean isAutoToggleDisabled, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle24IconToggleCounter(isSelected, counter, counterColor, counterBackground, counterIcon, counterIconPosition, selectedTrackingInfo, icon, iconTintColor, isAutoToggleDisabled, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle24IconToggleCounter)) {
                    return false;
                }
                CellWithSubtitle24IconToggleCounter cellWithSubtitle24IconToggleCounter = (CellWithSubtitle24IconToggleCounter) other;
                return this.isSelected == cellWithSubtitle24IconToggleCounter.isSelected && Intrinsics.d(this.counter, cellWithSubtitle24IconToggleCounter.counter) && Intrinsics.d(this.counterColor, cellWithSubtitle24IconToggleCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithSubtitle24IconToggleCounter.counterBackground) && Intrinsics.d(this.counterIcon, cellWithSubtitle24IconToggleCounter.counterIcon) && this.counterIconPosition == cellWithSubtitle24IconToggleCounter.counterIconPosition && Intrinsics.d(this.selectedTrackingInfo, cellWithSubtitle24IconToggleCounter.selectedTrackingInfo) && Intrinsics.d(this.icon, cellWithSubtitle24IconToggleCounter.icon) && Intrinsics.d(this.iconTintColor, cellWithSubtitle24IconToggleCounter.iconTintColor) && this.isAutoToggleDisabled == cellWithSubtitle24IconToggleCounter.isAutoToggleDisabled && Intrinsics.d(this.title, cellWithSubtitle24IconToggleCounter.title) && Intrinsics.d(this.titleColor, cellWithSubtitle24IconToggleCounter.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitle24IconToggleCounter.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitle24IconToggleCounter.subtitleColor) && this.align == cellWithSubtitle24IconToggleCounter.align && Intrinsics.d(this.maxLines, cellWithSubtitle24IconToggleCounter.maxLines) && Intrinsics.d(this.action, cellWithSubtitle24IconToggleCounter.action) && this.hideSeparator == cellWithSubtitle24IconToggleCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle24IconToggleCounter.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitle24IconToggleCounter.context) && Intrinsics.d(this.testInfo, cellWithSubtitle24IconToggleCounter.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitle24IconToggleCounter.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            @NotNull
            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle24_icon_toggle_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
                return this.selectedTrackingInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isSelected) * 31;
                String str = this.counter;
                int a11 = g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.counterColor), 31, this.counterBackground);
                String str2 = this.counterIcon;
                int hashCode2 = (this.counterIconPosition.hashCode() + ((a11 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                int a12 = g.a((hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.icon);
                String str3 = this.iconTintColor;
                int a13 = g.a(P.c(this.title, C3532b.a((a12 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isAutoToggleDisabled), 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a13 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a14 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str4 = this.context;
                int hashCode4 = (a14 + (str4 == null ? 0 : str4.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                return hashCode5 + (map2 != null ? map2.hashCode() : 0);
            }

            public final boolean isAutoToggleDisabled() {
                return this.isAutoToggleDisabled;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                String str = this.counter;
                String str2 = this.counterColor;
                String str3 = this.counterBackground;
                String str4 = this.counterIcon;
                Badge.IconPosition iconPosition = this.counterIconPosition;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                String str5 = this.icon;
                String str6 = this.iconTintColor;
                boolean z12 = this.isAutoToggleDisabled;
                OzonSpannableString ozonSpannableString = this.title;
                String str7 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str8 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z13 = this.hideSeparator;
                boolean z14 = this.colorDisabledAsEnabled;
                String str9 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                StringBuilder d11 = G.d("CellWithSubtitle24IconToggleCounter(isSelected=", ", counter=", str, ", counterColor=", z11);
                Nh.a.h(d11, str2, ", counterBackground=", str3, ", counterIcon=");
                d11.append(str4);
                d11.append(", counterIconPosition=");
                d11.append(iconPosition);
                d11.append(", selectedTrackingInfo=");
                d11.append(map);
                d11.append(", icon=");
                d11.append(str5);
                d11.append(", iconTintColor=");
                C2880a.c(str6, ", isAutoToggleDisabled=", ", title=", d11, z12);
                HY.a.c(", titleColor=", str7, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str8, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z13);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str9, ", testInfo=", d11, z14);
                return C2639a.a(", trackingInfo=", ")", d11, map2, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeString(this.counter);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.counterIcon);
                dest.writeString(this.counterIconPosition.name());
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                dest.writeString(this.icon);
                dest.writeString(this.iconTintColor);
                dest.writeInt(this.isAutoToggleDisabled ? 1 : 0);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                if (map2 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e12 = J.e(map2, dest, 1);
                while (e12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) e12.next();
                    dest.writeString((String) entry2.getKey());
                    dest.writeParcelable((Parcelable) entry2.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle24IconToggleCounter(boolean z11, String str, @NotNull String counterColor, @NotNull String counterBackground, String str2, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> map, @NotNull String icon, String str3, boolean z12, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map2) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z13, z14, Type.CELL_WITH_SUBTITLE_24ICON_TOGGLE_COUNTER, str4, testInfo, map2, null);
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.isSelected = z11;
                this.counter = str;
                this.counterColor = counterColor;
                this.counterBackground = counterBackground;
                this.counterIcon = str2;
                this.counterIconPosition = counterIconPosition;
                this.selectedTrackingInfo = map;
                this.icon = icon;
                this.iconTintColor = str3;
                this.isAutoToggleDisabled = z12;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z13;
                this.colorDisabledAsEnabled = z14;
                this.context = str4;
                this.testInfo = testInfo;
                this.trackingInfo = map2;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b \u0010!J\b\u0010>\u001a\u00020\u0017H\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u000bHÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0015HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010M\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0017\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0080\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010TJ\u0006\u0010U\u001a\u00020\u0017J\u0013\u0010V\u001a\u00020\u00032\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\t\u0010Y\u001a\u00020\u0017HÖ\u0001J\t\u0010Z\u001a\u00020\u0006HÖ\u0001J\u0016\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u0010\u001a\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0014\u0010\u001b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+¨\u0006`"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "isSelected", "", "isRadio", "counter", "", "counterColor", "counterBackground", "counterIcon", "counterIconPosition", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "selectedTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getCounter", "()Ljava/lang/String;", "getCounterColor", "getCounterBackground", "getCounterIcon", "getCounterIconPosition", "()Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "getSelectedTrackingInfo", "()Ljava/util/Map;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleCheckboxRadioCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleCheckboxRadioCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;

            @NotNull
            private final String counterBackground;

            @NotNull
            private final String counterColor;
            private final String counterIcon;

            @NotNull
            private final Badge.IconPosition counterIconPosition;
            private final boolean hideSeparator;
            private final boolean isRadio;
            private final boolean isSelected;
            private final Integer maxLines;
            private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleCheckboxRadioCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleCheckboxRadioCounter createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    LinkedHashMap linkedHashMap2;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    boolean z12 = parcel2.readInt() != 0;
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    Badge.IconPosition valueOf = Badge.IconPosition.valueOf(parcel2.readString());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel2.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            int i12 = readInt;
                            LinkedHashMap linkedHashMap4 = linkedHashMap3;
                            i11 = C2859b.a(CellWithSubtitleCheckboxRadioCounter.class, parcel2, linkedHashMap4, parcel2.readString(), i11, 1);
                            linkedHashMap3 = linkedHashMap4;
                            readInt = i12;
                        }
                        linkedHashMap = linkedHashMap3;
                    }
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString5 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString6 = parcel2.readString();
                    Align valueOf2 = Align.valueOf(parcel2.readString());
                    Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleCheckboxRadioCounter.class.getClassLoader());
                    boolean z13 = parcel2.readInt() != 0;
                    boolean z14 = parcel2.readInt() != 0;
                    String readString7 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleCheckboxRadioCounter.class.getClassLoader());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int readInt2 = parcel2.readInt();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt2);
                        int i13 = 0;
                        while (i13 != readInt2) {
                            i13 = C2859b.a(CellWithSubtitleCheckboxRadioCounter.class, parcel2, linkedHashMap5, parcel2.readString(), i13, 1);
                            parcel2 = parcel;
                        }
                        linkedHashMap2 = linkedHashMap5;
                    }
                    return new CellWithSubtitleCheckboxRadioCounter(z11, z12, readString, readString2, readString3, readString4, valueOf, linkedHashMap, create, readString5, create2, readString6, valueOf2, valueOf3, atomActionDTO, z13, z14, readString7, testInfo, linkedHashMap2);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleCheckboxRadioCounter[] newArray(int i11) {
                    return new CellWithSubtitleCheckboxRadioCounter[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ CellWithSubtitleCheckboxRadioCounter(boolean r25, boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, ru.ozon.uni.atoms.data.badge.Badge.IconPosition r31, java.util.Map r32, ru.ozon.uni.atoms.utils.OzonSpannableString r33, java.lang.String r34, ru.ozon.uni.atoms.utils.OzonSpannableString r35, java.lang.String r36, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r37, java.lang.Integer r38, ru.ozon.uni.atoms.data.AtomActionDTO r39, boolean r40, boolean r41, java.lang.String r42, ru.ozon.uni.atoms.data.TestInfo r43, java.util.Map r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
                /*
                    Method dump skipped, instructions count: 210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.badge.Badge$IconPosition, java.util.Map, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ CellWithSubtitleCheckboxRadioCounter copy$default(CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter, boolean z11, boolean z12, String str, String str2, String str3, String str4, Badge.IconPosition iconPosition, Map map, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str7, TestInfo testInfo, Map map2, int i11, Object obj) {
                Map map3;
                TestInfo testInfo2;
                boolean z15 = (i11 & 1) != 0 ? cellWithSubtitleCheckboxRadioCounter.isSelected : z11;
                boolean z16 = (i11 & 2) != 0 ? cellWithSubtitleCheckboxRadioCounter.isRadio : z12;
                String str8 = (i11 & 4) != 0 ? cellWithSubtitleCheckboxRadioCounter.counter : str;
                String str9 = (i11 & 8) != 0 ? cellWithSubtitleCheckboxRadioCounter.counterColor : str2;
                String str10 = (i11 & 16) != 0 ? cellWithSubtitleCheckboxRadioCounter.counterBackground : str3;
                String str11 = (i11 & 32) != 0 ? cellWithSubtitleCheckboxRadioCounter.counterIcon : str4;
                Badge.IconPosition iconPosition2 = (i11 & 64) != 0 ? cellWithSubtitleCheckboxRadioCounter.counterIconPosition : iconPosition;
                Map map4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitleCheckboxRadioCounter.selectedTrackingInfo : map;
                OzonSpannableString ozonSpannableString3 = (i11 & 256) != 0 ? cellWithSubtitleCheckboxRadioCounter.title : ozonSpannableString;
                String str12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitleCheckboxRadioCounter.titleColor : str5;
                OzonSpannableString ozonSpannableString4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitleCheckboxRadioCounter.subtitle : ozonSpannableString2;
                String str13 = (i11 & 2048) != 0 ? cellWithSubtitleCheckboxRadioCounter.subtitleColor : str6;
                Align align2 = (i11 & 4096) != 0 ? cellWithSubtitleCheckboxRadioCounter.align : align;
                Integer num2 = (i11 & 8192) != 0 ? cellWithSubtitleCheckboxRadioCounter.maxLines : num;
                boolean z17 = z15;
                AtomActionDTO atomActionDTO2 = (i11 & 16384) != 0 ? cellWithSubtitleCheckboxRadioCounter.action : atomActionDTO;
                boolean z18 = (i11 & 32768) != 0 ? cellWithSubtitleCheckboxRadioCounter.hideSeparator : z13;
                boolean z19 = (i11 & 65536) != 0 ? cellWithSubtitleCheckboxRadioCounter.colorDisabledAsEnabled : z14;
                String str14 = (i11 & 131072) != 0 ? cellWithSubtitleCheckboxRadioCounter.context : str7;
                TestInfo testInfo3 = (i11 & 262144) != 0 ? cellWithSubtitleCheckboxRadioCounter.testInfo : testInfo;
                if ((i11 & 524288) != 0) {
                    testInfo2 = testInfo3;
                    map3 = cellWithSubtitleCheckboxRadioCounter.trackingInfo;
                } else {
                    map3 = map2;
                    testInfo2 = testInfo3;
                }
                return cellWithSubtitleCheckboxRadioCounter.copy(z17, z16, str8, str9, str10, str11, iconPosition2, map4, ozonSpannableString3, str12, ozonSpannableString4, str13, align2, num2, atomActionDTO2, z18, z19, str14, testInfo2, map3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            /* renamed from: component11, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component13, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component14, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component15, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component16, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component17, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component18, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component19, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsRadio() {
                return this.isRadio;
            }

            public final Map<String, TokenizedTrackingInfo> component20() {
                return this.trackingInfo;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            /* renamed from: component6, reason: from getter */
            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            public final Map<String, TokenizedTrackingInfo> component8() {
                return this.selectedTrackingInfo;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            public final CellWithSubtitleCheckboxRadioCounter copy(boolean isSelected, boolean isRadio, String counter, @NotNull String counterColor, @NotNull String counterBackground, String counterIcon, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> selectedTrackingInfo, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleCheckboxRadioCounter(isSelected, isRadio, counter, counterColor, counterBackground, counterIcon, counterIconPosition, selectedTrackingInfo, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleCheckboxRadioCounter)) {
                    return false;
                }
                CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter = (CellWithSubtitleCheckboxRadioCounter) other;
                return this.isSelected == cellWithSubtitleCheckboxRadioCounter.isSelected && this.isRadio == cellWithSubtitleCheckboxRadioCounter.isRadio && Intrinsics.d(this.counter, cellWithSubtitleCheckboxRadioCounter.counter) && Intrinsics.d(this.counterColor, cellWithSubtitleCheckboxRadioCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithSubtitleCheckboxRadioCounter.counterBackground) && Intrinsics.d(this.counterIcon, cellWithSubtitleCheckboxRadioCounter.counterIcon) && this.counterIconPosition == cellWithSubtitleCheckboxRadioCounter.counterIconPosition && Intrinsics.d(this.selectedTrackingInfo, cellWithSubtitleCheckboxRadioCounter.selectedTrackingInfo) && Intrinsics.d(this.title, cellWithSubtitleCheckboxRadioCounter.title) && Intrinsics.d(this.titleColor, cellWithSubtitleCheckboxRadioCounter.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleCheckboxRadioCounter.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleCheckboxRadioCounter.subtitleColor) && this.align == cellWithSubtitleCheckboxRadioCounter.align && Intrinsics.d(this.maxLines, cellWithSubtitleCheckboxRadioCounter.maxLines) && Intrinsics.d(this.action, cellWithSubtitleCheckboxRadioCounter.action) && this.hideSeparator == cellWithSubtitleCheckboxRadioCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleCheckboxRadioCounter.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleCheckboxRadioCounter.context) && Intrinsics.d(this.testInfo, cellWithSubtitleCheckboxRadioCounter.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleCheckboxRadioCounter.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            @NotNull
            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_checkbox_radio_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
                return this.selectedTrackingInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = C3532b.a(Boolean.hashCode(this.isSelected) * 31, 31, this.isRadio);
                String str = this.counter;
                int a12 = g.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.counterColor), 31, this.counterBackground);
                String str2 = this.counterIcon;
                int hashCode = (this.counterIconPosition.hashCode() + ((a12 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                int a13 = g.a(P.c(this.title, (hashCode + (map == null ? 0 : map.hashCode())) * 31, 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a13 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a14 = C3532b.a(C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str3 = this.context;
                int hashCode3 = (a14 + (str3 == null ? 0 : str3.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                return hashCode4 + (map2 != null ? map2.hashCode() : 0);
            }

            public final boolean isRadio() {
                return this.isRadio;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                boolean z12 = this.isRadio;
                String str = this.counter;
                String str2 = this.counterColor;
                String str3 = this.counterBackground;
                String str4 = this.counterIcon;
                Badge.IconPosition iconPosition = this.counterIconPosition;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                OzonSpannableString ozonSpannableString = this.title;
                String str5 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str6 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z13 = this.hideSeparator;
                boolean z14 = this.colorDisabledAsEnabled;
                String str7 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                StringBuilder d11 = Lh.a.d("CellWithSubtitleCheckboxRadioCounter(isSelected=", ", isRadio=", ", counter=", z11, z12);
                Nh.a.h(d11, str, ", counterColor=", str2, ", counterBackground=");
                Nh.a.h(d11, str3, ", counterIcon=", str4, ", counterIconPosition=");
                d11.append(iconPosition);
                d11.append(", selectedTrackingInfo=");
                d11.append(map);
                d11.append(", title=");
                HY.a.c(", titleColor=", str5, ", subtitle=", d11, ozonSpannableString);
                HY.a.c(", subtitleColor=", str6, ", align=", d11, ozonSpannableString2);
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                d11.append(z13);
                d11.append(", colorDisabledAsEnabled=");
                C5766e.a(", context=", str7, ", testInfo=", d11, z14);
                return C2639a.a(", trackingInfo=", ")", d11, map2, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeInt(this.isRadio ? 1 : 0);
                dest.writeString(this.counter);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.counterIcon);
                dest.writeString(this.counterIconPosition.name());
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                if (map2 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e12 = J.e(map2, dest, 1);
                while (e12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) e12.next();
                    dest.writeString((String) entry2.getKey());
                    dest.writeParcelable((Parcelable) entry2.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleCheckboxRadioCounter(boolean z11, boolean z12, String str, @NotNull String counterColor, @NotNull String counterBackground, String str2, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> map, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z13, boolean z14, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map2) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z13, z14, Type.CELL_WITH_SUBTITLE_CHECKBOX_RADIO_COUNTER, str3, testInfo, map2, null);
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.isSelected = z11;
                this.isRadio = z12;
                this.counter = str;
                this.counterColor = counterColor;
                this.counterBackground = counterBackground;
                this.counterIcon = str2;
                this.counterIconPosition = counterIconPosition;
                this.selectedTrackingInfo = map;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z13;
                this.colorDisabledAsEnabled = z14;
                this.context = str3;
                this.testInfo = testInfo;
                this.trackingInfo = map2;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010 J\b\u0010=\u001a\u00020\u0016H\u0016J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\u0017\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0014HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010K\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0017\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jö\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010RJ\u0006\u0010S\u001a\u00020\u0016J\u0013\u0010T\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0016HÖ\u0001J\t\u0010X\u001a\u00020\u0005HÖ\u0001J\u0016\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u0019\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0014\u0010\u001a\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*¨\u0006^"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "isSelected", "", "counter", "", "counterColor", "counterBackground", "counterIcon", "counterIconPosition", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "selectedTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "subtitle", "subtitleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getCounter", "()Ljava/lang/String;", "getCounterColor", "getCounterBackground", "getCounterIcon", "getCounterIconPosition", "()Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "getSelectedTrackingInfo", "()Ljava/util/Map;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getSubtitle", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggleCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitleToggleCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitleToggleCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;

            @NotNull
            private final String counterBackground;

            @NotNull
            private final String counterColor;
            private final String counterIcon;

            @NotNull
            private final Badge.IconPosition counterIconPosition;
            private final boolean hideSeparator;
            private final boolean isSelected;
            private final Integer maxLines;
            private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitleToggleCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleToggleCounter createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    LinkedHashMap linkedHashMap2;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    boolean z11 = parcel2.readInt() != 0;
                    String readString = parcel2.readString();
                    String readString2 = parcel2.readString();
                    String readString3 = parcel2.readString();
                    String readString4 = parcel2.readString();
                    Badge.IconPosition valueOf = Badge.IconPosition.valueOf(parcel2.readString());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel2.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11 = C2859b.a(CellWithSubtitleToggleCounter.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1)) {
                        }
                        linkedHashMap = linkedHashMap3;
                    }
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                    String readString5 = parcel2.readString();
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                    String readString6 = parcel2.readString();
                    Align valueOf2 = Align.valueOf(parcel2.readString());
                    Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellWithSubtitleToggleCounter.class.getClassLoader());
                    boolean z12 = parcel2.readInt() != 0;
                    boolean z13 = parcel2.readInt() != 0;
                    String readString7 = parcel2.readString();
                    TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellWithSubtitleToggleCounter.class.getClassLoader());
                    if (parcel2.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int readInt2 = parcel2.readInt();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt2);
                        int i12 = 0;
                        while (i12 != readInt2) {
                            i12 = C2859b.a(CellWithSubtitleToggleCounter.class, parcel2, linkedHashMap4, parcel2.readString(), i12, 1);
                            parcel2 = parcel;
                        }
                        linkedHashMap2 = linkedHashMap4;
                    }
                    return new CellWithSubtitleToggleCounter(z11, readString, readString2, readString3, readString4, valueOf, linkedHashMap, create, readString5, create2, readString6, valueOf2, valueOf3, atomActionDTO, z12, z13, readString7, testInfo, linkedHashMap2);
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitleToggleCounter[] newArray(int i11) {
                    return new CellWithSubtitleToggleCounter[i11];
                }
            }

            public /* synthetic */ CellWithSubtitleToggleCounter(boolean z11, String str, String str2, String str3, String str4, Badge.IconPosition iconPosition, Map map, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str7, TestInfo testInfo, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue() : str2, (i11 & 8) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_PARANDJA.getValue() : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? Badge.IconPosition.ICON_POSITION_LEFT : iconPosition, (i11 & 64) != 0 ? null : map, ozonSpannableString, (i11 & 256) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : ozonSpannableString2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue() : str6, (i11 & 2048) != 0 ? Align.ALIGN_TYPE_TOP : align, (i11 & 4096) != 0 ? null : num, (i11 & 8192) != 0 ? null : atomActionDTO, (i11 & 16384) != 0 ? false : z12, (32768 & i11) != 0 ? false : z13, (65536 & i11) != 0 ? null : str7, (131072 & i11) != 0 ? null : testInfo, (i11 & 262144) != 0 ? null : map2);
            }

            public static /* synthetic */ CellWithSubtitleToggleCounter copy$default(CellWithSubtitleToggleCounter cellWithSubtitleToggleCounter, boolean z11, String str, String str2, String str3, String str4, Badge.IconPosition iconPosition, Map map, OzonSpannableString ozonSpannableString, String str5, OzonSpannableString ozonSpannableString2, String str6, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str7, TestInfo testInfo, Map map2, int i11, Object obj) {
                Map map3;
                TestInfo testInfo2;
                boolean z14 = (i11 & 1) != 0 ? cellWithSubtitleToggleCounter.isSelected : z11;
                String str8 = (i11 & 2) != 0 ? cellWithSubtitleToggleCounter.counter : str;
                String str9 = (i11 & 4) != 0 ? cellWithSubtitleToggleCounter.counterColor : str2;
                String str10 = (i11 & 8) != 0 ? cellWithSubtitleToggleCounter.counterBackground : str3;
                String str11 = (i11 & 16) != 0 ? cellWithSubtitleToggleCounter.counterIcon : str4;
                Badge.IconPosition iconPosition2 = (i11 & 32) != 0 ? cellWithSubtitleToggleCounter.counterIconPosition : iconPosition;
                Map map4 = (i11 & 64) != 0 ? cellWithSubtitleToggleCounter.selectedTrackingInfo : map;
                OzonSpannableString ozonSpannableString3 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitleToggleCounter.title : ozonSpannableString;
                String str12 = (i11 & 256) != 0 ? cellWithSubtitleToggleCounter.titleColor : str5;
                OzonSpannableString ozonSpannableString4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitleToggleCounter.subtitle : ozonSpannableString2;
                String str13 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitleToggleCounter.subtitleColor : str6;
                Align align2 = (i11 & 2048) != 0 ? cellWithSubtitleToggleCounter.align : align;
                Integer num2 = (i11 & 4096) != 0 ? cellWithSubtitleToggleCounter.maxLines : num;
                AtomActionDTO atomActionDTO2 = (i11 & 8192) != 0 ? cellWithSubtitleToggleCounter.action : atomActionDTO;
                boolean z15 = z14;
                boolean z16 = (i11 & 16384) != 0 ? cellWithSubtitleToggleCounter.hideSeparator : z12;
                boolean z17 = (i11 & 32768) != 0 ? cellWithSubtitleToggleCounter.colorDisabledAsEnabled : z13;
                String str14 = (i11 & 65536) != 0 ? cellWithSubtitleToggleCounter.context : str7;
                TestInfo testInfo3 = (i11 & 131072) != 0 ? cellWithSubtitleToggleCounter.testInfo : testInfo;
                if ((i11 & 262144) != 0) {
                    testInfo2 = testInfo3;
                    map3 = cellWithSubtitleToggleCounter.trackingInfo;
                } else {
                    map3 = map2;
                    testInfo2 = testInfo3;
                }
                return cellWithSubtitleToggleCounter.copy(z15, str8, str9, str10, str11, iconPosition2, map4, ozonSpannableString3, str12, ozonSpannableString4, str13, align2, num2, atomActionDTO2, z16, z17, str14, testInfo2, map3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component10, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            /* renamed from: component13, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component14, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component15, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            /* renamed from: component16, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            /* renamed from: component17, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component18, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component19() {
                return this.trackingInfo;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            public final Map<String, TokenizedTrackingInfo> component7() {
                return this.selectedTrackingInfo;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            @NotNull
            public final CellWithSubtitleToggleCounter copy(boolean isSelected, String counter, @NotNull String counterColor, @NotNull String counterBackground, String counterIcon, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> selectedTrackingInfo, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString subtitle, @NotNull String subtitleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitleToggleCounter(isSelected, counter, counterColor, counterBackground, counterIcon, counterIconPosition, selectedTrackingInfo, title, titleColor, subtitle, subtitleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleToggleCounter)) {
                    return false;
                }
                CellWithSubtitleToggleCounter cellWithSubtitleToggleCounter = (CellWithSubtitleToggleCounter) other;
                return this.isSelected == cellWithSubtitleToggleCounter.isSelected && Intrinsics.d(this.counter, cellWithSubtitleToggleCounter.counter) && Intrinsics.d(this.counterColor, cellWithSubtitleToggleCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithSubtitleToggleCounter.counterBackground) && Intrinsics.d(this.counterIcon, cellWithSubtitleToggleCounter.counterIcon) && this.counterIconPosition == cellWithSubtitleToggleCounter.counterIconPosition && Intrinsics.d(this.selectedTrackingInfo, cellWithSubtitleToggleCounter.selectedTrackingInfo) && Intrinsics.d(this.title, cellWithSubtitleToggleCounter.title) && Intrinsics.d(this.titleColor, cellWithSubtitleToggleCounter.titleColor) && Intrinsics.d(this.subtitle, cellWithSubtitleToggleCounter.subtitle) && Intrinsics.d(this.subtitleColor, cellWithSubtitleToggleCounter.subtitleColor) && this.align == cellWithSubtitleToggleCounter.align && Intrinsics.d(this.maxLines, cellWithSubtitleToggleCounter.maxLines) && Intrinsics.d(this.action, cellWithSubtitleToggleCounter.action) && this.hideSeparator == cellWithSubtitleToggleCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitleToggleCounter.colorDisabledAsEnabled && Intrinsics.d(this.context, cellWithSubtitleToggleCounter.context) && Intrinsics.d(this.testInfo, cellWithSubtitleToggleCounter.testInfo) && Intrinsics.d(this.trackingInfo, cellWithSubtitleToggleCounter.trackingInfo);
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            @NotNull
            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle_toggle_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
                return this.selectedTrackingInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isSelected) * 31;
                String str = this.counter;
                int a11 = g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.counterColor), 31, this.counterBackground);
                String str2 = this.counterIcon;
                int hashCode2 = (this.counterIconPosition.hashCode() + ((a11 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                int a12 = g.a(P.c(this.title, (hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31), 31, this.titleColor);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int b11 = Bi.b.b(this.align, g.a((a12 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.subtitleColor), 31);
                Integer num = this.maxLines;
                int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a13 = C3532b.a(C3532b.a((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
                String str3 = this.context;
                int hashCode4 = (a13 + (str3 == null ? 0 : str3.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                return hashCode5 + (map2 != null ? map2.hashCode() : 0);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                String str = this.counter;
                String str2 = this.counterColor;
                String str3 = this.counterBackground;
                String str4 = this.counterIcon;
                Badge.IconPosition iconPosition = this.counterIconPosition;
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                OzonSpannableString ozonSpannableString = this.title;
                String str5 = this.titleColor;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                String str6 = this.subtitleColor;
                Align align = this.align;
                Integer num = this.maxLines;
                AtomActionDTO atomActionDTO = this.action;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                String str7 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                StringBuilder d11 = G.d("CellWithSubtitleToggleCounter(isSelected=", ", counter=", str, ", counterColor=", z11);
                Nh.a.h(d11, str2, ", counterBackground=", str3, ", counterIcon=");
                d11.append(str4);
                d11.append(", counterIconPosition=");
                d11.append(iconPosition);
                d11.append(", selectedTrackingInfo=");
                d11.append(map);
                d11.append(", title=");
                d11.append((Object) ozonSpannableString);
                d11.append(", titleColor=");
                B6.b.c(str5, ", subtitle=", ", subtitleColor=", d11, ozonSpannableString2);
                d11.append(str6);
                d11.append(", align=");
                d11.append(align);
                d11.append(", maxLines=");
                d11.append(num);
                d11.append(", action=");
                d11.append(atomActionDTO);
                d11.append(", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", context=", d11, z12, z13);
                C4070a.b(d11, str7, ", testInfo=", testInfo, ", trackingInfo=");
                return P.f(d11, map2, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isSelected ? 1 : 0);
                dest.writeString(this.counter);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.counterIcon);
                dest.writeString(this.counterIconPosition.name());
                Map<String, TokenizedTrackingInfo> map = this.selectedTrackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.titleColor);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeString(this.subtitleColor);
                dest.writeString(this.align.name());
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeParcelable(this.action, flags);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.context);
                dest.writeParcelable(this.testInfo, flags);
                Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
                if (map2 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e12 = J.e(map2, dest, 1);
                while (e12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) e12.next();
                    dest.writeString((String) entry2.getKey());
                    dest.writeParcelable((Parcelable) entry2.getValue(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleToggleCounter(boolean z11, String str, @NotNull String counterColor, @NotNull String counterBackground, String str2, @NotNull Badge.IconPosition counterIconPosition, Map<String, TokenizedTrackingInfo> map, @NotNull OzonSpannableString title, @NotNull String titleColor, OzonSpannableString ozonSpannableString, @NotNull String subtitleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z12, boolean z13, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map2) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_TOGGLE_COUNTER, str3, testInfo, map2, null);
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.isSelected = z11;
                this.counter = str;
                this.counterColor = counterColor;
                this.counterBackground = counterBackground;
                this.counterIcon = str2;
                this.counterIconPosition = counterIconPosition;
                this.selectedTrackingInfo = map;
                this.title = title;
                this.titleColor = titleColor;
                this.subtitle = ozonSpannableString;
                this.subtitleColor = subtitleColor;
                this.align = align;
                this.maxLines = num;
                this.action = atomActionDTO;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.context = str3;
                this.testInfo = testInfo;
                this.trackingInfo = map2;
            }
        }

        @InterfaceC3999a
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010B\u001a\u00020\u0019H\u0016J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u000fHÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\t\u0010W\u001a\u00020 HÆ\u0003J\u0080\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001¢\u0006\u0002\u0010YJ\u0006\u0010Z\u001a\u00020\u0019J\u0013\u0010[\u001a\u00020\u000f2\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020\u0019HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001J\u0016\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0014\u0010\u001b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0014\u0010\u001c\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0014\u0010\u001d\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0014\u0010\u001e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006e"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "counterColor", "counterBackground", "counterIconPosition", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "iconTintColor", "counter", "counterIcon", "disclosureTintColor", "hideDisclosure", "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "maxLines", "", "context", "titleColor", "subtitleColor", "hideSeparator", "colorDisabledAsEnabled", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/app/android/atoms/data/cells/CellAtom$Align;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getCounterColor", "getCounterBackground", "getCounterIconPosition", "()Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "getIconTintColor", "getCounter", "getCounterIcon", "getDisclosureTintColor", "getHideDisclosure", "()Z", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContext", "getTitleColor", "getSubtitleColor", "getHideSeparator", "getColorDisabledAsEnabled", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLru/ozon/app/android/atoms/data/cells/CellAtom$Align;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CellWithSubtitle24IconCounter extends CellAtomWithSubtitle {

            @NotNull
            public static final Parcelable.Creator<CellWithSubtitle24IconCounter> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final Align align;
            private final boolean colorDisabledAsEnabled;
            private final String context;
            private final String counter;

            @NotNull
            private final String counterBackground;

            @NotNull
            private final String counterColor;
            private final String counterIcon;

            @NotNull
            private final Badge.IconPosition counterIconPosition;
            private final String disclosureTintColor;
            private final boolean hideDisclosure;
            private final boolean hideSeparator;

            @NotNull
            private final String icon;
            private final String iconTintColor;
            private final Integer maxLines;
            private final OzonSpannableString subtitle;

            @NotNull
            private final String subtitleColor;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString title;

            @NotNull
            private final String titleColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Creator implements Parcelable.Creator<CellWithSubtitle24IconCounter> {
                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconCounter createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    boolean z11;
                    Integer num;
                    boolean z12;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                    OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    Badge.IconPosition valueOf = Badge.IconPosition.valueOf(parcel.readString());
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    boolean z13 = parcel.readInt() != 0;
                    OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(CellWithSubtitle24IconCounter.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            int i12 = readInt;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            i11 = C2859b.a(CellWithSubtitle24IconCounter.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                            linkedHashMap = linkedHashMap2;
                            readInt = i12;
                        }
                    }
                    TestInfo testInfo = (TestInfo) parcel.readParcelable(CellWithSubtitle24IconCounter.class.getClassLoader());
                    Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z11 = true;
                        num = valueOf2;
                        z12 = true;
                    } else {
                        z11 = true;
                        num = valueOf2;
                        z12 = false;
                    }
                    if (parcel.readInt() == 0) {
                        z11 = false;
                    }
                    return new CellWithSubtitle24IconCounter(readString, create, readString2, readString3, valueOf, readString4, readString5, readString6, readString7, z13, create2, atomActionDTO, linkedHashMap3, testInfo, num, readString8, readString9, readString10, z12, z11, Align.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final CellWithSubtitle24IconCounter[] newArray(int i11) {
                    return new CellWithSubtitle24IconCounter[i11];
                }
            }

            public /* synthetic */ CellWithSubtitle24IconCounter(String str, OzonSpannableString ozonSpannableString, String str2, String str3, Badge.IconPosition iconPosition, String str4, String str5, String str6, String str7, boolean z11, OzonSpannableString ozonSpannableString2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, Integer num, String str8, String str9, String str10, boolean z12, boolean z13, Align align, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, ozonSpannableString, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue() : str2, (i11 & 8) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_PARANDJA.getValue() : str3, (i11 & 16) != 0 ? Badge.IconPosition.ICON_POSITION_LEFT : iconPosition, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6, (i11 & 256) != 0 ? DisclosureCell.INSTANCE.getDEFAULT_DISCLOSURE_TINT_COLOR() : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : ozonSpannableString2, (i11 & 2048) != 0 ? null : atomActionDTO, (i11 & 4096) != 0 ? null : map, (i11 & 8192) != 0 ? null : testInfo, (i11 & 16384) != 0 ? null : num, (32768 & i11) != 0 ? null : str8, (65536 & i11) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str9, (131072 & i11) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str10, (262144 & i11) != 0 ? false : z12, (524288 & i11) != 0 ? false : z13, (i11 & 1048576) != 0 ? Align.ALIGN_TYPE_TOP : align);
            }

            public static /* synthetic */ CellWithSubtitle24IconCounter copy$default(CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter, String str, OzonSpannableString ozonSpannableString, String str2, String str3, Badge.IconPosition iconPosition, String str4, String str5, String str6, String str7, boolean z11, OzonSpannableString ozonSpannableString2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, Integer num, String str8, String str9, String str10, boolean z12, boolean z13, Align align, int i11, Object obj) {
                Align align2;
                boolean z14;
                String str11 = (i11 & 1) != 0 ? cellWithSubtitle24IconCounter.icon : str;
                OzonSpannableString ozonSpannableString3 = (i11 & 2) != 0 ? cellWithSubtitle24IconCounter.title : ozonSpannableString;
                String str12 = (i11 & 4) != 0 ? cellWithSubtitle24IconCounter.counterColor : str2;
                String str13 = (i11 & 8) != 0 ? cellWithSubtitle24IconCounter.counterBackground : str3;
                Badge.IconPosition iconPosition2 = (i11 & 16) != 0 ? cellWithSubtitle24IconCounter.counterIconPosition : iconPosition;
                String str14 = (i11 & 32) != 0 ? cellWithSubtitle24IconCounter.iconTintColor : str4;
                String str15 = (i11 & 64) != 0 ? cellWithSubtitle24IconCounter.counter : str5;
                String str16 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitle24IconCounter.counterIcon : str6;
                String str17 = (i11 & 256) != 0 ? cellWithSubtitle24IconCounter.disclosureTintColor : str7;
                boolean z15 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitle24IconCounter.hideDisclosure : z11;
                OzonSpannableString ozonSpannableString4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitle24IconCounter.subtitle : ozonSpannableString2;
                AtomActionDTO atomActionDTO2 = (i11 & 2048) != 0 ? cellWithSubtitle24IconCounter.action : atomActionDTO;
                Map map2 = (i11 & 4096) != 0 ? cellWithSubtitle24IconCounter.trackingInfo : map;
                TestInfo testInfo2 = (i11 & 8192) != 0 ? cellWithSubtitle24IconCounter.testInfo : testInfo;
                String str18 = str11;
                Integer num2 = (i11 & 16384) != 0 ? cellWithSubtitle24IconCounter.maxLines : num;
                String str19 = (i11 & 32768) != 0 ? cellWithSubtitle24IconCounter.context : str8;
                String str20 = (i11 & 65536) != 0 ? cellWithSubtitle24IconCounter.titleColor : str9;
                String str21 = (i11 & 131072) != 0 ? cellWithSubtitle24IconCounter.subtitleColor : str10;
                boolean z16 = (i11 & 262144) != 0 ? cellWithSubtitle24IconCounter.hideSeparator : z12;
                boolean z17 = (i11 & 524288) != 0 ? cellWithSubtitle24IconCounter.colorDisabledAsEnabled : z13;
                if ((i11 & 1048576) != 0) {
                    z14 = z17;
                    align2 = cellWithSubtitle24IconCounter.align;
                } else {
                    align2 = align;
                    z14 = z17;
                }
                return cellWithSubtitle24IconCounter.copy(str18, ozonSpannableString3, str12, str13, iconPosition2, str14, str15, str16, str17, z15, ozonSpannableString4, atomActionDTO2, map2, testInfo2, num2, str19, str20, str21, z16, z14, align2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            /* renamed from: component11, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component12, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component13() {
                return this.trackingInfo;
            }

            /* renamed from: component14, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            /* renamed from: component15, reason: from getter */
            public final Integer getMaxLines() {
                return this.maxLines;
            }

            /* renamed from: component16, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            @NotNull
            /* renamed from: component17, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            @NotNull
            /* renamed from: component18, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            /* renamed from: component19, reason: from getter */
            public final boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            /* renamed from: component20, reason: from getter */
            public final boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @NotNull
            /* renamed from: component21, reason: from getter */
            public final Align getAlign() {
                return this.align;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getCounterColor() {
                return this.counterColor;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            /* renamed from: component6, reason: from getter */
            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            /* renamed from: component7, reason: from getter */
            public final String getCounter() {
                return this.counter;
            }

            /* renamed from: component8, reason: from getter */
            public final String getCounterIcon() {
                return this.counterIcon;
            }

            /* renamed from: component9, reason: from getter */
            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            @NotNull
            public final CellWithSubtitle24IconCounter copy(@NotNull String icon, @NotNull OzonSpannableString title, @NotNull String counterColor, @NotNull String counterBackground, @NotNull Badge.IconPosition counterIconPosition, String iconTintColor, String counter, String counterIcon, String disclosureTintColor, boolean hideDisclosure, OzonSpannableString subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Integer maxLines, String context, @NotNull String titleColor, @NotNull String subtitleColor, boolean hideSeparator, boolean colorDisabledAsEnabled, @NotNull Align align) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                return new CellWithSubtitle24IconCounter(icon, title, counterColor, counterBackground, counterIconPosition, iconTintColor, counter, counterIcon, disclosureTintColor, hideDisclosure, subtitle, action, trackingInfo, testInfo, maxLines, context, titleColor, subtitleColor, hideSeparator, colorDisabledAsEnabled, align);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitle24IconCounter)) {
                    return false;
                }
                CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter = (CellWithSubtitle24IconCounter) other;
                return Intrinsics.d(this.icon, cellWithSubtitle24IconCounter.icon) && Intrinsics.d(this.title, cellWithSubtitle24IconCounter.title) && Intrinsics.d(this.counterColor, cellWithSubtitle24IconCounter.counterColor) && Intrinsics.d(this.counterBackground, cellWithSubtitle24IconCounter.counterBackground) && this.counterIconPosition == cellWithSubtitle24IconCounter.counterIconPosition && Intrinsics.d(this.iconTintColor, cellWithSubtitle24IconCounter.iconTintColor) && Intrinsics.d(this.counter, cellWithSubtitle24IconCounter.counter) && Intrinsics.d(this.counterIcon, cellWithSubtitle24IconCounter.counterIcon) && Intrinsics.d(this.disclosureTintColor, cellWithSubtitle24IconCounter.disclosureTintColor) && this.hideDisclosure == cellWithSubtitle24IconCounter.hideDisclosure && Intrinsics.d(this.subtitle, cellWithSubtitle24IconCounter.subtitle) && Intrinsics.d(this.action, cellWithSubtitle24IconCounter.action) && Intrinsics.d(this.trackingInfo, cellWithSubtitle24IconCounter.trackingInfo) && Intrinsics.d(this.testInfo, cellWithSubtitle24IconCounter.testInfo) && Intrinsics.d(this.maxLines, cellWithSubtitle24IconCounter.maxLines) && Intrinsics.d(this.context, cellWithSubtitle24IconCounter.context) && Intrinsics.d(this.titleColor, cellWithSubtitle24IconCounter.titleColor) && Intrinsics.d(this.subtitleColor, cellWithSubtitle24IconCounter.subtitleColor) && this.hideSeparator == cellWithSubtitle24IconCounter.hideSeparator && this.colorDisabledAsEnabled == cellWithSubtitle24IconCounter.colorDisabledAsEnabled && this.align == cellWithSubtitle24IconCounter.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public Align getAlign() {
                return this.align;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getColorDisabledAsEnabled() {
                return this.colorDisabledAsEnabled;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final String getCounter() {
                return this.counter;
            }

            @NotNull
            public final String getCounterBackground() {
                return this.counterBackground;
            }

            @NotNull
            public final String getCounterColor() {
                return this.counterColor;
            }

            public final String getCounterIcon() {
                return this.counterIcon;
            }

            @NotNull
            public final Badge.IconPosition getCounterIconPosition() {
                return this.counterIconPosition;
            }

            public final String getDisclosureTintColor() {
                return this.disclosureTintColor;
            }

            public final boolean getHideDisclosure() {
                return this.hideDisclosure;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public boolean getHideSeparator() {
                return this.hideSeparator;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTintColor() {
                return this.iconTintColor;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_cell_with_subtitle24_icon_counter;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            public Integer getMaxLines() {
                return this.maxLines;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            public OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle
            @NotNull
            public String getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public OzonSpannableString getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom
            @NotNull
            public String getTitleColor() {
                return this.titleColor;
            }

            @Override // ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle, ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = (this.counterIconPosition.hashCode() + g.a(g.a(P.c(this.title, this.icon.hashCode() * 31, 31), 31, this.counterColor), 31, this.counterBackground)) * 31;
                String str = this.iconTintColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.counter;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.counterIcon;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.disclosureTintColor;
                int a11 = C3532b.a((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.hideDisclosure);
                OzonSpannableString ozonSpannableString = this.subtitle;
                int hashCode5 = (a11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Integer num = this.maxLines;
                int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.context;
                return this.align.hashCode() + C3532b.a(C3532b.a(g.a(g.a((hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.titleColor), 31, this.subtitleColor), 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                OzonSpannableString ozonSpannableString = this.title;
                String str2 = this.counterColor;
                String str3 = this.counterBackground;
                Badge.IconPosition iconPosition = this.counterIconPosition;
                String str4 = this.iconTintColor;
                String str5 = this.counter;
                String str6 = this.counterIcon;
                String str7 = this.disclosureTintColor;
                boolean z11 = this.hideDisclosure;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                Integer num = this.maxLines;
                String str8 = this.context;
                String str9 = this.titleColor;
                String str10 = this.subtitleColor;
                boolean z12 = this.hideSeparator;
                boolean z13 = this.colorDisabledAsEnabled;
                Align align = this.align;
                StringBuilder sb2 = new StringBuilder("CellWithSubtitle24IconCounter(icon=");
                sb2.append(str);
                sb2.append(", title=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", counterColor=");
                Nh.a.h(sb2, str2, ", counterBackground=", str3, ", counterIconPosition=");
                sb2.append(iconPosition);
                sb2.append(", iconTintColor=");
                sb2.append(str4);
                sb2.append(", counter=");
                Nh.a.h(sb2, str5, ", counterIcon=", str6, ", disclosureTintColor=");
                C2880a.c(str7, ", hideDisclosure=", ", subtitle=", sb2, z11);
                sb2.append((Object) ozonSpannableString2);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(", testInfo=");
                sb2.append(testInfo);
                sb2.append(", maxLines=");
                V.f(num, ", context=", str8, ", titleColor=", sb2);
                Nh.a.h(sb2, str9, ", subtitleColor=", str10, ", hideSeparator=");
                f.c(", colorDisabledAsEnabled=", ", align=", sb2, z12, z13);
                sb2.append(align);
                sb2.append(")");
                return sb2.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.icon);
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                ozonSpannableStringParceler.write(this.title, dest, flags);
                dest.writeString(this.counterColor);
                dest.writeString(this.counterBackground);
                dest.writeString(this.counterIconPosition.name());
                dest.writeString(this.iconTintColor);
                dest.writeString(this.counter);
                dest.writeString(this.counterIcon);
                dest.writeString(this.disclosureTintColor);
                dest.writeInt(this.hideDisclosure ? 1 : 0);
                ozonSpannableStringParceler.write(this.subtitle, dest, flags);
                dest.writeParcelable(this.action, flags);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                dest.writeParcelable(this.testInfo, flags);
                Integer num = this.maxLines;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeString(this.context);
                dest.writeString(this.titleColor);
                dest.writeString(this.subtitleColor);
                dest.writeInt(this.hideSeparator ? 1 : 0);
                dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
                dest.writeString(this.align.name());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitle24IconCounter(@NotNull String icon, @NotNull OzonSpannableString title, @NotNull String counterColor, @NotNull String counterBackground, @NotNull Badge.IconPosition counterIconPosition, String str, String str2, String str3, String str4, boolean z11, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Integer num, String str5, @NotNull String titleColor, @NotNull String subtitleColor, boolean z12, boolean z13, @NotNull Align align) {
                super(ozonSpannableString, subtitleColor, title, titleColor, align, num, atomActionDTO, z12, z13, Type.CELL_WITH_SUBTITLE_24ICON_COUNTER, str5, testInfo, map, null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(counterColor, "counterColor");
                Intrinsics.checkNotNullParameter(counterBackground, "counterBackground");
                Intrinsics.checkNotNullParameter(counterIconPosition, "counterIconPosition");
                Intrinsics.checkNotNullParameter(titleColor, "titleColor");
                Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
                Intrinsics.checkNotNullParameter(align, "align");
                this.icon = icon;
                this.title = title;
                this.counterColor = counterColor;
                this.counterBackground = counterBackground;
                this.counterIconPosition = counterIconPosition;
                this.iconTintColor = str;
                this.counter = str2;
                this.counterIcon = str3;
                this.disclosureTintColor = str4;
                this.hideDisclosure = z11;
                this.subtitle = ozonSpannableString;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
                this.maxLines = num;
                this.context = str5;
                this.titleColor = titleColor;
                this.subtitleColor = subtitleColor;
                this.hideSeparator = z12;
                this.colorDisabledAsEnabled = z13;
                this.align = align;
            }
        }
    }

    public /* synthetic */ CellAtom(OzonSpannableString ozonSpannableString, String str, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, Type type, String str2, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, str, align, num, atomActionDTO, z11, z12, type, str2, testInfo, map);
    }

    public AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public Align getAlign() {
        return this.align;
    }

    public boolean getColorDisabledAsEnabled() {
        return this.colorDisabledAsEnabled;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public boolean getHideSeparator() {
        return this.hideSeparator;
    }

    public Integer getMaxLines() {
        return this.maxLines;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public OzonSpannableString getTitle() {
        return this.title;
    }

    @NotNull
    public String getTitleColor() {
        return this.titleColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public /* synthetic */ CellAtom(OzonSpannableString ozonSpannableString, String str, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, Type type, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, str, align, num, atomActionDTO, z11, z12, type, str2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : map, null);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public Type getType() {
        return this.type;
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u00100\u001a\u00020\fH\u0016J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J¨\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020\fJ\u0013\u0010A\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\fHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006K"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "icon", "iconTintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getValue", "()Ljava/lang/String;", "getIcon", "getIconTintColor", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "()Z", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellRegular24IconPicker extends CellAtom {

        @NotNull
        public static final Parcelable.Creator<CellRegular24IconPicker> CREATOR = new Creator();
        private final AtomActionDTO action;

        @NotNull
        private final Align align;
        private final boolean colorDisabledAsEnabled;
        private final String context;
        private final boolean hideSeparator;

        @NotNull
        private final String icon;
        private final String iconTintColor;
        private final Integer maxLines;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;

        @NotNull
        private final String titleColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<CellRegular24IconPicker> {
            @Override // android.os.Parcelable.Creator
            public final CellRegular24IconPicker createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel2);
                String readString4 = parcel2.readString();
                Align valueOf = Align.valueOf(parcel2.readString());
                LinkedHashMap linkedHashMap = null;
                Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellRegular24IconPicker.class.getClassLoader());
                int i11 = 0;
                boolean z11 = parcel2.readInt() != 0;
                boolean z12 = parcel2.readInt() != 0;
                Integer num = valueOf2;
                String readString5 = parcel2.readString();
                TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellRegular24IconPicker.class.getClassLoader());
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    while (i11 != readInt) {
                        int i12 = readInt;
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        i11 = C2859b.a(CellRegular24IconPicker.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                        linkedHashMap2 = linkedHashMap3;
                        readInt = i12;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CellRegular24IconPicker(readString, readString2, readString3, create, readString4, valueOf, num, atomActionDTO, z11, z12, readString5, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CellRegular24IconPicker[] newArray(int i11) {
                return new CellRegular24IconPicker[i11];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ CellRegular24IconPicker(java.lang.String r17, java.lang.String r18, java.lang.String r19, ru.ozon.uni.atoms.utils.OzonSpannableString r20, java.lang.String r21, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r22, java.lang.Integer r23, ru.ozon.uni.atoms.data.AtomActionDTO r24, boolean r25, boolean r26, java.lang.String r27, ru.ozon.uni.atoms.data.TestInfo r28, java.util.Map r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 16
                if (r1 == 0) goto Le
                ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                java.lang.String r1 = r1.getValue()
                r7 = r1
                goto L10
            Le:
                r7 = r21
            L10:
                r1 = r0 & 32
                if (r1 == 0) goto L18
                ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                r8 = r1
                goto L1a
            L18:
                r8 = r22
            L1a:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L21
                r9 = r2
                goto L23
            L21:
                r9 = r23
            L23:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L29
                r10 = r2
                goto L2b
            L29:
                r10 = r24
            L2b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                r3 = 0
                if (r1 == 0) goto L32
                r11 = r3
                goto L34
            L32:
                r11 = r25
            L34:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L3a
                r12 = r3
                goto L3c
            L3a:
                r12 = r26
            L3c:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L42
                r13 = r2
                goto L44
            L42:
                r13 = r27
            L44:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L4a
                r14 = r2
                goto L4c
            L4a:
                r14 = r28
            L4c:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L5c
                r15 = r2
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r2 = r16
                goto L68
            L5c:
                r15 = r29
                r2 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
            L68:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellRegular24IconPicker.<init>(java.lang.String, java.lang.String, java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ CellRegular24IconPicker copy$default(CellRegular24IconPicker cellRegular24IconPicker, String str, String str2, String str3, OzonSpannableString ozonSpannableString, String str4, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, String str5, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cellRegular24IconPicker.value;
            }
            return cellRegular24IconPicker.copy(str, (i11 & 2) != 0 ? cellRegular24IconPicker.icon : str2, (i11 & 4) != 0 ? cellRegular24IconPicker.iconTintColor : str3, (i11 & 8) != 0 ? cellRegular24IconPicker.title : ozonSpannableString, (i11 & 16) != 0 ? cellRegular24IconPicker.titleColor : str4, (i11 & 32) != 0 ? cellRegular24IconPicker.align : align, (i11 & 64) != 0 ? cellRegular24IconPicker.maxLines : num, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellRegular24IconPicker.action : atomActionDTO, (i11 & 256) != 0 ? cellRegular24IconPicker.hideSeparator : z11, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellRegular24IconPicker.colorDisabledAsEnabled : z12, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellRegular24IconPicker.context : str5, (i11 & 2048) != 0 ? cellRegular24IconPicker.testInfo : testInfo, (i11 & 4096) != 0 ? cellRegular24IconPicker.trackingInfo : map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getColorDisabledAsEnabled() {
            return this.colorDisabledAsEnabled;
        }

        /* renamed from: component11, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component12, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component13() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final Align getAlign() {
            return this.align;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getHideSeparator() {
            return this.hideSeparator;
        }

        @NotNull
        public final CellRegular24IconPicker copy(@NotNull String value, @NotNull String icon, String iconTintColor, @NotNull OzonSpannableString title, @NotNull String titleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleColor, "titleColor");
            Intrinsics.checkNotNullParameter(align, "align");
            return new CellRegular24IconPicker(value, icon, iconTintColor, title, titleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellRegular24IconPicker)) {
                return false;
            }
            CellRegular24IconPicker cellRegular24IconPicker = (CellRegular24IconPicker) other;
            return Intrinsics.d(this.value, cellRegular24IconPicker.value) && Intrinsics.d(this.icon, cellRegular24IconPicker.icon) && Intrinsics.d(this.iconTintColor, cellRegular24IconPicker.iconTintColor) && Intrinsics.d(this.title, cellRegular24IconPicker.title) && Intrinsics.d(this.titleColor, cellRegular24IconPicker.titleColor) && this.align == cellRegular24IconPicker.align && Intrinsics.d(this.maxLines, cellRegular24IconPicker.maxLines) && Intrinsics.d(this.action, cellRegular24IconPicker.action) && this.hideSeparator == cellRegular24IconPicker.hideSeparator && this.colorDisabledAsEnabled == cellRegular24IconPicker.colorDisabledAsEnabled && Intrinsics.d(this.context, cellRegular24IconPicker.context) && Intrinsics.d(this.testInfo, cellRegular24IconPicker.testInfo) && Intrinsics.d(this.trackingInfo, cellRegular24IconPicker.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public Align getAlign() {
            return this.align;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public boolean getColorDisabledAsEnabled() {
            return this.colorDisabledAsEnabled;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public boolean getHideSeparator() {
            return this.hideSeparator;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_cell_regular24_icon_picker;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public Integer getMaxLines() {
            return this.maxLines;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public String getTitleColor() {
            return this.titleColor;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = g.a(this.value.hashCode() * 31, 31, this.icon);
            String str = this.iconTintColor;
            int b11 = Bi.b.b(this.align, g.a(P.c(this.title, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.titleColor), 31);
            Integer num = this.maxLines;
            int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int a12 = C3532b.a(C3532b.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
            String str2 = this.context;
            int hashCode2 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.icon;
            String str3 = this.iconTintColor;
            OzonSpannableString ozonSpannableString = this.title;
            String str4 = this.titleColor;
            Align align = this.align;
            Integer num = this.maxLines;
            AtomActionDTO atomActionDTO = this.action;
            boolean z11 = this.hideSeparator;
            boolean z12 = this.colorDisabledAsEnabled;
            String str5 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("CellRegular24IconPicker(value=", str, ", icon=", str2, ", iconTintColor=");
            B6.b.c(str3, ", title=", ", titleColor=", d11, ozonSpannableString);
            d11.append(str4);
            d11.append(", align=");
            d11.append(align);
            d11.append(", maxLines=");
            d11.append(num);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", hideSeparator=");
            f.c(", colorDisabledAsEnabled=", ", context=", d11, z11, z12);
            C4070a.b(d11, str5, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(d11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.icon);
            dest.writeString(this.iconTintColor);
            OzonSpannableStringParceler.INSTANCE.write(this.title, dest, flags);
            dest.writeString(this.titleColor);
            dest.writeString(this.align.name());
            Integer num = this.maxLines;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeParcelable(this.action, flags);
            dest.writeInt(this.hideSeparator ? 1 : 0);
            dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellRegular24IconPicker(@NotNull String value, @NotNull String icon, String str, @NotNull OzonSpannableString title, @NotNull String titleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(title, titleColor, align, num, atomActionDTO, z11, z12, Type.CELL_REGULAR_24ICON_PICKER, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleColor, "titleColor");
            Intrinsics.checkNotNullParameter(align, "align");
            this.value = value;
            this.icon = icon;
            this.iconTintColor = str;
            this.title = title;
            this.titleColor = titleColor;
            this.align = align;
            this.maxLines = num;
            this.action = atomActionDTO;
            this.hideSeparator = z11;
            this.colorDisabledAsEnabled = z12;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010,\u001a\u00020\nH\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0092\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\nJ\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\nHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006E"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegularPicker;", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "align", "Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "maxLines", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSeparator", "", "colorDisabledAsEnabled", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getValue", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "getAlign", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSeparator", "()Z", "getColorDisabledAsEnabled", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$Align;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegularPicker;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellRegularPicker extends CellAtom {

        @NotNull
        public static final Parcelable.Creator<CellRegularPicker> CREATOR = new Creator();
        private final AtomActionDTO action;

        @NotNull
        private final Align align;
        private final boolean colorDisabledAsEnabled;
        private final String context;
        private final boolean hideSeparator;
        private final Integer maxLines;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;

        @NotNull
        private final String titleColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<CellRegularPicker> {
            @Override // android.os.Parcelable.Creator
            public final CellRegularPicker createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String readString = parcel2.readString();
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel2);
                String readString2 = parcel2.readString();
                Align valueOf = Align.valueOf(parcel2.readString());
                LinkedHashMap linkedHashMap = null;
                Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(CellRegularPicker.class.getClassLoader());
                int i11 = 0;
                boolean z11 = parcel2.readInt() != 0;
                boolean z12 = parcel2.readInt() != 0;
                Integer num = valueOf2;
                String readString3 = parcel2.readString();
                TestInfo testInfo = (TestInfo) parcel2.readParcelable(CellRegularPicker.class.getClassLoader());
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    while (i11 != readInt) {
                        int i12 = readInt;
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        i11 = C2859b.a(CellRegularPicker.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                        linkedHashMap2 = linkedHashMap3;
                        readInt = i12;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CellRegularPicker(readString, create, readString2, valueOf, num, atomActionDTO, z11, z12, readString3, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final CellRegularPicker[] newArray(int i11) {
                return new CellRegularPicker[i11];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ CellRegularPicker(java.lang.String r15, ru.ozon.uni.atoms.utils.OzonSpannableString r16, java.lang.String r17, ru.ozon.app.android.atoms.data.cells.CellAtom.Align r18, java.lang.Integer r19, ru.ozon.uni.atoms.data.AtomActionDTO r20, boolean r21, boolean r22, java.lang.String r23, ru.ozon.uni.atoms.data.TestInfo r24, java.util.Map r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 4
                if (r1 == 0) goto Le
                ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
                java.lang.String r1 = r1.getValue()
                r5 = r1
                goto L10
            Le:
                r5 = r17
            L10:
                r1 = r0 & 8
                if (r1 == 0) goto L18
                ru.ozon.app.android.atoms.data.cells.CellAtom$Align r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.Align.ALIGN_TYPE_TOP
                r6 = r1
                goto L1a
            L18:
                r6 = r18
            L1a:
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L21
                r7 = r2
                goto L23
            L21:
                r7 = r19
            L23:
                r1 = r0 & 32
                if (r1 == 0) goto L29
                r8 = r2
                goto L2b
            L29:
                r8 = r20
            L2b:
                r1 = r0 & 64
                r3 = 0
                if (r1 == 0) goto L32
                r9 = r3
                goto L34
            L32:
                r9 = r21
            L34:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L3a
                r10 = r3
                goto L3c
            L3a:
                r10 = r22
            L3c:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L42
                r11 = r2
                goto L44
            L42:
                r11 = r23
            L44:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L4a
                r12 = r2
                goto L4c
            L4a:
                r12 = r24
            L4c:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L56
                r13 = r2
                r3 = r15
                r4 = r16
                r2 = r14
                goto L5c
            L56:
                r13 = r25
                r2 = r14
                r3 = r15
                r4 = r16
            L5c:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.cells.CellAtom.CellRegularPicker.<init>(java.lang.String, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.app.android.atoms.data.cells.CellAtom$Align, java.lang.Integer, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, boolean, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ CellRegularPicker copy$default(CellRegularPicker cellRegularPicker, String str, OzonSpannableString ozonSpannableString, String str2, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cellRegularPicker.value;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString = cellRegularPicker.title;
            }
            if ((i11 & 4) != 0) {
                str2 = cellRegularPicker.titleColor;
            }
            if ((i11 & 8) != 0) {
                align = cellRegularPicker.align;
            }
            if ((i11 & 16) != 0) {
                num = cellRegularPicker.maxLines;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = cellRegularPicker.action;
            }
            if ((i11 & 64) != 0) {
                z11 = cellRegularPicker.hideSeparator;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z12 = cellRegularPicker.colorDisabledAsEnabled;
            }
            if ((i11 & 256) != 0) {
                str3 = cellRegularPicker.context;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                testInfo = cellRegularPicker.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map = cellRegularPicker.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            boolean z13 = z12;
            String str4 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            boolean z14 = z11;
            Integer num2 = num;
            String str5 = str2;
            return cellRegularPicker.copy(str, ozonSpannableString, str5, align, num2, atomActionDTO2, z14, z13, str4, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component10, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Align getAlign() {
            return this.align;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getHideSeparator() {
            return this.hideSeparator;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getColorDisabledAsEnabled() {
            return this.colorDisabledAsEnabled;
        }

        /* renamed from: component9, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @NotNull
        public final CellRegularPicker copy(@NotNull String value, @NotNull OzonSpannableString title, @NotNull String titleColor, @NotNull Align align, Integer maxLines, AtomActionDTO action, boolean hideSeparator, boolean colorDisabledAsEnabled, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleColor, "titleColor");
            Intrinsics.checkNotNullParameter(align, "align");
            return new CellRegularPicker(value, title, titleColor, align, maxLines, action, hideSeparator, colorDisabledAsEnabled, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellRegularPicker)) {
                return false;
            }
            CellRegularPicker cellRegularPicker = (CellRegularPicker) other;
            return Intrinsics.d(this.value, cellRegularPicker.value) && Intrinsics.d(this.title, cellRegularPicker.title) && Intrinsics.d(this.titleColor, cellRegularPicker.titleColor) && this.align == cellRegularPicker.align && Intrinsics.d(this.maxLines, cellRegularPicker.maxLines) && Intrinsics.d(this.action, cellRegularPicker.action) && this.hideSeparator == cellRegularPicker.hideSeparator && this.colorDisabledAsEnabled == cellRegularPicker.colorDisabledAsEnabled && Intrinsics.d(this.context, cellRegularPicker.context) && Intrinsics.d(this.testInfo, cellRegularPicker.testInfo) && Intrinsics.d(this.trackingInfo, cellRegularPicker.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public Align getAlign() {
            return this.align;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public boolean getColorDisabledAsEnabled() {
            return this.colorDisabledAsEnabled;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public boolean getHideSeparator() {
            return this.hideSeparator;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_cell_regular_picker;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        public Integer getMaxLines() {
            return this.maxLines;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom
        @NotNull
        public String getTitleColor() {
            return this.titleColor;
        }

        @Override // ru.ozon.app.android.atoms.data.cells.CellAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int b11 = Bi.b.b(this.align, g.a(P.c(this.title, this.value.hashCode() * 31, 31), 31, this.titleColor), 31);
            Integer num = this.maxLines;
            int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int a11 = C3532b.a(C3532b.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.hideSeparator), 31, this.colorDisabledAsEnabled);
            String str = this.context;
            int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.value;
            OzonSpannableString ozonSpannableString = this.title;
            String str2 = this.titleColor;
            Align align = this.align;
            Integer num = this.maxLines;
            AtomActionDTO atomActionDTO = this.action;
            boolean z11 = this.hideSeparator;
            boolean z12 = this.colorDisabledAsEnabled;
            String str3 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CellRegularPicker(value=");
            sb2.append(str);
            sb2.append(", title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", titleColor=");
            sb2.append(str2);
            sb2.append(", align=");
            sb2.append(align);
            sb2.append(", maxLines=");
            sb2.append(num);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", hideSeparator=");
            f.c(", colorDisabledAsEnabled=", ", context=", sb2, z11, z12);
            C4070a.b(sb2, str3, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.value);
            OzonSpannableStringParceler.INSTANCE.write(this.title, dest, flags);
            dest.writeString(this.titleColor);
            dest.writeString(this.align.name());
            Integer num = this.maxLines;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeParcelable(this.action, flags);
            dest.writeInt(this.hideSeparator ? 1 : 0);
            dest.writeInt(this.colorDisabledAsEnabled ? 1 : 0);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellRegularPicker(@NotNull String value, @NotNull OzonSpannableString title, @NotNull String titleColor, @NotNull Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(title, titleColor, align, num, atomActionDTO, z11, z12, Type.CELL_REGULAR_PICKER, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleColor, "titleColor");
            Intrinsics.checkNotNullParameter(align, "align");
            this.value = value;
            this.title = title;
            this.titleColor = titleColor;
            this.align = align;
            this.maxLines = num;
            this.action = atomActionDTO;
            this.hideSeparator = z11;
            this.colorDisabledAsEnabled = z12;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    private CellAtom(OzonSpannableString ozonSpannableString, String str, Align align, Integer num, AtomActionDTO atomActionDTO, boolean z11, boolean z12, Type type, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(type, str2, map, testInfo);
        this.title = ozonSpannableString;
        this.titleColor = str;
        this.align = align;
        this.maxLines = num;
        this.action = atomActionDTO;
        this.hideSeparator = z11;
        this.colorDisabledAsEnabled = z12;
        this.type = type;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
