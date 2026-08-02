package com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment;

import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.hfz;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;

/* compiled from: BottomAttachItem.kt */
/* loaded from: classes4.dex */
public abstract class e implements hfz {

    /* compiled from: BottomAttachItem.kt */
    public static final class b extends e {
        public final MediaStoreEntry b;
        public boolean c;
        public final int d;
        public final int e;

        public b(MediaStoreEntry mediaStoreEntry, boolean z, int i, int i2) {
            this.b = mediaStoreEntry;
            this.c = z;
            this.d = i;
            this.e = i2;
        }

        @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e
        public final e a() {
            return new b(this.b, this.c, this.d, this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, qoy.b(this.b.hashCode() * 31, 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gallery(entry=");
            sb.append(this.b);
            sb.append(", isAddedToAttach=");
            sb.append(this.c);
            sb.append(", position=");
            sb.append(this.d);
            sb.append(", totalItemsCount=");
            return vu5.b(sb, this.e, ')');
        }
    }

    public abstract e a();

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    /* compiled from: BottomAttachItem.kt */
    public static abstract class a extends e {
        public final ButtonPanelPosting b;

        /* compiled from: BottomAttachItem.kt */
        public static final class b extends a {
            public final ButtonPanelPosting c;

            public b(ButtonPanelPosting buttonPanelPosting) {
                super(buttonPanelPosting);
                this.c = buttonPanelPosting;
            }

            @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e
            public final e a() {
                return new b(this.c);
            }

            @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e.a
            public final ButtonPanelPosting b() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.c == ((b) obj).c;
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Common(type=" + this.c + ')';
            }
        }

        public a(ButtonPanelPosting buttonPanelPosting) {
            this.b = buttonPanelPosting;
        }

        public ButtonPanelPosting b() {
            return this.b;
        }

        /* compiled from: BottomAttachItem.kt */
        /* renamed from: com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1393a extends a {
            public final ButtonPanelPosting c;
            public final C1394a d;

            /* compiled from: BottomAttachItem.kt */
            /* renamed from: com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e$a$a$a, reason: collision with other inner class name */
            public static final class C1394a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1394a)) {
                        return false;
                    }
                    ((C1394a) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    return Integer.hashCode(R.raw.posting_attach_more_icon_dark) + (Integer.hashCode(R.raw.posting_attach_more_icon) * 31);
                }

                public final String toString() {
                    return "LottieData(animationJsonLight=2131886223, animationJsonDark=2131886224)";
                }
            }

            public AbstractC1393a(ButtonPanelPosting buttonPanelPosting, C1394a c1394a) {
                super(buttonPanelPosting);
                this.c = buttonPanelPosting;
                this.d = c1394a;
            }

            @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e.a
            public final ButtonPanelPosting b() {
                return this.c;
            }

            /* compiled from: BottomAttachItem.kt */
            /* renamed from: com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e$a$a$b */
            public static final class b extends AbstractC1393a {
                public static final b e = new b(ButtonPanelPosting.MORE_BUTTON_TYPE, new C1394a());

                @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e
                public final e a() {
                    return this;
                }
            }
        }
    }
}
