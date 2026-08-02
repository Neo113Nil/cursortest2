package ru.ozon.app.android.network.di.module;

import android.app.Application;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.serializing.FormatNumberAdapterFactory;
import ru.ozon.app.android.analytics.serializing.JsonObjectAdapter;
import ru.ozon.app.android.atoms.data.deprecated.adapters.BulletElementsStyleAdapter;
import ru.ozon.app.android.atoms.data.deprecated.adapters.ButtonStyleAdapter;
import ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfAdapterFactory;
import ru.ozon.app.android.atoms.proto.adapter.ProtoOneOfCollectionAdapter;
import ru.ozon.app.android.network.serialize.OzonKotlinJsonAdapterFactory;
import ru.ozon.app.android.network.serialize.PolymorphicJsonAdapterFactory;
import ru.ozon.app.android.network.serialize.adapter.BigDecimalMoshiAdapter;
import ru.ozon.app.android.network.serialize.adapter.DateTimeTypeMoshiAdapter;
import ru.ozon.app.android.network.serialize.adapter.NumberMoshiAdapterFactory;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon.CouponTypeAdapter;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionAdapter;
import ru.ozon.moshi.adapters.serialize.collection.reader.JsonCollectionReaderKt;
import ru.ozon.tracker.sendEvent.serializing.CellAdapterFactory;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkConverterModule;", "", "<init>", "()V", "provideAdapters", "", "application", "Landroid/app/Application;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkConverterModule {
    @NotNull
    public final Set<Object> provideAdapters(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        LinkedHashSet b11 = e0.b(new JsonObjectAdapter(), PolymorphicJsonAdapterFactory.of(Vote.class, AppMeasurementSdk.ConditionalUserProperty.VALUE).withSubtype(Vote.Like.class, "USEFUL").withSubtype(Vote.Dislike.class, "UNUSEFUL"), new BulletElementsStyleAdapter(), new ButtonStyleAdapter(), new DateTimeTypeMoshiAdapter(), new BigDecimalMoshiAdapter(), new AtomDTOAdapterFactory(), new ProtoOneOfAdapterFactory(), new ProtoOneOfCollectionAdapter.ProtoOneOfCollectionFactory(), new JsonCollectionAdapter.Factory(JsonCollectionReaderKt.JsonCollectionReader()), new ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfAdapterFactory(), new NumberMoshiAdapterFactory(), new FormatNumberAdapterFactory(), new CellAdapterFactory(), new CouponTypeAdapter());
        b11.add(new OzonKotlinJsonAdapterFactory(application, false));
        return b11;
    }
}
