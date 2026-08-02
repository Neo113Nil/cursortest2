package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.log.L;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.arm0;
import xsna.n8g;
import xsna.swe0;

/* compiled from: SituationalSuggest.kt */
/* loaded from: classes18.dex */
public final class SituationalSuggest extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SituationalSuggest> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final List<String> i;
    public final SituationalImage j;
    public final SituationalImage k;
    public final PlaceholderStyle l;
    public final PlaceholderStyle m;
    public final SituationalPost n;
    public final Profile[] o;
    public final Action p;
    public final String q;

    /* compiled from: SituationalSuggest.kt */
    public static final class PlaceholderStyle extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<PlaceholderStyle> CREATOR = new b();
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        /* compiled from: SituationalSuggest.kt */
        public static final class a {
            public static PlaceholderStyle a(JSONObject jSONObject) {
                return new PlaceholderStyle(b(jSONObject != null ? jSONObject.optString("background_color") : null), b(jSONObject != null ? jSONObject.optString("close_color") : null), b(jSONObject != null ? jSONObject.optString("text_color") : null), b(jSONObject != null ? jSONObject.optString("action_text_color") : null), jSONObject != null ? jSONObject.optBoolean("image_shadow") : false, jSONObject != null ? jSONObject.optBoolean("image_outline") : false, jSONObject != null ? jSONObject.optBoolean("image_rounded") : false);
            }

            public static int b(String str) {
                Integer m;
                if (str != null && str.length() != 0) {
                    try {
                        Integer m2 = arm0.m(16, str.substring(0, 6));
                        return n8g.l(m2 != null ? m2.intValue() : 255, swe0.g((str.length() != 8 || (m = arm0.m(16, str.substring(6, 8))) == null) ? 255 : m.intValue(), 0, 255));
                    } catch (Exception unused) {
                    }
                }
                return 0;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<PlaceholderStyle> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PlaceholderStyle a(Serializer serializer) {
                return new PlaceholderStyle(serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.m(), serializer.m(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceholderStyle[i];
            }
        }

        public PlaceholderStyle(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = z;
            this.g = z2;
            this.h = z3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.S(this.d);
            serializer.S(this.e);
            serializer.L(this.f ? (byte) 1 : (byte) 0);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: SituationalSuggest.kt */
    public static final class Profile extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Profile> CREATOR = new a();
        public final int b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Profile> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Profile a(Serializer serializer) {
                return new Profile(serializer.u(), serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        public Profile(int i, String str, String str2, String str3) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }
    }

    /* compiled from: SituationalSuggest.kt */
    public static final class SituationalImage extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<SituationalImage> CREATOR = new a();
        public final String b;
        public final boolean c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SituationalImage> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SituationalImage a(Serializer serializer) {
                return new SituationalImage(serializer.H(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SituationalImage[i];
            }
        }

        public SituationalImage(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: SituationalSuggest.kt */
    public static final class SituationalPost extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<SituationalPost> CREATOR = new a();
        public final String b;
        public final List<Attachment> c;
        public final Poster d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<SituationalPost> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SituationalPost a(Serializer serializer) {
                String H = serializer.H();
                Poster poster = (Poster) serializer.G(Poster.class.getClassLoader());
                int u = serializer.u();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < u; i++) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(serializer.a()));
                        int i2 = com.vkontakte.android.attachments.a.a;
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        arrayList.add((Attachment) new Serializer.d(dataInputStream).G(Attachment.class.getClassLoader()));
                    } catch (Exception e) {
                        L.i(e);
                    }
                }
                return new SituationalPost(H, arrayList, poster);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SituationalPost[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SituationalPost(String str, List<? extends Attachment> list, Poster poster) {
            this.b = str;
            this.c = list;
            this.d = poster;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            ByteArrayOutputStream byteArrayOutputStream;
            serializer.j0(this.b);
            serializer.i0(this.d);
            List<Attachment> list = this.c;
            serializer.S(list != null ? list.size() : 0);
            if (list == null) {
                return;
            }
            DataOutputStream dataOutputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                for (Attachment attachment : list) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                            try {
                                int i = com.vkontakte.android.attachments.a.a;
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                new Serializer.e(dataOutputStream2).i0(attachment);
                                serializer.M(byteArrayOutputStream.toByteArray());
                                dataOutputStream2.close();
                                byteArrayOutputStream.close();
                                dataOutputStream = dataOutputStream2;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                            } catch (Exception unused) {
                                dataOutputStream = dataOutputStream2;
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                dataOutputStream = dataOutputStream2;
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception unused3) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                    }
                }
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
            } catch (Exception unused4) {
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SituationalSuggest> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SituationalSuggest a(Serializer serializer) {
            return new SituationalSuggest(serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.h(), (SituationalImage) serializer.G(SituationalImage.class.getClassLoader()), (SituationalImage) serializer.G(SituationalImage.class.getClassLoader()), (PlaceholderStyle) serializer.G(PlaceholderStyle.class.getClassLoader()), (PlaceholderStyle) serializer.G(PlaceholderStyle.class.getClassLoader()), (SituationalPost) serializer.G(SituationalPost.class.getClassLoader()), (Profile[]) serializer.i(Profile.CREATOR), (Action) serializer.G(Action.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SituationalSuggest[i];
        }
    }

    public SituationalSuggest(int i, String str, String str2, String str3, String str4, String str5, int i2, List<String> list, SituationalImage situationalImage, SituationalImage situationalImage2, PlaceholderStyle placeholderStyle, PlaceholderStyle placeholderStyle2, SituationalPost situationalPost, Profile[] profileArr, Action action, String str6) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i2;
        this.i = list;
        this.j = situationalImage;
        this.k = situationalImage2;
        this.l = placeholderStyle;
        this.m = placeholderStyle2;
        this.n = situationalPost;
        this.o = profileArr;
        this.p = action;
        this.q = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.h);
        serializer.l0(this.i);
        serializer.i0(this.j);
        serializer.i0(this.k);
        serializer.i0(this.l);
        serializer.i0(this.m);
        serializer.i0(this.n);
        serializer.n0(this.o);
        serializer.i0(this.p);
        serializer.j0(this.q);
    }
}
