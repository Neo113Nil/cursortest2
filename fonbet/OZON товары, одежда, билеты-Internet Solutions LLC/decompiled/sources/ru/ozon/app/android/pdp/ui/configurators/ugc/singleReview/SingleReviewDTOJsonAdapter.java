package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.MediaDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000205\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u001c\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\"\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020B\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0019¨\u0006J"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "longAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO;", "nullableHeaderDTOAdapter", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "nullableListOfMediaDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableListOfTextAtomAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ButtonBlockDTO;", "nullableListOfButtonBlockDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "nullableListOfBodySectionDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$UserLikesDTO;", "nullableUserLikesDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ActionsFooterDTO;", "nullableActionsFooterDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "nullableIntAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricHeaderDTO;", "nullableMediaCentricHeaderDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "nullableMediaCentricDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$ContextReviewsDTO;", "nullableContextReviewsDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$TranslateButtonDTO;", "nullableTranslateButtonDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$CommentFooterDTO;", "nullableCommentFooterDTOAdapter", "", "nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BadgeTextDTO;", "nullableBadgeTextDTOAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "nullableMediaImageStickerDTOAdapter", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SingleReviewDTOJsonAdapter extends JsonAdapter<SingleReviewDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.ActionsFooterDTO> nullableActionsFooterDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.BadgeTextDTO> nullableBadgeTextDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.CommentFooterDTO> nullableCommentFooterDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.ContextReviewsDTO> nullableContextReviewsDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<Object>> nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SingleReviewDTO.BodySectionDTO>> nullableListOfBodySectionDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SingleReviewDTO.ButtonBlockDTO>> nullableListOfButtonBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<List<MediaDTO>> nullableListOfMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.MediaCentricDTO> nullableMediaCentricDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.MediaCentricHeaderDTO> nullableMediaCentricHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.MediaImageStickerDTO> nullableMediaImageStickerDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.TranslateButtonDTO> nullableTranslateButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleReviewDTO.UserLikesDTO> nullableUserLikesDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SingleReviewDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("indent", "uuid", "productId", CommentV3DTO.HEADER_FIELD_NAME, "photos", "videos", "showReviewGalleryButton", "contextQuestions", "buttonBlocks", "bodySections", "showOtherReviewsButton", "trackingInfo", "rateUsefulnessAction", "userLikes", "actionsFooter", "aspects", "reviewCollapseThreshold", "mediaCentricHeader", "mediaCentric", "contextReviews", "tileReviewTracking", "reviewExpandTrackingInfo", "translateButton", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME, "items", "mediaPreviewCornerRadius", "badgeText", "mediaImageSticker");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "indent");
        this.stringAdapter = moshi.f(String.class, m11, "uuid");
        this.longAdapter = moshi.f(Long.TYPE, m11, "productId");
        this.nullableHeaderDTOAdapter = moshi.f(SingleReviewDTO.HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfMediaDTOAdapter = moshi.f(D.e(List.class, MediaDTO.class), m11, "photos");
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "showReviewGalleryButton");
        this.nullableListOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "contextQuestions");
        final String str = "buttonBlocks";
        this.nullableListOfButtonBlockDTOAdapter = moshi.f(D.e(List.class, SingleReviewDTO.ButtonBlockDTO.class), m11, "buttonBlocks");
        this.nullableListOfBodySectionDTOAdapter = moshi.f(D.e(List.class, SingleReviewDTO.BodySectionDTO.class), m11, "bodySections");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "showOtherReviewsButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "rateUsefulnessAction");
        this.nullableUserLikesDTOAdapter = moshi.f(SingleReviewDTO.UserLikesDTO.class, m11, "userLikes");
        final String str2 = "actionsFooter";
        this.nullableActionsFooterDTOAdapter = moshi.f(SingleReviewDTO.ActionsFooterDTO.class, m11, "actionsFooter");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "aspects");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "reviewCollapseThreshold");
        this.nullableMediaCentricHeaderDTOAdapter = moshi.f(SingleReviewDTO.MediaCentricHeaderDTO.class, m11, "mediaCentricHeader");
        this.nullableMediaCentricDTOAdapter = moshi.f(SingleReviewDTO.MediaCentricDTO.class, m11, "mediaCentric");
        this.nullableContextReviewsDTOAdapter = moshi.f(SingleReviewDTO.ContextReviewsDTO.class, m11, "contextReviews");
        this.nullableTranslateButtonDTOAdapter = moshi.f(SingleReviewDTO.TranslateButtonDTO.class, m11, "translateButton");
        final String str3 = ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME;
        this.nullableCommentFooterDTOAdapter = moshi.f(SingleReviewDTO.CommentFooterDTO.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME);
        b e11 = D.e(List.class, Object.class);
        final String str4 = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str4) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str4, "label");
                this.label = str4;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(SingleReviewDTO.ButtonBlockDTO.class);
        final String str5 = "";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str, str5, b11) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str;
                this.fieldName = str5;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature2 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature2.name()) && Intrinsics.d(fieldName(), protoOneOfSignature2.fieldName()) && C2702w.f(protoOneOfSignature2, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str6 = this.name;
                String str7 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str6, ", fieldName=", str7, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(PlainTextDTO.class);
        final String str6 = SelectionItemFormDTO.PLAIN_TEXT_FIELD_NAME;
        ProtoOneOfSignature protoOneOfSignature2 = new ProtoOneOfSignature(str6, str5, b12) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str6, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str6;
                this.fieldName = str5;
                this.type = C6345a.b(b12);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str62 = this.name;
                String str7 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str62, ", fieldName=", str7, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b13 = N.b(SingleReviewDTO.ActionsFooterDTO.class);
        ProtoOneOfSignature protoOneOfSignature3 = new ProtoOneOfSignature(str2, str5, b13) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b13, "type");
                this.name = str2;
                this.fieldName = str5;
                this.type = C6345a.b(b13);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str62 = this.name;
                String str7 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str62, ", fieldName=", str7, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b14 = N.b(SingleReviewDTO.CommentFooterDTO.class);
        ProtoOneOfSignature protoOneOfSignature4 = new ProtoOneOfSignature(str3, str5, b14) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str3, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b14, "type");
                this.name = str3;
                this.fieldName = str5;
                this.type = C6345a.b(b14);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str62 = this.name;
                String str7 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str62, ", fieldName=", str7, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b15 = N.b(SeparatorDTO.class);
        final String str7 = "separator";
        ProtoOneOfSignature protoOneOfSignature5 = new ProtoOneOfSignature(str7, str5, b15) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str7, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b15, "type");
                this.name = str7;
                this.fieldName = str5;
                this.type = C6345a.b(b15);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str62 = this.name;
                String str72 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str62, ", fieldName=", str72, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b16 = N.b(ButtonWidgetDTO.class);
        final String str8 = "button";
        ProtoOneOfSignature protoOneOfSignature6 = new ProtoOneOfSignature(str8, str5, b16) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str8, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b16, "type");
                this.name = str8;
                this.fieldName = str5;
                this.type = C6345a.b(b16);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str62 = this.name;
                String str72 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str62, ", fieldName=", str72, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b17 = N.b(IslandSeparatorDTO.class);
        final String str9 = "islandSeparator";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, protoOneOfSignature2, protoOneOfSignature3, protoOneOfSignature4, protoOneOfSignature5, protoOneOfSignature6, new ProtoOneOfSignature(str9, str5, b17) { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str9, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b17, "type");
                this.name = str9;
                this.fieldName = str5;
                this.type = C6345a.b(b17);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str62 = this.name;
                String str72 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str62, ", fieldName=", str72, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "items");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "mediaPreviewCornerRadius");
        this.nullableBadgeTextDTOAdapter = moshi.f(SingleReviewDTO.BadgeTextDTO.class, m11, "badgeText");
        this.nullableMediaImageStickerDTOAdapter = moshi.f(SingleReviewDTO.MediaImageStickerDTO.class, m11, "mediaImageSticker");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(SingleReviewDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SingleReviewDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Long l11 = null;
        String str = null;
        SingleReviewDTO.HeaderDTO headerDTO = null;
        List<MediaDTO> list = null;
        List<MediaDTO> list2 = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        List<TextAtom> list3 = null;
        List<SingleReviewDTO.ButtonBlockDTO> list4 = null;
        List<SingleReviewDTO.BodySectionDTO> list5 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        AtomActionDTO atomActionDTO = null;
        SingleReviewDTO.UserLikesDTO userLikesDTO = null;
        SingleReviewDTO.ActionsFooterDTO actionsFooterDTO = null;
        List<BadgeDTO> list6 = null;
        Integer num2 = null;
        SingleReviewDTO.MediaCentricHeaderDTO mediaCentricHeaderDTO = null;
        SingleReviewDTO.MediaCentricDTO mediaCentricDTO = null;
        SingleReviewDTO.ContextReviewsDTO contextReviewsDTO = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        SingleReviewDTO.TranslateButtonDTO translateButtonDTO = null;
        SingleReviewDTO.CommentFooterDTO commentFooterDTO = null;
        List<Object> list7 = null;
        CornerRadius cornerRadius = null;
        SingleReviewDTO.BadgeTextDTO badgeTextDTO = null;
        SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO = null;
        while (true) {
            Integer num3 = num;
            if (!reader.hasNext()) {
                reader.endObject();
                Long l12 = l11;
                if (num3 == null) {
                    throw Y9.c.j("indent", "indent", reader);
                }
                int intValue = num3.intValue();
                if (str == null) {
                    throw Y9.c.j("uuid", "uuid", reader);
                }
                if (l12 != null) {
                    return new SingleReviewDTO(intValue, str, l12.longValue(), headerDTO, list, list2, largeBorderlessButton, list3, list4, list5, largeButton, map, atomActionDTO, userLikesDTO, actionsFooterDTO, list6, num2, mediaCentricHeaderDTO, mediaCentricDTO, contextReviewsDTO, map2, map3, translateButtonDTO, commentFooterDTO, list7, cornerRadius, badgeTextDTO, mediaImageStickerDTO);
                }
                throw Y9.c.j("productId", "productId", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Y9.c.q("indent", "indent", reader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("uuid", "uuid", reader);
                    }
                    break;
                case 2:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw Y9.c.q("productId", "productId", reader);
                    }
                    break;
                case 3:
                    headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfMediaDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    list2 = this.nullableListOfMediaDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    break;
                case 8:
                    list4 = this.nullableListOfButtonBlockDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    list5 = this.nullableListOfBodySectionDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 13:
                    userLikesDTO = this.nullableUserLikesDTOAdapter.fromJson(reader);
                    break;
                case 14:
                    actionsFooterDTO = this.nullableActionsFooterDTOAdapter.fromJson(reader);
                    break;
                case 15:
                    list6 = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    break;
                case 16:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 17:
                    mediaCentricHeaderDTO = this.nullableMediaCentricHeaderDTOAdapter.fromJson(reader);
                    break;
                case 18:
                    mediaCentricDTO = this.nullableMediaCentricDTOAdapter.fromJson(reader);
                    break;
                case 19:
                    contextReviewsDTO = this.nullableContextReviewsDTOAdapter.fromJson(reader);
                    break;
                case 20:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 21:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 22:
                    translateButtonDTO = this.nullableTranslateButtonDTOAdapter.fromJson(reader);
                    break;
                case 23:
                    commentFooterDTO = this.nullableCommentFooterDTOAdapter.fromJson(reader);
                    break;
                case 24:
                    list7 = this.nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    badgeTextDTO = this.nullableBadgeTextDTOAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    mediaImageStickerDTO = this.nullableMediaImageStickerDTOAdapter.fromJson(reader);
                    break;
            }
            num = num3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SingleReviewDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("indent");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIndent()));
        writer.w("uuid");
        this.stringAdapter.mo44toJson(writer, (x) value.getUuid());
        writer.w("productId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getProductId()));
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("photos");
        this.nullableListOfMediaDTOAdapter.mo44toJson(writer, (x) value.getPhotos());
        writer.w("videos");
        this.nullableListOfMediaDTOAdapter.mo44toJson(writer, (x) value.getVideos());
        writer.w("showReviewGalleryButton");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getShowReviewGalleryButton());
        writer.w("contextQuestions");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value.getContextQuestions());
        writer.w("buttonBlocks");
        this.nullableListOfButtonBlockDTOAdapter.mo44toJson(writer, (x) value.getButtonBlocks());
        writer.w("bodySections");
        this.nullableListOfBodySectionDTOAdapter.mo44toJson(writer, (x) value.getBodySections());
        writer.w("showOtherReviewsButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getShowOtherReviewsButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("rateUsefulnessAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRateUsefulnessAction());
        writer.w("userLikes");
        this.nullableUserLikesDTOAdapter.mo44toJson(writer, (x) value.getUserLikes());
        writer.w("actionsFooter");
        this.nullableActionsFooterDTOAdapter.mo44toJson(writer, (x) value.getActionsFooter());
        writer.w("aspects");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getAspects());
        writer.w("reviewCollapseThreshold");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getReviewCollapseThreshold());
        writer.w("mediaCentricHeader");
        this.nullableMediaCentricHeaderDTOAdapter.mo44toJson(writer, (x) value.getMediaCentricHeader());
        writer.w("mediaCentric");
        this.nullableMediaCentricDTOAdapter.mo44toJson(writer, (x) value.getMediaCentric());
        writer.w("contextReviews");
        this.nullableContextReviewsDTOAdapter.mo44toJson(writer, (x) value.getContextReviews());
        writer.w("tileReviewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTileReviewTracking());
        writer.w("reviewExpandTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getReviewExpandTrackingInfo());
        writer.w("translateButton");
        this.nullableTranslateButtonDTOAdapter.mo44toJson(writer, (x) value.getTranslateButton());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME);
        this.nullableCommentFooterDTOAdapter.mo44toJson(writer, (x) value.getCommentFooter());
        writer.w("items");
        this.nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("mediaPreviewCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getMediaPreviewCornerRadius());
        writer.w("badgeText");
        this.nullableBadgeTextDTOAdapter.mo44toJson(writer, (x) value.getBadgeText());
        writer.w("mediaImageSticker");
        this.nullableMediaImageStickerDTOAdapter.mo44toJson(writer, (x) value.getMediaImageSticker());
        writer.p();
    }
}
