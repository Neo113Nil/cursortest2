package com.braze.support;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/support/DataStoreUtils;", "", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataStoreUtils {
    public static final DataStoreUtils INSTANCE = new DataStoreUtils();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class a implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29474a;

        public a(String str) {
            this.f29474a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse JSON list: '" + this.f29474a + "'";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class b implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29475a;

        public b(String str) {
            this.f29475a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse JSON map: '" + this.f29475a + "'";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class e implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f29476a = new e();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to serialize data to JSON";
        }
    }

    private DataStoreUtils() {
    }
}
