package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation;

import Ak.b;
import B90.C2616s;
import B90.C2618u;
import Co.a;
import G.g;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000545678BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J^\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/tabs/Tabs;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TopicVO;", "topics", "", "backgroundColor", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "themeImage", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tabs/Tabs;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tabs/Tabs;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "Ljava/util/List;", "getTopics", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getThemeImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "TopicVO", "Content", "AboutVO", "TrailsVO", "WeatherVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SkiResortInfoVO implements c {

    @NotNull
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final long id;

    @NotNull
    private final Tabs tabs;

    @NotNull
    private final ImageDTO themeImage;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final List<TopicVO> topics;

    @InterfaceC6346b
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$AboutVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "texts", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/List;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "equals", "Ljava/util/List;", "getTexts", "()Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AboutVO implements Content {

        @NotNull
        private final List<TextDTO> texts;

        private /* synthetic */ AboutVO(List list) {
            this.texts = list;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AboutVO m1427boximpl(List list) {
            return new AboutVO(list);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static List<? extends TextDTO> m1428constructorimpl(@NotNull List<TextDTO> texts) {
            Intrinsics.checkNotNullParameter(texts, "texts");
            return texts;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1429equalsimpl(List<? extends TextDTO> list, Object obj) {
            return (obj instanceof AboutVO) && Intrinsics.d(list, ((AboutVO) obj).getTexts());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1430hashCodeimpl(List<? extends TextDTO> list) {
            return list.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1431toStringimpl(List<? extends TextDTO> list) {
            return H3.c.a("AboutVO(texts=", ")", list);
        }

        public boolean equals(Object obj) {
            return m1429equalsimpl(this.texts, obj);
        }

        public int hashCode() {
            return m1430hashCodeimpl(this.texts);
        }

        public String toString() {
            return m1431toStringimpl(this.texts);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ List getTexts() {
            return this.texts;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$AboutVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Content {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TopicVO;", "", "", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "content", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopicVO {
        private final CommonControlSettings common;

        @NotNull
        private final Content content;

        @NotNull
        private final String id;

        public TopicVO(@NotNull String id2, @NotNull Content content, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id2;
            this.content = content;
            this.common = commonControlSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopicVO)) {
                return false;
            }
            TopicVO topicVO = (TopicVO) other;
            return Intrinsics.d(this.id, topicVO.id) && Intrinsics.d(this.content, topicVO.content) && Intrinsics.d(this.common, topicVO.common);
        }

        @NotNull
        public final Content getContent() {
            return this.content;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int hashCode = (this.content.hashCode() + (this.id.hashCode() * 31)) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Content content = this.content;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("TopicVO(id=");
            sb2.append(str);
            sb2.append(", content=");
            sb2.append(content);
            sb2.append(", common=");
            return b.g(sb2, commonControlSettings, ")");
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\"#$%&B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b!\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailItemVO;", "items", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$MapVO;", "map", "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailLiftTypeDetailItemVO;", "liftTypeDetailItems", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$MapVO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$MapVO;", "getMap", "()Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$MapVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLiftTypeDetailItems", "TrailItemVO", "TrailDetailItem", "TrailCategoryDetailItemVO", "MapVO", "TrailLiftTypeDetailItemVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrailsVO implements Content {

        @NotNull
        private final TextDTO header;

        @NotNull
        private final List<TrailItemVO> items;

        @NotNull
        private final List<TrailLiftTypeDetailItemVO> liftTypeDetailItems;
        private final MapVO map;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$MapVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapVO {

            @NotNull
            private final ButtonV3DTO button;

            @NotNull
            private final ImageDTO image;

            public MapVO(@NotNull ImageDTO image, @NotNull ButtonV3DTO button) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(button, "button");
                this.image = image;
                this.button = button;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MapVO)) {
                    return false;
                }
                MapVO mapVO = (MapVO) other;
                return Intrinsics.d(this.image, mapVO.image) && Intrinsics.d(this.button, mapVO.button);
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.button.hashCode() + (this.image.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "MapVO(image=" + this.image + ", button=" + this.button + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO;", "", "Space", "Content", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO$Content;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO$Space;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface TrailCategoryDetailItemVO {

            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO$Content;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailDetailItem;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Content implements TrailCategoryDetailItemVO, TrailDetailItem {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final IconDTO icon;

                @NotNull
                private final TextDTO text;

                public Content(@NotNull IconDTO icon, @NotNull TextDTO text) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.icon = icon;
                    this.text = text;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Content)) {
                        return false;
                    }
                    Content content = (Content) other;
                    return Intrinsics.d(this.icon, content.icon) && Intrinsics.d(this.text, content.text);
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO.TrailsVO.TrailDetailItem
                @NotNull
                public IconDTO getIcon() {
                    return this.icon;
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO.TrailsVO.TrailDetailItem
                @NotNull
                public TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode() + (this.icon.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "Content(icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO$Space;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Space implements TrailCategoryDetailItemVO {

                @NotNull
                public static final Space INSTANCE = new Space();

                private Space() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof Space);
                }

                public int hashCode() {
                    return 1792593349;
                }

                @NotNull
                public String toString() {
                    return "Space";
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailDetailItem;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface TrailDetailItem {
            @NotNull
            IconDTO getIcon();

            @NotNull
            TextDTO getText();
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailItemVO;", "", "", "trailColorToken", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailCategoryDetailItemVO;", "categoryDetailItems", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrailColorToken", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCategoryDetailItems", "()Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrailItemVO {

            @NotNull
            private final List<TrailCategoryDetailItemVO> categoryDetailItems;

            @NotNull
            private final TextDTO text;

            @NotNull
            private final String trailColorToken;

            /* JADX WARN: Multi-variable type inference failed */
            public TrailItemVO(@NotNull String trailColorToken, @NotNull TextDTO text, @NotNull List<? extends TrailCategoryDetailItemVO> categoryDetailItems) {
                Intrinsics.checkNotNullParameter(trailColorToken, "trailColorToken");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(categoryDetailItems, "categoryDetailItems");
                this.trailColorToken = trailColorToken;
                this.text = text;
                this.categoryDetailItems = categoryDetailItems;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrailItemVO)) {
                    return false;
                }
                TrailItemVO trailItemVO = (TrailItemVO) other;
                return Intrinsics.d(this.trailColorToken, trailItemVO.trailColorToken) && Intrinsics.d(this.text, trailItemVO.text) && Intrinsics.d(this.categoryDetailItems, trailItemVO.categoryDetailItems);
            }

            @NotNull
            public final List<TrailCategoryDetailItemVO> getCategoryDetailItems() {
                return this.categoryDetailItems;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            public final String getTrailColorToken() {
                return this.trailColorToken;
            }

            public int hashCode() {
                return this.categoryDetailItems.hashCode() + Ns.b.a(this.text, this.trailColorToken.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.trailColorToken;
                TextDTO textDTO = this.text;
                return C2618u.h(a.b("TrailItemVO(trailColorToken=", textDTO, str, ", text=", ", categoryDetailItems="), this.categoryDetailItems, ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailLiftTypeDetailItemVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$TrailsVO$TrailDetailItem;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrailLiftTypeDetailItemVO implements TrailDetailItem {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO icon;

            @NotNull
            private final TextDTO text;

            public TrailLiftTypeDetailItemVO(@NotNull IconDTO icon, @NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.icon = icon;
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrailLiftTypeDetailItemVO)) {
                    return false;
                }
                TrailLiftTypeDetailItemVO trailLiftTypeDetailItemVO = (TrailLiftTypeDetailItemVO) other;
                return Intrinsics.d(this.icon, trailLiftTypeDetailItemVO.icon) && Intrinsics.d(this.text, trailLiftTypeDetailItemVO.text);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO.TrailsVO.TrailDetailItem
            @NotNull
            public IconDTO getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO.TrailsVO.TrailDetailItem
            @NotNull
            public TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.icon.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "TrailLiftTypeDetailItemVO(icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        public TrailsVO(@NotNull List<TrailItemVO> items, MapVO mapVO, @NotNull TextDTO header, @NotNull List<TrailLiftTypeDetailItemVO> liftTypeDetailItems) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(liftTypeDetailItems, "liftTypeDetailItems");
            this.items = items;
            this.map = mapVO;
            this.header = header;
            this.liftTypeDetailItems = liftTypeDetailItems;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailsVO)) {
                return false;
            }
            TrailsVO trailsVO = (TrailsVO) other;
            return Intrinsics.d(this.items, trailsVO.items) && Intrinsics.d(this.map, trailsVO.map) && Intrinsics.d(this.header, trailsVO.header) && Intrinsics.d(this.liftTypeDetailItems, trailsVO.liftTypeDetailItems);
        }

        @NotNull
        public final TextDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<TrailItemVO> getItems() {
            return this.items;
        }

        @NotNull
        public final List<TrailLiftTypeDetailItemVO> getLiftTypeDetailItems() {
            return this.liftTypeDetailItems;
        }

        public final MapVO getMap() {
            return this.map;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            MapVO mapVO = this.map;
            return this.liftTypeDetailItems.hashCode() + Ns.b.a(this.header, (hashCode + (mapVO == null ? 0 : mapVO.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "TrailsVO(items=" + this.items + ", map=" + this.map + ", header=" + this.header + ", liftTypeDetailItems=" + this.liftTypeDetailItems + ")";
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$Content;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO$WeatherItemVO;", "items", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/List;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "WeatherItemVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WeatherVO implements Content {

        @NotNull
        private final List<WeatherItemVO> items;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO$WeatherItemVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", "month", "temp", "snowDepth", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getMonth", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTemp", "getSnowDepth", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WeatherItemVO {

            @NotNull
            private final ImageDTO image;

            @NotNull
            private final TextDTO month;

            @NotNull
            private final TextDTO snowDepth;

            @NotNull
            private final TextDTO temp;

            public WeatherItemVO(@NotNull ImageDTO image, @NotNull TextDTO month, @NotNull TextDTO temp, @NotNull TextDTO snowDepth) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(month, "month");
                Intrinsics.checkNotNullParameter(temp, "temp");
                Intrinsics.checkNotNullParameter(snowDepth, "snowDepth");
                this.image = image;
                this.month = month;
                this.temp = temp;
                this.snowDepth = snowDepth;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WeatherItemVO)) {
                    return false;
                }
                WeatherItemVO weatherItemVO = (WeatherItemVO) other;
                return Intrinsics.d(this.image, weatherItemVO.image) && Intrinsics.d(this.month, weatherItemVO.month) && Intrinsics.d(this.temp, weatherItemVO.temp) && Intrinsics.d(this.snowDepth, weatherItemVO.snowDepth);
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            @NotNull
            public final TextDTO getMonth() {
                return this.month;
            }

            @NotNull
            public final TextDTO getSnowDepth() {
                return this.snowDepth;
            }

            @NotNull
            public final TextDTO getTemp() {
                return this.temp;
            }

            public int hashCode() {
                return this.snowDepth.hashCode() + Ns.b.a(this.temp, Ns.b.a(this.month, this.image.hashCode() * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                ImageDTO imageDTO = this.image;
                TextDTO textDTO = this.month;
                TextDTO textDTO2 = this.temp;
                TextDTO textDTO3 = this.snowDepth;
                StringBuilder d11 = C2616s.d("WeatherItemVO(image=", imageDTO, ", month=", textDTO, ", temp=");
                d11.append(textDTO2);
                d11.append(", snowDepth=");
                d11.append(textDTO3);
                d11.append(")");
                return d11.toString();
            }
        }

        private /* synthetic */ WeatherVO(List list) {
            this.items = list;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WeatherVO m1433boximpl(List list) {
            return new WeatherVO(list);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static List<? extends WeatherItemVO> m1434constructorimpl(@NotNull List<WeatherItemVO> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return items;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1435equalsimpl(List<? extends WeatherItemVO> list, Object obj) {
            return (obj instanceof WeatherVO) && Intrinsics.d(list, ((WeatherVO) obj).getItems());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1436hashCodeimpl(List<? extends WeatherItemVO> list) {
            return list.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1437toStringimpl(List<? extends WeatherItemVO> list) {
            return H3.c.a("WeatherVO(items=", ")", list);
        }

        public boolean equals(Object obj) {
            return m1435equalsimpl(this.items, obj);
        }

        public int hashCode() {
            return m1436hashCodeimpl(this.items);
        }

        public String toString() {
            return m1437toStringimpl(this.items);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ List getItems() {
            return this.items;
        }
    }

    public SkiResortInfoVO(long j11, @NotNull TextDTO title, @NotNull Tabs tabs, @NotNull List<TopicVO> topics, @NotNull String backgroundColor, @NotNull ImageDTO themeImage, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(themeImage, "themeImage");
        this.id = j11;
        this.title = title;
        this.tabs = tabs;
        this.topics = topics;
        this.backgroundColor = backgroundColor;
        this.themeImage = themeImage;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ SkiResortInfoVO copy$default(SkiResortInfoVO skiResortInfoVO, long j11, TextDTO textDTO, Tabs tabs, List list, String str, ImageDTO imageDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = skiResortInfoVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = skiResortInfoVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 4) != 0) {
            tabs = skiResortInfoVO.tabs;
        }
        Tabs tabs2 = tabs;
        if ((i11 & 8) != 0) {
            list = skiResortInfoVO.topics;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            str = skiResortInfoVO.backgroundColor;
        }
        return skiResortInfoVO.copy(j12, textDTO2, tabs2, list2, str, (i11 & 32) != 0 ? skiResortInfoVO.themeImage : imageDTO, (i11 & 64) != 0 ? skiResortInfoVO.common : commonControlSettings);
    }

    @NotNull
    public final SkiResortInfoVO copy(long id2, @NotNull TextDTO title, @NotNull Tabs tabs, @NotNull List<TopicVO> topics, @NotNull String backgroundColor, @NotNull ImageDTO themeImage, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(themeImage, "themeImage");
        return new SkiResortInfoVO(id2, title, tabs, topics, backgroundColor, themeImage, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkiResortInfoVO)) {
            return false;
        }
        SkiResortInfoVO skiResortInfoVO = (SkiResortInfoVO) other;
        return this.id == skiResortInfoVO.id && Intrinsics.d(this.title, skiResortInfoVO.title) && Intrinsics.d(this.tabs, skiResortInfoVO.tabs) && Intrinsics.d(this.topics, skiResortInfoVO.topics) && Intrinsics.d(this.backgroundColor, skiResortInfoVO.backgroundColor) && Intrinsics.d(this.themeImage, skiResortInfoVO.themeImage) && Intrinsics.d(this.common, skiResortInfoVO.common);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Tabs getTabs() {
        return this.tabs;
    }

    @NotNull
    public final ImageDTO getThemeImage() {
        return this.themeImage;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<TopicVO> getTopics() {
        return this.topics;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = Nh.a.b(this.themeImage, g.a(g.b((this.tabs.hashCode() + Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31)) * 31, 31, this.topics), 31, this.backgroundColor), 31);
        CommonControlSettings commonControlSettings = this.common;
        return b11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        Tabs tabs = this.tabs;
        List<TopicVO> list = this.topics;
        String str = this.backgroundColor;
        ImageDTO imageDTO = this.themeImage;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder b11 = TY.a.b("SkiResortInfoVO(id=", j11, ", title=", textDTO);
        b11.append(", tabs=");
        b11.append(tabs);
        b11.append(", topics=");
        b11.append(list);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", themeImage=");
        b11.append(imageDTO);
        b11.append(", common=");
        b11.append(commonControlSettings);
        b11.append(")");
        return b11.toString();
    }
}
