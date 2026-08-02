package com.vk.typography;

import android.content.Context;
import android.graphics.Typeface;
import com.vk.typography.Font;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.drm0;
import xsna.epx;
import xsna.hl10;
import xsna.uk10;
import xsna.xq;

/* compiled from: FontStyle.kt */
/* loaded from: classes11.dex */
public final class a {
    public final Typeface a;
    public final float b;
    public final TextSizeUnit c;
    public final float d;

    /* compiled from: FontStyle.kt */
    /* renamed from: com.vk.typography.a$a, reason: collision with other inner class name */
    public static final class C1933a {

        /* compiled from: FontStyle.kt */
        /* renamed from: com.vk.typography.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1934a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextSizeUnit.values().length];
                try {
                    iArr[TextSizeUnit.SP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextSizeUnit.PX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static a a(Context context, FontFamily fontFamily, float f, TextSizeUnit textSizeUnit) {
            float f2;
            int i = C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i == 1) {
                f2 = f;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = b.b(f);
            }
            Font.Companion.getClass();
            Font a = Font.a.a(fontFamily, f2);
            return new a(a.k(context), f, textSizeUnit, a.j());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0183  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static a b(Context context, String str, float f, TextSizeUnit textSizeUnit) {
            float f2;
            Font font;
            Regex regex;
            String a;
            Field[] fieldArr;
            Field field;
            int i = C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i == 1) {
                f2 = f;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = b.b(f);
            }
            Font.Companion.getClass();
            if (str == null || drm0.N(str)) {
                font = Font.Regular;
            } else {
                Font font2 = null;
                if (f2 >= 20.0f) {
                    if (str.equals(FontFamily.LIGHT.h())) {
                        font = Font.Light20;
                    } else if (str.equals(FontFamily.REGULAR.h())) {
                        font = Font.Regular20;
                    } else if (str.equals(FontFamily.MEDIUM.h())) {
                        font = Font.Medium20;
                    } else {
                        if (str.equals(FontFamily.BLACK.h())) {
                            font = Font.Black;
                        }
                        font = null;
                    }
                    if (font == null) {
                        regex = Font.fontResourcesRegex;
                        hl10 b = regex.b(str);
                        if (b == null) {
                            font = Font.Regular;
                        } else if (b.a().size() < 2) {
                            font = Font.Regular;
                        } else {
                            uk10 c = b.a().c(1);
                            if (c == null || (a = c.a()) == null) {
                                font = Font.Regular;
                            } else {
                                fieldArr = Font.fontResources;
                                int length = fieldArr.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        field = null;
                                        break;
                                    }
                                    field = fieldArr[i2];
                                    if (epx.f(field.getName(), a)) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (field == null) {
                                    font = Font.Regular;
                                } else {
                                    int i3 = field.getInt(null);
                                    if (f2 >= 20.0f) {
                                        if (i3 == R.font.vk_roboto_light) {
                                            font2 = Font.Light20;
                                        } else if (i3 == R.font.vk_roboto_regular) {
                                            font2 = Font.Regular20;
                                        } else if (i3 == R.font.vk_roboto_medium) {
                                            font2 = Font.Medium20;
                                        } else if (i3 == R.font.vk_roboto_bold) {
                                            font2 = Font.Bold20;
                                        } else if (i3 == R.font.vk_sans_display_regular) {
                                            font2 = Font.DisplayRegular;
                                        } else if (i3 == R.font.vk_sans_display_medium) {
                                            font2 = Font.DisplayMedium;
                                        } else if (i3 == R.font.vk_sans_display_demibold) {
                                            font2 = Font.DisplayDemiBold;
                                        } else if (i3 == R.font.vk_sans_display_bold) {
                                            font2 = Font.DisplayBold;
                                        } else if (i3 == R.font.vk_fortun_af_led7seg_3) {
                                            font2 = Font.FortunAfLed7Seg3;
                                        } else if (i3 == R.font.vk_russoone_regular) {
                                            font2 = Font.RussooneRegular;
                                        }
                                    } else if (f2 >= 16.0f) {
                                        if (i3 == R.font.vk_roboto_light || i3 == R.font.vk_sans_text_16pt_light) {
                                            font2 = Font.Light16;
                                        } else if (i3 == R.font.vk_roboto_regular || i3 == R.font.vk_sans_text_16pt_regular) {
                                            font2 = Font.Regular16;
                                        } else if (i3 == R.font.vk_roboto_medium || i3 == R.font.vk_sans_text_16pt_medium) {
                                            font2 = Font.Medium16;
                                        } else if (i3 == R.font.vk_roboto_bold || i3 == R.font.vk_sans_text_16pt_demibold) {
                                            font2 = Font.Bold16;
                                        } else if (i3 == R.font.vk_sans_display_regular) {
                                            font2 = Font.DisplayRegular;
                                        } else if (i3 == R.font.vk_sans_display_medium) {
                                            font2 = Font.DisplayMedium;
                                        } else if (i3 == R.font.vk_sans_display_demibold) {
                                            font2 = Font.DisplayDemiBold;
                                        } else if (i3 == R.font.vk_sans_display_bold) {
                                            font2 = Font.DisplayBold;
                                        } else if (i3 == R.font.vk_fortun_af_led7seg_3) {
                                            font2 = Font.FortunAfLed7Seg3;
                                        } else if (i3 == R.font.vk_russoone_regular) {
                                            font2 = Font.RussooneRegular;
                                        }
                                    } else if (f2 >= 15.0f) {
                                        if (i3 == R.font.vk_roboto_light || i3 == R.font.vk_sans_text_15pt_light) {
                                            font2 = Font.Light15;
                                        } else if (i3 == R.font.vk_roboto_regular || i3 == R.font.vk_sans_text_15pt_regular) {
                                            font2 = Font.Regular15;
                                        } else if (i3 == R.font.vk_roboto_medium || i3 == R.font.vk_sans_text_15pt_medium) {
                                            font2 = Font.Medium15;
                                        } else if (i3 == R.font.vk_roboto_bold || i3 == R.font.vk_sans_text_15pt_demibold) {
                                            font2 = Font.Bold15;
                                        } else if (i3 == R.font.vk_sans_display_regular) {
                                            font2 = Font.DisplayRegular;
                                        } else if (i3 == R.font.vk_sans_display_medium) {
                                            font2 = Font.DisplayMedium;
                                        } else if (i3 == R.font.vk_sans_display_demibold) {
                                            font2 = Font.DisplayDemiBold;
                                        } else if (i3 == R.font.vk_sans_display_bold) {
                                            font2 = Font.DisplayBold;
                                        } else if (i3 == R.font.vk_fortun_af_led7seg_3) {
                                            font2 = Font.FortunAfLed7Seg3;
                                        } else {
                                            if (i3 == R.font.vk_russoone_regular) {
                                                font2 = Font.RussooneRegular;
                                            }
                                            font2 = null;
                                        }
                                    } else if (f2 >= 14.0f) {
                                        if (i3 == R.font.vk_roboto_light || i3 == R.font.vk_sans_text_15pt_light) {
                                            font2 = Font.Light14;
                                        } else if (i3 == R.font.vk_roboto_regular || i3 == R.font.vk_sans_text_15pt_regular) {
                                            font2 = Font.Regular14;
                                        } else if (i3 == R.font.vk_roboto_medium || i3 == R.font.vk_sans_text_15pt_medium) {
                                            font2 = Font.Medium14;
                                        } else if (i3 == R.font.vk_roboto_bold || i3 == R.font.vk_sans_text_15pt_demibold) {
                                            font2 = Font.Bold14;
                                        } else if (i3 == R.font.vk_sans_display_regular) {
                                            font2 = Font.DisplayRegular;
                                        } else if (i3 == R.font.vk_sans_display_medium) {
                                            font2 = Font.DisplayMedium;
                                        } else if (i3 == R.font.vk_sans_display_demibold) {
                                            font2 = Font.DisplayDemiBold;
                                        } else if (i3 == R.font.vk_sans_display_bold) {
                                            font2 = Font.DisplayBold;
                                        } else if (i3 == R.font.vk_fortun_af_led7seg_3) {
                                            font2 = Font.FortunAfLed7Seg3;
                                        } else {
                                            if (i3 == R.font.vk_russoone_regular) {
                                                font2 = Font.RussooneRegular;
                                            }
                                            font2 = null;
                                        }
                                    } else if (i3 == R.font.vk_roboto_light || i3 == R.font.vk_sans_text_light) {
                                        font2 = Font.Light;
                                    } else if (i3 == R.font.vk_roboto_regular || i3 == R.font.vk_sans_text_regular) {
                                        font2 = Font.Regular;
                                    } else if (i3 == R.font.vk_roboto_medium || i3 == R.font.vk_sans_text_medium) {
                                        font2 = Font.Medium;
                                    } else if (i3 == R.font.vk_roboto_bold || i3 == R.font.vk_sans_text_demibold) {
                                        font2 = Font.Bold;
                                    } else if (i3 == R.font.vk_sans_display_regular) {
                                        font2 = Font.DisplayRegular;
                                    } else if (i3 == R.font.vk_sans_display_medium) {
                                        font2 = Font.DisplayMedium;
                                    } else if (i3 == R.font.vk_sans_display_demibold) {
                                        font2 = Font.DisplayDemiBold;
                                    } else if (i3 == R.font.vk_sans_display_bold) {
                                        font2 = Font.DisplayBold;
                                    } else if (i3 == R.font.vk_fortun_af_led7seg_3) {
                                        font2 = Font.FortunAfLed7Seg3;
                                    } else {
                                        if (i3 == R.font.vk_russoone_regular) {
                                            font2 = Font.RussooneRegular;
                                        }
                                        font2 = null;
                                    }
                                    font = font2 == null ? Font.Regular : font2;
                                }
                            }
                        }
                    }
                } else if (f2 >= 16.0f) {
                    if (str.equals(FontFamily.LIGHT.h())) {
                        font = Font.Light16;
                    } else if (str.equals(FontFamily.REGULAR.h())) {
                        font = Font.Regular16;
                    } else if (str.equals(FontFamily.MEDIUM.h())) {
                        font = Font.Medium16;
                    } else {
                        if (str.equals(FontFamily.BLACK.h())) {
                            font = Font.Black;
                        }
                        font = null;
                    }
                    if (font == null) {
                    }
                } else if (f2 >= 15.0f) {
                    if (str.equals(FontFamily.LIGHT.h())) {
                        font = Font.Light15;
                    } else if (str.equals(FontFamily.REGULAR.h())) {
                        font = Font.Regular15;
                    } else if (str.equals(FontFamily.MEDIUM.h())) {
                        font = Font.Medium15;
                    } else {
                        if (str.equals(FontFamily.BLACK.h())) {
                            font = Font.Black;
                        }
                        font = null;
                    }
                    if (font == null) {
                    }
                } else if (f2 >= 14.0f) {
                    if (str.equals(FontFamily.LIGHT.h())) {
                        font = Font.Light14;
                    } else if (str.equals(FontFamily.REGULAR.h())) {
                        font = Font.Regular14;
                    } else if (str.equals(FontFamily.MEDIUM.h())) {
                        font = Font.Medium14;
                    } else {
                        if (str.equals(FontFamily.BLACK.h())) {
                            font = Font.Black;
                        }
                        font = null;
                    }
                    if (font == null) {
                    }
                } else {
                    if (str.equals(FontFamily.LIGHT.h())) {
                        font = Font.Light;
                    } else if (str.equals(FontFamily.REGULAR.h())) {
                        font = Font.Regular;
                    } else if (str.equals(FontFamily.MEDIUM.h())) {
                        font = Font.Medium;
                    } else {
                        if (str.equals(FontFamily.BLACK.h())) {
                            font = Font.Black;
                        }
                        font = null;
                    }
                    if (font == null) {
                    }
                }
            }
            return new a(font.k(context), f, textSizeUnit, font.j());
        }

        public static /* synthetic */ a c(Context context, String str, float f, int i) {
            if ((i & 8) != 0) {
                f = 13.0f;
            }
            return b(context, str, f, TextSizeUnit.SP);
        }
    }

    public a(Typeface typeface, float f, TextSizeUnit textSizeUnit, float f2) {
        this.a = typeface;
        this.b = f;
        this.c = textSizeUnit;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && Float.compare(this.d, aVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontStyle(typeface=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", sizeUnit=");
        sb.append(this.c);
        sb.append(", letterSpacing=");
        return xq.c(')', this.d, sb);
    }
}
