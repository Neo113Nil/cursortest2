package ru.ozon.app.android.faq.data.model;

import G.g;
import H3.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.atoms.data.list.NumberedListAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqWidgetDTO;", "", "topics", "", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic;", "<init>", "(Ljava/util/List;)V", "getTopics", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Topic", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FaqWidgetDTO {
    private final List<Topic> topics;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "items", "", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Topic {

        @NotNull
        private final List<Item> items;

        @NotNull
        private final OzonSpannableString title;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item;", "", "<init>", "()V", "LinkItem", "Accordion", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item$Accordion;", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item$LinkItem;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Item {

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item$Accordion;", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item;", "question", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "answer", "", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Ljava/util/Map;)V", "getQuestion", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAnswer", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Accordion extends Item {

                @NotNull
                private final List<Object> answer;

                @NotNull
                private final OzonSpannableString question;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Accordion(@NotNull OzonSpannableString question, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextAtom.class), @ProtoOneOfSignature(name = "bulletList", type = BulletListAtom.class), @ProtoOneOfSignature(name = "numberedList", type = NumberedListAtom.class), @ProtoOneOfSignature(name = "annotation", type = AnnotationDTO.class), @ProtoOneOfSignature(name = "smallButton", type = ButtonV3Atom.SmallButton.class), @ProtoOneOfSignature(name = "img", type = String.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> answer, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(question, "question");
                    Intrinsics.checkNotNullParameter(answer, "answer");
                    this.question = question;
                    this.answer = answer;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Accordion copy$default(Accordion accordion, OzonSpannableString ozonSpannableString, List list, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        ozonSpannableString = accordion.question;
                    }
                    if ((i11 & 2) != 0) {
                        list = accordion.answer;
                    }
                    if ((i11 & 4) != 0) {
                        map = accordion.trackingInfo;
                    }
                    return accordion.copy(ozonSpannableString, list, map);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final OzonSpannableString getQuestion() {
                    return this.question;
                }

                @NotNull
                public final List<Object> component2() {
                    return this.answer;
                }

                public final Map<String, TokenizedTrackingInfo> component3() {
                    return this.trackingInfo;
                }

                @NotNull
                public final Accordion copy(@NotNull OzonSpannableString question, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextAtom.class), @ProtoOneOfSignature(name = "bulletList", type = BulletListAtom.class), @ProtoOneOfSignature(name = "numberedList", type = NumberedListAtom.class), @ProtoOneOfSignature(name = "annotation", type = AnnotationDTO.class), @ProtoOneOfSignature(name = "smallButton", type = ButtonV3Atom.SmallButton.class), @ProtoOneOfSignature(name = "img", type = String.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> answer, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(question, "question");
                    Intrinsics.checkNotNullParameter(answer, "answer");
                    return new Accordion(question, answer, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Accordion)) {
                        return false;
                    }
                    Accordion accordion = (Accordion) other;
                    return Intrinsics.d(this.question, accordion.question) && Intrinsics.d(this.answer, accordion.answer) && Intrinsics.d(this.trackingInfo, accordion.trackingInfo);
                }

                @NotNull
                public final List<Object> getAnswer() {
                    return this.answer;
                }

                @NotNull
                public final OzonSpannableString getQuestion() {
                    return this.question;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int b11 = g.b(this.question.hashCode() * 31, 31, this.answer);
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return b11 + (map == null ? 0 : map.hashCode());
                }

                @NotNull
                public String toString() {
                    OzonSpannableString ozonSpannableString = this.question;
                    List<Object> list = this.answer;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("Accordion(question=");
                    sb2.append((Object) ozonSpannableString);
                    sb2.append(", answer=");
                    sb2.append(list);
                    sb2.append(", trackingInfo=");
                    return P.f(sb2, map, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item$LinkItem;", "Lru/ozon/app/android/faq/data/model/FaqWidgetDTO$Topic$Item;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action1", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction1", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LinkItem extends Item {
                private final AtomActionDTO action;
                private final ImageDTO action1;
                private final OzonSpannableString title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public LinkItem(OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, ImageDTO imageDTO, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    this.title = ozonSpannableString;
                    this.action = atomActionDTO;
                    this.action1 = imageDTO;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ LinkItem copy$default(LinkItem linkItem, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, ImageDTO imageDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        ozonSpannableString = linkItem.title;
                    }
                    if ((i11 & 2) != 0) {
                        atomActionDTO = linkItem.action;
                    }
                    if ((i11 & 4) != 0) {
                        imageDTO = linkItem.action1;
                    }
                    if ((i11 & 8) != 0) {
                        map = linkItem.trackingInfo;
                    }
                    return linkItem.copy(ozonSpannableString, atomActionDTO, imageDTO, map);
                }

                /* renamed from: component1, reason: from getter */
                public final OzonSpannableString getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                /* renamed from: component3, reason: from getter */
                public final ImageDTO getAction1() {
                    return this.action1;
                }

                public final Map<String, TokenizedTrackingInfo> component4() {
                    return this.trackingInfo;
                }

                @NotNull
                public final LinkItem copy(OzonSpannableString title, AtomActionDTO action, ImageDTO action1, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    return new LinkItem(title, action, action1, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LinkItem)) {
                        return false;
                    }
                    LinkItem linkItem = (LinkItem) other;
                    return Intrinsics.d(this.title, linkItem.title) && Intrinsics.d(this.action, linkItem.action) && Intrinsics.d(this.action1, linkItem.action1) && Intrinsics.d(this.trackingInfo, linkItem.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final ImageDTO getAction1() {
                    return this.action1;
                }

                public final OzonSpannableString getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    OzonSpannableString ozonSpannableString = this.title;
                    int hashCode = (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    ImageDTO imageDTO = this.action1;
                    int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode3 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    OzonSpannableString ozonSpannableString = this.title;
                    return "LinkItem(title=" + ((Object) ozonSpannableString) + ", action=" + this.action + ", action1=" + this.action1 + ", trackingInfo=" + this.trackingInfo + ")";
                }
            }

            public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Item() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Topic(@NotNull OzonSpannableString title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "link", type = Item.LinkItem.class), @ProtoOneOfSignature(name = "accordion", type = Item.Accordion.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Item> items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.title = title;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Topic copy$default(Topic topic, OzonSpannableString ozonSpannableString, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = topic.title;
            }
            if ((i11 & 2) != 0) {
                list = topic.items;
            }
            return topic.copy(ozonSpannableString, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Item> component2() {
            return this.items;
        }

        @NotNull
        public final Topic copy(@NotNull OzonSpannableString title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "link", type = Item.LinkItem.class), @ProtoOneOfSignature(name = "accordion", type = Item.Accordion.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Item> items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            return new Topic(title, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Topic)) {
                return false;
            }
            Topic topic = (Topic) other;
            return Intrinsics.d(this.title, topic.title) && Intrinsics.d(this.items, topic.items);
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.items.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            return "Topic(title=" + ((Object) ozonSpannableString) + ", items=" + this.items + ")";
        }
    }

    public FaqWidgetDTO(List<Topic> list) {
        this.topics = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaqWidgetDTO copy$default(FaqWidgetDTO faqWidgetDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = faqWidgetDTO.topics;
        }
        return faqWidgetDTO.copy(list);
    }

    public final List<Topic> component1() {
        return this.topics;
    }

    @NotNull
    public final FaqWidgetDTO copy(List<Topic> topics) {
        return new FaqWidgetDTO(topics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FaqWidgetDTO) && Intrinsics.d(this.topics, ((FaqWidgetDTO) other).topics);
    }

    public final List<Topic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        List<Topic> list = this.topics;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("FaqWidgetDTO(topics=", ")", this.topics);
    }
}
