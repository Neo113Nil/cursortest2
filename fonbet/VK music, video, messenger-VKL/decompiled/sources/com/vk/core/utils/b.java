package com.vk.core.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import xsna.e3m;
import xsna.e43;
import xsna.eni0;
import xsna.epx;
import xsna.gzs;
import xsna.iah0;
import xsna.j5g;
import xsna.maz;
import xsna.pvo0;
import xsna.rik0;
import xsna.s3q0;
import xsna.s490;
import xsna.uqm0;
import xsna.xwk;
import xsna.ylw;

/* compiled from: VideoFormatter.kt */
/* loaded from: classes17.dex */
public interface b {

    /* compiled from: VideoFormatter.kt */
    public static final class a {
        public final CharSequence a;
        public final String b;
        public final int c;
        public final CharSequence d;

        public a(String str, String str2, int i, String str3) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
        }
    }

    /* compiled from: VideoFormatter.kt */
    /* renamed from: com.vk.core.utils.b$b, reason: collision with other inner class name */
    public static final class C0795b implements b {
        public static final /* synthetic */ C0795b a = new C0795b();

        public static String d(long j, List list) {
            String str;
            String str2 = "";
            if (list == null || (str = j5g.g0(list, ", ", null, null, 0, new eni0(10), 30)) == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            Calendar d = pvo0.d();
            d.setTimeInMillis(j * 1000);
            sb.append(String.valueOf(d.get(1)));
            sb.append(' ');
            if (str.length() > 0) {
                str2 = "· " + ((Object) str);
            }
            sb.append((Object) str2);
            return sb.toString();
        }

        public static SpannableString f(TitleAction titleAction, Context context, String str, int i, int i2, CharSequence charSequence) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (charSequence != null) {
                spannableStringBuilder.append(charSequence);
            }
            SpannableString spannableString = new SpannableString(spannableStringBuilder);
            ListBuilder e = e43.e();
            e.add(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_link, context)));
            final String str2 = titleAction.d;
            if (str2 != null && epx.f(titleAction.c, "link")) {
                e.add(new URLSpan(str2) { // from class: com.vk.core.utils.VideoFormatter$Companion$toSpannableTitle$spans$1$1$urlSpan$1
                    public final /* synthetic */ String b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str2);
                        this.b = str2;
                    }

                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        maz.c(xwk.d().e(), view.getContext(), this.b, LaunchContext.A, null, null, 24);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                });
            }
            ListIterator listIterator = e.g().listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    return spannableString;
                }
                spannableString.setSpan(aVar.next(), i, i2, 18);
            }
        }

        @Override // com.vk.core.utils.b
        public final SpannableStringBuilder a(Context context, VideoFile videoFile) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ylw ylwVar = new ylw(R.drawable.vk_icon_view_12);
            ylwVar.c = 3;
            ylwVar.h = R.attr.vk_ui_icon_tertiary;
            ylwVar.f = iah0.a(-1);
            spannableStringBuilder.append((CharSequence) ylwVar.b(context));
            spannableStringBuilder.append((CharSequence) " ");
            if (uqm0.g(videoFile.L8())) {
                spannableStringBuilder.append((CharSequence) uqm0.f(videoFile.L8()));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) String.valueOf(videoFile.L8()));
            return spannableStringBuilder;
        }

        @Override // com.vk.core.utils.b
        public final String b(Context context, VideoFile videoFile) {
            return uqm0.g(videoFile.L8()) ? context.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()));
        }

        @Override // com.vk.core.utils.b
        public final CharSequence c(Context context, MusicVideoFile musicVideoFile) {
            return s490.d(context, s490.i(musicVideoFile.B1), s490.c(musicVideoFile.C1), R.attr.vk_ui_text_secondary);
        }

        public final CharSequence e(Context context, a aVar, gzs<s3q0> gzsVar) {
            CharSequence charSequence = aVar.d;
            String str = aVar.b;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence2 = aVar.a;
            if (charSequence2 != null) {
                spannableStringBuilder.append(charSequence2);
                spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
                spannableStringBuilder.append((CharSequence) context.getString(R.string.dot_separator));
                spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
            }
            ylw ylwVar = new ylw(R.drawable.vk_icon_archive_outline_16);
            ylwVar.c = 3;
            ylwVar.d(R.color.vk_gray_600);
            spannableStringBuilder.append((CharSequence) ylwVar.b(context));
            spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
            spannableStringBuilder.append((CharSequence) str);
            if (charSequence != null) {
                spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
                spannableStringBuilder.append((CharSequence) context.getString(R.string.dot_separator));
                spannableStringBuilder.append((CharSequence) rik0.b(6.0f));
                spannableStringBuilder.append(charSequence);
            }
            int i = aVar.c;
            SpannableString spannableString = new SpannableString(spannableStringBuilder);
            spannableString.setSpan(new c(i, gzsVar), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            return spannableString;
        }
    }

    SpannableStringBuilder a(Context context, VideoFile videoFile);

    String b(Context context, VideoFile videoFile);

    CharSequence c(Context context, MusicVideoFile musicVideoFile);
}
