package og;

import android.graphics.Bitmap;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f61224a = Vf.b.i().j().pattern();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Message.c.values().length];
            try {
                iArr[Message.c.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Message.c.Blockquote.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Message.c.Heading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Message.c.CodeBlock.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Message.c.Quote.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Message.c.Bold.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Message.c.Underline.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Message.c.Italic.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Message.c.Strike.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Message.c.Bullet.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Message.c.Emojis.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Bitmap a10 = AbstractC5890b.a(AbstractC5890b.g(str), 5);
        if (a10 != null) {
            return AbstractC5890b.f(a10, null, 0, 3, null);
        }
        return null;
    }

    public static final boolean b(String str) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(i.i(str != null ? Boolean.valueOf(Vf.b.i().j().matcher(str.toString()).find()) : null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return i.i((Boolean) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl));
    }

    public static final List c(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (Message.c cVar : Message.c.getEntries()) {
                switch (a.$EnumSwitchMapping$0[cVar.ordinal()]) {
                    case 1:
                        str2 = "(^|\\s|<br>)\\[((?:(?!\\]\\(.+?\\)).)+?)\\]\\(((https?:\\/\\/(?:www\\.)?|www\\.).*?)\\)(?=$|\\s|\\.|\\,|\\n|<br>|<span)";
                        break;
                    case 2:
                        str2 = "(?:^|\\n)(!(.+?))(?:\\n|$)";
                        break;
                    case 3:
                        str2 = "(?:^|\\n)((#{1,6}) (.*?\\S *))(?:\\n|$)";
                        break;
                    case 4:
                        str2 = "(^|\\s)`{3}((?:(?:.*?$)\\n)?(?:[\\s\\S]*?))`{3}(?=$|\\s)";
                        break;
                    case 5:
                        str2 = "(^|\\s|[{\\[])\\`(.*?\\S *)?\\`(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))";
                        break;
                    case 6:
                        str2 = "(^|\\s|[{\\[])\\*(\\S.*?\\S *)?\\*(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))";
                        break;
                    case 7:
                        str2 = "(^|\\s|[{\\[])\\_{2}(.*?\\S *)?\\_{2}(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))";
                        break;
                    case 8:
                        str2 = "(^|\\s|[{\\[])\\_(.*?\\S *)?\\_(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))";
                        break;
                    case 9:
                        str2 = "(^|\\s|[{\\[])\\~(.*?\\S *)?\\~(?=$|\\s|[\\.,\\?:;\\-}\\]](?:$|\\s))";
                        break;
                    case 10:
                        str2 = "(^\\s|\\n|^)((\\*) ((.*?\\S *)*))";
                        break;
                    case 11:
                        str2 = f61224a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (str2 != null && Pattern.compile(str2).matcher(str).find()) {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final String d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() > 0) {
            return str;
        }
        return null;
    }
}
