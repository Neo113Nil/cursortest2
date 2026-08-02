package ru.ozon.android.messenger.blocks.messagetext.domain;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f85861a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85862b;

    /* renamed from: c, reason: collision with root package name */
    private final int f85863c;

    /* renamed from: d, reason: collision with root package name */
    private final int f85864d;

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85861a = context;
        this.f85862b = h.c(15);
        this.f85863c = h.c(10);
        this.f85864d = h.c(2);
    }

    @NotNull
    public final SpannableStringBuilder a(@NotNull ArrayList nodes) {
        ru.ozon.android.messenger.framework.navigation.action.a aVar;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int length = spannableStringBuilder.length();
            if (bVar.b().getData() != null || bVar.b().isNullDataSupported()) {
                MessageTextDTO.MessageTextType b11 = bVar.b();
                if (b11 instanceof MessageTextDTO.MessageTextType.TextType) {
                    spannableStringBuilder.append((CharSequence) ((MessageTextDTO.MessageTextType.TextType) bVar.b()).getData());
                } else if (b11 instanceof MessageTextDTO.MessageTextType.BoldType) {
                    MessageTextDTO.MessageTextType.BoldType boldType = (MessageTextDTO.MessageTextType.BoldType) bVar.b();
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) boldType.getData());
                    spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
                } else if (b11 instanceof MessageTextDTO.MessageTextType.LinkType) {
                    MessageTextDTO.MessageTextType.LinkType linkType = (MessageTextDTO.MessageTextType.LinkType) bVar.b();
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) linkType.getData());
                    AtomActionDTO action = linkType.getAction();
                    if (action != null) {
                        Map<String, String> params = linkType.getAction().getParams();
                        if (params == null) {
                            params = U.c();
                        }
                        aVar = ru.ozon.android.messenger.framework.navigation.action.b.d(action, params);
                    } else {
                        aVar = null;
                    }
                    String url = linkType.getUrl();
                    if (url != null || (url = linkType.getData()) != null) {
                        spannableStringBuilder.setSpan(new ru.ozon.android.messenger.utils.spans.a(aVar, url, this.f85861a, linkType.getTrackingInfo()), length3, spannableStringBuilder.length(), 33);
                    }
                } else if (b11 instanceof MessageTextDTO.MessageTextType.NewLine) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int d11 = bVar.d();
                int i11 = this.f85863c;
                int i12 = this.f85862b;
                if (d11 > -1) {
                    spannableStringBuilder.setSpan(new ru.ozon.android.messenger.utils.spans.c(i12, i11, bVar.d(), bVar.c()), length, spannableStringBuilder.length(), 33);
                } else if (bVar.a()) {
                    spannableStringBuilder.setSpan(new ru.ozon.android.messenger.utils.spans.b(i12, i11, this.f85864d, bVar.c()), length, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
