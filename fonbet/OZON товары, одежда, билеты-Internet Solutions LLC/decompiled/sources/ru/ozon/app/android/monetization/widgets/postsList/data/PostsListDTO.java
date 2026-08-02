package ru.ozon.app.android.monetization.widgets.postsList.data;

import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.ui.trustfactors.data.TrustFactorsDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/data/PostsListDTO;", "", "posts", "", "Lru/ozon/app/android/monetization/widgets/postsList/data/PostsListDTO$PostDTO;", "<init>", "(Ljava/util/List;)V", "getPosts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PostDTO", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PostsListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<PostDTO> posts;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/data/PostsListDTO$PostDTO;", "", "items", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<Object> items;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PostDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "trustFactors", type = TrustFactorsDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostDTO copy$default(PostDTO postDTO, List list, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = postDTO.items;
            }
            if ((i11 & 2) != 0) {
                map = postDTO.trackingInfo;
            }
            return postDTO.copy(list, map);
        }

        @NotNull
        public final List<Object> component1() {
            return this.items;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final PostDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "trustFactors", type = TrustFactorsDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new PostDTO(items, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostDTO)) {
                return false;
            }
            PostDTO postDTO = (PostDTO) other;
            return Intrinsics.d(this.items, postDTO.items) && Intrinsics.d(this.trackingInfo, postDTO.trackingInfo);
        }

        @NotNull
        public final List<Object> getItems() {
            return this.items;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return c.d("PostDTO(items=", ", trackingInfo=", ")", this.items, this.trackingInfo);
        }
    }

    public PostsListDTO(@NotNull List<PostDTO> posts) {
        Intrinsics.checkNotNullParameter(posts, "posts");
        this.posts = posts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostsListDTO copy$default(PostsListDTO postsListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = postsListDTO.posts;
        }
        return postsListDTO.copy(list);
    }

    @NotNull
    public final List<PostDTO> component1() {
        return this.posts;
    }

    @NotNull
    public final PostsListDTO copy(@NotNull List<PostDTO> posts) {
        Intrinsics.checkNotNullParameter(posts, "posts");
        return new PostsListDTO(posts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PostsListDTO) && Intrinsics.d(this.posts, ((PostsListDTO) other).posts);
    }

    @NotNull
    public final List<PostDTO> getPosts() {
        return this.posts;
    }

    public int hashCode() {
        return this.posts.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("PostsListDTO(posts=", ")", this.posts);
    }
}
