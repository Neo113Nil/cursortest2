package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import xsna.zcl;

/* compiled from: AndroidTestDataInfo.kt */
/* loaded from: classes14.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXCHANGE_TEST_MODE = "ExchangeTestMode";
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    /* compiled from: AndroidTestDataInfo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl _create = TestDataKt.Dsl.Companion._create(TestDataOuterClass.TestData.newBuilder());
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName(EXCHANGE_TEST_MODE);
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        TestDataOuterClass.TestData _build = _create._build();
        if (_build.hasForceExchangeTestMode()) {
            return _build;
        }
        return null;
    }
}
