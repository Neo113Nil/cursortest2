package com.plaid.internal.core.networking.models;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class a extends Lambda implements Function0<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResponseBody f39868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ResponseBody responseBody) {
        super(0);
        this.f39868a = responseBody;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String string;
        try {
            ResponseBody responseBody = this.f39868a;
            if (responseBody != null && (string = responseBody.string()) != null) {
                String replace$default = StringsKt.replace$default(string, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, " ", false, 4, (Object) null);
                if (replace$default != null) {
                    return replace$default;
                }
            }
        } catch (Throwable unused) {
        }
        return "unknown";
    }
}
