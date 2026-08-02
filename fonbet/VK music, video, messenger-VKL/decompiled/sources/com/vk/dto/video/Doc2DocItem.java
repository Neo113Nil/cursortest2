package com.vk.dto.video;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: Doc2DocItem.kt */
/* loaded from: classes18.dex */
public abstract class Doc2DocItem implements Serializer.StreamParcelable {
    public final List<VideoFile> b;

    /* compiled from: Doc2DocItem.kt */
    public static final class Banner extends Doc2DocItem {
        public static final Serializer.c<Banner> CREATOR = new a();
        public final String c;
        public final String d;
        public final String e;
        public final Action f;
        public final String g;
        public final Integer h;
        public final String i;
        public final Boolean j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Doc2DocItem.kt */
        public static final class Action {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final a Companion;
            public static final Action OPEN_SECTION;
            public static final Action OPEN_URL;
            private final String key;

            /* compiled from: Doc2DocItem.kt */
            public static final class a {
            }

            static {
                Action action = new Action("OPEN_URL", 0, "open_url");
                OPEN_URL = action;
                Action action2 = new Action("OPEN_SECTION", 1, "open_section");
                OPEN_SECTION = action2;
                Action[] actionArr = {action, action2};
                $VALUES = actionArr;
                $ENTRIES = new asp(actionArr);
                Companion = new a();
            }

            public Action(String str, int i, String str2) {
                this.key = str2;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }

            public final String h() {
                return this.key;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Banner> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Banner a(Serializer serializer) {
                Action action;
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String str = H;
                String H2 = serializer.H();
                String H3 = serializer.H();
                Action.a aVar = Action.Companion;
                String H4 = serializer.H();
                aVar.getClass();
                if (H4 != null && H4.length() != 0) {
                    Action[] values = Action.values();
                    int length = values.length;
                    for (int i = 0; i < length; i++) {
                        action = values[i];
                        if (epx.f(action.h(), H4)) {
                            break;
                        }
                    }
                }
                action = null;
                Action action2 = action;
                String H5 = serializer.H();
                int u = serializer.u();
                return new Banner(str, H2, H3, action2, H5, Integer.valueOf(u), serializer.H(), Boolean.valueOf(serializer.m()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Banner[i];
            }
        }

        public Banner(String str, String str2, String str3, Action action, String str4, Integer num, String str5, Boolean bool) {
            super(EmptyList.b, null);
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = action;
            this.g = str4;
            this.h = num;
            this.i = str5;
            this.j = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            Action action = this.f;
            serializer.j0(action != null ? action.h() : null);
            serializer.j0(this.g);
            Integer num = this.h;
            serializer.S(num != null ? num.intValue() : 0);
            serializer.j0(this.i);
            Boolean bool = this.j;
            serializer.L(bool != null ? bool.booleanValue() : (byte) 0);
        }
    }

    /* compiled from: Doc2DocItem.kt */
    public static final class Carousel extends Doc2DocItem {
        public static final Serializer.c<Carousel> CREATOR = new a();
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Carousel> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Carousel a(Serializer serializer) {
                List k = serializer.k(VideoFile.class);
                if (k == null) {
                    k = EmptyList.b;
                }
                return new Carousel(k, serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Carousel[i];
            }
        }

        public Carousel(List<? extends VideoFile> list, String str) {
            super(list, null);
            this.c = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.W(this.b);
            serializer.j0(this.c);
        }

        public /* synthetic */ Carousel(List list, String str, int i, zcl zclVar) {
            this(list, (i & 2) != 0 ? null : str);
        }
    }

    /* compiled from: Doc2DocItem.kt */
    public static final class Floor extends Doc2DocItem {
        public static final Serializer.c<Floor> CREATOR = new a();
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Floor> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Floor a(Serializer serializer) {
                List k = serializer.k(VideoFile.class);
                if (k == null) {
                    k = EmptyList.b;
                }
                return new Floor(k, serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Floor[i];
            }
        }

        public Floor(List<? extends VideoFile> list, String str) {
            super(list, null);
            this.c = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.W(this.b);
            serializer.j0(this.c);
        }

        public /* synthetic */ Floor(List list, String str, int i, zcl zclVar) {
            this(list, (i & 2) != 0 ? null : str);
        }
    }

    /* compiled from: Doc2DocItem.kt */
    public static final class Video extends Doc2DocItem {
        public static final Serializer.c<Video> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Video> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Video a(Serializer serializer) {
                List k = serializer.k(VideoFile.class);
                if (k == null) {
                    k = EmptyList.b;
                }
                return new Video(k);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Video[i];
            }
        }

        public Video(List<? extends VideoFile> list) {
            super(list, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.W(this.b);
        }
    }

    public Doc2DocItem() {
        throw null;
    }

    public Doc2DocItem(List list, zcl zclVar) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* compiled from: Doc2DocItem.kt */
    public static final class Stub extends Doc2DocItem {
        public static final Serializer.c<Stub> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Stub> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Stub a(Serializer serializer) {
                return new Stub(null, 1, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stub[i];
            }
        }

        public Stub(List list, int i, zcl zclVar) {
            this((i & 1) != 0 ? EmptyList.b : list);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.W(this.b);
        }

        public Stub(List<? extends VideoFile> list) {
            super(list, null);
        }
    }
}
