package ru.ozon.app.android.widgets.designSystemAtoms.data;

import Ak.b;
import Fj.c;
import N3.C3660k;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.proto.OneOfSignature;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.cell.BadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ButtonIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconCellCardDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IndicatorLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IconChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.labelRating.LabelRatingDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDTOAtProtoOneOfAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$AtomLayoutRule;", "nullableAtomLayoutRuleAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DesignSystemAtomsDTOJsonAdapter extends JsonAdapter<DesignSystemAtomsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomDTO> atomDTOAtProtoOneOfAdapter;
    private volatile Constructor<DesignSystemAtomsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DesignSystemAtomsDTO.AtomLayoutRule> nullableAtomLayoutRuleAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    public DesignSystemAtomsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("atom", "atomLayoutRule", "widgetWidthPercent", "showWidgetBackground", "tagSupported");
        final d b11 = N.b(BadgeDTO.class);
        final String str = "badge";
        final String str2 = "";
        OneOfSignature oneOfSignature = new OneOfSignature(str, str2, b11) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str;
                this.fieldName = str2;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature2 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature2.name()) && Intrinsics.d(fieldName(), oneOfSignature2.fieldName()) && N.b(type()).equals(N.b(oneOfSignature2.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str3 = this.name;
                String str4 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str3, ", fieldName=", str4, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(Badge.class);
        final String str3 = "badgeOld";
        OneOfSignature oneOfSignature2 = new OneOfSignature(str3, str2, b12) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str3, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str3;
                this.fieldName = str2;
                this.type = C6345a.b(b12);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str4 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str4, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b13 = N.b(BadgeListDTO.class);
        final String str4 = "badgeList";
        OneOfSignature oneOfSignature3 = new OneOfSignature(str4, str2, b13) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str4, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b13, "type");
                this.name = str4;
                this.fieldName = str2;
                this.type = C6345a.b(b13);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b14 = N.b(IconDTO.class);
        final String str5 = "icon";
        OneOfSignature oneOfSignature4 = new OneOfSignature(str5, str2, b14) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str5, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b14, "type");
                this.name = str5;
                this.fieldName = str2;
                this.type = C6345a.b(b14);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b15 = N.b(IndicatorDTO.class);
        final String str6 = "indicator";
        OneOfSignature oneOfSignature5 = new OneOfSignature(str6, str2, b15) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str6, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b15, "type");
                this.name = str6;
                this.fieldName = str2;
                this.type = C6345a.b(b15);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b16 = N.b(TextAtom.class);
        final String str7 = "textOld";
        OneOfSignature oneOfSignature6 = new OneOfSignature(str7, str2, b16) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str7, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b16, "type");
                this.name = str7;
                this.fieldName = str2;
                this.type = C6345a.b(b16);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b17 = N.b(TextDTO.class);
        final String str8 = "text";
        OneOfSignature oneOfSignature7 = new OneOfSignature(str8, str2, b17) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str8, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b17, "type");
                this.name = str8;
                this.fieldName = str2;
                this.type = C6345a.b(b17);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b18 = N.b(ExpandableTextDTO.class);
        final String str9 = CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME;
        OneOfSignature oneOfSignature8 = new OneOfSignature(str9, str2, b18) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str9, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b18, "type");
                this.name = str9;
                this.fieldName = str2;
                this.type = C6345a.b(b18);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b19 = N.b(PriceDTO.class);
        final String str10 = DynamicElementDTO.PRICE_V2;
        OneOfSignature oneOfSignature9 = new OneOfSignature(str10, str2, b19) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str10, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b19, "type");
                this.name = str10;
                this.fieldName = str2;
                this.type = C6345a.b(b19);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b21 = N.b(Price.class);
        final String str11 = "price";
        OneOfSignature oneOfSignature10 = new OneOfSignature(str11, str2, b21) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str11, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b21, "type");
                this.name = str11;
                this.fieldName = str2;
                this.type = C6345a.b(b21);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b22 = N.b(CheckBoxDTO.class);
        final String str12 = "checkBox";
        OneOfSignature oneOfSignature11 = new OneOfSignature(str12, str2, b22) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str12, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b22, "type");
                this.name = str12;
                this.fieldName = str2;
                this.type = C6345a.b(b22);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b23 = N.b(RadioDTO.class);
        final String str13 = "radioButton";
        OneOfSignature oneOfSignature12 = new OneOfSignature(str13, str2, b23) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str13, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b23, "type");
                this.name = str13;
                this.fieldName = str2;
                this.type = C6345a.b(b23);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b24 = N.b(ToggleDTO.class);
        final String str14 = "toggle";
        OneOfSignature oneOfSignature13 = new OneOfSignature(str14, str2, b24) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str14, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b24, "type");
                this.name = str14;
                this.fieldName = str2;
                this.type = C6345a.b(b24);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b25 = N.b(CellDTO.class);
        final String str15 = "dsCell";
        OneOfSignature oneOfSignature14 = new OneOfSignature(str15, str2, b25) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str15, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b25, "type");
                this.name = str15;
                this.fieldName = str2;
                this.type = C6345a.b(b25);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b26 = N.b(BadgeTitleSubtitleCellDTO.class);
        final String str16 = "badgeTitleSubtitleCell";
        OneOfSignature oneOfSignature15 = new OneOfSignature(str16, str2, b26) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str16, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b26, "type");
                this.name = str16;
                this.fieldName = str2;
                this.type = C6345a.b(b26);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b27 = N.b(BadgeIconTitleSubtitleCellDTO.class);
        final String str17 = "badgeIconTitleSubtitleCell";
        OneOfSignature oneOfSignature16 = new OneOfSignature(str17, str2, b27) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str17, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b27, "type");
                this.name = str17;
                this.fieldName = str2;
                this.type = C6345a.b(b27);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b28 = N.b(DisclosureTitleSubtitleCellDTO.class);
        final String str18 = "disclosureTitleSubtitleCell";
        OneOfSignature oneOfSignature17 = new OneOfSignature(str18, str2, b28) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str18, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b28, "type");
                this.name = str18;
                this.fieldName = str2;
                this.type = C6345a.b(b28);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b29 = N.b(DisclosureIconTitleSubtitleCellDTO.class);
        final String str19 = "disclosureIconTitleSubtitleCell";
        OneOfSignature oneOfSignature18 = new OneOfSignature(str19, str2, b29) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str19, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b29, "type");
                this.name = str19;
                this.fieldName = str2;
                this.type = C6345a.b(b29);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b31 = N.b(DisclosureBadgeTitleSubtitleCellDTO.class);
        final String str20 = "disclosureBadgeTitleSubtitleCell";
        OneOfSignature oneOfSignature19 = new OneOfSignature(str20, str2, b31) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str20, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b31, "type");
                this.name = str20;
                this.fieldName = str2;
                this.type = C6345a.b(b31);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b32 = N.b(DisclosureBadgeIconTitleSubtitleCellDTO.class);
        final String str21 = "disclosureBadgeIconTitleSubtitleCell";
        OneOfSignature oneOfSignature20 = new OneOfSignature(str21, str2, b32) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str21, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b32, "type");
                this.name = str21;
                this.fieldName = str2;
                this.type = C6345a.b(b32);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b33 = N.b(DisclosureIndicatorTitleSubtitleCellDTO.class);
        final String str22 = "disclosureIndicatorTitleSubtitleCell";
        OneOfSignature oneOfSignature21 = new OneOfSignature(str22, str2, b33) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str22, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b33, "type");
                this.name = str22;
                this.fieldName = str2;
                this.type = C6345a.b(b33);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature22 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature22.name()) && Intrinsics.d(fieldName(), oneOfSignature22.fieldName()) && N.b(type()).equals(N.b(oneOfSignature22.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b34 = N.b(DisclosureIndicatorIconTitleSubtitleCellDTO.class);
        final String str23 = "disclosureIndicatorIconTitleSubtitleCell";
        OneOfSignature oneOfSignature22 = new OneOfSignature(str23, str2, b34) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str23, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b34, "type");
                this.name = str23;
                this.fieldName = str2;
                this.type = C6345a.b(b34);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b35 = N.b(DisclosureIndicatorBadgeTitleSubtitleCellDTO.class);
        final String str24 = "disclosureIndicatorBadgeTitleSubtitleCell";
        OneOfSignature oneOfSignature23 = new OneOfSignature(str24, str2, b35) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str24, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b35, "type");
                this.name = str24;
                this.fieldName = str2;
                this.type = C6345a.b(b35);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b36 = N.b(DisclosureIndicatorBadgeIconTitleSubtitleCellDTO.class);
        final String str25 = "disclosureIndicatorBadgeIconTitleSubtitleCell";
        OneOfSignature oneOfSignature24 = new OneOfSignature(str25, str2, b36) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str25, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b36, "type");
                this.name = str25;
                this.fieldName = str2;
                this.type = C6345a.b(b36);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b37 = N.b(IconTitleSubtitleCellDTO.class);
        final String str26 = "iconTitleSubtitleCell";
        OneOfSignature oneOfSignature25 = new OneOfSignature(str26, str2, b37) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str26, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b37, "type");
                this.name = str26;
                this.fieldName = str2;
                this.type = C6345a.b(b37);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b38 = N.b(IndicatorTitleSubtitleCellDTO.class);
        final String str27 = "indicatorTitleSubtitleCell";
        OneOfSignature oneOfSignature26 = new OneOfSignature(str27, str2, b38) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str27, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b38, "type");
                this.name = str27;
                this.fieldName = str2;
                this.type = C6345a.b(b38);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b39 = N.b(IndicatorIconTitleSubtitleCellDTO.class);
        final String str28 = "indicatorIconTitleSubtitleCell";
        OneOfSignature oneOfSignature27 = new OneOfSignature(str28, str2, b39) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str28, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b39, "type");
                this.name = str28;
                this.fieldName = str2;
                this.type = C6345a.b(b39);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b41 = N.b(IndicatorBadgeTitleSubtitleCellDTO.class);
        final String str29 = "indicatorBadgeTitleSubtitleCell";
        OneOfSignature oneOfSignature28 = new OneOfSignature(str29, str2, b41) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str29, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b41, "type");
                this.name = str29;
                this.fieldName = str2;
                this.type = C6345a.b(b41);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b42 = N.b(IndicatorBadgeIconTitleSubtitleCellDTO.class);
        final String str30 = "indicatorBadgeIconTitleSubtitleCell";
        OneOfSignature oneOfSignature29 = new OneOfSignature(str30, str2, b42) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str30, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b42, "type");
                this.name = str30;
                this.fieldName = str2;
                this.type = C6345a.b(b42);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b43 = N.b(CheckboxTitleSubtitleCellDTO.class);
        final String str31 = "checkboxTitleSubtitleCell";
        OneOfSignature oneOfSignature30 = new OneOfSignature(str31, str2, b43) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str31, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b43, "type");
                this.name = str31;
                this.fieldName = str2;
                this.type = C6345a.b(b43);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b44 = N.b(RadioTitleSubtitleCellDTO.class);
        final String str32 = "radioTitleSubtitleCell";
        OneOfSignature oneOfSignature31 = new OneOfSignature(str32, str2, b44) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str32, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b44, "type");
                this.name = str32;
                this.fieldName = str2;
                this.type = C6345a.b(b44);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b45 = N.b(ToggleTitleSubtitleCellDTO.class);
        final String str33 = "toggleTitleSubtitleCell";
        OneOfSignature oneOfSignature32 = new OneOfSignature(str33, str2, b45) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str33, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b45, "type");
                this.name = str33;
                this.fieldName = str2;
                this.type = C6345a.b(b45);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b46 = N.b(TitleSubtitleCellDTO.class);
        final String str34 = "titleSubtitleCell";
        OneOfSignature oneOfSignature33 = new OneOfSignature(str34, str2, b46) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str34, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b46, "type");
                this.name = str34;
                this.fieldName = str2;
                this.type = C6345a.b(b46);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b47 = N.b(ButtonDTO.class);
        final String str35 = "button";
        OneOfSignature oneOfSignature34 = new OneOfSignature(str35, str2, b47) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str35, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b47, "type");
                this.name = str35;
                this.fieldName = str2;
                this.type = C6345a.b(b47);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b48 = N.b(DataButtonDTO.class);
        final String str36 = "dataButton";
        OneOfSignature oneOfSignature35 = new OneOfSignature(str36, str2, b48) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str36, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b48, "type");
                this.name = str36;
                this.fieldName = str2;
                this.type = C6345a.b(b48);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b49 = N.b(IconButtonDTO.class);
        final String str37 = "iconButton";
        OneOfSignature oneOfSignature36 = new OneOfSignature(str37, str2, b49) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str37, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b49, "type");
                this.name = str37;
                this.fieldName = str2;
                this.type = C6345a.b(b49);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b51 = N.b(IconCellCardDTO.class);
        final String str38 = "iconCellCard";
        OneOfSignature oneOfSignature37 = new OneOfSignature(str38, str2, b51) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str38, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b51, "type");
                this.name = str38;
                this.fieldName = str2;
                this.type = C6345a.b(b51);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b52 = N.b(IconLabelButtonDTO.class);
        final String str39 = "iconLabelButton";
        OneOfSignature oneOfSignature38 = new OneOfSignature(str39, str2, b52) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str39, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b52, "type");
                this.name = str39;
                this.fieldName = str2;
                this.type = C6345a.b(b52);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b53 = N.b(IndicatorLabelButtonDTO.class);
        final String str40 = "indicatorLabelButton";
        OneOfSignature oneOfSignature39 = new OneOfSignature(str40, str2, b53) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str40, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b53, "type");
                this.name = str40;
                this.fieldName = str2;
                this.type = C6345a.b(b53);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b54 = N.b(UncontainedButtonDTO.class);
        final String str41 = "uncontainedButton";
        OneOfSignature oneOfSignature40 = new OneOfSignature(str41, str2, b54) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str41, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b54, "type");
                this.name = str41;
                this.fieldName = str2;
                this.type = C6345a.b(b54);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b55 = N.b(UncontainedIconLabelButtonDTO.class);
        final String str42 = "uncontainedIconLabelButton";
        OneOfSignature oneOfSignature41 = new OneOfSignature(str42, str2, b55) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str42, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b55, "type");
                this.name = str42;
                this.fieldName = str2;
                this.type = C6345a.b(b55);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b56 = N.b(ButtonTitleSubtitleCellDTO.class);
        final String str43 = "buttonTitleSubtitleCell";
        OneOfSignature oneOfSignature42 = new OneOfSignature(str43, str2, b56) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str43, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b56, "type");
                this.name = str43;
                this.fieldName = str2;
                this.type = C6345a.b(b56);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b57 = N.b(ButtonIconTitleSubtitleCellDTO.class);
        final String str44 = "buttonIconTitleSubtitleCell";
        OneOfSignature oneOfSignature43 = new OneOfSignature(str44, str2, b57) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str44, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b57, "type");
                this.name = str44;
                this.fieldName = str2;
                this.type = C6345a.b(b57);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b58 = N.b(IconButtonTitleSubtitleCellDTO.class);
        final String str45 = "iconButtonTitleSubtitleCell";
        OneOfSignature oneOfSignature44 = new OneOfSignature(str45, str2, b58) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str45, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b58, "type");
                this.name = str45;
                this.fieldName = str2;
                this.type = C6345a.b(b58);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b59 = N.b(IconButtonIconTitleSubtitleCellDTO.class);
        final String str46 = "iconButtonIconTitleSubtitleCell";
        OneOfSignature oneOfSignature45 = new OneOfSignature(str46, str2, b59) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str46, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b59, "type");
                this.name = str46;
                this.fieldName = str2;
                this.type = C6345a.b(b59);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b61 = N.b(ChipDTO.class);
        final String str47 = "chip";
        OneOfSignature oneOfSignature46 = new OneOfSignature(str47, str2, b61) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str47, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b61, "type");
                this.name = str47;
                this.fieldName = str2;
                this.type = C6345a.b(b61);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b62 = N.b(IconChipDTO.class);
        final String str48 = "iconChip";
        OneOfSignature oneOfSignature47 = new OneOfSignature(str48, str2, b62) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str48, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b62, "type");
                this.name = str48;
                this.fieldName = str2;
                this.type = C6345a.b(b62);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b63 = N.b(IndicatorLabelChipDTO.class);
        final String str49 = "indicatorLabelChip";
        OneOfSignature oneOfSignature48 = new OneOfSignature(str49, str2, b63) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str49, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b63, "type");
                this.name = str49;
                this.fieldName = str2;
                this.type = C6345a.b(b63);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b64 = N.b(ImageDTO.class);
        final String str50 = "image";
        OneOfSignature oneOfSignature49 = new OneOfSignature(str50, str2, b64) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str50, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b64, "type");
                this.name = str50;
                this.fieldName = str2;
                this.type = C6345a.b(b64);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b65 = N.b(ImageFixedDTO.class);
        final String str51 = "imageFixed";
        OneOfSignature oneOfSignature50 = new OneOfSignature(str51, str2, b65) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str51, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b65, "type");
                this.name = str51;
                this.fieldName = str2;
                this.type = C6345a.b(b65);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b66 = N.b(ImageTitleSubtitleCellDTO.class);
        final String str52 = "imageTitleSubtitleCell";
        OneOfSignature oneOfSignature51 = new OneOfSignature(str52, str2, b66) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str52, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b66, "type");
                this.name = str52;
                this.fieldName = str2;
                this.type = C6345a.b(b66);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b67 = N.b(RatingDTO.class);
        final String str53 = "rating";
        OneOfSignature oneOfSignature52 = new OneOfSignature(str53, str2, b67) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str53, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b67, "type");
                this.name = str53;
                this.fieldName = str2;
                this.type = C6345a.b(b67);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b68 = N.b(LabelRatingDTO.class);
        final String str54 = "labelRating";
        OneOfSignature oneOfSignature53 = new OneOfSignature(str54, str2, b68) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str54, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b68, "type");
                this.name = str54;
                this.fieldName = str2;
                this.type = C6345a.b(b68);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b69 = N.b(ButtonV3DTO.class);
        final String str55 = "buttonV3";
        OneOfSignature oneOfSignature54 = new OneOfSignature(str55, str2, b69) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str55, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b69, "type");
                this.name = str55;
                this.fieldName = str2;
                this.type = C6345a.b(b69);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b71 = N.b(IconButtonV3DTO.class);
        final String str56 = "iconButtonV3";
        OneOfSignature oneOfSignature55 = new OneOfSignature(str56, str2, b71) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str56, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b71, "type");
                this.name = str56;
                this.fieldName = str2;
                this.type = C6345a.b(b71);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b72 = N.b(TagButtonDTO.class);
        final String str57 = "tagButton";
        OneOfSignature oneOfSignature56 = new OneOfSignature(str57, str2, b72) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str57, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b72, "type");
                this.name = str57;
                this.fieldName = str2;
                this.type = C6345a.b(b72);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b73 = N.b(InputSelectButtonDTO.class);
        final String str58 = "inputSelectButton";
        OneOfSignature oneOfSignature57 = new OneOfSignature(str58, str2, b73) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str58, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b73, "type");
                this.name = str58;
                this.fieldName = str2;
                this.type = C6345a.b(b73);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b74 = N.b(NotificationDTO.class);
        final String str59 = "notificationBar";
        OneOfSignature oneOfSignature58 = new OneOfSignature(str59, str2, b74) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str59, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b74, "type");
                this.name = str59;
                this.fieldName = str2;
                this.type = C6345a.b(b74);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b75 = N.b(DesignSystemAtomsDTO.TestOnlyTextAreaDTO.class);
        final String str60 = "testOnlyTextArea";
        OneOfSignature oneOfSignature59 = new OneOfSignature(str60, str2, b75) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str60, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b75, "type");
                this.name = str60;
                this.fieldName = str2;
                this.type = C6345a.b(b75);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b76 = N.b(AspectDTO.class);
        final String str61 = "aspect";
        OneOfSignature oneOfSignature60 = new OneOfSignature(str61, str2, b76) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str61, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b76, "type");
                this.name = str61;
                this.fieldName = str2;
                this.type = C6345a.b(b76);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b77 = N.b(ProductMediaDTO.class);
        final String str62 = "productMedia";
        OneOfSignature oneOfSignature61 = new OneOfSignature(str62, str2, b77) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str62, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b77, "type");
                this.name = str62;
                this.fieldName = str2;
                this.type = C6345a.b(b77);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b78 = N.b(TabsDTO.class);
        final String str63 = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.TABS;
        OneOfSignature oneOfSignature62 = new OneOfSignature(str63, str2, b78) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str63, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b78, "type");
                this.name = str63;
                this.fieldName = str2;
                this.type = C6345a.b(b78);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b79 = N.b(DisclaimerDTO.class);
        final String str64 = SelectionItemFormDTO.DISCLAIMER_FIELD_NAME;
        final OneOfSignature[] oneOfSignatureArr = {oneOfSignature, oneOfSignature2, oneOfSignature3, oneOfSignature4, oneOfSignature5, oneOfSignature6, oneOfSignature7, oneOfSignature8, oneOfSignature9, oneOfSignature10, oneOfSignature11, oneOfSignature12, oneOfSignature13, oneOfSignature14, oneOfSignature15, oneOfSignature16, oneOfSignature17, oneOfSignature18, oneOfSignature19, oneOfSignature20, oneOfSignature21, oneOfSignature22, oneOfSignature23, oneOfSignature24, oneOfSignature25, oneOfSignature26, oneOfSignature27, oneOfSignature28, oneOfSignature29, oneOfSignature30, oneOfSignature31, oneOfSignature32, oneOfSignature33, oneOfSignature34, oneOfSignature35, oneOfSignature36, oneOfSignature37, oneOfSignature38, oneOfSignature39, oneOfSignature40, oneOfSignature41, oneOfSignature42, oneOfSignature43, oneOfSignature44, oneOfSignature45, oneOfSignature46, oneOfSignature47, oneOfSignature48, oneOfSignature49, oneOfSignature50, oneOfSignature51, oneOfSignature52, oneOfSignature53, oneOfSignature54, oneOfSignature55, oneOfSignature56, oneOfSignature57, oneOfSignature58, oneOfSignature59, oneOfSignature60, oneOfSignature61, oneOfSignature62, new OneOfSignature(str64, str2, b79) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str64, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b79, "type");
                this.name = str64;
                this.fieldName = str2;
                this.type = C6345a.b(b79);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature222 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature222.name()) && Intrinsics.d(fieldName(), oneOfSignature222.fieldName()) && N.b(type()).equals(N.b(oneOfSignature222.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str322 = this.name;
                String str422 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str322, ", fieldName=", str422, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        final String str65 = "type";
        this.atomDTOAtProtoOneOfAdapter = moshi.f(AtomDTO.class, e0.h(new ProtoOneOf(str65, oneOfSignatureArr) { // from class: ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_ProtoOneOf$0
            private final /* synthetic */ String label;
            private final /* synthetic */ OneOfSignature[] signatures;

            {
                Intrinsics.checkNotNullParameter(str65, "label");
                Intrinsics.checkNotNullParameter(oneOfSignatureArr, "signatures");
                this.label = str65;
                this.signatures = oneOfSignatureArr;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOf)) {
                    return false;
                }
                ProtoOneOf protoOneOf = (ProtoOneOf) obj;
                return Intrinsics.d(label(), protoOneOf.label()) && Arrays.equals(signatures(), protoOneOf.signatures());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.label.hashCode() ^ 161479436) + (Arrays.hashCode(this.signatures) ^ 453631685);
            }

            @Override // ru.ozon.app.android.atoms.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // ru.ozon.app.android.atoms.proto.ProtoOneOf
            public final /* synthetic */ OneOfSignature[] signatures() {
                return this.signatures;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return e.a("@ru.ozon.app.android.atoms.proto.ProtoOneOf(label=", this.label, ", signatures=", Arrays.toString(this.signatures), ")");
            }
        }), "atom");
        M m11 = M.f71699a;
        this.nullableAtomLayoutRuleAdapter = moshi.f(DesignSystemAtomsDTO.AtomLayoutRule.class, m11, "atomLayoutRule");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "widgetWidthPercent");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "showWidgetBackground");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(DesignSystemAtomsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DesignSystemAtomsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AtomDTO atomDTO = null;
        DesignSystemAtomsDTO.AtomLayoutRule atomLayoutRule = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                atomDTO = this.atomDTOAtProtoOneOfAdapter.fromJson(reader);
                if (atomDTO == null) {
                    throw Y9.c.q("atom", "atom", reader);
                }
            } else if (v11 == 1) {
                atomLayoutRule = this.nullableAtomLayoutRuleAdapter.fromJson(reader);
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 3) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 4) {
                bool2 = this.nullableBooleanAdapter.fromJson(reader);
                i11 = -17;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            Integer num2 = num;
            DesignSystemAtomsDTO.AtomLayoutRule atomLayoutRule2 = atomLayoutRule;
            AtomDTO atomDTO2 = atomDTO;
            if (atomDTO2 != null) {
                return new DesignSystemAtomsDTO(atomDTO2, atomLayoutRule2, num2, bool4, bool3);
            }
            throw Y9.c.j("atom", "atom", reader);
        }
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        Integer num3 = num;
        DesignSystemAtomsDTO.AtomLayoutRule atomLayoutRule3 = atomLayoutRule;
        AtomDTO atomDTO3 = atomDTO;
        Constructor<DesignSystemAtomsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DesignSystemAtomsDTO.class.getDeclaredConstructor(AtomDTO.class, DesignSystemAtomsDTO.AtomLayoutRule.class, Integer.class, Boolean.class, Boolean.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (atomDTO3 == null) {
            throw Y9.c.j("atom", "atom", reader);
        }
        DesignSystemAtomsDTO newInstance = constructor.newInstance(atomDTO3, atomLayoutRule3, num3, bool6, bool5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DesignSystemAtomsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("atom");
        this.atomDTOAtProtoOneOfAdapter.mo44toJson(writer, (x) value.getAtom());
        writer.w("atomLayoutRule");
        this.nullableAtomLayoutRuleAdapter.mo44toJson(writer, (x) value.getAtomLayoutRule());
        writer.w("widgetWidthPercent");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getWidgetWidthPercent());
        writer.w("showWidgetBackground");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowWidgetBackground());
        writer.w("tagSupported");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getTagSupported());
        writer.p();
    }
}
