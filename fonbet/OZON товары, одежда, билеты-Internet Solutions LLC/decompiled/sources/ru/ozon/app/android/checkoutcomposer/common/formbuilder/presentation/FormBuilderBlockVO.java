package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import An.C2439a;
import B0.C2454a;
import B6.b;
import B90.C2616s;
import B90.C2618u;
import B90.C2619v;
import C.J;
import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Ql.c;
import T7.P;
import V.e;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.InputAtom;
import ru.ozon.app.android.atoms.data.deprecated.Checkbox;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "titleElements", "", "blockWeight", "blockGridSize", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "fields", "", "drawBottomSeparator", "<init>", "(Ljava/util/List;Ljava/lang/Integer;ILjava/util/List;Z)V", "copy", "(Ljava/util/List;Ljava/lang/Integer;ILjava/util/List;Z)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTitleElements", "()Ljava/util/List;", "Ljava/lang/Integer;", "getBlockWeight", "()Ljava/lang/Integer;", "I", "getBlockGridSize", "getFields", "Z", "getDrawBottomSeparator", "()Z", "Field", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FormBuilderBlockVO {
    private final int blockGridSize;
    private final Integer blockWeight;
    private final boolean drawBottomSeparator;

    @NotNull
    private final List<Field> fields;
    private final List<AtomDTO> titleElements;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", "<init>", "()V", "", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "getFieldSize", "()I", "fieldSize", "TextField", "AtomField", "SearchField", "YandexSearchField", "SelectorField", "CheckboxField", "ActionField", "ChipsField", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ActionField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$AtomField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$CheckboxField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$TextField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Field {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b$\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b%\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ActionField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "hint", "text", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "getHint", "getText", "getValue", "getError", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionField extends Field {
            private final AtomAction atomAction;
            private final String error;
            private final int fieldSize;

            @NotNull
            private final String hint;
            private final boolean isEnabled;

            @NotNull
            private final String name;

            @NotNull
            private final String text;

            @NotNull
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull String hint, @NotNull String text, @NotNull String value, String str, AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(value, "value");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.hint = hint;
                this.text = text;
                this.value = value;
                this.error = str;
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionField)) {
                    return false;
                }
                ActionField actionField = (ActionField) other;
                return Intrinsics.d(this.name, actionField.name) && this.viewType == actionField.viewType && this.fieldSize == actionField.fieldSize && this.isEnabled == actionField.isEnabled && Intrinsics.d(this.hint, actionField.hint) && Intrinsics.d(this.text, actionField.text) && Intrinsics.d(this.value, actionField.value) && Intrinsics.d(this.error, actionField.error) && Intrinsics.d(this.atomAction, actionField.atomAction);
            }

            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public final String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(g.a(g.a(C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled), 31, this.hint), 31, this.text), 31, this.value);
                String str = this.error;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.atomAction;
                return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
            }

            /* renamed from: isEnabled, reason: from getter */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                String str2 = this.hint;
                String str3 = this.text;
                String str4 = this.value;
                String str5 = this.error;
                AtomAction atomAction = this.atomAction;
                StringBuilder sb2 = new StringBuilder("ActionField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", hint=");
                a.h(sb2, str2, ", text=", str3, ", value=");
                a.h(sb2, str4, ", error=", str5, ", atomAction=");
                return b.b(sb2, atomAction, ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$AtomField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "elements", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AtomField extends Field {

            @NotNull
            private final List<AtomDTO> elements;
            private final int fieldSize;
            private final boolean isEnabled;

            @NotNull
            private final String name;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AtomField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull List<? extends AtomDTO> elements) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(elements, "elements");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.elements = elements;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AtomField)) {
                    return false;
                }
                AtomField atomField = (AtomField) other;
                return Intrinsics.d(this.name, atomField.name) && this.viewType == atomField.viewType && this.fieldSize == atomField.fieldSize && this.isEnabled == atomField.isEnabled && Intrinsics.d(this.elements, atomField.elements);
            }

            @NotNull
            public final List<AtomDTO> getElements() {
                return this.elements;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                return this.elements.hashCode() + C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                List<AtomDTO> list = this.elements;
                StringBuilder sb2 = new StringBuilder("AtomField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", elements=");
                return C2618u.h(sb2, list, ")");
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$CheckboxField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "Lru/ozon/app/android/atoms/data/deprecated/Checkbox;", "checkboxAtom", "error", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLru/ozon/app/android/atoms/data/deprecated/Checkbox;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "Lru/ozon/app/android/atoms/data/deprecated/Checkbox;", "getCheckboxAtom", "()Lru/ozon/app/android/atoms/data/deprecated/Checkbox;", "getError", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckboxField extends Field {

            @NotNull
            private final Checkbox checkboxAtom;
            private final String error;
            private final int fieldSize;
            private final boolean isEnabled;

            @NotNull
            private final String name;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckboxField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull Checkbox checkboxAtom, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(checkboxAtom, "checkboxAtom");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.checkboxAtom = checkboxAtom;
                this.error = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckboxField)) {
                    return false;
                }
                CheckboxField checkboxField = (CheckboxField) other;
                return Intrinsics.d(this.name, checkboxField.name) && this.viewType == checkboxField.viewType && this.fieldSize == checkboxField.fieldSize && this.isEnabled == checkboxField.isEnabled && Intrinsics.d(this.checkboxAtom, checkboxField.checkboxAtom) && Intrinsics.d(this.error, checkboxField.error);
            }

            @NotNull
            public final Checkbox getCheckboxAtom() {
                return this.checkboxAtom;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int hashCode = (this.checkboxAtom.hashCode() + C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled)) * 31;
                String str = this.error;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                Checkbox checkbox = this.checkboxAtom;
                String str2 = this.error;
                StringBuilder sb2 = new StringBuilder("CheckboxField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", checkboxAtom=");
                sb2.append(checkbox);
                sb2.append(", error=");
                sb2.append(str2);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b$\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "hint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "searchOptions", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "getHint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getValue", "getError", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "getSearchOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "SearchOptions", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SearchField extends Field {
            private final String error;
            private final int fieldSize;

            @NotNull
            private final String hint;
            private final boolean isEnabled;

            @NotNull
            private final String name;

            @NotNull
            private final SearchOptions searchOptions;

            @NotNull
            private final OzonSpannableString text;

            @NotNull
            private final String value;

            @NotNull
            private final ViewType viewType;

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "Landroid/os/Parcelable;", "", "link", "", "threshold", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "I", "getThreshold", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SearchOptions implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SearchOptions> CREATOR = new Creator();

                @NotNull
                private final String link;
                private final int threshold;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SearchOptions> {
                    @Override // android.os.Parcelable.Creator
                    public final SearchOptions createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SearchOptions(parcel.readString(), parcel.readInt());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SearchOptions[] newArray(int i11) {
                        return new SearchOptions[i11];
                    }
                }

                public SearchOptions(@NotNull String link, int i11) {
                    Intrinsics.checkNotNullParameter(link, "link");
                    this.link = link;
                    this.threshold = i11;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SearchOptions)) {
                        return false;
                    }
                    SearchOptions searchOptions = (SearchOptions) other;
                    return Intrinsics.d(this.link, searchOptions.link) && this.threshold == searchOptions.threshold;
                }

                @NotNull
                public final String getLink() {
                    return this.link;
                }

                public final int getThreshold() {
                    return this.threshold;
                }

                public int hashCode() {
                    return Integer.hashCode(this.threshold) + (this.link.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return C2618u.f(this.threshold, "SearchOptions(link=", this.link, ", threshold=", ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.link);
                    dest.writeInt(this.threshold);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SearchField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull String hint, @NotNull OzonSpannableString text, @NotNull String value, String str, @NotNull SearchOptions searchOptions) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.hint = hint;
                this.text = text;
                this.value = value;
                this.error = str;
                this.searchOptions = searchOptions;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchField)) {
                    return false;
                }
                SearchField searchField = (SearchField) other;
                return Intrinsics.d(this.name, searchField.name) && this.viewType == searchField.viewType && this.fieldSize == searchField.fieldSize && this.isEnabled == searchField.isEnabled && Intrinsics.d(this.hint, searchField.hint) && Intrinsics.d(this.text, searchField.text) && Intrinsics.d(this.value, searchField.value) && Intrinsics.d(this.error, searchField.error) && Intrinsics.d(this.searchOptions, searchField.searchOptions);
            }

            public final String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final SearchOptions getSearchOptions() {
                return this.searchOptions;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(P.c(this.text, g.a(C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled), 31, this.hint), 31), 31, this.value);
                String str = this.error;
                return this.searchOptions.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
            }

            /* renamed from: isEnabled, reason: from getter */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                String str2 = this.hint;
                OzonSpannableString ozonSpannableString = this.text;
                String str3 = this.value;
                String str4 = this.error;
                SearchOptions searchOptions = this.searchOptions;
                StringBuilder sb2 = new StringBuilder("SearchField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", hint=");
                b.c(str2, ", text=", ", value=", sb2, ozonSpannableString);
                a.h(sb2, str3, ", error=", str4, ", searchOptions=");
                sb2.append(searchOptions);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0001/BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jn\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b\t\u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b&\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b*\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "hint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "selectOptions", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "getHint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getValue", "getError", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "getSelectOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "SelectOptions", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectorField extends Field {
            private final String error;
            private final int fieldSize;

            @NotNull
            private final String hint;
            private final boolean isEnabled;

            @NotNull
            private final String name;
            private final SelectOptions selectOptions;

            @NotNull
            private final OzonSpannableString text;

            @NotNull
            private final String value;

            @NotNull
            private final ViewType viewType;

            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "options", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Option", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SelectOptions implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SelectOptions> CREATOR = new Creator();

                @NotNull
                private final List<Option> options;

                @NotNull
                private final String title;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SelectOptions> {
                    @Override // android.os.Parcelable.Creator
                    public final SelectOptions createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        ArrayList arrayList = new ArrayList(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = Ak.b.b(Option.CREATOR, parcel, arrayList, i11, 1);
                        }
                        return new SelectOptions(readString, arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SelectOptions[] newArray(int i11) {
                        return new SelectOptions[i11];
                    }
                }

                @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "Landroid/os/Parcelable;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "deepLink", "subText", "subTextColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDeepLink", "getSubText", "getSubTextColor", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Option implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<Option> CREATOR = new Creator();
                    private final String deepLink;
                    private final String subText;
                    private final String subTextColor;

                    @NotNull
                    private final OzonSpannableString text;

                    @NotNull
                    private final String value;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Option> {
                        @Override // android.os.Parcelable.Creator
                        public final Option createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Option(parcel.readString(), (OzonSpannableString) parcel.readValue(Option.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Option[] newArray(int i11) {
                            return new Option[i11];
                        }
                    }

                    public Option(@NotNull String value, @NotNull OzonSpannableString text, String str, String str2, String str3) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        Intrinsics.checkNotNullParameter(text, "text");
                        this.value = value;
                        this.text = text;
                        this.deepLink = str;
                        this.subText = str2;
                        this.subTextColor = str3;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) other;
                        return Intrinsics.d(this.value, option.value) && Intrinsics.d(this.text, option.text) && Intrinsics.d(this.deepLink, option.deepLink) && Intrinsics.d(this.subText, option.subText) && Intrinsics.d(this.subTextColor, option.subTextColor);
                    }

                    public final String getDeepLink() {
                        return this.deepLink;
                    }

                    public final String getSubText() {
                        return this.subText;
                    }

                    public final String getSubTextColor() {
                        return this.subTextColor;
                    }

                    @NotNull
                    public final OzonSpannableString getText() {
                        return this.text;
                    }

                    @NotNull
                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        int c11 = P.c(this.text, this.value.hashCode() * 31, 31);
                        String str = this.deepLink;
                        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.subText;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.subTextColor;
                        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        String str = this.value;
                        OzonSpannableString ozonSpannableString = this.text;
                        String str2 = this.deepLink;
                        String str3 = this.subText;
                        String str4 = this.subTextColor;
                        StringBuilder sb2 = new StringBuilder("Option(value=");
                        sb2.append(str);
                        sb2.append(", text=");
                        sb2.append((Object) ozonSpannableString);
                        sb2.append(", deepLink=");
                        a.h(sb2, str2, ", subText=", str3, ", subTextColor=");
                        return o0.c(sb2, str4, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.value);
                        dest.writeValue(this.text);
                        dest.writeString(this.deepLink);
                        dest.writeString(this.subText);
                        dest.writeString(this.subTextColor);
                    }
                }

                public SelectOptions(@NotNull String title, @NotNull List<Option> options) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(options, "options");
                    this.title = title;
                    this.options = options;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SelectOptions)) {
                        return false;
                    }
                    SelectOptions selectOptions = (SelectOptions) other;
                    return Intrinsics.d(this.title, selectOptions.title) && Intrinsics.d(this.options, selectOptions.options);
                }

                @NotNull
                public final List<Option> getOptions() {
                    return this.options;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.options.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return C2439a.a("SelectOptions(title=", this.title, ", options=", ")", this.options);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.title);
                    Iterator c11 = Bi.a.c(this.options, dest);
                    while (c11.hasNext()) {
                        ((Option) c11.next()).writeToParcel(dest, flags);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectorField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull String hint, @NotNull OzonSpannableString text, @NotNull String value, String str, SelectOptions selectOptions) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(value, "value");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.hint = hint;
                this.text = text;
                this.value = value;
                this.error = str;
                this.selectOptions = selectOptions;
            }

            public static /* synthetic */ SelectorField copy$default(SelectorField selectorField, String str, ViewType viewType, int i11, boolean z11, String str2, OzonSpannableString ozonSpannableString, String str3, String str4, SelectOptions selectOptions, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = selectorField.name;
                }
                if ((i12 & 2) != 0) {
                    viewType = selectorField.viewType;
                }
                if ((i12 & 4) != 0) {
                    i11 = selectorField.fieldSize;
                }
                if ((i12 & 8) != 0) {
                    z11 = selectorField.isEnabled;
                }
                if ((i12 & 16) != 0) {
                    str2 = selectorField.hint;
                }
                if ((i12 & 32) != 0) {
                    ozonSpannableString = selectorField.text;
                }
                if ((i12 & 64) != 0) {
                    str3 = selectorField.value;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str4 = selectorField.error;
                }
                if ((i12 & 256) != 0) {
                    selectOptions = selectorField.selectOptions;
                }
                String str5 = str4;
                SelectOptions selectOptions2 = selectOptions;
                OzonSpannableString ozonSpannableString2 = ozonSpannableString;
                String str6 = str3;
                String str7 = str2;
                int i13 = i11;
                return selectorField.copy(str, viewType, i13, z11, str7, ozonSpannableString2, str6, str5, selectOptions2);
            }

            @NotNull
            public final SelectorField copy(@NotNull String name, @NotNull ViewType viewType, int fieldSize, boolean isEnabled, @NotNull String hint, @NotNull OzonSpannableString text, @NotNull String value, String error, SelectOptions selectOptions) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(value, "value");
                return new SelectorField(name, viewType, fieldSize, isEnabled, hint, text, value, error, selectOptions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectorField)) {
                    return false;
                }
                SelectorField selectorField = (SelectorField) other;
                return Intrinsics.d(this.name, selectorField.name) && this.viewType == selectorField.viewType && this.fieldSize == selectorField.fieldSize && this.isEnabled == selectorField.isEnabled && Intrinsics.d(this.hint, selectorField.hint) && Intrinsics.d(this.text, selectorField.text) && Intrinsics.d(this.value, selectorField.value) && Intrinsics.d(this.error, selectorField.error) && Intrinsics.d(this.selectOptions, selectorField.selectOptions);
            }

            public final String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            public final SelectOptions getSelectOptions() {
                return this.selectOptions;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(P.c(this.text, g.a(C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled), 31, this.hint), 31), 31, this.value);
                String str = this.error;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                SelectOptions selectOptions = this.selectOptions;
                return hashCode + (selectOptions != null ? selectOptions.hashCode() : 0);
            }

            /* renamed from: isEnabled, reason: from getter */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                String str2 = this.hint;
                OzonSpannableString ozonSpannableString = this.text;
                String str3 = this.value;
                String str4 = this.error;
                SelectOptions selectOptions = this.selectOptions;
                StringBuilder sb2 = new StringBuilder("SelectorField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", hint=");
                b.c(str2, ", text=", ", value=", sb2, ozonSpannableString);
                a.h(sb2, str3, ", error=", str4, ", selectOptions=");
                sb2.append(selectOptions);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jb\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b%\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$TextField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "hint", "text", "error", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "inputType", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$TextField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "getHint", "getText", "getError", "Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "getInputType", "()Lru/ozon/app/android/atoms/atom2/InputAtom$Configuration$InputType;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextField extends Field {
            private final String error;
            private final int fieldSize;

            @NotNull
            private final String hint;

            @NotNull
            private final InputAtom.Configuration.InputType inputType;
            private final boolean isEnabled;

            @NotNull
            private final String name;

            @NotNull
            private final String text;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull String hint, @NotNull String text, String str, @NotNull InputAtom.Configuration.InputType inputType) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(inputType, "inputType");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.hint = hint;
                this.text = text;
                this.error = str;
                this.inputType = inputType;
            }

            public static /* synthetic */ TextField copy$default(TextField textField, String str, ViewType viewType, int i11, boolean z11, String str2, String str3, String str4, InputAtom.Configuration.InputType inputType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = textField.name;
                }
                if ((i12 & 2) != 0) {
                    viewType = textField.viewType;
                }
                if ((i12 & 4) != 0) {
                    i11 = textField.fieldSize;
                }
                if ((i12 & 8) != 0) {
                    z11 = textField.isEnabled;
                }
                if ((i12 & 16) != 0) {
                    str2 = textField.hint;
                }
                if ((i12 & 32) != 0) {
                    str3 = textField.text;
                }
                if ((i12 & 64) != 0) {
                    str4 = textField.error;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    inputType = textField.inputType;
                }
                String str5 = str4;
                InputAtom.Configuration.InputType inputType2 = inputType;
                String str6 = str2;
                String str7 = str3;
                return textField.copy(str, viewType, i11, z11, str6, str7, str5, inputType2);
            }

            @NotNull
            public final TextField copy(@NotNull String name, @NotNull ViewType viewType, int fieldSize, boolean isEnabled, @NotNull String hint, @NotNull String text, String error, @NotNull InputAtom.Configuration.InputType inputType) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(inputType, "inputType");
                return new TextField(name, viewType, fieldSize, isEnabled, hint, text, error, inputType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextField)) {
                    return false;
                }
                TextField textField = (TextField) other;
                return Intrinsics.d(this.name, textField.name) && this.viewType == textField.viewType && this.fieldSize == textField.fieldSize && this.isEnabled == textField.isEnabled && Intrinsics.d(this.hint, textField.hint) && Intrinsics.d(this.text, textField.text) && Intrinsics.d(this.error, textField.error) && this.inputType == textField.inputType;
            }

            public final String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @NotNull
            public final InputAtom.Configuration.InputType getInputType() {
                return this.inputType;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(g.a(C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled), 31, this.hint), 31, this.text);
                String str = this.error;
                return this.inputType.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
            }

            /* renamed from: isEnabled, reason: from getter */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                String str2 = this.hint;
                String str3 = this.text;
                String str4 = this.error;
                InputAtom.Configuration.InputType inputType = this.inputType;
                StringBuilder sb2 = new StringBuilder("TextField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", hint=");
                a.h(sb2, str2, ", text=", str3, ", error=");
                sb2.append(str4);
                sb2.append(", inputType=");
                sb2.append(inputType);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public /* synthetic */ Field(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getFieldSize();

        @NotNull
        public abstract String getName();

        @NotNull
        public abstract ViewType getViewType();

        private Field() {
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001)B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "chipsWithField", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "getChipsWithField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "ChipsWithField", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChipsField extends Field {
            private final ChipsWithField chipsWithField;
            private final int fieldSize;
            private final boolean isEnabled;

            @NotNull
            private final String name;
            private final OnBoardingDTO onboarding;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChipsField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, ChipsWithField chipsWithField, OnBoardingDTO onBoardingDTO) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.chipsWithField = chipsWithField;
                this.onboarding = onBoardingDTO;
            }

            public static /* synthetic */ ChipsField copy$default(ChipsField chipsField, String str, ViewType viewType, int i11, boolean z11, ChipsWithField chipsWithField, OnBoardingDTO onBoardingDTO, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = chipsField.name;
                }
                if ((i12 & 2) != 0) {
                    viewType = chipsField.viewType;
                }
                if ((i12 & 4) != 0) {
                    i11 = chipsField.fieldSize;
                }
                if ((i12 & 8) != 0) {
                    z11 = chipsField.isEnabled;
                }
                if ((i12 & 16) != 0) {
                    chipsWithField = chipsField.chipsWithField;
                }
                if ((i12 & 32) != 0) {
                    onBoardingDTO = chipsField.onboarding;
                }
                ChipsWithField chipsWithField2 = chipsWithField;
                OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
                return chipsField.copy(str, viewType, i11, z11, chipsWithField2, onBoardingDTO2);
            }

            @NotNull
            public final ChipsField copy(@NotNull String name, @NotNull ViewType viewType, int fieldSize, boolean isEnabled, ChipsWithField chipsWithField, OnBoardingDTO onboarding) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                return new ChipsField(name, viewType, fieldSize, isEnabled, chipsWithField, onboarding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChipsField)) {
                    return false;
                }
                ChipsField chipsField = (ChipsField) other;
                return Intrinsics.d(this.name, chipsField.name) && this.viewType == chipsField.viewType && this.fieldSize == chipsField.fieldSize && this.isEnabled == chipsField.isEnabled && Intrinsics.d(this.chipsWithField, chipsField.chipsWithField) && Intrinsics.d(this.onboarding, chipsField.onboarding);
            }

            public final ChipsWithField getChipsWithField() {
                return this.chipsWithField;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled);
                ChipsWithField chipsWithField = this.chipsWithField;
                int hashCode = (a11 + (chipsWithField == null ? 0 : chipsWithField.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return hashCode + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                ChipsWithField chipsWithField = this.chipsWithField;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                StringBuilder sb2 = new StringBuilder("ChipsField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", chipsWithField=");
                sb2.append(chipsWithField);
                sb2.append(", onboarding=");
                sb2.append(onBoardingDTO);
                sb2.append(")");
                return sb2.toString();
            }

            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002'(B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "Landroid/os/Parcelable;", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$ChipItemMobile;", "chipsMobile", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;", "textField", "", "canShowKeyboard", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;Z)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChipsMobile", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;", "getTextField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;", "Z", "getCanShowKeyboard", "()Z", "ChipItemMobile", "TextField", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ChipsWithField implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<ChipsWithField> CREATOR = new Creator();
                private final boolean canShowKeyboard;
                private final List<ChipItemMobile> chipsMobile;
                private final TextField textField;

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$ChipItemMobile;", "Landroid/os/Parcelable;", "", "hasTextField", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "<init>", "(ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$ChipItemMobile;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasTextField", "()Z", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class ChipItemMobile implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<ChipItemMobile> CREATOR = new Creator();
                    private final boolean hasTextField;

                    @NotNull
                    private final TagButtonDTO tagButton;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<ChipItemMobile> {
                        @Override // android.os.Parcelable.Creator
                        public final ChipItemMobile createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ChipItemMobile(parcel.readInt() != 0, (TagButtonDTO) parcel.readParcelable(ChipItemMobile.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final ChipItemMobile[] newArray(int i11) {
                            return new ChipItemMobile[i11];
                        }
                    }

                    public ChipItemMobile(boolean z11, @NotNull TagButtonDTO tagButton) {
                        Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                        this.hasTextField = z11;
                        this.tagButton = tagButton;
                    }

                    public static /* synthetic */ ChipItemMobile copy$default(ChipItemMobile chipItemMobile, boolean z11, TagButtonDTO tagButtonDTO, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            z11 = chipItemMobile.hasTextField;
                        }
                        if ((i11 & 2) != 0) {
                            tagButtonDTO = chipItemMobile.tagButton;
                        }
                        return chipItemMobile.copy(z11, tagButtonDTO);
                    }

                    @NotNull
                    public final ChipItemMobile copy(boolean hasTextField, @NotNull TagButtonDTO tagButton) {
                        Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                        return new ChipItemMobile(hasTextField, tagButton);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ChipItemMobile)) {
                            return false;
                        }
                        ChipItemMobile chipItemMobile = (ChipItemMobile) other;
                        return this.hasTextField == chipItemMobile.hasTextField && Intrinsics.d(this.tagButton, chipItemMobile.tagButton);
                    }

                    public final boolean getHasTextField() {
                        return this.hasTextField;
                    }

                    @NotNull
                    public final TagButtonDTO getTagButton() {
                        return this.tagButton;
                    }

                    public int hashCode() {
                        return this.tagButton.hashCode() + (Boolean.hashCode(this.hasTextField) * 31);
                    }

                    @NotNull
                    public String toString() {
                        return "ChipItemMobile(hasTextField=" + this.hasTextField + ", tagButton=" + this.tagButton + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeInt(this.hasTextField ? 1 : 0);
                        dest.writeParcelable(this.tagButton, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ChipsWithField> {
                    @Override // android.os.Parcelable.Creator
                    public final ChipsWithField createFromParcel(Parcel parcel) {
                        ArrayList arrayList;
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int readInt = parcel.readInt();
                            arrayList = new ArrayList(readInt);
                            int i11 = 0;
                            while (i11 != readInt) {
                                i11 = Ak.b.b(ChipItemMobile.CREATOR, parcel, arrayList, i11, 1);
                            }
                        }
                        return new ChipsWithField(arrayList, parcel.readInt() != 0 ? TextField.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ChipsWithField[] newArray(int i11) {
                        return new ChipsWithField[i11];
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;", "Landroid/os/Parcelable;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$TextField;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getPlaceholder", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class TextField implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<TextField> CREATOR = new Creator();
                    private final String placeholder;
                    private final String value;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<TextField> {
                        @Override // android.os.Parcelable.Creator
                        public final TextField createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new TextField(parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final TextField[] newArray(int i11) {
                            return new TextField[i11];
                        }
                    }

                    public TextField(String str, String str2) {
                        this.value = str;
                        this.placeholder = str2;
                    }

                    public static /* synthetic */ TextField copy$default(TextField textField, String str, String str2, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = textField.value;
                        }
                        if ((i11 & 2) != 0) {
                            str2 = textField.placeholder;
                        }
                        return textField.copy(str, str2);
                    }

                    @NotNull
                    public final TextField copy(String value, String placeholder) {
                        return new TextField(value, placeholder);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof TextField)) {
                            return false;
                        }
                        TextField textField = (TextField) other;
                        return Intrinsics.d(this.value, textField.value) && Intrinsics.d(this.placeholder, textField.placeholder);
                    }

                    public final String getPlaceholder() {
                        return this.placeholder;
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        String str = this.value;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.placeholder;
                        return hashCode + (str2 != null ? str2.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return e.a("TextField(value=", this.value, ", placeholder=", this.placeholder, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.value);
                        dest.writeString(this.placeholder);
                    }
                }

                public ChipsWithField(List<ChipItemMobile> list, TextField textField, boolean z11) {
                    this.chipsMobile = list;
                    this.textField = textField;
                    this.canShowKeyboard = z11;
                }

                @NotNull
                public final ChipsWithField copy(List<ChipItemMobile> chipsMobile, TextField textField, boolean canShowKeyboard) {
                    return new ChipsWithField(chipsMobile, textField, canShowKeyboard);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ChipsWithField)) {
                        return false;
                    }
                    ChipsWithField chipsWithField = (ChipsWithField) other;
                    return Intrinsics.d(this.chipsMobile, chipsWithField.chipsMobile) && Intrinsics.d(this.textField, chipsWithField.textField) && this.canShowKeyboard == chipsWithField.canShowKeyboard;
                }

                public final boolean getCanShowKeyboard() {
                    return this.canShowKeyboard;
                }

                public final List<ChipItemMobile> getChipsMobile() {
                    return this.chipsMobile;
                }

                public final TextField getTextField() {
                    return this.textField;
                }

                public int hashCode() {
                    List<ChipItemMobile> list = this.chipsMobile;
                    int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                    TextField textField = this.textField;
                    return Boolean.hashCode(this.canShowKeyboard) + ((hashCode + (textField != null ? textField.hashCode() : 0)) * 31);
                }

                @NotNull
                public String toString() {
                    List<ChipItemMobile> list = this.chipsMobile;
                    TextField textField = this.textField;
                    boolean z11 = this.canShowKeyboard;
                    StringBuilder sb2 = new StringBuilder("ChipsWithField(chipsMobile=");
                    sb2.append(list);
                    sb2.append(", textField=");
                    sb2.append(textField);
                    sb2.append(", canShowKeyboard=");
                    return Pk0.a.a(")", sb2, z11);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    List<ChipItemMobile> list = this.chipsMobile;
                    if (list == null) {
                        dest.writeInt(0);
                    } else {
                        Iterator c11 = J.c(dest, 1, list);
                        while (c11.hasNext()) {
                            ((ChipItemMobile) c11.next()).writeToParcel(dest, flags);
                        }
                    }
                    TextField textField = this.textField;
                    if (textField == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        textField.writeToParcel(dest, flags);
                    }
                    dest.writeInt(this.canShowKeyboard ? 1 : 0);
                }

                public /* synthetic */ ChipsWithField(List list, TextField textField, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(list, textField, (i11 & 4) != 0 ? false : z11);
                }
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u00015Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J~\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010(R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b)\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b-\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "viewType", "", "fieldSize", "", "isEnabled", "hint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "searchOptions", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;LWZ/t;)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;IZLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;LWZ/t;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "getViewType", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "I", "getFieldSize", "Z", "()Z", "getHint", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getValue", "getError", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "getSearchOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "SearchOptions", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class YandexSearchField extends Field {
            private final String error;
            private final int fieldSize;

            @NotNull
            private final String hint;
            private final boolean isEnabled;

            @NotNull
            private final String name;

            @NotNull
            private final SearchOptions searchOptions;

            @NotNull
            private final OzonSpannableString text;
            private final t tokenizedEvent;

            @NotNull
            private final String value;

            @NotNull
            private final ViewType viewType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public YandexSearchField(@NotNull String name, @NotNull ViewType viewType, int i11, boolean z11, @NotNull String hint, @NotNull OzonSpannableString text, @NotNull String value, String str, @NotNull SearchOptions searchOptions, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
                this.name = name;
                this.viewType = viewType;
                this.fieldSize = i11;
                this.isEnabled = z11;
                this.hint = hint;
                this.text = text;
                this.value = value;
                this.error = str;
                this.searchOptions = searchOptions;
                this.tokenizedEvent = tVar;
            }

            public static /* synthetic */ YandexSearchField copy$default(YandexSearchField yandexSearchField, String str, ViewType viewType, int i11, boolean z11, String str2, OzonSpannableString ozonSpannableString, String str3, String str4, SearchOptions searchOptions, t tVar, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = yandexSearchField.name;
                }
                if ((i12 & 2) != 0) {
                    viewType = yandexSearchField.viewType;
                }
                if ((i12 & 4) != 0) {
                    i11 = yandexSearchField.fieldSize;
                }
                if ((i12 & 8) != 0) {
                    z11 = yandexSearchField.isEnabled;
                }
                if ((i12 & 16) != 0) {
                    str2 = yandexSearchField.hint;
                }
                if ((i12 & 32) != 0) {
                    ozonSpannableString = yandexSearchField.text;
                }
                if ((i12 & 64) != 0) {
                    str3 = yandexSearchField.value;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str4 = yandexSearchField.error;
                }
                if ((i12 & 256) != 0) {
                    searchOptions = yandexSearchField.searchOptions;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    tVar = yandexSearchField.tokenizedEvent;
                }
                SearchOptions searchOptions2 = searchOptions;
                t tVar2 = tVar;
                String str5 = str3;
                String str6 = str4;
                String str7 = str2;
                OzonSpannableString ozonSpannableString2 = ozonSpannableString;
                return yandexSearchField.copy(str, viewType, i11, z11, str7, ozonSpannableString2, str5, str6, searchOptions2, tVar2);
            }

            @NotNull
            public final YandexSearchField copy(@NotNull String name, @NotNull ViewType viewType, int fieldSize, boolean isEnabled, @NotNull String hint, @NotNull OzonSpannableString text, @NotNull String value, String error, @NotNull SearchOptions searchOptions, t tokenizedEvent) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(viewType, "viewType");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
                return new YandexSearchField(name, viewType, fieldSize, isEnabled, hint, text, value, error, searchOptions, tokenizedEvent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof YandexSearchField)) {
                    return false;
                }
                YandexSearchField yandexSearchField = (YandexSearchField) other;
                return Intrinsics.d(this.name, yandexSearchField.name) && this.viewType == yandexSearchField.viewType && this.fieldSize == yandexSearchField.fieldSize && this.isEnabled == yandexSearchField.isEnabled && Intrinsics.d(this.hint, yandexSearchField.hint) && Intrinsics.d(this.text, yandexSearchField.text) && Intrinsics.d(this.value, yandexSearchField.value) && Intrinsics.d(this.error, yandexSearchField.error) && Intrinsics.d(this.searchOptions, yandexSearchField.searchOptions) && Intrinsics.d(this.tokenizedEvent, yandexSearchField.tokenizedEvent);
            }

            public final String getError() {
                return this.error;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            public int getFieldSize() {
                return this.fieldSize;
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final SearchOptions getSearchOptions() {
                return this.searchOptions;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO.Field
            @NotNull
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                int a11 = g.a(P.c(this.text, g.a(C3532b.a(C2454a.a(this.fieldSize, (this.viewType.hashCode() + (this.name.hashCode() * 31)) * 31, 31), 31, this.isEnabled), 31, this.hint), 31), 31, this.value);
                String str = this.error;
                int hashCode = (this.searchOptions.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode + (tVar != null ? tVar.hashCode() : 0);
            }

            /* renamed from: isEnabled, reason: from getter */
            public boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                ViewType viewType = this.viewType;
                int i11 = this.fieldSize;
                boolean z11 = this.isEnabled;
                String str2 = this.hint;
                OzonSpannableString ozonSpannableString = this.text;
                String str3 = this.value;
                String str4 = this.error;
                SearchOptions searchOptions = this.searchOptions;
                t tVar = this.tokenizedEvent;
                StringBuilder sb2 = new StringBuilder("YandexSearchField(name=");
                sb2.append(str);
                sb2.append(", viewType=");
                sb2.append(viewType);
                sb2.append(", fieldSize=");
                c.d(sb2, i11, ", isEnabled=", z11, ", hint=");
                b.c(str2, ", text=", ", value=", sb2, ozonSpannableString);
                a.h(sb2, str3, ", error=", str4, ", searchOptions=");
                sb2.append(searchOptions);
                sb2.append(", tokenizedEvent=");
                sb2.append(tVar);
                sb2.append(")");
                return sb2.toString();
            }

            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b,\u0010*¨\u0006."}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "Landroid/os/Parcelable;", "", "link", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "threshold", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "boundingBox", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "emptyState", "unavailableAddressState", "initialElements", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getTitle", "I", "getThreshold", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "getBoundingBox", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "Ljava/util/List;", "getEmptyState", "()Ljava/util/List;", "getUnavailableAddressState", "getInitialElements", "BoundingBox", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SearchOptions implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SearchOptions> CREATOR = new Creator();
                private final BoundingBox boundingBox;

                @NotNull
                private final List<AtomDTO> emptyState;

                @NotNull
                private final List<AtomDTO> initialElements;

                @NotNull
                private final String link;
                private final int threshold;
                private final String title;

                @NotNull
                private final List<AtomDTO> unavailableAddressState;

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;", "northeast", "southwest", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;", "getNortheast", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;", "getSouthwest", "GeoCoordinate", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class BoundingBox implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<BoundingBox> CREATOR = new Creator();

                    @NotNull
                    private final GeoCoordinate northeast;

                    @NotNull
                    private final GeoCoordinate southwest;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<BoundingBox> {
                        @Override // android.os.Parcelable.Creator
                        public final BoundingBox createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            Parcelable.Creator<GeoCoordinate> creator = GeoCoordinate.CREATOR;
                            return new BoundingBox(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final BoundingBox[] newArray(int i11) {
                            return new BoundingBox[i11];
                        }
                    }

                    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox$GeoCoordinate;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "<init>", "(DD)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLatitude", "()D", "getLongitude", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final /* data */ class GeoCoordinate implements Parcelable {

                        @NotNull
                        public static final Parcelable.Creator<GeoCoordinate> CREATOR = new Creator();
                        private final double latitude;
                        private final double longitude;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class Creator implements Parcelable.Creator<GeoCoordinate> {
                            @Override // android.os.Parcelable.Creator
                            public final GeoCoordinate createFromParcel(Parcel parcel) {
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return new GeoCoordinate(parcel.readDouble(), parcel.readDouble());
                            }

                            @Override // android.os.Parcelable.Creator
                            public final GeoCoordinate[] newArray(int i11) {
                                return new GeoCoordinate[i11];
                            }
                        }

                        public GeoCoordinate(double d11, double d12) {
                            this.latitude = d11;
                            this.longitude = d12;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof GeoCoordinate)) {
                                return false;
                            }
                            GeoCoordinate geoCoordinate = (GeoCoordinate) other;
                            return Double.compare(this.latitude, geoCoordinate.latitude) == 0 && Double.compare(this.longitude, geoCoordinate.longitude) == 0;
                        }

                        public final double getLatitude() {
                            return this.latitude;
                        }

                        public final double getLongitude() {
                            return this.longitude;
                        }

                        public int hashCode() {
                            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
                        }

                        @NotNull
                        public String toString() {
                            double d11 = this.latitude;
                            return C2619v.c(Cm.e.e(d11, "GeoCoordinate(latitude=", ", longitude="), this.longitude, ")");
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@NotNull Parcel dest, int flags) {
                            Intrinsics.checkNotNullParameter(dest, "dest");
                            dest.writeDouble(this.latitude);
                            dest.writeDouble(this.longitude);
                        }
                    }

                    public BoundingBox(@NotNull GeoCoordinate northeast, @NotNull GeoCoordinate southwest) {
                        Intrinsics.checkNotNullParameter(northeast, "northeast");
                        Intrinsics.checkNotNullParameter(southwest, "southwest");
                        this.northeast = northeast;
                        this.southwest = southwest;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof BoundingBox)) {
                            return false;
                        }
                        BoundingBox boundingBox = (BoundingBox) other;
                        return Intrinsics.d(this.northeast, boundingBox.northeast) && Intrinsics.d(this.southwest, boundingBox.southwest);
                    }

                    @NotNull
                    public final GeoCoordinate getNortheast() {
                        return this.northeast;
                    }

                    @NotNull
                    public final GeoCoordinate getSouthwest() {
                        return this.southwest;
                    }

                    public int hashCode() {
                        return this.southwest.hashCode() + (this.northeast.hashCode() * 31);
                    }

                    @NotNull
                    public String toString() {
                        return "BoundingBox(northeast=" + this.northeast + ", southwest=" + this.southwest + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        this.northeast.writeToParcel(dest, flags);
                        this.southwest.writeToParcel(dest, flags);
                    }
                }

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SearchOptions> {
                    @Override // android.os.Parcelable.Creator
                    public final SearchOptions createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        int readInt = parcel.readInt();
                        BoundingBox createFromParcel = parcel.readInt() == 0 ? null : BoundingBox.CREATOR.createFromParcel(parcel);
                        int readInt2 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(readInt2);
                        int i11 = 0;
                        int i12 = 0;
                        while (i12 != readInt2) {
                            i12 = Bi.b.a(SearchOptions.class, parcel, arrayList, i12, 1);
                        }
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt3);
                        int i13 = 0;
                        while (i13 != readInt3) {
                            i13 = Bi.b.a(SearchOptions.class, parcel, arrayList2, i13, 1);
                        }
                        int readInt4 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(readInt4);
                        while (i11 != readInt4) {
                            i11 = Bi.b.a(SearchOptions.class, parcel, arrayList3, i11, 1);
                        }
                        return new SearchOptions(readString, readString2, readInt, createFromParcel, arrayList, arrayList2, arrayList3);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SearchOptions[] newArray(int i11) {
                        return new SearchOptions[i11];
                    }
                }

                public SearchOptions(String str, String str2, int i11, BoundingBox boundingBox, List list, List list2, List list3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, i11, boundingBox, (i12 & 16) != 0 ? K.f71697a : list, (i12 & 32) != 0 ? K.f71697a : list2, (i12 & 64) != 0 ? K.f71697a : list3);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SearchOptions)) {
                        return false;
                    }
                    SearchOptions searchOptions = (SearchOptions) other;
                    return Intrinsics.d(this.link, searchOptions.link) && Intrinsics.d(this.title, searchOptions.title) && this.threshold == searchOptions.threshold && Intrinsics.d(this.boundingBox, searchOptions.boundingBox) && Intrinsics.d(this.emptyState, searchOptions.emptyState) && Intrinsics.d(this.unavailableAddressState, searchOptions.unavailableAddressState) && Intrinsics.d(this.initialElements, searchOptions.initialElements);
                }

                public final BoundingBox getBoundingBox() {
                    return this.boundingBox;
                }

                @NotNull
                public final List<AtomDTO> getEmptyState() {
                    return this.emptyState;
                }

                @NotNull
                public final List<AtomDTO> getInitialElements() {
                    return this.initialElements;
                }

                @NotNull
                public final String getLink() {
                    return this.link;
                }

                public final int getThreshold() {
                    return this.threshold;
                }

                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final List<AtomDTO> getUnavailableAddressState() {
                    return this.unavailableAddressState;
                }

                public int hashCode() {
                    int hashCode = this.link.hashCode() * 31;
                    String str = this.title;
                    int a11 = C2454a.a(this.threshold, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                    BoundingBox boundingBox = this.boundingBox;
                    return this.initialElements.hashCode() + g.b(g.b((a11 + (boundingBox != null ? boundingBox.hashCode() : 0)) * 31, 31, this.emptyState), 31, this.unavailableAddressState);
                }

                @NotNull
                public String toString() {
                    String str = this.link;
                    String str2 = this.title;
                    int i11 = this.threshold;
                    BoundingBox boundingBox = this.boundingBox;
                    List<AtomDTO> list = this.emptyState;
                    List<AtomDTO> list2 = this.unavailableAddressState;
                    List<AtomDTO> list3 = this.initialElements;
                    StringBuilder d11 = C3660k.d("SearchOptions(link=", str, ", title=", str2, ", threshold=");
                    d11.append(i11);
                    d11.append(", boundingBox=");
                    d11.append(boundingBox);
                    d11.append(", emptyState=");
                    C2616s.g(", unavailableAddressState=", ", initialElements=", d11, list, list2);
                    return C2618u.h(d11, list3, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.link);
                    dest.writeString(this.title);
                    dest.writeInt(this.threshold);
                    BoundingBox boundingBox = this.boundingBox;
                    if (boundingBox == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        boundingBox.writeToParcel(dest, flags);
                    }
                    Iterator c11 = Bi.a.c(this.emptyState, dest);
                    while (c11.hasNext()) {
                        dest.writeParcelable((Parcelable) c11.next(), flags);
                    }
                    Iterator c12 = Bi.a.c(this.unavailableAddressState, dest);
                    while (c12.hasNext()) {
                        dest.writeParcelable((Parcelable) c12.next(), flags);
                    }
                    Iterator c13 = Bi.a.c(this.initialElements, dest);
                    while (c13.hasNext()) {
                        dest.writeParcelable((Parcelable) c13.next(), flags);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public SearchOptions(@NotNull String link, String str, int i11, BoundingBox boundingBox, @NotNull List<? extends AtomDTO> emptyState, @NotNull List<? extends AtomDTO> unavailableAddressState, @NotNull List<? extends AtomDTO> initialElements) {
                    Intrinsics.checkNotNullParameter(link, "link");
                    Intrinsics.checkNotNullParameter(emptyState, "emptyState");
                    Intrinsics.checkNotNullParameter(unavailableAddressState, "unavailableAddressState");
                    Intrinsics.checkNotNullParameter(initialElements, "initialElements");
                    this.link = link;
                    this.title = str;
                    this.threshold = i11;
                    this.boundingBox = boundingBox;
                    this.emptyState = emptyState;
                    this.unavailableAddressState = unavailableAddressState;
                    this.initialElements = initialElements;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormBuilderBlockVO(List<? extends AtomDTO> list, Integer num, int i11, @NotNull List<? extends Field> fields, boolean z11) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.titleElements = list;
        this.blockWeight = num;
        this.blockGridSize = i11;
        this.fields = fields;
        this.drawBottomSeparator = z11;
    }

    public static /* synthetic */ FormBuilderBlockVO copy$default(FormBuilderBlockVO formBuilderBlockVO, List list, Integer num, int i11, List list2, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = formBuilderBlockVO.titleElements;
        }
        if ((i12 & 2) != 0) {
            num = formBuilderBlockVO.blockWeight;
        }
        if ((i12 & 4) != 0) {
            i11 = formBuilderBlockVO.blockGridSize;
        }
        if ((i12 & 8) != 0) {
            list2 = formBuilderBlockVO.fields;
        }
        if ((i12 & 16) != 0) {
            z11 = formBuilderBlockVO.drawBottomSeparator;
        }
        boolean z12 = z11;
        int i13 = i11;
        return formBuilderBlockVO.copy(list, num, i13, list2, z12);
    }

    @NotNull
    public final FormBuilderBlockVO copy(List<? extends AtomDTO> titleElements, Integer blockWeight, int blockGridSize, @NotNull List<? extends Field> fields, boolean drawBottomSeparator) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new FormBuilderBlockVO(titleElements, blockWeight, blockGridSize, fields, drawBottomSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormBuilderBlockVO)) {
            return false;
        }
        FormBuilderBlockVO formBuilderBlockVO = (FormBuilderBlockVO) other;
        return Intrinsics.d(this.titleElements, formBuilderBlockVO.titleElements) && Intrinsics.d(this.blockWeight, formBuilderBlockVO.blockWeight) && this.blockGridSize == formBuilderBlockVO.blockGridSize && Intrinsics.d(this.fields, formBuilderBlockVO.fields) && this.drawBottomSeparator == formBuilderBlockVO.drawBottomSeparator;
    }

    public final int getBlockGridSize() {
        return this.blockGridSize;
    }

    public final boolean getDrawBottomSeparator() {
        return this.drawBottomSeparator;
    }

    @NotNull
    public final List<Field> getFields() {
        return this.fields;
    }

    public final List<AtomDTO> getTitleElements() {
        return this.titleElements;
    }

    public int hashCode() {
        List<AtomDTO> list = this.titleElements;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.blockWeight;
        return Boolean.hashCode(this.drawBottomSeparator) + g.b(C2454a.a(this.blockGridSize, (hashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31, this.fields);
    }

    @NotNull
    public String toString() {
        List<AtomDTO> list = this.titleElements;
        Integer num = this.blockWeight;
        int i11 = this.blockGridSize;
        List<Field> list2 = this.fields;
        boolean z11 = this.drawBottomSeparator;
        StringBuilder sb2 = new StringBuilder("FormBuilderBlockVO(titleElements=");
        sb2.append(list);
        sb2.append(", blockWeight=");
        sb2.append(num);
        sb2.append(", blockGridSize=");
        sb2.append(i11);
        sb2.append(", fields=");
        sb2.append(list2);
        sb2.append(", drawBottomSeparator=");
        return Pk0.a.a(")", sb2, z11);
    }
}
