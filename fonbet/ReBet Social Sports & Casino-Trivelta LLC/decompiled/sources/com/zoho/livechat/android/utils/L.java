package com.zoho.livechat.android.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.C3937f;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rd.C6218a;
import xe.C6822a;

/* loaded from: classes4.dex */
public abstract class L {

    public class a extends C3937f.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44401b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i10) {
            super(str);
            this.f44401b = i10;
        }

        @Override // com.zoho.livechat.android.utils.C3937f.c, android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.f44401b);
        }
    }

    public class b extends C3937f.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10) {
            super(str);
            this.f44402b = i10;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.f44402b);
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown;

        static {
            int[] iArr = new int[Message.c.values().length];
            $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown = iArr;
            try {
                iArr[Message.c.Emojis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Blockquote.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Heading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.CodeBlock.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Quote.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Bold.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Underline.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Italic.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Strike.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[Message.c.Bullet.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static StringBuilder A(StringBuilder sb2) {
        return C(u(w(r(v(y(sb2))))));
    }

    public static StringBuilder B(StringBuilder sb2) {
        return t(D(x(E(s(sb2)))));
    }

    public static StringBuilder C(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\`(.*?\\S *)?\\`(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))", 8);
        Matcher matcher = compile.matcher(sb2);
        if (matcher.find()) {
            do {
                try {
                    sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                    matcher = compile.matcher(sb2);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return sb2;
                }
            } while (matcher.find());
        }
        return sb2;
    }

    public static StringBuilder D(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\~(.*?\\S *)?\\~(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(sb2);
        if (!matcher.find()) {
            return sb2;
        }
        do {
            try {
                sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                sb2 = B(sb2);
                matcher = compile.matcher(sb2);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return sb2;
            }
        } while (matcher.find());
        return sb2;
    }

    public static StringBuilder E(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\_{2}(.*?\\S *)?\\_{2}(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(sb2);
        if (!matcher.find()) {
            return sb2;
        }
        do {
            try {
                sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                sb2 = B(sb2);
                matcher = compile.matcher(sb2);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return sb2;
            }
        } while (matcher.find());
        return sb2;
    }

    public static SpannableStringBuilder a(Context context, SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, boolean z10) {
        return c(context, d(context, spannableStringBuilder, i12), i10, i11, i12, z10);
    }

    public static SpannableStringBuilder b(Context context, SpannableStringBuilder spannableStringBuilder, Integer num, int i10, int i11, boolean z10, float f10, boolean z11, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                switch (c.$SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Markdown[((Message.c) it.next()).ordinal()]) {
                    case 1:
                        spannableStringBuilder = Vf.b.i().e(spannableStringBuilder, Float.valueOf(f10));
                        break;
                    case 2:
                        spannableStringBuilder = m(num.intValue(), spannableStringBuilder);
                        break;
                    case 3:
                        spannableStringBuilder = e(context, i10, spannableStringBuilder, i11);
                        break;
                    case 4:
                        spannableStringBuilder = j(spannableStringBuilder, z10);
                        break;
                    case 5:
                        spannableStringBuilder = h(context, spannableStringBuilder, i11);
                        break;
                    case 6:
                        spannableStringBuilder = o(spannableStringBuilder);
                        break;
                    case 7:
                        spannableStringBuilder = f(context, spannableStringBuilder, i11);
                        break;
                    case 8:
                        spannableStringBuilder = q(context, spannableStringBuilder, i11);
                        break;
                    case 9:
                        spannableStringBuilder = k(context, spannableStringBuilder, i11, z11);
                        break;
                    case 10:
                        spannableStringBuilder = p(context, spannableStringBuilder, i11);
                        break;
                    case 11:
                        spannableStringBuilder = g(i11, spannableStringBuilder);
                        break;
                }
            }
        }
        return i(num.intValue(), spannableStringBuilder);
    }

    public static SpannableStringBuilder c(Context context, SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, boolean z10) {
        return o(h(context, j(e(context, i11, m(i10, spannableStringBuilder), i12), z10), i12));
    }

    public static SpannableStringBuilder d(Context context, SpannableStringBuilder spannableStringBuilder, int i10) {
        return n(g(i10, p(context, k(context, q(context, f(context, spannableStringBuilder, i10), i10), i10, false), i10)), i10);
    }

    public static SpannableStringBuilder e(Context context, int i10, SpannableStringBuilder spannableStringBuilder, int i11) {
        Pattern compile = Pattern.compile("(?:^|\\n)(!(.+?))(?:\\n|$)", 8);
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (!matcher.find()) {
            return spannableStringBuilder;
        }
        do {
            try {
                StringBuilder sb2 = new StringBuilder(matcher.group(2));
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                spannableStringBuilder.replace(matcher.start(1), matcher.end(1), (CharSequence) sb2);
                int start = matcher.start(1);
                int start2 = matcher.start(1) + sb2.length();
                if (i10 != 0) {
                    spannableStringBuilder.setSpan(new C3942k(i10, C6218a.b(3.0f), C6218a.b(8.0f)), start, start2, 33);
                }
                spannableStringBuilder = d(context, spannableStringBuilder, i11);
                matcher = compile.matcher(spannableStringBuilder);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        } while (matcher.find());
        if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.replace(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), (CharSequence) "");
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f(Context context, SpannableStringBuilder spannableStringBuilder, int i10) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\*(\\S.*?\\S *)?\\*(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (!matcher.find()) {
            return spannableStringBuilder;
        }
        do {
            try {
                int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                spannableStringBuilder.replace(start, matcher.end(), (CharSequence) matcher.group(2));
                spannableStringBuilder.setSpan(new StyleSpan(1), start, matcher.group(2).length() + start, 33);
                spannableStringBuilder = d(context, spannableStringBuilder, i10);
                matcher = compile.matcher(spannableStringBuilder);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        } while (matcher.find());
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder g(int i10, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.toString().replaceAll("\\s", "").replaceAll("\\*", "").length() != 0) {
            Pattern compile = Pattern.compile("(^\\s|\\n|^)((\\*) ((.*?\\S *)*))", 8);
            Matcher matcher = compile.matcher(spannableStringBuilder);
            if (matcher.find()) {
                do {
                    try {
                        int start = matcher.start(2);
                        spannableStringBuilder.replace(start, matcher.end(2), (CharSequence) matcher.group(4));
                        spannableStringBuilder.setSpan(new C3940i(C6218a.b(10.0f), C6218a.b(5.0f), i10), start, matcher.group(4).length() + start, 33);
                        matcher = compile.matcher(spannableStringBuilder);
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                        return spannableStringBuilder;
                    }
                } while (matcher.find());
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder h(Context context, SpannableStringBuilder spannableStringBuilder, int i10) {
        Pattern compile = Pattern.compile("(^|\\s)`{3}((?:(?:.*?$)\\n)?(?:[\\s\\S]*?))`{3}(?=$|\\s)");
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (!matcher.find()) {
            return spannableStringBuilder;
        }
        do {
            try {
                int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                spannableStringBuilder.replace(start, matcher.end(), (CharSequence) matcher.group(2));
                spannableStringBuilder.setSpan(new CustomTypefaceSpan(C6218a.F()), start, matcher.group(2).length() + start, 33);
                spannableStringBuilder = d(context, spannableStringBuilder, i10);
                matcher = compile.matcher(spannableStringBuilder);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        } while (matcher.find());
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder i(int i10, SpannableStringBuilder spannableStringBuilder) {
        C6822a.r();
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder j(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        Pattern compile = Pattern.compile("(?:^|\\n)((#{1,6}) (.*?\\S *))(?:\\n|$)", 8);
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (matcher.find()) {
            try {
                int[] iArr = {28, 26, 24, 22, 20, 18};
                do {
                    String replaceFirst = matcher.group(1).replaceFirst("\\s++$", "");
                    int start = matcher.start(1) + (replaceFirst.length() - replaceFirst.trim().length());
                    spannableStringBuilder.replace(start, matcher.end(1), spannableStringBuilder.subSequence(matcher.start(3), matcher.end(3)));
                    int length = matcher.group(3).length() + start;
                    spannableStringBuilder.setSpan(new StyleSpan(1), start, length, 33);
                    if (!z10) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iArr[matcher.group(2).length() - 1], true), start, length, 33);
                    }
                    matcher = compile.matcher(spannableStringBuilder);
                } while (matcher.find());
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder k(Context context, SpannableStringBuilder spannableStringBuilder, int i10, boolean z10) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\_(.*?\\S *)?\\_(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (!matcher.find()) {
            return spannableStringBuilder;
        }
        while (true) {
            try {
                int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                spannableStringBuilder.replace(start, matcher.end(), (CharSequence) matcher.group(2));
                int length = matcher.group(2).length() + start;
                spannableStringBuilder.setSpan(new StyleSpan(2), start, length, 33);
                spannableStringBuilder = d(context, spannableStringBuilder, i10);
                Matcher matcher2 = compile.matcher(spannableStringBuilder);
                if (z10 && spannableStringBuilder.length() == length) {
                    spannableStringBuilder.append(" ");
                }
                if (!matcher2.find()) {
                    return spannableStringBuilder;
                }
                matcher = matcher2;
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        }
    }

    public static SpannableStringBuilder l(SpannableStringBuilder spannableStringBuilder, String str) {
        Pattern compile = Pattern.compile("(^|[\\n])(\\*{3,}|\\-{3,})(?=$|[\\n])(.*)");
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (matcher.find()) {
            do {
                try {
                    spannableStringBuilder.replace(matcher.start(2), matcher.end(2), (CharSequence) str);
                    matcher = compile.matcher(spannableStringBuilder);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return spannableStringBuilder;
                }
            } while (matcher.find());
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder m(int i10, SpannableStringBuilder spannableStringBuilder) {
        String group;
        Matcher matcher = Pattern.compile("(^|\\s|<br>)\\[((?:(?!\\]\\(.+?\\)).)+?)\\]\\(((https?:\\/\\/(?:www\\.)?|www\\.).*?)\\)(?=$|\\s|\\.|\\,|\\n|<br>|<span)").matcher(spannableStringBuilder);
        if (matcher.find()) {
            do {
                try {
                    if (matcher.group(4).equals("www.")) {
                        group = "http://" + matcher.group(3);
                    } else {
                        group = matcher.group(3);
                    }
                    int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                    int length = matcher.group(2).length() + start;
                    spannableStringBuilder.replace(start, matcher.end(), (CharSequence) matcher.group(2));
                    spannableStringBuilder.setSpan(new a(group, i10), start, length, 33);
                    matcher.reset(spannableStringBuilder);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return spannableStringBuilder;
                }
            } while (matcher.find());
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder n(SpannableStringBuilder spannableStringBuilder, int i10) {
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder o(SpannableStringBuilder spannableStringBuilder) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\`(.*?\\S *)?\\`(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))", 8);
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (matcher.find()) {
            do {
                try {
                    int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                    String str = "“" + matcher.group(2) + "”";
                    spannableStringBuilder.replace(start, matcher.end(), (CharSequence) str);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#f65b5b")), start, str.length() + start, 33);
                    matcher = compile.matcher(spannableStringBuilder);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return spannableStringBuilder;
                }
            } while (matcher.find());
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder p(Context context, SpannableStringBuilder spannableStringBuilder, int i10) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\~(.*?\\S *)?\\~(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (!matcher.find()) {
            return spannableStringBuilder;
        }
        do {
            try {
                int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                spannableStringBuilder.replace(start, matcher.end(), (CharSequence) matcher.group(2));
                spannableStringBuilder.setSpan(new StrikethroughSpan(), start, matcher.group(2).length() + start, 33);
                spannableStringBuilder = d(context, spannableStringBuilder, i10);
                matcher = compile.matcher(spannableStringBuilder);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        } while (matcher.find());
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder q(Context context, SpannableStringBuilder spannableStringBuilder, int i10) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\_{2}(.*?\\S *)?\\_{2}(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(spannableStringBuilder);
        if (!matcher.find()) {
            return spannableStringBuilder;
        }
        do {
            try {
                int start = matcher.start() + (matcher.group().length() - matcher.group().trim().length());
                spannableStringBuilder.replace(start, matcher.end(), (CharSequence) matcher.group(2));
                spannableStringBuilder.setSpan(new UnderlineSpan(), start, matcher.group(2).length() + start, 33);
                spannableStringBuilder = d(context, spannableStringBuilder, i10);
                matcher = compile.matcher(spannableStringBuilder);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return spannableStringBuilder;
            }
        } while (matcher.find());
        return spannableStringBuilder;
    }

    public static StringBuilder r(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(?:^|\\n)(!(.+?))(?:\\n|$)", 8);
        Matcher matcher = compile.matcher(sb2);
        if (!matcher.find()) {
            return sb2;
        }
        do {
            try {
                sb2.replace(matcher.start(1), matcher.end(1), matcher.group(2));
                sb2 = B(sb2);
                matcher = compile.matcher(sb2);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return sb2;
            }
        } while (matcher.find());
        return sb2;
    }

    public static StringBuilder s(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\*(\\S.*?\\S *)?\\*(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(sb2);
        if (!matcher.find()) {
            return sb2;
        }
        do {
            try {
                sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                sb2 = B(sb2);
                matcher = compile.matcher(sb2);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return sb2;
            }
        } while (matcher.find());
        return sb2;
    }

    public static StringBuilder t(StringBuilder sb2) {
        if (sb2.toString().replaceAll("\\s", "").replaceAll("\\*", "").length() != 0) {
            Pattern compile = Pattern.compile("(^\\s|\\n|^)((\\*) ((.*?\\S *)*))", 8);
            Matcher matcher = compile.matcher(sb2);
            if (matcher.find()) {
                do {
                    try {
                        sb2.replace(matcher.start(2), matcher.end(2), matcher.group(4));
                        matcher = compile.matcher(sb2);
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                        return sb2;
                    }
                } while (matcher.find());
            }
        }
        return sb2;
    }

    public static StringBuilder u(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s)`{3}((?:(?:.*?$)\\n)?(?:[\\s\\S]*?))`{3}(?=$|\\s)");
        Matcher matcher = compile.matcher(sb2);
        if (!matcher.find()) {
            return sb2;
        }
        do {
            try {
                sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                sb2 = B(sb2);
                matcher = compile.matcher(sb2);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return sb2;
            }
        } while (matcher.find());
        return sb2;
    }

    public static StringBuilder v(StringBuilder sb2) {
        try {
            C6822a.r();
            return sb2;
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return sb2;
        }
    }

    public static StringBuilder w(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(?:^|\\n)((#{1,6}) (.*?\\S *))(?:\\n|$)", 8);
        Matcher matcher = compile.matcher(sb2);
        if (matcher.find()) {
            do {
                try {
                    sb2.replace(matcher.start(1) + (matcher.group(1).length() - matcher.group(1).trim().length()), matcher.end(1), matcher.group(3));
                    matcher = compile.matcher(sb2);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return sb2;
                }
            } while (matcher.find());
        }
        return sb2;
    }

    public static StringBuilder x(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s|[{\\[])\\_(.*?\\S *)?\\_(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))");
        Matcher matcher = compile.matcher(sb2);
        if (!matcher.find()) {
            return sb2;
        }
        do {
            try {
                sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                sb2 = B(sb2);
                matcher = compile.matcher(sb2);
            } catch (Exception e10) {
                LiveChatUtil.log(e10);
                return sb2;
            }
        } while (matcher.find());
        return sb2;
    }

    public static StringBuilder y(StringBuilder sb2) {
        Pattern compile = Pattern.compile("(^|\\s|<br>)\\[((?:(?!\\]\\(.+?\\)).)+?)\\]\\(((https?:\\/\\/(?:www\\.)?|www\\.).*?)\\)(?=$|\\s|\\.|\\,|\\n|<br>|<span)");
        Matcher matcher = compile.matcher(sb2);
        if (matcher.find()) {
            do {
                try {
                    sb2.replace(matcher.start() + (matcher.group().length() - matcher.group().trim().length()), matcher.end(), matcher.group(2));
                    matcher = compile.matcher(sb2);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return sb2;
                }
            } while (matcher.find());
        }
        return sb2;
    }

    public static String z(String str) {
        if (str == null) {
            return null;
        }
        return B(A(new StringBuilder(str))).toString();
    }
}
