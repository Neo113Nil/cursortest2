package org.chromium.net;

import java.util.Iterator;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.chromium.net.DnsOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class ExperimentalOptionsTranslator {

    @FunctionalInterface
    interface JsonPatch {
        void applyTo(JSONObject experimentalOptions) throws JSONException;
    }

    private ExperimentalOptionsTranslator() {
    }

    static void connectionMigrationOptionsToJson(JSONObject experimentalOptions, ConnectionMigrationOptions options) throws JSONException {
        JSONObject createDefaultIfAbsent = createDefaultIfAbsent(experimentalOptions, "QUIC");
        if (options.getEnableDefaultNetworkMigration() != null) {
            createDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", options.getEnableDefaultNetworkMigration());
        }
        if (options.getAllowServerMigration() != null) {
            createDefaultIfAbsent.put("allow_server_migration", options.getAllowServerMigration());
        }
        if (options.getMigrateIdleConnections() != null) {
            createDefaultIfAbsent.put("migrate_idle_sessions", options.getMigrateIdleConnections());
        }
        if (options.getIdleMigrationPeriodSeconds() != null) {
            createDefaultIfAbsent.put("idle_session_migration_period_seconds", options.getIdleMigrationPeriodSeconds());
        }
        if (options.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
            createDefaultIfAbsent.put("retry_on_alternate_network_before_handshake", options.getRetryPreHandshakeErrorsOnAlternateNetwork());
        }
        if (options.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
            createDefaultIfAbsent.put("max_time_on_non_default_network_seconds", options.getMaxTimeOnNonDefaultNetworkSeconds());
        }
        if (options.getMaxPathDegradingEagerMigrationsCount() != null) {
            createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_path_degrading", options.getMaxPathDegradingEagerMigrationsCount());
        }
        if (options.getMaxWriteErrorEagerMigrationsCount() != null) {
            createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_write_error", options.getMaxWriteErrorEagerMigrationsCount());
        }
        if (options.getEnablePathDegradationMigration() != null) {
            boolean booleanValue = options.getEnablePathDegradationMigration().booleanValue();
            createDefaultIfAbsent.put("allow_port_migration", booleanValue);
            if (options.getAllowNonDefaultNetworkUsage() != null) {
                boolean booleanValue2 = options.getAllowNonDefaultNetworkUsage().booleanValue();
                if (!booleanValue && booleanValue2) {
                    throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                if (booleanValue && booleanValue2) {
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", true);
                    createDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", true);
                } else {
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", false);
                }
            }
        }
    }

    static void dnsOptionsToJson(JSONObject experimentalOptions, DnsOptions options) throws JSONException {
        JSONObject createDefaultIfAbsent = createDefaultIfAbsent(experimentalOptions, "AsyncDNS");
        if (options.getUseBuiltInDnsResolver() != null) {
            createDefaultIfAbsent.put("enable", options.getUseBuiltInDnsResolver());
        }
        JSONObject createDefaultIfAbsent2 = createDefaultIfAbsent(experimentalOptions, "StaleDNS");
        if (options.getEnableStaleDns() != null) {
            createDefaultIfAbsent2.put("enable", options.getEnableStaleDns());
        }
        if (options.getPersistHostCache() != null) {
            createDefaultIfAbsent2.put("persist_to_disk", options.getPersistHostCache());
        }
        if (options.getPersistHostCachePeriodMillis() != null) {
            createDefaultIfAbsent2.put("persist_delay_ms", options.getPersistHostCachePeriodMillis());
        }
        if (options.getStaleDnsOptions() != null) {
            DnsOptions.StaleDnsOptions staleDnsOptions = options.getStaleDnsOptions();
            if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                createDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
            }
            if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                createDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
            }
            if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                createDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
            }
            if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                createDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
            }
        }
        JSONObject createDefaultIfAbsent3 = createDefaultIfAbsent(experimentalOptions, "QUIC");
        if (options.getPreestablishConnectionsToStaleDnsResults() != null) {
            createDefaultIfAbsent3.put("race_stale_dns_on_connection", options.getPreestablishConnectionsToStaleDnsResults());
        }
    }

    static void quicOptionsToJson(JSONObject experimentalOptions, QuicOptions options) throws JSONException {
        JSONObject createDefaultIfAbsent = createDefaultIfAbsent(experimentalOptions, "QUIC");
        if (!options.getQuicHostAllowlist().isEmpty()) {
            createDefaultIfAbsent.put("host_whitelist", UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) options.getQuicHostAllowlist()));
        }
        if (!options.getEnabledQuicVersions().isEmpty()) {
            createDefaultIfAbsent.put("quic_version", UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) options.getEnabledQuicVersions()));
        }
        if (!options.getConnectionOptions().isEmpty()) {
            createDefaultIfAbsent.put("connection_options", UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) options.getConnectionOptions()));
        }
        if (!options.getClientConnectionOptions().isEmpty()) {
            createDefaultIfAbsent.put("client_connection_options", UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) options.getClientConnectionOptions()));
        }
        if (!options.getExtraQuicheFlags().isEmpty()) {
            createDefaultIfAbsent.put("set_quic_flags", UByte$$ExternalSyntheticBackport0.m((CharSequence) ",", (Iterable) options.getExtraQuicheFlags()));
        }
        if (options.getInMemoryServerConfigsCacheSize() != null) {
            createDefaultIfAbsent.put("max_server_configs_stored_in_properties", options.getInMemoryServerConfigsCacheSize());
        }
        if (options.getHandshakeUserAgent() != null) {
            createDefaultIfAbsent.put("user_agent_id", options.getHandshakeUserAgent());
        }
        if (options.getRetryWithoutAltSvcOnQuicErrors() != null) {
            createDefaultIfAbsent.put("retry_without_alt_svc_on_quic_errors", options.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (options.getEnableTlsZeroRtt() != null) {
            createDefaultIfAbsent.put("disable_tls_zero_rtt", !options.getEnableTlsZeroRtt().booleanValue());
        }
        if (options.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("max_idle_time_before_crypto_handshake_seconds", options.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (options.getCryptoHandshakeTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("max_time_before_crypto_handshake_seconds", options.getCryptoHandshakeTimeoutSeconds());
        }
        if (options.getIdleConnectionTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("idle_connection_timeout_seconds", options.getIdleConnectionTimeoutSeconds());
        }
        if (options.getRetransmittableOnWireTimeoutMillis() != null) {
            createDefaultIfAbsent.put("retransmittable_on_wire_timeout_milliseconds", options.getRetransmittableOnWireTimeoutMillis());
        }
        if (options.getCloseSessionsOnIpChange() != null) {
            createDefaultIfAbsent.put("close_sessions_on_ip_change", options.getCloseSessionsOnIpChange());
        }
        if (options.getGoawaySessionsOnIpChange() != null) {
            createDefaultIfAbsent.put("goaway_sessions_on_ip_change", options.getGoawaySessionsOnIpChange());
        }
        if (options.getInitialBrokenServicePeriodSeconds() != null) {
            createDefaultIfAbsent.put("initial_delay_for_broken_alternative_service_seconds", options.getInitialBrokenServicePeriodSeconds());
        }
        if (options.getIncreaseBrokenServicePeriodExponentially() != null) {
            createDefaultIfAbsent.put("exponential_backoff_on_initial_delay", options.getIncreaseBrokenServicePeriodExponentially());
        }
        if (options.getDelayJobsWithAvailableSpdySession() != null) {
            createDefaultIfAbsent.put("delay_main_job_with_available_spdy_session", options.getDelayJobsWithAvailableSpdySession());
        }
    }

    static JSONObject toJsonExperimentalOptions(String jsonString) {
        if (jsonString == null || jsonString.isEmpty()) {
            return null;
        }
        try {
            return new JSONObject(jsonString);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Experimental options parsing failed", e);
        }
    }

    static JSONObject applyJsonPatches(JSONObject jsonOptions, List<JsonPatch> patches) {
        if (jsonOptions == null && patches.isEmpty()) {
            return null;
        }
        if (jsonOptions == null) {
            jsonOptions = new JSONObject();
        }
        Iterator<JsonPatch> it = patches.iterator();
        while (it.hasNext()) {
            try {
                it.next().applyTo(jsonOptions);
            } catch (JSONException e) {
                throw new IllegalStateException("Unable to apply JSON patch!", e);
            }
        }
        return jsonOptions;
    }

    private static JSONObject createDefaultIfAbsent(JSONObject jsonObject, String key) {
        JSONObject optJSONObject = jsonObject.optJSONObject(key);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jsonObject.put(key, jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Failed adding a default object for key [" + key + "]", e);
        }
    }
}
