package com.vk.profile.core.tabs.ui.music;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.arb0;
import xsna.asp;
import xsna.bwt0;
import xsna.drm0;
import xsna.epx;
import xsna.gko;
import xsna.hbh0;
import xsna.jp5;
import xsna.k1u0;
import xsna.ms9;
import xsna.oq;
import xsna.tlo0;
import xsna.vif0;
import xsna.x7g;
import xsna.zoj0;
import xsna.zrp;

/* compiled from: ProfileContentAudioAlbumsAdapter.kt */
/* loaded from: classes5.dex */
public final class ProfileContentAudioAlbumsAdapter extends zoj0<Playlist, a> {
    public final String e;
    public final arb0 f;
    public Size g = Size.MatchParent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileContentAudioAlbumsAdapter.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size MatchParent;

        static {
            Size size = new Size("Large", 0);
            Large = size;
            Size size2 = new Size("MatchParent", 1);
            MatchParent = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: ProfileContentAudioAlbumsAdapter.kt */
    public static final class a extends vif0<Playlist> {
        public final VkTile n;
        public final String o;

        /* compiled from: ProfileContentAudioAlbumsAdapter.kt */
        /* renamed from: com.vk.profile.core.tabs.ui.music.ProfileContentAudioAlbumsAdapter$a$a, reason: collision with other inner class name */
        public static final class C1646a implements VkTile.g {
            public final Context a;
            public final Size b;
            public final ThumbsImageView c;

            /* compiled from: ProfileContentAudioAlbumsAdapter.kt */
            /* renamed from: com.vk.profile.core.tabs.ui.music.ProfileContentAudioAlbumsAdapter$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1647a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Size.values().length];
                    try {
                        iArr[Size.Large.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Size.MatchParent.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C1646a(Context context, Size size) {
                this.a = context;
                this.b = size;
                XmlResourceParser xml = context.getResources().getXml(R.xml.community_item_content_audio_album_attrs);
                try {
                    xml.next();
                    xml.nextTag();
                } catch (Exception e) {
                    L.j(e, "Error when creating ThumbsImageView with attrs in ProfileContentAudioAlbumsAdapter");
                }
                this.c = new ThumbsImageView(context, Xml.asAttributeSet(xml), 4, 0);
            }

            @Override // com.vk.core.view.components.tile.VkTile.g
            public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
                ThumbsImageView thumbsImageView = this.c;
                ViewGroup.LayoutParams layoutParams = thumbsImageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                int i = C1647a.$EnumSwitchMapping$0[this.b.ordinal()];
                if (i == 1) {
                    Context context = this.a;
                    ((ViewGroup.MarginLayoutParams) bVar).width = hbh0.b(128, context);
                    ((ViewGroup.MarginLayoutParams) bVar).height = hbh0.b(128, context);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ViewGroup.MarginLayoutParams) bVar).width = -1;
                    ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                }
                bVar.G = "1:1";
                thumbsImageView.setLayoutParams(bVar);
                b bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 != null) {
                    Thumb thumb = bVar2.a;
                    if (thumb != null) {
                        thumbsImageView.setThumb(thumb);
                    } else {
                        thumbsImageView.setThumbs(bVar2.b);
                    }
                }
            }

            @Override // com.vk.core.view.components.tile.VkTile.g
            public final View getView() {
                return this.c;
            }
        }

        /* compiled from: ProfileContentAudioAlbumsAdapter.kt */
        public static final class b implements VkTile.h {
            public final Thumb a;
            public final List<Thumb> b;

            public b(Thumb thumb, List<Thumb> list) {
                this.a = thumb;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                Thumb thumb = this.a;
                int hashCode = (thumb == null ? 0 : thumb.hashCode()) * 31;
                List<Thumb> list = this.b;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioAlbumViewParams(photo=");
                sb.append(this.a);
                sb.append(", thumbs=");
                return ms9.a(')', sb, this.b);
            }
        }

        public a(VkTile vkTile, String str, arb0 arb0Var, Size size) {
            super(vkTile);
            this.n = vkTile;
            this.o = str;
            this.itemView.getContext();
            bwt0.i0(vkTile, new jp5(20, arb0Var, this));
            vkTile.setVisualContentController(new C1646a(this.itemView.getContext(), size));
        }

        @Override // xsna.vif0
        public final void i6(Playlist playlist) {
            Playlist playlist2 = playlist;
            String str = playlist2.o;
            gko gkoVar = playlist2.k ? new gko(R.drawable.vk_icon_explicit_16) : null;
            tlo0.a aVar = tlo0.Companion;
            String str2 = playlist2.h;
            if (str2 == null) {
                str2 = "";
            }
            VkTile.e eVar = new VkTile.e(oq.d(aVar, str2), 0, null, null, gkoVar, new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), null, 414);
            VkTile vkTile = this.n;
            vkTile.setTitle(eVar);
            if (str == null || drm0.N(str)) {
                str = this.o;
            }
            vkTile.setSubtitle(new VkTile.d(new tlo0.h(str != null ? str : ""), 0, null, null, null, null, 62));
            vkTile.setVisualContentParams(new b(playlist2.m, playlist2.p));
            vkTile.setAlpha(playlist2.Fb() ? 0.5f : 1.0f);
        }
    }

    public ProfileContentAudioAlbumsAdapter(String str, arb0 arb0Var) {
        this.e = str;
        this.f = arb0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkTile vkTile = new VkTile(viewGroup.getContext(), null, 6);
        vkTile.setTextAlignment(VkTile.TextAlignment.Start);
        return new a(vkTile, this.e, this.f, this.g);
    }
}
